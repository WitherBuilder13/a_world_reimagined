package me.witherbuilder13.a_world_reimagined.model;

import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.object.boat.BoatModel;

public class AWRLayerDefinitions {
	
	public static void init() {
		LayerDefinition boatModel = BoatModel.createBoatModel();
		LayerDefinition chestBoatModel = BoatModel.createChestBoatModel();
		
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.ASPEN_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.ASPEN_CHEST_BOAT, () -> chestBoatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.CEDAR_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.CEDAR_CHEST_BOAT, () -> chestBoatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.FIR_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.FIR_CHEST_BOAT, () -> chestBoatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.HEMLOCK_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.HEMLOCK_CHEST_BOAT, () -> chestBoatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.LARCH_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.LARCH_CHEST_BOAT, () -> chestBoatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.PINE_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.PINE_CHEST_BOAT, () -> chestBoatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.REDWOOD_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.REDWOOD_CHEST_BOAT, () -> chestBoatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.SEQUOIA_BOAT, () -> boatModel);
		ModelLayerRegistry.registerModelLayer(AWRModelLayers.SEQUOIA_CHEST_BOAT, () -> chestBoatModel);
	}
}
