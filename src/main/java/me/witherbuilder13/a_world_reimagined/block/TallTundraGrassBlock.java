package me.witherbuilder13.a_world_reimagined.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BonemealSource;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class TallTundraGrassBlock extends TundraVegetationBlock implements BonemealableBlock {
	
	private static final VoxelShape SHAPE = Block.column(14.0, 0.0, 16.0);
	
	public TallTundraGrassBlock(final Properties properties) {
		super(properties);
	}
	
	@Override
	protected VoxelShape getShape(final BlockState state, final BlockGetter level, final BlockPos pos, final CollisionContext context) {
		return SHAPE;
	}
	
	@Override
	public boolean isValidBonemealTarget(final LevelReader level, final BlockPos pos, final BlockState state, final BonemealSource source) {
		return BonemealableBlock.hasSpreadableNeighbourPos(level, pos, AWRBlocks.SHORT_TUNDRA_GRASS.defaultBlockState());
	}
	
	@Override
	public boolean isBonemealSuccess(final Level level, final RandomSource random, final BlockPos pos, final BlockState state, final BonemealSource source) {
		return true;
	}
	
	@Override
	public void performBonemeal(final ServerLevel level, final RandomSource random, final BlockPos pos, final BlockState state, final BonemealSource source) {
		BonemealableBlock.findSpreadableNeighbourPos(level, pos, AWRBlocks.SHORT_TUNDRA_GRASS.defaultBlockState())
				.ifPresent(blockPos -> level.setBlockAndUpdate(blockPos, AWRBlocks.SHORT_TUNDRA_GRASS.defaultBlockState()));
	}
}
