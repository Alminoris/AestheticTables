package net.alminoris.aesthetictables.datagen;

import net.alminoris.aesthetictables.block.ModBlocks;
import net.alminoris.aesthetictables.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider
{
    public ModLootTableProvider(FabricDataGenerator dataGenerator)
    {
        super(dataGenerator);
    }

    @Override
    public void generateBlockLootTables()
    {
        for(String name : BlockSetsHelper.getStones())
        {

        }

        for(String name : BlockSetsHelper.WOODS)
        {
            addDrop(ModBlocks.TABLES.get(name));
            addDrop(ModBlocks.COFFEE_TABLES.get(name));
            addDrop(ModBlocks.GARDEN_TABLES.get(name));
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
        {
            addDrop(ModBlocks.TABLES.get(name));
            addDrop(ModBlocks.COFFEE_TABLES.get(name));
            addDrop(ModBlocks.GARDEN_TABLES.get(name));
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
        {
            addDrop(ModBlocks.TABLES.get(name));
            addDrop(ModBlocks.COFFEE_TABLES.get(name));
            addDrop(ModBlocks.GARDEN_TABLES.get(name));
        }
    }
}