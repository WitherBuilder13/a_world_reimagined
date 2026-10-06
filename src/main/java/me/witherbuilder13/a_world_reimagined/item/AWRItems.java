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
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.ItemContainerContents;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class AWRItems {
    
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
