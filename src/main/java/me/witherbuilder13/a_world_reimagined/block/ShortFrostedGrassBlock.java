package me.witherbuilder13.a_world_reimagined.block;

import me.witherbuilder13.a_world_reimagined.tag.AWRBlockTags;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ShortFrostedGrassBlock extends VegetationBlock implements BonemealableBlock {
	
	private static final VoxelShape SHAPE = Block.column(12.0, 0.0, 13.0);
	
	public ShortFrostedGrassBlock(final Properties properties) {
		super(properties);
	}
	
	@Override
	protected VoxelShape getShape(final BlockState state, final BlockGetter level, final BlockPos pos, final CollisionContext context) {
		return SHAPE;
	}
	
	@Override
	public boolean isValidBonemealTarget(final LevelReader level, final BlockPos pos, final BlockState state, final BonemealSource source) {
		return AWRBlocks.TALL_FROSTED_GRASS.defaultBlockState().canSurvive(level, pos) && level.isEmptyBlock(pos.above()) && level.isInsideBuildHeight(pos.above());
	}
	
	@Override
	public boolean isBonemealSuccess(final Level level, final RandomSource random, final BlockPos pos, final BlockState state, final BonemealSource source) {
		return true;
	}
	
	@Override
	public void performBonemeal(final ServerLevel level, final RandomSource random, final BlockPos pos, final BlockState state, final BonemealSource source) {
		DoublePlantBlock.placeAt(level, AWRBlocks.TALL_FROSTED_GRASS.defaultBlockState(), pos, 2);
	}
	
	@Override
	protected boolean mayPlaceOn(final BlockState state, final BlockGetter level, final BlockPos pos) {
		return state.is(AWRBlockTags.SUPPORTS_SNOWY_VEGETATION);
	}
}
