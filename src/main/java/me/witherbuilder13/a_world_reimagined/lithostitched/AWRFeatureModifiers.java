package me.witherbuilder13.a_world_reimagined.lithostitched;

import dev.worldgen.lithostitched.api.worldgen.modifier.WorldgenModifier;
import me.witherbuilder13.a_world_reimagined.world.placement.AWRVegetationPlacements;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class AWRFeatureModifiers {

    public static final ResourceKey<WorldgenModifier> REMOVE_GROVE_TREES = AWRWorldgenModifiers.createKey("remove_grove_trees");
    public static final ResourceKey<WorldgenModifier> REMOVE_OLD_GROWTH_PINE_TAIGA_TREES = AWRWorldgenModifiers.createKey("remove_old_growth_pine_taiga_trees");
    public static final ResourceKey<WorldgenModifier> REMOVE_OLD_GROWTH_SPRUCE_TAIGA_TREES = AWRWorldgenModifiers.createKey("remove_old_growth_spruce_taiga_trees");
    public static final ResourceKey<WorldgenModifier> REMOVE_SNOWY_TAIGA_TREES = AWRWorldgenModifiers.createKey("remove_snowy_taiga_trees");
    public static final ResourceKey<WorldgenModifier> REMOVE_TAIGA_TREES = AWRWorldgenModifiers.createKey("remove_taiga_trees");

    public static final ResourceKey<WorldgenModifier> ADD_GROVE_TREES = AWRWorldgenModifiers.createKey("add_grove_trees");
    public static final ResourceKey<WorldgenModifier> ADD_OLD_GROWTH_PINE_TAIGA_TREES = AWRWorldgenModifiers.createKey("add_old_growth_pine_taiga_trees");
    public static final ResourceKey<WorldgenModifier> ADD_OLD_GROWTH_SPRUCE_TAIGA_TREES = AWRWorldgenModifiers.createKey("add_old_growth_spruce_taiga_trees");
    public static final ResourceKey<WorldgenModifier> ADD_SNOWY_TAIGA_TREES = AWRWorldgenModifiers.createKey("add_snowy_taiga_trees");
    public static final ResourceKey<WorldgenModifier> ADD_TAIGA_TREES = AWRWorldgenModifiers.createKey("add_taiga_trees");

    public static void bootstrap(BootstrapContext<WorldgenModifier> context) {
        HolderGetter<Biome> biomes = context.lookup(Registries.BIOME);
        HolderGetter<PlacedFeature> placedFeatures = context.lookup(Registries.PLACED_FEATURE);

        context.register(REMOVE_GROVE_TREES, WorldgenModifier.builder()
                .removeFeatures(
                        HolderSet.direct(
                                biomes.getOrThrow(Biomes.GROVE)
                        ),
                        HolderSet.direct(
                                placedFeatures.getOrThrow(VegetationPlacements.TREES_GROVE)
                        ),
                        GenerationStep.Decoration.VEGETAL_DECORATION
                )
        );
        context.register(REMOVE_OLD_GROWTH_PINE_TAIGA_TREES, WorldgenModifier.builder()
                .removeFeatures(
                        HolderSet.direct(
                                biomes.getOrThrow(Biomes.OLD_GROWTH_PINE_TAIGA)
                        ),
                        HolderSet.direct(
                                placedFeatures.getOrThrow(VegetationPlacements.TREES_OLD_GROWTH_PINE_TAIGA)
                        ),
                        GenerationStep.Decoration.VEGETAL_DECORATION
                )
        );
        context.register(REMOVE_OLD_GROWTH_SPRUCE_TAIGA_TREES, WorldgenModifier.builder()
                .removeFeatures(
                        HolderSet.direct(
                                biomes.getOrThrow(Biomes.OLD_GROWTH_SPRUCE_TAIGA)
                        ),
                        HolderSet.direct(
                                placedFeatures.getOrThrow(VegetationPlacements.TREES_OLD_GROWTH_SPRUCE_TAIGA)
                        ),
                        GenerationStep.Decoration.VEGETAL_DECORATION
                )
        );
        context.register(REMOVE_SNOWY_TAIGA_TREES, WorldgenModifier.builder()
                .removeFeatures(
                        HolderSet.direct(
                                biomes.getOrThrow(Biomes.SNOWY_TAIGA)
                        ),
                        HolderSet.direct(
                                placedFeatures.getOrThrow(VegetationPlacements.TREES_TAIGA)
                        ),
                        GenerationStep.Decoration.VEGETAL_DECORATION
                )
        );
        context.register(REMOVE_TAIGA_TREES, WorldgenModifier.builder()
                .removeFeatures(
                        HolderSet.direct(
                                biomes.getOrThrow(Biomes.TAIGA)
                        ),
                        HolderSet.direct(
                                placedFeatures.getOrThrow(VegetationPlacements.TREES_TAIGA)
                        ),
                        GenerationStep.Decoration.VEGETAL_DECORATION
                )
        );

        context.register(ADD_GROVE_TREES, WorldgenModifier.builder()
                .addFeatures(
                        HolderSet.direct(
                                biomes.getOrThrow(Biomes.GROVE)
                        ),
                        HolderSet.direct(
                                placedFeatures.getOrThrow(AWRVegetationPlacements.TREES_GROVE)
                        ),
                        GenerationStep.Decoration.VEGETAL_DECORATION
                )
        );
        context.register(ADD_OLD_GROWTH_PINE_TAIGA_TREES, WorldgenModifier.builder()
                .addFeatures(
                        HolderSet.direct(
                                biomes.getOrThrow(Biomes.OLD_GROWTH_PINE_TAIGA)
                        ),
                        HolderSet.direct(
                                placedFeatures.getOrThrow(AWRVegetationPlacements.TREES_OLD_GROWTH_PINE_TAIGA)
                        ),
                        GenerationStep.Decoration.VEGETAL_DECORATION
                )
        );
        context.register(ADD_OLD_GROWTH_SPRUCE_TAIGA_TREES, WorldgenModifier.builder()
                .addFeatures(
                        HolderSet.direct(
                                biomes.getOrThrow(Biomes.OLD_GROWTH_SPRUCE_TAIGA)
                        ),
                        HolderSet.direct(
                                placedFeatures.getOrThrow(AWRVegetationPlacements.TREES_OLD_GROWTH_SPRUCE_TAIGA)
                        ),
                        GenerationStep.Decoration.VEGETAL_DECORATION
                )
        );
        context.register(ADD_SNOWY_TAIGA_TREES, WorldgenModifier.builder()
                .addFeatures(
                        HolderSet.direct(
                                biomes.getOrThrow(Biomes.SNOWY_TAIGA)
                        ),
                        HolderSet.direct(
                                placedFeatures.getOrThrow(AWRVegetationPlacements.TREES_SNOWY_TAIGA)
                        ),
                        GenerationStep.Decoration.VEGETAL_DECORATION
                )
        );
        context.register(ADD_TAIGA_TREES, WorldgenModifier.builder()
                .addFeatures(
                        HolderSet.direct(
                                biomes.getOrThrow(Biomes.TAIGA)
                        ),
                        HolderSet.direct(
                                placedFeatures.getOrThrow(AWRVegetationPlacements.TREES_TAIGA)
                        ),
                        GenerationStep.Decoration.VEGETAL_DECORATION
                )
        );
    }
}
