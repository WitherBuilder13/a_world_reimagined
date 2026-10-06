package me.witherbuilder13.a_world_reimagined.block;

import me.witherbuilder13.a_world_reimagined.tag.AWRBlockTags;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.VegetationBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class TundraVegetationBlock extends VegetationBlock {
	
	private static final VoxelShape SHAPE = Block.column(12.0, 0.0, 13.0);
	
	protected TundraVegetationBlock(Properties properties) {
		super(properties);
	}
	
	@Override
	protected VoxelShape getShape(final BlockState state, final BlockGetter level, final BlockPos pos, final CollisionContext context) {
		return SHAPE;
	}
	
	@Override
	protected boolean mayPlaceOn(final BlockState state, final BlockGetter level, final BlockPos pos) {
		return state.is(AWRBlockTags.SUPPORTS_TUNDRA_VEGETATION);
	}
}
