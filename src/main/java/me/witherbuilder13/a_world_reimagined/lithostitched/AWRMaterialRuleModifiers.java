package me.witherbuilder13.a_world_reimagined.lithostitched;

import dev.worldgen.lithostitched.api.worldgen.modifier.WorldgenModifier;
import me.witherbuilder13.a_world_reimagined.block.AWRBlocks;
import me.witherbuilder13.a_world_reimagined.mixin.MaterialRulesAccessor;
import me.witherbuilder13.a_world_reimagined.world.biome.AWRBiomes;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.material.VanillaMaterialConditions;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Noises;
import net.minecraft.world.level.levelgen.material.condition.MaterialCondition;
import net.minecraft.world.level.levelgen.material.rule.MaterialRule;

import static net.minecraft.world.level.levelgen.material.MaterialRules.*;

public class AWRMaterialRuleModifiers {
	public static final ResourceKey<WorldgenModifier> TUNDRA_SURFACE = AWRWorldgenModifiers.createKey("tundra_surface");
	public static final ResourceKey<WorldgenModifier> GLACIAL_SHORE_SURFACE = AWRWorldgenModifiers.createKey("glacial_shore_surface");
	public static final ResourceKey<WorldgenModifier> GLACIAL_SHORE_UNDER_SURFACE = AWRWorldgenModifiers.createKey("glacial_shore_under_surface");
	public static final ResourceKey<WorldgenModifier> WHITE_SAND_OR_SANDSTONE_IF_CEILING = AWRWorldgenModifiers.createKey("white_sand_or_sandstone_if_ceiling");
	public static final ResourceKey<WorldgenModifier> WHITE_SAND_OR_SANDSTONE_IF_CEILING_SURFACE = AWRWorldgenModifiers.createKey("white_sand_or_sandstone_if_ceiling_surface");
	public static final ResourceKey<WorldgenModifier> WHITE_SAND_OR_SANDSTONE_IF_CEILING_UNDER_SURFACE = AWRWorldgenModifiers.createKey("white_sand_or_sandstone_if_ceiling_under_surface");
	public static final ResourceKey<WorldgenModifier> DEEP_WARM_OCEAN = AWRWorldgenModifiers.createKey("deep_warm_ocean");
	public static final ResourceKey<WorldgenModifier> DEEP_WARM_OCEAN_DEEP = AWRWorldgenModifiers.createKey("deep_warm_ocean_deep");
	public static final ResourceKey<WorldgenModifier> DEEP_WARM_OCEAN_SURFACE = AWRWorldgenModifiers.createKey("deep_warm_ocean_surface");
	public static final ResourceKey<WorldgenModifier> DEEP_WARM_OCEAN_UNDER_SURFACE = AWRWorldgenModifiers.createKey("deep_warm_ocean_under_surface");
	
	public static final MaterialRule BLUE_ICE = makeStateRule(Blocks.BLUE_ICE);
	public static final MaterialRule PACKED_ICE = makeStateRule(Blocks.PACKED_ICE);
	public static final MaterialRule PERMAFROST = makeStateRule(AWRBlocks.PERMAFROST);
	public static final MaterialRule WHITE_SAND = makeStateRule(AWRBlocks.WHITE_SAND);
	public static final MaterialRule WHITE_SANDSTONE = makeStateRule(AWRBlocks.WHITE_SANDSTONE);
	
	public static MaterialRule makeStateRule(final Block block) {
		return state(block.defaultBlockState());
	}
	
