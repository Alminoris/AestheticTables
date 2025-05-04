package net.alminoris.aesthetictables.datagen;

import net.alminoris.aesthetictables.block.ModBlocks;
import net.alminoris.aesthetictables.util.helper.BlockSetsHelper;
import net.alminoris.aesthetictables.util.helper.ModJsonHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider
{
    public ModRecipeProvider(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> recipeExporter)
    {
        for(String name : BlockSetsHelper.STONES)
        {
            Block block = Registries.BLOCK.get(Identifier.of("minecraft", name.equals("basalt_side") ? "basalt" :
                    (name.equals("quartz_block_bottom") ? "quartz_block" : name)));


        }

        for(String name : BlockSetsHelper.EXTRA_STONES_WF)
        {

        }

        for(String name : BlockSetsHelper.WOODS)
        {
            Block block = Registries.BLOCK.get(Identifier.of("minecraft", name+"_planks"));

            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TABLES.get(name), block, 1);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COFFEE_TABLES .get(name), block, 1);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GARDEN_TABLES .get(name), block, 1);
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
        {
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.COFFEE_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.GARDEN_TABLES.get(name)).getPath(), "1");
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
        {
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.COFFEE_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.GARDEN_TABLES.get(name)).getPath(), "1");
        }
    }
}