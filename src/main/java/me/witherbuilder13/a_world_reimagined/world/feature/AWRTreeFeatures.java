package me.witherbuilder13.a_world_reimagined.world.feature;

import me.witherbuilder13.a_world_reimagined.world.feature.trunkplacer.ExtraGiantTrunkPlacer;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.random.WeightedList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.FallenTreeFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.TreeFeature;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.DarkOakFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.MegaPineFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.PineFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.SpruceFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.AttachedToLogsDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.PlaceOnGroundDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.GiantTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

import java.util.List;

import static me.witherbuilder13.a_world_reimagined.block.AWRBlocks.*;
import static net.minecraft.world.level.block.Blocks.SPRUCE_LEAVES;
import static net.minecraft.world.level.block.Blocks.SPRUCE_LOG;

public class AWRTreeFeatures {
    
    public static final ResourceKey<Feature> ASPEN = AWRFeatureUtils.of("aspen");
    
    public static final ResourceKey<Feature> CEDAR = AWRFeatureUtils.of("cedar");
    public static final ResourceKey<Feature> CEDAR_CANOPY = AWRFeatureUtils.of("cedar_canopy");
    public static final ResourceKey<Feature> CEDAR_FANCY = AWRFeatureUtils.of("cedar_fancy");

    public static final ResourceKey<Feature> FIR = AWRFeatureUtils.of("fir");
    public static final ResourceKey<Feature> FIR_TOP = AWRFeatureUtils.of("fir_top");
    public static final ResourceKey<Feature> FIR_FANCY = AWRFeatureUtils.of("fir_fancy");
    public static final ResourceKey<Feature> FIR_MEGA = AWRFeatureUtils.of("fir_mega");
    public static final ResourceKey<Feature> FIR_TOP_MEGA = AWRFeatureUtils.of("fir_top_mega");

    public static final ResourceKey<Feature> HEMLOCK = AWRFeatureUtils.of("hemlock");
    public static final ResourceKey<Feature> HEMLOCK_FANCY = AWRFeatureUtils.of("hemlock_fancy");

    public static final ResourceKey<Feature> LARCH = AWRFeatureUtils.of("larch");
    public static final ResourceKey<Feature> LARCH_FANCY = AWRFeatureUtils.of("larch_fancy");

    public static final ResourceKey<Feature> PINE = AWRFeatureUtils.of("pine");
    public static final ResourceKey<Feature> PINE_TOP = AWRFeatureUtils.of("pine_top");
    public static final ResourceKey<Feature> PINE_FANCY = AWRFeatureUtils.of("pine_fancy");
    public static final ResourceKey<Feature> PINE_MEGA = AWRFeatureUtils.of("pine_mega");
    public static final ResourceKey<Feature> PINE_TOP_MEGA = AWRFeatureUtils.of("pine_top_mega");
    
    public static final ResourceKey<Feature> PINE_PINECONES = AWRFeatureUtils.of("pine_pinecones");
    public static final ResourceKey<Feature> PINE_TOP_PINECONES = AWRFeatureUtils.of("pine_top_pinecones");
    public static final ResourceKey<Feature> PINE_FANCY_PINECONES = AWRFeatureUtils.of("pine_fancy_pinecones");
    public static final ResourceKey<Feature> PINE_MEGA_PINECONES = AWRFeatureUtils.of("pine_mega_pinecones");
    public static final ResourceKey<Feature> PINE_TOP_MEGA_PINECONES = AWRFeatureUtils.of("pine_top_mega_pinecones");

    public static final ResourceKey<Feature> REDWOOD = AWRFeatureUtils.of("redwood");

    public static final ResourceKey<Feature> SEQUOIA = AWRFeatureUtils.of("sequoia");

    public static final ResourceKey<Feature> SPRUCE = AWRFeatureUtils.of("spruce");
    public static final ResourceKey<Feature> SPRUCE_TOP = AWRFeatureUtils.of("spruce_top");
    public static final ResourceKey<Feature> SPRUCE_FANCY = AWRFeatureUtils.of("spruce_fancy");
    public static final ResourceKey<Feature> SPRUCE_MEGA = AWRFeatureUtils.of("spruce_mega");
    public static final ResourceKey<Feature> SPRUCE_TOP_MEGA = AWRFeatureUtils.of("spruce_top_mega");
    