	public static void bootstrap(BootstrapContext<WorldgenModifier> context) {
		HolderGetter<MaterialRule> rules = context.lookup(Registries.MATERIAL_RULE);
		HolderGetter<MaterialCondition> conditions = context.lookup(Registries.MATERIAL_CONDITION);
		HolderGetter<Biome> biomes = context.lookup(Registries.BIOME);
		
		MaterialRule glacialShoreSurface = sequence(
				ifTrue(
						noiseCondition2d(Noises.SMALL_PATCH, 1.2F),
						BLUE_ICE
				),
				PACKED_ICE
		);
		MaterialRule whiteSandOrSandstoneIfCeiling = sequence(
				ifTrue(
						getCondition(conditions, VanillaMaterialConditions.ON_CEILING),
						WHITE_SANDSTONE
				),
				WHITE_SAND
		);
		
		context.register(TUNDRA_SURFACE, WorldgenModifier.builder()
				.setMaterialRule(
						rules.getOrThrow(MaterialRulesAccessor.biomeSurface()),
						Holder.direct(
								sequence(
										ifTrue(
												isBiome(biomes, AWRBiomes.TUNDRA, AWRBiomes.WOODED_TUNDRA),
												PERMAFROST
										)
								)
						)
				)
		);
		context.register(GLACIAL_SHORE_SURFACE, WorldgenModifier.builder()
				.setMaterialRule(
						rules.getOrThrow(MaterialRulesAccessor.biomeSurface()),
						Holder.direct(
								ifTrue(
										isBiome(biomes, AWRBiomes.GLACIAL_SHORE),
										glacialShoreSurface
								)
						)
				)
		);
		context.register(GLACIAL_SHORE_UNDER_SURFACE, WorldgenModifier.builder()
				.setMaterialRule(
						rules.getOrThrow(MaterialRulesAccessor.underBiomeSurface()),
						Holder.direct(
								ifTrue(
										isBiome(biomes, AWRBiomes.GLACIAL_SHORE),
										glacialShoreSurface
								)
						)
				)
		);
		context.register(WHITE_SAND_OR_SANDSTONE_IF_CEILING_SURFACE, WorldgenModifier.builder()
				.setMaterialRule(
						rules.getOrThrow(MaterialRulesAccessor.biomeSurface()),
						Holder.direct(
								ifTrue(
										isBiome(biomes, Biomes.SNOWY_BEACH),
										whiteSandOrSandstoneIfCeiling
								)
						)
				)
		);
		context.register(WHITE_SAND_OR_SANDSTONE_IF_CEILING_UNDER_SURFACE, WorldgenModifier.builder()
				.setMaterialRule(
						rules.getOrThrow(MaterialRulesAccessor.underBiomeSurface()),
						Holder.direct(
								ifTrue(
										isBiome(biomes, Biomes.SNOWY_BEACH),
										whiteSandOrSandstoneIfCeiling
								)
						)
				)
		);
		context.register(WHITE_SAND_OR_SANDSTONE_IF_CEILING, WorldgenModifier.builder()
				.setMaterialRule(
						rules.getOrThrow(MaterialRulesAccessor.surface()),
						Holder.direct(
								ifTrue(
										getCondition(conditions, VanillaMaterialConditions.NOT_UNDER_DEEP_WATER),
										ifTrue(
												isBiome(biomes, Biomes.SNOWY_BEACH),
												whiteSandOrSandstoneIfCeiling
										)
								)
						)
				)
		);
		context.register(DEEP_WARM_OCEAN, WorldgenModifier.builder()
				.setMaterialRule(
						rules.getOrThrow(MaterialRulesAccessor.surface()),
						Holder.direct(
								ifTrue(
										getCondition(conditions, VanillaMaterialConditions.NOT_UNDER_DEEP_WATER),
										ifTrue(
												isBiome(biomes, AWRBiomes.DEEP_WARM_OCEAN),
												getRule(rules, MaterialRulesAccessor.sandOrSandstoneIfCeiling())
										)
								)
						)
				)
		);
		context.register(DEEP_WARM_OCEAN_DEEP, WorldgenModifier.builder()
				.setMaterialRule(
						rules.getOrThrow(MaterialRulesAccessor.surface()),
						Holder.direct(
								ifTrue(
										getCondition(conditions, VanillaMaterialConditions.ON_FLOOR),
										ifTrue(
												isBiome(biomes, AWRBiomes.DEEP_WARM_OCEAN),
												getRule(rules, MaterialRulesAccessor.sandOrSandstoneIfCeiling())
										)
								)
						)
				)
		);
		context.register(DEEP_WARM_OCEAN_SURFACE, WorldgenModifier.builder()
				.setMaterialRule(
						rules.getOrThrow(MaterialRulesAccessor.biomeSurface()),
						Holder.direct(
								ifTrue(
										isBiome(biomes, AWRBiomes.DEEP_WARM_OCEAN),
										getRule(rules, MaterialRulesAccessor.sandOrSandstoneIfCeiling())
								)
						)
				)
		);
		context.register(DEEP_WARM_OCEAN_UNDER_SURFACE, WorldgenModifier.builder()
				.setMaterialRule(
						rules.getOrThrow(MaterialRulesAccessor.underBiomeSurface()),
						Holder.direct(
								ifTrue(
										isBiome(biomes, AWRBiomes.DEEP_WARM_OCEAN),
										getRule(rules, MaterialRulesAccessor.sandOrSandstoneIfCeiling())
								)
						)
				)
		);
	}
}
