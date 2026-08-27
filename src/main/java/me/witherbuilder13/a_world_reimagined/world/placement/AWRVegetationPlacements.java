package me.witherbuilder13.a_world_reimagined.world.placement;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class AWRVegetationPlacements {
    
    public static final ResourceKey<PlacedFeature> TREES_ASPEN_GROVE = AWRPlacementUtils.of("trees_aspen_grove");
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
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatureLookup = context.lookup(Registries.CONFIGURED_FEATURE);

        Holder<ConfiguredFeature<?, ?>> placeHolder = configuredFeatureLookup.getOrThrow(VegetationFeatures.GRASS);

        PlacementUtils.register(context, TREES_ASPEN_GROVE, placeHolder, basicModifiers());
        PlacementUtils.register(context, TREES_FORESTED_SLOPES, placeHolder, basicModifiers());
        PlacementUtils.register(context, TREES_GIANT_GROVE, placeHolder, basicModifiers());
        PlacementUtils.register(context, TREES_GROVE, placeHolder, basicModifiers());
        PlacementUtils.register(context, TREES_OLD_GROWTH_PINE_TAIGA, placeHolder, basicModifiers());
        PlacementUtils.register(context, TREES_OLD_GROWTH_SNOWY_TAIGA, placeHolder, basicModifiers());
        PlacementUtils.register(context, TREES_OLD_GROWTH_SPRUCE_TAIGA, placeHolder, basicModifiers());
        PlacementUtils.register(context, TREES_REDWOOD_FOREST, placeHolder, basicModifiers());
        PlacementUtils.register(context, TREES_ROCKY_GROVE, placeHolder, basicModifiers());
        PlacementUtils.register(context, TREES_SNOWY_TAIGA, placeHolder, basicModifiers());
        PlacementUtils.register(context, TREES_TAIGA, placeHolder, basicModifiers());
        PlacementUtils.register(context, TREES_WOODED_TUNDRA, placeHolder, basicModifiers());
    }
    
    private static List<PlacementModifier> basicModifiers() {
        return List.of(
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                BiomeFilter.biome()
        );
    }
}
