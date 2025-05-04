package net.alminoris.aesthetictables;

import net.alminoris.aesthetictables.datagen.ModBlockTagProvider;
import net.alminoris.aesthetictables.datagen.ModLootTableProvider;
import net.alminoris.aesthetictables.datagen.ModModelProvider;
import net.alminoris.aesthetictables.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class AestheticTablesDataGenerator implements DataGeneratorEntrypoint
{
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator)
	{
		fabricDataGenerator.addProvider(ModModelProvider::new);
		fabricDataGenerator.addProvider(ModRecipeProvider::new);
		fabricDataGenerator.addProvider(ModLootTableProvider::new);
		fabricDataGenerator.addProvider(ModBlockTagProvider::new);
	}
}
