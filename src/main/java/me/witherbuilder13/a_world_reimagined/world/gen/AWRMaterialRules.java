package me.witherbuilder13.a_world_reimagined.world.gen;

import dev.worldgen.lithostitched.api.worldgen.modifier.WorldgenModifier;
import me.witherbuilder13.a_world_reimagined.AWorldReimagined;
import me.witherbuilder13.a_world_reimagined.block.AWRBlocks;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.material.VanillaMaterialConditions;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Noises;

import static net.minecraft.world.level.levelgen.SurfaceRules.*;

public class AWRMaterialRules {
	
	public static final ResourceKey<RuleSource> GLACIAL_SHORE_SURFACE = createKey("biome_surface/glacial_shore");
	public static final ResourceKey<RuleSource> TUNDRA_SURFACE = createKey("biome_surface/tundra");
	public static final ResourceKey<RuleSource> WHITE_SAND_OR_SANDSTONE_IF_CEILING = createKey("white_sand_or_sandstone_if_ceiling");
	
	public static final RuleSource BLUE_ICE = makeStateRule(Blocks.BLUE_ICE);
	public static final RuleSource PACKED_ICE = makeStateRule(Blocks.PACKED_ICE);
	public static final RuleSource PERMAFROST = makeStateRule(AWRBlocks.PERMAFROST);
	public static final RuleSource WHITE_SAND = makeStateRule(AWRBlocks.WHITE_SAND);
	public static final RuleSource WHITE_SANDSTONE = makeStateRule(AWRBlocks.WHITE_SANDSTONE);
	
	private static ResourceKey<RuleSource> createKey(final String name) {
		return ResourceKey.create(Registries.MATERIAL_RULE, AWorldReimagined.id(name));
	}
	
	public static RuleSource makeStateRule(final Block block) {
		return state(block.defaultBlockState());
	}
	
	public static void bootstrap(BootstrapContext<RuleSource> context) {
		HolderGetter<ConditionSource> conditions = context.lookup(Registries.MATERIAL_CONDITION);
		ConditionSource onCeiling = getCondition(conditions, VanillaMaterialConditions.ON_CEILING);
		
		registerAndWrap(
				context,
				GLACIAL_SHORE_SURFACE,
				sequence(
						ifTrue(
								noiseCondition2d(Noises.SMALL_PATCH, 1.2F),
								BLUE_ICE
						),
						PACKED_ICE
				)
		);
		registerAndWrap(context, TUNDRA_SURFACE, PERMAFROST);
		registerAndWrap(context, WHITE_SAND_OR_SANDSTONE_IF_CEILING, sequence(ifTrue(onCeiling, WHITE_SANDSTONE), WHITE_SAND));
	}
	
	@SafeVarargs
	public static RuleSource biomeSurface(BootstrapContext<WorldgenModifier> context, RuleSource rule, ResourceKey<Biome>... biomes) {
		HolderGetter<ConditionSource> conditions = context.lookup(Registries.MATERIAL_CONDITION);
		HolderGetter<Biome> biomesLookup = context.lookup(Registries.BIOME);
		
		return ifTrue(
				abovePreliminarySurface(),
				ifTrue(
						getCondition(conditions, VanillaMaterialConditions.ON_FLOOR),
						ifTrue(
								getCondition(conditions, VanillaMaterialConditions.NOT_UNDERWATER),
								ifTrue(
										isBiome(biomesLookup, biomes),
										rule
								)
						)
				)
		);
	}
	
	@SafeVarargs
	public static RuleSource underBiomeSurface(BootstrapContext<WorldgenModifier> context, RuleSource rule, ResourceKey<Biome>... biomes) {
		HolderGetter<ConditionSource> conditions = context.lookup(Registries.MATERIAL_CONDITION);
		HolderGetter<Biome> biomesLookup = context.lookup(Registries.BIOME);
		
		return ifTrue(
				abovePreliminarySurface(),
				ifTrue(
						getCondition(conditions, VanillaMaterialConditions.NOT_UNDER_DEEP_WATER),
						ifTrue(
								getCondition(conditions, VanillaMaterialConditions.UNDER_FLOOR),
								ifTrue(
										isBiome(biomesLookup, biomes),
										rule
								)
						)
				)
		);
	}
	
	@SafeVarargs
	public static RuleSource surface(BootstrapContext<WorldgenModifier> context, RuleSource rule, ResourceKey<Biome>... biomes) {
		HolderGetter<ConditionSource> conditions = context.lookup(Registries.MATERIAL_CONDITION);
		HolderGetter<Biome> biomesLookup = context.lookup(Registries.BIOME);
		
		return ifTrue(
				abovePreliminarySurface(),
				ifTrue(
						getCondition(conditions, VanillaMaterialConditions.NOT_UNDER_DEEP_WATER),
						ifTrue(
								getCondition(conditions, VanillaMaterialConditions.UNDER_FLOOR),
								ifTrue(
										isBiome(biomesLookup, biomes),
										rule
								)
						)
				)
		);
	}
}
