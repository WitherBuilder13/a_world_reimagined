package me.witherbuilder13.a_world_reimagined.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import me.witherbuilder13.a_world_reimagined.block.QuicksandCauldronFillable;
import me.witherbuilder13.a_world_reimagined.tag.AWRBlockTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.DirectionalPlaceContext;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(FallingBlockEntity.class)
public abstract class FallingBlockEntityMixin {
	
	@Shadow
	private BlockState blockState;
	
	@Inject(
			method = "tick",
			at = @At(
					value = "INVOKE",
					target = "Lnet/minecraft/world/level/block/state/BlockState;is(Ljava/lang/Object;)Z"
			),
			cancellable = true
	)
	private void awr$tryFillCauldron(CallbackInfo ci, @Local(name = "pos") BlockPos pos, @Local(name = "currentState") BlockState currentState) {
		
		if (!(this.blockState.is(AWRBlockTags.FILLS_QUICKSAND_CAULDRON) || this.blockState.is(AWRBlockTags.ADDS_LAYER_TO_QUICKSAND_CAULDRON)))
			return;
		
		FallingBlockEntity entity = (FallingBlockEntity) (Object) this;
		
		boolean landingSpotOpen = currentState.canBeReplaced(
				new DirectionalPlaceContext(entity.level(), pos, Direction.DOWN, ItemStack.EMPTY, Direction.UP)
		);
		
		if (!landingSpotOpen)
			return;
		
		BlockState stateBelow = entity.level().getBlockState(pos.below());
		
		if (stateBelow.getBlock() instanceof QuicksandCauldronFillable cauldron && cauldron.awr$tryAbsorbQuicksand(entity.level(), pos.below(), stateBelow, this.blockState)) {
			entity.discard();
			ci.cancel();
		}
	}
}
