package me.witherbuilder13.a_world_reimagined.world.placement;

import me.witherbuilder13.a_world_reimagined.world.feature.AWRVegetationFeatures;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class AWRVegetationPlacements {
    
    public static final ResourceKey<PlacedFeature> TREES_FORESTED_SLOPES = AWRPlacementUtils.of("trees_forested_slopes");
    public static final ResourceKey<PlacedFeature> TREES_GIANT_GROVE = AWRPlacementUtils.of("trees_giant_grove");
    public static final ResourceKey<PlacedFeature> TREES_GROVE = AWRPlacementUtils.of("trees_grove");
    public static final ResourceKey<PlacedFeature> TREES_OLD_GROWTH_PINE_TAIGA = AWRPlacementUtils.of("trees_old_growth_pine_taiga");
    public static final ResourceKey<PlacedFeature> TREES_OLD_GROWTH_SNOWY_TAIGA = AWRPlacementUtils.of("trees_old_growth_snowy_taiga");
    public static final ResourceKey<PlacedFeature> TREES_OLD_GROWTH_SPRUCE_TAIGA = AWRPlacementUtils.of("trees_old_growth_spruce_taiga");
    public static final ResourceKey<PlacedFeature> TREES_REDWOOD_FOREST = AWRPlacementUtils.of("trees_redwood_forest");
    public static final ResourceKey<PlacedFeature> TREES_ROCKY_GROVE = AWRPlacementUtils.of("trees_rocky_grove");
    public static final ResourceKey<PlacedFeature> TREES_SNOWY_TAIGA = AWRPlacementUtils.of("trees_snowy_taiga");
    public static final ResourceKey<PlacedFeature> TREES_TAIGA = AWRPlacementUtils.of("trees_taiga");
    public static final ResourceKey<PlacedFeature> TREES_WOODED_TUNDRA = AWRPlacementUtils.of("trees_wooded_tundra");
    
    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<Feature> configuredFeatureLookup = context.lookup(Registries.FEATURE);

        Holder<Feature> treesForestedSlopes = configuredFeatureLookup.getOrThrow(AWRVegetationFeatures.TREES_FORESTED_SLOPES);
        Holder<Feature> treesGiantGrove = configuredFeatureLookup.getOrThrow(AWRVegetationFeatures.TREES_GIANT_GROVE);
        Holder<Feature> treesGrove = configuredFeatureLookup.getOrThrow(AWRVegetationFeatures.TREES_GROVE);
        Holder<Feature> treesOldGrowthPineTaiga = configuredFeatureLookup.getOrThrow(AWRVegetationFeatures.TREES_OLD_GROWTH_PINE_TAIGA);
        Holder<Feature> treesOldGrowthSnowyTaiga = configuredFeatureLookup.getOrThrow(AWRVegetationFeatures.TREES_OLD_GROWTH_SNOWY_TAIGA);
        Holder<Feature> treesOldGrowthSpruceTaiga = configuredFeatureLookup.getOrThrow(AWRVegetationFeatures.TREES_OLD_GROWTH_SPRUCE_TAIGA);
        Holder<Feature> treesRedwoodForest = configuredFeatureLookup.getOrThrow(AWRVegetationFeatures.TREES_REDWOOD_FOREST);
        Holder<Feature> treesRockyGrove = configuredFeatureLookup.getOrThrow(AWRVegetationFeatures.TREES_ROCKY_GROVE);
        Holder<Feature> treesSnowyTaiga = configuredFeatureLookup.getOrThrow(AWRVegetationFeatures.TREES_SNOWY_TAIGA);
        Holder<Feature> treesTaiga = configuredFeatureLookup.getOrThrow(AWRVegetationFeatures.TREES_TAIGA);
        Holder<Feature> treesWoodedTundra = configuredFeatureLookup.getOrThrow(AWRVegetationFeatures.TREES_WOODED_TUNDRA);

        PlacementUtils.register(context, TREES_FORESTED_SLOPES, treesForestedSlopes, treePlacement(10));
        PlacementUtils.register(context, TREES_GIANT_GROVE, treesGiantGrove, treePlacement(3));
        PlacementUtils.register(context, TREES_GROVE, treesGrove, treePlacement(10));
        PlacementUtils.register(context, TREES_OLD_GROWTH_PINE_TAIGA, treesOldGrowthPineTaiga, treePlacement(15));
        PlacementUtils.register(context, TREES_OLD_GROWTH_SNOWY_TAIGA, treesOldGrowthSnowyTaiga, treePlacement(20));
        PlacementUtils.register(context, TREES_OLD_GROWTH_SPRUCE_TAIGA, treesOldGrowthSpruceTaiga, treePlacement(20));
        PlacementUtils.register(context, TREES_REDWOOD_FOREST, treesRedwoodForest, treePlacement(5));
        PlacementUtils.register(context, TREES_ROCKY_GROVE, treesRockyGrove, treePlacement(15));
        PlacementUtils.register(context, TREES_SNOWY_TAIGA, treesSnowyTaiga, treePlacement(10));
        PlacementUtils.register(context, TREES_TAIGA, treesTaiga, treePlacement(15));
        PlacementUtils.register(context, TREES_WOODED_TUNDRA, treesWoodedTundra, treePlacement(10));
    }
    
    private static List<PlacementModifier> treePlacement(int count) {
        return VegetationPlacements.treePlacement(PlacementUtils.countExtra(count, 0.1F, 1));
    }
}
