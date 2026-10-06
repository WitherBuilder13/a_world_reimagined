package me.witherbuilder13.a_world_reimagined.world.gen;

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
import net.minecraft.world.level.levelgen.material.MaterialRules;
import net.minecraft.world.level.levelgen.material.condition.MaterialCondition;
import net.minecraft.world.level.levelgen.material.rule.MaterialRule;

import static net.minecraft.world.level.levelgen.material.MaterialRules.*;

public class AWRMaterialRules {
	
	public static final ResourceKey<MaterialRule> GLACIAL_SHORE_SURFACE = createKey("biome_surface/glacial_shore");
	public static final ResourceKey<MaterialRule> TUNDRA_SURFACE = createKey("biome_surface/tundra");
	public static final ResourceKey<MaterialRule> WHITE_SAND_OR_SANDSTONE_IF_CEILING = createKey("white_sand_or_sandstone_if_ceiling");
	
	public static final MaterialRule BLUE_ICE = makeStateRule(Blocks.BLUE_ICE);
	public static final MaterialRule PACKED_ICE = makeStateRule(Blocks.PACKED_ICE);
	public static final MaterialRule PERMAFROST = makeStateRule(AWRBlocks.PERMAFROST);
	public static final MaterialRule WHITE_SAND = makeStateRule(AWRBlocks.WHITE_SAND);
	public static final MaterialRule WHITE_SANDSTONE = makeStateRule(AWRBlocks.WHITE_SANDSTONE);
	
	private static ResourceKey<MaterialRule> createKey(final String name) {
		return ResourceKey.create(Registries.MATERIAL_RULE, AWorldReimagined.id(name));
	}
	
	public static MaterialRule makeStateRule(final Block block) {
		return state(block.defaultBlockState());
	}
	
	public static void bootstrap(BootstrapContext<MaterialRule> context) {
		HolderGetter<MaterialCondition> conditions = context.lookup(Registries.MATERIAL_CONDITION);
		MaterialCondition onCeiling = getCondition(conditions, VanillaMaterialConditions.ON_CEILING);
		
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
	/*//
	@SafeVarargs
	public static MaterialRule biomeSurface(BootstrapContext<WorldgenModifier> context, MaterialRule rule, ResourceKey<Biome>... biomes) {
		HolderGetter<MaterialCondition> conditions = context.lookup(Registries.MATERIAL_CONDITION);
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
	public static MaterialRule underBiomeSurface(BootstrapContext<WorldgenModifier> context, MaterialRule rule, ResourceKey<Biome>... biomes) {
		HolderGetter<MaterialCondition> conditions = context.lookup(Registries.MATERIAL_CONDITION);
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
	public static MaterialRule surface(BootstrapContext<WorldgenModifier> context, MaterialRule rule, ResourceKey<Biome>... biomes) {
		HolderGetter<MaterialCondition> conditions = context.lookup(Registries.MATERIAL_CONDITION);
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
	*/
}
