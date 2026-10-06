package me.witherbuilder13.a_world_reimagined.world.placement;

import me.witherbuilder13.a_world_reimagined.block.AWRBlocks;
import me.witherbuilder13.a_world_reimagined.world.feature.AWRTreeFeatures;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

import static net.minecraft.data.worldgen.placement.PlacementUtils.filteredByBlockSurvival;

public class AWRTreePlacements {
    
    public static final ResourceKey<PlacedFeature> ASPEN = AWRPlacementUtils.of("aspen");
    
    public static final ResourceKey<PlacedFeature> CEDAR = AWRPlacementUtils.of("cedar");
    public static final ResourceKey<PlacedFeature> CEDAR_FLAT = AWRPlacementUtils.of("cedar_flat");
    public static final ResourceKey<PlacedFeature> CEDAR_FANCY = AWRPlacementUtils.of("cedar_fancy");

    public static final ResourceKey<PlacedFeature> FIR = AWRPlacementUtils.of("fir");
    public static final ResourceKey<PlacedFeature> FIR_TOP = AWRPlacementUtils.of("fir_top");
    public static final ResourceKey<PlacedFeature> FIR_FANCY = AWRPlacementUtils.of("fir_fancy");
    public static final ResourceKey<PlacedFeature> FIR_MEGA = AWRPlacementUtils.of("fir_mega");
    public static final ResourceKey<PlacedFeature> FIR_TOP_MEGA = AWRPlacementUtils.of("fir_top_mega");
    
    public static final ResourceKey<PlacedFeature> FIR_ON_SNOW = AWRPlacementUtils.of("fir_on_snow");
    public static final ResourceKey<PlacedFeature> FIR_FANCY_ON_SNOW = AWRPlacementUtils.of("fir_fancy_on_snow");

    public static final ResourceKey<PlacedFeature> HEMLOCK = AWRPlacementUtils.of("hemlock");
    public static final ResourceKey<PlacedFeature> HEMLOCK_FANCY = AWRPlacementUtils.of("hemlock_fancy");

    public static final ResourceKey<PlacedFeature> LARCH = AWRPlacementUtils.of("larch");
    public static final ResourceKey<PlacedFeature> LARCH_FANCY = AWRPlacementUtils.of("larch_fancy");

    public static final ResourceKey<PlacedFeature> PINE = AWRPlacementUtils.of("pine");
    public static final ResourceKey<PlacedFeature> PINE_FANCY = AWRPlacementUtils.of("pine_fancy");
    public static final ResourceKey<PlacedFeature> PINE_TOP = AWRPlacementUtils.of("pine_top");
    public static final ResourceKey<PlacedFeature> PINE_MEGA = AWRPlacementUtils.of("pine_mega");
    public static final ResourceKey<PlacedFeature> PINE_TOP_MEGA = AWRPlacementUtils.of("pine_top_mega");
    
    public static final ResourceKey<PlacedFeature> PINE_PINECONES = AWRPlacementUtils.of("pine_pinecones");
    public static final ResourceKey<PlacedFeature> PINE_TOP_PINECONES = AWRPlacementUtils.of("pine_top_pinecones");
    public static final ResourceKey<PlacedFeature> PINE_FANCY_PINECONES = AWRPlacementUtils.of("pine_fancy_pinecones");
    public static final ResourceKey<PlacedFeature> PINE_MEGA_PINECONES = AWRPlacementUtils.of("pine_mega_pinecones");
    public static final ResourceKey<PlacedFeature> PINE_TOP_MEGA_PINECONES = AWRPlacementUtils.of("pine_top_mega_pinecones");

    public static final ResourceKey<PlacedFeature> REDWOOD = AWRPlacementUtils.of("redwood");

    public static final ResourceKey<PlacedFeature> SEQUOIA = AWRPlacementUtils.of("sequoia");

