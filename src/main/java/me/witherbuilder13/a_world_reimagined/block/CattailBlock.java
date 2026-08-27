package me.witherbuilder13.a_world_reimagined.block;

import me.witherbuilder13.a_world_reimagined.tag.AWRBlockTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import org.jspecify.annotations.Nullable;

public class CattailBlock extends TallFlowerBlock implements SimpleWaterloggedBlock {
	
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	
	public CattailBlock(Properties properties) {
		super(properties);
		this.registerDefaultState(this.defaultBlockState().setValue(WATERLOGGED, false));
	}
	
	@Override
	protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
		return state.is(AWRBlockTags.SUPPORTS_CATTAIL) && level.getFluidState(pos.above(2)).isEmpty();
	}
	
	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(WATERLOGGED, DoublePlantBlock.HALF);
	}
	
	@Override
	public @Nullable BlockState getStateForPlacement(final BlockPlaceContext context) {
		BlockState state = super.getStateForPlacement(context);
		
		return state != null
				? copyWaterloggedFrom(context.getLevel(), context.getClickedPos(), state)
				: null;
	}
	
	@Override
	protected BlockState updateShape(
			final BlockState state,
			final LevelReader level,
			final ScheduledTickAccess ticks,
			final BlockPos pos,
			final Direction directionToNeighbour,
			final BlockPos neighbourPos,
			final BlockState neighbourState,
			final RandomSource random
	) {
		if (state.getValue(WATERLOGGED)) {
			ticks.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
		}
		
		return super.updateShape(state, level, ticks, pos, directionToNeighbour, neighbourPos, neighbourState, random);
	}
	
	@Override
	protected FluidState getFluidState(final BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}
	
	@Override
	public void setPlacedBy(final Level level, final BlockPos pos, final BlockState state, final @Nullable LivingEntity by, final ItemStack itemStack) {
		if (!level.isClientSide()) {
			BlockPos abovePos = pos.above();
			BlockState blockState = DoublePlantBlock.copyWaterloggedFrom(
					level, abovePos, this.defaultBlockState().setValue(HALF, DoubleBlockHalf.UPPER)
			);
			level.setBlockAndUpdate(abovePos, blockState);
		}
	}
}
