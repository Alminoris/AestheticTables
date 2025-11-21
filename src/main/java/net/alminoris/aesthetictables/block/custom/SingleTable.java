package net.alminoris.aesthetictables.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class SingleTable extends YAxisRotatedBlock
{
    protected static final VoxelShape BASE = Block.createCuboidShape(4.0D, 14.0D, 0.0D, 12.0D, 16.0D, 16.0D);
    protected static final VoxelShape BASE1 = Block.createCuboidShape(0.0D, 14.0D, 4.0D, 16.0D, 16.0D, 12.0D);
    protected static final VoxelShape LEG = Block.createCuboidShape(6.0D, 0.0D, 6.0D, 10.0D, 14.0D, 10.0D);

    public SingleTable(Settings settings)
    {
        super(settings);
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext ctx)
    {
        VoxelShape shape = BASE;
        shape = VoxelShapes.union(shape, BASE1);
        shape = VoxelShapes.union(shape, LEG);
        return shape;
    }
}