package me.witherbuilder13.a_world_reimagined.entity;

import me.witherbuilder13.a_world_reimagined.AWorldReimagined;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;

public class AWREntityTypeIds {
	
	public static ResourceKey<EntityType<?>> ALDER_BOAT = create("alder_boat");
	public static ResourceKey<EntityType<?>> ALDER_CHEST_BOAT = create("alder_chest_boat");
	
	public static ResourceKey<EntityType<?>> APPLE_BOAT = create("apple_boat");
	public static ResourceKey<EntityType<?>> APPLE_CHEST_BOAT = create("apple_chest_boat");
	
	public static ResourceKey<EntityType<?>> ASPEN_BOAT = create("aspen_boat");
	public static ResourceKey<EntityType<?>> ASPEN_CHEST_BOAT = create("aspen_chest_boat");
	
	public static ResourceKey<EntityType<?>> BAOBAB_BOAT = create("baobab_boat");
	public static ResourceKey<EntityType<?>> BAOBAB_CHEST_BOAT = create("baobab_chest_boat");
	
	public static ResourceKey<EntityType<?>> BEECH_BOAT = create("beech_boat");
	public static ResourceKey<EntityType<?>> BEECH_CHEST_BOAT = create("beech_chest_boat");
	
	public static ResourceKey<EntityType<?>> CEDAR_BOAT = create("cedar_boat");
	public static ResourceKey<EntityType<?>> CEDAR_CHEST_BOAT = create("cedar_chest_boat");
	
	public static ResourceKey<EntityType<?>> CHERRY_BOAT = create("cherry_boat");
	public static ResourceKey<EntityType<?>> CHERRY_CHEST_BOAT = create("cherry_chest_boat");
	
	public static ResourceKey<EntityType<?>> CYPRESS_BOAT = create("cypress_boat");
	public static ResourceKey<EntityType<?>> CYPRESS_CHEST_BOAT = create("cypress_chest_boat");
	
	public static ResourceKey<EntityType<?>> EBONY_BOAT = create("ebony_boat");
	public static ResourceKey<EntityType<?>> EBONY_CHEST_BOAT = create("ebony_chest_boat");
	
	public static ResourceKey<EntityType<?>> ELM_BOAT = create("elm_boat");
	public static ResourceKey<EntityType<?>> ELM_CHEST_BOAT = create("elm_chest_boat");
	
	public static ResourceKey<EntityType<?>> EUCALYPTUS_BOAT = create("eucalyptus_boat");
	public static ResourceKey<EntityType<?>> EUCALYPTUS_CHEST_BOAT = create("eucalyptus_chest_boat");
	
	public static ResourceKey<EntityType<?>> FIG_BOAT = create("fig_boat");
	public static ResourceKey<EntityType<?>> FIG_CHEST_BOAT = create("fig_chest_boat");
	
	public static ResourceKey<EntityType<?>> FIR_BOAT = create("fir_boat");
	public static ResourceKey<EntityType<?>> FIR_CHEST_BOAT = create("fir_chest_boat");
	
	public static ResourceKey<EntityType<?>> HEMLOCK_BOAT = create("hemlock_boat");
	public static ResourceKey<EntityType<?>> HEMLOCK_CHEST_BOAT = create("hemlock_chest_boat");
	
	public static ResourceKey<EntityType<?>> HICKORY_BOAT = create("hickory_boat");
	public static ResourceKey<EntityType<?>> HICKORY_CHEST_BOAT = create("hickory_chest_boat");
	
	public static ResourceKey<EntityType<?>> JUNIPER_BOAT = create("juniper_boat");
	public static ResourceKey<EntityType<?>> JUNIPER_CHEST_BOAT = create("juniper_chest_boat");
	
	public static ResourceKey<EntityType<?>> KAPOK_BOAT = create("kapok_boat");
	public static ResourceKey<EntityType<?>> KAPOK_CHEST_BOAT = create("kapok_chest_boat");
	
	public static ResourceKey<EntityType<?>> LARCH_BOAT = create("larch_boat");
	public static ResourceKey<EntityType<?>> LARCH_CHEST_BOAT = create("larch_chest_boat");
	
	public static ResourceKey<EntityType<?>> MAHOGANY_BOAT = create("mahogany_boat");
	public static ResourceKey<EntityType<?>> MAHOGANY_CHEST_BOAT = create("mahogany_chest_boat");
	
	public static ResourceKey<EntityType<?>> MAPLE_BOAT = create("maple_boat");
	public static ResourceKey<EntityType<?>> MAPLE_CHEST_BOAT = create("maple_chest_boat");
	
	public static ResourceKey<EntityType<?>> MESQUITE_BOAT = create("mesquite_boat");
	public static ResourceKey<EntityType<?>> MESQUITE_CHEST_BOAT = create("mesquite_chest_boat");
	
	public static ResourceKey<EntityType<?>> OLIVE_BOAT = create("olive_boat");
	public static ResourceKey<EntityType<?>> OLIVE_CHEST_BOAT = create("olive_chest_boat");
	
	public static ResourceKey<EntityType<?>> PALM_BOAT = create("palm_boat");
	public static ResourceKey<EntityType<?>> PALM_CHEST_BOAT = create("palm_chest_boat");
	
	public static ResourceKey<EntityType<?>> PALO_VERDE_BOAT = create("palo_verde_boat");
	public static ResourceKey<EntityType<?>> PALO_VERDE_CHEST_BOAT = create("palo_verde_chest_boat");
	
	public static ResourceKey<EntityType<?>> PINE_BOAT = create("pine_boat");
	public static ResourceKey<EntityType<?>> PINE_CHEST_BOAT = create("pine_chest_boat");
	
	public static ResourceKey<EntityType<?>> REDWOOD_BOAT = create("redwood_boat");
	public static ResourceKey<EntityType<?>> REDWOOD_CHEST_BOAT = create("redwood_chest_boat");
	
	public static ResourceKey<EntityType<?>> SEQUOIA_BOAT = create("sequoia_boat");
	public static ResourceKey<EntityType<?>> SEQUOIA_CHEST_BOAT = create("sequoia_chest_boat");
	
	public static ResourceKey<EntityType<?>> WILLOW_BOAT = create("willow_boat");
	public static ResourceKey<EntityType<?>> WILLOW_CHEST_BOAT = create("willow_chest_boat");
	
	//` ---------------------------------------------------------------------------------------------------------------------------------------------------
	
	private static ResourceKey<EntityType<?>> create(final String name) {
		return ResourceKey.create(Registries.ENTITY_TYPE, AWorldReimagined.id(name));
	}
}