    public static final ResourceKey<Feature> SPRUCE_PINECONES = AWRFeatureUtils.of("spruce_pinecones");
    public static final ResourceKey<Feature> SPRUCE_TOP_PINECONES = AWRFeatureUtils.of("spruce_top_pinecones");
    public static final ResourceKey<Feature> SPRUCE_FANCY_PINECONES = AWRFeatureUtils.of("spruce_fancy_pinecones");
    public static final ResourceKey<Feature> SPRUCE_MEGA_PINECONES = AWRFeatureUtils.of("spruce_mega_pinecones");
    public static final ResourceKey<Feature> SPRUCE_TOP_MEGA_PINECONES = AWRFeatureUtils.of("spruce_top_mega_pinecones");


    public static final ResourceKey<Feature> FALLEN_FIR = AWRFeatureUtils.of("fallen_fir");
    public static final ResourceKey<Feature> FALLEN_LARCH = AWRFeatureUtils.of("fallen_larch");
    public static final ResourceKey<Feature> FALLEN_PINE = AWRFeatureUtils.of("fallen_pine");
    
    //` ------------------------------------------------------------------------------------------------------------

    public static void bootstrap(BootstrapContext<Feature> context) {

        HolderGetter<Biome> biomes = context.lookup(Registries.BIOME);
        HolderGetter<Block> blocks = context.lookup(Registries.BLOCK);
        BlockStateProvider belowTrunkProvider = TreeFeature.defaultPlaceBelowTreeTrunkProvider(biomes);
        
        PlaceOnGroundDecorator sparsePinecones = new PlaceOnGroundDecorator(
                96, 4, 2, new WeightedStateProvider(AWRVegetationFeatures.pineconesPatchBuilder(1, 3))
        );
        PlaceOnGroundDecorator thickPinecones = new PlaceOnGroundDecorator(
                150, 2, 2, new WeightedStateProvider(AWRVegetationFeatures.pineconesPatchBuilder(1, 4))
        );

        context.register(
                ASPEN,
                conifer(
                        true, ASPEN_LOG, ASPEN_LEAVES,
                        7, 3, 1,
                        ConstantInt.of(2), UniformInt.of(0, 1), UniformInt.of(1, 2),
                        belowTrunkProvider
                ).build()
        );
        
        context.register(
                CEDAR,
                conifer(
                        false, CEDAR_LOG, CEDAR_LEAVES,
                        7, 3, 1,
                        UniformInt.of(2, 3), UniformInt.of(0, 2), UniformInt.of(1, 2),
                        belowTrunkProvider
                ).build()
        );
        context.register(
                CEDAR_CANOPY,
                smallFlat(CEDAR_LOG, CEDAR_LEAVES, 5, belowTrunkProvider).build()
        );
        context.register(
                CEDAR_FANCY,
                coniferFancy(
                        CEDAR_LOG, CEDAR_LEAVES,
                        7, 3, 1,
                        UniformInt.of(0, 1), UniformInt.of(0, 2), UniformInt.of(4, 6),
                        belowTrunkProvider
                ).build()
        );

        context.register(
                FIR,
                conifer(
                        false, FIR_LOG, FIR_LEAVES,
                        10, 2, 6,
                        ConstantInt.of(2), UniformInt.of(0, 2), UniformInt.of(3, 7),
                        belowTrunkProvider
                ).build()
        );
        context.register(
                FIR_TOP,
                conifer(
                        true, FIR_LOG, FIR_LEAVES,
                        7, 2, 4,
                        UniformInt.of(2, 3), UniformInt.of(0, 1), UniformInt.of(3, 4),
                        belowTrunkProvider
                ).build()
        );
        context.register(
                FIR_FANCY,
                coniferFancy(
                        FIR_LOG, FIR_LEAVES,
                        15, 2, 5,
                        UniformInt.of(1, 1), UniformInt.of(2, 4), UniformInt.of(9, 17),
                        belowTrunkProvider
                ).build()
        );
        context.register(
                FIR_MEGA,
                megaConifer(
                        FIR_LOG, FIR_LEAVES,
                        26, 2, 13,
                        ConstantInt.of(0), UniformInt.of(0, 2), UniformInt.of(18, 22),
                        belowTrunkProvider
                ).build()
        );
        context.register(
                FIR_TOP_MEGA,
                megaConifer(
                        FIR_LOG, FIR_LEAVES,
                        22, 2, 9,
                        ConstantInt.of(0), UniformInt.of(0, 2), UniformInt.of(5, 9),
                        belowTrunkProvider
                ).build()
        );

        context.register(
                HEMLOCK,
                conifer(
                        false, HEMLOCK_LOG, HEMLOCK_LEAVES,
                        8, 2, 1,
                        UniformInt.of(2, 3), UniformInt.of(0, 2), UniformInt.of(3, 4),
                        belowTrunkProvider
                ).build()
        );
        context.register(
                HEMLOCK_FANCY,
                coniferFancy(
                        HEMLOCK_LOG, HEMLOCK_LEAVES,
                        8, 2, 1,
                        UniformInt.of(0, 1), UniformInt.of(0, 2), UniformInt.of(3, 4),
                        belowTrunkProvider
                ).build()
        );

        context.register(
                LARCH,
                conifer(
                        false, LARCH_LOG, LARCH_LEAVES,
                        6, 2, 1,
                        UniformInt.of(2, 3), UniformInt.of(0, 2), UniformInt.of(1, 2),
                        belowTrunkProvider
                ).build()
        );
        context.register(
                LARCH_FANCY,
                coniferFancy(
                        LARCH_LOG, LARCH_LEAVES,
                        6, 2, 1,
                        UniformInt.of(0, 1), UniformInt.of(0, 2), UniformInt.of(3, 4),
                        belowTrunkProvider
                ).build()
        );

        context.register(
                PINE,
                conifer(
                        false, PINE_LOG, PINE_LEAVES,
                        9, 2, 4,
                        UniformInt.of(2, 3), UniformInt.of(0, 2), UniformInt.of(3, 7),
                        belowTrunkProvider
                ).build()
        );
        context.register(
                PINE_TOP,
                conifer(
                        true, PINE_LOG, PINE_LEAVES,
                        9, 2, 4,
                        UniformInt.of(2, 3), UniformInt.of(0, 1), UniformInt.of(3, 4),
                        belowTrunkProvider
                ).build()
        );
        context.register(
                PINE_FANCY,
                coniferFancy(
                        PINE_LOG, PINE_LEAVES,
                        13, 2, 4,
                        UniformInt.of(1, 2), UniformInt.of(2, 4), UniformInt.of(9, 15),
                        belowTrunkProvider
                ).build()
        );
        context.register(
                PINE_MEGA,
                megaConifer(
                        PINE_LOG, PINE_LEAVES,
                        25, 2, 12,
                        ConstantInt.of(0), UniformInt.of(0, 2), UniformInt.of(17, 21),
                        belowTrunkProvider
                ).build()
        );
        context.register(
                PINE_TOP_MEGA,
                megaConifer(
                        PINE_LOG, PINE_LEAVES,
                        20, 2, 7,
                        ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(5, 9),
                        belowTrunkProvider
                ).build()
        );
        
        context.register(
                PINE_PINECONES,
                conifer(
                        false, PINE_LOG, PINE_LEAVES,
                        9, 2, 4,
                        UniformInt.of(2, 3), UniformInt.of(0, 2), UniformInt.of(3, 7),
                        belowTrunkProvider
                ).decorators(List.of(
                        sparsePinecones, thickPinecones
                )).build()
        );
        context.register(
                PINE_TOP_PINECONES,
                conifer(
                        true, PINE_LOG, PINE_LEAVES,
                        9, 2, 4,
                        UniformInt.of(2, 3), UniformInt.of(0, 1), UniformInt.of(3, 4),
                        belowTrunkProvider
                ).decorators(List.of(
                        sparsePinecones, thickPinecones
                )).build()
        );
        context.register(
                PINE_FANCY_PINECONES,
                coniferFancy(
                        PINE_LOG, PINE_LEAVES,
                        13, 2, 4,
                        UniformInt.of(1, 2), UniformInt.of(2, 4), UniformInt.of(9, 15),
                        belowTrunkProvider
                ).decorators(List.of(
                        sparsePinecones, thickPinecones
                )).build()
        );
        context.register(
                PINE_MEGA_PINECONES,
                megaConifer(
                        PINE_LOG, PINE_LEAVES,
                        25, 2, 12,
                        ConstantInt.of(0), UniformInt.of(0, 2), UniformInt.of(17, 21),
                        belowTrunkProvider
                ).decorators(List.of(
                        sparsePinecones, thickPinecones
                )).build()
        );
        context.register(
                PINE_TOP_MEGA_PINECONES,
                megaConifer(
                        PINE_LOG, PINE_LEAVES,
                        20, 2, 7,
                        ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(5, 9),
                        belowTrunkProvider
                ).decorators(List.of(
                        sparsePinecones, thickPinecones
                )).build()
        );

        context.register(
                REDWOOD,
                extraGiant(
                        REDWOOD_LOG, REDWOOD_LEAVES,
                        32, 16, 24,
                        ConstantInt.of(3), UniformInt.of(24, 32), false,
                        belowTrunkProvider
                ).build()
        );

        context.register(
                SEQUOIA,
                extraGiant(
                        SEQUOIA_LOG, SEQUOIA_LEAVES,
                        32, 8, 16,
                        ConstantInt.of(4), UniformInt.of(16, 24), true,
                        belowTrunkProvider
                ).build()
        );

        context.register(
                SPRUCE,
                conifer(
                        false, SPRUCE_LOG, SPRUCE_LEAVES,
                        9, 2, 5,
                        ConstantInt.of(2), UniformInt.of(0, 2), UniformInt.of(3, 7),
                        belowTrunkProvider
                ).build()
        );
        context.register(
                SPRUCE_TOP,
                conifer(
                        true, SPRUCE_LOG, SPRUCE_LEAVES,
                        7, 1, 3,
                        UniformInt.of(2, 3), UniformInt.of(0, 1), UniformInt.of(3, 4),
                        belowTrunkProvider
                ).build()
        );
        context.register(
                SPRUCE_FANCY,
                coniferFancy(
                        SPRUCE_LOG, SPRUCE_LEAVES,
                        15, 2, 5,
                        ConstantInt.of(1), UniformInt.of(2, 4), UniformInt.of(9, 17),
                        belowTrunkProvider
                ).build()
        );
        context.register(
                SPRUCE_MEGA,
                megaConifer(
                        SPRUCE_LOG, SPRUCE_LEAVES,
                        25, 2, 12,
                        ConstantInt.of(0), UniformInt.of(0, 2), UniformInt.of(17, 21),
                        belowTrunkProvider
                ).build()
        );
        context.register(
                SPRUCE_TOP_MEGA,
                megaConifer(
                        SPRUCE_LOG, SPRUCE_LEAVES,
                        21, 2, 8,
                        ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(5, 9),
                        belowTrunkProvider
                ).build()
        );
        
        context.register(
                SPRUCE_PINECONES,
                conifer(
                        false, SPRUCE_LOG, SPRUCE_LEAVES,
                        9, 2, 5,
                        ConstantInt.of(2), UniformInt.of(0, 2), UniformInt.of(3, 7),
                        belowTrunkProvider
                ).build()
        );
        context.register(
                SPRUCE_TOP_PINECONES,
                conifer(
                        true, SPRUCE_LOG, SPRUCE_LEAVES,
                        7, 1, 3,
                        UniformInt.of(2, 3), UniformInt.of(0, 1), UniformInt.of(3, 4),
                        belowTrunkProvider
                ).build()
        );
        context.register(
                SPRUCE_FANCY_PINECONES,
                coniferFancy(
                        SPRUCE_LOG, SPRUCE_LEAVES,
                        15, 2, 5,
                        ConstantInt.of(1), UniformInt.of(2, 4), UniformInt.of(9, 17),
                        belowTrunkProvider
                ).build()
        );
        context.register(
                SPRUCE_MEGA_PINECONES,
                megaConifer(
                        SPRUCE_LOG, SPRUCE_LEAVES,
                        25, 2, 12,
                        ConstantInt.of(0), UniformInt.of(0, 2), UniformInt.of(17, 21),
                        belowTrunkProvider
                ).build()
        );
        context.register(
                SPRUCE_TOP_MEGA_PINECONES,
                megaConifer(
                        SPRUCE_LOG, SPRUCE_LEAVES,
                        21, 2, 8,
                        ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(5, 9),
                        belowTrunkProvider
                ).build()
        );


        context.register(
                FALLEN_FIR,
                fallenTree(FIR_LOG, 5, 10).logDecorator(
                        basicMushrooms(0.1F, 1, 1)
                ).build()
        );
        context.register(
                FALLEN_LARCH,
                fallenTree(LARCH_LOG, 3, 7).build()
        );
        context.register(
                FALLEN_PINE,
                fallenTree(PINE_LOG, 5, 9).logDecorator(
                        basicMushrooms(0.1F, 1, 1)
                ).build()
        );
    }
    
