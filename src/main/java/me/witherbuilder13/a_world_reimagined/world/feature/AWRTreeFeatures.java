package me.witherbuilder13.a_world_reimagined.world.feature;

import me.witherbuilder13.advanced_tree_config.feature.AdvancedTreeFeature;
import me.witherbuilder13.advanced_tree_config.feature.util.Branch;
import me.witherbuilder13.advanced_tree_config.feature.util.BranchShape;
import me.witherbuilder13.advanced_tree_config.util.blockvector.SimpleBlockVector;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
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
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.GiantTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

import java.util.List;

import static me.witherbuilder13.a_world_reimagined.block.AWRBlocks.*;
import static net.minecraft.world.level.block.Blocks.SPRUCE_LEAVES;
import static net.minecraft.world.level.block.Blocks.SPRUCE_LOG;

public class AWRTreeFeatures {
    
    public static final ResourceKey<Feature> CEDAR = AWRFeatureUtils.of("cedar");
    public static final ResourceKey<Feature> CEDAR_CANOPY = AWRFeatureUtils.of("cedar_canopy");
    public static final ResourceKey<Feature> CEDAR_FANCY = AWRFeatureUtils.of("cedar_fancy");

    public static final ResourceKey<Feature> FIR = AWRFeatureUtils.of("fir");
    public static final ResourceKey<Feature> FIR_FANCY = AWRFeatureUtils.of("fir_fancy");
    public static final ResourceKey<Feature> FIR_MEGA = AWRFeatureUtils.of("fir_mega");

    public static final ResourceKey<Feature> HEMLOCK = AWRFeatureUtils.of("hemlock");
    public static final ResourceKey<Feature> HEMLOCK_FANCY = AWRFeatureUtils.of("hemlock_fancy");

    public static final ResourceKey<Feature> LARCH = AWRFeatureUtils.of("larch");
    public static final ResourceKey<Feature> LARCH_FANCY = AWRFeatureUtils.of("larch_fancy");

    public static final ResourceKey<Feature> PINE = AWRFeatureUtils.of("pine");
    public static final ResourceKey<Feature> PINE_FANCY = AWRFeatureUtils.of("pine_fancy");
    public static final ResourceKey<Feature> PINE_TOP = AWRFeatureUtils.of("pine_top");
    public static final ResourceKey<Feature> PINE_MEGA = AWRFeatureUtils.of("pine_mega");
    public static final ResourceKey<Feature> PINE_TOP_MEGA = AWRFeatureUtils.of("pine_top_mega");

    public static final ResourceKey<Feature> REDWOOD = AWRFeatureUtils.of("redwood");

    public static final ResourceKey<Feature> SEQUOIA = AWRFeatureUtils.of("sequoia");

    public static final ResourceKey<Feature> SPRUCE_FANCY = AWRFeatureUtils.of("spruce_fancy");


    public static final ResourceKey<Feature> FALLEN_FIR = AWRFeatureUtils.of("fallen_fir");
    public static final ResourceKey<Feature> FALLEN_LARCH = AWRFeatureUtils.of("fallen_larch");
    public static final ResourceKey<Feature> FALLEN_PINE = AWRFeatureUtils.of("fallen_pine");

