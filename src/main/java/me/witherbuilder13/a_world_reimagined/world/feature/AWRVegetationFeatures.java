package me.witherbuilder13.a_world_reimagined.world.feature;

import me.witherbuilder13.a_world_reimagined.world.placement.AWRTreePlacements;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.TreePlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.random.WeightedList;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedRandomSelectorFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.function.Consumer;

public class AWRVegetationFeatures {
    
    public static final ResourceKey<Feature> TREES_FORESTED_SLOPES = AWRFeatureUtils.of("trees_forested_slopes");
    public static final ResourceKey<Feature> TREES_GIANT_GROVE = AWRFeatureUtils.of("trees_giant_grove");
    public static final ResourceKey<Feature> TREES_GROVE = AWRFeatureUtils.of("trees_grove");
    public static final ResourceKey<Feature> TREES_OLD_GROWTH_PINE_TAIGA = AWRFeatureUtils.of("trees_old_growth_pine_taiga");
    public static final ResourceKey<Feature> TREES_OLD_GROWTH_SNOWY_TAIGA = AWRFeatureUtils.of("trees_old_growth_snowy_taiga");
    public static final ResourceKey<Feature> TREES_OLD_GROWTH_SPRUCE_TAIGA = AWRFeatureUtils.of("trees_old_growth_spruce_taiga");
    public static final ResourceKey<Feature> TREES_REDWOOD_FOREST = AWRFeatureUtils.of("trees_redwood_forest");
    public static final ResourceKey<Feature> TREES_ROCKY_GROVE = AWRFeatureUtils.of("trees_rocky_grove");
    public static final ResourceKey<Feature> TREES_SNOWY_TAIGA = AWRFeatureUtils.of("trees_snowy_taiga");
    public static final ResourceKey<Feature> TREES_TAIGA = AWRFeatureUtils.of("trees_taiga");
    public static final ResourceKey<Feature> TREES_WOODED_TUNDRA = AWRFeatureUtils.of("trees_wooded_tundra");

