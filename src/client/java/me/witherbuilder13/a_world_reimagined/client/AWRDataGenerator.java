package me.witherbuilder13.a_world_reimagined.client;

import me.witherbuilder13.a_world_reimagined.datagen.AWRDynamicRegistries;
import me.witherbuilder13.a_world_reimagined.datagen.ModelGen;
import me.witherbuilder13.a_world_reimagined.world.biome.AWRBiomes;
import me.witherbuilder13.a_world_reimagined.world.feature.AWRFeatureUtils;
import me.witherbuilder13.a_world_reimagined.world.placement.AWRPlacementUtils;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class AWRDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModelGen::new);

		pack.addProvider(AWRDynamicRegistries::new);
	}

	@Override
	public void buildRegistry(RegistrySetBuilder builder) {
		builder.add(Registries.BIOME, AWRBiomes::bootstrap);
		builder.add(Registries.FEATURE, AWRFeatureUtils::bootstrap);
		builder.add(Registries.PLACED_FEATURE, AWRPlacementUtils::bootstrap);
	}
}
