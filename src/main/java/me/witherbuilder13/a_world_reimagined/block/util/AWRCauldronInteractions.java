package me.witherbuilder13.a_world_reimagined.block.util;

import me.witherbuilder13.a_world_reimagined.block.AWRBlocks;
import me.witherbuilder13.a_world_reimagined.block.QuicksandCauldronBlock;
import me.witherbuilder13.a_world_reimagined.item.AWRItems;
import me.witherbuilder13.a_world_reimagined.mixin.CauldronDispatchAccessor;
import net.minecraft.core.BlockPos;
import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.core.cauldron.CauldronInteractions;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LayeredCauldronBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;

public class AWRCauldronInteractions {
	
	public static final CauldronInteraction.Dispatcher QUICKSAND = new CauldronInteraction.Dispatcher();
	
	public static void bootstrap() {
		CauldronInteractions.addDefaultInteractions(QUICKSAND);
		
		((CauldronDispatchAccessor) QUICKSAND).awr$put(
				Items.BUCKET,
				((state, level, pos, player, hand, itemInHand) ->
						CauldronInteractions.fillBucket(
								state, level, pos, player, hand, itemInHand,
								new ItemStack(AWRItems.QUICKSAND_BUCKET),
								s -> s.getValue(QuicksandCauldronBlock.LEVEL) == 3,
								SoundEvents.BUCKET_FILL_POWDER_SNOW
						)
				)
		);
		
		((CauldronDispatchAccessor) CauldronInteractions.EMPTY).awr$put(
				AWRItems.QUICKSAND_BUCKET,
				((_, level, pos, player, hand, itemInHand) ->
						CauldronInteractions.emptyBucket(
								level, pos, player, hand, itemInHand,
								AWRBlocks.QUICKSAND_CAULDRON.defaultBlockState().setValue(QuicksandCauldronBlock.LEVEL, 3),
								SoundEvents.BUCKET_EMPTY_POWDER_SNOW
						)
				)
		);
		
		for (CauldronInteraction.Dispatcher d : new CauldronInteraction.Dispatcher[]{
				CauldronInteractions.EMPTY,
				CauldronInteractions.WATER,
				CauldronInteractions.LAVA,
				CauldronInteractions.POWDER_SNOW,
				QUICKSAND
		}) {
			((CauldronDispatchAccessor) d).awr$put(AWRItems.QUICKSAND_BUCKET, AWRCauldronInteractions::fillQuicksandInteraction);
		}
	}
	
	private static InteractionResult fillQuicksandInteraction(
			final BlockState state, final Level level, final BlockPos pos, final Player player, final InteractionHand hand, final ItemStack itemInHand
	) {
		return isUnderWater(level, pos)
				? InteractionResult.CONSUME
				: CauldronInteractions.emptyBucket(
				level,
				pos,
				player,
				hand,
				itemInHand,
				AWRBlocks.QUICKSAND_CAULDRON.defaultBlockState().setValue(LayeredCauldronBlock.LEVEL, 3),
				SoundEvents.BUCKET_EMPTY_POWDER_SNOW
		);
	}
	
	private static boolean isUnderWater(final Level level, final BlockPos pos) {
		FluidState fluidState = level.getFluidState(pos.above());
		return fluidState.is(FluidTags.WATER);
	}
}
