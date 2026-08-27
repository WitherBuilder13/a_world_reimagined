package me.witherbuilder13.a_world_reimagined.entity;

import me.witherbuilder13.a_world_reimagined.AWorldReimagined;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;

public class AWREntityTypeIds {
	
	public static ResourceKey<EntityType<?>> ASPEN_BOAT = create("aspen_boat");
	public static ResourceKey<EntityType<?>> ASPEN_CHEST_BOAT = create("aspen_chest_boat");
	public static ResourceKey<EntityType<?>> CEDAR_BOAT = create("cedar_boat");
	public static ResourceKey<EntityType<?>> CEDAR_CHEST_BOAT = create("cedar_chest_boat");
	public static ResourceKey<EntityType<?>> FIR_BOAT = create("fir_boat");
	public static ResourceKey<EntityType<?>> FIR_CHEST_BOAT = create("fir_chest_boat");
	public static ResourceKey<EntityType<?>> HEMLOCK_BOAT = create("hemlock_boat");
	public static ResourceKey<EntityType<?>> HEMLOCK_CHEST_BOAT = create("hemlock_chest_boat");
	public static ResourceKey<EntityType<?>> LARCH_BOAT = create("larch_boat");
	public static ResourceKey<EntityType<?>> LARCH_CHEST_BOAT = create("larch_chest_boat");
	public static ResourceKey<EntityType<?>> PINE_BOAT = create("pine_boat");
	public static ResourceKey<EntityType<?>> PINE_CHEST_BOAT = create("pine_chest_boat");
	public static ResourceKey<EntityType<?>> REDWOOD_BOAT = create("redwood_boat");
	public static ResourceKey<EntityType<?>> REDWOOD_CHEST_BOAT = create("redwood_chest_boat");
	public static ResourceKey<EntityType<?>> SEQUOIA_BOAT = create("sequoia_boat");
	public static ResourceKey<EntityType<?>> SEQUOIA_CHEST_BOAT = create("sequoia_chest_boat");
	
	private static ResourceKey<EntityType<?>> create(final String name) {
		return ResourceKey.create(Registries.ENTITY_TYPE, AWorldReimagined.id(name));
	}
}