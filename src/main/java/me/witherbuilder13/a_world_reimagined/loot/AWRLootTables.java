package me.witherbuilder13.a_world_reimagined.loot;

import me.witherbuilder13.a_world_reimagined.AWorldReimagined;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootTable;

public class AWRLootTables {
	
	public static final ResourceKey<LootTable> HARVEST_APPLE_LEAVES = register("harvest/apple_leaves");
	public static final ResourceKey<LootTable> HARVEST_CHERRY_LEAVES = register("harvest/cherry_leaves");
	public static final ResourceKey<LootTable> HARVEST_EBONY_LEAVES = register("harvest/ebony_leaves");
	public static final ResourceKey<LootTable> HARVEST_FIG_LEAVES = register("harvest/fig_leaves");
	public static final ResourceKey<LootTable> HARVEST_HICKORY_LEAVES = register("harvest/hickory_leaves");
	public static final ResourceKey<LootTable> HARVEST_OLIVE_LEAVES = register("harvest/olive_leaves");
	
	private static ResourceKey<LootTable> register(String key) {
		return ResourceKey.create(Registries.LOOT_TABLE, AWorldReimagined.id(key));
	}
}
