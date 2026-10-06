package me.witherbuilder13.a_world_reimagined.block;

import me.witherbuilder13.a_world_reimagined.block.util.AWRCauldronInteractions;
import me.witherbuilder13.a_world_reimagined.tag.AWRBlockTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Util;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractCauldronBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class QuicksandCauldronBlock extends AbstractCauldronBlock implements QuicksandCauldronFillable {
	
	public static final IntegerProperty LEVEL = BlockStateProperties.LEVEL_CAULDRON;
	private static final VoxelShape[] FILLED_SHAPES = Util.make(
			() -> Block.boxes(2, level -> Shapes.or(AbstractCauldronBlock.SHAPE, Block.column(12.0, 4.0, getPixelContentHeight(level + 1))))
	);
	
	public QuicksandCauldronBlock(Properties properties) {
		super(properties, AWRCauldronInteractions.QUICKSAND);
	}
	
	@Override
	public boolean isFull(BlockState state) {
		return state.getValue(LEVEL) == 3;
	}
	
	@Override
	protected double getContentHeight(final BlockState state) {
		return getPixelContentHeight(state.getValue(LEVEL)) / 16.0;
	}
	
	@Override
	protected VoxelShape getEntityInsideCollisionShape(final BlockState state, final BlockGetter level, final BlockPos pos, final Entity entity) {
		return FILLED_SHAPES[state.getValue(LEVEL) - 1];
	}
	
	private static double getPixelContentHeight(final int level) {
		return 6.0 + level * 3.0;
	}
	
	@Override
	protected int getAnalogOutputSignal(final BlockState state, final Level level, final BlockPos pos, final Direction direction) {
		return state.getValue(LEVEL);
	}
	
	@Override
	protected void createBlockStateDefinition(final StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(LEVEL);
	}
	
	@Override
	public boolean awr$tryAbsorbQuicksand(Level level, BlockPos pos, BlockState state, BlockState fallingState) {
		if (!(fallingState.is(AWRBlockTags.FILLS_QUICKSAND_CAULDRON) || fallingState.is(AWRBlockTags.ADDS_LAYER_TO_QUICKSAND_CAULDRON)))
			return false;
		
		int currentLevel = state.getValue(LEVEL);
		if (currentLevel == 3)
			return false;
		
		if (fallingState.is(AWRBlockTags.FILLS_QUICKSAND_CAULDRON))
			level.setBlockAndUpdate(pos, state.setValue(LEVEL, 3));
		
		if (fallingState.is(AWRBlockTags.ADDS_LAYER_TO_QUICKSAND_CAULDRON))
			level.setBlockAndUpdate(pos, state.setValue(LEVEL, currentLevel + 1));
		
		level.playSound(null, pos, SoundEvents.SAND_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);
		
		return true;
	}
}
