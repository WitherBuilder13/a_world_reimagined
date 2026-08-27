package me.witherbuilder13.a_world_reimagined;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AWorldReimagined implements ModInitializer {

	public static final String MOD_ID = "a_world_reimagined";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		//AWRBlocks.init();
		//AWRItems.init();
		//AWRBiomeModifiers.init();
	}

	public static Identifier id(String id) {
		return Identifier.fromNamespaceAndPath(MOD_ID, id);
	}
}
