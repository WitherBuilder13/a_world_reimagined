package me.witherbuilder13.a_world_reimagined.item;

import me.witherbuilder13.a_world_reimagined.block.AWRBlocks;
import me.witherbuilder13.a_world_reimagined.entity.AWREntityTypes;
import me.witherbuilder13.a_world_reimagined.references.AWRBlockItemIds;
import me.witherbuilder13.a_world_reimagined.references.AWRItemIds;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.ItemContainerContents;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class AWRItems {
    
    public static final Item ALDER_LOG = registerBlock(
            AWRBlockItemIds.ALDER_LOG, AWRBlocks.ALDER_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item ALDER_WOOD = registerBlock(
            AWRBlockItemIds.ALDER_WOOD, AWRBlocks.ALDER_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_ALDER_LOG = registerBlock(
            AWRBlockItemIds.STRIPPED_ALDER_LOG, AWRBlocks.STRIPPED_ALDER_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_ALDER_WOOD = registerBlock(
            AWRBlockItemIds.STRIPPED_ALDER_WOOD, AWRBlocks.STRIPPED_ALDER_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item ALDER_PLANKS = registerBlock(
            AWRBlockItemIds.ALDER_PLANKS, AWRBlocks.ALDER_PLANKS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item ALDER_STAIRS = registerBlock(
            AWRBlockItemIds.ALDER_STAIRS, AWRBlocks.ALDER_STAIRS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item ALDER_SLAB = registerBlock(
            AWRBlockItemIds.ALDER_SLAB, AWRBlocks.ALDER_SLAB, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS)
    );
    public static final Item ALDER_FENCE = registerBlock(
            AWRBlockItemIds.ALDER_FENCE, AWRBlocks.ALDER_FENCE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item ALDER_FENCE_GATE = registerBlock(
            AWRBlockItemIds.ALDER_FENCE_GATE, AWRBlocks.ALDER_FENCE_GATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item ALDER_DOOR = registerBlock(
            AWRBlockItemIds.ALDER_DOOR, AWRBlocks.ALDER_DOOR, (b, p) -> new DoubleHighBlockItem(b, p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE))
    );
    public static final Item ALDER_TRAPDOOR = registerBlock(
            AWRBlockItemIds.ALDER_TRAPDOOR, AWRBlocks.ALDER_TRAPDOOR, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item ALDER_PRESSURE_PLATE = registerBlock(
            AWRBlockItemIds.ALDER_PRESSURE_PLATE, AWRBlocks.ALDER_PRESSURE_PLATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item ALDER_BUTTON = registerBlock(
            AWRBlockItemIds.ALDER_BUTTON, AWRBlocks.ALDER_BUTTON, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)
    );
    public static final Item ALDER_SIGN = registerBlock(
            AWRBlockItemIds.ALDER_SIGN, AWRBlocks.ALDER_SIGN,
            (b, p) -> new StandingAndWallBlockItem(b, AWRBlocks.ALDER_WALL_SIGN, Direction.DOWN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item ALDER_HANGING_SIGN = registerBlock(
            AWRBlockItemIds.ALDER_HANGING_SIGN, AWRBlocks.ALDER_HANGING_SIGN,
            (b, p) -> new HangingSignItem(b, AWRBlocks.ALDER_WALL_HANGING_SIGN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item ALDER_SHELF = registerBlock(
            AWRBlockItemIds.ALDER_SHELF, AWRBlocks.ALDER_SHELF,
            p -> p.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item ALDER_LEAVES = registerBlock(
            AWRBlockItemIds.ALDER_LEAVES, AWRBlocks.ALDER_LEAVES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item ALDER_SAPLING = registerBlock(
            AWRBlockItemIds.ALDER_SAPLING, AWRBlocks.ALDER_SAPLING,
            p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item ALDER_BOAT = registerItem(
            AWRItemIds.ALDER_BOAT,
            p -> new BoatItem(AWREntityTypes.ALDER_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    public static final Item ALDER_CHEST_BOAT = registerItem(
            AWRItemIds.ALDER_CHEST_BOAT,
            p -> new BoatItem(AWREntityTypes.ALDER_CHEST_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Item APPLE_LOG = registerBlock(
            AWRBlockItemIds.APPLE_LOG, AWRBlocks.APPLE_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item APPLE_WOOD = registerBlock(
            AWRBlockItemIds.APPLE_WOOD, AWRBlocks.APPLE_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_APPLE_LOG = registerBlock(
            AWRBlockItemIds.STRIPPED_APPLE_LOG, AWRBlocks.STRIPPED_APPLE_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_APPLE_WOOD = registerBlock(
            AWRBlockItemIds.STRIPPED_APPLE_WOOD, AWRBlocks.STRIPPED_APPLE_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item APPLE_PLANKS = registerBlock(
            AWRBlockItemIds.APPLE_PLANKS, AWRBlocks.APPLE_PLANKS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item APPLE_STAIRS = registerBlock(
            AWRBlockItemIds.APPLE_STAIRS, AWRBlocks.APPLE_STAIRS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item APPLE_SLAB = registerBlock(
            AWRBlockItemIds.APPLE_SLAB, AWRBlocks.APPLE_SLAB, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS)
    );
    public static final Item APPLE_FENCE = registerBlock(
            AWRBlockItemIds.APPLE_FENCE, AWRBlocks.APPLE_FENCE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item APPLE_FENCE_GATE = registerBlock(
            AWRBlockItemIds.APPLE_FENCE_GATE, AWRBlocks.APPLE_FENCE_GATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item APPLE_DOOR = registerBlock(
            AWRBlockItemIds.APPLE_DOOR, AWRBlocks.APPLE_DOOR, (b, p) -> new DoubleHighBlockItem(b, p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE))
    );
    public static final Item APPLE_TRAPDOOR = registerBlock(
            AWRBlockItemIds.APPLE_TRAPDOOR, AWRBlocks.APPLE_TRAPDOOR, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item APPLE_PRESSURE_PLATE = registerBlock(
            AWRBlockItemIds.APPLE_PRESSURE_PLATE, AWRBlocks.APPLE_PRESSURE_PLATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item APPLE_BUTTON = registerBlock(
            AWRBlockItemIds.APPLE_BUTTON, AWRBlocks.APPLE_BUTTON, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)
    );
    public static final Item APPLE_SIGN = registerBlock(
            AWRBlockItemIds.APPLE_SIGN, AWRBlocks.APPLE_SIGN,
            (b, p) -> new StandingAndWallBlockItem(b, AWRBlocks.APPLE_WALL_SIGN, Direction.DOWN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item APPLE_HANGING_SIGN = registerBlock(
            AWRBlockItemIds.APPLE_HANGING_SIGN, AWRBlocks.APPLE_HANGING_SIGN,
            (b, p) -> new HangingSignItem(b, AWRBlocks.APPLE_WALL_HANGING_SIGN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item APPLE_SHELF = registerBlock(
            AWRBlockItemIds.APPLE_SHELF, AWRBlocks.APPLE_SHELF,
            p -> p.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item APPLE_LEAVES = registerBlock(
            AWRBlockItemIds.APPLE_LEAVES, AWRBlocks.APPLE_LEAVES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item APPLE_SAPLING = registerBlock(
            AWRBlockItemIds.APPLE_SAPLING, AWRBlocks.APPLE_SAPLING,
            p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item APPLE_BOAT = registerItem(
            AWRItemIds.APPLE_BOAT,
            p -> new BoatItem(AWREntityTypes.APPLE_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    public static final Item APPLE_CHEST_BOAT = registerItem(
            AWRItemIds.APPLE_CHEST_BOAT,
            p -> new BoatItem(AWREntityTypes.APPLE_CHEST_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Item ASPEN_LOG = registerBlock(
            AWRBlockItemIds.ASPEN_LOG, AWRBlocks.ASPEN_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item ASPEN_WOOD = registerBlock(
            AWRBlockItemIds.ASPEN_WOOD, AWRBlocks.ASPEN_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_ASPEN_LOG = registerBlock(
            AWRBlockItemIds.STRIPPED_ASPEN_LOG, AWRBlocks.STRIPPED_ASPEN_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_ASPEN_WOOD = registerBlock(
            AWRBlockItemIds.STRIPPED_ASPEN_WOOD, AWRBlocks.STRIPPED_ASPEN_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item ASPEN_PLANKS = registerBlock(
            AWRBlockItemIds.ASPEN_PLANKS, AWRBlocks.ASPEN_PLANKS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item ASPEN_STAIRS = registerBlock(
            AWRBlockItemIds.ASPEN_STAIRS, AWRBlocks.ASPEN_STAIRS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item ASPEN_SLAB = registerBlock(
            AWRBlockItemIds.ASPEN_SLAB, AWRBlocks.ASPEN_SLAB, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS)
    );
    public static final Item ASPEN_FENCE = registerBlock(
            AWRBlockItemIds.ASPEN_FENCE, AWRBlocks.ASPEN_FENCE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item ASPEN_FENCE_GATE = registerBlock(
            AWRBlockItemIds.ASPEN_FENCE_GATE, AWRBlocks.ASPEN_FENCE_GATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item ASPEN_DOOR = registerBlock(
            AWRBlockItemIds.ASPEN_DOOR, AWRBlocks.ASPEN_DOOR, (b, p) -> new DoubleHighBlockItem(b, p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE))
    );
    public static final Item ASPEN_TRAPDOOR = registerBlock(
            AWRBlockItemIds.ASPEN_TRAPDOOR, AWRBlocks.ASPEN_TRAPDOOR, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item ASPEN_PRESSURE_PLATE = registerBlock(
            AWRBlockItemIds.ASPEN_PRESSURE_PLATE, AWRBlocks.ASPEN_PRESSURE_PLATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item ASPEN_BUTTON = registerBlock(
            AWRBlockItemIds.ASPEN_BUTTON, AWRBlocks.ASPEN_BUTTON, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)
    );
    public static final Item ASPEN_SIGN = registerBlock(
            AWRBlockItemIds.ASPEN_SIGN, AWRBlocks.ASPEN_SIGN,
            (b, p) -> new StandingAndWallBlockItem(b, AWRBlocks.ASPEN_WALL_SIGN, Direction.DOWN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item ASPEN_HANGING_SIGN = registerBlock(
            AWRBlockItemIds.ASPEN_HANGING_SIGN, AWRBlocks.ASPEN_HANGING_SIGN,
            (b, p) -> new HangingSignItem(b, AWRBlocks.ASPEN_WALL_HANGING_SIGN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item ASPEN_SHELF = registerBlock(
            AWRBlockItemIds.ASPEN_SHELF, AWRBlocks.ASPEN_SHELF,
            p -> p.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item ASPEN_LEAVES = registerBlock(
            AWRBlockItemIds.ASPEN_LEAVES, AWRBlocks.ASPEN_LEAVES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item ASPEN_SAPLING = registerBlock(
            AWRBlockItemIds.ASPEN_SAPLING, AWRBlocks.ASPEN_SAPLING,
            p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item ASPEN_BOAT = registerItem(
            AWRItemIds.ASPEN_BOAT,
            p -> new BoatItem(AWREntityTypes.ASPEN_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    public static final Item ASPEN_CHEST_BOAT = registerItem(
            AWRItemIds.ASPEN_CHEST_BOAT,
            p -> new BoatItem(AWREntityTypes.ASPEN_CHEST_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Item BAOBAB_LOG = registerBlock(
            AWRBlockItemIds.BAOBAB_LOG, AWRBlocks.BAOBAB_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item BAOBAB_WOOD = registerBlock(
            AWRBlockItemIds.BAOBAB_WOOD, AWRBlocks.BAOBAB_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_BAOBAB_LOG = registerBlock(
            AWRBlockItemIds.STRIPPED_BAOBAB_LOG, AWRBlocks.STRIPPED_BAOBAB_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_BAOBAB_WOOD = registerBlock(
            AWRBlockItemIds.STRIPPED_BAOBAB_WOOD, AWRBlocks.STRIPPED_BAOBAB_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item BAOBAB_PLANKS = registerBlock(
            AWRBlockItemIds.BAOBAB_PLANKS, AWRBlocks.BAOBAB_PLANKS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item BAOBAB_STAIRS = registerBlock(
            AWRBlockItemIds.BAOBAB_STAIRS, AWRBlocks.BAOBAB_STAIRS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item BAOBAB_SLAB = registerBlock(
            AWRBlockItemIds.BAOBAB_SLAB, AWRBlocks.BAOBAB_SLAB, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS)
    );
    public static final Item BAOBAB_FENCE = registerBlock(
            AWRBlockItemIds.BAOBAB_FENCE, AWRBlocks.BAOBAB_FENCE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item BAOBAB_FENCE_GATE = registerBlock(
            AWRBlockItemIds.BAOBAB_FENCE_GATE, AWRBlocks.BAOBAB_FENCE_GATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item BAOBAB_DOOR = registerBlock(
            AWRBlockItemIds.BAOBAB_DOOR, AWRBlocks.BAOBAB_DOOR, (b, p) -> new DoubleHighBlockItem(b, p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE))
    );
    public static final Item BAOBAB_TRAPDOOR = registerBlock(
            AWRBlockItemIds.BAOBAB_TRAPDOOR, AWRBlocks.BAOBAB_TRAPDOOR, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item BAOBAB_PRESSURE_PLATE = registerBlock(
            AWRBlockItemIds.BAOBAB_PRESSURE_PLATE, AWRBlocks.BAOBAB_PRESSURE_PLATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item BAOBAB_BUTTON = registerBlock(
            AWRBlockItemIds.BAOBAB_BUTTON, AWRBlocks.BAOBAB_BUTTON, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)
    );
    public static final Item BAOBAB_SIGN = registerBlock(
            AWRBlockItemIds.BAOBAB_SIGN, AWRBlocks.BAOBAB_SIGN,
            (b, p) -> new StandingAndWallBlockItem(b, AWRBlocks.BAOBAB_WALL_SIGN, Direction.DOWN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item BAOBAB_HANGING_SIGN = registerBlock(
            AWRBlockItemIds.BAOBAB_HANGING_SIGN, AWRBlocks.BAOBAB_HANGING_SIGN,
            (b, p) -> new HangingSignItem(b, AWRBlocks.BAOBAB_WALL_HANGING_SIGN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item BAOBAB_SHELF = registerBlock(
            AWRBlockItemIds.BAOBAB_SHELF, AWRBlocks.BAOBAB_SHELF,
            p -> p.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item BAOBAB_LEAVES = registerBlock(
            AWRBlockItemIds.BAOBAB_LEAVES, AWRBlocks.BAOBAB_LEAVES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item BAOBAB_SAPLING = registerBlock(
            AWRBlockItemIds.BAOBAB_SAPLING, AWRBlocks.BAOBAB_SAPLING,
            p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item BAOBAB_BOAT = registerItem(
            AWRItemIds.BAOBAB_BOAT,
            p -> new BoatItem(AWREntityTypes.BAOBAB_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    public static final Item BAOBAB_CHEST_BOAT = registerItem(
            AWRItemIds.BAOBAB_CHEST_BOAT,
            p -> new BoatItem(AWREntityTypes.BAOBAB_CHEST_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Item BEECH_LOG = registerBlock(
            AWRBlockItemIds.BEECH_LOG, AWRBlocks.BEECH_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item BEECH_WOOD = registerBlock(
            AWRBlockItemIds.BEECH_WOOD, AWRBlocks.BEECH_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_BEECH_LOG = registerBlock(
            AWRBlockItemIds.STRIPPED_BEECH_LOG, AWRBlocks.STRIPPED_BEECH_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_BEECH_WOOD = registerBlock(
            AWRBlockItemIds.STRIPPED_BEECH_WOOD, AWRBlocks.STRIPPED_BEECH_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item BEECH_PLANKS = registerBlock(
            AWRBlockItemIds.BEECH_PLANKS, AWRBlocks.BEECH_PLANKS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item BEECH_STAIRS = registerBlock(
            AWRBlockItemIds.BEECH_STAIRS, AWRBlocks.BEECH_STAIRS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item BEECH_SLAB = registerBlock(
            AWRBlockItemIds.BEECH_SLAB, AWRBlocks.BEECH_SLAB, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS)
    );
    public static final Item BEECH_FENCE = registerBlock(
            AWRBlockItemIds.BEECH_FENCE, AWRBlocks.BEECH_FENCE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item BEECH_FENCE_GATE = registerBlock(
            AWRBlockItemIds.BEECH_FENCE_GATE, AWRBlocks.BEECH_FENCE_GATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item BEECH_DOOR = registerBlock(
            AWRBlockItemIds.BEECH_DOOR, AWRBlocks.BEECH_DOOR, (b, p) -> new DoubleHighBlockItem(b, p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE))
    );
    public static final Item BEECH_TRAPDOOR = registerBlock(
            AWRBlockItemIds.BEECH_TRAPDOOR, AWRBlocks.BEECH_TRAPDOOR, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item BEECH_PRESSURE_PLATE = registerBlock(
            AWRBlockItemIds.BEECH_PRESSURE_PLATE, AWRBlocks.BEECH_PRESSURE_PLATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item BEECH_BUTTON = registerBlock(
            AWRBlockItemIds.BEECH_BUTTON, AWRBlocks.BEECH_BUTTON, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)
    );
    public static final Item BEECH_SIGN = registerBlock(
            AWRBlockItemIds.BEECH_SIGN, AWRBlocks.BEECH_SIGN,
            (b, p) -> new StandingAndWallBlockItem(b, AWRBlocks.BEECH_WALL_SIGN, Direction.DOWN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item BEECH_HANGING_SIGN = registerBlock(
            AWRBlockItemIds.BEECH_HANGING_SIGN, AWRBlocks.BEECH_HANGING_SIGN,
            (b, p) -> new HangingSignItem(b, AWRBlocks.BEECH_WALL_HANGING_SIGN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item BEECH_SHELF = registerBlock(
            AWRBlockItemIds.BEECH_SHELF, AWRBlocks.BEECH_SHELF,
            p -> p.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item BEECH_LEAVES = registerBlock(
            AWRBlockItemIds.BEECH_LEAVES, AWRBlocks.BEECH_LEAVES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item BEECH_SAPLING = registerBlock(
            AWRBlockItemIds.BEECH_SAPLING, AWRBlocks.BEECH_SAPLING,
            p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item BEECH_BOAT = registerItem(
            AWRItemIds.BEECH_BOAT,
            p -> new BoatItem(AWREntityTypes.BEECH_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    public static final Item BEECH_CHEST_BOAT = registerItem(
            AWRItemIds.BEECH_CHEST_BOAT,
            p -> new BoatItem(AWREntityTypes.BEECH_CHEST_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Item CEDAR_LOG = registerBlock(
            AWRBlockItemIds.CEDAR_LOG, AWRBlocks.CEDAR_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item CEDAR_WOOD = registerBlock(
            AWRBlockItemIds.CEDAR_WOOD, AWRBlocks.CEDAR_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_CEDAR_LOG = registerBlock(
            AWRBlockItemIds.STRIPPED_CEDAR_LOG, AWRBlocks.STRIPPED_CEDAR_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_CEDAR_WOOD = registerBlock(
            AWRBlockItemIds.STRIPPED_CEDAR_WOOD, AWRBlocks.STRIPPED_CEDAR_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item CEDAR_PLANKS = registerBlock(
            AWRBlockItemIds.CEDAR_PLANKS, AWRBlocks.CEDAR_PLANKS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item CEDAR_STAIRS = registerBlock(
            AWRBlockItemIds.CEDAR_STAIRS, AWRBlocks.CEDAR_STAIRS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item CEDAR_SLAB = registerBlock(
            AWRBlockItemIds.CEDAR_SLAB, AWRBlocks.CEDAR_SLAB, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS)
    );
    public static final Item CEDAR_FENCE = registerBlock(
            AWRBlockItemIds.CEDAR_FENCE, AWRBlocks.CEDAR_FENCE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item CEDAR_FENCE_GATE = registerBlock(
            AWRBlockItemIds.CEDAR_FENCE_GATE, AWRBlocks.CEDAR_FENCE_GATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item CEDAR_DOOR = registerBlock(
            AWRBlockItemIds.CEDAR_DOOR, AWRBlocks.CEDAR_DOOR, (b, p) -> new DoubleHighBlockItem(b, p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE))
    );
    public static final Item CEDAR_TRAPDOOR = registerBlock(
            AWRBlockItemIds.CEDAR_TRAPDOOR, AWRBlocks.CEDAR_TRAPDOOR, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item CEDAR_PRESSURE_PLATE = registerBlock(
            AWRBlockItemIds.CEDAR_PRESSURE_PLATE, AWRBlocks.CEDAR_PRESSURE_PLATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item CEDAR_BUTTON = registerBlock(
            AWRBlockItemIds.CEDAR_BUTTON, AWRBlocks.CEDAR_BUTTON, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)
    );
    public static final Item CEDAR_SIGN = registerBlock(
            AWRBlockItemIds.CEDAR_SIGN, AWRBlocks.CEDAR_SIGN,
            (b, p) -> new StandingAndWallBlockItem(b, AWRBlocks.CEDAR_WALL_SIGN, Direction.DOWN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item CEDAR_HANGING_SIGN = registerBlock(
            AWRBlockItemIds.CEDAR_HANGING_SIGN, AWRBlocks.CEDAR_HANGING_SIGN,
            (b, p) -> new HangingSignItem(b, AWRBlocks.CEDAR_WALL_HANGING_SIGN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item CEDAR_SHELF = registerBlock(
            AWRBlockItemIds.CEDAR_SHELF, AWRBlocks.CEDAR_SHELF,
            p -> p.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item CEDAR_LEAVES = registerBlock(
            AWRBlockItemIds.CEDAR_LEAVES, AWRBlocks.CEDAR_LEAVES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item CEDAR_SAPLING = registerBlock(
            AWRBlockItemIds.CEDAR_SAPLING, AWRBlocks.CEDAR_SAPLING,
            p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item CEDAR_BOAT = registerItem(
            AWRItemIds.CEDAR_BOAT,
            p -> new BoatItem(AWREntityTypes.CEDAR_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    public static final Item CEDAR_CHEST_BOAT = registerItem(
            AWRItemIds.CEDAR_CHEST_BOAT,
            p -> new BoatItem(AWREntityTypes.CEDAR_CHEST_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Item CHERRY_LOG = registerBlock(
            AWRBlockItemIds.CHERRY_LOG, AWRBlocks.CHERRY_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item CHERRY_WOOD = registerBlock(
            AWRBlockItemIds.CHERRY_WOOD, AWRBlocks.CHERRY_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_CHERRY_LOG = registerBlock(
            AWRBlockItemIds.STRIPPED_CHERRY_LOG, AWRBlocks.STRIPPED_CHERRY_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_CHERRY_WOOD = registerBlock(
            AWRBlockItemIds.STRIPPED_CHERRY_WOOD, AWRBlocks.STRIPPED_CHERRY_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item CHERRY_PLANKS = registerBlock(
            AWRBlockItemIds.CHERRY_PLANKS, AWRBlocks.CHERRY_PLANKS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item CHERRY_STAIRS = registerBlock(
            AWRBlockItemIds.CHERRY_STAIRS, AWRBlocks.CHERRY_STAIRS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item CHERRY_SLAB = registerBlock(
            AWRBlockItemIds.CHERRY_SLAB, AWRBlocks.CHERRY_SLAB, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS)
    );
    public static final Item CHERRY_FENCE = registerBlock(
            AWRBlockItemIds.CHERRY_FENCE, AWRBlocks.CHERRY_FENCE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item CHERRY_FENCE_GATE = registerBlock(
            AWRBlockItemIds.CHERRY_FENCE_GATE, AWRBlocks.CHERRY_FENCE_GATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item CHERRY_DOOR = registerBlock(
            AWRBlockItemIds.CHERRY_DOOR, AWRBlocks.CHERRY_DOOR, (b, p) -> new DoubleHighBlockItem(b, p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE))
    );
    public static final Item CHERRY_TRAPDOOR = registerBlock(
            AWRBlockItemIds.CHERRY_TRAPDOOR, AWRBlocks.CHERRY_TRAPDOOR, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item CHERRY_PRESSURE_PLATE = registerBlock(
            AWRBlockItemIds.CHERRY_PRESSURE_PLATE, AWRBlocks.CHERRY_PRESSURE_PLATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item CHERRY_BUTTON = registerBlock(
            AWRBlockItemIds.CHERRY_BUTTON, AWRBlocks.CHERRY_BUTTON, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)
    );
    public static final Item CHERRY_SIGN = registerBlock(
            AWRBlockItemIds.CHERRY_SIGN, AWRBlocks.CHERRY_SIGN,
            (b, p) -> new StandingAndWallBlockItem(b, AWRBlocks.CHERRY_WALL_SIGN, Direction.DOWN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item CHERRY_HANGING_SIGN = registerBlock(
            AWRBlockItemIds.CHERRY_HANGING_SIGN, AWRBlocks.CHERRY_HANGING_SIGN,
            (b, p) -> new HangingSignItem(b, AWRBlocks.CHERRY_WALL_HANGING_SIGN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item CHERRY_SHELF = registerBlock(
            AWRBlockItemIds.CHERRY_SHELF, AWRBlocks.CHERRY_SHELF,
            p -> p.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item CHERRY_LEAVES = registerBlock(
            AWRBlockItemIds.CHERRY_LEAVES, AWRBlocks.CHERRY_LEAVES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item CHERRY_SAPLING = registerBlock(
            AWRBlockItemIds.CHERRY_SAPLING, AWRBlocks.CHERRY_SAPLING,
            p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item CHERRY_BOAT = registerItem(
            AWRItemIds.CHERRY_BOAT,
            p -> new BoatItem(AWREntityTypes.CHERRY_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    public static final Item CHERRY_CHEST_BOAT = registerItem(
            AWRItemIds.CHERRY_CHEST_BOAT,
            p -> new BoatItem(AWREntityTypes.CHERRY_CHEST_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Item CYPRESS_LOG = registerBlock(
            AWRBlockItemIds.CYPRESS_LOG, AWRBlocks.CYPRESS_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item CYPRESS_WOOD = registerBlock(
            AWRBlockItemIds.CYPRESS_WOOD, AWRBlocks.CYPRESS_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_CYPRESS_LOG = registerBlock(
            AWRBlockItemIds.STRIPPED_CYPRESS_LOG, AWRBlocks.STRIPPED_CYPRESS_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_CYPRESS_WOOD = registerBlock(
            AWRBlockItemIds.STRIPPED_CYPRESS_WOOD, AWRBlocks.STRIPPED_CYPRESS_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item CYPRESS_PLANKS = registerBlock(
            AWRBlockItemIds.CYPRESS_PLANKS, AWRBlocks.CYPRESS_PLANKS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item CYPRESS_STAIRS = registerBlock(
            AWRBlockItemIds.CYPRESS_STAIRS, AWRBlocks.CYPRESS_STAIRS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item CYPRESS_SLAB = registerBlock(
            AWRBlockItemIds.CYPRESS_SLAB, AWRBlocks.CYPRESS_SLAB, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS)
    );
    public static final Item CYPRESS_FENCE = registerBlock(
            AWRBlockItemIds.CYPRESS_FENCE, AWRBlocks.CYPRESS_FENCE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item CYPRESS_FENCE_GATE = registerBlock(
            AWRBlockItemIds.CYPRESS_FENCE_GATE, AWRBlocks.CYPRESS_FENCE_GATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item CYPRESS_DOOR = registerBlock(
            AWRBlockItemIds.CYPRESS_DOOR, AWRBlocks.CYPRESS_DOOR, (b, p) -> new DoubleHighBlockItem(b, p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE))
    );
    public static final Item CYPRESS_TRAPDOOR = registerBlock(
            AWRBlockItemIds.CYPRESS_TRAPDOOR, AWRBlocks.CYPRESS_TRAPDOOR, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item CYPRESS_PRESSURE_PLATE = registerBlock(
            AWRBlockItemIds.CYPRESS_PRESSURE_PLATE, AWRBlocks.CYPRESS_PRESSURE_PLATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item CYPRESS_BUTTON = registerBlock(
            AWRBlockItemIds.CYPRESS_BUTTON, AWRBlocks.CYPRESS_BUTTON, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)
    );
    public static final Item CYPRESS_SIGN = registerBlock(
            AWRBlockItemIds.CYPRESS_SIGN, AWRBlocks.CYPRESS_SIGN,
            (b, p) -> new StandingAndWallBlockItem(b, AWRBlocks.CYPRESS_WALL_SIGN, Direction.DOWN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item CYPRESS_HANGING_SIGN = registerBlock(
            AWRBlockItemIds.CYPRESS_HANGING_SIGN, AWRBlocks.CYPRESS_HANGING_SIGN,
            (b, p) -> new HangingSignItem(b, AWRBlocks.CYPRESS_WALL_HANGING_SIGN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item CYPRESS_SHELF = registerBlock(
            AWRBlockItemIds.CYPRESS_SHELF, AWRBlocks.CYPRESS_SHELF,
            p -> p.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item CYPRESS_LEAVES = registerBlock(
            AWRBlockItemIds.CYPRESS_LEAVES, AWRBlocks.CYPRESS_LEAVES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item CYPRESS_SAPLING = registerBlock(
            AWRBlockItemIds.CYPRESS_SAPLING, AWRBlocks.CYPRESS_SAPLING,
            p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item CYPRESS_BOAT = registerItem(
            AWRItemIds.CYPRESS_BOAT,
            p -> new BoatItem(AWREntityTypes.CYPRESS_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    public static final Item CYPRESS_CHEST_BOAT = registerItem(
            AWRItemIds.CYPRESS_CHEST_BOAT,
            p -> new BoatItem(AWREntityTypes.CYPRESS_CHEST_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Item EBONY_LOG = registerBlock(
            AWRBlockItemIds.EBONY_LOG, AWRBlocks.EBONY_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item EBONY_WOOD = registerBlock(
            AWRBlockItemIds.EBONY_WOOD, AWRBlocks.EBONY_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_EBONY_LOG = registerBlock(
            AWRBlockItemIds.STRIPPED_EBONY_LOG, AWRBlocks.STRIPPED_EBONY_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_EBONY_WOOD = registerBlock(
            AWRBlockItemIds.STRIPPED_EBONY_WOOD, AWRBlocks.STRIPPED_EBONY_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item EBONY_PLANKS = registerBlock(
            AWRBlockItemIds.EBONY_PLANKS, AWRBlocks.EBONY_PLANKS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item EBONY_STAIRS = registerBlock(
            AWRBlockItemIds.EBONY_STAIRS, AWRBlocks.EBONY_STAIRS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item EBONY_SLAB = registerBlock(
            AWRBlockItemIds.EBONY_SLAB, AWRBlocks.EBONY_SLAB, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS)
    );
    public static final Item EBONY_FENCE = registerBlock(
            AWRBlockItemIds.EBONY_FENCE, AWRBlocks.EBONY_FENCE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item EBONY_FENCE_GATE = registerBlock(
            AWRBlockItemIds.EBONY_FENCE_GATE, AWRBlocks.EBONY_FENCE_GATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item EBONY_DOOR = registerBlock(
            AWRBlockItemIds.EBONY_DOOR, AWRBlocks.EBONY_DOOR, (b, p) -> new DoubleHighBlockItem(b, p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE))
    );
    public static final Item EBONY_TRAPDOOR = registerBlock(
            AWRBlockItemIds.EBONY_TRAPDOOR, AWRBlocks.EBONY_TRAPDOOR, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item EBONY_PRESSURE_PLATE = registerBlock(
            AWRBlockItemIds.EBONY_PRESSURE_PLATE, AWRBlocks.EBONY_PRESSURE_PLATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item EBONY_BUTTON = registerBlock(
            AWRBlockItemIds.EBONY_BUTTON, AWRBlocks.EBONY_BUTTON, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)
    );
    public static final Item EBONY_SIGN = registerBlock(
            AWRBlockItemIds.EBONY_SIGN, AWRBlocks.EBONY_SIGN,
            (b, p) -> new StandingAndWallBlockItem(b, AWRBlocks.EBONY_WALL_SIGN, Direction.DOWN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item EBONY_HANGING_SIGN = registerBlock(
            AWRBlockItemIds.EBONY_HANGING_SIGN, AWRBlocks.EBONY_HANGING_SIGN,
            (b, p) -> new HangingSignItem(b, AWRBlocks.EBONY_WALL_HANGING_SIGN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item EBONY_SHELF = registerBlock(
            AWRBlockItemIds.EBONY_SHELF, AWRBlocks.EBONY_SHELF,
            p -> p.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item EBONY_LEAVES = registerBlock(
            AWRBlockItemIds.EBONY_LEAVES, AWRBlocks.EBONY_LEAVES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item EBONY_SAPLING = registerBlock(
            AWRBlockItemIds.EBONY_SAPLING, AWRBlocks.EBONY_SAPLING,
            p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item EBONY_BOAT = registerItem(
            AWRItemIds.EBONY_BOAT,
            p -> new BoatItem(AWREntityTypes.EBONY_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    public static final Item EBONY_CHEST_BOAT = registerItem(
            AWRItemIds.EBONY_CHEST_BOAT,
            p -> new BoatItem(AWREntityTypes.EBONY_CHEST_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Item ELM_LOG = registerBlock(
            AWRBlockItemIds.ELM_LOG, AWRBlocks.ELM_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item ELM_WOOD = registerBlock(
            AWRBlockItemIds.ELM_WOOD, AWRBlocks.ELM_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_ELM_LOG = registerBlock(
            AWRBlockItemIds.STRIPPED_ELM_LOG, AWRBlocks.STRIPPED_ELM_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_ELM_WOOD = registerBlock(
            AWRBlockItemIds.STRIPPED_ELM_WOOD, AWRBlocks.STRIPPED_ELM_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item ELM_PLANKS = registerBlock(
            AWRBlockItemIds.ELM_PLANKS, AWRBlocks.ELM_PLANKS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item ELM_STAIRS = registerBlock(
            AWRBlockItemIds.ELM_STAIRS, AWRBlocks.ELM_STAIRS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item ELM_SLAB = registerBlock(
            AWRBlockItemIds.ELM_SLAB, AWRBlocks.ELM_SLAB, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS)
    );
    public static final Item ELM_FENCE = registerBlock(
            AWRBlockItemIds.ELM_FENCE, AWRBlocks.ELM_FENCE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item ELM_FENCE_GATE = registerBlock(
            AWRBlockItemIds.ELM_FENCE_GATE, AWRBlocks.ELM_FENCE_GATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item ELM_DOOR = registerBlock(
            AWRBlockItemIds.ELM_DOOR, AWRBlocks.ELM_DOOR, (b, p) -> new DoubleHighBlockItem(b, p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE))
    );
    public static final Item ELM_TRAPDOOR = registerBlock(
            AWRBlockItemIds.ELM_TRAPDOOR, AWRBlocks.ELM_TRAPDOOR, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item ELM_PRESSURE_PLATE = registerBlock(
            AWRBlockItemIds.ELM_PRESSURE_PLATE, AWRBlocks.ELM_PRESSURE_PLATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item ELM_BUTTON = registerBlock(
            AWRBlockItemIds.ELM_BUTTON, AWRBlocks.ELM_BUTTON, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)
    );
    public static final Item ELM_SIGN = registerBlock(
            AWRBlockItemIds.ELM_SIGN, AWRBlocks.ELM_SIGN,
            (b, p) -> new StandingAndWallBlockItem(b, AWRBlocks.ELM_WALL_SIGN, Direction.DOWN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item ELM_HANGING_SIGN = registerBlock(
            AWRBlockItemIds.ELM_HANGING_SIGN, AWRBlocks.ELM_HANGING_SIGN,
            (b, p) -> new HangingSignItem(b, AWRBlocks.ELM_WALL_HANGING_SIGN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item ELM_SHELF = registerBlock(
            AWRBlockItemIds.ELM_SHELF, AWRBlocks.ELM_SHELF,
            p -> p.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item ELM_LEAVES = registerBlock(
            AWRBlockItemIds.ELM_LEAVES, AWRBlocks.ELM_LEAVES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item ELM_SAPLING = registerBlock(
            AWRBlockItemIds.ELM_SAPLING, AWRBlocks.ELM_SAPLING,
            p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item ELM_BOAT = registerItem(
            AWRItemIds.ELM_BOAT,
            p -> new BoatItem(AWREntityTypes.ELM_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    public static final Item ELM_CHEST_BOAT = registerItem(
            AWRItemIds.ELM_CHEST_BOAT,
            p -> new BoatItem(AWREntityTypes.ELM_CHEST_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Item EUCALYPTUS_LOG = registerBlock(
            AWRBlockItemIds.EUCALYPTUS_LOG, AWRBlocks.EUCALYPTUS_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item EUCALYPTUS_WOOD = registerBlock(
            AWRBlockItemIds.EUCALYPTUS_WOOD, AWRBlocks.EUCALYPTUS_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_EUCALYPTUS_LOG = registerBlock(
            AWRBlockItemIds.STRIPPED_EUCALYPTUS_LOG, AWRBlocks.STRIPPED_EUCALYPTUS_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_EUCALYPTUS_WOOD = registerBlock(
            AWRBlockItemIds.STRIPPED_EUCALYPTUS_WOOD, AWRBlocks.STRIPPED_EUCALYPTUS_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item EUCALYPTUS_PLANKS = registerBlock(
            AWRBlockItemIds.EUCALYPTUS_PLANKS, AWRBlocks.EUCALYPTUS_PLANKS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item EUCALYPTUS_STAIRS = registerBlock(
            AWRBlockItemIds.EUCALYPTUS_STAIRS, AWRBlocks.EUCALYPTUS_STAIRS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item EUCALYPTUS_SLAB = registerBlock(
            AWRBlockItemIds.EUCALYPTUS_SLAB, AWRBlocks.EUCALYPTUS_SLAB, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS)
    );
    public static final Item EUCALYPTUS_FENCE = registerBlock(
            AWRBlockItemIds.EUCALYPTUS_FENCE, AWRBlocks.EUCALYPTUS_FENCE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item EUCALYPTUS_FENCE_GATE = registerBlock(
            AWRBlockItemIds.EUCALYPTUS_FENCE_GATE, AWRBlocks.EUCALYPTUS_FENCE_GATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item EUCALYPTUS_DOOR = registerBlock(
            AWRBlockItemIds.EUCALYPTUS_DOOR, AWRBlocks.EUCALYPTUS_DOOR, (b, p) -> new DoubleHighBlockItem(b, p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE))
    );
    public static final Item EUCALYPTUS_TRAPDOOR = registerBlock(
            AWRBlockItemIds.EUCALYPTUS_TRAPDOOR, AWRBlocks.EUCALYPTUS_TRAPDOOR, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item EUCALYPTUS_PRESSURE_PLATE = registerBlock(
            AWRBlockItemIds.EUCALYPTUS_PRESSURE_PLATE, AWRBlocks.EUCALYPTUS_PRESSURE_PLATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item EUCALYPTUS_BUTTON = registerBlock(
            AWRBlockItemIds.EUCALYPTUS_BUTTON, AWRBlocks.EUCALYPTUS_BUTTON, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)
    );
    public static final Item EUCALYPTUS_SIGN = registerBlock(
            AWRBlockItemIds.EUCALYPTUS_SIGN, AWRBlocks.EUCALYPTUS_SIGN,
            (b, p) -> new StandingAndWallBlockItem(b, AWRBlocks.EUCALYPTUS_WALL_SIGN, Direction.DOWN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item EUCALYPTUS_HANGING_SIGN = registerBlock(
            AWRBlockItemIds.EUCALYPTUS_HANGING_SIGN, AWRBlocks.EUCALYPTUS_HANGING_SIGN,
            (b, p) -> new HangingSignItem(b, AWRBlocks.EUCALYPTUS_WALL_HANGING_SIGN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item EUCALYPTUS_SHELF = registerBlock(
            AWRBlockItemIds.EUCALYPTUS_SHELF, AWRBlocks.EUCALYPTUS_SHELF,
            p -> p.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item EUCALYPTUS_LEAVES = registerBlock(
            AWRBlockItemIds.EUCALYPTUS_LEAVES, AWRBlocks.EUCALYPTUS_LEAVES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item EUCALYPTUS_SAPLING = registerBlock(
            AWRBlockItemIds.EUCALYPTUS_SAPLING, AWRBlocks.EUCALYPTUS_SAPLING,
            p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item EUCALYPTUS_BOAT = registerItem(
            AWRItemIds.EUCALYPTUS_BOAT,
            p -> new BoatItem(AWREntityTypes.EUCALYPTUS_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    public static final Item EUCALYPTUS_CHEST_BOAT = registerItem(
            AWRItemIds.EUCALYPTUS_CHEST_BOAT,
            p -> new BoatItem(AWREntityTypes.EUCALYPTUS_CHEST_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Item FIG_LOG = registerBlock(
            AWRBlockItemIds.FIG_LOG, AWRBlocks.FIG_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item FIG_WOOD = registerBlock(
            AWRBlockItemIds.FIG_WOOD, AWRBlocks.FIG_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_FIG_LOG = registerBlock(
            AWRBlockItemIds.STRIPPED_FIG_LOG, AWRBlocks.STRIPPED_FIG_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_FIG_WOOD = registerBlock(
            AWRBlockItemIds.STRIPPED_FIG_WOOD, AWRBlocks.STRIPPED_FIG_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item FIG_PLANKS = registerBlock(
            AWRBlockItemIds.FIG_PLANKS, AWRBlocks.FIG_PLANKS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item FIG_STAIRS = registerBlock(
            AWRBlockItemIds.FIG_STAIRS, AWRBlocks.FIG_STAIRS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item FIG_SLAB = registerBlock(
            AWRBlockItemIds.FIG_SLAB, AWRBlocks.FIG_SLAB, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS)
    );
    public static final Item FIG_FENCE = registerBlock(
            AWRBlockItemIds.FIG_FENCE, AWRBlocks.FIG_FENCE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item FIG_FENCE_GATE = registerBlock(
            AWRBlockItemIds.FIG_FENCE_GATE, AWRBlocks.FIG_FENCE_GATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item FIG_DOOR = registerBlock(
            AWRBlockItemIds.FIG_DOOR, AWRBlocks.FIG_DOOR, (b, p) -> new DoubleHighBlockItem(b, p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE))
    );
    public static final Item FIG_TRAPDOOR = registerBlock(
            AWRBlockItemIds.FIG_TRAPDOOR, AWRBlocks.FIG_TRAPDOOR, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item FIG_PRESSURE_PLATE = registerBlock(
            AWRBlockItemIds.FIG_PRESSURE_PLATE, AWRBlocks.FIG_PRESSURE_PLATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item FIG_BUTTON = registerBlock(
            AWRBlockItemIds.FIG_BUTTON, AWRBlocks.FIG_BUTTON, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)
    );
    public static final Item FIG_SIGN = registerBlock(
            AWRBlockItemIds.FIG_SIGN, AWRBlocks.FIG_SIGN,
            (b, p) -> new StandingAndWallBlockItem(b, AWRBlocks.FIG_WALL_SIGN, Direction.DOWN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item FIG_HANGING_SIGN = registerBlock(
            AWRBlockItemIds.FIG_HANGING_SIGN, AWRBlocks.FIG_HANGING_SIGN,
            (b, p) -> new HangingSignItem(b, AWRBlocks.FIG_WALL_HANGING_SIGN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item FIG_SHELF = registerBlock(
            AWRBlockItemIds.FIG_SHELF, AWRBlocks.FIG_SHELF,
            p -> p.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item FIG_LEAVES = registerBlock(
            AWRBlockItemIds.FIG_LEAVES, AWRBlocks.FIG_LEAVES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item FIG_SAPLING = registerBlock(
            AWRBlockItemIds.FIG_SAPLING, AWRBlocks.FIG_SAPLING,
            p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item FIG_BOAT = registerItem(
            AWRItemIds.FIG_BOAT,
            p -> new BoatItem(AWREntityTypes.FIG_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    public static final Item FIG_CHEST_BOAT = registerItem(
            AWRItemIds.FIG_CHEST_BOAT,
            p -> new BoatItem(AWREntityTypes.FIG_CHEST_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Item FIR_LOG = registerBlock(
            AWRBlockItemIds.FIR_LOG, AWRBlocks.FIR_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item FIR_WOOD = registerBlock(
            AWRBlockItemIds.FIR_WOOD, AWRBlocks.FIR_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_FIR_LOG = registerBlock(
            AWRBlockItemIds.STRIPPED_FIR_LOG, AWRBlocks.STRIPPED_FIR_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_FIR_WOOD = registerBlock(
            AWRBlockItemIds.STRIPPED_FIR_WOOD, AWRBlocks.STRIPPED_FIR_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item FIR_PLANKS = registerBlock(
            AWRBlockItemIds.FIR_PLANKS, AWRBlocks.FIR_PLANKS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item FIR_STAIRS = registerBlock(
            AWRBlockItemIds.FIR_STAIRS, AWRBlocks.FIR_STAIRS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item FIR_SLAB = registerBlock(
            AWRBlockItemIds.FIR_SLAB, AWRBlocks.FIR_SLAB, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS)
    );
    public static final Item FIR_FENCE = registerBlock(
            AWRBlockItemIds.FIR_FENCE, AWRBlocks.FIR_FENCE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item FIR_FENCE_GATE = registerBlock(
            AWRBlockItemIds.FIR_FENCE_GATE, AWRBlocks.FIR_FENCE_GATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item FIR_DOOR = registerBlock(
            AWRBlockItemIds.FIR_DOOR, AWRBlocks.FIR_DOOR, (b, p) -> new DoubleHighBlockItem(b, p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE))
    );
    public static final Item FIR_TRAPDOOR = registerBlock(
            AWRBlockItemIds.FIR_TRAPDOOR, AWRBlocks.FIR_TRAPDOOR, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item FIR_PRESSURE_PLATE = registerBlock(
            AWRBlockItemIds.FIR_PRESSURE_PLATE, AWRBlocks.FIR_PRESSURE_PLATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item FIR_BUTTON = registerBlock(
            AWRBlockItemIds.FIR_BUTTON, AWRBlocks.FIR_BUTTON, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)
    );
    public static final Item FIR_SIGN = registerBlock(
            AWRBlockItemIds.FIR_SIGN, AWRBlocks.FIR_SIGN,
            (b, p) -> new StandingAndWallBlockItem(b, AWRBlocks.FIR_WALL_SIGN, Direction.DOWN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item FIR_HANGING_SIGN = registerBlock(
            AWRBlockItemIds.FIR_HANGING_SIGN, AWRBlocks.FIR_HANGING_SIGN,
            (b, p) -> new HangingSignItem(b, AWRBlocks.FIR_WALL_HANGING_SIGN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item FIR_SHELF = registerBlock(
            AWRBlockItemIds.FIR_SHELF, AWRBlocks.FIR_SHELF,
            p -> p.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item FIR_LEAVES = registerBlock(
            AWRBlockItemIds.FIR_LEAVES, AWRBlocks.FIR_LEAVES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item FIR_SAPLING = registerBlock(
            AWRBlockItemIds.FIR_SAPLING, AWRBlocks.FIR_SAPLING,
            p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item FIR_BOAT = registerItem(
            AWRItemIds.FIR_BOAT,
            p -> new BoatItem(AWREntityTypes.FIR_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    public static final Item FIR_CHEST_BOAT = registerItem(
            AWRItemIds.FIR_CHEST_BOAT,
            p -> new BoatItem(AWREntityTypes.FIR_CHEST_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Item HEMLOCK_LOG = registerBlock(
            AWRBlockItemIds.HEMLOCK_LOG, AWRBlocks.HEMLOCK_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item HEMLOCK_WOOD = registerBlock(
            AWRBlockItemIds.HEMLOCK_WOOD, AWRBlocks.HEMLOCK_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_HEMLOCK_LOG = registerBlock(
            AWRBlockItemIds.STRIPPED_HEMLOCK_LOG, AWRBlocks.STRIPPED_HEMLOCK_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_HEMLOCK_WOOD = registerBlock(
            AWRBlockItemIds.STRIPPED_HEMLOCK_WOOD, AWRBlocks.STRIPPED_HEMLOCK_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item HEMLOCK_PLANKS = registerBlock(
            AWRBlockItemIds.HEMLOCK_PLANKS, AWRBlocks.HEMLOCK_PLANKS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item HEMLOCK_STAIRS = registerBlock(
            AWRBlockItemIds.HEMLOCK_STAIRS, AWRBlocks.HEMLOCK_STAIRS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item HEMLOCK_SLAB = registerBlock(
            AWRBlockItemIds.HEMLOCK_SLAB, AWRBlocks.HEMLOCK_SLAB, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS)
    );
    public static final Item HEMLOCK_FENCE = registerBlock(
            AWRBlockItemIds.HEMLOCK_FENCE, AWRBlocks.HEMLOCK_FENCE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item HEMLOCK_FENCE_GATE = registerBlock(
            AWRBlockItemIds.HEMLOCK_FENCE_GATE, AWRBlocks.HEMLOCK_FENCE_GATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item HEMLOCK_DOOR = registerBlock(
            AWRBlockItemIds.HEMLOCK_DOOR, AWRBlocks.HEMLOCK_DOOR, (b, p) -> new DoubleHighBlockItem(b, p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE))
    );
    public static final Item HEMLOCK_TRAPDOOR = registerBlock(
            AWRBlockItemIds.HEMLOCK_TRAPDOOR, AWRBlocks.HEMLOCK_TRAPDOOR, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item HEMLOCK_PRESSURE_PLATE = registerBlock(
            AWRBlockItemIds.HEMLOCK_PRESSURE_PLATE, AWRBlocks.HEMLOCK_PRESSURE_PLATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item HEMLOCK_BUTTON = registerBlock(
            AWRBlockItemIds.HEMLOCK_BUTTON, AWRBlocks.HEMLOCK_BUTTON, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)
    );
    public static final Item HEMLOCK_SIGN = registerBlock(
            AWRBlockItemIds.HEMLOCK_SIGN, AWRBlocks.HEMLOCK_SIGN,
            (b, p) -> new StandingAndWallBlockItem(b, AWRBlocks.HEMLOCK_WALL_SIGN, Direction.DOWN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item HEMLOCK_HANGING_SIGN = registerBlock(
            AWRBlockItemIds.HEMLOCK_HANGING_SIGN, AWRBlocks.HEMLOCK_HANGING_SIGN,
            (b, p) -> new HangingSignItem(b, AWRBlocks.HEMLOCK_WALL_HANGING_SIGN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item HEMLOCK_SHELF = registerBlock(
            AWRBlockItemIds.HEMLOCK_SHELF, AWRBlocks.HEMLOCK_SHELF,
            p -> p.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item HEMLOCK_LEAVES = registerBlock(
            AWRBlockItemIds.HEMLOCK_LEAVES, AWRBlocks.HEMLOCK_LEAVES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item HEMLOCK_SAPLING = registerBlock(
            AWRBlockItemIds.HEMLOCK_SAPLING, AWRBlocks.HEMLOCK_SAPLING,
            p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item HEMLOCK_BOAT = registerItem(
            AWRItemIds.HEMLOCK_BOAT,
            p -> new BoatItem(AWREntityTypes.HEMLOCK_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    public static final Item HEMLOCK_CHEST_BOAT = registerItem(
            AWRItemIds.HEMLOCK_CHEST_BOAT,
            p -> new BoatItem(AWREntityTypes.HEMLOCK_CHEST_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Item HICKORY_LOG = registerBlock(
            AWRBlockItemIds.HICKORY_LOG, AWRBlocks.HICKORY_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item HICKORY_WOOD = registerBlock(
            AWRBlockItemIds.HICKORY_WOOD, AWRBlocks.HICKORY_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_HICKORY_LOG = registerBlock(
            AWRBlockItemIds.STRIPPED_HICKORY_LOG, AWRBlocks.STRIPPED_HICKORY_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_HICKORY_WOOD = registerBlock(
            AWRBlockItemIds.STRIPPED_HICKORY_WOOD, AWRBlocks.STRIPPED_HICKORY_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item HICKORY_PLANKS = registerBlock(
            AWRBlockItemIds.HICKORY_PLANKS, AWRBlocks.HICKORY_PLANKS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item HICKORY_STAIRS = registerBlock(
            AWRBlockItemIds.HICKORY_STAIRS, AWRBlocks.HICKORY_STAIRS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item HICKORY_SLAB = registerBlock(
            AWRBlockItemIds.HICKORY_SLAB, AWRBlocks.HICKORY_SLAB, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS)
    );
    public static final Item HICKORY_FENCE = registerBlock(
            AWRBlockItemIds.HICKORY_FENCE, AWRBlocks.HICKORY_FENCE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item HICKORY_FENCE_GATE = registerBlock(
            AWRBlockItemIds.HICKORY_FENCE_GATE, AWRBlocks.HICKORY_FENCE_GATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item HICKORY_DOOR = registerBlock(
            AWRBlockItemIds.HICKORY_DOOR, AWRBlocks.HICKORY_DOOR, (b, p) -> new DoubleHighBlockItem(b, p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE))
    );
    public static final Item HICKORY_TRAPDOOR = registerBlock(
            AWRBlockItemIds.HICKORY_TRAPDOOR, AWRBlocks.HICKORY_TRAPDOOR, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item HICKORY_PRESSURE_PLATE = registerBlock(
            AWRBlockItemIds.HICKORY_PRESSURE_PLATE, AWRBlocks.HICKORY_PRESSURE_PLATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item HICKORY_BUTTON = registerBlock(
            AWRBlockItemIds.HICKORY_BUTTON, AWRBlocks.HICKORY_BUTTON, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)
    );
    public static final Item HICKORY_SIGN = registerBlock(
            AWRBlockItemIds.HICKORY_SIGN, AWRBlocks.HICKORY_SIGN,
            (b, p) -> new StandingAndWallBlockItem(b, AWRBlocks.HICKORY_WALL_SIGN, Direction.DOWN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item HICKORY_HANGING_SIGN = registerBlock(
            AWRBlockItemIds.HICKORY_HANGING_SIGN, AWRBlocks.HICKORY_HANGING_SIGN,
            (b, p) -> new HangingSignItem(b, AWRBlocks.HICKORY_WALL_HANGING_SIGN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item HICKORY_SHELF = registerBlock(
            AWRBlockItemIds.HICKORY_SHELF, AWRBlocks.HICKORY_SHELF,
            p -> p.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item HICKORY_LEAVES = registerBlock(
            AWRBlockItemIds.HICKORY_LEAVES, AWRBlocks.HICKORY_LEAVES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item HICKORY_SAPLING = registerBlock(
            AWRBlockItemIds.HICKORY_SAPLING, AWRBlocks.HICKORY_SAPLING,
            p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item HICKORY_BOAT = registerItem(
            AWRItemIds.HICKORY_BOAT,
            p -> new BoatItem(AWREntityTypes.HICKORY_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    public static final Item HICKORY_CHEST_BOAT = registerItem(
            AWRItemIds.HICKORY_CHEST_BOAT,
            p -> new BoatItem(AWREntityTypes.HICKORY_CHEST_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Item JUNIPER_LOG = registerBlock(
            AWRBlockItemIds.JUNIPER_LOG, AWRBlocks.JUNIPER_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item JUNIPER_WOOD = registerBlock(
            AWRBlockItemIds.JUNIPER_WOOD, AWRBlocks.JUNIPER_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_JUNIPER_LOG = registerBlock(
            AWRBlockItemIds.STRIPPED_JUNIPER_LOG, AWRBlocks.STRIPPED_JUNIPER_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_JUNIPER_WOOD = registerBlock(
            AWRBlockItemIds.STRIPPED_JUNIPER_WOOD, AWRBlocks.STRIPPED_JUNIPER_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item JUNIPER_PLANKS = registerBlock(
            AWRBlockItemIds.JUNIPER_PLANKS, AWRBlocks.JUNIPER_PLANKS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item JUNIPER_STAIRS = registerBlock(
            AWRBlockItemIds.JUNIPER_STAIRS, AWRBlocks.JUNIPER_STAIRS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item JUNIPER_SLAB = registerBlock(
            AWRBlockItemIds.JUNIPER_SLAB, AWRBlocks.JUNIPER_SLAB, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS)
    );
    public static final Item JUNIPER_FENCE = registerBlock(
            AWRBlockItemIds.JUNIPER_FENCE, AWRBlocks.JUNIPER_FENCE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item JUNIPER_FENCE_GATE = registerBlock(
            AWRBlockItemIds.JUNIPER_FENCE_GATE, AWRBlocks.JUNIPER_FENCE_GATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item JUNIPER_DOOR = registerBlock(
            AWRBlockItemIds.JUNIPER_DOOR, AWRBlocks.JUNIPER_DOOR, (b, p) -> new DoubleHighBlockItem(b, p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE))
    );
    public static final Item JUNIPER_TRAPDOOR = registerBlock(
            AWRBlockItemIds.JUNIPER_TRAPDOOR, AWRBlocks.JUNIPER_TRAPDOOR, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item JUNIPER_PRESSURE_PLATE = registerBlock(
            AWRBlockItemIds.JUNIPER_PRESSURE_PLATE, AWRBlocks.JUNIPER_PRESSURE_PLATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item JUNIPER_BUTTON = registerBlock(
            AWRBlockItemIds.JUNIPER_BUTTON, AWRBlocks.JUNIPER_BUTTON, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)
    );
    public static final Item JUNIPER_SIGN = registerBlock(
            AWRBlockItemIds.JUNIPER_SIGN, AWRBlocks.JUNIPER_SIGN,
            (b, p) -> new StandingAndWallBlockItem(b, AWRBlocks.JUNIPER_WALL_SIGN, Direction.DOWN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item JUNIPER_HANGING_SIGN = registerBlock(
            AWRBlockItemIds.JUNIPER_HANGING_SIGN, AWRBlocks.JUNIPER_HANGING_SIGN,
            (b, p) -> new HangingSignItem(b, AWRBlocks.JUNIPER_WALL_HANGING_SIGN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item JUNIPER_SHELF = registerBlock(
            AWRBlockItemIds.JUNIPER_SHELF, AWRBlocks.JUNIPER_SHELF,
            p -> p.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item JUNIPER_LEAVES = registerBlock(
            AWRBlockItemIds.JUNIPER_LEAVES, AWRBlocks.JUNIPER_LEAVES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item JUNIPER_SAPLING = registerBlock(
            AWRBlockItemIds.JUNIPER_SAPLING, AWRBlocks.JUNIPER_SAPLING,
            p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item JUNIPER_BOAT = registerItem(
            AWRItemIds.JUNIPER_BOAT,
            p -> new BoatItem(AWREntityTypes.JUNIPER_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    public static final Item JUNIPER_CHEST_BOAT = registerItem(
            AWRItemIds.JUNIPER_CHEST_BOAT,
            p -> new BoatItem(AWREntityTypes.JUNIPER_CHEST_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Item KAPOK_LOG = registerBlock(
            AWRBlockItemIds.KAPOK_LOG, AWRBlocks.KAPOK_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item KAPOK_WOOD = registerBlock(
            AWRBlockItemIds.KAPOK_WOOD, AWRBlocks.KAPOK_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_KAPOK_LOG = registerBlock(
            AWRBlockItemIds.STRIPPED_KAPOK_LOG, AWRBlocks.STRIPPED_KAPOK_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_KAPOK_WOOD = registerBlock(
            AWRBlockItemIds.STRIPPED_KAPOK_WOOD, AWRBlocks.STRIPPED_KAPOK_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item KAPOK_PLANKS = registerBlock(
            AWRBlockItemIds.KAPOK_PLANKS, AWRBlocks.KAPOK_PLANKS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item KAPOK_STAIRS = registerBlock(
            AWRBlockItemIds.KAPOK_STAIRS, AWRBlocks.KAPOK_STAIRS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item KAPOK_SLAB = registerBlock(
            AWRBlockItemIds.KAPOK_SLAB, AWRBlocks.KAPOK_SLAB, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS)
    );
    public static final Item KAPOK_FENCE = registerBlock(
            AWRBlockItemIds.KAPOK_FENCE, AWRBlocks.KAPOK_FENCE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item KAPOK_FENCE_GATE = registerBlock(
            AWRBlockItemIds.KAPOK_FENCE_GATE, AWRBlocks.KAPOK_FENCE_GATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item KAPOK_DOOR = registerBlock(
            AWRBlockItemIds.KAPOK_DOOR, AWRBlocks.KAPOK_DOOR, (b, p) -> new DoubleHighBlockItem(b, p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE))
    );
    public static final Item KAPOK_TRAPDOOR = registerBlock(
            AWRBlockItemIds.KAPOK_TRAPDOOR, AWRBlocks.KAPOK_TRAPDOOR, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item KAPOK_PRESSURE_PLATE = registerBlock(
            AWRBlockItemIds.KAPOK_PRESSURE_PLATE, AWRBlocks.KAPOK_PRESSURE_PLATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item KAPOK_BUTTON = registerBlock(
            AWRBlockItemIds.KAPOK_BUTTON, AWRBlocks.KAPOK_BUTTON, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)
    );
    public static final Item KAPOK_SIGN = registerBlock(
            AWRBlockItemIds.KAPOK_SIGN, AWRBlocks.KAPOK_SIGN,
            (b, p) -> new StandingAndWallBlockItem(b, AWRBlocks.KAPOK_WALL_SIGN, Direction.DOWN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item KAPOK_HANGING_SIGN = registerBlock(
            AWRBlockItemIds.KAPOK_HANGING_SIGN, AWRBlocks.KAPOK_HANGING_SIGN,
            (b, p) -> new HangingSignItem(b, AWRBlocks.KAPOK_WALL_HANGING_SIGN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item KAPOK_SHELF = registerBlock(
            AWRBlockItemIds.KAPOK_SHELF, AWRBlocks.KAPOK_SHELF,
            p -> p.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item KAPOK_LEAVES = registerBlock(
            AWRBlockItemIds.KAPOK_LEAVES, AWRBlocks.KAPOK_LEAVES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item KAPOK_SAPLING = registerBlock(
            AWRBlockItemIds.KAPOK_SAPLING, AWRBlocks.KAPOK_SAPLING,
            p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item KAPOK_BOAT = registerItem(
            AWRItemIds.KAPOK_BOAT,
            p -> new BoatItem(AWREntityTypes.KAPOK_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    public static final Item KAPOK_CHEST_BOAT = registerItem(
            AWRItemIds.KAPOK_CHEST_BOAT,
            p -> new BoatItem(AWREntityTypes.KAPOK_CHEST_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Item LARCH_LOG = registerBlock(
            AWRBlockItemIds.LARCH_LOG, AWRBlocks.LARCH_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item LARCH_WOOD = registerBlock(
            AWRBlockItemIds.LARCH_WOOD, AWRBlocks.LARCH_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_LARCH_LOG = registerBlock(
            AWRBlockItemIds.STRIPPED_LARCH_LOG, AWRBlocks.STRIPPED_LARCH_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_LARCH_WOOD = registerBlock(
            AWRBlockItemIds.STRIPPED_LARCH_WOOD, AWRBlocks.STRIPPED_LARCH_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item LARCH_PLANKS = registerBlock(
            AWRBlockItemIds.LARCH_PLANKS, AWRBlocks.LARCH_PLANKS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item LARCH_STAIRS = registerBlock(
            AWRBlockItemIds.LARCH_STAIRS, AWRBlocks.LARCH_STAIRS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item LARCH_SLAB = registerBlock(
            AWRBlockItemIds.LARCH_SLAB, AWRBlocks.LARCH_SLAB, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS)
    );
    public static final Item LARCH_FENCE = registerBlock(
            AWRBlockItemIds.LARCH_FENCE, AWRBlocks.LARCH_FENCE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item LARCH_FENCE_GATE = registerBlock(
            AWRBlockItemIds.LARCH_FENCE_GATE, AWRBlocks.LARCH_FENCE_GATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item LARCH_DOOR = registerBlock(
            AWRBlockItemIds.LARCH_DOOR, AWRBlocks.LARCH_DOOR, (b, p) -> new DoubleHighBlockItem(b, p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE))
    );
    public static final Item LARCH_TRAPDOOR = registerBlock(
            AWRBlockItemIds.LARCH_TRAPDOOR, AWRBlocks.LARCH_TRAPDOOR, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item LARCH_PRESSURE_PLATE = registerBlock(
            AWRBlockItemIds.LARCH_PRESSURE_PLATE, AWRBlocks.LARCH_PRESSURE_PLATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item LARCH_BUTTON = registerBlock(
            AWRBlockItemIds.LARCH_BUTTON, AWRBlocks.LARCH_BUTTON, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)
    );
    public static final Item LARCH_SIGN = registerBlock(
            AWRBlockItemIds.LARCH_SIGN, AWRBlocks.LARCH_SIGN,
            (b, p) -> new StandingAndWallBlockItem(b, AWRBlocks.LARCH_WALL_SIGN, Direction.DOWN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item LARCH_HANGING_SIGN = registerBlock(
            AWRBlockItemIds.LARCH_HANGING_SIGN, AWRBlocks.LARCH_HANGING_SIGN,
            (b, p) -> new HangingSignItem(b, AWRBlocks.LARCH_WALL_HANGING_SIGN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item LARCH_SHELF = registerBlock(
            AWRBlockItemIds.LARCH_SHELF, AWRBlocks.LARCH_SHELF,
            p -> p.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item LARCH_LEAVES = registerBlock(
            AWRBlockItemIds.LARCH_LEAVES, AWRBlocks.LARCH_LEAVES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item LARCH_SAPLING = registerBlock(
            AWRBlockItemIds.LARCH_SAPLING, AWRBlocks.LARCH_SAPLING,
            p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item LARCH_BOAT = registerItem(
            AWRItemIds.LARCH_BOAT,
            p -> new BoatItem(AWREntityTypes.LARCH_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    public static final Item LARCH_CHEST_BOAT = registerItem(
            AWRItemIds.LARCH_CHEST_BOAT,
            p -> new BoatItem(AWREntityTypes.LARCH_CHEST_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Item MAHOGANY_LOG = registerBlock(
            AWRBlockItemIds.MAHOGANY_LOG, AWRBlocks.MAHOGANY_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item MAHOGANY_WOOD = registerBlock(
            AWRBlockItemIds.MAHOGANY_WOOD, AWRBlocks.MAHOGANY_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_MAHOGANY_LOG = registerBlock(
            AWRBlockItemIds.STRIPPED_MAHOGANY_LOG, AWRBlocks.STRIPPED_MAHOGANY_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_MAHOGANY_WOOD = registerBlock(
            AWRBlockItemIds.STRIPPED_MAHOGANY_WOOD, AWRBlocks.STRIPPED_MAHOGANY_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item MAHOGANY_PLANKS = registerBlock(
            AWRBlockItemIds.MAHOGANY_PLANKS, AWRBlocks.MAHOGANY_PLANKS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item MAHOGANY_STAIRS = registerBlock(
            AWRBlockItemIds.MAHOGANY_STAIRS, AWRBlocks.MAHOGANY_STAIRS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item MAHOGANY_SLAB = registerBlock(
            AWRBlockItemIds.MAHOGANY_SLAB, AWRBlocks.MAHOGANY_SLAB, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS)
    );
    public static final Item MAHOGANY_FENCE = registerBlock(
            AWRBlockItemIds.MAHOGANY_FENCE, AWRBlocks.MAHOGANY_FENCE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item MAHOGANY_FENCE_GATE = registerBlock(
            AWRBlockItemIds.MAHOGANY_FENCE_GATE, AWRBlocks.MAHOGANY_FENCE_GATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item MAHOGANY_DOOR = registerBlock(
            AWRBlockItemIds.MAHOGANY_DOOR, AWRBlocks.MAHOGANY_DOOR, (b, p) -> new DoubleHighBlockItem(b, p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE))
    );
    public static final Item MAHOGANY_TRAPDOOR = registerBlock(
            AWRBlockItemIds.MAHOGANY_TRAPDOOR, AWRBlocks.MAHOGANY_TRAPDOOR, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item MAHOGANY_PRESSURE_PLATE = registerBlock(
            AWRBlockItemIds.MAHOGANY_PRESSURE_PLATE, AWRBlocks.MAHOGANY_PRESSURE_PLATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item MAHOGANY_BUTTON = registerBlock(
            AWRBlockItemIds.MAHOGANY_BUTTON, AWRBlocks.MAHOGANY_BUTTON, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)
    );
    public static final Item MAHOGANY_SIGN = registerBlock(
            AWRBlockItemIds.MAHOGANY_SIGN, AWRBlocks.MAHOGANY_SIGN,
            (b, p) -> new StandingAndWallBlockItem(b, AWRBlocks.MAHOGANY_WALL_SIGN, Direction.DOWN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item MAHOGANY_HANGING_SIGN = registerBlock(
            AWRBlockItemIds.MAHOGANY_HANGING_SIGN, AWRBlocks.MAHOGANY_HANGING_SIGN,
            (b, p) -> new HangingSignItem(b, AWRBlocks.MAHOGANY_WALL_HANGING_SIGN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item MAHOGANY_SHELF = registerBlock(
            AWRBlockItemIds.MAHOGANY_SHELF, AWRBlocks.MAHOGANY_SHELF,
            p -> p.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item MAHOGANY_LEAVES = registerBlock(
            AWRBlockItemIds.MAHOGANY_LEAVES, AWRBlocks.MAHOGANY_LEAVES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item MAHOGANY_SAPLING = registerBlock(
            AWRBlockItemIds.MAHOGANY_SAPLING, AWRBlocks.MAHOGANY_SAPLING,
            p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item MAHOGANY_BOAT = registerItem(
            AWRItemIds.MAHOGANY_BOAT,
            p -> new BoatItem(AWREntityTypes.MAHOGANY_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    public static final Item MAHOGANY_CHEST_BOAT = registerItem(
            AWRItemIds.MAHOGANY_CHEST_BOAT,
            p -> new BoatItem(AWREntityTypes.MAHOGANY_CHEST_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Item MAPLE_LOG = registerBlock(
            AWRBlockItemIds.MAPLE_LOG, AWRBlocks.MAPLE_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item MAPLE_WOOD = registerBlock(
            AWRBlockItemIds.MAPLE_WOOD, AWRBlocks.MAPLE_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_MAPLE_LOG = registerBlock(
            AWRBlockItemIds.STRIPPED_MAPLE_LOG, AWRBlocks.STRIPPED_MAPLE_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_MAPLE_WOOD = registerBlock(
            AWRBlockItemIds.STRIPPED_MAPLE_WOOD, AWRBlocks.STRIPPED_MAPLE_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item MAPLE_PLANKS = registerBlock(
            AWRBlockItemIds.MAPLE_PLANKS, AWRBlocks.MAPLE_PLANKS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item MAPLE_STAIRS = registerBlock(
            AWRBlockItemIds.MAPLE_STAIRS, AWRBlocks.MAPLE_STAIRS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item MAPLE_SLAB = registerBlock(
            AWRBlockItemIds.MAPLE_SLAB, AWRBlocks.MAPLE_SLAB, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS)
    );
    public static final Item MAPLE_FENCE = registerBlock(
            AWRBlockItemIds.MAPLE_FENCE, AWRBlocks.MAPLE_FENCE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item MAPLE_FENCE_GATE = registerBlock(
            AWRBlockItemIds.MAPLE_FENCE_GATE, AWRBlocks.MAPLE_FENCE_GATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item MAPLE_DOOR = registerBlock(
            AWRBlockItemIds.MAPLE_DOOR, AWRBlocks.MAPLE_DOOR, (b, p) -> new DoubleHighBlockItem(b, p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE))
    );
    public static final Item MAPLE_TRAPDOOR = registerBlock(
            AWRBlockItemIds.MAPLE_TRAPDOOR, AWRBlocks.MAPLE_TRAPDOOR, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item MAPLE_PRESSURE_PLATE = registerBlock(
            AWRBlockItemIds.MAPLE_PRESSURE_PLATE, AWRBlocks.MAPLE_PRESSURE_PLATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item MAPLE_BUTTON = registerBlock(
            AWRBlockItemIds.MAPLE_BUTTON, AWRBlocks.MAPLE_BUTTON, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)
    );
    public static final Item MAPLE_SIGN = registerBlock(
            AWRBlockItemIds.MAPLE_SIGN, AWRBlocks.MAPLE_SIGN,
            (b, p) -> new StandingAndWallBlockItem(b, AWRBlocks.MAPLE_WALL_SIGN, Direction.DOWN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item MAPLE_HANGING_SIGN = registerBlock(
            AWRBlockItemIds.MAPLE_HANGING_SIGN, AWRBlocks.MAPLE_HANGING_SIGN,
            (b, p) -> new HangingSignItem(b, AWRBlocks.MAPLE_WALL_HANGING_SIGN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item MAPLE_SHELF = registerBlock(
            AWRBlockItemIds.MAPLE_SHELF, AWRBlocks.MAPLE_SHELF,
            p -> p.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item MAPLE_LEAVES = registerBlock(
            AWRBlockItemIds.MAPLE_LEAVES, AWRBlocks.MAPLE_LEAVES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item MAPLE_SAPLING = registerBlock(
            AWRBlockItemIds.MAPLE_SAPLING, AWRBlocks.MAPLE_SAPLING,
            p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item MAPLE_BOAT = registerItem(
            AWRItemIds.MAPLE_BOAT,
            p -> new BoatItem(AWREntityTypes.MAPLE_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    public static final Item MAPLE_CHEST_BOAT = registerItem(
            AWRItemIds.MAPLE_CHEST_BOAT,
            p -> new BoatItem(AWREntityTypes.MAPLE_CHEST_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Item MESQUITE_LOG = registerBlock(
            AWRBlockItemIds.MESQUITE_LOG, AWRBlocks.MESQUITE_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item MESQUITE_WOOD = registerBlock(
            AWRBlockItemIds.MESQUITE_WOOD, AWRBlocks.MESQUITE_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_MESQUITE_LOG = registerBlock(
            AWRBlockItemIds.STRIPPED_MESQUITE_LOG, AWRBlocks.STRIPPED_MESQUITE_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_MESQUITE_WOOD = registerBlock(
            AWRBlockItemIds.STRIPPED_MESQUITE_WOOD, AWRBlocks.STRIPPED_MESQUITE_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item MESQUITE_PLANKS = registerBlock(
            AWRBlockItemIds.MESQUITE_PLANKS, AWRBlocks.MESQUITE_PLANKS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item MESQUITE_STAIRS = registerBlock(
            AWRBlockItemIds.MESQUITE_STAIRS, AWRBlocks.MESQUITE_STAIRS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item MESQUITE_SLAB = registerBlock(
            AWRBlockItemIds.MESQUITE_SLAB, AWRBlocks.MESQUITE_SLAB, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS)
    );
    public static final Item MESQUITE_FENCE = registerBlock(
            AWRBlockItemIds.MESQUITE_FENCE, AWRBlocks.MESQUITE_FENCE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item MESQUITE_FENCE_GATE = registerBlock(
            AWRBlockItemIds.MESQUITE_FENCE_GATE, AWRBlocks.MESQUITE_FENCE_GATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item MESQUITE_DOOR = registerBlock(
            AWRBlockItemIds.MESQUITE_DOOR, AWRBlocks.MESQUITE_DOOR, (b, p) -> new DoubleHighBlockItem(b, p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE))
    );
    public static final Item MESQUITE_TRAPDOOR = registerBlock(
            AWRBlockItemIds.MESQUITE_TRAPDOOR, AWRBlocks.MESQUITE_TRAPDOOR, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item MESQUITE_PRESSURE_PLATE = registerBlock(
            AWRBlockItemIds.MESQUITE_PRESSURE_PLATE, AWRBlocks.MESQUITE_PRESSURE_PLATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item MESQUITE_BUTTON = registerBlock(
            AWRBlockItemIds.MESQUITE_BUTTON, AWRBlocks.MESQUITE_BUTTON, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)
    );
    public static final Item MESQUITE_SIGN = registerBlock(
            AWRBlockItemIds.MESQUITE_SIGN, AWRBlocks.MESQUITE_SIGN,
            (b, p) -> new StandingAndWallBlockItem(b, AWRBlocks.MESQUITE_WALL_SIGN, Direction.DOWN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item MESQUITE_HANGING_SIGN = registerBlock(
            AWRBlockItemIds.MESQUITE_HANGING_SIGN, AWRBlocks.MESQUITE_HANGING_SIGN,
            (b, p) -> new HangingSignItem(b, AWRBlocks.MESQUITE_WALL_HANGING_SIGN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item MESQUITE_SHELF = registerBlock(
            AWRBlockItemIds.MESQUITE_SHELF, AWRBlocks.MESQUITE_SHELF,
            p -> p.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item MESQUITE_LEAVES = registerBlock(
            AWRBlockItemIds.MESQUITE_LEAVES, AWRBlocks.MESQUITE_LEAVES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item MESQUITE_SAPLING = registerBlock(
            AWRBlockItemIds.MESQUITE_SAPLING, AWRBlocks.MESQUITE_SAPLING,
            p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item MESQUITE_BOAT = registerItem(
            AWRItemIds.MESQUITE_BOAT,
            p -> new BoatItem(AWREntityTypes.MESQUITE_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    public static final Item MESQUITE_CHEST_BOAT = registerItem(
            AWRItemIds.MESQUITE_CHEST_BOAT,
            p -> new BoatItem(AWREntityTypes.MESQUITE_CHEST_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Item OLIVE_LOG = registerBlock(
            AWRBlockItemIds.OLIVE_LOG, AWRBlocks.OLIVE_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item OLIVE_WOOD = registerBlock(
            AWRBlockItemIds.OLIVE_WOOD, AWRBlocks.OLIVE_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_OLIVE_LOG = registerBlock(
            AWRBlockItemIds.STRIPPED_OLIVE_LOG, AWRBlocks.STRIPPED_OLIVE_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_OLIVE_WOOD = registerBlock(
            AWRBlockItemIds.STRIPPED_OLIVE_WOOD, AWRBlocks.STRIPPED_OLIVE_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item OLIVE_PLANKS = registerBlock(
            AWRBlockItemIds.OLIVE_PLANKS, AWRBlocks.OLIVE_PLANKS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item OLIVE_STAIRS = registerBlock(
            AWRBlockItemIds.OLIVE_STAIRS, AWRBlocks.OLIVE_STAIRS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item OLIVE_SLAB = registerBlock(
            AWRBlockItemIds.OLIVE_SLAB, AWRBlocks.OLIVE_SLAB, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS)
    );
    public static final Item OLIVE_FENCE = registerBlock(
            AWRBlockItemIds.OLIVE_FENCE, AWRBlocks.OLIVE_FENCE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item OLIVE_FENCE_GATE = registerBlock(
            AWRBlockItemIds.OLIVE_FENCE_GATE, AWRBlocks.OLIVE_FENCE_GATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item OLIVE_DOOR = registerBlock(
            AWRBlockItemIds.OLIVE_DOOR, AWRBlocks.OLIVE_DOOR, (b, p) -> new DoubleHighBlockItem(b, p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE))
    );
    public static final Item OLIVE_TRAPDOOR = registerBlock(
            AWRBlockItemIds.OLIVE_TRAPDOOR, AWRBlocks.OLIVE_TRAPDOOR, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item OLIVE_PRESSURE_PLATE = registerBlock(
            AWRBlockItemIds.OLIVE_PRESSURE_PLATE, AWRBlocks.OLIVE_PRESSURE_PLATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item OLIVE_BUTTON = registerBlock(
            AWRBlockItemIds.OLIVE_BUTTON, AWRBlocks.OLIVE_BUTTON, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)
    );
    public static final Item OLIVE_SIGN = registerBlock(
            AWRBlockItemIds.OLIVE_SIGN, AWRBlocks.OLIVE_SIGN,
            (b, p) -> new StandingAndWallBlockItem(b, AWRBlocks.OLIVE_WALL_SIGN, Direction.DOWN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item OLIVE_HANGING_SIGN = registerBlock(
            AWRBlockItemIds.OLIVE_HANGING_SIGN, AWRBlocks.OLIVE_HANGING_SIGN,
            (b, p) -> new HangingSignItem(b, AWRBlocks.OLIVE_WALL_HANGING_SIGN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item OLIVE_SHELF = registerBlock(
            AWRBlockItemIds.OLIVE_SHELF, AWRBlocks.OLIVE_SHELF,
            p -> p.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item OLIVE_LEAVES = registerBlock(
            AWRBlockItemIds.OLIVE_LEAVES, AWRBlocks.OLIVE_LEAVES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item OLIVE_SAPLING = registerBlock(
            AWRBlockItemIds.OLIVE_SAPLING, AWRBlocks.OLIVE_SAPLING,
            p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item OLIVE_BOAT = registerItem(
            AWRItemIds.OLIVE_BOAT,
            p -> new BoatItem(AWREntityTypes.OLIVE_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    public static final Item OLIVE_CHEST_BOAT = registerItem(
            AWRItemIds.OLIVE_CHEST_BOAT,
            p -> new BoatItem(AWREntityTypes.OLIVE_CHEST_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Item PALM_LOG = registerBlock(
            AWRBlockItemIds.PALM_LOG, AWRBlocks.PALM_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item PALM_WOOD = registerBlock(
            AWRBlockItemIds.PALM_WOOD, AWRBlocks.PALM_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_PALM_LOG = registerBlock(
            AWRBlockItemIds.STRIPPED_PALM_LOG, AWRBlocks.STRIPPED_PALM_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_PALM_WOOD = registerBlock(
            AWRBlockItemIds.STRIPPED_PALM_WOOD, AWRBlocks.STRIPPED_PALM_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item PALM_PLANKS = registerBlock(
            AWRBlockItemIds.PALM_PLANKS, AWRBlocks.PALM_PLANKS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item PALM_STAIRS = registerBlock(
            AWRBlockItemIds.PALM_STAIRS, AWRBlocks.PALM_STAIRS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item PALM_SLAB = registerBlock(
            AWRBlockItemIds.PALM_SLAB, AWRBlocks.PALM_SLAB, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS)
    );
    public static final Item PALM_FENCE = registerBlock(
            AWRBlockItemIds.PALM_FENCE, AWRBlocks.PALM_FENCE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item PALM_FENCE_GATE = registerBlock(
            AWRBlockItemIds.PALM_FENCE_GATE, AWRBlocks.PALM_FENCE_GATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item PALM_DOOR = registerBlock(
            AWRBlockItemIds.PALM_DOOR, AWRBlocks.PALM_DOOR, (b, p) -> new DoubleHighBlockItem(b, p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE))
    );
    public static final Item PALM_TRAPDOOR = registerBlock(
            AWRBlockItemIds.PALM_TRAPDOOR, AWRBlocks.PALM_TRAPDOOR, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item PALM_PRESSURE_PLATE = registerBlock(
            AWRBlockItemIds.PALM_PRESSURE_PLATE, AWRBlocks.PALM_PRESSURE_PLATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item PALM_BUTTON = registerBlock(
            AWRBlockItemIds.PALM_BUTTON, AWRBlocks.PALM_BUTTON, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)
    );
    public static final Item PALM_SIGN = registerBlock(
            AWRBlockItemIds.PALM_SIGN, AWRBlocks.PALM_SIGN,
            (b, p) -> new StandingAndWallBlockItem(b, AWRBlocks.PALM_WALL_SIGN, Direction.DOWN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item PALM_HANGING_SIGN = registerBlock(
            AWRBlockItemIds.PALM_HANGING_SIGN, AWRBlocks.PALM_HANGING_SIGN,
            (b, p) -> new HangingSignItem(b, AWRBlocks.PALM_WALL_HANGING_SIGN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item PALM_SHELF = registerBlock(
            AWRBlockItemIds.PALM_SHELF, AWRBlocks.PALM_SHELF,
            p -> p.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item PALM_LEAVES = registerBlock(
            AWRBlockItemIds.PALM_LEAVES, AWRBlocks.PALM_LEAVES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item PALM_SAPLING = registerBlock(
            AWRBlockItemIds.PALM_SAPLING, AWRBlocks.PALM_SAPLING,
            p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item PALM_BOAT = registerItem(
            AWRItemIds.PALM_BOAT,
            p -> new BoatItem(AWREntityTypes.PALM_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    public static final Item PALM_CHEST_BOAT = registerItem(
            AWRItemIds.PALM_CHEST_BOAT,
            p -> new BoatItem(AWREntityTypes.PALM_CHEST_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Item PALO_VERDE_LOG = registerBlock(
            AWRBlockItemIds.PALO_VERDE_LOG, AWRBlocks.PALO_VERDE_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item PALO_VERDE_WOOD = registerBlock(
            AWRBlockItemIds.PALO_VERDE_WOOD, AWRBlocks.PALO_VERDE_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_PALO_VERDE_LOG = registerBlock(
            AWRBlockItemIds.STRIPPED_PALO_VERDE_LOG, AWRBlocks.STRIPPED_PALO_VERDE_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_PALO_VERDE_WOOD = registerBlock(
            AWRBlockItemIds.STRIPPED_PALO_VERDE_WOOD, AWRBlocks.STRIPPED_PALO_VERDE_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item PALO_VERDE_PLANKS = registerBlock(
            AWRBlockItemIds.PALO_VERDE_PLANKS, AWRBlocks.PALO_VERDE_PLANKS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item PALO_VERDE_STAIRS = registerBlock(
            AWRBlockItemIds.PALO_VERDE_STAIRS, AWRBlocks.PALO_VERDE_STAIRS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item PALO_VERDE_SLAB = registerBlock(
            AWRBlockItemIds.PALO_VERDE_SLAB, AWRBlocks.PALO_VERDE_SLAB, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS)
    );
    public static final Item PALO_VERDE_FENCE = registerBlock(
            AWRBlockItemIds.PALO_VERDE_FENCE, AWRBlocks.PALO_VERDE_FENCE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item PALO_VERDE_FENCE_GATE = registerBlock(
            AWRBlockItemIds.PALO_VERDE_FENCE_GATE, AWRBlocks.PALO_VERDE_FENCE_GATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item PALO_VERDE_DOOR = registerBlock(
            AWRBlockItemIds.PALO_VERDE_DOOR, AWRBlocks.PALO_VERDE_DOOR, (b, p) -> new DoubleHighBlockItem(b, p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE))
    );
    public static final Item PALO_VERDE_TRAPDOOR = registerBlock(
            AWRBlockItemIds.PALO_VERDE_TRAPDOOR, AWRBlocks.PALO_VERDE_TRAPDOOR, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item PALO_VERDE_PRESSURE_PLATE = registerBlock(
            AWRBlockItemIds.PALO_VERDE_PRESSURE_PLATE, AWRBlocks.PALO_VERDE_PRESSURE_PLATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item PALO_VERDE_BUTTON = registerBlock(
            AWRBlockItemIds.PALO_VERDE_BUTTON, AWRBlocks.PALO_VERDE_BUTTON, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)
    );
    public static final Item PALO_VERDE_SIGN = registerBlock(
            AWRBlockItemIds.PALO_VERDE_SIGN, AWRBlocks.PALO_VERDE_SIGN,
            (b, p) -> new StandingAndWallBlockItem(b, AWRBlocks.PALO_VERDE_WALL_SIGN, Direction.DOWN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item PALO_VERDE_HANGING_SIGN = registerBlock(
            AWRBlockItemIds.PALO_VERDE_HANGING_SIGN, AWRBlocks.PALO_VERDE_HANGING_SIGN,
            (b, p) -> new HangingSignItem(b, AWRBlocks.PALO_VERDE_WALL_HANGING_SIGN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item PALO_VERDE_SHELF = registerBlock(
            AWRBlockItemIds.PALO_VERDE_SHELF, AWRBlocks.PALO_VERDE_SHELF,
            p -> p.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item PALO_VERDE_LEAVES = registerBlock(
            AWRBlockItemIds.PALO_VERDE_LEAVES, AWRBlocks.PALO_VERDE_LEAVES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item PALO_VERDE_SAPLING = registerBlock(
            AWRBlockItemIds.PALO_VERDE_SAPLING, AWRBlocks.PALO_VERDE_SAPLING,
            p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item PALO_VERDE_BOAT = registerItem(
            AWRItemIds.PALO_VERDE_BOAT,
            p -> new BoatItem(AWREntityTypes.PALO_VERDE_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    public static final Item PALO_VERDE_CHEST_BOAT = registerItem(
            AWRItemIds.PALO_VERDE_CHEST_BOAT,
            p -> new BoatItem(AWREntityTypes.PALO_VERDE_CHEST_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Item PINE_LOG = registerBlock(
            AWRBlockItemIds.PINE_LOG, AWRBlocks.PINE_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item PINE_WOOD = registerBlock(
            AWRBlockItemIds.PINE_WOOD, AWRBlocks.PINE_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_PINE_LOG = registerBlock(
            AWRBlockItemIds.STRIPPED_PINE_LOG, AWRBlocks.STRIPPED_PINE_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_PINE_WOOD = registerBlock(
            AWRBlockItemIds.STRIPPED_PINE_WOOD, AWRBlocks.STRIPPED_PINE_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item PINE_PLANKS = registerBlock(
            AWRBlockItemIds.PINE_PLANKS, AWRBlocks.PINE_PLANKS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item PINE_STAIRS = registerBlock(
            AWRBlockItemIds.PINE_STAIRS, AWRBlocks.PINE_STAIRS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item PINE_SLAB = registerBlock(
            AWRBlockItemIds.PINE_SLAB, AWRBlocks.PINE_SLAB, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS)
    );
    public static final Item PINE_FENCE = registerBlock(
            AWRBlockItemIds.PINE_FENCE, AWRBlocks.PINE_FENCE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item PINE_FENCE_GATE = registerBlock(
            AWRBlockItemIds.PINE_FENCE_GATE, AWRBlocks.PINE_FENCE_GATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item PINE_DOOR = registerBlock(
            AWRBlockItemIds.PINE_DOOR, AWRBlocks.PINE_DOOR, (b, p) -> new DoubleHighBlockItem(b, p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE))
    );
    public static final Item PINE_TRAPDOOR = registerBlock(
            AWRBlockItemIds.PINE_TRAPDOOR, AWRBlocks.PINE_TRAPDOOR, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item PINE_PRESSURE_PLATE = registerBlock(
            AWRBlockItemIds.PINE_PRESSURE_PLATE, AWRBlocks.PINE_PRESSURE_PLATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item PINE_BUTTON = registerBlock(
            AWRBlockItemIds.PINE_BUTTON, AWRBlocks.PINE_BUTTON, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)
    );
    public static final Item PINE_SIGN = registerBlock(
            AWRBlockItemIds.PINE_SIGN, AWRBlocks.PINE_SIGN,
            (b, p) -> new StandingAndWallBlockItem(b, AWRBlocks.PINE_WALL_SIGN, Direction.DOWN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item PINE_HANGING_SIGN = registerBlock(
            AWRBlockItemIds.PINE_HANGING_SIGN, AWRBlocks.PINE_HANGING_SIGN,
            (b, p) -> new HangingSignItem(b, AWRBlocks.PINE_WALL_HANGING_SIGN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item PINE_SHELF = registerBlock(
            AWRBlockItemIds.PINE_SHELF, AWRBlocks.PINE_SHELF,
            p -> p.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item PINE_LEAVES = registerBlock(
            AWRBlockItemIds.PINE_LEAVES, AWRBlocks.PINE_LEAVES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item PINE_SAPLING = registerBlock(
            AWRBlockItemIds.PINE_SAPLING, AWRBlocks.PINE_SAPLING,
            p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item PINE_BOAT = registerItem(
            AWRItemIds.PINE_BOAT,
            p -> new BoatItem(AWREntityTypes.PINE_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    public static final Item PINE_CHEST_BOAT = registerItem(
            AWRItemIds.PINE_CHEST_BOAT,
            p -> new BoatItem(AWREntityTypes.PINE_CHEST_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Item REDWOOD_LOG = registerBlock(
            AWRBlockItemIds.REDWOOD_LOG, AWRBlocks.REDWOOD_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item REDWOOD_WOOD = registerBlock(
            AWRBlockItemIds.REDWOOD_WOOD, AWRBlocks.REDWOOD_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_REDWOOD_LOG = registerBlock(
            AWRBlockItemIds.STRIPPED_REDWOOD_LOG, AWRBlocks.STRIPPED_REDWOOD_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_REDWOOD_WOOD = registerBlock(
            AWRBlockItemIds.STRIPPED_REDWOOD_WOOD, AWRBlocks.STRIPPED_REDWOOD_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item REDWOOD_PLANKS = registerBlock(
            AWRBlockItemIds.REDWOOD_PLANKS, AWRBlocks.REDWOOD_PLANKS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item REDWOOD_STAIRS = registerBlock(
            AWRBlockItemIds.REDWOOD_STAIRS, AWRBlocks.REDWOOD_STAIRS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item REDWOOD_SLAB = registerBlock(
            AWRBlockItemIds.REDWOOD_SLAB, AWRBlocks.REDWOOD_SLAB, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS)
    );
    public static final Item REDWOOD_FENCE = registerBlock(
            AWRBlockItemIds.REDWOOD_FENCE, AWRBlocks.REDWOOD_FENCE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item REDWOOD_FENCE_GATE = registerBlock(
            AWRBlockItemIds.REDWOOD_FENCE_GATE, AWRBlocks.REDWOOD_FENCE_GATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item REDWOOD_DOOR = registerBlock(
            AWRBlockItemIds.REDWOOD_DOOR, AWRBlocks.REDWOOD_DOOR, (b, p) -> new DoubleHighBlockItem(b, p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE))
    );
    public static final Item REDWOOD_TRAPDOOR = registerBlock(
            AWRBlockItemIds.REDWOOD_TRAPDOOR, AWRBlocks.REDWOOD_TRAPDOOR, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item REDWOOD_PRESSURE_PLATE = registerBlock(
            AWRBlockItemIds.REDWOOD_PRESSURE_PLATE, AWRBlocks.REDWOOD_PRESSURE_PLATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item REDWOOD_BUTTON = registerBlock(
            AWRBlockItemIds.REDWOOD_BUTTON, AWRBlocks.REDWOOD_BUTTON, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)
    );
    public static final Item REDWOOD_SIGN = registerBlock(
            AWRBlockItemIds.REDWOOD_SIGN, AWRBlocks.REDWOOD_SIGN,
            (b, p) -> new StandingAndWallBlockItem(b, AWRBlocks.REDWOOD_WALL_SIGN, Direction.DOWN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item REDWOOD_HANGING_SIGN = registerBlock(
            AWRBlockItemIds.REDWOOD_HANGING_SIGN, AWRBlocks.REDWOOD_HANGING_SIGN,
            (b, p) -> new HangingSignItem(b, AWRBlocks.REDWOOD_WALL_HANGING_SIGN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item REDWOOD_SHELF = registerBlock(
            AWRBlockItemIds.REDWOOD_SHELF, AWRBlocks.REDWOOD_SHELF,
            p -> p.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item REDWOOD_LEAVES = registerBlock(
            AWRBlockItemIds.REDWOOD_LEAVES, AWRBlocks.REDWOOD_LEAVES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item REDWOOD_SAPLING = registerBlock(
            AWRBlockItemIds.REDWOOD_SAPLING, AWRBlocks.REDWOOD_SAPLING,
            p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item REDWOOD_BOAT = registerItem(
            AWRItemIds.REDWOOD_BOAT,
            p -> new BoatItem(AWREntityTypes.REDWOOD_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    public static final Item REDWOOD_CHEST_BOAT = registerItem(
            AWRItemIds.REDWOOD_CHEST_BOAT,
            p -> new BoatItem(AWREntityTypes.REDWOOD_CHEST_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Item SEQUOIA_LOG = registerBlock(
            AWRBlockItemIds.SEQUOIA_LOG, AWRBlocks.SEQUOIA_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item SEQUOIA_WOOD = registerBlock(
            AWRBlockItemIds.SEQUOIA_WOOD, AWRBlocks.SEQUOIA_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_SEQUOIA_LOG = registerBlock(
            AWRBlockItemIds.STRIPPED_SEQUOIA_LOG, AWRBlocks.STRIPPED_SEQUOIA_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_SEQUOIA_WOOD = registerBlock(
            AWRBlockItemIds.STRIPPED_SEQUOIA_WOOD, AWRBlocks.STRIPPED_SEQUOIA_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item SEQUOIA_PLANKS = registerBlock(
            AWRBlockItemIds.SEQUOIA_PLANKS, AWRBlocks.SEQUOIA_PLANKS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item SEQUOIA_STAIRS = registerBlock(
            AWRBlockItemIds.SEQUOIA_STAIRS, AWRBlocks.SEQUOIA_STAIRS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item SEQUOIA_SLAB = registerBlock(
            AWRBlockItemIds.SEQUOIA_SLAB, AWRBlocks.SEQUOIA_SLAB, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS)
    );
    public static final Item SEQUOIA_FENCE = registerBlock(
            AWRBlockItemIds.SEQUOIA_FENCE, AWRBlocks.SEQUOIA_FENCE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item SEQUOIA_FENCE_GATE = registerBlock(
            AWRBlockItemIds.SEQUOIA_FENCE_GATE, AWRBlocks.SEQUOIA_FENCE_GATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item SEQUOIA_DOOR = registerBlock(
            AWRBlockItemIds.SEQUOIA_DOOR, AWRBlocks.SEQUOIA_DOOR, (b, p) -> new DoubleHighBlockItem(b, p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE))
    );
    public static final Item SEQUOIA_TRAPDOOR = registerBlock(
            AWRBlockItemIds.SEQUOIA_TRAPDOOR, AWRBlocks.SEQUOIA_TRAPDOOR, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item SEQUOIA_PRESSURE_PLATE = registerBlock(
            AWRBlockItemIds.SEQUOIA_PRESSURE_PLATE, AWRBlocks.SEQUOIA_PRESSURE_PLATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item SEQUOIA_BUTTON = registerBlock(
            AWRBlockItemIds.SEQUOIA_BUTTON, AWRBlocks.SEQUOIA_BUTTON, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)
    );
    public static final Item SEQUOIA_SIGN = registerBlock(
            AWRBlockItemIds.SEQUOIA_SIGN, AWRBlocks.SEQUOIA_SIGN,
            (b, p) -> new StandingAndWallBlockItem(b, AWRBlocks.SEQUOIA_WALL_SIGN, Direction.DOWN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item SEQUOIA_HANGING_SIGN = registerBlock(
            AWRBlockItemIds.SEQUOIA_HANGING_SIGN, AWRBlocks.SEQUOIA_HANGING_SIGN,
            (b, p) -> new HangingSignItem(b, AWRBlocks.SEQUOIA_WALL_HANGING_SIGN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item SEQUOIA_SHELF = registerBlock(
            AWRBlockItemIds.SEQUOIA_SHELF, AWRBlocks.SEQUOIA_SHELF,
            p -> p.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item SEQUOIA_LEAVES = registerBlock(
            AWRBlockItemIds.SEQUOIA_LEAVES, AWRBlocks.SEQUOIA_LEAVES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item SEQUOIA_SAPLING = registerBlock(
            AWRBlockItemIds.SEQUOIA_SAPLING, AWRBlocks.SEQUOIA_SAPLING,
            p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item SEQUOIA_BOAT = registerItem(
            AWRItemIds.SEQUOIA_BOAT,
            p -> new BoatItem(AWREntityTypes.SEQUOIA_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    public static final Item SEQUOIA_CHEST_BOAT = registerItem(
            AWRItemIds.SEQUOIA_CHEST_BOAT,
            p -> new BoatItem(AWREntityTypes.SEQUOIA_CHEST_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Item WILLOW_LOG = registerBlock(
            AWRBlockItemIds.WILLOW_LOG, AWRBlocks.WILLOW_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item WILLOW_WOOD = registerBlock(
            AWRBlockItemIds.WILLOW_WOOD, AWRBlocks.WILLOW_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_WILLOW_LOG = registerBlock(
            AWRBlockItemIds.STRIPPED_WILLOW_LOG, AWRBlocks.STRIPPED_WILLOW_LOG, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item STRIPPED_WILLOW_WOOD = registerBlock(
            AWRBlockItemIds.STRIPPED_WILLOW_WOOD, AWRBlocks.STRIPPED_WILLOW_WOOD, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item WILLOW_PLANKS = registerBlock(
            AWRBlockItemIds.WILLOW_PLANKS, AWRBlocks.WILLOW_PLANKS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item WILLOW_STAIRS = registerBlock(
            AWRBlockItemIds.WILLOW_STAIRS, AWRBlocks.WILLOW_STAIRS, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item WILLOW_SLAB = registerBlock(
            AWRBlockItemIds.WILLOW_SLAB, AWRBlocks.WILLOW_SLAB, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS)
    );
    public static final Item WILLOW_FENCE = registerBlock(
            AWRBlockItemIds.WILLOW_FENCE, AWRBlocks.WILLOW_FENCE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item WILLOW_FENCE_GATE = registerBlock(
            AWRBlockItemIds.WILLOW_FENCE_GATE, AWRBlocks.WILLOW_FENCE_GATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item WILLOW_DOOR = registerBlock(
            AWRBlockItemIds.WILLOW_DOOR, AWRBlocks.WILLOW_DOOR, (b, p) -> new DoubleHighBlockItem(b, p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE))
    );
    public static final Item WILLOW_TRAPDOOR = registerBlock(
            AWRBlockItemIds.WILLOW_TRAPDOOR, AWRBlocks.WILLOW_TRAPDOOR, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item WILLOW_PRESSURE_PLATE = registerBlock(
            AWRBlockItemIds.WILLOW_PRESSURE_PLATE, AWRBlocks.WILLOW_PRESSURE_PLATE, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item WILLOW_BUTTON = registerBlock(
            AWRBlockItemIds.WILLOW_BUTTON, AWRBlocks.WILLOW_BUTTON, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL)
    );
    public static final Item WILLOW_SIGN = registerBlock(
            AWRBlockItemIds.WILLOW_SIGN, AWRBlocks.WILLOW_SIGN,
            (b, p) -> new StandingAndWallBlockItem(b, AWRBlocks.WILLOW_WALL_SIGN, Direction.DOWN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item WILLOW_HANGING_SIGN = registerBlock(
            AWRBlockItemIds.WILLOW_HANGING_SIGN, AWRBlocks.WILLOW_HANGING_SIGN,
            (b, p) -> new HangingSignItem(b, AWRBlocks.WILLOW_WALL_HANGING_SIGN, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).signText()
    );
    public static final Item WILLOW_SHELF = registerBlock(
            AWRBlockItemIds.WILLOW_SHELF, AWRBlocks.WILLOW_SHELF,
            p -> p.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS)
    );
    public static final Item WILLOW_LEAVES = registerBlock(
            AWRBlockItemIds.WILLOW_LEAVES, AWRBlocks.WILLOW_LEAVES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item WILLOW_SAPLING = registerBlock(
            AWRBlockItemIds.WILLOW_SAPLING, AWRBlocks.WILLOW_SAPLING,
            p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item WILLOW_BOAT = registerItem(
            AWRItemIds.WILLOW_BOAT,
            p -> new BoatItem(AWREntityTypes.WILLOW_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    public static final Item WILLOW_CHEST_BOAT = registerItem(
            AWRItemIds.WILLOW_CHEST_BOAT,
            p -> new BoatItem(AWREntityTypes.WILLOW_CHEST_BOAT, p),
            new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_BOATS).stacksTo(1)
    );
    
    //* -------------------------------------------------------------------------------------------------------------------------
    
    public static final Item WHITE_SAND = registerBlock(
            AWRBlockItemIds.WHITE_SAND, AWRBlocks.WHITE_SAND
    );
    public static final Item WHITE_SANDSTONE = registerBlock(
            AWRBlockItemIds.WHITE_SANDSTONE, AWRBlocks.WHITE_SANDSTONE
    );
    public static final Item WHITE_SANDSTONE_SLAB = registerBlock(
            AWRBlockItemIds.WHITE_SANDSTONE_SLAB, AWRBlocks.WHITE_SANDSTONE_SLAB
    );
    public static final Item WHITE_SANDSTONE_STAIRS = registerBlock(
            AWRBlockItemIds.WHITE_SANDSTONE_STAIRS, AWRBlocks.WHITE_SANDSTONE_STAIRS
    );
    public static final Item WHITE_SANDSTONE_WALL = registerBlock(
            AWRBlockItemIds.WHITE_SANDSTONE_WALL, AWRBlocks.WHITE_SANDSTONE_WALL
    );
    public static final Item CUT_WHITE_SANDSTONE = registerBlock(
            AWRBlockItemIds.CUT_WHITE_SANDSTONE, AWRBlocks.CUT_WHITE_SANDSTONE
    );
    public static final Item CUT_WHITE_SANDSTONE_SLAB = registerBlock(
            AWRBlockItemIds.CUT_WHITE_SANDSTONE_SLAB, AWRBlocks.CUT_WHITE_SANDSTONE_SLAB
    );
    public static final Item SMOOTH_WHITE_SANDSTONE = registerBlock(
            AWRBlockItemIds.SMOOTH_WHITE_SANDSTONE, AWRBlocks.SMOOTH_WHITE_SANDSTONE
    );
    public static final Item SMOOTH_WHITE_SANDSTONE_SLAB = registerBlock(
            AWRBlockItemIds.SMOOTH_WHITE_SANDSTONE_SLAB, AWRBlocks.SMOOTH_WHITE_SANDSTONE_SLAB
    );
    public static final Item SMOOTH_WHITE_SANDSTONE_STAIRS = registerBlock(
            AWRBlockItemIds.SMOOTH_WHITE_SANDSTONE_STAIRS, AWRBlocks.SMOOTH_WHITE_SANDSTONE_STAIRS
    );
    public static final Item CHISELED_WHITE_SANDSTONE = registerBlock(
            AWRBlockItemIds.CHISELED_WHITE_SANDSTONE, AWRBlocks.CHISELED_WHITE_SANDSTONE
    );
    
    public static final Item SNOW_BRICKS = registerBlock(
            AWRBlockItemIds.SNOW_BRICKS, AWRBlocks.SNOW_BRICKS
    );
    public static final Item SNOW_BRICK_STAIRS = registerBlock(
            AWRBlockItemIds.SNOW_BRICK_STAIRS, AWRBlocks.SNOW_BRICK_STAIRS
    );
    public static final Item SNOW_BRICK_SLAB = registerBlock(
            AWRBlockItemIds.SNOW_BRICK_SLAB, AWRBlocks.SNOW_BRICK_SLAB
    );
    public static final Item SNOW_BRICK_WALL = registerBlock(
            AWRBlockItemIds.SNOW_BRICK_WALL, AWRBlocks.SNOW_BRICK_WALL
    );
    
    public static final Item PACKED_ICE_BRICKS = registerBlock(
            AWRBlockItemIds.PACKED_ICE_BRICKS, AWRBlocks.PACKED_ICE_BRICKS
    );
    public static final Item PACKED_ICE_BRICK_STAIRS = registerBlock(
            AWRBlockItemIds.PACKED_ICE_BRICK_STAIRS, AWRBlocks.PACKED_ICE_BRICK_STAIRS
    );
    public static final Item PACKED_ICE_BRICK_SLAB = registerBlock(
            AWRBlockItemIds.PACKED_ICE_BRICK_SLAB, AWRBlocks.PACKED_ICE_BRICK_SLAB
    );
    public static final Item PACKED_ICE_BRICK_WALL = registerBlock(
            AWRBlockItemIds.PACKED_ICE_BRICK_WALL, AWRBlocks.PACKED_ICE_BRICK_WALL
    );
    
    public static final Item PERMAFROST = registerBlock(
            AWRBlockItemIds.PERMAFROST, AWRBlocks.PERMAFROST
    );
    public static final Item SHORT_FROSTED_GRASS = registerBlock(
            AWRBlockItemIds.SHORT_FROSTED_GRASS, AWRBlocks.SHORT_FROSTED_GRASS, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item TALL_FROSTED_GRASS = registerBlock(
            AWRBlockItemIds.TALL_FROSTED_GRASS, AWRBlocks.TALL_FROSTED_GRASS, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item SHORT_TUNDRA_GRASS = registerBlock(
            AWRBlockItemIds.SHORT_TUNDRA_GRASS, AWRBlocks.SHORT_TUNDRA_GRASS, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item TALL_TUNDRA_GRASS = registerBlock(
            AWRBlockItemIds.TALL_TUNDRA_GRASS, AWRBlocks.TALL_TUNDRA_GRASS, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item PINECONES = registerBlock(
            AWRBlockItemIds.PINECONES, AWRBlocks.PINECONES, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item PEAT = registerBlock(
            AWRBlockItemIds.PEAT, AWRBlocks.PEAT, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item PEAT_BLOCK = registerBlock(
            AWRBlockItemIds.PEAT_BLOCK, AWRBlocks.PEAT_BLOCK, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW).cookingFuel(ContextIntProviders.COOKING_TIME_DRY_PLANTS)
    );
    public static final Item QUICKSAND_BUCKET = registerItem(
            AWRBlockItemIds.QUICKSAND.item(),
            p -> new SolidBucketItem(AWRBlocks.QUICKSAND, SoundEvents.BUCKET_EMPTY_POWDER_SNOW, p),
            new Item.Properties().stacksTo(1).useItemDescriptionPrefix()
    );
    public static final Item CATTAIL = registerBlock(
            AWRBlockItemIds.CATTAIL, AWRBlocks.CATTAIL
    );
    public static final Item SHORT_PRAIRIE_GRASS = registerBlock(
            AWRBlockItemIds.SHORT_PRAIRIE_GRASS, AWRBlocks.SHORT_PRAIRIE_GRASS, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW)
    );
    public static final Item TALL_PRAIRIE_GRASS = registerBlock(
            AWRBlockItemIds.TALL_PRAIRIE_GRASS, AWRBlocks.TALL_PRAIRIE_GRASS, p -> p.compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)
    );
    
    public static final Item ACORN = registerItem(
            AWRItemIds.ACORN,
            Item::new,
            new Item.Properties()
    );
    public static final Item BAOBAB_FRUIT = registerItem(
            AWRItemIds.BAOBAB_FRUIT,
            Item::new,
            new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(1.0F).build())
    );
    public static final Item CHERRY = registerItem(
            AWRItemIds.CHERRY,
            Item::new,
            new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(1.0F).build())
    );
    public static final Item COCONUT = registerItem(
            AWRItemIds.COCONUT,
            Item::new,
            new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(1.0F).build())
    );
    public static final Item DATE = registerItem(
            AWRItemIds.DATE,
            Item::new,
            new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(1.0F).build())
    );
    public static final Item FIG = registerItem(
            AWRItemIds.FIG,
            Item::new,
            new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(1.0F).build())
    );
    public static final Item OLIVE = registerItem(
            AWRItemIds.OLIVE,
            Item::new,
            new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(1.0F).build())
    );
    public static final Item PECAN = registerItem(
            AWRItemIds.PECAN,
            Item::new,
            new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(1.0F).build())
    );
    public static final Item PERSIMMON = registerItem(
            AWRItemIds.PERSIMMON,
            Item::new,
            new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(1.0F).build())
    );
    
    //` -------------------------------------------------------------------------------------------------------------------------
    
    public static Item registerBlock(final BlockItemId id, final Block block) {
        return registerBlock(id, block, BlockItem::new);
    }
    
    private static Item registerBlock(final BlockItemId id, final Block block, final UnaryOperator<Item.Properties> propertiesFunction) {
        return registerBlock(id, block, (b, p) -> new BlockItem(b, propertiesFunction.apply(p)));
    }
    
    public static Item registerBlock(final BlockItemId id, final Block block, final BiFunction<Block, Item.Properties, Item> itemFactory) {
        return registerBlock(id, block, itemFactory, new Item.Properties());
    }
    

    public static Item registerBlock(final BlockItemId id, final Block block, final BiFunction<Block, Item.Properties, Item> itemFactory, final Item.Properties properties) {
        return registerItem(id.item(), (p) -> itemFactory.apply(block, p), properties.useBlockDescriptionPrefix().requiredFeatures(block.requiredFeatures()));
    }
    
    public static Item registerItem(final ResourceKey<Item> id, final Function<Item.Properties, Item> itemFactory, final Item.Properties properties) {
        Item item = itemFactory.apply(properties.setId(id));
        if (item instanceof BlockItem blockItem) {
            blockItem.registerBlocks(Item.BY_BLOCK, item);
        }

        return Registry.register(BuiltInRegistries.ITEM, id, item);
    }

    public static void init() {}
}
