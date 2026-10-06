package me.witherbuilder13.a_world_reimagined.model;

import com.google.common.collect.Sets;
import me.witherbuilder13.a_world_reimagined.AWorldReimagined;
import net.minecraft.client.model.geom.ModelLayerLocation;

import java.util.Set;

public class AWRModelLayers {
	
	private static final Set<ModelLayerLocation> AWR_MODELS = Sets.newHashSet();
	
	
	public static final ModelLayerLocation ALDER_BOAT = register("boat/alder");
	public static final ModelLayerLocation ALDER_CHEST_BOAT = register("chest_boat/alder");
	
	public static final ModelLayerLocation APPLE_BOAT = register("boat/apple");
	public static final ModelLayerLocation APPLE_CHEST_BOAT = register("chest_boat/apple");
	
	public static final ModelLayerLocation ASPEN_BOAT = register("boat/aspen");
	public static final ModelLayerLocation ASPEN_CHEST_BOAT = register("chest_boat/aspen");
	
	public static final ModelLayerLocation BAOBAB_BOAT = register("boat/baobab");
	public static final ModelLayerLocation BAOBAB_CHEST_BOAT = register("chest_boat/baobab");
	
	public static final ModelLayerLocation BEECH_BOAT = register("boat/beech");
	public static final ModelLayerLocation BEECH_CHEST_BOAT = register("chest_boat/beech");
	
	public static final ModelLayerLocation CEDAR_BOAT = register("boat/cedar");
	public static final ModelLayerLocation CEDAR_CHEST_BOAT = register("chest_boat/cedar");
	
	public static final ModelLayerLocation CHERRY_BOAT = register("boat/cherry");
	public static final ModelLayerLocation CHERRY_CHEST_BOAT = register("chest_boat/cherry");
	
	public static final ModelLayerLocation CYPRESS_BOAT = register("boat/cypress");
	public static final ModelLayerLocation CYPRESS_CHEST_BOAT = register("chest_boat/cypress");
	
	public static final ModelLayerLocation EBONY_BOAT = register("boat/ebony");
	public static final ModelLayerLocation EBONY_CHEST_BOAT = register("chest_boat/ebony");
	
	public static final ModelLayerLocation ELM_BOAT = register("boat/elm");
	public static final ModelLayerLocation ELM_CHEST_BOAT = register("chest_boat/elm");
	
	public static final ModelLayerLocation EUCALYPTUS_BOAT = register("boat/eucalyptus");
	public static final ModelLayerLocation EUCALYPTUS_CHEST_BOAT = register("chest_boat/eucalyptus");
	
	public static final ModelLayerLocation FIG_BOAT = register("boat/fig");
	public static final ModelLayerLocation FIG_CHEST_BOAT = register("chest_boat/fig");
	
	public static final ModelLayerLocation FIR_BOAT = register("boat/fir");
	public static final ModelLayerLocation FIR_CHEST_BOAT = register("chest_boat/fir");
	
	public static final ModelLayerLocation HEMLOCK_BOAT = register("boat/hemlock");
	public static final ModelLayerLocation HEMLOCK_CHEST_BOAT = register("chest_boat/hemlock");
	
	public static final ModelLayerLocation HICKORY_BOAT = register("boat/hickory");
	public static final ModelLayerLocation HICKORY_CHEST_BOAT = register("chest_boat/hickory");
	
	public static final ModelLayerLocation JUNIPER_BOAT = register("boat/juniper");
	public static final ModelLayerLocation JUNIPER_CHEST_BOAT = register("chest_boat/juniper");
	
	public static final ModelLayerLocation KAPOK_BOAT = register("boat/kapok");
	public static final ModelLayerLocation KAPOK_CHEST_BOAT = register("chest_boat/kapok");
	
	public static final ModelLayerLocation LARCH_BOAT = register("boat/larch");
	public static final ModelLayerLocation LARCH_CHEST_BOAT = register("chest_boat/larch");
	
	public static final ModelLayerLocation MAHOGANY_BOAT = register("boat/mahogany");
	public static final ModelLayerLocation MAHOGANY_CHEST_BOAT = register("chest_boat/mahogany");
	
	public static final ModelLayerLocation MAPLE_BOAT = register("boat/maple");
	public static final ModelLayerLocation MAPLE_CHEST_BOAT = register("chest_boat/maple");
	
	public static final ModelLayerLocation MESQUITE_BOAT = register("boat/mesquite");
	public static final ModelLayerLocation MESQUITE_CHEST_BOAT = register("chest_boat/mesquite");
	
	public static final ModelLayerLocation OLIVE_BOAT = register("boat/olive");
	public static final ModelLayerLocation OLIVE_CHEST_BOAT = register("chest_boat/olive");
	
	public static final ModelLayerLocation PALM_BOAT = register("boat/palm");
	public static final ModelLayerLocation PALM_CHEST_BOAT = register("chest_boat/palm");
	
	public static final ModelLayerLocation PALO_VERDE_BOAT = register("boat/palo_verde");
	public static final ModelLayerLocation PALO_VERDE_CHEST_BOAT = register("chest_boat/palo_verde");
	
	public static final ModelLayerLocation PINE_BOAT = register("boat/pine");
	public static final ModelLayerLocation PINE_CHEST_BOAT = register("chest_boat/pine");
	
	public static final ModelLayerLocation REDWOOD_BOAT = register("boat/redwood");
	public static final ModelLayerLocation REDWOOD_CHEST_BOAT = register("chest_boat/redwood");
	
	public static final ModelLayerLocation SEQUOIA_BOAT = register("boat/sequoia");
	public static final ModelLayerLocation SEQUOIA_CHEST_BOAT = register("chest_boat/sequoia");
	
	public static final ModelLayerLocation WILLOW_BOAT = register("boat/willow");
	public static final ModelLayerLocation WILLOW_CHEST_BOAT = register("chest_boat/willow");
	
	//` -----------------------------------------------------------------------------------------------------------------
	
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
