package net.alminoris.aesthetictables.item;

import net.alminoris.aesthetictables.AestheticTables;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{
    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, Identifier.of(AestheticTables.MOD_ID, name), item);
    }

    public static void registerItems()
    {

    }
}
