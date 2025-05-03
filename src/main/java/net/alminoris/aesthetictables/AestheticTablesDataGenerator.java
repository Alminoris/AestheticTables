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
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
	}
}
