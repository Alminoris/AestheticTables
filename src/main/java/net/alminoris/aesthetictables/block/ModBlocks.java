package net.alminoris.aesthetictables.block;

import net.alminoris.aesthetictables.AestheticTables;
import net.alminoris.aesthetictables.block.custom.CoffeeTable;
import net.alminoris.aesthetictables.block.custom.GardenTable;
import net.alminoris.aesthetictables.block.custom.Table;
import net.alminoris.aesthetictables.util.helper.BlockSetsHelper;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

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
        return Registry.register(Registries.BLOCK, Identifier.of(AestheticTables.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block)
    {
        Registry.register(Registries.ITEM, Identifier.of(AestheticTables.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerBlocks()
    {

    }
}