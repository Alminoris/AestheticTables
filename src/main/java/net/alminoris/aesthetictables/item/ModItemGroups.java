package net.alminoris.aesthetictables.item;

import net.alminoris.aesthetictables.AestheticTables;
import net.alminoris.aesthetictables.block.ModBlocks;
import net.alminoris.aesthetictables.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups
{
    public static final ItemGroup ATBLS_TAB =
            FabricItemGroup.builder(Identifier.of(AestheticTables.MOD_ID, "atblstab")).displayName(Text.translatable("itemgroup.atblstab"))
                    .icon(() -> new ItemStack(ModBlocks.TABLES.get("oak"))).entries((displayContext, entries) ->
                    {
                        for(String name : BlockSetsHelper.STONES)
                        {

                        }
                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_STONES_WF)
                            {

                            }
                        }

                        for(String name : BlockSetsHelper.WOODS)
                        {
                            entries.add(ModBlocks.TABLES.get(name));
                            entries.add(ModBlocks.COFFEE_TABLES.get(name));
                            entries.add(ModBlocks.GARDEN_TABLES.get(name));
                            entries.add(ModBlocks.OCTAGONAL_TABLES.get(name));
                            entries.add(ModBlocks.DINING_TABLES.get(name));
                            entries.add(ModBlocks.DESK_TABLES.get(name));
                            entries.add(ModBlocks.KITCHEN_TABLES.get(name));
                        }

                        if (FabricLoader.getInstance().isModLoaded("arborealnature"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
                            {
                                entries.add(ModBlocks.TABLES.get(name));
                                entries.add(ModBlocks.COFFEE_TABLES.get(name));
                                entries.add(ModBlocks.GARDEN_TABLES.get(name));
                                entries.add(ModBlocks.OCTAGONAL_TABLES.get(name));
                                entries.add(ModBlocks.DINING_TABLES.get(name));
                                entries.add(ModBlocks.DESK_TABLES.get(name));
                                entries.add(ModBlocks.KITCHEN_TABLES.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
                            {
                                entries.add(ModBlocks.TABLES.get(name));
                                entries.add(ModBlocks.COFFEE_TABLES.get(name));
                                entries.add(ModBlocks.GARDEN_TABLES.get(name));
                                entries.add(ModBlocks.OCTAGONAL_TABLES.get(name));
                                entries.add(ModBlocks.DINING_TABLES.get(name));
                                entries.add(ModBlocks.DESK_TABLES.get(name));
                                entries.add(ModBlocks.KITCHEN_TABLES.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("whisperleaftrees"))
                        {
                            for(String name : BlockSetsHelper.WT_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.TABLES.get(name));
                                entries.add(ModBlocks.COFFEE_TABLES.get(name));
                                entries.add(ModBlocks.GARDEN_TABLES.get(name));
                                entries.add(ModBlocks.OCTAGONAL_TABLES.get(name));
                                entries.add(ModBlocks.DINING_TABLES.get(name));
                                entries.add(ModBlocks.DESK_TABLES.get(name));
                                entries.add(ModBlocks.KITCHEN_TABLES.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("silverwoodtrees"))
                        {
                            for(String name : BlockSetsHelper.ST_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.TABLES.get(name));
                                entries.add(ModBlocks.COFFEE_TABLES.get(name));
                                entries.add(ModBlocks.GARDEN_TABLES.get(name));
                                entries.add(ModBlocks.OCTAGONAL_TABLES.get(name));
                                entries.add(ModBlocks.DINING_TABLES.get(name));
                                entries.add(ModBlocks.DESK_TABLES.get(name));
                                entries.add(ModBlocks.KITCHEN_TABLES.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("missingtrees"))
                        {
                            for(String name : BlockSetsHelper.MT_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.TABLES.get(name));
                                entries.add(ModBlocks.COFFEE_TABLES.get(name));
                                entries.add(ModBlocks.GARDEN_TABLES.get(name));
                                entries.add(ModBlocks.OCTAGONAL_TABLES.get(name));
                                entries.add(ModBlocks.DINING_TABLES.get(name));
                                entries.add(ModBlocks.DESK_TABLES.get(name));
                                entries.add(ModBlocks.KITCHEN_TABLES.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("natures_spirit"))
                        {
                            for(String name : BlockSetsHelper.NSS_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.TABLES.get(name));
                                entries.add(ModBlocks.COFFEE_TABLES.get(name));
                                entries.add(ModBlocks.GARDEN_TABLES.get(name));
                                entries.add(ModBlocks.OCTAGONAL_TABLES.get(name));
                                entries.add(ModBlocks.DINING_TABLES.get(name));
                                entries.add(ModBlocks.DESK_TABLES.get(name));
                                entries.add(ModBlocks.KITCHEN_TABLES.get(name));
                            }
                        }
                    }).build();

    public static void registerItemGroups()
    {

    }
}