package me.witherbuilder13.a_world_reimagined.world.biome;

import me.witherbuilder13.a_world_reimagined.AWorldReimagined;
import me.witherbuilder13.a_world_reimagined.world.placement.AWRVegetationPlacements;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.biome.OverworldBiomes;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
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

public class AWRBiomes {

    public static final ResourceKey<Biome> FORESTED_SLOPES = register("forested_slopes");
    public static final ResourceKey<Biome> GIANT_GROVE = register("giant_grove");
    public static final ResourceKey<Biome> GLACIAL_SHORE = register("glacial_shore");
    public static final ResourceKey<Biome> OLD_GROWTH_SNOWY_TAIGA = register("old_growth_snowy_taiga");
    public static final ResourceKey<Biome> REDWOOD_FOREST = register("redwood_forest");
    public static final ResourceKey<Biome> ROCKY_GROVE = register("rocky_grove");
    public static final ResourceKey<Biome> TUNDRA = register("tundra");
    public static final ResourceKey<Biome> WOODED_TUNDRA = register("wooded_tundra");

    //` --------------------------------------------------------------------------------------------------------------

    public static void bootstrap(final BootstrapContext<Biome> context) {
        HolderGetter<PlacedFeature> placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        HolderGetter<WorldCarver> carvers = context.lookup(Registries.CARVER);

        context.register(FORESTED_SLOPES, forestedSlopes(placedFeatures, carvers));
        context.register(GIANT_GROVE, giantGrove(placedFeatures, carvers));
        context.register(GLACIAL_SHORE, glacialShore(placedFeatures, carvers));
        context.register(OLD_GROWTH_SNOWY_TAIGA, oldGrowthSnowyTaiga(placedFeatures, carvers));
        context.register(REDWOOD_FOREST, redwoodForest(placedFeatures, carvers));
        context.register(ROCKY_GROVE, rockyGrove(placedFeatures, carvers));
        context.register(TUNDRA, tundra(placedFeatures, carvers));
        context.register(WOODED_TUNDRA, woodedTundra(placedFeatures, carvers));
    }

    //` -----------------------------------------------------------------------------------------------------------------------

    private static final int DEFAULT_WATER_COLOR = 4159204;

