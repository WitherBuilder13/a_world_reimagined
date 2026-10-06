package me.witherbuilder13.a_world_reimagined.references;

import me.witherbuilder13.a_world_reimagined.AWorldReimagined;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class AWRItemIds {
	
	public static final ResourceKey<Item> ALDER_BOAT = create("alder_boat");
	public static final ResourceKey<Item> ALDER_CHEST_BOAT = create("alder_chest_boat");
	
	public static final ResourceKey<Item> APPLE_BOAT = create("apple_boat");
	public static final ResourceKey<Item> APPLE_CHEST_BOAT = create("apple_chest_boat");
	
	public static final ResourceKey<Item> ASPEN_BOAT = create("aspen_boat");
	public static final ResourceKey<Item> ASPEN_CHEST_BOAT = create("aspen_chest_boat");
	
	public static final ResourceKey<Item> BAOBAB_BOAT = create("baobab_boat");
	public static final ResourceKey<Item> BAOBAB_CHEST_BOAT = create("baobab_chest_boat");
	
	public static final ResourceKey<Item> BEECH_BOAT = create("beech_boat");
	public static final ResourceKey<Item> BEECH_CHEST_BOAT = create("beech_chest_boat");
	
	public static final ResourceKey<Item> CEDAR_BOAT = create("cedar_boat");
	public static final ResourceKey<Item> CEDAR_CHEST_BOAT = create("cedar_chest_boat");
	
	public static final ResourceKey<Item> CHERRY_BOAT = create("cherry_boat");
	public static final ResourceKey<Item> CHERRY_CHEST_BOAT = create("cherry_chest_boat");
	
	public static final ResourceKey<Item> CYPRESS_BOAT = create("cypress_boat");
	public static final ResourceKey<Item> CYPRESS_CHEST_BOAT = create("cypress_chest_boat");
	
	public static final ResourceKey<Item> EBONY_BOAT = create("ebony_boat");
	public static final ResourceKey<Item> EBONY_CHEST_BOAT = create("ebony_chest_boat");
	
	public static final ResourceKey<Item> ELM_BOAT = create("elm_boat");
	public static final ResourceKey<Item> ELM_CHEST_BOAT = create("elm_chest_boat");
	
	public static final ResourceKey<Item> EUCALYPTUS_BOAT = create("eucalyptus_boat");
	public static final ResourceKey<Item> EUCALYPTUS_CHEST_BOAT = create("eucalyptus_chest_boat");
	
	public static final ResourceKey<Item> FIG_BOAT = create("fig_boat");
	public static final ResourceKey<Item> FIG_CHEST_BOAT = create("fig_chest_boat");
	
	public static final ResourceKey<Item> FIR_BOAT = create("fir_boat");
	public static final ResourceKey<Item> FIR_CHEST_BOAT = create("fir_chest_boat");
	
	public static final ResourceKey<Item> HEMLOCK_BOAT = create("hemlock_boat");
	public static final ResourceKey<Item> HEMLOCK_CHEST_BOAT = create("hemlock_chest_boat");
	
	public static final ResourceKey<Item> HICKORY_BOAT = create("hickory_boat");
	public static final ResourceKey<Item> HICKORY_CHEST_BOAT = create("hickory_chest_boat");
	
	public static final ResourceKey<Item> JUNIPER_BOAT = create("juniper_boat");
	public static final ResourceKey<Item> JUNIPER_CHEST_BOAT = create("juniper_chest_boat");
	
	public static final ResourceKey<Item> KAPOK_BOAT = create("kapok_boat");
	public static final ResourceKey<Item> KAPOK_CHEST_BOAT = create("kapok_chest_boat");
	
	public static final ResourceKey<Item> LARCH_BOAT = create("larch_boat");
	public static final ResourceKey<Item> LARCH_CHEST_BOAT = create("larch_chest_boat");
	
	public static final ResourceKey<Item> MAHOGANY_BOAT = create("mahogany_boat");
	public static final ResourceKey<Item> MAHOGANY_CHEST_BOAT = create("mahogany_chest_boat");
	
	public static final ResourceKey<Item> MAPLE_BOAT = create("maple_boat");
	public static final ResourceKey<Item> MAPLE_CHEST_BOAT = create("maple_chest_boat");
	
	public static final ResourceKey<Item> MESQUITE_BOAT = create("mesquite_boat");
	public static final ResourceKey<Item> MESQUITE_CHEST_BOAT = create("mesquite_chest_boat");
	
	public static final ResourceKey<Item> OLIVE_BOAT = create("olive_boat");
	public static final ResourceKey<Item> OLIVE_CHEST_BOAT = create("olive_chest_boat");
	
	public static final ResourceKey<Item> PALM_BOAT = create("palm_boat");
	public static final ResourceKey<Item> PALM_CHEST_BOAT = create("palm_chest_boat");
	
	public static final ResourceKey<Item> PALO_VERDE_BOAT = create("palo_verde_boat");
	public static final ResourceKey<Item> PALO_VERDE_CHEST_BOAT = create("palo_verde_chest_boat");
	
	public static final ResourceKey<Item> PINE_BOAT = create("pine_boat");
	public static final ResourceKey<Item> PINE_CHEST_BOAT = create("pine_chest_boat");
	
	public static final ResourceKey<Item> REDWOOD_BOAT = create("redwood_boat");
	public static final ResourceKey<Item> REDWOOD_CHEST_BOAT = create("redwood_chest_boat");
	
	public static final ResourceKey<Item> SEQUOIA_BOAT = create("sequoia_boat");
	public static final ResourceKey<Item> SEQUOIA_CHEST_BOAT = create("sequoia_chest_boat");
	
	public static final ResourceKey<Item> WILLOW_BOAT = create("willow_boat");
	public static final ResourceKey<Item> WILLOW_CHEST_BOAT = create("willow_chest_boat");
	
	//' ------------------------------------------------------------------------------------------------------------------------------------------------
	
	public static final ResourceKey<Item> ACORN = create("acorn");
	public static final ResourceKey<Item> BAOBAB_FRUIT = create("baobab_fruit");
	public static final ResourceKey<Item> CHERRY = create("cherry");
	public static final ResourceKey<Item> COCONUT = create("coconut");
	public static final ResourceKey<Item> DATE = create("date");
	public static final ResourceKey<Item> FIG = create("fig");
	public static final ResourceKey<Item> OLIVE = create("olive");
	public static final ResourceKey<Item> PECAN = create("pecan");
	public static final ResourceKey<Item> PERSIMMON = create("persimmon");
	
	//` ---------------------------------------------------------------------------------------------------------------------------------------------------
	
	private static ResourceKey<Item> create(final String name) {
		return ResourceKey.create(Registries.ITEM, AWorldReimagined.id(name));
	}
}