    public static final ResourceKey<PlacedFeature> SPRUCE = AWRPlacementUtils.of("spruce");
    public static final ResourceKey<PlacedFeature> SPRUCE_FANCY = AWRPlacementUtils.of("spruce_fancy");
    public static final ResourceKey<PlacedFeature> SPRUCE_TOP = AWRPlacementUtils.of("spruce_top");
    public static final ResourceKey<PlacedFeature> SPRUCE_MEGA = AWRPlacementUtils.of("spruce_mega");
    public static final ResourceKey<PlacedFeature> SPRUCE_TOP_MEGA = AWRPlacementUtils.of("spruce_top_mega");
    
    public static final ResourceKey<PlacedFeature> SPRUCE_PINECONES = AWRPlacementUtils.of("spruce_pinecones");
    public static final ResourceKey<PlacedFeature> SPRUCE_TOP_PINECONES = AWRPlacementUtils.of("spruce_top_pinecones");
    public static final ResourceKey<PlacedFeature> SPRUCE_FANCY_PINECONES = AWRPlacementUtils.of("spruce_fancy_pinecones");
    public static final ResourceKey<PlacedFeature> SPRUCE_MEGA_PINECONES = AWRPlacementUtils.of("spruce_mega_pinecones");
    public static final ResourceKey<PlacedFeature> SPRUCE_TOP_MEGA_PINECONES = AWRPlacementUtils.of("spruce_top_mega_pinecones");


    public static final ResourceKey<PlacedFeature> FALLEN_FIR = AWRPlacementUtils.of("fallen_fir");
    public static final ResourceKey<PlacedFeature> FALLEN_LARCH = AWRPlacementUtils.of("fallen_larch");
    public static final ResourceKey<PlacedFeature> FALLEN_PINE = AWRPlacementUtils.of("fallen_pine");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<Feature> configuredFeatureLookup = context.lookup(Registries.FEATURE);
        
        //* -----------------------------------------------------------------------------------------------------
        
