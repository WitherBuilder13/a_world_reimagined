package me.witherbuilder13.a_world_reimagined.renderer;

import me.witherbuilder13.a_world_reimagined.entity.AWREntityTypes;
import me.witherbuilder13.a_world_reimagined.model.AWRModelLayers;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;

public class AWREntityRenderers {
	public static void init() {
		
		EntityRenderers.register(AWREntityTypes.ALDER_BOAT, context -> new BoatRenderer(context, AWRModelLayers.ALDER_BOAT));
		EntityRenderers.register(AWREntityTypes.ALDER_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.ALDER_CHEST_BOAT));
		
		EntityRenderers.register(AWREntityTypes.APPLE_BOAT, context -> new BoatRenderer(context, AWRModelLayers.APPLE_BOAT));
		EntityRenderers.register(AWREntityTypes.APPLE_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.APPLE_CHEST_BOAT));
		
		EntityRenderers.register(AWREntityTypes.ASPEN_BOAT, context -> new BoatRenderer(context, AWRModelLayers.ASPEN_BOAT));
		EntityRenderers.register(AWREntityTypes.ASPEN_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.ASPEN_CHEST_BOAT));
		
		EntityRenderers.register(AWREntityTypes.BAOBAB_BOAT, context -> new BoatRenderer(context, AWRModelLayers.BAOBAB_BOAT));
		EntityRenderers.register(AWREntityTypes.BAOBAB_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.BAOBAB_CHEST_BOAT));
		
		EntityRenderers.register(AWREntityTypes.BEECH_BOAT, context -> new BoatRenderer(context, AWRModelLayers.BEECH_BOAT));
		EntityRenderers.register(AWREntityTypes.BEECH_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.BEECH_CHEST_BOAT));
		
		EntityRenderers.register(AWREntityTypes.CEDAR_BOAT, context -> new BoatRenderer(context, AWRModelLayers.CEDAR_BOAT));
		EntityRenderers.register(AWREntityTypes.CEDAR_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.CEDAR_CHEST_BOAT));
		
		EntityRenderers.register(AWREntityTypes.CHERRY_BOAT, context -> new BoatRenderer(context, AWRModelLayers.CHERRY_BOAT));
		EntityRenderers.register(AWREntityTypes.CHERRY_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.CHERRY_CHEST_BOAT));
		
		EntityRenderers.register(AWREntityTypes.CYPRESS_BOAT, context -> new BoatRenderer(context, AWRModelLayers.CYPRESS_BOAT));
		EntityRenderers.register(AWREntityTypes.CYPRESS_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.CYPRESS_CHEST_BOAT));
		
		EntityRenderers.register(AWREntityTypes.EBONY_BOAT, context -> new BoatRenderer(context, AWRModelLayers.EBONY_BOAT));
		EntityRenderers.register(AWREntityTypes.EBONY_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.EBONY_CHEST_BOAT));
		
		EntityRenderers.register(AWREntityTypes.ELM_BOAT, context -> new BoatRenderer(context, AWRModelLayers.ELM_BOAT));
		EntityRenderers.register(AWREntityTypes.ELM_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.ELM_CHEST_BOAT));
		
		EntityRenderers.register(AWREntityTypes.EUCALYPTUS_BOAT, context -> new BoatRenderer(context, AWRModelLayers.EUCALYPTUS_BOAT));
		EntityRenderers.register(AWREntityTypes.EUCALYPTUS_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.EUCALYPTUS_CHEST_BOAT));
		
		EntityRenderers.register(AWREntityTypes.FIG_BOAT, context -> new BoatRenderer(context, AWRModelLayers.FIG_BOAT));
		EntityRenderers.register(AWREntityTypes.FIG_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.FIG_CHEST_BOAT));
		
		EntityRenderers.register(AWREntityTypes.FIR_BOAT, context -> new BoatRenderer(context, AWRModelLayers.FIR_BOAT));
		EntityRenderers.register(AWREntityTypes.FIR_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.FIR_CHEST_BOAT));
		
		EntityRenderers.register(AWREntityTypes.HEMLOCK_BOAT, context -> new BoatRenderer(context, AWRModelLayers.HEMLOCK_BOAT));
		EntityRenderers.register(AWREntityTypes.HEMLOCK_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.HEMLOCK_CHEST_BOAT));
		
		EntityRenderers.register(AWREntityTypes.HICKORY_BOAT, context -> new BoatRenderer(context, AWRModelLayers.HICKORY_BOAT));
		EntityRenderers.register(AWREntityTypes.HICKORY_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.HICKORY_CHEST_BOAT));
		
		EntityRenderers.register(AWREntityTypes.JUNIPER_BOAT, context -> new BoatRenderer(context, AWRModelLayers.JUNIPER_BOAT));
		EntityRenderers.register(AWREntityTypes.JUNIPER_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.JUNIPER_CHEST_BOAT));
		
		EntityRenderers.register(AWREntityTypes.KAPOK_BOAT, context -> new BoatRenderer(context, AWRModelLayers.KAPOK_BOAT));
		EntityRenderers.register(AWREntityTypes.KAPOK_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.KAPOK_CHEST_BOAT));
		
		EntityRenderers.register(AWREntityTypes.LARCH_BOAT, context -> new BoatRenderer(context, AWRModelLayers.LARCH_BOAT));
		EntityRenderers.register(AWREntityTypes.LARCH_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.LARCH_CHEST_BOAT));
		
		EntityRenderers.register(AWREntityTypes.MAHOGANY_BOAT, context -> new BoatRenderer(context, AWRModelLayers.MAHOGANY_BOAT));
		EntityRenderers.register(AWREntityTypes.MAHOGANY_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.MAHOGANY_CHEST_BOAT));
		
		EntityRenderers.register(AWREntityTypes.MAPLE_BOAT, context -> new BoatRenderer(context, AWRModelLayers.MAPLE_BOAT));
		EntityRenderers.register(AWREntityTypes.MAPLE_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.MAPLE_CHEST_BOAT));
		
		EntityRenderers.register(AWREntityTypes.MESQUITE_BOAT, context -> new BoatRenderer(context, AWRModelLayers.MESQUITE_BOAT));
		EntityRenderers.register(AWREntityTypes.MESQUITE_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.MESQUITE_CHEST_BOAT));
		
		EntityRenderers.register(AWREntityTypes.OLIVE_BOAT, context -> new BoatRenderer(context, AWRModelLayers.OLIVE_BOAT));
		EntityRenderers.register(AWREntityTypes.OLIVE_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.OLIVE_CHEST_BOAT));
		
		EntityRenderers.register(AWREntityTypes.PALM_BOAT, context -> new BoatRenderer(context, AWRModelLayers.PALM_BOAT));
		EntityRenderers.register(AWREntityTypes.PALM_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.PALM_CHEST_BOAT));
		
		EntityRenderers.register(AWREntityTypes.PALO_VERDE_BOAT, context -> new BoatRenderer(context, AWRModelLayers.PALO_VERDE_BOAT));
		EntityRenderers.register(AWREntityTypes.PALO_VERDE_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.PALO_VERDE_CHEST_BOAT));
		
		EntityRenderers.register(AWREntityTypes.PINE_BOAT, context -> new BoatRenderer(context, AWRModelLayers.PINE_BOAT));
		EntityRenderers.register(AWREntityTypes.PINE_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.PINE_CHEST_BOAT));
		
		EntityRenderers.register(AWREntityTypes.REDWOOD_BOAT, context -> new BoatRenderer(context, AWRModelLayers.REDWOOD_BOAT));
		EntityRenderers.register(AWREntityTypes.REDWOOD_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.REDWOOD_CHEST_BOAT));
		
		EntityRenderers.register(AWREntityTypes.SEQUOIA_BOAT, context -> new BoatRenderer(context, AWRModelLayers.SEQUOIA_BOAT));
		EntityRenderers.register(AWREntityTypes.SEQUOIA_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.SEQUOIA_CHEST_BOAT));
		
		EntityRenderers.register(AWREntityTypes.WILLOW_BOAT, context -> new BoatRenderer(context, AWRModelLayers.WILLOW_BOAT));
		EntityRenderers.register(AWREntityTypes.WILLOW_CHEST_BOAT, context -> new BoatRenderer(context, AWRModelLayers.WILLOW_CHEST_BOAT));
	}
}
