package me.witherbuilder13.a_world_reimagined.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public interface QuicksandCauldronFillable {
	
	boolean awr$tryAbsorbQuicksand(Level level, BlockPos pos, BlockState cauldronState, BlockState fallingState);
}