        Holder<Feature> aspen = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.ASPEN);
        
        Holder<Feature> cedar = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.CEDAR);
        Holder<Feature> cedarFlat = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.CEDAR_CANOPY);
        Holder<Feature> cedarFancy = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.CEDAR_FANCY);

        Holder<Feature> fir = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.FIR);
        Holder<Feature> firTop = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.FIR_TOP);
        Holder<Feature> firFancy = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.FIR_FANCY);
        Holder<Feature> firMega = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.FIR_MEGA);
        Holder<Feature> firTopMega = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.FIR_TOP_MEGA);

        Holder<Feature> hemlock = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.HEMLOCK);
        Holder<Feature> hemlockFancy = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.HEMLOCK_FANCY);

        Holder<Feature> larch = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.LARCH);
        Holder<Feature> larchFancy = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.LARCH_FANCY);

        Holder<Feature> pine = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.PINE);
        Holder<Feature> pineFancy = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.PINE_FANCY);
        Holder<Feature> pineTop = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.PINE_TOP);
        Holder<Feature> pineMega = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.PINE_MEGA);
        Holder<Feature> pineTopMega = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.PINE_TOP_MEGA);
        
        Holder<Feature> pinePinecones = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.PINE_PINECONES);
        Holder<Feature> pineTopPinecones = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.PINE_TOP_PINECONES);
        Holder<Feature> pineFancyPinecones = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.PINE_FANCY_PINECONES);
        Holder<Feature> pineMegaPinecones = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.PINE_MEGA_PINECONES);
        Holder<Feature> pineTopMegaPinecones = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.PINE_TOP_MEGA_PINECONES);

        Holder<Feature> redwood = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.REDWOOD);

        Holder<Feature> sequoia = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.SEQUOIA);

        Holder<Feature> spruce = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.SPRUCE);
        Holder<Feature> spruceFancy = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.SPRUCE_FANCY);
        Holder<Feature> spruceTop = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.SPRUCE_TOP);
        Holder<Feature> spruceMega = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.SPRUCE_MEGA);
        Holder<Feature> spruceTopMega = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.SPRUCE_TOP_MEGA);
        
        Holder<Feature> sprucePinecones = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.SPRUCE_PINECONES);
        Holder<Feature> spruceTopPinecones = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.SPRUCE_TOP_PINECONES);
        Holder<Feature> spruceFancyPinecones = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.SPRUCE_FANCY_PINECONES);
        Holder<Feature> spruceMegaPinecones = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.SPRUCE_MEGA_PINECONES);
        Holder<Feature> spruceTopMegaPinecones = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.SPRUCE_TOP_MEGA_PINECONES);


        Holder<Feature> fallenFir = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.FALLEN_FIR);
        Holder<Feature> fallenLarch = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.FALLEN_LARCH);
        Holder<Feature> fallenPine = configuredFeatureLookup.getOrThrow(AWRTreeFeatures.FALLEN_PINE);
        
        //` ---------------------------------------------------------------------------------------------------------------------------
        
        BlockPredicate snowTreePredicate = BlockPredicate.matchesBlocks(Direction.DOWN, Blocks.SNOW_BLOCK, Blocks.POWDER_SNOW);
        List<PlacementModifier> snowTreeFilterDecorator = List.of(
                EnvironmentScanPlacement.scanningFor(Direction.UP, BlockPredicate.not(BlockPredicate.matchesBlocks(Blocks.POWDER_SNOW)), 8),
                BlockPredicateFilter.forPredicate(snowTreePredicate)
        );
        
        PlacementUtils.register(context, ASPEN, aspen, filteredByBlockSurvival(AWRBlocks.ASPEN_SAPLING));

        PlacementUtils.register(context, CEDAR, cedar, filteredByBlockSurvival(AWRBlocks.CEDAR_SAPLING));
        PlacementUtils.register(context, CEDAR_FANCY, cedarFancy, filteredByBlockSurvival(AWRBlocks.CEDAR_SAPLING));
        PlacementUtils.register(context, CEDAR_FLAT, cedarFlat, filteredByBlockSurvival(AWRBlocks.CEDAR_SAPLING));

        PlacementUtils.register(context, FIR, fir, filteredByBlockSurvival(AWRBlocks.FIR_SAPLING));
        PlacementUtils.register(context, FIR_TOP, firTop, filteredByBlockSurvival(AWRBlocks.FIR_SAPLING));
        PlacementUtils.register(context, FIR_FANCY, firFancy, filteredByBlockSurvival(AWRBlocks.FIR_SAPLING));
        PlacementUtils.register(context, FIR_MEGA, firMega, filteredByBlockSurvival(AWRBlocks.FIR_SAPLING));
        PlacementUtils.register(context, FIR_TOP_MEGA, firTopMega, filteredByBlockSurvival(AWRBlocks.FIR_SAPLING));
        
        PlacementUtils.register(context, FIR_ON_SNOW, fir, snowTreeFilterDecorator);
        PlacementUtils.register(context, FIR_FANCY_ON_SNOW, firFancy, snowTreeFilterDecorator);

        PlacementUtils.register(context, HEMLOCK, hemlock, filteredByBlockSurvival(AWRBlocks.HEMLOCK_SAPLING));
        PlacementUtils.register(context, HEMLOCK_FANCY, hemlockFancy, filteredByBlockSurvival(AWRBlocks.HEMLOCK_SAPLING));

        PlacementUtils.register(context, LARCH, larch, filteredByBlockSurvival(AWRBlocks.LARCH_SAPLING));
        PlacementUtils.register(context, LARCH_FANCY, larchFancy, filteredByBlockSurvival(AWRBlocks.LARCH_SAPLING));

        PlacementUtils.register(context, PINE, pine, filteredByBlockSurvival(AWRBlocks.PINE_SAPLING));
        PlacementUtils.register(context, PINE_FANCY, pineFancy, filteredByBlockSurvival(AWRBlocks.PINE_SAPLING));
        PlacementUtils.register(context, PINE_TOP, pineTop, filteredByBlockSurvival(AWRBlocks.PINE_SAPLING));
        PlacementUtils.register(context, PINE_MEGA, pineMega, filteredByBlockSurvival(AWRBlocks.PINE_SAPLING));
        PlacementUtils.register(context, PINE_TOP_MEGA, pineTopMega, filteredByBlockSurvival(AWRBlocks.PINE_SAPLING));
        
        PlacementUtils.register(context, PINE_PINECONES, pinePinecones, filteredByBlockSurvival(AWRBlocks.PINE_SAPLING));
        PlacementUtils.register(context, PINE_TOP_PINECONES, pineTopPinecones, filteredByBlockSurvival(AWRBlocks.PINE_SAPLING));
        PlacementUtils.register(context, PINE_FANCY_PINECONES, pineFancyPinecones, filteredByBlockSurvival(AWRBlocks.PINE_SAPLING));
        PlacementUtils.register(context, PINE_MEGA_PINECONES, pineMegaPinecones, filteredByBlockSurvival(AWRBlocks.PINE_SAPLING));
        PlacementUtils.register(context, PINE_TOP_MEGA_PINECONES, pineTopMegaPinecones, filteredByBlockSurvival(AWRBlocks.PINE_SAPLING));

        PlacementUtils.register(context, REDWOOD, redwood, filteredByBlockSurvival(AWRBlocks.REDWOOD_SAPLING));

        PlacementUtils.register(context, SEQUOIA, sequoia, filteredByBlockSurvival(AWRBlocks.SEQUOIA_SAPLING));

        PlacementUtils.register(context, SPRUCE, spruce, filteredByBlockSurvival(Blocks.SPRUCE_SAPLING));
        PlacementUtils.register(context, SPRUCE_FANCY, spruceFancy, filteredByBlockSurvival(Blocks.SPRUCE_SAPLING));
        PlacementUtils.register(context, SPRUCE_TOP, spruceTop, filteredByBlockSurvival(Blocks.SPRUCE_SAPLING));
        PlacementUtils.register(context, SPRUCE_MEGA, spruceMega, filteredByBlockSurvival(Blocks.SPRUCE_SAPLING));
        PlacementUtils.register(context, SPRUCE_TOP_MEGA, spruceTopMega, filteredByBlockSurvival(Blocks.SPRUCE_SAPLING));
        
        PlacementUtils.register(context, SPRUCE_PINECONES, sprucePinecones, filteredByBlockSurvival(Blocks.SPRUCE_SAPLING));
        PlacementUtils.register(context, SPRUCE_TOP_PINECONES, spruceTopPinecones, filteredByBlockSurvival(Blocks.SPRUCE_SAPLING));
        PlacementUtils.register(context, SPRUCE_FANCY_PINECONES, spruceFancyPinecones, filteredByBlockSurvival(Blocks.SPRUCE_SAPLING));
        PlacementUtils.register(context, SPRUCE_MEGA_PINECONES, spruceMegaPinecones, filteredByBlockSurvival(Blocks.SPRUCE_SAPLING));
        PlacementUtils.register(context, SPRUCE_TOP_MEGA_PINECONES, spruceTopMegaPinecones, filteredByBlockSurvival(Blocks.SPRUCE_SAPLING));


        PlacementUtils.register(context, FALLEN_FIR, fallenFir, filteredByBlockSurvival(AWRBlocks.FIR_SAPLING));
        PlacementUtils.register(context, FALLEN_LARCH, fallenLarch, filteredByBlockSurvival(AWRBlocks.LARCH_SAPLING));
        PlacementUtils.register(context, FALLEN_PINE, fallenPine, filteredByBlockSurvival(AWRBlocks.PINE_SAPLING));
    }
}
