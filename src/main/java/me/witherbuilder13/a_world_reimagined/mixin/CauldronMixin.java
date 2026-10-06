package me.witherbuilder13.a_world_reimagined.mixin;

import me.witherbuilder13.a_world_reimagined.block.AWRBlocks;
import me.witherbuilder13.a_world_reimagined.block.QuicksandCauldronBlock;
import me.witherbuilder13.a_world_reimagined.block.QuicksandCauldronFillable;
import me.witherbuilder13.a_world_reimagined.tag.AWRBlockTags;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CauldronBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(CauldronBlock.class)
public class CauldronMixin implements QuicksandCauldronFillable {
	
	@Override
	public boolean awr$tryAbsorbQuicksand(Level level, BlockPos blockPos, BlockState state, BlockState fallingState) {
		if (!(fallingState.is(AWRBlockTags.FILLS_QUICKSAND_CAULDRON) || fallingState.is(AWRBlockTags.ADDS_LAYER_TO_QUICKSAND_CAULDRON)))
			return false;
		
		if (fallingState.is(AWRBlockTags.FILLS_QUICKSAND_CAULDRON))
			level.setBlockAndUpdate(blockPos, AWRBlocks.QUICKSAND_CAULDRON.defaultBlockState().setValue(QuicksandCauldronBlock.LEVEL, 3));
		
		if (fallingState.is(AWRBlockTags.ADDS_LAYER_TO_QUICKSAND_CAULDRON))
			level.setBlockAndUpdate(blockPos, AWRBlocks.QUICKSAND_CAULDRON.defaultBlockState().setValue(QuicksandCauldronBlock.LEVEL, 1));
		
		level.playSound(null, blockPos, SoundEvents.SAND_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);
		
		return true;
	}
}
