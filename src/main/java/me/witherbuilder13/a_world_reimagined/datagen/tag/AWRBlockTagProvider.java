package me.witherbuilder13.a_world_reimagined.datagen.tag;

import me.witherbuilder13.a_world_reimagined.tag.AWRBlockItemTags;
import me.witherbuilder13.a_world_reimagined.tag.AWRBlockTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockItemTags;
import net.minecraft.tags.BlockTags;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

import static me.witherbuilder13.a_world_reimagined.references.AWRBlockItemIds.*;
import static net.minecraft.references.BlockItemIds.*;

public class AWRBlockTagProvider extends FabricTagsProvider.BlockTagsProvider {
	
	public AWRBlockTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
		super(output, registryLookupFuture);
	}
	
	@Override
	protected void addTags(HolderLookup.@NonNull Provider registries) {
		
		builder(BlockTags.MINEABLE_WITH_PICKAXE)
				.add(WHITE_SANDSTONE, WHITE_SANDSTONE_STAIRS, WHITE_SANDSTONE_SLAB)
				.add(SMOOTH_WHITE_SANDSTONE, SMOOTH_WHITE_SANDSTONE_STAIRS, SMOOTH_WHITE_SANDSTONE_SLAB)
				.add(CUT_WHITE_SANDSTONE, CUT_WHITE_SANDSTONE_SLAB)
				.add(PACKED_ICE_BRICKS, PACKED_ICE_BRICK_STAIRS, PACKED_ICE_BRICK_SLAB);
		
		builder(BlockTags.MINEABLE_WITH_SHOVEL)
				.add(WHITE_SAND)
				.add(SNOW_BRICKS, SNOW_BRICK_STAIRS, SNOW_BRICK_SLAB, SNOW_BRICK_WALL)
				.add(PERMAFROST, PEAT, PEAT_BLOCK);
		
		//* ---------------------------------------------------------------------------------------------------------------------------------
		
		builder(BlockItemTags.STAIRS.block())
				.add(WHITE_SANDSTONE_STAIRS, SMOOTH_WHITE_SANDSTONE_STAIRS, SNOW_BRICK_STAIRS, PACKED_ICE_BRICK_STAIRS);
		
		builder(BlockItemTags.SLABS.block())
				.add(WHITE_SANDSTONE_SLAB, SMOOTH_WHITE_SANDSTONE_SLAB, CUT_WHITE_SANDSTONE_SLAB, SNOW_BRICK_SLAB, PACKED_ICE_BRICK_SLAB);
		
		builder(BlockItemTags.WALLS.block())
				.add(WHITE_SANDSTONE_WALL, SNOW_BRICK_WALL, PACKED_ICE_BRICK_WALL);
		
		builder(BlockItemTags.PLANKS.block())
				.add(ASPEN_PLANKS, CEDAR_PLANKS, FIR_PLANKS, HEMLOCK_PLANKS, LARCH_PLANKS, PINE_PLANKS, REDWOOD_PLANKS, SEQUOIA_PLANKS);
		
		builder(BlockItemTags.WOODEN_STAIRS.block())
				.add(ASPEN_STAIRS, CEDAR_STAIRS, FIR_STAIRS, HEMLOCK_STAIRS, LARCH_STAIRS, PINE_STAIRS, REDWOOD_STAIRS, SEQUOIA_STAIRS);
		
		builder(BlockItemTags.WOODEN_SLABS.block())
				.add(ASPEN_SLAB, CEDAR_SLAB, FIR_SLAB, HEMLOCK_SLAB, LARCH_SLAB, PINE_SLAB, REDWOOD_SLAB, SEQUOIA_SLAB);
		
		builder(BlockItemTags.WOODEN_FENCES.block())
				.add(ASPEN_FENCE, CEDAR_FENCE, FIR_FENCE, HEMLOCK_FENCE, LARCH_FENCE, PINE_FENCE, REDWOOD_FENCE, SEQUOIA_FENCE);
		
		builder(BlockItemTags.FENCE_GATES.block())
				.add(ASPEN_FENCE_GATE, CEDAR_FENCE_GATE, FIR_FENCE_GATE, HEMLOCK_FENCE_GATE, LARCH_FENCE_GATE, PINE_FENCE_GATE, REDWOOD_FENCE_GATE, SEQUOIA_FENCE_GATE);
		
		builder(BlockItemTags.WOODEN_DOORS.block())
				.add(ASPEN_DOOR, CEDAR_DOOR, FIR_DOOR, HEMLOCK_DOOR, LARCH_DOOR, PINE_DOOR, REDWOOD_DOOR, SEQUOIA_DOOR);
		
		builder(BlockItemTags.WOODEN_TRAPDOORS.block())
				.add(ASPEN_TRAPDOOR, CEDAR_TRAPDOOR, FIR_TRAPDOOR, HEMLOCK_TRAPDOOR, LARCH_TRAPDOOR, PINE_TRAPDOOR, REDWOOD_TRAPDOOR, SEQUOIA_TRAPDOOR);
		
		builder(BlockItemTags.WOODEN_PRESSURE_PLATES.block())
				.add(ASPEN_PRESSURE_PLATE, CEDAR_PRESSURE_PLATE, FIR_PRESSURE_PLATE, HEMLOCK_PRESSURE_PLATE, LARCH_PRESSURE_PLATE, PINE_PRESSURE_PLATE, REDWOOD_PRESSURE_PLATE, SEQUOIA_PRESSURE_PLATE);
		
		builder(BlockItemTags.WOODEN_BUTTONS.block())
				.add(ASPEN_BUTTON, CEDAR_BUTTON, FIR_BUTTON, HEMLOCK_BUTTON, LARCH_BUTTON, PINE_BUTTON, REDWOOD_BUTTON, SEQUOIA_BUTTON);
		
		builder(BlockItemTags.SIGNS.block())
				.add(ASPEN_SIGN, CEDAR_SIGN, FIR_SIGN, HEMLOCK_SIGN, LARCH_SIGN, PINE_SIGN, REDWOOD_SIGN, SEQUOIA_SIGN);
		
		builder(BlockItemTags.HANGING_SIGNS.block())
				.add(ASPEN_HANGING_SIGN, CEDAR_HANGING_SIGN, FIR_HANGING_SIGN, HEMLOCK_HANGING_SIGN, LARCH_HANGING_SIGN, PINE_HANGING_SIGN, REDWOOD_HANGING_SIGN, SEQUOIA_HANGING_SIGN);
		
		builder(BlockItemTags.WOODEN_SHELVES.block())
				.add(ASPEN_SHELF, CEDAR_SHELF, FIR_SHELF, HEMLOCK_SHELF, LARCH_SHELF, PINE_SHELF, REDWOOD_SHELF, SEQUOIA_SHELF);
		
		//* ---------------------------------------------------------------------------------------------------------------------------------
		
		builder(BlockItemTags.LOGS_THAT_BURN.block())
				.addTag(AWRBlockItemTags.ASPEN_LOGS.block())
				.addTag(AWRBlockItemTags.CEDAR_LOGS.block())
				.addTag(AWRBlockItemTags.FIR_LOGS.block())
				.addTag(AWRBlockItemTags.HEMLOCK_LOGS.block())
				.addTag(AWRBlockItemTags.LARCH_LOGS.block())
				.addTag(AWRBlockItemTags.PINE_LOGS.block())
				.addTag(AWRBlockItemTags.REDWOOD_LOGS.block())
				.addTag(AWRBlockItemTags.SEQUOIA_LOGS.block());
		
		builder(BlockItemTags.LEAVES.block())
				.add(ASPEN_LEAVES, CEDAR_LEAVES, FIR_LEAVES, HEMLOCK_LEAVES, LARCH_LEAVES, PINE_LEAVES, REDWOOD_LEAVES, SEQUOIA_LEAVES);
		
		builder(BlockItemTags.GRASS_BLOCKS.block())
				.add(PERMAFROST);
		
		builder(BlockItemTags.SAND.block())
				.add(WHITE_SAND);
		
		builder(BlockItemTags.SMELTS_TO_GLASS.block())
				.add(WHITE_SAND);
		
		builder(BlockTags.REPLACEABLE)
				.add(SHORT_FROSTED_GRASS, TALL_FROSTED_GRASS, SHORT_TUNDRA_GRASS, TALL_TUNDRA_GRASS, PINECONES);
		
		builder(BlockTags.REPLACEABLE_BY_MUSHROOMS)
				.add(SHORT_FROSTED_GRASS, TALL_FROSTED_GRASS, SHORT_TUNDRA_GRASS, TALL_TUNDRA_GRASS, PINECONES);
		
		builder(BlockTags.REPLACEABLE_BY_TREES)
				.add(SHORT_FROSTED_GRASS, TALL_FROSTED_GRASS, SHORT_TUNDRA_GRASS, TALL_TUNDRA_GRASS, PINECONES);
		
		builder(BlockTags.WASHED_AWAY_BY_FLUIDS)
				.add(SHORT_FROSTED_GRASS, TALL_FROSTED_GRASS, SHORT_TUNDRA_GRASS, TALL_TUNDRA_GRASS, PINECONES);
		
		builder(BlockTags.SCULK_REPLACEABLE)
				.add(WHITE_SANDSTONE);
		
		builder(BlockTags.BLOCKS_MOTION_NO_LEAVES)
				.add(WHITE_SANDSTONE, SMOOTH_WHITE_SANDSTONE, CUT_WHITE_SANDSTONE, CHISELED_WHITE_SANDSTONE, SNOW_BRICKS, PACKED_ICE_BRICKS);
		
		builder(BlockTags.CANNOT_REPLACE_BELOW_TREE_TRUNK)
				.add(PERMAFROST);
		
		builder(BlockTags.OVERWORLD_NATURAL_LOGS)
				.add(ASPEN_LOG, CEDAR_LOG, FIR_LOG, HEMLOCK_LOG, LARCH_LOG, PINE_LOG, REDWOOD_LOG, SEQUOIA_LOG);
		
		builder(BlockTags.INSIDE_STEP_SOUND_BLOCKS)
				.add(PINECONES);
		
		builder(BlockTags.CANNOT_SUPPORT_SNOW_LAYER)
				.add(BLUE_ICE);
		
		//` ---------------------------------------------------------------------------------------------------------------------------------
		
		builder(ConventionalBlockTags.SANDS)
				.add(WHITE_SAND);
		
		builder(ConventionalBlockTags.SANDSTONE_BLOCKS)
				.add(WHITE_SANDSTONE, SMOOTH_WHITE_SANDSTONE, CUT_WHITE_SANDSTONE, CHISELED_WHITE_SANDSTONE);
		
		builder(ConventionalBlockTags.SANDSTONE_STAIRS)
				.add(WHITE_SANDSTONE_STAIRS, SMOOTH_WHITE_SANDSTONE_STAIRS);
		
		builder(ConventionalBlockTags.SANDSTONE_SLABS)
				.add(WHITE_SANDSTONE_SLAB, SMOOTH_WHITE_SANDSTONE_SLAB, CUT_WHITE_SANDSTONE_SLAB);
		
		builder(ConventionalBlockTags.OVERWORLD_NATURAL_LOGS)
				.add(ASPEN_LOG, CEDAR_LOG, FIR_LOG, HEMLOCK_LOG, LARCH_LOG, PINE_LOG, REDWOOD_LOG, SEQUOIA_LOG);
		
		builder(ConventionalBlockTags.NATURAL_WOODS)
				.add(ASPEN_WOOD, CEDAR_WOOD, FIR_WOOD, HEMLOCK_WOOD, LARCH_WOOD, PINE_WOOD, REDWOOD_WOOD, SEQUOIA_WOOD);
		
		builder(ConventionalBlockTags.STRIPPED_LOGS)
				.add(STRIPPED_ASPEN_LOG, STRIPPED_CEDAR_LOG, STRIPPED_FIR_LOG, STRIPPED_HEMLOCK_LOG, STRIPPED_LARCH_LOG, STRIPPED_PINE_LOG, STRIPPED_REDWOOD_LOG, STRIPPED_SEQUOIA_LOG);
		
		builder(ConventionalBlockTags.STRIPPED_WOODS)
				.add(STRIPPED_ASPEN_WOOD, STRIPPED_CEDAR_WOOD, STRIPPED_FIR_WOOD, STRIPPED_HEMLOCK_WOOD, STRIPPED_LARCH_WOOD, STRIPPED_PINE_WOOD, STRIPPED_REDWOOD_WOOD, STRIPPED_SEQUOIA_WOOD);
		
		builder(ConventionalBlockTags.WOODEN_FENCES)
				.add(ASPEN_FENCE, CEDAR_FENCE, FIR_FENCE, HEMLOCK_FENCE, LARCH_FENCE, PINE_FENCE, REDWOOD_FENCE, SEQUOIA_FENCE);
		
		builder(ConventionalBlockTags.WOODEN_FENCE_GATES)
				.add(ASPEN_FENCE_GATE, CEDAR_FENCE_GATE, FIR_FENCE_GATE, HEMLOCK_FENCE_GATE, LARCH_FENCE_GATE, PINE_FENCE_GATE, REDWOOD_FENCE_GATE, SEQUOIA_FENCE_GATE);
		
		//` ---------------------------------------------------------------------------------------------------------------------------------
		
		builder(AWRBlockItemTags.ASPEN_LOGS.block())
				.add(ASPEN_LOG, ASPEN_WOOD, STRIPPED_ASPEN_LOG, STRIPPED_ASPEN_WOOD);
		
		builder(AWRBlockItemTags.CEDAR_LOGS.block())
				.add(CEDAR_LOG, CEDAR_WOOD, STRIPPED_CEDAR_LOG, STRIPPED_CEDAR_WOOD);
		
		builder(AWRBlockItemTags.FIR_LOGS.block())
				.add(FIR_LOG, FIR_WOOD, STRIPPED_FIR_LOG, STRIPPED_FIR_WOOD);
		
		builder(AWRBlockItemTags.HEMLOCK_LOGS.block())
				.add(HEMLOCK_LOG, HEMLOCK_WOOD, STRIPPED_HEMLOCK_LOG, STRIPPED_HEMLOCK_WOOD);
		
		builder(AWRBlockItemTags.LARCH_LOGS.block())
				.add(LARCH_LOG, LARCH_WOOD, STRIPPED_LARCH_LOG, STRIPPED_LARCH_WOOD);
		
		builder(AWRBlockItemTags.PINE_LOGS.block())
				.add(PINE_LOG, PINE_WOOD, STRIPPED_PINE_LOG, STRIPPED_PINE_WOOD);
		
		builder(AWRBlockItemTags.REDWOOD_LOGS.block())
				.add(REDWOOD_LOG, REDWOOD_WOOD, STRIPPED_REDWOOD_LOG, STRIPPED_REDWOOD_WOOD);
		
		builder(AWRBlockItemTags.SEQUOIA_LOGS.block())
				.add(SEQUOIA_LOG, SEQUOIA_WOOD, STRIPPED_SEQUOIA_LOG, STRIPPED_SEQUOIA_WOOD);
		
		//* ---------------------------------------------------------------------------------------------------------------------------------
		
		builder(AWRBlockTags.SUPPORTS_SNOWY_VEGETATION)
				.add(GRASS_BLOCK, PERMAFROST, PODZOL, COARSE_DIRT);
		
		builder(AWRBlockTags.SUPPORTS_TUNDRA_VEGETATION)
				.add(PERMAFROST);
		
		builder(AWRBlockTags.FILLS_QUICKSAND_CAULDRON)
				.add(QUICKSAND);
		
		builder(AWRBlockTags.ADDS_LAYER_TO_QUICKSAND_CAULDRON)
				.add(SAND, RED_SAND, WHITE_SAND);
		
		builder(AWRBlockTags.SUPPORTS_CATTAIL)
				.add(GRASS_BLOCK, DIRT, COARSE_DIRT, MUD, PODZOL, MOSS_BLOCK, PEAT_BLOCK);
	}
}
