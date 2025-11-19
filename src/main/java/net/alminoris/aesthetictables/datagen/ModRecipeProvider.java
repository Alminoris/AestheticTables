package net.alminoris.aesthetictables.datagen;

import net.alminoris.aesthetictables.block.ModBlocks;
import net.alminoris.aesthetictables.util.helper.BlockSetsHelper;
import net.alminoris.aesthetictables.util.helper.ModJsonHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider
{
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter)
    {
        for(String name : BlockSetsHelper.WOODS)
        {
            Block block = Registries.BLOCK.get(Identifier.ofVanilla(name+"_planks"));

            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TABLES.get(name), block, 1);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COFFEE_TABLES.get(name), block, 1);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GARDEN_TABLES.get(name), block, 1);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OCTAGONAL_TABLES.get(name), block, 1);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DINING_TABLES.get(name), block, 1);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DESK_TABLES.get(name), block, 1);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.KITCHEN_TABLES.get(name), block, 1);
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
        {
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.COFFEE_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.GARDEN_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.OCTAGONAL_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.DINING_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.DESK_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.KITCHEN_TABLES.get(name)).getPath(), "1");
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
        {
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.COFFEE_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.GARDEN_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.OCTAGONAL_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.DINING_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.DESK_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.KITCHEN_TABLES.get(name)).getPath(), "1");
        }

        for(String name : BlockSetsHelper.WT_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.COFFEE_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.GARDEN_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.OCTAGONAL_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.DINING_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.DESK_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.KITCHEN_TABLES.get(name)).getPath(), "1");
        }

        for(String name : BlockSetsHelper.ST_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.COFFEE_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.GARDEN_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.OCTAGONAL_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.DINING_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.DESK_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.KITCHEN_TABLES.get(name)).getPath(), "1");
        }

        for(String name : BlockSetsHelper.MT_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.COFFEE_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.GARDEN_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.OCTAGONAL_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.DINING_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.DESK_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.KITCHEN_TABLES.get(name)).getPath(), "1");
        }

        for(String name : BlockSetsHelper.NSS_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+name.replace("_nss", "")+"_planks",
                    Registries.BLOCK.getId(ModBlocks.TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+name.replace("_nss", "")+"_planks",
                    Registries.BLOCK.getId(ModBlocks.COFFEE_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+name.replace("_nss", "")+"_planks",
                    Registries.BLOCK.getId(ModBlocks.GARDEN_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+name.replace("_nss", "")+"_planks",
                    Registries.BLOCK.getId(ModBlocks.OCTAGONAL_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+name.replace("_nss", "")+"_planks",
                    Registries.BLOCK.getId(ModBlocks.DINING_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+name.replace("_nss", "")+"_planks",
                    Registries.BLOCK.getId(ModBlocks.DESK_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+name.replace("_nss", "")+"_planks",
                    Registries.BLOCK.getId(ModBlocks.KITCHEN_TABLES.get(name)).getPath(), "1");
        }
    }
}