    //` -------------------------------------------------------------------------------------------

    private static TreeFeature.Builder conifer(
            boolean top,
            Block log,
            Block leaves,
            int baseHeight,
            int heightRandA,
            int heightRandB,
            IntProvider radius,
            IntProvider offset,
            IntProvider trunkHeightOrFoliageHeightIfTop,
            final BlockStateProvider belowTrunkProvider
    ) {
        return new TreeFeature.Builder(
                BlockStateProvider.simple(log),
                new StraightTrunkPlacer(baseHeight, heightRandA, heightRandB),
                BlockStateProvider.simple(leaves),
                top ? new PineFoliagePlacer(radius, offset, trunkHeightOrFoliageHeightIfTop) : new SpruceFoliagePlacer(radius, offset, trunkHeightOrFoliageHeightIfTop),
                new TwoLayersFeatureSize(1, 0, 1),
                belowTrunkProvider
        );
    }

    private static TreeFeature.Builder coniferFancy(
            Block log,
            Block leaves,
            int baseHeight,
            int heightRandA,
            int heightRandB,
            IntProvider radius,
            IntProvider offset,
            IntProvider crownHeight,
            final BlockStateProvider belowTrunkProvider
    ) {
        return new TreeFeature.Builder(
                BlockStateProvider.simple(log),
                new StraightTrunkPlacer(baseHeight, heightRandA, heightRandB),
                BlockStateProvider.simple(leaves),
                new MegaPineFoliagePlacer(radius, offset, crownHeight),
                new TwoLayersFeatureSize(1, 0, 1),
                belowTrunkProvider
        );
    }

