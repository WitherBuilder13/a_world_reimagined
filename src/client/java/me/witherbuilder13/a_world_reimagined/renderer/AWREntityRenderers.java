package me.witherbuilder13.a_world_reimagined.renderer;

import me.witherbuilder13.a_world_reimagined.entity.AWREntityTypes;
import me.witherbuilder13.a_world_reimagined.model.AWRModelLayers;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;

public class AWREntityRenderers {
	public static void init() {
		EntityRenderers.register(AWREntityTypes.ASPEN_BOAT, context -> new BoatRenderer(context, AWRModelLayers.ASPEN_BOAT));
		EntityRenderers.register(AWREntityTypes.ASPEN_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.ASPEN_CHEST_BOAT));
		EntityRenderers.register(AWREntityTypes.CEDAR_BOAT, context -> new BoatRenderer(context, AWRModelLayers.CEDAR_BOAT));
		EntityRenderers.register(AWREntityTypes.CEDAR_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.CEDAR_CHEST_BOAT));
		EntityRenderers.register(AWREntityTypes.FIR_BOAT, context -> new BoatRenderer(context, AWRModelLayers.FIR_BOAT));
		EntityRenderers.register(AWREntityTypes.FIR_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.FIR_CHEST_BOAT));
		EntityRenderers.register(AWREntityTypes.HEMLOCK_BOAT, context -> new BoatRenderer(context, AWRModelLayers.HEMLOCK_BOAT));
		EntityRenderers.register(AWREntityTypes.HEMLOCK_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.HEMLOCK_CHEST_BOAT));
		EntityRenderers.register(AWREntityTypes.LARCH_BOAT, context -> new BoatRenderer(context, AWRModelLayers.LARCH_BOAT));
		EntityRenderers.register(AWREntityTypes.LARCH_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.LARCH_CHEST_BOAT));
		EntityRenderers.register(AWREntityTypes.PINE_BOAT, context -> new BoatRenderer(context, AWRModelLayers.PINE_BOAT));
		EntityRenderers.register(AWREntityTypes.PINE_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.PINE_CHEST_BOAT));
		EntityRenderers.register(AWREntityTypes.REDWOOD_BOAT, context -> new BoatRenderer(context, AWRModelLayers.REDWOOD_BOAT));
		EntityRenderers.register(AWREntityTypes.REDWOOD_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.REDWOOD_CHEST_BOAT));
		EntityRenderers.register(AWREntityTypes.SEQUOIA_BOAT, context -> new BoatRenderer(context, AWRModelLayers.SEQUOIA_BOAT));
		EntityRenderers.register(AWREntityTypes.SEQUOIA_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.SEQUOIA_CHEST_BOAT));
	}
}
