package me.witherbuilder13.a_world_reimagined.world.biome;

import me.witherbuilder13.a_world_reimagined.world.placement.AWRVegetationPlacements;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.biome.OverworldBiomes;
import net.minecraft.data.worldgen.placement.AquaticPlacements;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.ARGB;
import net.minecraft.world.attribute.BackgroundMusic;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.carver.WorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import static me.witherbuilder13.a_world_reimagined.world.biome.AWRBiomes.*;

public class AWRBiomeData {
	
	public static void bootstrap(final BootstrapContext<Biome> context) {
		HolderGetter<PlacedFeature> placedFeatures = context.lookup(Registries.PLACED_FEATURE);
		HolderGetter<WorldCarver> carvers = context.lookup(Registries.CARVER);
		
		context.register(ASPEN_GROVE, aspenGrove(placedFeatures, carvers));
		context.register(BOG, bog(placedFeatures, carvers));
		context.register(DEEP_WARM_OCEAN, deepWarmOcean(placedFeatures, carvers));
		context.register(FORESTED_SLOPES, forestedSlopes(placedFeatures, carvers));
		context.register(GIANT_GROVE, giantGrove(placedFeatures, carvers));
		context.register(GLACIAL_SHORE, glacialShore(placedFeatures, carvers));
		context.register(OLD_GROWTH_SNOWY_TAIGA, oldGrowthSnowyTaiga(placedFeatures, carvers));
		context.register(PRAIRIE, prairie(placedFeatures, carvers));
		context.register(REDWOOD_FOREST, redwoodForest(placedFeatures, carvers));
		context.register(ROCKY_GROVE, rockyGrove(placedFeatures, carvers));
		context.register(STEPPE, steppe(placedFeatures, carvers));
		context.register(TUNDRA, tundra(placedFeatures, carvers));
		context.register(WOODED_TUNDRA, woodedTundra(placedFeatures, carvers));
	}
	
	//` -----------------------------------------------------------------------------------------------------------------------
	
	private static final int DEFAULT_WATER_COLOR = 4159204;
	
	private static Biome aspenGrove(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<WorldCarver> carvers) {
		
		MobSpawnSettings.Builder mobs = new MobSpawnSettings.Builder();
		
		BiomeGenerationSettings.Builder generation = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
		globalOverworldGeneration(generation);
		BiomeDefaultFeatures.addDefaultMushrooms(generation);
		BiomeDefaultFeatures.addDefaultExtraVegetation(generation, true);
		generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AWRVegetationPlacements.TREES_ASPEN_GROVE);
		
