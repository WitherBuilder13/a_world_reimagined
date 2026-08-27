package me.witherbuilder13.a_world_reimagined.datagen;

import me.witherbuilder13.a_world_reimagined.block.util.AWRBlockFamilies;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.BlockFamily;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.block.Block;
import org.jspecify.annotations.NonNull;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static me.witherbuilder13.a_world_reimagined.item.AWRItems.*;
import static net.minecraft.world.item.Items.*;

public class AWRRecipeProvider extends FabricRecipeProvider {
	
	public AWRRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
		super(output, registriesFuture);
	}
	
	@Override
	protected @NonNull RecipeProvider createRecipeProvider(
			HolderLookup.@NonNull Provider registries, @NonNull BootstrapContext<Recipe<?>> recipes, @NonNull BootstrapContext<Advancement> advancements
	) {
		return new RecipeProvider(recipes, advancements) {
			
			@Override
			public void buildRecipes() {
				AWRBlockFamilies.getAllFamilies().forEach(family -> generateAWRRecipes(this, family));
				
				Map<Item, Item> logs = new HashMap<>();
				logs.put(ASPEN_WOOD, ASPEN_LOG);
				logs.put(CEDAR_WOOD, CEDAR_LOG);
				logs.put(FIR_WOOD, FIR_LOG);
				logs.put(HEMLOCK_WOOD, HEMLOCK_LOG);
				logs.put(LARCH_WOOD, LARCH_LOG);
				logs.put(PINE_WOOD, PINE_LOG);
				logs.put(REDWOOD_WOOD, REDWOOD_LOG);
				logs.put(SEQUOIA_WOOD, SEQUOIA_LOG);
				
				logs.forEach(this::woodFromLogs);
				
				shaped(RecipeCategory.BUILDING_BLOCKS, WHITE_SANDSTONE)
						.pattern("##")
						.pattern("##")
						.define('#', WHITE_SAND)
						.unlockedBy("has_white_sand", has(WHITE_SAND))
						.save(output);
				stairBuilder(WHITE_SANDSTONE_STAIRS, Ingredient.of(WHITE_SANDSTONE, CUT_WHITE_SANDSTONE, CHISELED_WHITE_SANDSTONE))
						.unlockedBy("has_white_sandstone", has(WHITE_SANDSTONE))
						.unlockedBy("has_chiseled_white_sandstone", has(CHISELED_WHITE_SANDSTONE))
						.unlockedBy("has_cut_white_sandstone", has(CUT_WHITE_SANDSTONE))
						.save(output);
				slabBuilder(RecipeCategory.BUILDING_BLOCKS, WHITE_SANDSTONE_SLAB, Ingredient.of(WHITE_SANDSTONE, CHISELED_WHITE_SANDSTONE))
						.unlockedBy("has_white_sandstone", has(WHITE_SANDSTONE))
						.unlockedBy("has_chiseled_white_sandstone", has(CHISELED_WHITE_SANDSTONE))
						.save(output);
				wall(RecipeCategory.DECORATIONS, WHITE_SANDSTONE_WALL, WHITE_SANDSTONE);
				cut(RecipeCategory.BUILDING_BLOCKS, CUT_WHITE_SANDSTONE, WHITE_SANDSTONE);
				chiseled(RecipeCategory.BUILDING_BLOCKS, CHISELED_WHITE_SANDSTONE, WHITE_SANDSTONE_SLAB);
				
				stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CUT_WHITE_SANDSTONE_SLAB, WHITE_SANDSTONE);
				SimpleCookingRecipeBuilder.smelting(
						Ingredient.of(WHITE_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, SMOOTH_WHITE_SANDSTONE, 0.1F, 200
						)
						.unlockedBy("has_white_sandstone", has(WHITE_SANDSTONE))
						.save(output);
				
				bricksBuilder(RecipeCategory.BUILDING_BLOCKS, SNOW_BRICKS, Ingredient.of(SNOW_BLOCK))
						.unlockedBy("has_snow_block", has(SNOW_BLOCK))
						.save(output);
				
				stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, SNOW_BRICKS, SNOW_BLOCK);
				stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, SNOW_BRICK_STAIRS, SNOW_BLOCK);
				stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, SNOW_BRICK_SLAB, SNOW_BLOCK);
				stonecutterResultFromBase(RecipeCategory.DECORATIONS, SNOW_BRICK_WALL, SNOW_BLOCK);
				
				bricksBuilder(RecipeCategory.BUILDING_BLOCKS, PACKED_ICE_BRICKS, Ingredient.of(PACKED_ICE))
						.unlockedBy("has_packed_ice", has(PACKED_ICE))
						.save(output);
				
				stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PACKED_ICE_BRICKS, PACKED_ICE);
				stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PACKED_ICE_BRICK_STAIRS, PACKED_ICE);
				stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PACKED_ICE_BRICK_SLAB, PACKED_ICE);
				stonecutterResultFromBase(RecipeCategory.DECORATIONS, PACKED_ICE_BRICK_WALL, PACKED_ICE);
			}
		};
	}
	
	public void generateAWRRecipes(RecipeProvider provider, final BlockFamily family) {
		family.getVariants().forEach((variant, result) -> {
			if (family.shouldGenerateCraftingRecipe())
				provider.generateCraftingRecipe(family, variant, result, provider.getBaseBlockForCrafting(family, variant));
			
			if (family.shouldGenerateSmeltingRecipe())
				provider.generateSmeltingRecipe(variant, result, provider.getBaseBlockForCrafting(family, variant));
			
			if (family.shouldGenerateStonecutterRecipe())
				provider.generateStonecutterRecipe(family, variant, family.getBaseBlock());
		});
	}
}
