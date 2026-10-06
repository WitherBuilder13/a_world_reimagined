package me.witherbuilder13.a_world_reimagined.block.util;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.util.random.WeightedList;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.TreeFeature;

import java.util.Map;
import java.util.OptionalInt;

public class GiantTreeGrower {
    private static final Map<String, GiantTreeGrower> GROWERS = new Object2ObjectArrayMap<>();
    public static final Codec<GiantTreeGrower> CODEC = Codec.stringResolver(generator -> generator.name, GROWERS::get);

    // ` ---------------------------------------------------------------------------------------------------------------------------------------------------

    private final String name;
    private final WeightedList<ResourceKey<Feature>> redwoodTrees;
    private final WeightedList<ResourceKey<Feature>> sequoiaTrees;
    private final ResourceKey<Feature> shortestTree;

    public GiantTreeGrower(
            String name,
            WeightedList<ResourceKey<Feature>> redwoodTrees,
            WeightedList<ResourceKey<Feature>> sequoiaTrees,
            ResourceKey<Feature> shortestTree
    ) {
        this.name = name;
        this.redwoodTrees = redwoodTrees;
        this.sequoiaTrees = sequoiaTrees;
        this.shortestTree = shortestTree;
        GROWERS.put(name, this);
    }

    // ` ---------------------------------------------------------------------------------------------------------------------------------------------------

    public boolean growTree(final ServerLevel level, final ChunkGenerator generator, final BlockPos pos, final BlockState state, final RandomSource random) {
        ResourceKey<Feature> redwoodKey = this.redwoodTrees.getRandom(random).orElse(null);
        ResourceKey<Feature> sequoiaKey = this.sequoiaTrees.getRandom(random).orElse(null);

        if (redwoodKey != null) {
            Holder<Feature> featureHolder = level.registryAccess().lookupOrThrow(Registries.FEATURE).get(redwoodKey).orElse(null);

            for (int dx = -1; dx <= 1; dx++) {
                for (int dz = -1; dz <= 1; dz++) {
                    if (is3x3Sapling(state, level, pos, dx, dz)) {
                        Feature feature = featureHolder.value();
                        BlockState air = Blocks.AIR.defaultBlockState();

                        //'   1  6 2 7
                        //'   0  3 1 4
                        //'  -1  8 5 9
                        //' Z/X -1 0 1

                        level.setBlock(pos.offset(dx, 0, dz), air, 260);
                        level.setBlock(pos.offset(dx, 0, dz + 1), air, 260);
                        level.setBlock(pos.offset(dx - 1, 0, dz), air, 260);
                        level.setBlock(pos.offset(dx + 1, 0, dz), air, 260);
                        level.setBlock(pos.offset(dx, 0, dz - 1), air, 260);
                        level.setBlock(pos.offset(dx - 1, 0, dz + 1), air, 260);
                        level.setBlock(pos.offset(dx + 1, 0, dz + 1), air, 260);
                        level.setBlock(pos.offset(dx - 1, 0, dz - 1), air, 260);
                        level.setBlock(pos.offset(dx + 1, 0, dz - 1), air, 260);
                        if (feature.place(level, generator, random, pos.offset(dx, 0, dz))) {
                            return true;
                        }

                        level.setBlock(pos.offset(dx, 0, dz), state, 260);
                        level.setBlock(pos.offset(dx, 0, dz + 1), state, 260);
                        level.setBlock(pos.offset(dx - 1, 0, dz), state, 260);
                        level.setBlock(pos.offset(dx + 1, 0, dz), state, 260);
                        level.setBlock(pos.offset(dx, 0, dz - 1), state, 260);
                        level.setBlock(pos.offset(dx - 1, 0, dz + 1), state, 260);
                        level.setBlock(pos.offset(dx + 1, 0, dz + 1), state, 260);
                        level.setBlock(pos.offset(dx - 1, 0, dz - 1), state, 260);
                        level.setBlock(pos.offset(dx + 1, 0, dz - 1), state, 260);
                        return false;
                    }
                }
            }
        } else if (sequoiaKey != null) {
            Holder<Feature> featureHolder = level.registryAccess().lookupOrThrow(Registries.FEATURE).get(sequoiaKey).orElse(null);

            for (int dx = -1; dx <= 2; dx++) {
                for (int dz = -1; dz <= 2; dz++) {
                    if (is4x4RoundSapling(state, level, pos, dx, dz)) {
                        Feature feature = featureHolder.value();
                        BlockState air = Blocks.AIR.defaultBlockState();

                        //'   2      5  6
                        //'   1   9  2  4  7
                        //'   0  10  1  3  8
                        //'  -1     11 12
                        //' Z/X  -1  0  1  2

                        level.setBlock(pos.offset(dx, 0, dz), air, 260);
                        level.setBlock(pos.offset(dx, 0, dz + 1), air, 260);
                        level.setBlock(pos.offset(dx + 1, 0, dz), air, 260);
                        level.setBlock(pos.offset(dx + 1, 0, dz + 1), air, 260);
                        level.setBlock(pos.offset(dx, 0, dz + 2), air, 260);
                        level.setBlock(pos.offset(dx + 1, 0, dz + 2), air, 260);
                        level.setBlock(pos.offset(dx + 2, 0, dz + 1), air, 260);
                        level.setBlock(pos.offset(dx + 2, 0, dz), air, 260);
                        level.setBlock(pos.offset(dx - 1, 0, dz + 1), air, 260);
                        level.setBlock(pos.offset(dx - 1, 0, dz), air, 260);
                        level.setBlock(pos.offset(dx, 0, dz - 1), air, 260);
                        level.setBlock(pos.offset(dx + 1, 0, dz - 1), air, 260);
                        if (feature.place(level, generator, random, pos.offset(dx, 0, dz))) {
                            return true;
                        }

                        level.setBlock(pos.offset(dx, 0, dz), state, 260);
                        level.setBlock(pos.offset(dx, 0, dz + 1), state, 260);
                        level.setBlock(pos.offset(dx + 1, 0, dz), state, 260);
                        level.setBlock(pos.offset(dx + 1, 0, dz + 1), state, 260);
                        level.setBlock(pos.offset(dx, 0, dz + 2), state, 260);
                        level.setBlock(pos.offset(dx + 1, 0, dz + 2), state, 260);
                        level.setBlock(pos.offset(dx + 2, 0, dz + 1), state, 260);
                        level.setBlock(pos.offset(dx + 2, 0, dz), state, 260);
                        level.setBlock(pos.offset(dx - 1, 0, dz + 1), state, 260);
                        level.setBlock(pos.offset(dx - 1, 0, dz), state, 260);
                        level.setBlock(pos.offset(dx, 0, dz - 1), state, 260);
                        level.setBlock(pos.offset(dx + 1, 0, dz - 1), state, 260);
                        return false;
                    }
                }
            }
        }
        return false;
    }