		return OverworldBiomes.baseBiome(0.6F, 0.6F)
				.mobSpawnSettings(mobs.build())
				.generationSettings(generation.build())
				.build();
	}
	
	private static Biome bog(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<WorldCarver> carvers) {
		
		MobSpawnSettings.Builder mobs = new MobSpawnSettings.Builder();
		
		BiomeGenerationSettings.Builder generation = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
		globalOverworldGeneration(generation);
		BiomeDefaultFeatures.addDefaultMushrooms(generation);
		BiomeDefaultFeatures.addDefaultExtraVegetation(generation, true);
		
		return OverworldBiomes.baseBiome(0.2F, 0.2F)
				.mobSpawnSettings(mobs.build())
				.generationSettings(generation.build())
				.build();
	}
	
	private static Biome deepWarmOcean(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<WorldCarver> carvers) {
		
		MobSpawnSettings.Builder mobs = new MobSpawnSettings.Builder();
		mobs.addSpawn(EntityTypes.PUFFERFISH, 15, 1, 3);
		mobs.addSpawn(EntityTypes.NAUTILUS, 5, 1, 1);
		BiomeDefaultFeatures.warmOceanSpawns(mobs, 8, 4);
		
		BiomeGenerationSettings.Builder generation = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
		globalOverworldGeneration(generation);
		BiomeDefaultFeatures.addDefaultMushrooms(generation);
		BiomeDefaultFeatures.addDefaultExtraVegetation(generation, true);
		generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AquaticPlacements.WARM_OCEAN_VEGETATION);
		generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AquaticPlacements.SEAGRASS_WARM);
		generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AquaticPlacements.SEA_PICKLE);
		
		BiomeSpecialEffects.Builder effects = new BiomeSpecialEffects.Builder();
		effects.waterColor(4445678);
		
		return OverworldBiomes.baseOcean()
				.mobSpawnSettings(mobs.build())
				.generationSettings(generation.build())
				.specialEffects(effects.build())
				.setAttribute(EnvironmentAttributes.WATER_FOG_COLOR, ARGB.vector3fFromRGB24(-16507085))
				.build();
	}
	
	private static Biome forestedSlopes(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<WorldCarver> carvers) {
		
		MobSpawnSettings.Builder mobs = new MobSpawnSettings.Builder();
		
		BiomeGenerationSettings.Builder generation = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
		globalOverworldGeneration(generation);
		BiomeDefaultFeatures.addDefaultMushrooms(generation);
		BiomeDefaultFeatures.addDefaultExtraVegetation(generation, true);
		generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AWRVegetationPlacements.TREES_FORESTED_SLOPES);
		
		return OverworldBiomes.baseBiome(0.4F, 0.4F)
				.mobSpawnSettings(mobs.build())
				.generationSettings(generation.build())
				.build();
	}
	
	private static Biome giantGrove(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<WorldCarver> carvers) {
		
		MobSpawnSettings.Builder mobs = new MobSpawnSettings.Builder();
		
		BiomeGenerationSettings.Builder generation = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
		globalOverworldGeneration(generation);
		BiomeDefaultFeatures.addDefaultMushrooms(generation);
		BiomeDefaultFeatures.addDefaultExtraVegetation(generation, true);
		generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AWRVegetationPlacements.TREES_GIANT_GROVE);
		
		return OverworldBiomes.baseBiome(0.4F, 1.0F)
				.mobSpawnSettings(mobs.build())
				.generationSettings(generation.build())
				.build();
	}
	
	private static Biome glacialShore(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<WorldCarver> carvers) {
		
		MobSpawnSettings.Builder mobs = new MobSpawnSettings.Builder();
		
		BiomeGenerationSettings.Builder generation = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
		globalOverworldGeneration(generation);
		BiomeDefaultFeatures.addDefaultMushrooms(generation);
		BiomeDefaultFeatures.addDefaultExtraVegetation(generation, true);
		
		return OverworldBiomes.baseBiome(0.0F, 0.0F)
				.mobSpawnSettings(mobs.build())
				.generationSettings(generation.build())
				.build();
	}
	
	private static Biome oldGrowthSnowyTaiga(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<WorldCarver> carvers) {
		
		MobSpawnSettings.Builder mobs = new MobSpawnSettings.Builder();
		BiomeDefaultFeatures.commonSpawns(mobs);
		BiomeDefaultFeatures.farmAnimals(mobs);
		mobs.addSpawn(EntityTypes.WOLF, 8, 4, 4);
		mobs.addSpawn(EntityTypes.RABBIT, 4, 2, 3);
		mobs.addSpawn(EntityTypes.FOX, 8, 2, 4);
		
		BiomeGenerationSettings.Builder generation = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
		globalOverworldGeneration(generation);
		BiomeDefaultFeatures.addMossyStoneBlock(generation);
		BiomeDefaultFeatures.addFerns(generation);
		BiomeDefaultFeatures.addDefaultFlowers(generation);
		BiomeDefaultFeatures.addGiantTaigaVegetation(generation);
		BiomeDefaultFeatures.addDefaultMushrooms(generation);
		BiomeDefaultFeatures.addDefaultExtraVegetation(generation, true);
		BiomeDefaultFeatures.addRareBerryBushes(generation);
		generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AWRVegetationPlacements.TREES_OLD_GROWTH_SNOWY_TAIGA);
		
		return OverworldBiomes.baseBiome(0.0F, 1.0F)
				.mobSpawnSettings(mobs.build())
				.generationSettings(generation.build())
				.setAttribute(EnvironmentAttributes.BACKGROUND_MUSIC, new BackgroundMusic(SoundEvents.MUSIC_BIOME_OLD_GROWTH_TAIGA))
				.build();
	}
	
	private static Biome prairie(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<WorldCarver> carvers) {
		
		MobSpawnSettings.Builder mobs = new MobSpawnSettings.Builder();
		BiomeDefaultFeatures.commonSpawns(mobs);
		BiomeDefaultFeatures.farmAnimals(mobs);
		
		BiomeGenerationSettings.Builder generation = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
		globalOverworldGeneration(generation);
		BiomeDefaultFeatures.addDefaultMushrooms(generation);
		generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AWRVegetationPlacements.PATCH_GRASS_PRAIRIE);
		BiomeDefaultFeatures.addDefaultExtraVegetation(generation, true);
		
		return OverworldBiomes.baseBiome(0.4F, 0.1F)
				.mobSpawnSettings(mobs.build())
				.generationSettings(generation.build())
				.build();
	}
	
	private static Biome redwoodForest(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<WorldCarver> carvers) {
		
		MobSpawnSettings.Builder mobs = new MobSpawnSettings.Builder();
		BiomeDefaultFeatures.commonSpawns(mobs);
		BiomeDefaultFeatures.farmAnimals(mobs);
		mobs.addSpawn(EntityTypes.WOLF, 8, 4, 4);
		mobs.addSpawn(EntityTypes.RABBIT, 4, 2, 3);
		mobs.addSpawn(EntityTypes.FOX, 8, 2, 4);
		
		BiomeGenerationSettings.Builder generation = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
		globalOverworldGeneration(generation);
		BiomeDefaultFeatures.addFerns(generation);
		BiomeDefaultFeatures.addDefaultFlowers(generation);
		BiomeDefaultFeatures.addGiantTaigaVegetation(generation);
		BiomeDefaultFeatures.addDefaultMushrooms(generation);
		BiomeDefaultFeatures.addDefaultExtraVegetation(generation, true);
		BiomeDefaultFeatures.addCommonBerryBushes(generation);
		generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AWRVegetationPlacements.TREES_REDWOOD_FOREST);
		
		return OverworldBiomes.baseBiome(0.4F, 1.0F)
				.mobSpawnSettings(mobs.build())
				.generationSettings(generation.build())
				.setAttribute(EnvironmentAttributes.BACKGROUND_MUSIC, new BackgroundMusic(SoundEvents.MUSIC_BIOME_OLD_GROWTH_TAIGA))
				.build();
	}
	
	private static Biome rockyGrove(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<WorldCarver> carvers) {
		
		MobSpawnSettings.Builder mobs = new MobSpawnSettings.Builder();
		
		BiomeGenerationSettings.Builder generation = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
		globalOverworldGeneration(generation);
		BiomeDefaultFeatures.addDefaultMushrooms(generation);
		BiomeDefaultFeatures.addDefaultExtraVegetation(generation, true);
		generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AWRVegetationPlacements.TREES_ROCKY_GROVE);
		
		return OverworldBiomes.baseBiome(0.4F, 0.8F)
				.mobSpawnSettings(mobs.build())
				.generationSettings(generation.build())
				.build();
	}
	
	private static Biome steppe(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<WorldCarver> carvers) {
		
		MobSpawnSettings.Builder mobs = new MobSpawnSettings.Builder();
		BiomeDefaultFeatures.commonSpawns(mobs);
		BiomeDefaultFeatures.farmAnimals(mobs);
		
		BiomeGenerationSettings.Builder generation = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
		globalOverworldGeneration(generation);
		BiomeDefaultFeatures.addDefaultMushrooms(generation);
		BiomeDefaultFeatures.addDefaultExtraVegetation(generation, true);
		
		return OverworldBiomes.baseBiome(0.3F, 0.1F)
				.mobSpawnSettings(mobs.build())
				.generationSettings(generation.build())
				.build();
	}
	
	private static Biome tundra(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<WorldCarver> carvers) {
		
		MobSpawnSettings.Builder mobs = new MobSpawnSettings.Builder();
		
		BiomeGenerationSettings.Builder generation = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
		globalOverworldGeneration(generation);
		BiomeDefaultFeatures.addDefaultMushrooms(generation);
		generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AWRVegetationPlacements.PATCH_GRASS_TUNDRA);
		BiomeDefaultFeatures.addDefaultExtraVegetation(generation, true);
		
		BiomeSpecialEffects.Builder effects = new BiomeSpecialEffects.Builder();
		effects.waterColor(DEFAULT_WATER_COLOR);
		effects.grassColorOverride(12086123);
		effects.foliageColorOverride(9987967);
		effects.dryFoliageColorOverride(9987967);
		
		return OverworldBiomes.baseBiome(0.0F, 0.0F)
				.hasPrecipitation(false)
				.mobSpawnSettings(mobs.build())
				.generationSettings(generation.build())
				.specialEffects(effects.build())
				.build();
	}
	
	private static Biome woodedTundra(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<WorldCarver> carvers) {
		
		MobSpawnSettings.Builder mobs = new MobSpawnSettings.Builder();
		
		BiomeGenerationSettings.Builder generation = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
		globalOverworldGeneration(generation);
		BiomeDefaultFeatures.addDefaultMushrooms(generation);
		generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AWRVegetationPlacements.PATCH_GRASS_TUNDRA);
		BiomeDefaultFeatures.addDefaultExtraVegetation(generation, true);
		generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AWRVegetationPlacements.TREES_WOODED_TUNDRA);
		
		BiomeSpecialEffects.Builder effects = new BiomeSpecialEffects.Builder();
		effects.waterColor(DEFAULT_WATER_COLOR);
		effects.grassColorOverride(12086123);
		effects.foliageColorOverride(9987967);
		effects.dryFoliageColorOverride(9987967);
		
		return OverworldBiomes.baseBiome(0.0F, 0.1F)
				.hasPrecipitation(false)
				.mobSpawnSettings(mobs.build())
				.generationSettings(generation.build())
				.specialEffects(effects.build())
				.build();
	}
	
	//` ---------------------------------------------------------------------------------------------------------------------
	
	private static void globalOverworldGeneration(BiomeGenerationSettings.Builder generation) {
		OverworldBiomes.globalOverworldGeneration(generation);
		BiomeDefaultFeatures.addDefaultOres(generation);
	}
}
