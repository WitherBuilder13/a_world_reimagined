package me.witherbuilder13.a_world_reimagined.datagen.tag;

import me.witherbuilder13.a_world_reimagined.tag.AWRBlockItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockItemTags;
import net.minecraft.tags.ItemTags;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

import static me.witherbuilder13.a_world_reimagined.references.AWRBlockItemIds.*;
import static me.witherbuilder13.a_world_reimagined.references.AWRItemIds.*;

public class AWRItemTagProvider extends FabricTagsProvider.ItemTagsProvider {
	
	public AWRItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
		super(output, registryLookupFuture);
	}
	
	@Override
	protected void addTags(HolderLookup.@NonNull Provider registries) {
		
		builder(BlockItemTags.STAIRS.item())
				.add(WHITE_SANDSTONE_STAIRS, SMOOTH_WHITE_SANDSTONE_STAIRS, SNOW_BRICK_STAIRS, PACKED_ICE_BRICK_STAIRS);
		
		builder(BlockItemTags.SLABS.item())
				.add(WHITE_SANDSTONE_SLAB, SMOOTH_WHITE_SANDSTONE_SLAB, CUT_WHITE_SANDSTONE_SLAB, SNOW_BRICK_SLAB, PACKED_ICE_BRICK_SLAB);
		
		builder(BlockItemTags.WALLS.item())
				.add(WHITE_SANDSTONE_WALL, SNOW_BRICK_WALL, PACKED_ICE_BRICK_WALL);
		
		builder(BlockItemTags.WOODEN_STAIRS.item())
				.add(ASPEN_STAIRS, CEDAR_STAIRS, FIR_STAIRS, HEMLOCK_STAIRS, LARCH_STAIRS, PINE_STAIRS, REDWOOD_STAIRS, SEQUOIA_STAIRS);
		
		builder(BlockItemTags.WOODEN_SLABS.item())
				.add(ASPEN_SLAB, CEDAR_SLAB, FIR_SLAB, HEMLOCK_SLAB, LARCH_SLAB, PINE_SLAB, REDWOOD_SLAB, SEQUOIA_SLAB);
		
		builder(BlockItemTags.WOODEN_FENCES.item())
				.add(ASPEN_FENCE, CEDAR_FENCE, FIR_FENCE, HEMLOCK_FENCE, LARCH_FENCE, PINE_FENCE, REDWOOD_FENCE, SEQUOIA_FENCE);
		
		builder(BlockItemTags.FENCE_GATES.item())
				.add(ASPEN_FENCE_GATE, CEDAR_FENCE_GATE, FIR_FENCE_GATE, HEMLOCK_FENCE_GATE, LARCH_FENCE_GATE, PINE_FENCE_GATE, REDWOOD_FENCE_GATE, SEQUOIA_FENCE_GATE);
		
		builder(BlockItemTags.WOODEN_DOORS.item())
				.add(ASPEN_DOOR, CEDAR_DOOR, FIR_DOOR, HEMLOCK_DOOR, LARCH_DOOR, PINE_DOOR, REDWOOD_DOOR, SEQUOIA_DOOR);
		
		builder(BlockItemTags.WOODEN_TRAPDOORS.item())
				.add(ASPEN_TRAPDOOR, CEDAR_TRAPDOOR, FIR_TRAPDOOR, HEMLOCK_TRAPDOOR, LARCH_TRAPDOOR, PINE_TRAPDOOR, REDWOOD_TRAPDOOR, SEQUOIA_TRAPDOOR);
		
		builder(BlockItemTags.WOODEN_PRESSURE_PLATES.item())
				.add(ASPEN_PRESSURE_PLATE, CEDAR_PRESSURE_PLATE, FIR_PRESSURE_PLATE, HEMLOCK_PRESSURE_PLATE, LARCH_PRESSURE_PLATE, PINE_PRESSURE_PLATE, REDWOOD_PRESSURE_PLATE, SEQUOIA_PRESSURE_PLATE);
		
		builder(BlockItemTags.WOODEN_BUTTONS.item())
				.add(ASPEN_BUTTON, CEDAR_BUTTON, FIR_BUTTON, HEMLOCK_BUTTON, LARCH_BUTTON, PINE_BUTTON, REDWOOD_BUTTON, SEQUOIA_BUTTON);
		
		builder(BlockItemTags.SIGNS.item())
				.add(ASPEN_SIGN, CEDAR_SIGN, FIR_SIGN, HEMLOCK_SIGN, LARCH_SIGN, PINE_SIGN, REDWOOD_SIGN, SEQUOIA_SIGN);
		
		builder(BlockItemTags.HANGING_SIGNS.item())
				.add(ASPEN_HANGING_SIGN, CEDAR_HANGING_SIGN, FIR_HANGING_SIGN, HEMLOCK_HANGING_SIGN, LARCH_HANGING_SIGN, PINE_HANGING_SIGN, REDWOOD_HANGING_SIGN, SEQUOIA_HANGING_SIGN);
		
		builder(BlockItemTags.WOODEN_SHELVES.item())
				.add(ASPEN_SHELF, CEDAR_SHELF, FIR_SHELF, HEMLOCK_SHELF, LARCH_SHELF, PINE_SHELF, REDWOOD_SHELF, SEQUOIA_SHELF);
		
		//* ---------------------------------------------------------------------------------------------------------------------------------
		
		builder(BlockItemTags.LOGS_THAT_BURN.item())
				.addOptionalTag(AWRBlockItemTags.ASPEN_LOGS.item())
				.addOptionalTag(AWRBlockItemTags.CEDAR_LOGS.item())
				.addOptionalTag(AWRBlockItemTags.FIR_LOGS.item())
				.addOptionalTag(AWRBlockItemTags.HEMLOCK_LOGS.item())
				.addOptionalTag(AWRBlockItemTags.LARCH_LOGS.item())
				.addOptionalTag(AWRBlockItemTags.PINE_LOGS.item())
				.addOptionalTag(AWRBlockItemTags.REDWOOD_LOGS.item())
				.addOptionalTag(AWRBlockItemTags.SEQUOIA_LOGS.item());
		
		builder(BlockItemTags.LEAVES.item())
				.add(ASPEN_LEAVES, CEDAR_LEAVES, FIR_LEAVES, HEMLOCK_LEAVES, LARCH_LEAVES, PINE_LEAVES, REDWOOD_LEAVES, SEQUOIA_LEAVES);
		
		builder(BlockItemTags.GRASS_BLOCKS.item())
				.add(PERMAFROST);
		
		builder(BlockItemTags.SAND.item())
				.add(WHITE_SAND);
		
		builder(BlockItemTags.SMELTS_TO_GLASS.item())
				.add(WHITE_SAND);
		
		builder(ItemTags.BOATS)
				.add(ASPEN_BOAT, CEDAR_BOAT, FIR_BOAT, HEMLOCK_BOAT, LARCH_BOAT, PINE_BOAT, REDWOOD_BOAT, SEQUOIA_BOAT);
		
		builder(ItemTags.CHEST_BOATS)
				.add(ASPEN_CHEST_BOAT, CEDAR_CHEST_BOAT, FIR_CHEST_BOAT, HEMLOCK_CHEST_BOAT, LARCH_CHEST_BOAT, PINE_CHEST_BOAT, REDWOOD_CHEST_BOAT, SEQUOIA_CHEST_BOAT);
		
		//* ---------------------------------------------------------------------------------------------------------------------------------
		
		builder(AWRBlockItemTags.ASPEN_LOGS.item())
				.add(ASPEN_LOG, ASPEN_WOOD, STRIPPED_ASPEN_LOG, STRIPPED_ASPEN_WOOD);
		
		builder(AWRBlockItemTags.CEDAR_LOGS.item())
				.add(CEDAR_LOG, CEDAR_WOOD, STRIPPED_CEDAR_LOG, STRIPPED_CEDAR_WOOD);
		
		builder(AWRBlockItemTags.FIR_LOGS.item())
				.add(FIR_LOG, FIR_WOOD, STRIPPED_FIR_LOG, STRIPPED_FIR_WOOD);
		
		builder(AWRBlockItemTags.HEMLOCK_LOGS.item())
				.add(HEMLOCK_LOG, HEMLOCK_WOOD, STRIPPED_HEMLOCK_LOG, STRIPPED_HEMLOCK_WOOD);
		
		builder(AWRBlockItemTags.LARCH_LOGS.item())
				.add(LARCH_LOG, LARCH_WOOD, STRIPPED_LARCH_LOG, STRIPPED_LARCH_WOOD);
		
		builder(AWRBlockItemTags.PINE_LOGS.item())
				.add(PINE_LOG, PINE_WOOD, STRIPPED_PINE_LOG, STRIPPED_PINE_WOOD);
		
		builder(AWRBlockItemTags.REDWOOD_LOGS.item())
				.add(REDWOOD_LOG, REDWOOD_WOOD, STRIPPED_REDWOOD_LOG, STRIPPED_REDWOOD_WOOD);
		
		builder(AWRBlockItemTags.SEQUOIA_LOGS.item())
				.add(SEQUOIA_LOG, SEQUOIA_WOOD, STRIPPED_SEQUOIA_LOG, STRIPPED_SEQUOIA_WOOD);
	}
}
