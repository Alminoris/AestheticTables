package net.alminoris.aesthetictables.block;

import net.alminoris.aesthetictables.AestheticTables;
import net.alminoris.aesthetictables.block.custom.CoffeeTable;
import net.alminoris.aesthetictables.block.custom.GardenTable;
import net.alminoris.aesthetictables.block.custom.Table;
import net.alminoris.aesthetictables.item.ModItemGroups;
import net.alminoris.aesthetictables.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Dictionary;
import java.util.Hashtable;

public class ModBlocks
{
    public static final Dictionary<String, Block> TABLES = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("table_"+name, new Table(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS))));
        }
    }};

    public static final Dictionary<String, Block> COFFEE_TABLES = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("coffee_table_"+name, new CoffeeTable(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS))));
        }
    }};

    public static final Dictionary<String, Block> GARDEN_TABLES = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("garden_table_"+name, new GardenTable(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS))));
        }
    }};

    public static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(AestheticTables.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block)
    {
        Registry.register(Registry.ITEM, new Identifier(AestheticTables.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroups.ATBLS_TAB)));
    }

    public static void registerBlocks()
    {

    }
}