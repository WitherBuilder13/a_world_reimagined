package me.witherbuilder13.a_world_reimagined;

import me.witherbuilder13.a_world_reimagined.model.AWRLayerDefinitions;
import me.witherbuilder13.a_world_reimagined.renderer.AWREntityRenderers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.fabric.api.client.rendering.v1.BlockColorRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.color.block.BlockTintSources;
import net.minecraft.world.level.block.Block;

import java.util.List;

import static me.witherbuilder13.a_world_reimagined.block.AWRBlocks.*;

public class AWRClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		AWRLayerDefinitions.init();
		AWREntityRenderers.init();
		
		Block[] tintedFoliageBlocks = {
				ALDER_LEAVES, APPLE_LEAVES, BAOBAB_LEAVES, BEECH_LEAVES, CHERRY_LEAVES, CYPRESS_LEAVES,
				EBONY_LEAVES, ELM_LEAVES, EUCALYPTUS_LEAVES, FIG_LEAVES, HICKORY_LEAVES, KAPOK_LEAVES,
				MAHOGANY_LEAVES, MAPLE_LEAVES, MESQUITE_LEAVES, OLIVE_LEAVES, PALM_LEAVES, WILLOW_LEAVES
		};
		
		if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT) {
			BlockColorRegistry.register(List.of(BlockTintSources.foliage()), tintedFoliageBlocks);
		}
	}
}