package net.alminoris.aesthetictables.datagen;

import net.alminoris.aesthetictables.block.ModBlocks;
import net.alminoris.aesthetictables.item.ModItemGroups;
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
    public ModRecipeProvider(FabricDataGenerator output)
    {
        super(output);
    }

    @Override
    public void generateRecipes(Consumer<RecipeJsonProvider> recipeExporter)
    {
        for(String name : BlockSetsHelper.WOODS)
        {
            Block block = Registry.BLOCK.get(Identifier.of("minecraft",name+"_planks"));

            offerStonecuttingRecipe(recipeExporter, ModBlocks.TABLES.get(name), block, 1);
            offerStonecuttingRecipe(recipeExporter, ModBlocks.COFFEE_TABLES.get(name), block, 1);
            offerStonecuttingRecipe(recipeExporter, ModBlocks.GARDEN_TABLES.get(name), block, 1);
            offerStonecuttingRecipe(recipeExporter, ModBlocks.OCTAGONAL_TABLES.get(name), block, 1);
            offerStonecuttingRecipe(recipeExporter, ModBlocks.DINING_TABLES.get(name), block, 1);
            offerStonecuttingRecipe(recipeExporter, ModBlocks.DESK_TABLES.get(name), block, 1);
            offerStonecuttingRecipe(recipeExporter, ModBlocks.KITCHEN_TABLES.get(name), block, 1);
        }

        for(String name : ModItemGroups.AN_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.COFFEE_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.GARDEN_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.OCTAGONAL_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.DINING_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.DESK_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.KITCHEN_TABLES.get(name)).getPath(), "1");
        }

        for(String name : ModItemGroups.WF_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.COFFEE_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.GARDEN_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.OCTAGONAL_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.DINING_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.DESK_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.KITCHEN_TABLES.get(name)).getPath(), "1");
        }

        for(String name : ModItemGroups.WT_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.COFFEE_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.GARDEN_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.OCTAGONAL_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.DINING_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.DESK_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.KITCHEN_TABLES.get(name)).getPath(), "1");
        }

        for(String name : ModItemGroups.ST_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.COFFEE_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.GARDEN_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.OCTAGONAL_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.DINING_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.DESK_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.KITCHEN_TABLES.get(name)).getPath(), "1");
        }

        for(String name : ModItemGroups.MT_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.COFFEE_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.GARDEN_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.OCTAGONAL_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.DINING_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.DESK_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.KITCHEN_TABLES.get(name)).getPath(), "1");
        }

        for(String name : ModItemGroups.NSS_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+name.replace("_nss", "")+"_planks",
                    Registry.BLOCK.getId(ModBlocks.TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+name.replace("_nss", "")+"_planks",
                    Registry.BLOCK.getId(ModBlocks.COFFEE_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+name.replace("_nss", "")+"_planks",
                    Registry.BLOCK.getId(ModBlocks.GARDEN_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+name.replace("_nss", "")+"_planks",
                    Registry.BLOCK.getId(ModBlocks.OCTAGONAL_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+name.replace("_nss", "")+"_planks",
                    Registry.BLOCK.getId(ModBlocks.DINING_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+name.replace("_nss", "")+"_planks",
                    Registry.BLOCK.getId(ModBlocks.DESK_TABLES.get(name)).getPath(), "1");
            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+name.replace("_nss", "")+"_planks",
                    Registry.BLOCK.getId(ModBlocks.KITCHEN_TABLES.get(name)).getPath(), "1");
        }
    }
}