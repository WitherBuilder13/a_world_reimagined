package me.witherbuilder13.a_world_reimagined.model;

import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.object.boat.BoatModel;

public class AWRLayerDefinitions {
	
	public static void init() {
		LayerDefinition boatModel = BoatModel.createBoatModel();
		LayerDefinition chestBoatModel = BoatModel.createChestBoatModel();
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.ALDER_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.ALDER_CHEST_BOAT, () -> chestBoatModel);
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.APPLE_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.APPLE_CHEST_BOAT, () -> chestBoatModel);
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.ASPEN_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.ASPEN_CHEST_BOAT, () -> chestBoatModel);
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.BAOBAB_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.BAOBAB_CHEST_BOAT, () -> chestBoatModel);
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.BEECH_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.BEECH_CHEST_BOAT, () -> chestBoatModel);
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.CEDAR_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.CEDAR_CHEST_BOAT, () -> chestBoatModel);
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.CHERRY_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.CHERRY_CHEST_BOAT, () -> chestBoatModel);
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.CYPRESS_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.CYPRESS_CHEST_BOAT, () -> chestBoatModel);
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.EBONY_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.EBONY_CHEST_BOAT, () -> chestBoatModel);
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.ELM_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.ELM_CHEST_BOAT, () -> chestBoatModel);
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.EUCALYPTUS_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.EUCALYPTUS_CHEST_BOAT, () -> chestBoatModel);
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.FIG_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.FIG_CHEST_BOAT, () -> chestBoatModel);
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.FIR_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.FIR_CHEST_BOAT, () -> chestBoatModel);
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.HEMLOCK_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.HEMLOCK_CHEST_BOAT, () -> chestBoatModel);
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.HICKORY_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.HICKORY_CHEST_BOAT, () -> chestBoatModel);
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.JUNIPER_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.JUNIPER_CHEST_BOAT, () -> chestBoatModel);
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.KAPOK_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.KAPOK_CHEST_BOAT, () -> chestBoatModel);
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.LARCH_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.LARCH_CHEST_BOAT, () -> chestBoatModel);
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.MAHOGANY_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.MAHOGANY_CHEST_BOAT, () -> chestBoatModel);
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.MAPLE_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.MAPLE_CHEST_BOAT, () -> chestBoatModel);
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.MESQUITE_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.MESQUITE_CHEST_BOAT, () -> chestBoatModel);
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.OLIVE_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.OLIVE_CHEST_BOAT, () -> chestBoatModel);
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.PALM_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.PALM_CHEST_BOAT, () -> chestBoatModel);
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.PALO_VERDE_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.PALO_VERDE_CHEST_BOAT, () -> chestBoatModel);
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.PINE_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.PINE_CHEST_BOAT, () -> chestBoatModel);
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.REDWOOD_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.REDWOOD_CHEST_BOAT, () -> chestBoatModel);
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.SEQUOIA_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.SEQUOIA_CHEST_BOAT, () -> chestBoatModel);
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.WILLOW_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.WILLOW_CHEST_BOAT, () -> chestBoatModel);
	}
}
