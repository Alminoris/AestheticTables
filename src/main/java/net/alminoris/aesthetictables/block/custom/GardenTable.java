package net.alminoris.aesthetictables.block.custom;

import net.alminoris.aesthetictables.util.helper.VoxelShapeHelper;
import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

import java.util.ArrayList;
import java.util.List;

public class GardenTable extends YAxisRotatedBlock implements Waterloggable
{
    protected static final VoxelShape TABLE_TOP = Block.createCuboidShape(
            0.0D, 14.0D, 0.0D,
            16.0D, 16.0D, 16.0D
    );

    protected static final VoxelShape LEG_FRONT = Block.createCuboidShape(
            1.0D, 0.0D, 0.0D,
            3.0D, 14.0D, 16.0D
    );

    protected static final VoxelShape LEG_BACK = Block.createCuboidShape(
            13.0D, 0.0D, 0.0D,
            15.0D, 14.0D, 16.0D
    );


    public enum Variant implements StringIdentifiable
    {
        NORMAL("normal"),
        CENTER("center"),
        LEFT("left"),
        RIGHT("right");

        private final String name;

        Variant(String name) { this.name = name; }

        @Override
        public String asString() { return this.name; }
    }

    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public static final EnumProperty<Variant> VARIANT = EnumProperty.of("variant", GardenTable.Variant.class);

    public GardenTable(AbstractBlock.Settings settings)
    {
        super(settings.nonOpaque());
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(VARIANT, Variant.NORMAL).with(WATERLOGGED, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, VARIANT, WATERLOGGED);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx)
    {
        boolean waterlogged = ctx.getWorld().getFluidState(ctx.getBlockPos()).getFluid() == Fluids.WATER;
        return this.getDefaultState().with(FACING, ctx.getPlayer().getHorizontalFacing()).with(WATERLOGGED, waterlogged);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
    {
        return getRotatedShape(state);
    }

    private VoxelShape getRotatedShape(BlockState state)
    {
        Direction direction = state.get(FACING);
        Variant variant = state.get(VARIANT);

        List<Box> boxes = new ArrayList<>();
        switch (variant)
        {
            case NORMAL:
                boxes.add(TABLE_TOP.getBoundingBox());
                boxes.add(LEG_FRONT.getBoundingBox());
                boxes.add(LEG_BACK.getBoundingBox());
                break;
            case CENTER:
                boxes.add(TABLE_TOP.getBoundingBox());
                break;
            case LEFT:
                boxes.add(TABLE_TOP.getBoundingBox());
                boxes.add(LEG_FRONT.getBoundingBox());
                break;
            case RIGHT:
                boxes.add(TABLE_TOP.getBoundingBox());
                boxes.add(LEG_BACK.getBoundingBox());
                break;
        }

        return VoxelShapeHelper.rotateShape(boxes, direction);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos)
    {
        if (state.get(WATERLOGGED))
        {
            world.createAndScheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        return updateGardenTableVariant(state, world, pos);
    }

    @Override
    public FluidState getFluidState(BlockState state)
    {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify)
    {
        super.onBlockAdded(state, world, pos, oldState, notify);
        updateSurroundingGardenTablees(world, pos);
    }

    private void updateSurroundingGardenTablees(World world, BlockPos pos)
    {
        for (Direction direction : Direction.Type.HORIZONTAL)
        {
            BlockPos neighborPos = pos.offset(direction);
            BlockState neighborState = world.getBlockState(neighborPos);

            if (neighborState.getBlock() instanceof GardenTable)
                world.setBlockState(neighborPos, updateGardenTableVariant(neighborState, world, neighborPos));
        }
    }

    private BlockState updateGardenTableVariant(BlockState state, WorldAccess world, BlockPos pos)
    {
        Direction facing = state.get(FACING);

        BlockPos leftPos = pos.offset(facing.rotateYCounterclockwise());
        BlockPos rightPos = pos.offset(facing.rotateYClockwise());

        boolean leftConnected = isGardenTable(world, leftPos, facing);
        boolean rightConnected = isGardenTable(world, rightPos, facing);

        if (leftConnected && rightConnected)
            return state.with(VARIANT, Variant.CENTER);
        else if (leftConnected)
            return state.with(VARIANT, Variant.RIGHT);
        else if (rightConnected)
            return state.with(VARIANT, Variant.LEFT);
        else
            return state.with(VARIANT, Variant.NORMAL);
    }

    private boolean isGardenTable(WorldAccess world, BlockPos pos, Direction facing)
    {
        BlockState state = world.getBlockState(pos);
        return state.getBlock() instanceof GardenTable && state.get(FACING) == facing;
    }
}