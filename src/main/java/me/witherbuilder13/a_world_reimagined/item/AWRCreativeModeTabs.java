package me.witherbuilder13.a_world_reimagined.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.world.item.CreativeModeTabs;

import static me.witherbuilder13.a_world_reimagined.item.AWRItems.*;
import static net.minecraft.world.item.Items.*;

public class AWRCreativeModeTabs {
	
	public static void init() {
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {
			
			content.insertAfter(POPLAR_BUTTON, ASPEN_LOG);
			content.insertAfter(ASPEN_LOG, ASPEN_WOOD);
			content.insertAfter(ASPEN_WOOD, STRIPPED_ASPEN_LOG);
			content.insertAfter(STRIPPED_ASPEN_LOG, STRIPPED_ASPEN_WOOD);
			content.insertAfter(STRIPPED_ASPEN_WOOD, ASPEN_PLANKS);
			content.insertAfter(ASPEN_PLANKS, ASPEN_STAIRS);
			content.insertAfter(ASPEN_STAIRS, ASPEN_SLAB);
			content.insertAfter(ASPEN_SLAB, ASPEN_FENCE);
			content.insertAfter(ASPEN_FENCE, ASPEN_FENCE_GATE);
			content.insertAfter(ASPEN_FENCE_GATE, ASPEN_DOOR);
			content.insertAfter(ASPEN_DOOR, ASPEN_TRAPDOOR);
			content.insertAfter(ASPEN_TRAPDOOR, ASPEN_PRESSURE_PLATE);
			content.insertAfter(ASPEN_PRESSURE_PLATE, ASPEN_BUTTON);
			
			content.insertAfter(ASPEN_BUTTON, CEDAR_LOG);
			content.insertAfter(CEDAR_LOG, CEDAR_WOOD);
			content.insertAfter(CEDAR_WOOD, STRIPPED_CEDAR_LOG);
			content.insertAfter(STRIPPED_CEDAR_LOG, STRIPPED_CEDAR_WOOD);
			content.insertAfter(STRIPPED_CEDAR_WOOD, CEDAR_PLANKS);
			content.insertAfter(CEDAR_PLANKS, CEDAR_STAIRS);
			content.insertAfter(CEDAR_STAIRS, CEDAR_SLAB);
			content.insertAfter(CEDAR_SLAB, CEDAR_FENCE);
			content.insertAfter(CEDAR_FENCE, CEDAR_FENCE_GATE);
			content.insertAfter(CEDAR_FENCE_GATE, CEDAR_DOOR);
			content.insertAfter(CEDAR_DOOR, CEDAR_TRAPDOOR);
			content.insertAfter(CEDAR_TRAPDOOR, CEDAR_PRESSURE_PLATE);
			content.insertAfter(CEDAR_PRESSURE_PLATE, CEDAR_BUTTON);
			
			content.insertAfter(CEDAR_BUTTON, FIR_LOG);
			content.insertAfter(FIR_LOG, FIR_WOOD);
			content.insertAfter(FIR_WOOD, STRIPPED_FIR_LOG);
			content.insertAfter(STRIPPED_FIR_LOG, STRIPPED_FIR_WOOD);
			content.insertAfter(STRIPPED_FIR_WOOD, FIR_PLANKS);
			content.insertAfter(FIR_PLANKS, FIR_STAIRS);
			content.insertAfter(FIR_STAIRS, FIR_SLAB);
			content.insertAfter(FIR_SLAB, FIR_FENCE);
			content.insertAfter(FIR_FENCE, FIR_FENCE_GATE);
			content.insertAfter(FIR_FENCE_GATE, FIR_DOOR);
			content.insertAfter(FIR_DOOR, FIR_TRAPDOOR);
			content.insertAfter(FIR_TRAPDOOR, FIR_PRESSURE_PLATE);
			content.insertAfter(FIR_PRESSURE_PLATE, FIR_BUTTON);
			
			content.insertAfter(FIR_BUTTON, HEMLOCK_LOG);
			content.insertAfter(HEMLOCK_LOG, HEMLOCK_WOOD);
			content.insertAfter(HEMLOCK_WOOD, STRIPPED_HEMLOCK_LOG);
			content.insertAfter(STRIPPED_HEMLOCK_LOG, STRIPPED_HEMLOCK_WOOD);
			content.insertAfter(STRIPPED_HEMLOCK_WOOD, HEMLOCK_PLANKS);
			content.insertAfter(HEMLOCK_PLANKS, HEMLOCK_STAIRS);
			content.insertAfter(HEMLOCK_STAIRS, HEMLOCK_SLAB);
			content.insertAfter(HEMLOCK_SLAB, HEMLOCK_FENCE);
			content.insertAfter(HEMLOCK_FENCE, HEMLOCK_FENCE_GATE);
			content.insertAfter(HEMLOCK_FENCE_GATE, HEMLOCK_DOOR);
			content.insertAfter(HEMLOCK_DOOR, HEMLOCK_TRAPDOOR);
			content.insertAfter(HEMLOCK_TRAPDOOR, HEMLOCK_PRESSURE_PLATE);
			content.insertAfter(HEMLOCK_PRESSURE_PLATE, HEMLOCK_BUTTON);
			
			content.insertAfter(HEMLOCK_BUTTON, LARCH_LOG);
			content.insertAfter(LARCH_LOG, LARCH_WOOD);
			content.insertAfter(LARCH_WOOD, STRIPPED_LARCH_LOG);
			content.insertAfter(STRIPPED_LARCH_LOG, STRIPPED_LARCH_WOOD);
			content.insertAfter(STRIPPED_LARCH_WOOD, LARCH_PLANKS);
			content.insertAfter(LARCH_PLANKS, LARCH_STAIRS);
			content.insertAfter(LARCH_STAIRS, LARCH_SLAB);
			content.insertAfter(LARCH_SLAB, LARCH_FENCE);
			content.insertAfter(LARCH_FENCE, LARCH_FENCE_GATE);
			content.insertAfter(LARCH_FENCE_GATE, LARCH_DOOR);
			content.insertAfter(LARCH_DOOR, LARCH_TRAPDOOR);
			content.insertAfter(LARCH_TRAPDOOR, LARCH_PRESSURE_PLATE);
			content.insertAfter(LARCH_PRESSURE_PLATE, LARCH_BUTTON);
			
			content.insertAfter(LARCH_BUTTON, PINE_LOG);
			content.insertAfter(PINE_LOG, PINE_WOOD);
			content.insertAfter(PINE_WOOD, STRIPPED_PINE_LOG);
			content.insertAfter(STRIPPED_PINE_LOG, STRIPPED_PINE_WOOD);
			content.insertAfter(STRIPPED_PINE_WOOD, PINE_PLANKS);
			content.insertAfter(PINE_PLANKS, PINE_STAIRS);
			content.insertAfter(PINE_STAIRS, PINE_SLAB);
			content.insertAfter(PINE_SLAB, PINE_FENCE);
			content.insertAfter(PINE_FENCE, PINE_FENCE_GATE);
			content.insertAfter(PINE_FENCE_GATE, PINE_DOOR);
			content.insertAfter(PINE_DOOR, PINE_TRAPDOOR);
			content.insertAfter(PINE_TRAPDOOR, PINE_PRESSURE_PLATE);
			content.insertAfter(PINE_PRESSURE_PLATE, PINE_BUTTON);
			
			content.insertAfter(PINE_BUTTON, REDWOOD_LOG);
			content.insertAfter(REDWOOD_LOG, REDWOOD_WOOD);
			content.insertAfter(REDWOOD_WOOD, STRIPPED_REDWOOD_LOG);
			content.insertAfter(STRIPPED_REDWOOD_LOG, STRIPPED_REDWOOD_WOOD);
			content.insertAfter(STRIPPED_REDWOOD_WOOD, REDWOOD_PLANKS);
			content.insertAfter(REDWOOD_PLANKS, REDWOOD_STAIRS);
			content.insertAfter(REDWOOD_STAIRS, REDWOOD_SLAB);
			content.insertAfter(REDWOOD_SLAB, REDWOOD_FENCE);
			content.insertAfter(REDWOOD_FENCE, REDWOOD_FENCE_GATE);
			content.insertAfter(REDWOOD_FENCE_GATE, REDWOOD_DOOR);
			content.insertAfter(REDWOOD_DOOR, REDWOOD_TRAPDOOR);
			content.insertAfter(REDWOOD_TRAPDOOR, REDWOOD_PRESSURE_PLATE);
			content.insertAfter(REDWOOD_PRESSURE_PLATE, REDWOOD_BUTTON);
			
			content.insertAfter(REDWOOD_BUTTON, SEQUOIA_LOG);
			content.insertAfter(SEQUOIA_LOG, SEQUOIA_WOOD);
			content.insertAfter(SEQUOIA_WOOD, STRIPPED_SEQUOIA_LOG);
			content.insertAfter(STRIPPED_SEQUOIA_LOG, STRIPPED_SEQUOIA_WOOD);
			content.insertAfter(STRIPPED_SEQUOIA_WOOD, SEQUOIA_PLANKS);
			content.insertAfter(SEQUOIA_PLANKS, SEQUOIA_STAIRS);
			content.insertAfter(SEQUOIA_STAIRS, SEQUOIA_SLAB);
			content.insertAfter(SEQUOIA_SLAB, SEQUOIA_FENCE);
			content.insertAfter(SEQUOIA_FENCE, SEQUOIA_FENCE_GATE);
			content.insertAfter(SEQUOIA_FENCE_GATE, SEQUOIA_DOOR);
			content.insertAfter(SEQUOIA_DOOR, SEQUOIA_TRAPDOOR);
			content.insertAfter(SEQUOIA_TRAPDOOR, SEQUOIA_PRESSURE_PLATE);
			content.insertAfter(SEQUOIA_PRESSURE_PLATE, SEQUOIA_BUTTON);
			
			content.insertAfter(CUT_RED_SANDSTONE_SLAB, WHITE_SANDSTONE);
			content.insertAfter(WHITE_SANDSTONE, WHITE_SANDSTONE_STAIRS);
			content.insertAfter(WHITE_SANDSTONE_STAIRS, WHITE_SANDSTONE_SLAB);
			content.insertAfter(WHITE_SANDSTONE_SLAB, WHITE_SANDSTONE_WALL);
			content.insertAfter(WHITE_SANDSTONE_WALL, CHISELED_WHITE_SANDSTONE);
			content.insertAfter(CHISELED_WHITE_SANDSTONE, SMOOTH_WHITE_SANDSTONE);
			content.insertAfter(SMOOTH_WHITE_SANDSTONE, SMOOTH_WHITE_SANDSTONE_STAIRS);
			content.insertAfter(SMOOTH_WHITE_SANDSTONE_STAIRS, SMOOTH_WHITE_SANDSTONE_SLAB);
			content.insertAfter(SMOOTH_WHITE_SANDSTONE_SLAB, CUT_WHITE_SANDSTONE);
			content.insertAfter(CUT_WHITE_SANDSTONE, CUT_WHITE_SANDSTONE_SLAB);
			
			content.insertAfter(DARK_PRISMARINE_SLAB, SNOW_BLOCK);
			content.insertAfter(SNOW_BLOCK, SNOW_BRICKS);
			content.insertAfter(SNOW_BRICKS, SNOW_BRICK_STAIRS);
			content.insertAfter(SNOW_BRICK_STAIRS, SNOW_BRICK_SLAB);
			content.insertAfter(SNOW_BRICK_SLAB, SNOW_BRICK_WALL);
			content.insertAfter(SNOW_BRICK_WALL, PACKED_ICE);
			content.insertAfter(PACKED_ICE, PACKED_ICE_BRICKS);
			content.insertAfter(PACKED_ICE_BRICKS, PACKED_ICE_BRICK_STAIRS);
			content.insertAfter(PACKED_ICE_BRICK_STAIRS, PACKED_ICE_BRICK_SLAB);
			content.insertAfter(PACKED_ICE_BRICK_SLAB, PACKED_ICE_BRICK_WALL);
		});
		
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.NATURAL_BLOCKS).register(content -> {
			
			content.insertAfter(MYCELIUM, PERMAFROST);
			
			content.insertAfter(RED_SANDSTONE, WHITE_SAND);
			content.insertAfter(WHITE_SAND, WHITE_SANDSTONE);
			
			content.insertAfter(SNOW, PEAT_BLOCK);
			content.insertAfter(PEAT_BLOCK, PEAT);
			
			content.insertAfter(POPLAR_LOG, ASPEN_LOG);
			content.insertAfter(ASPEN_LOG, CEDAR_LOG);
			content.insertAfter(CEDAR_LOG, FIR_LOG);
			content.insertAfter(FIR_LOG, HEMLOCK_LOG);
			content.insertAfter(HEMLOCK_LOG, LARCH_LOG);
			content.insertAfter(LARCH_LOG, PINE_LOG);
			content.insertAfter(PINE_LOG, REDWOOD_LOG);
			content.insertAfter(REDWOOD_LOG, SEQUOIA_LOG);
			
			content.insertAfter(YELLOW_POPLAR_LEAVES, ASPEN_LEAVES);
			content.insertAfter(ASPEN_LEAVES, CEDAR_LEAVES);
			content.insertAfter(CEDAR_LEAVES, FIR_LEAVES);
			content.insertAfter(FIR_LEAVES, HEMLOCK_LEAVES);
			content.insertAfter(HEMLOCK_LEAVES, LARCH_LEAVES);
			content.insertAfter(LARCH_LEAVES, PINE_LEAVES);
			content.insertAfter(PINE_LEAVES, REDWOOD_LEAVES);
			content.insertAfter(REDWOOD_LEAVES, SEQUOIA_LEAVES);
			
			content.insertAfter(POPLAR_SAPLING, ASPEN_SAPLING);
			content.insertAfter(ASPEN_SAPLING, CEDAR_SAPLING);
			content.insertAfter(CEDAR_SAPLING, FIR_SAPLING);
			content.insertAfter(FIR_SAPLING, HEMLOCK_SAPLING);
			content.insertAfter(HEMLOCK_SAPLING, LARCH_SAPLING);
			content.insertAfter(LARCH_SAPLING, PINE_SAPLING);
			content.insertAfter(PINE_SAPLING, REDWOOD_SAPLING);
			content.insertAfter(REDWOOD_SAPLING, SEQUOIA_SAPLING);
			
			content.insertAfter(SHORT_GRASS, SHORT_FROSTED_GRASS);
			content.insertAfter(DRY_SHORT_GRASS, SHORT_TUNDRA_GRASS);
			content.insertAfter(TALL_GRASS, TALL_FROSTED_GRASS);
			content.insertAfter(DRY_TALL_GRASS, TALL_TUNDRA_GRASS);
			
			content.insertAfter(LEAF_LITTER, PINECONES);
			
			content.insertAfter(SEAGRASS, CATTAIL);
		});
		
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> {
			
			content.insertAfter(BAMBOO_SHELF, ASPEN_SHELF);
			content.insertAfter(ASPEN_SHELF, CEDAR_SHELF);
			content.insertAfter(CEDAR_SHELF, FIR_SHELF);
			content.insertAfter(FIR_SHELF, HEMLOCK_SHELF);
			content.insertAfter(HEMLOCK_SHELF, LARCH_SHELF);
			content.insertAfter(LARCH_SHELF, PINE_SHELF);
			content.insertAfter(PINE_SHELF, REDWOOD_SHELF);
			content.insertAfter(REDWOOD_SHELF, SEQUOIA_SHELF);
			
			content.insertAfter(BAMBOO_HANGING_SIGN, ASPEN_SIGN);
			content.insertAfter(ASPEN_SIGN, ASPEN_HANGING_SIGN);
			content.insertAfter(ASPEN_HANGING_SIGN, CEDAR_SIGN);
			content.insertAfter(CEDAR_SIGN, CEDAR_HANGING_SIGN);
			content.insertAfter(CEDAR_HANGING_SIGN, FIR_SIGN);
			content.insertAfter(FIR_SIGN, FIR_HANGING_SIGN);
			content.insertAfter(FIR_HANGING_SIGN, HEMLOCK_SIGN);
			content.insertAfter(HEMLOCK_SIGN, HEMLOCK_HANGING_SIGN);
			content.insertAfter(HEMLOCK_HANGING_SIGN, LARCH_SIGN);
			content.insertAfter(LARCH_SIGN, LARCH_HANGING_SIGN);
			content.insertAfter(LARCH_HANGING_SIGN, PINE_SIGN);
			content.insertAfter(PINE_SIGN, PINE_HANGING_SIGN);
			content.insertAfter(PINE_HANGING_SIGN, REDWOOD_SIGN);
			content.insertAfter(REDWOOD_SIGN, REDWOOD_HANGING_SIGN);
			content.insertAfter(REDWOOD_HANGING_SIGN, SEQUOIA_SIGN);
			content.insertAfter(SEQUOIA_SIGN, SEQUOIA_HANGING_SIGN);
		});
		
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(content -> {
			content.insertAfter(POWDER_SNOW_BUCKET, QUICKSAND_BUCKET);
			
			content.insertAfter(POPLAR_CHEST_BOAT, ASPEN_BOAT);
			content.insertAfter(ASPEN_BOAT, ASPEN_CHEST_BOAT);
			content.insertAfter(ASPEN_CHEST_BOAT, CEDAR_BOAT);
			content.insertAfter(CEDAR_BOAT, CEDAR_CHEST_BOAT);
			content.insertAfter(CEDAR_CHEST_BOAT, FIR_BOAT);
			content.insertAfter(FIR_BOAT, FIR_CHEST_BOAT);
			content.insertAfter(FIR_CHEST_BOAT, HEMLOCK_BOAT);
			content.insertAfter(HEMLOCK_BOAT, HEMLOCK_CHEST_BOAT);
			content.insertAfter(HEMLOCK_CHEST_BOAT, LARCH_BOAT);
			content.insertAfter(LARCH_BOAT, LARCH_CHEST_BOAT);
			content.insertAfter(LARCH_CHEST_BOAT, PINE_BOAT);
			content.insertAfter(PINE_BOAT, PINE_CHEST_BOAT);
			content.insertAfter(PINE_CHEST_BOAT, REDWOOD_BOAT);
			content.insertAfter(REDWOOD_BOAT, REDWOOD_CHEST_BOAT);
			content.insertAfter(REDWOOD_CHEST_BOAT, SEQUOIA_BOAT);
			content.insertAfter(SEQUOIA_BOAT, SEQUOIA_CHEST_BOAT);
		});
	}
}
