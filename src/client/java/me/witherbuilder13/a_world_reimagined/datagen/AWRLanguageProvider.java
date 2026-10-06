package me.witherbuilder13.a_world_reimagined.datagen;

import me.witherbuilder13.a_world_reimagined.api.TranslationUtils;
import me.witherbuilder13.a_world_reimagined.entity.AWREntityTypes;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import org.jspecify.annotations.NonNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static me.witherbuilder13.a_world_reimagined.item.AWRItems.*;
import static me.witherbuilder13.a_world_reimagined.tag.AWRBlockTags.SUPPORTS_SNOWY_VEGETATION;
import static me.witherbuilder13.a_world_reimagined.tag.AWRBlockTags.SUPPORTS_TUNDRA_VEGETATION;
import static me.witherbuilder13.a_world_reimagined.world.biome.AWRBiomes.*;

public class AWRLanguageProvider extends FabricLanguageProvider {
	
	protected AWRLanguageProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
		super(packOutput, registryLookup);
	}
	
	@Override
	public void generateTranslations(HolderLookup.@NonNull Provider registryLookup, @NonNull TranslationBuilder translationBuilder) {
		
		List<Item> items = List.of(
				ASPEN_LOG, ASPEN_WOOD, STRIPPED_ASPEN_LOG, STRIPPED_ASPEN_WOOD, ASPEN_PLANKS, ASPEN_STAIRS, ASPEN_SLAB,
				ASPEN_FENCE, ASPEN_FENCE_GATE, ASPEN_DOOR, ASPEN_TRAPDOOR, ASPEN_PRESSURE_PLATE, ASPEN_BUTTON, ASPEN_SIGN, ASPEN_HANGING_SIGN, ASPEN_SHELF,
				ASPEN_LEAVES, ASPEN_SAPLING,
				
				CEDAR_LOG, CEDAR_WOOD, STRIPPED_CEDAR_LOG, STRIPPED_CEDAR_WOOD, CEDAR_PLANKS, CEDAR_STAIRS, CEDAR_SLAB, 
				CEDAR_FENCE, CEDAR_FENCE_GATE, CEDAR_DOOR, CEDAR_TRAPDOOR, CEDAR_PRESSURE_PLATE, CEDAR_BUTTON, CEDAR_SIGN, CEDAR_HANGING_SIGN, CEDAR_SHELF, 
				CEDAR_LEAVES, CEDAR_SAPLING,
				
				FIR_LOG, FIR_WOOD, STRIPPED_FIR_LOG, STRIPPED_FIR_WOOD, FIR_PLANKS, FIR_STAIRS, FIR_SLAB, 
				FIR_FENCE, FIR_FENCE_GATE, FIR_DOOR, FIR_TRAPDOOR, FIR_PRESSURE_PLATE, FIR_BUTTON, FIR_SIGN, FIR_HANGING_SIGN, FIR_SHELF, 
				FIR_LEAVES, FIR_SAPLING,
				
				HEMLOCK_LOG, HEMLOCK_WOOD, STRIPPED_HEMLOCK_LOG, STRIPPED_HEMLOCK_WOOD, HEMLOCK_PLANKS, HEMLOCK_STAIRS, HEMLOCK_SLAB,
				HEMLOCK_FENCE, HEMLOCK_FENCE_GATE, HEMLOCK_DOOR, HEMLOCK_TRAPDOOR, HEMLOCK_PRESSURE_PLATE, HEMLOCK_BUTTON, HEMLOCK_SIGN, HEMLOCK_HANGING_SIGN, HEMLOCK_SHELF,
				HEMLOCK_LEAVES, HEMLOCK_SAPLING,
				
				LARCH_LOG, LARCH_WOOD, STRIPPED_LARCH_LOG, STRIPPED_LARCH_WOOD, LARCH_PLANKS, LARCH_STAIRS, LARCH_SLAB,
				LARCH_FENCE, LARCH_FENCE_GATE, LARCH_DOOR, LARCH_TRAPDOOR, LARCH_PRESSURE_PLATE, LARCH_BUTTON, LARCH_SIGN, LARCH_HANGING_SIGN, LARCH_SHELF,
				LARCH_LEAVES, LARCH_SAPLING,
				
				PINE_LOG, PINE_WOOD, STRIPPED_PINE_LOG, STRIPPED_PINE_WOOD, PINE_PLANKS, PINE_STAIRS, PINE_SLAB,
				PINE_FENCE, PINE_FENCE_GATE, PINE_DOOR, PINE_TRAPDOOR, PINE_PRESSURE_PLATE, PINE_BUTTON, PINE_SIGN, PINE_HANGING_SIGN, PINE_SHELF,
				PINE_LEAVES, PINE_SAPLING,
				
				REDWOOD_LOG, REDWOOD_WOOD, STRIPPED_REDWOOD_LOG, STRIPPED_REDWOOD_WOOD, REDWOOD_PLANKS, REDWOOD_STAIRS, REDWOOD_SLAB,
				REDWOOD_FENCE, REDWOOD_FENCE_GATE, REDWOOD_DOOR, REDWOOD_TRAPDOOR, REDWOOD_PRESSURE_PLATE, REDWOOD_BUTTON, REDWOOD_SIGN, REDWOOD_HANGING_SIGN, REDWOOD_SHELF,
				REDWOOD_LEAVES, REDWOOD_SAPLING,
				
				SEQUOIA_LOG, SEQUOIA_WOOD, STRIPPED_SEQUOIA_LOG, STRIPPED_SEQUOIA_WOOD, SEQUOIA_PLANKS, SEQUOIA_STAIRS, SEQUOIA_SLAB,
				SEQUOIA_FENCE, SEQUOIA_FENCE_GATE, SEQUOIA_DOOR, SEQUOIA_TRAPDOOR, SEQUOIA_PRESSURE_PLATE, SEQUOIA_BUTTON, SEQUOIA_SIGN, SEQUOIA_HANGING_SIGN, SEQUOIA_SHELF,
				SEQUOIA_LEAVES, SEQUOIA_SAPLING,
				
				WHITE_SAND, WHITE_SANDSTONE, WHITE_SANDSTONE_STAIRS, WHITE_SANDSTONE_SLAB, WHITE_SANDSTONE_WALL, CHISELED_WHITE_SANDSTONE,
				SMOOTH_WHITE_SANDSTONE, SMOOTH_WHITE_SANDSTONE_STAIRS, SMOOTH_WHITE_SANDSTONE_SLAB, CUT_WHITE_SANDSTONE, CUT_WHITE_SANDSTONE_SLAB,
				
				SNOW_BRICKS, SNOW_BRICK_STAIRS, SNOW_BRICK_SLAB, SNOW_BRICK_WALL,
				PACKED_ICE_BRICKS, PACKED_ICE_BRICK_STAIRS, PACKED_ICE_BRICK_SLAB, PACKED_ICE_BRICK_WALL,
				
				PERMAFROST, PEAT, PEAT_BLOCK, PINECONES, QUICKSAND_BUCKET, CATTAIL,
				SHORT_PRAIRIE_GRASS, TALL_PRAIRIE_GRASS, SHORT_FROSTED_GRASS, TALL_FROSTED_GRASS, SHORT_TUNDRA_GRASS, TALL_TUNDRA_GRASS,
				
				ASPEN_BOAT, CEDAR_BOAT, FIR_BOAT, HEMLOCK_BOAT, LARCH_BOAT, PINE_BOAT, REDWOOD_BOAT, SEQUOIA_BOAT
		);
		
		items.forEach(item -> translationBuilder.add(item, TranslationUtils.createItem(item)));
		
		List<ResourceKey<Biome>> biomes = List.of(
				ASPEN_GROVE,
				BOG,
				DEEP_WARM_OCEAN,
				FORESTED_SLOPES,
				GIANT_GROVE, GLACIAL_SHORE,
				OLD_GROWTH_SNOWY_TAIGA,
				PRAIRIE,
				REDWOOD_FOREST, ROCKY_GROVE,
				STEPPE,
				TUNDRA,
				WOODED_TUNDRA
		);
		
		biomes.forEach(biome -> translationBuilder.add(TranslationUtils.getBiomeTranslationKey(biome), TranslationUtils.createBiome(biome)));
		
		List<Item> chestBoatItems = List.of(
				ASPEN_CHEST_BOAT, CEDAR_CHEST_BOAT, FIR_CHEST_BOAT, HEMLOCK_CHEST_BOAT, LARCH_CHEST_BOAT, PINE_CHEST_BOAT, REDWOOD_CHEST_BOAT, SEQUOIA_CHEST_BOAT
		);
		
		List<EntityType<ChestBoat>> chestBoatEntities = List.of(
				AWREntityTypes.ASPEN_CHEST_BOAT,
				AWREntityTypes.CEDAR_CHEST_BOAT,
				AWREntityTypes.FIR_CHEST_BOAT,
				AWREntityTypes.HEMLOCK_CHEST_BOAT,
				AWREntityTypes.LARCH_CHEST_BOAT,
				AWREntityTypes.PINE_CHEST_BOAT,
				AWREntityTypes.REDWOOD_CHEST_BOAT,
				AWREntityTypes.SEQUOIA_CHEST_BOAT
		);
		
		chestBoatItems.forEach(item -> translationBuilder.add(item, TranslationUtils.createChestBoat(item)));
		chestBoatEntities.forEach(entity -> translationBuilder.add(entity, TranslationUtils.createChestBoat(entity)));
		
		List<TagKey<Block>> blockTags = List.of(
				SUPPORTS_SNOWY_VEGETATION, SUPPORTS_TUNDRA_VEGETATION
		);
		
		blockTags.forEach(blockTag -> translationBuilder.add(blockTag, TranslationUtils.create(blockTag.getTranslationKey())));
	}
}
