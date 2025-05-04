package net.alminoris.aesthetictables.datagen;

import net.alminoris.aesthetictables.block.ModBlocks;
import net.alminoris.aesthetictables.util.helper.BlockSetsHelper;
import net.alminoris.aesthetictables.util.helper.ModJsonHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider
{
    public ModRecipeProvider(FabricDataGenerator dataGenerator)
    {
        super(dataGenerator);
    }

    @Override
    public void generateRecipes(Consumer<RecipeJsonProvider> recipeExporter)
    {
        for(String name : BlockSetsHelper.STONES)
        {
            Block block = Registry.BLOCK.get(new Identifier("minecraft", name.equals("basalt_side") ? "basalt" :
                    (name.equals("quartz_block_bottom") ? "quartz_block" : name)));


        }

        for(String name : BlockSetsHelper.EXTRA_STONES_WF)
        {

        }

        for(String name : BlockSetsHelper.WOODS)
        {
            Block block = Registry.BLOCK.get(new Identifier("minecraft", name+"_planks"));

            offerStonecuttingRecipe(recipeExporter, ModBlocks.TABLES.get(name), block, 1);
            offerStonecuttingRecipe(recipeExporter, ModBlocks.COFFEE_TABLES .get(name), block, 1);
            offerStonecuttingRecipe(recipeExporter, ModBlocks.GARDEN_TABLES .get(name), block, 1);
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
        {
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.COFFEE_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.GARDEN_TABLES.get(name)).getPath(), "1");
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
        {
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.COFFEE_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.GARDEN_TABLES.get(name)).getPath(), "1");
        }
    }
}