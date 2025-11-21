package net.alminoris.aesthetictables;

import net.alminoris.aesthetictables.block.ModBlocks;
import net.alminoris.aesthetictables.item.ModItemGroups;
import net.alminoris.aesthetictables.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AestheticTables implements ModInitializer
{
	public static final String MOD_ID = "aesthetictables";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItemGroups.registerItemGroups();
		ModItems.registerItems();
		ModBlocks.registerBlocks();
	}
}