package me.witherbuilder13.a_world_reimagined.world.biome;

import me.witherbuilder13.a_world_reimagined.AWorldReimagined;
import me.witherbuilder13.a_world_reimagined.world.placement.AWRVegetationPlacements;
import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;

public class AWRBiomeModifiers {
    public static final Identifier REPLACE_GROVE_TREES = AWorldReimagined.id("replace_grove_trees");
    public static final Identifier REPLACE_OLD_GROWTH_PINE_TAIGA_TREES = AWorldReimagined.id("replace_old_growth_pine_taiga_trees");
    public static final Identifier REPLACE_OLD_GROWTH_SPRUCE_TAIGA_TREES = AWorldReimagined.id("replace_old_growth_spruce_taiga_trees");
    public static final Identifier REPLACE_SNOWY_TAIGA_TREES = AWorldReimagined.id("replace_snowy_taiga_trees");
    public static final Identifier REPLACE_TAIGA_TREES = AWorldReimagined.id("replace_taiga_trees");

    public static void init() {
        BiomeModification groveTrees = BiomeModifications.create(REPLACE_GROVE_TREES);
        BiomeModification oldGrowthPineTaigaTrees = BiomeModifications.create(REPLACE_OLD_GROWTH_PINE_TAIGA_TREES);
        BiomeModification oldGrowthSpruceTaigaTrees = BiomeModifications.create(REPLACE_OLD_GROWTH_SPRUCE_TAIGA_TREES);
        BiomeModification snowyTaigaTrees = BiomeModifications.create(REPLACE_SNOWY_TAIGA_TREES);
        BiomeModification taigaTrees = BiomeModifications.create(REPLACE_TAIGA_TREES);


        groveTrees.add(
                ModificationPhase.REPLACEMENTS,
                BiomeSelectors.includeByKey(Biomes.GROVE),
                context ->
                        context.getGenerationSettings().removeFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.TREES_GROVE)
        );
        groveTrees.add(
                ModificationPhase.REPLACEMENTS,
                BiomeSelectors.includeByKey(Biomes.GROVE),
                context ->
                        context.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AWRVegetationPlacements.TREES_GROVE)
        );

        oldGrowthPineTaigaTrees.add(
                ModificationPhase.REPLACEMENTS,
                BiomeSelectors.includeByKey(Biomes.OLD_GROWTH_PINE_TAIGA),
                context ->
                        context.getGenerationSettings().removeFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.TREES_OLD_GROWTH_PINE_TAIGA)
        );
        oldGrowthPineTaigaTrees.add(
                ModificationPhase.REPLACEMENTS,
                BiomeSelectors.includeByKey(Biomes.OLD_GROWTH_PINE_TAIGA),
                context ->
                        context.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AWRVegetationPlacements.TREES_OLD_GROWTH_PINE_TAIGA)
        );

        oldGrowthSpruceTaigaTrees.add(
                ModificationPhase.REPLACEMENTS,
                BiomeSelectors.includeByKey(Biomes.OLD_GROWTH_SPRUCE_TAIGA),
                context ->
                        context.getGenerationSettings().removeFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.TREES_OLD_GROWTH_SPRUCE_TAIGA)
        );
        oldGrowthSpruceTaigaTrees.add(
                ModificationPhase.REPLACEMENTS,
                BiomeSelectors.includeByKey(Biomes.OLD_GROWTH_SPRUCE_TAIGA),
                context ->
                        context.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AWRVegetationPlacements.TREES_OLD_GROWTH_SPRUCE_TAIGA)
        );

        snowyTaigaTrees.add(
                ModificationPhase.REPLACEMENTS,
                BiomeSelectors.includeByKey(Biomes.SNOWY_TAIGA),
                context ->
                        context.getGenerationSettings().removeFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.TREES_TAIGA)
        );
        snowyTaigaTrees.add(
                ModificationPhase.REPLACEMENTS,
                BiomeSelectors.includeByKey(Biomes.SNOWY_TAIGA),
                context ->
                        context.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AWRVegetationPlacements.TREES_SNOWY_TAIGA)
        );

        taigaTrees.add(
                ModificationPhase.REPLACEMENTS,
                BiomeSelectors.includeByKey(Biomes.TAIGA),
                context ->
                        context.getGenerationSettings().removeFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.TREES_TAIGA)
        );
        taigaTrees.add(
                ModificationPhase.REPLACEMENTS,
                BiomeSelectors.includeByKey(Biomes.TAIGA),
                context ->
                        context.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AWRVegetationPlacements.TREES_TAIGA)
        );
    }
}
