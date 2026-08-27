package me.witherbuilder13.a_world_reimagined.model;

import com.google.common.collect.Sets;
import me.witherbuilder13.a_world_reimagined.AWorldReimagined;
import net.minecraft.client.model.geom.ModelLayerLocation;

import java.util.Set;

public class AWRModelLayers {
	
	private static final Set<ModelLayerLocation> AWR_MODELS = Sets.newHashSet();
	
	public static final ModelLayerLocation ASPEN_BOAT = register("boat/aspen");
	public static final ModelLayerLocation ASPEN_CHEST_BOAT = register("chest_boat/aspen");
	public static final ModelLayerLocation CEDAR_BOAT = register("boat/cedar");
	public static final ModelLayerLocation CEDAR_CHEST_BOAT = register("chest_boat/cedar");
	public static final ModelLayerLocation FIR_BOAT = register("boat/fir");
	public static final ModelLayerLocation FIR_CHEST_BOAT = register("chest_boat/fir");
	public static final ModelLayerLocation HEMLOCK_BOAT = register("boat/hemlock");
	public static final ModelLayerLocation HEMLOCK_CHEST_BOAT = register("chest_boat/hemlock");
	public static final ModelLayerLocation LARCH_BOAT = register("boat/larch");
	public static final ModelLayerLocation LARCH_CHEST_BOAT = register("chest_boat/larch");
	public static final ModelLayerLocation PINE_BOAT = register("boat/pine");
	public static final ModelLayerLocation PINE_CHEST_BOAT = register("chest_boat/pine");
	public static final ModelLayerLocation REDWOOD_BOAT = register("boat/redwood");
	public static final ModelLayerLocation REDWOOD_CHEST_BOAT = register("chest_boat/redwood");
	public static final ModelLayerLocation SEQUOIA_BOAT = register("boat/sequoia");
	public static final ModelLayerLocation SEQUOIA_CHEST_BOAT = register("chest_boat/sequoia");
	
	private static ModelLayerLocation register(final String model) {
		return register(model, "main");
	}
	
	private static ModelLayerLocation register(final String model, final String layer) {
		ModelLayerLocation result = createLocation(model, layer);
		if (!AWR_MODELS.add(result)) {
			throw new IllegalStateException("Duplicate registration for " + result);
		} else {
			return result;
		}
	}
	
	private static ModelLayerLocation createLocation(final String model, final String layer) {
		return new ModelLayerLocation(AWorldReimagined.id(model), layer);
	}
}