    public static void bootstrap(BootstrapContext<Feature> context) {

        HolderGetter<Biome> biomes = context.lookup(Registries.BIOME);
        HolderGetter<Block> blocks = context.lookup(Registries.BLOCK);
        BlockStateProvider belowTrunkProvider = TreeFeature.defaultPlaceBelowTreeTrunkProvider(biomes);

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
                        12, 7, 2,
                        UniformInt.of(2, 3), UniformInt.of(0, 2), UniformInt.of(4, 5),
                        belowTrunkProvider
                ).build()
        );
        context.register(
                FIR_FANCY,
                coniferFancy(
                        FIR_LOG, FIR_LEAVES,
                        12, 7, 2,
                        UniformInt.of(0, 1), UniformInt.of(0, 2), UniformInt.of(4, 6),
                        belowTrunkProvider
                ).build()
        );
        context.register(
                FIR_MEGA,
                megaConifer(
                        FIR_LOG, FIR_LEAVES,
                        23, 6, 12,
                        ConstantInt.of(0), ConstantInt.of(1), UniformInt.of(17, 24),
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
                        5, 2, 1,
                        UniformInt.of(2, 3), UniformInt.of(0, 2), UniformInt.of(1, 2),
                        belowTrunkProvider
                ).build()
        );
        context.register(
                PINE_FANCY,
                coniferFancy(
                        PINE_LOG, PINE_LEAVES,
                        5, 2, 1,
                        UniformInt.of(0, 1), UniformInt.of(0, 2), UniformInt.of(3, 4),
                        belowTrunkProvider
                ).build()
        );
        context.register(
                PINE_TOP,
                conifer(
                        true, PINE_LOG, PINE_LEAVES,
                        5, 2, 1,
                        UniformInt.of(1, 2), ConstantInt.of(1), UniformInt.of(3, 4),
                        belowTrunkProvider
                ).build()
        );
        context.register(
                PINE_MEGA,
                megaConifer(
                        PINE_LOG, PINE_LEAVES,
                        13, 2, 14,
                        ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(13, 17),
                        belowTrunkProvider
                ).build()
        );
        context.register(
                PINE_TOP_MEGA,
                megaConifer(
                        PINE_LOG, PINE_LEAVES,
                        13, 2, 14,
                        ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(3, 7),
                        belowTrunkProvider
                ).build()
        );

        context.register(
                REDWOOD,
                redwood()
        );

        context.register(
                SEQUOIA,
                sequoia()
        );

        context.register(
                SPRUCE_FANCY,
                coniferFancy(
                        SPRUCE_LOG, SPRUCE_LEAVES,
                        5, 2, 1,
                        UniformInt.of(0, 1), UniformInt.of(0, 2), UniformInt.of(3, 4),
                        belowTrunkProvider
                ).build()
        );


        context.register(
                FALLEN_FIR,
                fallenTree(FIR_LOG, 7, 11).logDecorator(
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
                new TwoLayersFeatureSize(1, 0, 1),
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

    private static AdvancedTreeFeature redwood() {
        return new AdvancedTreeFeature(
                List.of(
                        Branch.Group.create(
                                new Branch(1, 0, 1, BlockStateProvider.simple(REDWOOD_LOG), Holder.direct(
                                        Branch.Config.builder(SimpleBlockVector.of().lengthY(UniformInt.of(24, 36)))
                                                .thicknessX(ConstantInt.of(3))
                                                .thicknessZ(ConstantInt.of(3))
                                                .build()
                                ))
                        ),
                        Branch.Group.create(
                                new Branch(2, 1, 2, BlockStateProvider.simple(REDWOOD_LOG), Holder.direct(
                                        Branch.Config.builder(SimpleBlockVector.of().lengthY(UniformInt.of(16, 24)))
                                                .thicknessX(ConstantInt.of(3))
                                                .thicknessZ(ConstantInt.of(3))
                                                .shape(BranchShape.SQUARE_CUT_CORNERS)
                                                .build()
                                ))
                        )
                )
        );
    }

    private static AdvancedTreeFeature sequoia() {
        return  new AdvancedTreeFeature(
                List.of(
                        Branch.Group.create(
                                new Branch(1, 0, 1, BlockStateProvider.simple(SEQUOIA_LOG), Holder.direct(
                                        Branch.Config.builder(SimpleBlockVector.of().lengthY(UniformInt.of(24, 36)))
                                                .thicknessX(ConstantInt.of(4))
                                                .thicknessZ(ConstantInt.of(4))
                                                .shape(BranchShape.SQUARE_CUT_CORNERS)
                                                .build()
                                ))
                        ),
                        Branch.Group.create(
                                new Branch(2, 1, 2, BlockStateProvider.simple(SEQUOIA_LOG), Holder.direct(
                                        Branch.Config.builder(SimpleBlockVector.of().lengthY(UniformInt.of(8, 16)))
                                                .thicknessX(ConstantInt.of(2))
                                                .thicknessZ(ConstantInt.of(2))
                                                .build()
                                ))
                        )
                )
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
