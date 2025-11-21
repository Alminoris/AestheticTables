package net.alminoris.aesthetictables.datagen;

import net.alminoris.aesthetictables.AestheticTables;
import net.alminoris.aesthetictables.block.ModBlocks;
import net.alminoris.aesthetictables.util.helper.BlockSetsHelper;
import net.alminoris.aesthetictables.util.helper.ModJsonHelper;
import net.alminoris.aesthetictables.util.helper.ModJsonTemplates;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.util.Arrays;

public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        for(String name : BlockSetsHelper.getWoods())
        {
            if (Arrays.asList(BlockSetsHelper.WOODS).contains(name))
            {
                registerTable(blockStateModelGenerator,
                        ModJsonTemplates.TABLE, ModJsonTemplates.TABLE_TOP,
                        ModJsonTemplates.TABLE_LEG1, ModJsonTemplates.TABLE_LEG2, ModJsonTemplates.TABLE_LEG3,
                        ModJsonTemplates.TABLE_LEG4,
                        ModBlocks.TABLES.get(name), name, "minecraft");

                registerCoffeeTable(blockStateModelGenerator,
                        ModJsonTemplates.COFFEE_TABLE, ModJsonTemplates.COFFEE_TABLE_TOP,
                        ModJsonTemplates.COFFEE_TABLE_LEG1, ModJsonTemplates.COFFEE_TABLE_LEG2, ModJsonTemplates.COFFEE_TABLE_LEG3,
                        ModJsonTemplates.COFFEE_TABLE_LEG4,
                        ModBlocks.COFFEE_TABLES.get(name), name, "minecraft");

                registerGardenTable(blockStateModelGenerator,
                        ModJsonTemplates.GARDEN_TABLE, ModJsonTemplates.GARDEN_TABLE_CENTER,
                        ModJsonTemplates.GARDEN_TABLE_LEFT, ModJsonTemplates.GARDEN_TABLE_RIGHT,
                        ModBlocks.GARDEN_TABLES.get(name), name, "minecraft");

                registerGardenTable(blockStateModelGenerator,
                        ModJsonTemplates.DESK_TABLE, ModJsonTemplates.DESK_TABLE_CENTER,
                        ModJsonTemplates.DESK_TABLE_LEFT, ModJsonTemplates.DESK_TABLE_RIGHT,
                        ModBlocks.DESK_TABLES.get(name), name, "minecraft");

                registerSimpleTable(blockStateModelGenerator, ModJsonTemplates.OCTAGONAL_TABLE, ModBlocks.OCTAGONAL_TABLES.get(name), name, "minecraft");

                registerExtraTable(blockStateModelGenerator,
                        ModJsonTemplates.DINING_TABLE_FULL, ModJsonTemplates.DINING_TABLE, ModJsonTemplates.DINING_TABLE_TOP,
                        ModJsonTemplates.DINING_TABLE_LEG1, ModJsonTemplates.DINING_TABLE_LEG2, ModJsonTemplates.DINING_TABLE_LEG3,
                        ModJsonTemplates.DINING_TABLE_LEG4,
                        ModBlocks.DINING_TABLES.get(name), name, "minecraft");

                registerTable(blockStateModelGenerator,
                        ModJsonTemplates.KITCHEN_TABLE, ModJsonTemplates.KITCHEN_TABLE_TOP,
                        ModJsonTemplates.KITCHEN_TABLE_LEG1, ModJsonTemplates.KITCHEN_TABLE_LEG2, ModJsonTemplates.KITCHEN_TABLE_LEG3,
                        ModJsonTemplates.KITCHEN_TABLE_LEG4,
                        ModBlocks.KITCHEN_TABLES.get(name), name, "minecraft");
            }
            else
            {
                registerTable(blockStateModelGenerator,
                        ModJsonTemplates.TABLE, ModJsonTemplates.TABLE_TOP,
                        ModJsonTemplates.TABLE_LEG1, ModJsonTemplates.TABLE_LEG2, ModJsonTemplates.TABLE_LEG3,
                        ModJsonTemplates.TABLE_LEG4,
                        ModBlocks.TABLES.get(name), name, "aesthetictables");

                registerExtraTable(blockStateModelGenerator,
                        ModJsonTemplates.DINING_TABLE_FULL, ModJsonTemplates.DINING_TABLE, ModJsonTemplates.DINING_TABLE_TOP,
                        ModJsonTemplates.DINING_TABLE_LEG1, ModJsonTemplates.DINING_TABLE_LEG2, ModJsonTemplates.DINING_TABLE_LEG3,
                        ModJsonTemplates.DINING_TABLE_LEG4,
                        ModBlocks.DINING_TABLES.get(name), name, "aesthetictables");

                registerTable(blockStateModelGenerator,
                        ModJsonTemplates.KITCHEN_TABLE, ModJsonTemplates.KITCHEN_TABLE_TOP,
                        ModJsonTemplates.KITCHEN_TABLE_LEG1, ModJsonTemplates.KITCHEN_TABLE_LEG2, ModJsonTemplates.KITCHEN_TABLE_LEG3,
                        ModJsonTemplates.KITCHEN_TABLE_LEG4,
                        ModBlocks.KITCHEN_TABLES.get(name), name, "aesthetictables");

                registerCoffeeTable(blockStateModelGenerator,
                        ModJsonTemplates.COFFEE_TABLE, ModJsonTemplates.COFFEE_TABLE_TOP,
                        ModJsonTemplates.COFFEE_TABLE_LEG1, ModJsonTemplates.COFFEE_TABLE_LEG2, ModJsonTemplates.COFFEE_TABLE_LEG3,
                        ModJsonTemplates.COFFEE_TABLE_LEG4,
                        ModBlocks.COFFEE_TABLES.get(name), name, "aesthetictables");

                registerGardenTable(blockStateModelGenerator,
                        ModJsonTemplates.GARDEN_TABLE, ModJsonTemplates.GARDEN_TABLE_CENTER,
                        ModJsonTemplates.GARDEN_TABLE_LEFT, ModJsonTemplates.GARDEN_TABLE_RIGHT,
                        ModBlocks.GARDEN_TABLES.get(name), name, "aesthetictables");

                registerGardenTable(blockStateModelGenerator,
                        ModJsonTemplates.DESK_TABLE, ModJsonTemplates.DESK_TABLE_CENTER,
                        ModJsonTemplates.DESK_TABLE_LEFT, ModJsonTemplates.DESK_TABLE_RIGHT,
                        ModBlocks.DESK_TABLES.get(name), name, "aesthetictables");

                registerSimpleTable(blockStateModelGenerator, ModJsonTemplates.OCTAGONAL_TABLE, ModBlocks.OCTAGONAL_TABLES.get(name), name, "aesthetictables");
            }
        }
    }

    public final void registerTable(BlockStateModelGenerator blockStateModelGenerator, String normal,
                                    String top, String leg1, String leg2, String leg3, String leg4,
                                    Block table, String name, String modId)
    {
        String logName = (name.equals("crimson") || name.equals("warped")) ? "stem" : (name.equals("bamboo") ? "block" : "log");

        ModJsonHelper.createTableBlockModel(normal, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name+"_"+logName,
                modId+":block/"+name+"_planks",
                modId+":block/"+name+"_planks",
                "normal");
        ModJsonHelper.createTableBlockModel(leg1, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name+"_"+logName,
                modId+":block/"+name+"_planks",
                modId+":block/"+name+"_planks",
                "leg1");
        ModJsonHelper.createTableBlockModel(leg2, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name+"_"+logName,
                modId+":block/"+name+"_planks",
                modId+":block/"+name+"_planks",
                "leg2");
        ModJsonHelper.createTableBlockModel(leg3, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name+"_"+logName,
                modId+":block/"+name+"_planks",
                modId+":block/"+name+"_planks",
                "leg3");
        ModJsonHelper.createTableBlockModel(leg4, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name+"_"+logName,
                modId+":block/"+name+"_planks",
                modId+":block/"+name+"_planks",
                "leg4");
        ModJsonHelper.createTableBlockModel(top, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name+"_"+logName,
                modId+":block/"+name+"_planks",
                modId+":block/"+name+"_planks",
                "top");

        ModJsonHelper.createBlockstate(ModJsonTemplates.TABLE_BLOCKSTATE_TEMPLATE, Registries.BLOCK.getId(table).getPath());
        blockStateModelGenerator.registerParentedItemModel(table, Identifier.of(AestheticTables.MOD_ID, "block/"+Registries.BLOCK.getId(table).getPath()));
    }

    public final void registerExtraTable(BlockStateModelGenerator blockStateModelGenerator, String full, String normal,
                                    String top, String leg1, String leg2, String leg3, String leg4,
                                    Block table, String name, String modId)
    {
        String logName = (name.equals("crimson") || name.equals("warped")) ? "stem" : (name.equals("bamboo") ? "block" : "log");

        ModJsonHelper.createTableBlockModel(full, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name+"_"+logName,
                modId+":block/"+name+"_planks",
                modId+":block/"+name+"_planks",
                "full");
        ModJsonHelper.createTableBlockModel(normal, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name+"_"+logName,
                modId+":block/"+name+"_planks",
                modId+":block/"+name+"_planks",
                "normal");
        ModJsonHelper.createTableBlockModel(leg1, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name+"_"+logName,
                modId+":block/"+name+"_planks",
                modId+":block/"+name+"_planks",
                "leg1");
        ModJsonHelper.createTableBlockModel(leg2, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name+"_"+logName,
                modId+":block/"+name+"_planks",
                modId+":block/"+name+"_planks",
                "leg2");
        ModJsonHelper.createTableBlockModel(leg3, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name+"_"+logName,
                modId+":block/"+name+"_planks",
                modId+":block/"+name+"_planks",
                "leg3");
        ModJsonHelper.createTableBlockModel(leg4, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name+"_"+logName,
                modId+":block/"+name+"_planks",
                modId+":block/"+name+"_planks",
                "leg4");
        ModJsonHelper.createTableBlockModel(top, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name+"_"+logName,
                modId+":block/"+name+"_planks",
                modId+":block/"+name+"_planks",
                "top");

        ModJsonHelper.createBlockstate(ModJsonTemplates.EXTRA_TABLE_BLOCKSTATE_TEMPLATE, Registries.BLOCK.getId(table).getPath());
        blockStateModelGenerator.registerParentedItemModel(table, Identifier.of(AestheticTables.MOD_ID, "block/"+Registries.BLOCK.getId(table).getPath()+"_full"));
    }

    public final void registerCoffeeTable(BlockStateModelGenerator blockStateModelGenerator, String normal,
                                    String top, String leg1, String leg2, String leg3, String leg4,
                                    Block table, String name, String modId)
    {
        String logName = (name.equals("crimson") || name.equals("warped")) ? "stem" : (name.equals("bamboo") ? "block" : "log");

        ModJsonHelper.createTableBlockModel(normal, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/stripped_"+name+"_"+logName,
                "normal");
        ModJsonHelper.createTableBlockModel(leg1, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/stripped_"+name+"_"+logName,
                "leg1");
        ModJsonHelper.createTableBlockModel(leg2, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/stripped_"+name+"_"+logName,
                "leg2");
        ModJsonHelper.createTableBlockModel(leg3, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/stripped_"+name+"_"+logName,
                "leg3");
        ModJsonHelper.createTableBlockModel(leg4, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/stripped_"+name+"_"+logName,
                "leg4");
        ModJsonHelper.createTableBlockModel(top, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/stripped_"+name+"_"+logName,
                "top");

        ModJsonHelper.createBlockstate(ModJsonTemplates.TABLE_BLOCKSTATE_TEMPLATE, Registries.BLOCK.getId(table).getPath());
        blockStateModelGenerator.registerParentedItemModel(table, Identifier.of(AestheticTables.MOD_ID, "block/"+Registries.BLOCK.getId(table).getPath()));
    }

    public final void registerSimpleTable(BlockStateModelGenerator blockStateModelGenerator, String normal, Block table, String name, String modId)
    {
        String logName = (name.equals("crimson") || name.equals("warped")) ? "stem" : (name.equals("bamboo") ? "block" : "log");

        ModJsonHelper.createSimpleTableBlockModel(normal, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name+"_"+logName,
                modId+":block/"+name+"_planks",
                modId+":block/stripped_"+name+"_"+logName);


        ModJsonHelper.createBlockstate(ModJsonTemplates.YAXIS_ROTATED_BLOCKSTATE_TEMPLATE, Registries.BLOCK.getId(table).getPath());
        blockStateModelGenerator.registerParentedItemModel(table, Identifier.of(AestheticTables.MOD_ID, "block/"+Registries.BLOCK.getId(table).getPath()));
    }

    public final void registerGardenTable(BlockStateModelGenerator blockStateModelGenerator, String normal,
                                          String center, String left, String right, Block table, String name, String modId)
    {
        String logName = (name.equals("crimson") || name.equals("warped")) ? "stem" : (name.equals("bamboo") ? "block" : "log");

        ModJsonHelper.createTableBlockModel(normal, Registries.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                modId+":block/"+name+"_"+logName,
                modId+":block/stripped_"+name+"_"+logName,
                "normal");
        ModJsonHelper.createTableBlockModel(center, Registries.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                modId+":block/"+name+"_"+logName,
                modId+":block/stripped_"+name+"_"+logName,
                "center");
        ModJsonHelper.createTableBlockModel(left, Registries.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                modId+":block/"+name+"_"+logName,
                modId+":block/stripped_"+name+"_"+logName,
                "left");
        ModJsonHelper.createTableBlockModel(right, Registries.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                modId+":block/"+name+"_"+logName,
                modId+":block/stripped_"+name+"_"+logName,
                "right");

        ModJsonHelper.createBlockstate(ModJsonTemplates.SIMPLE_TABLE_BLOCKSTATE_TEMPLATE, Registries.BLOCK.getId(table).getPath());
        blockStateModelGenerator.registerParentedItemModel(table, Identifier.of(AestheticTables.MOD_ID, "block/"+Registries.BLOCK.getId(table).getPath()));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
    }
}