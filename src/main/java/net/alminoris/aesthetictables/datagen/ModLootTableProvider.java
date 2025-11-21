package net.alminoris.aesthetictables.datagen;

import net.alminoris.aesthetictables.block.ModBlocks;
import net.alminoris.aesthetictables.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider
{
    public ModLootTableProvider(FabricDataOutput dataOutput)
    {
        super(dataOutput);
    }

    @Override
    public void generate()
    {
        for(String name : BlockSetsHelper.getStones())
        {

        }

        for(String name : BlockSetsHelper.getWoods())
        {
            addDrop(ModBlocks.TABLES.get(name));
            addDrop(ModBlocks.COFFEE_TABLES.get(name));
            addDrop(ModBlocks.GARDEN_TABLES.get(name));
            addDrop(ModBlocks.KITCHEN_TABLES.get(name));
            addDrop(ModBlocks.OCTAGONAL_TABLES.get(name));
            addDrop(ModBlocks.DINING_TABLES.get(name));
            addDrop(ModBlocks.DESK_TABLES.get(name));
        }
    }
}