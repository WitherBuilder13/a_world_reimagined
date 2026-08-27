package me.witherbuilder13.a_world_reimagined.lithostitched;

import dev.worldgen.lithostitched.api.util.InjectionType;
import dev.worldgen.lithostitched.api.worldgen.modifier.WorldgenModifier;
import me.witherbuilder13.a_world_reimagined.block.AWRBlocks;
import me.witherbuilder13.a_world_reimagined.world.biome.AWRBiomes;
import me.witherbuilder13.a_world_reimagined.world.gen.AWRMaterialRules;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.material.VanillaMaterialConditions;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Noises;
import net.minecraft.world.level.levelgen.SurfaceRules;

import static net.minecraft.world.level.levelgen.SurfaceRules.*;


public class AWRSurfaceRuleModifiers {
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
	
	public static void bootstrap(BootstrapContext<WorldgenModifier> context) {
		HolderGetter<SurfaceRules.RuleSource> rules = context.lookup(Registries.MATERIAL_RULE);
		HolderGetter<ConditionSource> conditions = context.lookup(Registries.MATERIAL_CONDITION);
		HolderGetter<Biome> biomes = context.lookup(Registries.BIOME);
		
		Holder<SurfaceRules.RuleSource> tundraSurface = rules.getOrThrow(AWRMaterialRules.TUNDRA_SURFACE);
		
		context.register(TUNDRA_SURFACE, WorldgenModifier.builder()
				.addSurfaceRule(
						Level.OVERWORLD,
						InjectionType.PREPEND,
						AWRMaterialRules.biomeSurface(
								context,
								AWRMaterialRules.PERMAFROST,
								AWRBiomes.TUNDRA, AWRBiomes.WOODED_TUNDRA
						)
				)
		);
		context.register(GLACIAL_SHORE_SURFACE, WorldgenModifier.builder()
				.addSurfaceRule(
						Level.OVERWORLD,
						InjectionType.PREPEND,
						AWRMaterialRules.biomeSurface(
								context,
								sequence(
										ifTrue(
												noiseCondition2d(Noises.SMALL_PATCH, 1.2F),
												AWRMaterialRules.BLUE_ICE
										),
										AWRMaterialRules.PACKED_ICE
								),
								AWRBiomes.GLACIAL_SHORE
						)
				)
		);
		context.register(GLACIAL_SHORE_UNDER_SURFACE, WorldgenModifier.builder()
				.addSurfaceRule(
						Level.OVERWORLD,
						InjectionType.PREPEND,
						AWRMaterialRules.underBiomeSurface(
								context,
								sequence(
										ifTrue(
												noiseCondition2d(Noises.SMALL_PATCH, 1.2F),
												AWRMaterialRules.BLUE_ICE
										),
										AWRMaterialRules.PACKED_ICE
								),
								AWRBiomes.GLACIAL_SHORE
						)
				)
		);
		context.register(WHITE_SAND_OR_SANDSTONE_IF_CEILING_SURFACE, WorldgenModifier.builder()
				.addSurfaceRule(
						Level.OVERWORLD,
						InjectionType.PREPEND,
						AWRMaterialRules.biomeSurface(
								context,
								sequence(
										ifTrue(
												getCondition(conditions, VanillaMaterialConditions.ON_CEILING),
												AWRMaterialRules.WHITE_SANDSTONE
										),
										AWRMaterialRules.WHITE_SAND
								),
								Biomes.SNOWY_BEACH
						)
				)
		);
		context.register(WHITE_SAND_OR_SANDSTONE_IF_CEILING_UNDER_SURFACE, WorldgenModifier.builder()
				.addSurfaceRule(
						Level.OVERWORLD,
						InjectionType.PREPEND,
						AWRMaterialRules.underBiomeSurface(
								context,
								sequence(
										ifTrue(
												getCondition(conditions, VanillaMaterialConditions.ON_CEILING),
												AWRMaterialRules.WHITE_SANDSTONE
										),
										AWRMaterialRules.WHITE_SAND
								),
								Biomes.SNOWY_BEACH
						)
				)
		);
		context.register(WHITE_SAND_OR_SANDSTONE_IF_CEILING, WorldgenModifier.builder()
				.addSurfaceRule(
						Level.OVERWORLD,
						InjectionType.PREPEND,
						ifTrue(
								abovePreliminarySurface(),
								ifTrue(
										getCondition(conditions, VanillaMaterialConditions.NOT_UNDER_DEEP_WATER),
										ifTrue(
												isBiome(biomes, Biomes.SNOWY_BEACH),
												sequence(
														ifTrue(
																getCondition(conditions, VanillaMaterialConditions.ON_CEILING),
																AWRMaterialRules.WHITE_SANDSTONE
														),
														AWRMaterialRules.WHITE_SAND
												)
										)
								)
						)
				)
		);
		context.register(DEEP_WARM_OCEAN, WorldgenModifier.builder()
				.addSurfaceRule(
						Level.OVERWORLD,
						InjectionType.PREPEND,
						ifTrue(
								abovePreliminarySurface(),
								ifTrue(
										getCondition(conditions, VanillaMaterialConditions.NOT_UNDER_DEEP_WATER),
										ifTrue(
												isBiome(biomes, AWRBiomes.DEEP_WARM_OCEAN),
												sequence(
														ifTrue(
																getCondition(conditions, VanillaMaterialConditions.ON_CEILING),
																AWRMaterialRules.makeStateRule(Blocks.SANDSTONE)
														),
														AWRMaterialRules.makeStateRule(Blocks.SAND)
												)
										)
								)
						)
				)
		);
		context.register(DEEP_WARM_OCEAN_DEEP, WorldgenModifier.builder()
				.addSurfaceRule(
						Level.OVERWORLD,
						InjectionType.PREPEND,
						ifTrue(
								abovePreliminarySurface(),
								ifTrue(
										getCondition(conditions, VanillaMaterialConditions.ON_FLOOR),
										ifTrue(
												isBiome(biomes, AWRBiomes.DEEP_WARM_OCEAN),
												sequence(
														ifTrue(
																getCondition(conditions, VanillaMaterialConditions.ON_CEILING),
																AWRMaterialRules.makeStateRule(Blocks.SANDSTONE)
														),
														AWRMaterialRules.makeStateRule(Blocks.SAND)
												)
										)
								)
						)
				)
		);
		context.register(DEEP_WARM_OCEAN_SURFACE, WorldgenModifier.builder()
				.addSurfaceRule(
						Level.OVERWORLD,
						InjectionType.PREPEND,
						AWRMaterialRules.biomeSurface(
								context,
								sequence(
										ifTrue(
												getCondition(conditions, VanillaMaterialConditions.ON_CEILING),
												AWRMaterialRules.makeStateRule(Blocks.SANDSTONE)
										),
										AWRMaterialRules.makeStateRule(Blocks.SAND)
								),
								AWRBiomes.DEEP_WARM_OCEAN
						)
				)
		);
		context.register(DEEP_WARM_OCEAN_UNDER_SURFACE, WorldgenModifier.builder()
				.addSurfaceRule(
						Level.OVERWORLD,
						InjectionType.PREPEND,
						AWRMaterialRules.underBiomeSurface(
								context,
								sequence(
										ifTrue(
												getCondition(conditions, VanillaMaterialConditions.ON_CEILING),
												AWRMaterialRules.makeStateRule(Blocks.SANDSTONE)
										),
										AWRMaterialRules.makeStateRule(Blocks.SAND)
								),
								AWRBiomes.DEEP_WARM_OCEAN
						)
				)
		);
	}
}
