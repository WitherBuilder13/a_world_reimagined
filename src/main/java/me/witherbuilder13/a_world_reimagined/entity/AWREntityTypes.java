package me.witherbuilder13.a_world_reimagined.entity;

import me.witherbuilder13.a_world_reimagined.item.AWRItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class AWREntityTypes {
	
	public static final EntityType<Boat> ASPEN_BOAT = register(
			AWREntityTypeIds.ASPEN_BOAT,
			EntityType.Builder.of(boatFactory(() -> AWRItems.ASPEN_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<ChestBoat> ASPEN_CHEST_BOAT = register(
			AWREntityTypeIds.ASPEN_CHEST_BOAT,
			EntityType.Builder.of(chestBoatFactory(() -> AWRItems.ASPEN_CHEST_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<Boat> CEDAR_BOAT = register(
			AWREntityTypeIds.CEDAR_BOAT,
			EntityType.Builder.of(boatFactory(() -> AWRItems.CEDAR_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<ChestBoat> CEDAR_CHEST_BOAT = register(
			AWREntityTypeIds.CEDAR_CHEST_BOAT,
			EntityType.Builder.of(chestBoatFactory(() -> AWRItems.CEDAR_CHEST_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<Boat> FIR_BOAT = register(
			AWREntityTypeIds.FIR_BOAT,
			EntityType.Builder.of(boatFactory(() -> AWRItems.FIR_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<ChestBoat> FIR_CHEST_BOAT = register(
			AWREntityTypeIds.FIR_CHEST_BOAT,
			EntityType.Builder.of(chestBoatFactory(() -> AWRItems.FIR_CHEST_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<Boat> HEMLOCK_BOAT = register(
			AWREntityTypeIds.HEMLOCK_BOAT,
			EntityType.Builder.of(boatFactory(() -> AWRItems.HEMLOCK_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<ChestBoat> HEMLOCK_CHEST_BOAT = register(
			AWREntityTypeIds.HEMLOCK_CHEST_BOAT,
			EntityType.Builder.of(chestBoatFactory(() -> AWRItems.HEMLOCK_CHEST_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<Boat> LARCH_BOAT = register(
			AWREntityTypeIds.LARCH_BOAT,
			EntityType.Builder.of(boatFactory(() -> AWRItems.LARCH_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<ChestBoat> LARCH_CHEST_BOAT = register(
			AWREntityTypeIds.LARCH_CHEST_BOAT,
			EntityType.Builder.of(chestBoatFactory(() -> AWRItems.LARCH_CHEST_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<Boat> PINE_BOAT = register(
			AWREntityTypeIds.PINE_BOAT,
			EntityType.Builder.of(boatFactory(() -> AWRItems.PINE_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<ChestBoat> PINE_CHEST_BOAT = register(
			AWREntityTypeIds.PINE_CHEST_BOAT,
			EntityType.Builder.of(chestBoatFactory(() -> AWRItems.PINE_CHEST_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<Boat> REDWOOD_BOAT = register(
			AWREntityTypeIds.REDWOOD_BOAT,
			EntityType.Builder.of(boatFactory(() -> AWRItems.REDWOOD_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<ChestBoat> REDWOOD_CHEST_BOAT = register(
			AWREntityTypeIds.REDWOOD_CHEST_BOAT,
			EntityType.Builder.of(chestBoatFactory(() -> AWRItems.REDWOOD_CHEST_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<Boat> SEQUOIA_BOAT = register(
			AWREntityTypeIds.SEQUOIA_BOAT,
			EntityType.Builder.of(boatFactory(() -> AWRItems.SEQUOIA_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<ChestBoat> SEQUOIA_CHEST_BOAT = register(
			AWREntityTypeIds.SEQUOIA_CHEST_BOAT,
			EntityType.Builder.of(chestBoatFactory(() -> AWRItems.SEQUOIA_CHEST_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	
	
	private static EntityType.EntityFactory<Boat> boatFactory(final Supplier<Item> boatItem) {
		return (entityType, level) -> new Boat(entityType, level, boatItem);
	}
	
	private static EntityType.EntityFactory<ChestBoat> chestBoatFactory(final Supplier<Item> dropItem) {
		return (entityType, level) -> new ChestBoat(entityType, level, dropItem);
	}
	
	private static <T extends Entity> EntityType<T> register(final ResourceKey<EntityType<?>> id, final EntityType.Builder<T> builder) {
		return Registry.register(BuiltInRegistries.ENTITY_TYPE, id, builder.build(id));
	}
	
	public static void init() {
	
	}
}
