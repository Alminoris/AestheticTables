package net.alminoris.aesthetictables.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.Waterloggable;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

public class ExtraTable extends Block implements Waterloggable
{
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public static final BooleanProperty LEG1 = BooleanProperty.of("leg1"); // northeast
    public static final BooleanProperty LEG2 = BooleanProperty.of("leg2"); // southeast
    public static final BooleanProperty LEG3 = BooleanProperty.of("leg3"); // southwest
    public static final BooleanProperty LEG4 = BooleanProperty.of("leg4"); // northwest
    public static final BooleanProperty SINGLE = BooleanProperty.of("single"); // single
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    protected static final VoxelShape TOP = Block.createCuboidShape(0.0D, 13.5D, 0.0D, 16.0D, 16.0D, 16.0D);

    protected static final VoxelShape DEFAULT_LEG = Block.createCuboidShape(5.5D, 0.0D, 5.5D, 10.5D, 14D, 10.5D);

    protected static final VoxelShape LEG_1 = Block.createCuboidShape(9.5D, 0.0D, 1.5D, 14.5D, 13.5D, 6.5D);  // NE
    protected static final VoxelShape LEG_2 = Block.createCuboidShape(9.5D, 0.0D, 9.5D, 14.5D, 13.5D, 14.5D); // SE
    protected static final VoxelShape LEG_3 = Block.createCuboidShape(1.5D, 0.0D, 9.5D, 6.5D, 13.5D, 14.5D);   // SW
    protected static final VoxelShape LEG_4 = Block.createCuboidShape(1.5D, 0.0D, 1.5D, 6.5D, 13.5D, 6.5D);     // NW

    public ExtraTable(Settings settings)
    {
        super(settings.nonOpaque());
        setDefaultState(this.getStateManager().getDefaultState()
                .with(FACING, Direction.NORTH)
                .with(LEG1, false)
                .with(LEG2, false)
                .with(LEG3, false)
                .with(LEG4, false)
                .with(SINGLE, true)
                .with(WATERLOGGED, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, LEG1, LEG2, LEG3, LEG4, SINGLE, WATERLOGGED);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx)
    {
        boolean waterlogged = ctx.getWorld().getFluidState(ctx.getBlockPos()).getFluid() == Fluids.WATER;
        return getUpdatedLegs(this.getDefaultState()
                .with(FACING, ctx.getPlayer().getHorizontalFacing())
                .with(WATERLOGGED, waterlogged), ctx.getWorld(), ctx.getBlockPos());
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction dir, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED)) {
            world.createAndScheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        return getUpdatedLegs(state, world, pos);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    private BlockState getUpdatedLegs(BlockState state, WorldAccess world, BlockPos pos) {
        boolean north = connectsTo(world, pos.north());
        boolean east = connectsTo(world, pos.east());
        boolean south = connectsTo(world, pos.south());
        boolean west = connectsTo(world, pos.west());

        boolean ne = connectsTo(world, pos.north().east());
        boolean se = connectsTo(world, pos.south().east());
        boolean sw = connectsTo(world, pos.south().west());
        boolean nw = connectsTo(world, pos.north().west());

        boolean leg1 = (!north && !east) || (north && east && !ne);
        boolean leg2 = (!east && !south) || (east && south && !se);
        boolean leg3 = (!south && !west) || (south && west && !sw);
        boolean leg4 = (!north && !west) || (north && west && !nw);

        if (leg1 && leg2 && leg3 && leg4)
        {
            return state.with(LEG1, false).with(LEG2, false).with(LEG3, false).with(LEG4, false).with(SINGLE, true);
        }

        return state.with(LEG1, leg1).with(LEG2, leg2).with(LEG3, leg3).with(LEG4, leg4).with(SINGLE, false);
    }

    private boolean connectsTo(WorldAccess world, BlockPos pos)
    {
        BlockState neighbor = world.getBlockState(pos);
        return neighbor.getBlock() == this;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext ctx) {
        VoxelShape shape = TOP;
        if (state.get(LEG1)) shape = VoxelShapes.union(shape, LEG_1);
        if (state.get(LEG2)) shape = VoxelShapes.union(shape, LEG_2);
        if (state.get(LEG3)) shape = VoxelShapes.union(shape, LEG_3);
        if (state.get(LEG4)) shape = VoxelShapes.union(shape, LEG_4);

        if ((state.get(LEG1) && state.get(LEG2) && state.get(LEG3) && state.get(LEG4)) || state.get(SINGLE))
        {
            shape = VoxelShapes.union(shape, DEFAULT_LEG);
        }
        return shape;
    }
}