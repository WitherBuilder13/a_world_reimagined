package me.witherbuilder13.a_world_reimagined;

import me.witherbuilder13.a_world_reimagined.model.AWRLayerDefinitions;
import me.witherbuilder13.a_world_reimagined.renderer.AWREntityRenderers;
import net.fabricmc.api.ClientModInitializer;

public class AWRClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		AWRLayerDefinitions.init();
		AWREntityRenderers.init();
	}
}