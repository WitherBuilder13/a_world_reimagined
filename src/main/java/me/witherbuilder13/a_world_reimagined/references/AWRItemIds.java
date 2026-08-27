package me.witherbuilder13.a_world_reimagined.references;

import me.witherbuilder13.a_world_reimagined.AWorldReimagined;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class AWRItemIds {
	public static final ResourceKey<Item> ASPEN_BOAT = create("aspen_boat");
	public static final ResourceKey<Item> ASPEN_CHEST_BOAT = create("aspen_chest_boat");
	public static final ResourceKey<Item> CEDAR_BOAT = create("cedar_boat");
	public static final ResourceKey<Item> CEDAR_CHEST_BOAT = create("cedar_chest_boat");
	public static final ResourceKey<Item> FIR_BOAT = create("fir_boat");
	public static final ResourceKey<Item> FIR_CHEST_BOAT = create("fir_chest_boat");
	public static final ResourceKey<Item> HEMLOCK_BOAT = create("hemlock_boat");
	public static final ResourceKey<Item> HEMLOCK_CHEST_BOAT = create("hemlock_chest_boat");
	public static final ResourceKey<Item> LARCH_BOAT = create("larch_boat");
	public static final ResourceKey<Item> LARCH_CHEST_BOAT = create("larch_chest_boat");
	public static final ResourceKey<Item> PINE_BOAT = create("pine_boat");
	public static final ResourceKey<Item> PINE_CHEST_BOAT = create("pine_chest_boat");
	public static final ResourceKey<Item> REDWOOD_BOAT = create("redwood_boat");
	public static final ResourceKey<Item> REDWOOD_CHEST_BOAT = create("redwood_chest_boat");
	public static final ResourceKey<Item> SEQUOIA_BOAT = create("sequoia_boat");
	public static final ResourceKey<Item> SEQUOIA_CHEST_BOAT = create("sequoia_chest_boat");
	
	public static final ResourceKey<Item> QUICKSAND_BUCKET = create("quicksand_bucket");
	
	private static ResourceKey<Item> create(final String name) {
		return ResourceKey.create(Registries.ITEM, AWorldReimagined.id(name));
	}
}