    public static void bootstrap(BootstrapContext<Feature> context) {
        HolderGetter<PlacedFeature> placedFeatureLookup = context.lookup(Registries.PLACED_FEATURE);

        Holder<PlacedFeature> cedar = placedFeatureLookup.getOrThrow(AWRTreePlacements.CEDAR);
        Holder<PlacedFeature> cedarFancy = placedFeatureLookup.getOrThrow(AWRTreePlacements.CEDAR_FANCY);
        Holder<PlacedFeature> cedarFlat = placedFeatureLookup.getOrThrow(AWRTreePlacements.CEDAR_FLAT);

        Holder<PlacedFeature> fir = placedFeatureLookup.getOrThrow(AWRTreePlacements.FIR);
        Holder<PlacedFeature> firFancy = placedFeatureLookup.getOrThrow(AWRTreePlacements.FIR_FANCY);
        Holder<PlacedFeature> firMega = placedFeatureLookup.getOrThrow(AWRTreePlacements.FIR_MEGA);
        Holder<PlacedFeature> firOnSnow = placedFeatureLookup.getOrThrow(AWRTreePlacements.FIR_ON_SNOW);
        Holder<PlacedFeature> firFancyOnSnow = placedFeatureLookup.getOrThrow(AWRTreePlacements.FIR_FANCY_ON_SNOW);

        Holder<PlacedFeature> hemlock = placedFeatureLookup.getOrThrow(AWRTreePlacements.HEMLOCK);
        Holder<PlacedFeature> hemlockFancy = placedFeatureLookup.getOrThrow(AWRTreePlacements.HEMLOCK_FANCY);

        Holder<PlacedFeature> larch = placedFeatureLookup.getOrThrow(AWRTreePlacements.LARCH);
        Holder<PlacedFeature> larchFancy = placedFeatureLookup.getOrThrow(AWRTreePlacements.LARCH_FANCY);

        Holder<PlacedFeature> pine = placedFeatureLookup.getOrThrow(AWRTreePlacements.PINE);
        Holder<PlacedFeature> pineFancy = placedFeatureLookup.getOrThrow(AWRTreePlacements.PINE_FANCY);
        Holder<PlacedFeature> pineTop = placedFeatureLookup.getOrThrow(AWRTreePlacements.PINE_TOP);
        Holder<PlacedFeature> pineMega = placedFeatureLookup.getOrThrow(AWRTreePlacements.PINE_MEGA);
        Holder<PlacedFeature> pineTopMega = placedFeatureLookup.getOrThrow(AWRTreePlacements.PINE_TOP_MEGA);

        Holder<PlacedFeature> redwood = placedFeatureLookup.getOrThrow(AWRTreePlacements.REDWOOD);

        Holder<PlacedFeature> sequoia = placedFeatureLookup.getOrThrow(AWRTreePlacements.SEQUOIA);

        Holder<PlacedFeature> spruce = placedFeatureLookup.getOrThrow(TreePlacements.SPRUCE_CHECKED);
        Holder<PlacedFeature> spruceFancy = placedFeatureLookup.getOrThrow(AWRTreePlacements.SPRUCE_FANCY);
        Holder<PlacedFeature> spruceTop = placedFeatureLookup.getOrThrow(TreePlacements.PINE_CHECKED);
        Holder<PlacedFeature> spruceMega = placedFeatureLookup.getOrThrow(TreePlacements.MEGA_SPRUCE_CHECKED);
        Holder<PlacedFeature> spruceTopMega = placedFeatureLookup.getOrThrow(TreePlacements.MEGA_PINE_CHECKED);

        Holder<PlacedFeature> fallenFir = placedFeatureLookup.getOrThrow(AWRTreePlacements.FALLEN_FIR);
        Holder<PlacedFeature> fallenLarch = placedFeatureLookup.getOrThrow(AWRTreePlacements.FALLEN_LARCH);
        Holder<PlacedFeature> fallenPine = placedFeatureLookup.getOrThrow(AWRTreePlacements.FALLEN_PINE);
        Holder<PlacedFeature> fallenSpruce = placedFeatureLookup.getOrThrow(TreePlacements.FALLEN_SPRUCE_TREE);
        
        //* ---------------------------------------------------------------------------------------------------------------

        context.register(TREES_FORESTED_SLOPES, weightedRandomSelector(b -> b
                .add(cedar)
                .add(cedarFancy)
                .add(cedarFlat)
        ));
        context.register(TREES_GIANT_GROVE, weightedRandomSelector(b -> b
                .add(sequoia)
        ));
        context.register(TREES_GROVE, weightedRandomSelector(b -> b
                .add(firOnSnow)
                .add(firFancyOnSnow)
        ));
        context.register(TREES_OLD_GROWTH_PINE_TAIGA, weightedRandomSelector(b -> b
                .add(pineMega, 4)
                .add(pineTopMega, 4)
                .add(pine, 2)
                .add(pineFancy, 2)
                .add(pineTop, 2)
                .add(spruce, 2)
                .add(spruceFancy, 2)
                .add(spruceTop, 2)
                .add(fallenSpruce)
                .add(fallenPine)
        ));
        context.register(TREES_OLD_GROWTH_SNOWY_TAIGA, weightedRandomSelector(b -> b
                .add(firMega, 5)
                .add(fir, 2)
                .add(firFancy, 2)
                .add(spruce, 2)
                .add(spruceFancy, 2)
                .add(spruceTop, 2)
                .add(fallenSpruce)
                .add(fallenFir)
        ));
        context.register(TREES_OLD_GROWTH_SPRUCE_TAIGA, weightedRandomSelector(b -> b
                .add(spruceMega, 4)
                .add(spruceTopMega, 4)
                .add(spruce, 2)
                .add(spruceFancy, 2)
                .add(spruceTop, 2)
                .add(pine, 2)
                .add(pineFancy, 2)
                .add(pineTop, 2)
                .add(fallenSpruce)
                .add(fallenPine)
        ));
        context.register(TREES_REDWOOD_FOREST, weightedRandomSelector(b -> b
                .add(redwood)
        ));
        context.register(TREES_ROCKY_GROVE, weightedRandomSelector(b -> b
                .add(hemlock)
                .add(hemlockFancy)
        ));
        context.register(TREES_SNOWY_TAIGA, weightedRandomSelector(b -> b
                .add(fir, 2)
                .add(firFancy, 2)
                .add(spruce, 2)
                .add(spruceFancy, 2)
                .add(spruceTop, 2)
                .add(fallenSpruce)
                .add(fallenFir)
        ));
        context.register(TREES_TAIGA, weightedRandomSelector(b -> b
                .add(spruce, 2)
                .add(spruceFancy, 2)
                .add(spruceTop, 2)
                .add(pine, 2)
                .add(pineFancy, 2)
                .add(pineTop, 2)
                .add(fallenSpruce)
                .add(fallenPine)
        ));
        context.register(TREES_WOODED_TUNDRA, weightedRandomSelector(b -> b
                .add(larch)
                .add(larchFancy)
                .add(fallenLarch)
        ));
    }
    
    private static WeightedRandomSelectorFeature weightedRandomSelector(Consumer<WeightedList.Builder<Holder<PlacedFeature>>> consumer) {
        WeightedList.Builder<Holder<PlacedFeature>> builder = new WeightedList.Builder<>();
        consumer.accept(builder);

        return new WeightedRandomSelectorFeature(builder.build());
    }
}
