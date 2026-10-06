package me.witherbuilder13.a_world_reimagined.datagen;

import dev.worldgen.lithostitched.api.registry.LithostitchedRegistries;
import me.witherbuilder13.a_world_reimagined.datagen.tag.AWRBiomeTagProvider;
import me.witherbuilder13.a_world_reimagined.datagen.tag.AWRBlockTagProvider;
import me.witherbuilder13.a_world_reimagined.datagen.tag.AWREntityTypeTagProvider;
import me.witherbuilder13.a_world_reimagined.datagen.tag.AWRItemTagProvider;
import me.witherbuilder13.a_world_reimagined.lithostitched.AWRBiomeInjectors;
import me.witherbuilder13.a_world_reimagined.lithostitched.AWRFeatureModifiers;
import me.witherbuilder13.a_world_reimagined.lithostitched.AWRMaterialRuleModifiers;
import me.witherbuilder13.a_world_reimagined.world.biome.AWRBiomeData;
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

		pack.addProvider(AWRModelProvider::new);
		pack.addProvider(AWRLanguageProvider::new);
		
		pack.addProvider(AWRRecipeProvider::new);
		pack.addProvider(AWRAdvancementProvider::new);
		pack.addProvider(AWRBlockLootProvider::new);
		pack.addProvider(AWRBlockInteractLootProvider::new);
		
		pack.addProvider(AWRBlockTagProvider::new);
		pack.addProvider(AWRItemTagProvider::new);
		pack.addProvider(AWRBiomeTagProvider::new);
		pack.addProvider(AWREntityTypeTagProvider::new);

		pack.addProvider(AWRDynamicRegistryProvider::new);
	}

	@Override
	public void buildRegistry(RegistrySetBuilder builder) {
		builder.add(Registries.BIOME, AWRBiomeData::bootstrap);
		builder.add(Registries.FEATURE, AWRFeatureUtils::bootstrap);
		builder.add(Registries.PLACED_FEATURE, AWRPlacementUtils::bootstrap);
		builder.add(LithostitchedRegistries.BIOME_INJECTOR, AWRBiomeInjectors::bootstrap);
		builder.add(LithostitchedRegistries.WORLDGEN_MODIFIER, AWRFeatureModifiers::bootstrap);
		builder.add(LithostitchedRegistries.WORLDGEN_MODIFIER, AWRMaterialRuleModifiers::bootstrap);
	}
}
