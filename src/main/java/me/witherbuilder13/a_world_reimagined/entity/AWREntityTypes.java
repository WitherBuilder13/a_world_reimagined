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
	
	public static final EntityType<Boat> ALDER_BOAT = register(
			AWREntityTypeIds.ALDER_BOAT,
			EntityType.Builder.of(boatFactory(() -> AWRItems.ALDER_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<ChestBoat> ALDER_CHEST_BOAT = register(
			AWREntityTypeIds.ALDER_CHEST_BOAT,
			EntityType.Builder.of(chestBoatFactory(() -> AWRItems.ALDER_CHEST_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	
	public static final EntityType<Boat> APPLE_BOAT = register(
			AWREntityTypeIds.APPLE_BOAT,
			EntityType.Builder.of(boatFactory(() -> AWRItems.APPLE_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<ChestBoat> APPLE_CHEST_BOAT = register(
			AWREntityTypeIds.APPLE_CHEST_BOAT,
			EntityType.Builder.of(chestBoatFactory(() -> AWRItems.APPLE_CHEST_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	
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
	
	public static final EntityType<Boat> BAOBAB_BOAT = register(
			AWREntityTypeIds.BAOBAB_BOAT,
			EntityType.Builder.of(boatFactory(() -> AWRItems.BAOBAB_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<ChestBoat> BAOBAB_CHEST_BOAT = register(
			AWREntityTypeIds.BAOBAB_CHEST_BOAT,
			EntityType.Builder.of(chestBoatFactory(() -> AWRItems.BAOBAB_CHEST_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	
	public static final EntityType<Boat> BEECH_BOAT = register(
			AWREntityTypeIds.BEECH_BOAT,
			EntityType.Builder.of(boatFactory(() -> AWRItems.BEECH_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<ChestBoat> BEECH_CHEST_BOAT = register(
			AWREntityTypeIds.BEECH_CHEST_BOAT,
			EntityType.Builder.of(chestBoatFactory(() -> AWRItems.BEECH_CHEST_BOAT), MobCategory.MISC)
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
	
	public static final EntityType<Boat> CHERRY_BOAT = register(
			AWREntityTypeIds.CHERRY_BOAT,
			EntityType.Builder.of(boatFactory(() -> AWRItems.CHERRY_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<ChestBoat> CHERRY_CHEST_BOAT = register(
			AWREntityTypeIds.CHERRY_CHEST_BOAT,
			EntityType.Builder.of(chestBoatFactory(() -> AWRItems.CHERRY_CHEST_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	
	public static final EntityType<Boat> CYPRESS_BOAT = register(
			AWREntityTypeIds.CYPRESS_BOAT,
			EntityType.Builder.of(boatFactory(() -> AWRItems.CYPRESS_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<ChestBoat> CYPRESS_CHEST_BOAT = register(
			AWREntityTypeIds.CYPRESS_CHEST_BOAT,
			EntityType.Builder.of(chestBoatFactory(() -> AWRItems.CYPRESS_CHEST_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	
	public static final EntityType<Boat> EBONY_BOAT = register(
			AWREntityTypeIds.EBONY_BOAT,
			EntityType.Builder.of(boatFactory(() -> AWRItems.EBONY_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<ChestBoat> EBONY_CHEST_BOAT = register(
			AWREntityTypeIds.EBONY_CHEST_BOAT,
			EntityType.Builder.of(chestBoatFactory(() -> AWRItems.EBONY_CHEST_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	
	public static final EntityType<Boat> ELM_BOAT = register(
			AWREntityTypeIds.ELM_BOAT,
			EntityType.Builder.of(boatFactory(() -> AWRItems.ELM_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<ChestBoat> ELM_CHEST_BOAT = register(
			AWREntityTypeIds.ELM_CHEST_BOAT,
			EntityType.Builder.of(chestBoatFactory(() -> AWRItems.ELM_CHEST_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	
	public static final EntityType<Boat> EUCALYPTUS_BOAT = register(
			AWREntityTypeIds.EUCALYPTUS_BOAT,
			EntityType.Builder.of(boatFactory(() -> AWRItems.EUCALYPTUS_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<ChestBoat> EUCALYPTUS_CHEST_BOAT = register(
			AWREntityTypeIds.EUCALYPTUS_CHEST_BOAT,
			EntityType.Builder.of(chestBoatFactory(() -> AWRItems.EUCALYPTUS_CHEST_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	
	public static final EntityType<Boat> FIG_BOAT = register(
			AWREntityTypeIds.FIG_BOAT,
			EntityType.Builder.of(boatFactory(() -> AWRItems.FIG_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<ChestBoat> FIG_CHEST_BOAT = register(
			AWREntityTypeIds.FIG_CHEST_BOAT,
			EntityType.Builder.of(chestBoatFactory(() -> AWRItems.FIG_CHEST_BOAT), MobCategory.MISC)
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
	
	public static final EntityType<Boat> HICKORY_BOAT = register(
			AWREntityTypeIds.HICKORY_BOAT,
			EntityType.Builder.of(boatFactory(() -> AWRItems.HICKORY_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<ChestBoat> HICKORY_CHEST_BOAT = register(
			AWREntityTypeIds.HICKORY_CHEST_BOAT,
			EntityType.Builder.of(chestBoatFactory(() -> AWRItems.HICKORY_CHEST_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	
	public static final EntityType<Boat> JUNIPER_BOAT = register(
			AWREntityTypeIds.JUNIPER_BOAT,
			EntityType.Builder.of(boatFactory(() -> AWRItems.JUNIPER_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<ChestBoat> JUNIPER_CHEST_BOAT = register(
			AWREntityTypeIds.JUNIPER_CHEST_BOAT,
			EntityType.Builder.of(chestBoatFactory(() -> AWRItems.JUNIPER_CHEST_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	
	public static final EntityType<Boat> KAPOK_BOAT = register(
			AWREntityTypeIds.KAPOK_BOAT,
			EntityType.Builder.of(boatFactory(() -> AWRItems.KAPOK_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<ChestBoat> KAPOK_CHEST_BOAT = register(
			AWREntityTypeIds.KAPOK_CHEST_BOAT,
			EntityType.Builder.of(chestBoatFactory(() -> AWRItems.KAPOK_CHEST_BOAT), MobCategory.MISC)
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
	
	public static final EntityType<Boat> MAHOGANY_BOAT = register(
			AWREntityTypeIds.MAHOGANY_BOAT,
			EntityType.Builder.of(boatFactory(() -> AWRItems.MAHOGANY_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<ChestBoat> MAHOGANY_CHEST_BOAT = register(
			AWREntityTypeIds.MAHOGANY_CHEST_BOAT,
			EntityType.Builder.of(chestBoatFactory(() -> AWRItems.MAHOGANY_CHEST_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	
	public static final EntityType<Boat> MAPLE_BOAT = register(
			AWREntityTypeIds.MAPLE_BOAT,
			EntityType.Builder.of(boatFactory(() -> AWRItems.MAPLE_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<ChestBoat> MAPLE_CHEST_BOAT = register(
			AWREntityTypeIds.MAPLE_CHEST_BOAT,
			EntityType.Builder.of(chestBoatFactory(() -> AWRItems.MAPLE_CHEST_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	
	public static final EntityType<Boat> MESQUITE_BOAT = register(
			AWREntityTypeIds.MESQUITE_BOAT,
			EntityType.Builder.of(boatFactory(() -> AWRItems.MESQUITE_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<ChestBoat> MESQUITE_CHEST_BOAT = register(
			AWREntityTypeIds.MESQUITE_CHEST_BOAT,
			EntityType.Builder.of(chestBoatFactory(() -> AWRItems.MESQUITE_CHEST_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	
	public static final EntityType<Boat> OLIVE_BOAT = register(
			AWREntityTypeIds.OLIVE_BOAT,
			EntityType.Builder.of(boatFactory(() -> AWRItems.OLIVE_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<ChestBoat> OLIVE_CHEST_BOAT = register(
			AWREntityTypeIds.OLIVE_CHEST_BOAT,
			EntityType.Builder.of(chestBoatFactory(() -> AWRItems.OLIVE_CHEST_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	
	public static final EntityType<Boat> PALM_BOAT = register(
			AWREntityTypeIds.PALM_BOAT,
			EntityType.Builder.of(boatFactory(() -> AWRItems.PALM_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<ChestBoat> PALM_CHEST_BOAT = register(
			AWREntityTypeIds.PALM_CHEST_BOAT,
			EntityType.Builder.of(chestBoatFactory(() -> AWRItems.PALM_CHEST_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	
	public static final EntityType<Boat> PALO_VERDE_BOAT = register(
			AWREntityTypeIds.PALO_VERDE_BOAT,
			EntityType.Builder.of(boatFactory(() -> AWRItems.PALO_VERDE_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<ChestBoat> PALO_VERDE_CHEST_BOAT = register(
			AWREntityTypeIds.PALO_VERDE_CHEST_BOAT,
			EntityType.Builder.of(chestBoatFactory(() -> AWRItems.PALO_VERDE_CHEST_BOAT), MobCategory.MISC)
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
	
	public static final EntityType<Boat> WILLOW_BOAT = register(
			AWREntityTypeIds.WILLOW_BOAT,
			EntityType.Builder.of(boatFactory(() -> AWRItems.WILLOW_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	public static final EntityType<ChestBoat> WILLOW_CHEST_BOAT = register(
			AWREntityTypeIds.WILLOW_CHEST_BOAT,
			EntityType.Builder.of(chestBoatFactory(() -> AWRItems.WILLOW_CHEST_BOAT), MobCategory.MISC)
					.noLootTable()
					.sized(1.375F, 0.5625F)
					.eyeHeight(0.5625F)
					.clientTrackingRange(10)
	);
	
	//` ------------------------------------------------------------------------------------------------------------------------------------------------
	
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
