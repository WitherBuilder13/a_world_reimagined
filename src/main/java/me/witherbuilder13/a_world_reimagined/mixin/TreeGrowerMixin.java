package me.witherbuilder13.a_world_reimagined.mixin;

import me.witherbuilder13.a_world_reimagined.block.util.AWRTreeGrowers;
import net.minecraft.world.level.block.grower.TreeGrower;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TreeGrower.class)
public class TreeGrowerMixin {
	
	@Mutable
	@Shadow
	@Final
	public static TreeGrower SPRUCE;
	
	@Inject(method = "<clinit>", at = @At("TAIL"))
	private static void awr$overrideTreeGrowers(CallbackInfo ci) {
		SPRUCE = AWRTreeGrowers.SPRUCE;
	}
}