    private static boolean is3x3Sapling(BlockState state, BlockGetter level, BlockPos pos, int x, int z) {
        Block block = state.getBlock();

        //'   1  6 2 7
        //'   0  3 1 4
        //'  -1  8 5 9
        //' Z/X -1 0 1

        return level.getBlockState(pos.offset(x, 0, z)).is(block)
                && level.getBlockState(pos.offset(x, 0, z + 1)).is(block)
                && level.getBlockState(pos.offset(x - 1, 0, z)).is(block)
                && level.getBlockState(pos.offset(x + 1, 0, z)).is(block)
                && level.getBlockState(pos.offset(x, 0, z - 1)).is(block)
                && level.getBlockState(pos.offset(x - 1, 0, z + 1)).is(block)
                && level.getBlockState(pos.offset(x + 1, 0, z + 1)).is(block)
                && level.getBlockState(pos.offset(x - 1, 0, z - 1)).is(block)
                && level.getBlockState(pos.offset(x + 1, 0, z - 1)).is(block);
    }

    private static boolean is4x4RoundSapling(BlockState state, BlockGetter level, BlockPos pos, int x, int z) {
        Block block = state.getBlock();

        //'   2      5  6
        //'   1   9  2  4  7
        //'   0  10  1  3  8
        //'  -1     11 12
        //' Z/X  -1  0  1  2

        return level.getBlockState(pos.offset(x, 0, z)).is(block)
                && level.getBlockState(pos.offset(x, 0, z + 1)).is(block)
                && level.getBlockState(pos.offset(x + 1, 0, z)).is(block)
                && level.getBlockState(pos.offset(x + 1, 0, z + 1)).is(block)
                && level.getBlockState(pos.offset(x, 0, z + 2)).is(block)
                && level.getBlockState(pos.offset(x + 1, 0, z + 2)).is(block)
                && level.getBlockState(pos.offset(x + 2, 0, z + 1)).is(block)
                && level.getBlockState(pos.offset(x + 2, 0, z)).is(block)
                && level.getBlockState(pos.offset(x - 1, 0, z + 1)).is(block)
                && level.getBlockState(pos.offset(x - 1, 0, z)).is(block)
                && level.getBlockState(pos.offset(x, 0, z - 1)).is(block)
                && level.getBlockState(pos.offset(x + 1, 0, z - 1)).is(block);
    }

    public OptionalInt getMinimumHeight(final ServerLevel level) {
        ResourceKey<Feature> featureKey = this.shortestTree;
        if (featureKey != null) {
            Holder<Feature> featureHolder = level.registryAccess().lookupOrThrow(Registries.FEATURE).get(featureKey).orElse(null);
            if (featureHolder != null) {
                Object var5 = featureHolder.value();
                if (var5 instanceof TreeFeature treeFeature) {
                    return OptionalInt.of(treeFeature.trunkPlacer().getBaseHeight());
                }
            }

        }
        return OptionalInt.empty();
    }
}
