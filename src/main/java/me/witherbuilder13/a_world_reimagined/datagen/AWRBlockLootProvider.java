package me.witherbuilder13.a_world_reimagined.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.advancements.predicates.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.SnowLayerBlock;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.AlternativesEntry;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchBlock;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static me.witherbuilder13.a_world_reimagined.block.AWRBlocks.*;

public class AWRBlockLootProvider extends FabricBlockLootSubProvider {
	
	protected AWRBlockLootProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
		super(packOutput, registriesFuture);
	}
	
	@Override
	public void generate() {
		
		List<Block> dropSelfBlocks = List.of(
				ASPEN_LOG, ASPEN_WOOD, STRIPPED_ASPEN_LOG, STRIPPED_ASPEN_WOOD, ASPEN_PLANKS, ASPEN_STAIRS, ASPEN_FENCE,
				ASPEN_FENCE_GATE, ASPEN_TRAPDOOR, ASPEN_PRESSURE_PLATE, ASPEN_BUTTON, ASPEN_SIGN, ASPEN_HANGING_SIGN, ASPEN_SHELF,
				ASPEN_SAPLING,
				
				CEDAR_LOG, CEDAR_WOOD, STRIPPED_CEDAR_LOG, STRIPPED_CEDAR_WOOD, CEDAR_PLANKS, CEDAR_STAIRS,
				CEDAR_FENCE, CEDAR_FENCE_GATE, CEDAR_TRAPDOOR, CEDAR_PRESSURE_PLATE, CEDAR_BUTTON, CEDAR_SIGN, CEDAR_HANGING_SIGN, CEDAR_SHELF,
				CEDAR_SAPLING,
				
				FIR_LOG, FIR_WOOD, STRIPPED_FIR_LOG, STRIPPED_FIR_WOOD, FIR_PLANKS, FIR_STAIRS,
				FIR_FENCE, FIR_FENCE_GATE, FIR_TRAPDOOR, FIR_PRESSURE_PLATE, FIR_BUTTON, FIR_SIGN, FIR_HANGING_SIGN, FIR_SHELF,
				FIR_SAPLING,
				
				HEMLOCK_LOG, HEMLOCK_WOOD, STRIPPED_HEMLOCK_LOG, STRIPPED_HEMLOCK_WOOD, HEMLOCK_PLANKS, HEMLOCK_STAIRS,
				HEMLOCK_FENCE, HEMLOCK_FENCE_GATE, HEMLOCK_TRAPDOOR, HEMLOCK_PRESSURE_PLATE, HEMLOCK_SIGN, HEMLOCK_HANGING_SIGN, HEMLOCK_BUTTON, HEMLOCK_SHELF,
				HEMLOCK_SAPLING,
				
				LARCH_LOG, LARCH_WOOD, STRIPPED_LARCH_LOG, STRIPPED_LARCH_WOOD, LARCH_PLANKS, LARCH_STAIRS,
				LARCH_FENCE, LARCH_FENCE_GATE, LARCH_TRAPDOOR, LARCH_PRESSURE_PLATE, LARCH_BUTTON, LARCH_SIGN, LARCH_HANGING_SIGN, LARCH_SHELF,
				LARCH_SAPLING,
				
				PINE_LOG, PINE_WOOD, STRIPPED_PINE_LOG, STRIPPED_PINE_WOOD, PINE_PLANKS, PINE_STAIRS,
				PINE_FENCE, PINE_FENCE_GATE, PINE_TRAPDOOR, PINE_PRESSURE_PLATE, PINE_BUTTON, PINE_SIGN, PINE_HANGING_SIGN, PINE_SHELF,
				PINE_SAPLING,
				
				REDWOOD_LOG, REDWOOD_WOOD, STRIPPED_REDWOOD_LOG, STRIPPED_REDWOOD_WOOD, REDWOOD_PLANKS, REDWOOD_STAIRS,
				REDWOOD_FENCE, REDWOOD_FENCE_GATE, REDWOOD_TRAPDOOR, REDWOOD_PRESSURE_PLATE, REDWOOD_BUTTON, REDWOOD_SIGN, REDWOOD_HANGING_SIGN, REDWOOD_SHELF,
				REDWOOD_SAPLING,
				
				SEQUOIA_LOG, SEQUOIA_WOOD, STRIPPED_SEQUOIA_LOG, STRIPPED_SEQUOIA_WOOD, SEQUOIA_PLANKS, SEQUOIA_STAIRS,
				SEQUOIA_FENCE, SEQUOIA_FENCE_GATE, SEQUOIA_TRAPDOOR, SEQUOIA_PRESSURE_PLATE, SEQUOIA_BUTTON, SEQUOIA_SIGN, SEQUOIA_HANGING_SIGN, SEQUOIA_SHELF,
				SEQUOIA_SAPLING,
				
				WHITE_SAND, WHITE_SANDSTONE, WHITE_SANDSTONE_STAIRS, WHITE_SANDSTONE_WALL,
				SMOOTH_WHITE_SANDSTONE, SMOOTH_WHITE_SANDSTONE_STAIRS,
				CUT_WHITE_SANDSTONE,
				
				PEAT_BLOCK
		);
		
		dropSelfBlocks.forEach(this::dropSelf);
		
		List<Block> slabs = List.of(
				ASPEN_SLAB, CEDAR_SLAB, FIR_SLAB, HEMLOCK_SLAB, LARCH_SLAB, PINE_SLAB, REDWOOD_SLAB, SEQUOIA_SLAB,
				WHITE_SANDSTONE_SLAB, SMOOTH_WHITE_SANDSTONE_SLAB, CUT_WHITE_SANDSTONE_SLAB,
				SNOW_BRICK_SLAB, PACKED_ICE_BRICK_SLAB
		);
		
		slabs.forEach(this::createSlabItemTable);
		
		List<Block> doors = List.of(
				ASPEN_DOOR, CEDAR_DOOR, FIR_DOOR, HEMLOCK_DOOR, LARCH_DOOR, PINE_DOOR, REDWOOD_DOOR, SEQUOIA_DOOR
		);
		
		doors.forEach(this::createDoorTable);
		
		Map<Block, Block> leavesWithSaplings = new HashMap<>();
		leavesWithSaplings.put(ASPEN_LEAVES, ASPEN_SAPLING);
		leavesWithSaplings.put(CEDAR_LEAVES, CEDAR_SAPLING);
		leavesWithSaplings.put(FIR_LEAVES, FIR_SAPLING);
		leavesWithSaplings.put(HEMLOCK_LEAVES, HEMLOCK_SAPLING);
		leavesWithSaplings.put(LARCH_LEAVES, LARCH_SAPLING);
		leavesWithSaplings.put(PINE_LEAVES, PINE_SAPLING);
		leavesWithSaplings.put(REDWOOD_LEAVES, REDWOOD_SAPLING);
		leavesWithSaplings.put(SEQUOIA_LEAVES, SEQUOIA_SAPLING);
		
		//! FABRIC BUG - https://github.com/FabricMC/fabric-api/issues/5534
		/*//
		leavesWithSaplings.forEach((l, s) -> createLeavesDrops(l, s, NORMAL_LEAVES_SAPLING_CHANCES));
		
		createSingleItemTableWithSilkTouch(PERMAFROST, DIRT);
		createShearsOrSilkTouchOnlyDrop(SHORT_FROSTED_GRASS);
		createShearsOrSilkTouchOnlyDrop(SHORT_TUNDRA_GRASS);
		createShearsOrSilkTouchOnlyDrop(TALL_FROSTED_GRASS);
		createShearsOrSilkTouchOnlyDrop(TALL_TUNDRA_GRASS);
		
		createSingleItemTableWithSilkTouch(SNOW_BRICKS, Items.SNOWBALL);
		createSingleItemTableWithSilkTouch(SNOW_BRICK_STAIRS, Items.SNOWBALL);
		createSingleItemTableWithSilkTouch(SNOW_BRICK_SLAB, Items.SNOWBALL);
		createSingleItemTableWithSilkTouch(SNOW_BRICK_WALL, Items.SNOWBALL);
		
		dropWhenSilkTouch(PACKED_ICE_BRICKS);
		dropWhenSilkTouch(PACKED_ICE_BRICK_STAIRS);
		dropWhenSilkTouch(PACKED_ICE_BRICK_SLAB);
		dropWhenSilkTouch(PACKED_ICE_BRICK_WALL);
		 */
		
		createSinglePropConditionTable(CATTAIL, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER);
		
		add(PEAT,
				block -> LootTable.lootTable()
						.withPool(
								LootPool.lootPool()
										.when(LootItemEntityPropertyCondition.entityPresent(LootContext.EntityTarget.THIS))
										.add(
												AlternativesEntry.alternatives(
														SnowLayerBlock.LAYERS.getPossibleValues(),
														layers -> layers == 8
																? LootItem.lootTableItem(PEAT_BLOCK)
																: LootItem.lootTableItem(PEAT)
																.apply(SetItemCountFunction.setCount(ConstantValue.exactly(layers)))
																.when(
																		MatchBlock.blockMatches(
																				this.blocks, block, StatePropertiesPredicate.Builder.properties().hasProperty(SnowLayerBlock.LAYERS, layers)
																		)
																)
														)
										)
						)
		);
	}
}
