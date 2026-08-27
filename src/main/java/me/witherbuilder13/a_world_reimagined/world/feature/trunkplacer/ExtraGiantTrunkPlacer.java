package me.witherbuilder13.a_world_reimagined.world.feature.trunkplacer;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import me.witherbuilder13.a_world_reimagined.world.feature.AWRFeatureUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.IntProviders;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.TreeFeature;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

import java.util.List;
import java.util.function.BiConsumer;

public class ExtraGiantTrunkPlacer extends TrunkPlacer {
	
	private final IntProvider thinHeight;
	private final IntProvider diameter;
	private final boolean cutCorners;
	
	public static final MapCodec<ExtraGiantTrunkPlacer> CODEC = RecordCodecBuilder.mapCodec(
			i -> trunkPlacerParts(i)
					.and(IntProviders.codec(3, 5).fieldOf("diameter").forGetter(ExtraGiantTrunkPlacer::diameter))
					.and(IntProviders.NON_NEGATIVE_CODEC.fieldOf("thin_height").forGetter(ExtraGiantTrunkPlacer::thinHeight))
					.and(Codec.BOOL.fieldOf("cut_corners").forGetter(ExtraGiantTrunkPlacer::cutCorners))
					.apply(i, ExtraGiantTrunkPlacer::new)
	);
	
	public ExtraGiantTrunkPlacer(int baseHeight, int heightRandA, int heightRandB, IntProvider diameter, IntProvider thinHeight, boolean cutCorners) {
		super(baseHeight, heightRandA, heightRandB);
		this.diameter = diameter;
		this.thinHeight = thinHeight;
		this.cutCorners = cutCorners;
	}
	
	public IntProvider diameter() {
		return this.diameter;
	}
	
	public IntProvider thinHeight() {
		return this.thinHeight;
	}
	
	public boolean cutCorners() {
		return this.cutCorners;
	}
	
	@Override
	protected TrunkPlacerType<?> type() {
		return AWRFeatureUtils.EXTRA_GIANT_TRUNK_PLACER;
	}
	
	@Override
	public List<FoliagePlacer.FoliageAttachment> placeTrunk(
			final WorldGenLevel level,
			final BiConsumer<BlockPos, BlockState> trunkSetter,
			final RandomSource random,
			final int treeHeight,
			final BlockPos origin,
			final TreeFeature tree
	) {
		int diameter = this.diameter.sample(random);
		BlockPos below = origin.below();
		BlockPos.MutableBlockPos trunkPos = new BlockPos.MutableBlockPos();
		int thinHeight = this.thinHeight.sample(random);
		
		for (int x = diameterMin(diameter); x <= diameterMax(diameter); x++) {
			boolean xEdge = isEdge(x, diameter);
			for (int z = diameterMin(diameter); z <= diameterMax(diameter); z++) {
				boolean zEdge = isEdge(z, diameter);
				boolean isCorner = xEdge && zEdge;
				boolean isEdgeOnly = xEdge ^ zEdge;
				
				placeBelowTrunkBlock(level, trunkSetter, random, below.offset(x, 0, z), tree);
				
				for (int height = 0; height < treeHeight; height++) {
					boolean thin = height < treeHeight - thinHeight;
					
					boolean shouldPlace = isCorner
							? !cutCorners && thin
							: !isEdgeOnly || !cutCorners || thin;
					
					if (shouldPlace)
						this.placeLogIfFreeWithOffset(level, trunkSetter, random, trunkPos, tree, origin, x, height, z);
				}
			}
		}
		
		return ImmutableList.of(new FoliagePlacer.FoliageAttachment(origin.above(treeHeight), 0, diameter % 2 == 0));
	}
	
	private void placeLogIfFreeWithOffset(
			final WorldGenLevel level,
			final BiConsumer<BlockPos, BlockState> trunkSetter,
			final RandomSource random,
			final BlockPos.MutableBlockPos trunkPos,
			final TreeFeature tree,
			final BlockPos treePos,
			final int x,
			final int y,
			final int z
	) {
		trunkPos.setWithOffset(treePos, x, y, z);
		this.placeLogIfFree(level, trunkSetter, random, trunkPos, tree);
	}
	
	private static boolean isEdge(int num, int diameter) {
		return num == diameterMin(diameter) || num == diameterMax(diameter);
	}
	
	private static int diameterMin(int diameter) {
		return (diameter - 1) / -2;
	}
	
	private static int diameterMax(int diameter) {
		return diameter / 2;
	}
}
