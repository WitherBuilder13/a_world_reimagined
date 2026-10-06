package me.witherbuilder13.a_world_reimagined.datagen;

import me.witherbuilder13.a_world_reimagined.item.AWRItems;
import me.witherbuilder13.a_world_reimagined.loot.AWRLootTables;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class AWRBlockInteractLootProvider extends SimpleFabricLootTableSubProvider {
	
	public AWRBlockInteractLootProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
		super(output, registryLookupFuture, LootContextParamSets.BLOCK_INTERACT);
	}
	
	@Override
	public void generate(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> biConsumer) {
		biConsumer.accept(
				AWRLootTables.HARVEST_APPLE_LEAVES,
				LootTable.lootTable().withPool(
						LootPool.lootPool()
								.setRolls(ContextIntProviders.exactly(1))
								.add(LootItem.lootTableItem(Items.APPLE).apply(SetItemCountFunction.setCount(ContextIntProviders.exactly(1))))
				)
		);
		biConsumer.accept(
				AWRLootTables.HARVEST_CHERRY_LEAVES,
				LootTable.lootTable().withPool(
						LootPool.lootPool()
								.setRolls(ContextIntProviders.exactly(1))
								.add(LootItem.lootTableItem(AWRItems.CHERRY).apply(SetItemCountFunction.setCount(ContextIntProviders.between(2, 3))))
				)
		);
		biConsumer.accept(
				AWRLootTables.HARVEST_EBONY_LEAVES,
				LootTable.lootTable().withPool(
						LootPool.lootPool()
								.setRolls(ContextIntProviders.exactly(1))
								.add(LootItem.lootTableItem(AWRItems.PERSIMMON).apply(SetItemCountFunction.setCount(ContextIntProviders.exactly(1))))
				)
		);
		biConsumer.accept(
				AWRLootTables.HARVEST_FIG_LEAVES,
				LootTable.lootTable().withPool(
						LootPool.lootPool()
								.setRolls(ContextIntProviders.exactly(1))
								.add(LootItem.lootTableItem(AWRItems.FIG).apply(SetItemCountFunction.setCount(ContextIntProviders.exactly(1))))
				)
		);
		biConsumer.accept(
				AWRLootTables.HARVEST_HICKORY_LEAVES,
				LootTable.lootTable().withPool(
						LootPool.lootPool()
								.setRolls(ContextIntProviders.exactly(1))
								.add(LootItem.lootTableItem(AWRItems.PECAN).apply(SetItemCountFunction.setCount(ContextIntProviders.between(2, 4))))
				)
		);
		biConsumer.accept(
				AWRLootTables.HARVEST_OLIVE_LEAVES,
				LootTable.lootTable().withPool(
						LootPool.lootPool()
								.setRolls(ContextIntProviders.exactly(1))
								.add(LootItem.lootTableItem(AWRItems.OLIVE).apply(SetItemCountFunction.setCount(ContextIntProviders.between(2, 3))))
				)
		);
	}
	
	@Override
	public void run() {
	
	}
}
