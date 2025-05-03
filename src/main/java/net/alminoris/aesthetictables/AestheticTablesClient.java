package net.alminoris.aesthetictables;

import net.alminoris.aesthetictables.block.ModBlocks;
import net.alminoris.aesthetictables.util.helper.BlockSetsHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class AestheticTablesClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        for(String name : BlockSetsHelper.getWoods())
        {
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COFFEE_TABLES.get(name), RenderLayer.getTranslucent());
        }
    }
}