    public static Biome forestedSlopes(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<WorldCarver> carvers) {

        MobSpawnSettings.Builder mobs = new MobSpawnSettings.Builder();

        BiomeGenerationSettings.Builder generation = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        OverworldBiomes.globalOverworldGeneration(generation);
        BiomeDefaultFeatures.addDefaultMushrooms(generation);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generation, true);
        generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AWRVegetationPlacements.TREES_FORESTED_SLOPES);

        return OverworldBiomes.baseBiome(0.4F, 0.4F)
                .mobSpawnSettings(mobs.build())
                .generationSettings(generation.build())
                .build();
    }

    public static Biome giantGrove(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<WorldCarver> carvers) {

        MobSpawnSettings.Builder mobs = new MobSpawnSettings.Builder();

        BiomeGenerationSettings.Builder generation = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        OverworldBiomes.globalOverworldGeneration(generation);
        BiomeDefaultFeatures.addDefaultMushrooms(generation);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generation, true);
        generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AWRVegetationPlacements.TREES_GIANT_GROVE);

        return OverworldBiomes.baseBiome(0.4F, 1.0F)
                .mobSpawnSettings(mobs.build())
                .generationSettings(generation.build())
                .build();
    }

    public static Biome glacialShore(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<WorldCarver> carvers) {

        MobSpawnSettings.Builder mobs = new MobSpawnSettings.Builder();

        BiomeGenerationSettings.Builder generation = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        OverworldBiomes.globalOverworldGeneration(generation);
        BiomeDefaultFeatures.addDefaultMushrooms(generation);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generation, true);

        return OverworldBiomes.baseBiome(0.0F, 0.0F)
                .mobSpawnSettings(mobs.build())
                .generationSettings(generation.build())
                .build();
    }

    public static Biome oldGrowthSnowyTaiga(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<WorldCarver> carvers) {

        MobSpawnSettings.Builder mobs = new MobSpawnSettings.Builder();
        BiomeDefaultFeatures.commonSpawns(mobs);
        BiomeDefaultFeatures.farmAnimals(mobs);
        mobs.addSpawn(EntityTypes.WOLF, 8, 4, 4);
        mobs.addSpawn(EntityTypes.RABBIT, 4, 2, 3);
        mobs.addSpawn(EntityTypes.FOX, 8, 2, 4);

        BiomeGenerationSettings.Builder generation = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        OverworldBiomes.globalOverworldGeneration(generation);
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

    public static Biome redwoodForest(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<WorldCarver> carvers) {

        MobSpawnSettings.Builder mobs = new MobSpawnSettings.Builder();
        BiomeDefaultFeatures.commonSpawns(mobs);
        BiomeDefaultFeatures.farmAnimals(mobs);
        mobs.addSpawn(EntityTypes.WOLF, 8, 4, 4);
        mobs.addSpawn(EntityTypes.RABBIT, 4, 2, 3);
        mobs.addSpawn(EntityTypes.FOX, 8, 2, 4);

        BiomeGenerationSettings.Builder generation = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        OverworldBiomes.globalOverworldGeneration(generation);
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

    public static Biome rockyGrove(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<WorldCarver> carvers) {

        MobSpawnSettings.Builder mobs = new MobSpawnSettings.Builder();

        BiomeGenerationSettings.Builder generation = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        OverworldBiomes.globalOverworldGeneration(generation);
        BiomeDefaultFeatures.addDefaultMushrooms(generation);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generation, true);
        generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AWRVegetationPlacements.TREES_ROCKY_GROVE);

        return OverworldBiomes.baseBiome(0.4F, 0.8F)
                .mobSpawnSettings(mobs.build())
                .generationSettings(generation.build())
                .build();
    }

    public static Biome tundra(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<WorldCarver> carvers) {

        MobSpawnSettings.Builder mobs = new MobSpawnSettings.Builder();

        BiomeGenerationSettings.Builder generation = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        OverworldBiomes.globalOverworldGeneration(generation);
        BiomeDefaultFeatures.addDefaultMushrooms(generation);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generation, true);

        BiomeSpecialEffects.Builder effects = new BiomeSpecialEffects.Builder()
                .waterColor(DEFAULT_WATER_COLOR)
                .grassColorOverride(12086123)
                .foliageColorOverride(9987967)
                .dryFoliageColorOverride(9987967);

        return OverworldBiomes.baseBiome(0.0F, 0.1F)
                .mobSpawnSettings(mobs.build())
                .generationSettings(generation.build())
                .specialEffects(effects.build())
                .build();
    }

    public static Biome woodedTundra(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<WorldCarver> carvers) {

        MobSpawnSettings.Builder mobs = new MobSpawnSettings.Builder();

        BiomeGenerationSettings.Builder generation = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        OverworldBiomes.globalOverworldGeneration(generation);
        BiomeDefaultFeatures.addDefaultMushrooms(generation);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generation, true);
        generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AWRVegetationPlacements.TREES_WOODED_TUNDRA);

        BiomeSpecialEffects.Builder effects = new BiomeSpecialEffects.Builder()
                .waterColor(DEFAULT_WATER_COLOR)
                .grassColorOverride(12086123)
                .foliageColorOverride(9987967)
                .dryFoliageColorOverride(9987967);

        return OverworldBiomes.baseBiome(0.0F, 0.4F)
                .mobSpawnSettings(mobs.build())
                .generationSettings(generation.build())
                .specialEffects(effects.build())
                .build();
    }

    //` ---------------------------------------------------------------------------------------------------------------------
    
    public static ResourceKey<Biome> register(String id) {
        return ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath(AWorldReimagined.MOD_ID, id));
    }
}
