package me.witherbuilder13.a_world_reimagined.datagen.tag;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBiomeTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

import static me.witherbuilder13.a_world_reimagined.world.biome.AWRBiomes.*;

public class AWRBiomeTagProvider extends FabricTagsProvider<Biome> {
	
	public AWRBiomeTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
		super(output, Registries.BIOME, registryLookupFuture);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	protected void addTags(HolderLookup.@NonNull Provider registries) {
		
		builder(BiomeTags.HAS_TRAIL_RUINS)
				.add(OLD_GROWTH_SNOWY_TAIGA);
		
		builder(ConventionalBiomeTags.IS_TAIGA)
				.add(OLD_GROWTH_SNOWY_TAIGA, ROCKY_GROVE, FORESTED_SLOPES, WOODED_TUNDRA, REDWOOD_FOREST, GIANT_GROVE);
		
		builder(ConventionalBiomeTags.IS_DEEP_OCEAN)
				.add(DEEP_WARM_OCEAN);
		
		builder(ConventionalBiomeTags.IS_SNOWY)
				.add(TUNDRA, OLD_GROWTH_SNOWY_TAIGA, WOODED_TUNDRA, GLACIAL_SHORE);
		
		builder(ConventionalBiomeTags.IS_MOUNTAIN)
				.add(FORESTED_SLOPES, ROCKY_GROVE, GIANT_GROVE);
		
		builder(ConventionalBiomeTags.IS_MOUNTAIN_SLOPE)
				.add(FORESTED_SLOPES, ROCKY_GROVE, GIANT_GROVE);
		
		builder(ConventionalBiomeTags.IS_HOT_OVERWORLD)
				.add(DEEP_WARM_OCEAN);
		
		builder(ConventionalBiomeTags.IS_SWAMP)
				.add(BOG);
		
		builder(ConventionalBiomeTags.IS_COLD_OVERWORLD)
				.add(TUNDRA, WOODED_TUNDRA, OLD_GROWTH_SNOWY_TAIGA, REDWOOD_FOREST, GIANT_GROVE, FORESTED_SLOPES, ROCKY_GROVE, GLACIAL_SHORE, BOG, PRAIRIE, STEPPE);
		
		builder(ConventionalBiomeTags.IS_TEMPERATE_OVERWORLD)
				.add(ASPEN_GROVE);
		
		builder(ConventionalBiomeTags.IS_PLAINS)
				.add(PRAIRIE);
		
		builder(ConventionalBiomeTags.IS_PLATEAU)
				.add(STEPPE, TUNDRA);
		
		builder(ConventionalBiomeTags.IS_RARE)
				.add(REDWOOD_FOREST, GIANT_GROVE);
		
		builder(ConventionalBiomeTags.IS_SNOWY_PLAINS)
				.add(TUNDRA);
		
		builder(ConventionalBiomeTags.IS_OLD_GROWTH)
				.add(OLD_GROWTH_SNOWY_TAIGA);
	}
}
