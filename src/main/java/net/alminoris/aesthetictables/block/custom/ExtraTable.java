package net.alminoris.aesthetictables.block.custom;

import net.minecraft.util.math.Direction;

public class ExtraTable extends Table
{
    public ExtraTable(Settings settings)
    {
        super(settings.nonOpaque());
        setDefaultState(this.getStateManager().getDefaultState()
                .with(FACING, Direction.NORTH)
                .with(LEG1, false)
                .with(LEG2, false)
                .with(LEG3, false)
                .with(LEG4, false)
                .with(WATERLOGGED, false));
    }
}