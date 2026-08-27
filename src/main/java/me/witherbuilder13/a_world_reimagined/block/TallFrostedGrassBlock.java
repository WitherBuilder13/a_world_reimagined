package me.witherbuilder13.a_world_reimagined.block;

import me.witherbuilder13.a_world_reimagined.tag.AWRBlockTags;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class TallFrostedGrassBlock extends DoublePlantBlock {
	
	private static final VoxelShape SHAPE_LOWER = Block.column(14.0, 0.0, 16.0);
	private static final VoxelShape SHAPE_UPPER = Block.column(14.0, 0.0, 12.0);
	
	public TallFrostedGrassBlock(final Properties properties) {
		super(properties);
	}
	
	@Override
	protected VoxelShape getShape(final BlockState state, final BlockGetter level, final BlockPos pos, final CollisionContext context) {
		return state.getValue(HALF).equals(DoubleBlockHalf.LOWER) ? SHAPE_LOWER : SHAPE_UPPER;
	}
	
	@Override
	protected boolean mayPlaceOn(final BlockState state, final BlockGetter level, final BlockPos pos) {
		return state.is(AWRBlockTags.SUPPORTS_SNOWY_VEGETATION);
	}
}