    private static TreeFeature.Builder megaConifer(
            Block log,
            Block leaves,
            int baseHeight,
            int heightRandA,
            int heightRandB,
            IntProvider radius,
            IntProvider offset,
            IntProvider crownHeight,
            final BlockStateProvider belowTrunkProvider
    ) {
        return new TreeFeature.Builder(
                BlockStateProvider.simple(log),
                new GiantTrunkPlacer(baseHeight, heightRandA, heightRandB),
                BlockStateProvider.simple(leaves),
                new MegaPineFoliagePlacer(radius, offset, crownHeight),
                new TwoLayersFeatureSize(1, 1, 2),
                belowTrunkProvider
        );
    }

    private static TreeFeature.Builder smallFlat(
            Block log,
            Block leaves,
            int baseHeight,
            final BlockStateProvider belowTrunkProvider
    ) {
        return new TreeFeature.Builder(
                BlockStateProvider.simple(log),
                new ForkingTrunkPlacer(baseHeight, 1, 2),
                BlockStateProvider.simple(leaves),
                new DarkOakFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),
                new TwoLayersFeatureSize(1, 0, 1),
                belowTrunkProvider
        );
    }
    
    private static TreeFeature.Builder extraGiant(
            Block log,
            Block leaves,
            int baseHeight,
            int heightRandA,
            int heightRandB,
            IntProvider diameter,
            IntProvider thinHeight,
            boolean cutCorners,
            final BlockStateProvider belowTrunkProvider
    ) {
        return new TreeFeature.Builder(
                BlockStateProvider.simple(log),
                new ExtraGiantTrunkPlacer(baseHeight, heightRandA, heightRandB, diameter, thinHeight, cutCorners),
                BlockStateProvider.simple(leaves),
                new MegaPineFoliagePlacer(diameter, ConstantInt.of(0), UniformInt.of(20, 24)),
                new TwoLayersFeatureSize(1, 2, 3),
                belowTrunkProvider
        );
    }


    private static FallenTreeFeature.Builder fallenTree(final Block logBlock, final int minLength, final int maxLength) {
        return new FallenTreeFeature.Builder(
                BlockStateProvider.simple(logBlock),
                UniformInt.of(minLength, maxLength)
        );
    }

    private static TreeDecorator basicMushrooms(float probability, int redWeight, int brownWeight) {
        return new AttachedToLogsDecorator(
                probability,
                new WeightedStateProvider(
                        WeightedList.<BlockState>builder()
                                .add(Blocks.RED_MUSHROOM.defaultBlockState(), redWeight)
                                .add(Blocks.BROWN_MUSHROOM.defaultBlockState(), brownWeight)
                ),
                List.of(Direction.UP)
        );
    }
}
