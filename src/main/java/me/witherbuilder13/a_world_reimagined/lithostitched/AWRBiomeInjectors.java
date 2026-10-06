package me.witherbuilder13.a_world_reimagined.lithostitched;

import dev.worldgen.lithostitched.api.registry.LithostitchedRegistries;
import dev.worldgen.lithostitched.api.worldgen.biomeinjector.BiomeInjector;
import dev.worldgen.lithostitched.api.worldgen.biomeinjector.ParameterBuilder;
import me.witherbuilder13.a_world_reimagined.AWorldReimagined;
import me.witherbuilder13.a_world_reimagined.world.biome.AWRBiomes;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.OverworldBiomeBuilder;
import net.minecraft.world.level.levelgen.NoiseRouterData;
import net.minecraft.world.level.levelgen.densityfunction.DensityFunction;

import java.util.List;

public class AWRBiomeInjectors {
	
	public static final ResourceKey<BiomeInjector> ASPEN_GROVE_1 = createKey("aspen_grove_1");
	public static final ResourceKey<BiomeInjector> ASPEN_GROVE_2 = createKey("aspen_grove_2");
	public static final ResourceKey<BiomeInjector> ASPEN_GROVE_3 = createKey("aspen_grove_3");
	public static final ResourceKey<BiomeInjector> ASPEN_GROVE_4 = createKey("aspen_grove_4");
	public static final ResourceKey<BiomeInjector> ASPEN_GROVE_5 = createKey("aspen_grove_5");
	public static final ResourceKey<BiomeInjector> ASPEN_GROVE_6 = createKey("aspen_grove_6");
	
	public static final ResourceKey<BiomeInjector> BOG = createKey("bog");
	
	public static final ResourceKey<BiomeInjector> CHERRY_GROVE = createKey("cherry_grove");
	
	public static final ResourceKey<BiomeInjector> DAPPLED_FOREST_F_1 = createKey("dappled_forest_f_1");
	public static final ResourceKey<BiomeInjector> DAPPLED_FOREST_F_2 = createKey("dappled_forest_f_2");
	public static final ResourceKey<BiomeInjector> DAPPLED_FOREST_F_3 = createKey("dappled_forest_f_3");
	public static final ResourceKey<BiomeInjector> DAPPLED_FOREST_F_4 = createKey("dappled_forest_f_4");
	public static final ResourceKey<BiomeInjector> DAPPLED_FOREST_F_5 = createKey("dappled_forest_f_5");
	public static final ResourceKey<BiomeInjector> DAPPLED_FOREST_F_6 = createKey("dappled_forest_f_6");
	public static final ResourceKey<BiomeInjector> DAPPLED_FOREST_F_7 = createKey("dappled_forest_f_7");
	public static final ResourceKey<BiomeInjector> DAPPLED_FOREST_F_8 = createKey("dappled_forest_f_8");
	public static final ResourceKey<BiomeInjector> DAPPLED_FOREST_F_9 = createKey("dappled_forest_f_9");
	public static final ResourceKey<BiomeInjector> DAPPLED_FOREST_F_10 = createKey("dappled_forest_f_10");
	public static final ResourceKey<BiomeInjector> DAPPLED_FOREST_F_11 = createKey("dappled_forest_f_11");
	public static final ResourceKey<BiomeInjector> DAPPLED_FOREST_F_12 = createKey("dappled_forest_f_12");
	public static final ResourceKey<BiomeInjector> DAPPLED_FOREST_P = createKey("dappled_forest_p");
	
	public static final ResourceKey<BiomeInjector> DEEP_WARM_OCEAN = createKey("deep_warm_ocean");
	
	public static final ResourceKey<BiomeInjector> FORESTED_SLOPES_1 = createKey("forested_slopes_1");
	public static final ResourceKey<BiomeInjector> FORESTED_SLOPES_2 = createKey("forested_slopes_2");
	public static final ResourceKey<BiomeInjector> FORESTED_SLOPES_3 = createKey("forested_slopes_3");
	
	public static final ResourceKey<BiomeInjector> GIANT_GROVE_1 = createKey("giant_grove_1");
	public static final ResourceKey<BiomeInjector> GIANT_GROVE_2 = createKey("giant_grove_2");
	public static final ResourceKey<BiomeInjector> GIANT_GROVE_3 = createKey("giant_grove_3");
	
	public static final ResourceKey<BiomeInjector> GLACIAL_SHORE = createKey("glacial_shore");
	
	public static final ResourceKey<BiomeInjector> OLD_GROWTH_SNOWY_TAIGA_M_1 = createKey("old_growth_snowy_taiga_m_1");
	public static final ResourceKey<BiomeInjector> OLD_GROWTH_SNOWY_TAIGA_M_2 = createKey("old_growth_snowy_taiga_m_2");
	public static final ResourceKey<BiomeInjector> OLD_GROWTH_SNOWY_TAIGA_M_3 = createKey("old_growth_snowy_taiga_m_3");
	public static final ResourceKey<BiomeInjector> OLD_GROWTH_SNOWY_TAIGA_M_4 = createKey("old_growth_snowy_taiga_m_4");
	public static final ResourceKey<BiomeInjector> OLD_GROWTH_SNOWY_TAIGA_M_5 = createKey("old_growth_snowy_taiga_m_5");
	public static final ResourceKey<BiomeInjector> OLD_GROWTH_SNOWY_TAIGA_M_6 = createKey("old_growth_snowy_taiga_m_6");
	public static final ResourceKey<BiomeInjector> OLD_GROWTH_SNOWY_TAIGA_M_7 = createKey("old_growth_snowy_taiga_m_7");
	public static final ResourceKey<BiomeInjector> OLD_GROWTH_SNOWY_TAIGA_M_8 = createKey("old_growth_snowy_taiga_m_8");
	public static final ResourceKey<BiomeInjector> OLD_GROWTH_SNOWY_TAIGA_M_9 = createKey("old_growth_snowy_taiga_m_9");
	public static final ResourceKey<BiomeInjector> OLD_GROWTH_SNOWY_TAIGA_M_10 = createKey("old_growth_snowy_taiga_m_10");
	public static final ResourceKey<BiomeInjector> OLD_GROWTH_SNOWY_TAIGA_M_11 = createKey("old_growth_snowy_taiga_m_11");
	public static final ResourceKey<BiomeInjector> OLD_GROWTH_SNOWY_TAIGA_M_12 = createKey("old_growth_snowy_taiga_m_12");
	
	public static final ResourceKey<BiomeInjector> OLD_GROWTH_SNOWY_TAIGA_P_1 = createKey("old_growth_snowy_taiga_p_1");
	public static final ResourceKey<BiomeInjector> OLD_GROWTH_SNOWY_TAIGA_P_2 = createKey("old_growth_snowy_taiga_p_2");
	public static final ResourceKey<BiomeInjector> OLD_GROWTH_SNOWY_TAIGA_P_3 = createKey("old_growth_snowy_taiga_p_3");
	public static final ResourceKey<BiomeInjector> OLD_GROWTH_SNOWY_TAIGA_P_4 = createKey("old_growth_snowy_taiga_p_4");
	public static final ResourceKey<BiomeInjector> OLD_GROWTH_SNOWY_TAIGA_P_5 = createKey("old_growth_snowy_taiga_p_5");
	public static final ResourceKey<BiomeInjector> OLD_GROWTH_SNOWY_TAIGA_P_6 = createKey("old_growth_snowy_taiga_p_6");
	
	public static final ResourceKey<BiomeInjector> PRAIRIE_1 = createKey("prairie_1");
	public static final ResourceKey<BiomeInjector> PRAIRIE_2 = createKey("prairie_2");
	
	public static final ResourceKey<BiomeInjector> REDWOOD_FOREST = createKey("redwood_forest");
	
	public static final ResourceKey<BiomeInjector> ROCKY_GROVE_1 = createKey("rocky_grove_1");
	public static final ResourceKey<BiomeInjector> ROCKY_GROVE_2 = createKey("rocky_grove_2");
	public static final ResourceKey<BiomeInjector> ROCKY_GROVE_3 = createKey("rocky_grove_3");
	
	public static final ResourceKey<BiomeInjector> STEPPE_1 = createKey("steppe_1");
	public static final ResourceKey<BiomeInjector> STEPPE_2 = createKey("steppe_2");
	
	public static final ResourceKey<BiomeInjector> TUNDRA_1 = createKey("tundra_1");
	public static final ResourceKey<BiomeInjector> TUNDRA_2 = createKey("tundra_2");
	public static final ResourceKey<BiomeInjector> TUNDRA_3 = createKey("tundra_3");
	public static final ResourceKey<BiomeInjector> TUNDRA_4 = createKey("tundra_4");
	public static final ResourceKey<BiomeInjector> TUNDRA_5 = createKey("tundra_5");
	public static final ResourceKey<BiomeInjector> TUNDRA_6 = createKey("tundra_6");
	
	public static final ResourceKey<BiomeInjector> WOODED_TUNDRA_1 = createKey("wooded_tundra_1");
	public static final ResourceKey<BiomeInjector> WOODED_TUNDRA_2 = createKey("wooded_tundra_2");
	public static final ResourceKey<BiomeInjector> WOODED_TUNDRA_3 = createKey("wooded_tundra_3");
	public static final ResourceKey<BiomeInjector> WOODED_TUNDRA_4 = createKey("wooded_tundra_4");
	public static final ResourceKey<BiomeInjector> WOODED_TUNDRA_5 = createKey("wooded_tundra_5");
	public static final ResourceKey<BiomeInjector> WOODED_TUNDRA_6 = createKey("wooded_tundra_6");
	
	//` ------------------------------------------------------------------------------------------------------------------
	
	public static void bootstrap(BootstrapContext<BiomeInjector> context) {
		HolderGetter<Biome> biomes = context.lookup(Registries.BIOME);
		HolderGetter<DensityFunction> densityFunctions = context.lookup(Registries.DENSITY_FUNCTION);
		
		Holder<DensityFunction> ridgesFolded = densityFunctions.getOrThrow(NoiseRouterData.RIDGES_FOLDED);
		
		final OverworldBiomeBuilder reference = new OverworldBiomeBuilder();
		final Climate.Parameter[] temperature = reference.getTemperatureThresholds();
		final Climate.Parameter[] humidity = reference.getHumidityThresholds();
		final Climate.Parameter[] erosion = reference.getErosionThresholds();
		final Climate.Parameter[] continentalness = reference.getContinentalnessThresholds();
		final Climate.Parameter[] peaks_and_valleys = reference.getPeaksAndValleysThresholds();
		final Climate.Parameter[] weirdness = reference.getWeirdnessThresholds();
		
		final Climate.Parameter island = continentalness[0];
		final Climate.Parameter deepOcean = continentalness[1];
		final Climate.Parameter ocean = continentalness[2];
		final Climate.Parameter coast = continentalness[3];
		final Climate.Parameter nearInland = continentalness[4];
		final Climate.Parameter midInland = continentalness[5];
		final Climate.Parameter farInland = continentalness[6];
		
		final Climate.Parameter pv_valley = peaks_and_valleys[0];
		final Climate.Parameter pv_low = peaks_and_valleys[1];
		final Climate.Parameter pv_mid = peaks_and_valleys[2];
		final Climate.Parameter pv_high = peaks_and_valleys[3];
		final Climate.Parameter pv_peak = peaks_and_valleys[4];
		
		final Climate.Parameter w_negative = weirdness[0];
		final Climate.Parameter w_positive = weirdness[1];
		
		final Climate.Parameter[][] allParameters = {
				temperature,
				humidity,
				erosion,
				continentalness,
				peaks_and_valleys,
				weirdness
		};
		
		//* --------------------------------------------------------------------------------------------------------------------------------
		
		List<ResourceKey<BiomeInjector>> aspenGrove = List.of(
				ASPEN_GROVE_1, ASPEN_GROVE_2, ASPEN_GROVE_3, ASPEN_GROVE_4, ASPEN_GROVE_5, ASPEN_GROVE_6
		);
		
		for (int i = 0; i < 6; i++) {
			context.register(aspenGrove.get(i), BiomeInjector.builder(Level.OVERWORLD)
					.replacePartially(
							HolderSet.direct(
									biomes.getOrThrow(Biomes.BIRCH_FOREST),
									biomes.getOrThrow(Biomes.MEADOW)
							),
							biomes.getOrThrow(AWRBiomes.ASPEN_GROVE),
							plateauBiomeTopography(allParameters, ridgesFolded, i)
									.climateRange(BiomeInjector.ClimateParameter.TEMPERATURE, min(temperature[2]), max(temperature[2]))
									.climateRange(BiomeInjector.ClimateParameter.HUMIDITY, min(humidity[3]), max(humidity[3]))
					)
			);
		}
		
		context.register(BOG, BiomeInjector.builder(Level.OVERWORLD)
				.replacePartially(
						HolderSet.direct(
								biomes.getOrThrow(Biomes.SWAMP)
						),
						biomes.getOrThrow(AWRBiomes.BOG),
						ParameterBuilder.create()
								.climateRange(BiomeInjector.ClimateParameter.TEMPERATURE, min(temperature[1]), max(temperature[1]))
								.climateRange(BiomeInjector.ClimateParameter.HUMIDITY, min(humidity[0]), max(humidity[1]))
				)
		);
		
		context.register(CHERRY_GROVE, BiomeInjector.builder(Level.OVERWORLD)
				.replacePartially(
						HolderSet.direct(
								biomes.getOrThrow(Biomes.MEADOW)
						),
						biomes.getOrThrow(Biomes.CHERRY_GROVE),
						ParameterBuilder.create()
								.climateRange(BiomeInjector.ClimateParameter.TEMPERATURE, min(temperature[1]), max(temperature[1]))
								.climateRange(BiomeInjector.ClimateParameter.HUMIDITY, min(humidity[1]), max(humidity[1]))
								.climateRange(BiomeInjector.ClimateParameter.WEIRDNESS, min(w_positive), max(w_positive))
				)
		);
		
		List<ResourceKey<BiomeInjector>> dappledForestF = List.of(
				DAPPLED_FOREST_F_1, DAPPLED_FOREST_F_2, DAPPLED_FOREST_F_3, DAPPLED_FOREST_F_4, DAPPLED_FOREST_F_5, DAPPLED_FOREST_F_6,
				DAPPLED_FOREST_F_7, DAPPLED_FOREST_F_8, DAPPLED_FOREST_F_9, DAPPLED_FOREST_F_10, DAPPLED_FOREST_F_11, DAPPLED_FOREST_F_12
		);
		
		for (int i = 0; i < 12; i++) {
			context.register(dappledForestF.get(i), BiomeInjector.builder(Level.OVERWORLD)
					.priority(1100)
					.replacePartially(
							HolderSet.direct(
									biomes.getOrThrow(Biomes.FOREST)
							),
							biomes.getOrThrow(Biomes.DAPPLED_FOREST),
							middleBiomeTopography(allParameters, ridgesFolded, i)
									.climateRange(BiomeInjector.ClimateParameter.TEMPERATURE, min(temperature[1]), max(temperature[1]))
									.climateRange(BiomeInjector.ClimateParameter.HUMIDITY, min(humidity[2]), max(humidity[2]))
					)
			);
		}
		context.register(DAPPLED_FOREST_P, BiomeInjector.builder(Level.OVERWORLD)
				.priority(1100)
				.replacePartially(
						HolderSet.direct(
								biomes.getOrThrow(Biomes.PLAINS)
						),
						biomes.getOrThrow(Biomes.DAPPLED_FOREST),
						ParameterBuilder.create()
								.climateRange(BiomeInjector.ClimateParameter.TEMPERATURE, min(temperature[1]), max(temperature[1]))
								.climateRange(BiomeInjector.ClimateParameter.HUMIDITY, min(humidity[1]), max(humidity[1]))
								.climateRange(BiomeInjector.ClimateParameter.WEIRDNESS, min(w_positive), max(w_positive))
				)
		);
		
		context.register(DEEP_WARM_OCEAN, BiomeInjector.builder(Level.OVERWORLD)
				.replacePartially(
						HolderSet.direct(
								biomes.getOrThrow(Biomes.WARM_OCEAN)
						),
						biomes.getOrThrow(AWRBiomes.DEEP_WARM_OCEAN),
						ParameterBuilder.create()
								.climateRange(BiomeInjector.ClimateParameter.CONTINENTALNESS, min(deepOcean), max(deepOcean))
				)
		);
		
		List<ResourceKey<BiomeInjector>> forestedSlopes = List.of(
				FORESTED_SLOPES_1, FORESTED_SLOPES_2, FORESTED_SLOPES_3
		);
		
		for (int i = 0; i < 3; i++) {
			context.register(forestedSlopes.get(i), BiomeInjector.builder(Level.OVERWORLD)
					.replacePartially(
							HolderSet.direct(
									biomes.getOrThrow(Biomes.PLAINS),
									biomes.getOrThrow(Biomes.FOREST),
									biomes.getOrThrow(Biomes.MEADOW),
									biomes.getOrThrow(Biomes.CHERRY_GROVE)
							),
							biomes.getOrThrow(AWRBiomes.FORESTED_SLOPES),
							slopesBiomeTopography(allParameters, ridgesFolded, i)
									.climateRange(BiomeInjector.ClimateParameter.TEMPERATURE, min(temperature[1]), max(temperature[1]))
									.climateRange(BiomeInjector.ClimateParameter.HUMIDITY, min(humidity[1]), max(humidity[2]))
					)
			);
		}
		
		List<ResourceKey<BiomeInjector>> giantGrove = List.of(
				GIANT_GROVE_1, GIANT_GROVE_2, GIANT_GROVE_3
		);
		
		for (int i = 0; i < 3; i++) {
			context.register(giantGrove.get(i), BiomeInjector.builder(Level.OVERWORLD)
					.priority(500)
					.replacePartially(
							HolderSet.direct(
									biomes.getOrThrow(Biomes.OLD_GROWTH_SPRUCE_TAIGA),
									biomes.getOrThrow(Biomes.OLD_GROWTH_PINE_TAIGA)
							),
							biomes.getOrThrow(AWRBiomes.GIANT_GROVE),
							slopesBiomeTopography(allParameters, ridgesFolded, i)
									.climateRange(BiomeInjector.ClimateParameter.HUMIDITY, min(humidity[4]), max(humidity[4]))
									.climateRange(BiomeInjector.ClimateParameter.WEIRDNESS, min(w_positive), max(w_positive))
					)
			);
		}
		
		context.register(GLACIAL_SHORE, BiomeInjector.builder(Level.OVERWORLD)
				.replacePartially(
						HolderSet.direct(
								biomes.getOrThrow(Biomes.STONY_SHORE)
						),
						biomes.getOrThrow(AWRBiomes.GLACIAL_SHORE),
						ParameterBuilder.create()
								.climateRange(BiomeInjector.ClimateParameter.TEMPERATURE, min(temperature[0]), max(temperature[0]))
								.climateRange(BiomeInjector.ClimateParameter.EROSION, min(erosion[0]), max(erosion[2]))
								.climateRange(BiomeInjector.ClimateParameter.CONTINENTALNESS, min(coast), max(coast))
								.densityFunctionRange(ridgesFolded, min(pv_low), max(pv_mid))
				)
		);
		
		List<ResourceKey<BiomeInjector>> oldGrowthSnowyTaigaM = List.of(
				OLD_GROWTH_SNOWY_TAIGA_M_1, OLD_GROWTH_SNOWY_TAIGA_M_2, OLD_GROWTH_SNOWY_TAIGA_M_3, OLD_GROWTH_SNOWY_TAIGA_M_4, OLD_GROWTH_SNOWY_TAIGA_M_5, OLD_GROWTH_SNOWY_TAIGA_M_6,
				OLD_GROWTH_SNOWY_TAIGA_M_7, OLD_GROWTH_SNOWY_TAIGA_M_8, OLD_GROWTH_SNOWY_TAIGA_M_9, OLD_GROWTH_SNOWY_TAIGA_M_10, OLD_GROWTH_SNOWY_TAIGA_M_11, OLD_GROWTH_SNOWY_TAIGA_M_12
		);
		
		for (int i = 0; i < 12; i++) {
			context.register(oldGrowthSnowyTaigaM.get(i), BiomeInjector.builder(Level.OVERWORLD)
					.replacePartially(
							HolderSet.direct(
									biomes.getOrThrow(Biomes.TAIGA)
							),
							biomes.getOrThrow(AWRBiomes.OLD_GROWTH_SNOWY_TAIGA),
							middleBiomeTopography(allParameters, ridgesFolded, i)
									.climateRange(BiomeInjector.ClimateParameter.TEMPERATURE, min(temperature[0]), max(temperature[0]))
									.climateRange(BiomeInjector.ClimateParameter.HUMIDITY, min(humidity[4]), max(humidity[4]))
					)
			);
		}
		
		List<ResourceKey<BiomeInjector>> oldGrowthSnowyTaigaP = List.of(
				OLD_GROWTH_SNOWY_TAIGA_P_1, OLD_GROWTH_SNOWY_TAIGA_P_2, OLD_GROWTH_SNOWY_TAIGA_P_3, OLD_GROWTH_SNOWY_TAIGA_P_4, OLD_GROWTH_SNOWY_TAIGA_P_5, OLD_GROWTH_SNOWY_TAIGA_P_6
		);
		
		for (int i = 0; i < 6; i++) {
			context.register(oldGrowthSnowyTaigaP.get(i), BiomeInjector.builder(Level.OVERWORLD)
					.replacePartially(
							HolderSet.direct(
									biomes.getOrThrow(Biomes.SNOWY_TAIGA)
							),
							biomes.getOrThrow(AWRBiomes.OLD_GROWTH_SNOWY_TAIGA),
							plateauBiomeTopography(allParameters, ridgesFolded, i)
									.climateRange(BiomeInjector.ClimateParameter.HUMIDITY, min(humidity[4]), max(humidity[4]))
					)
			);
		}
		
		context.register(PRAIRIE_1, BiomeInjector.builder(Level.OVERWORLD)
				.replacePartially(
						HolderSet.direct(
								biomes.getOrThrow(Biomes.PLAINS),
								biomes.getOrThrow(Biomes.DAPPLED_FOREST)
						),
						biomes.getOrThrow(AWRBiomes.PRAIRIE),
						ParameterBuilder.create()
								.climateRange(BiomeInjector.ClimateParameter.HUMIDITY, min(humidity[0]), max(humidity[0]))
				)
		);
		context.register(PRAIRIE_2, BiomeInjector.builder(Level.OVERWORLD)
				.replacePartially(
						HolderSet.direct(
								biomes.getOrThrow(Biomes.PLAINS)
						),
						biomes.getOrThrow(AWRBiomes.PRAIRIE),
						ParameterBuilder.create()
								.climateRange(BiomeInjector.ClimateParameter.TEMPERATURE, min(temperature[1]), max(temperature[1]))
								.climateRange(BiomeInjector.ClimateParameter.HUMIDITY, min(humidity[1]), max(humidity[1]))
								.climateRange(BiomeInjector.ClimateParameter.WEIRDNESS, min(w_negative), max(w_negative))
				)
		);
		
		context.register(REDWOOD_FOREST, BiomeInjector.builder(Level.OVERWORLD)
				.replacePartially(
						HolderSet.direct(
								biomes.getOrThrow(Biomes.OLD_GROWTH_SPRUCE_TAIGA),
								biomes.getOrThrow(Biomes.OLD_GROWTH_PINE_TAIGA)
						),
						biomes.getOrThrow(AWRBiomes.REDWOOD_FOREST),
						ParameterBuilder.create()
								.climateRange(BiomeInjector.ClimateParameter.EROSION, min(erosion[3]), max(erosion[4]))
								.climateRange(BiomeInjector.ClimateParameter.CONTINENTALNESS, min(coast), max(nearInland))
								.densityFunctionRange(ridgesFolded, min(pv_low), max(pv_high))
				)
		);
		
		List<ResourceKey<BiomeInjector>> rockyGrove = List.of(
				ROCKY_GROVE_1, ROCKY_GROVE_2, ROCKY_GROVE_3
		);
		
		for (int i = 0; i < 3; i++) {
			context.register(rockyGrove.get(i), BiomeInjector.builder(Level.OVERWORLD)
					.replacePartially(
							HolderSet.direct(
									biomes.getOrThrow(Biomes.TAIGA),
									biomes.getOrThrow(Biomes.OLD_GROWTH_SPRUCE_TAIGA),
									biomes.getOrThrow(Biomes.OLD_GROWTH_PINE_TAIGA),
									biomes.getOrThrow(Biomes.MEADOW)
							),
							biomes.getOrThrow(AWRBiomes.ROCKY_GROVE),
							slopesBiomeTopography(allParameters, ridgesFolded, i)
									.climateRange(BiomeInjector.ClimateParameter.TEMPERATURE, min(temperature[1]), max(temperature[1]))
									.climateRange(BiomeInjector.ClimateParameter.HUMIDITY, min(humidity[3]), max(humidity[4]))
					)
			);
		}
		
		context.register(STEPPE_1, BiomeInjector.builder(Level.OVERWORLD)
				.replacePartially(
						HolderSet.direct(
								biomes.getOrThrow(Biomes.MEADOW),
								biomes.getOrThrow(Biomes.CHERRY_GROVE)
						),
						biomes.getOrThrow(AWRBiomes.STEPPE),
						ParameterBuilder.create()
								.climateRange(BiomeInjector.ClimateParameter.TEMPERATURE, min(temperature[1]), max(temperature[1]))
								.climateRange(BiomeInjector.ClimateParameter.HUMIDITY, min(humidity[0]), max(humidity[0]))
				)
		);
		context.register(STEPPE_2, BiomeInjector.builder(Level.OVERWORLD)
				.replacePartially(
						HolderSet.direct(
								biomes.getOrThrow(Biomes.MEADOW)
						),
						biomes.getOrThrow(AWRBiomes.STEPPE),
						ParameterBuilder.create()
								.climateRange(BiomeInjector.ClimateParameter.TEMPERATURE, min(temperature[1]), max(temperature[1]))
								.climateRange(BiomeInjector.ClimateParameter.HUMIDITY, min(humidity[1]), max(humidity[1]))
								.climateRange(BiomeInjector.ClimateParameter.WEIRDNESS, min(w_negative), max(w_negative))
				)
		);
		
		List<ResourceKey<BiomeInjector>> tundra = List.of(
				TUNDRA_1, TUNDRA_2, TUNDRA_3, TUNDRA_4, TUNDRA_5, TUNDRA_6
		);
		
		for (int i = 0; i < 6; i++) {
			context.register(tundra.get(i), BiomeInjector.builder(Level.OVERWORLD)
					.replacePartially(
							HolderSet.direct(
									biomes.getOrThrow(Biomes.SNOWY_PLAINS)
							),
							biomes.getOrThrow(AWRBiomes.TUNDRA),
							plateauBiomeTopography(allParameters, ridgesFolded, i)
									.climateRange(BiomeInjector.ClimateParameter.HUMIDITY, min(humidity[0]), max(humidity[1]))
					)
			);
		}
		
		List<ResourceKey<BiomeInjector>> woodedTundra = List.of(
				WOODED_TUNDRA_1, WOODED_TUNDRA_2, WOODED_TUNDRA_3, WOODED_TUNDRA_4, WOODED_TUNDRA_5, WOODED_TUNDRA_6
		);
		
		for (int i = 0; i < 6; i++) {
			context.register(woodedTundra.get(i), BiomeInjector.builder(Level.OVERWORLD)
					.replacePartially(
							HolderSet.direct(
									biomes.getOrThrow(Biomes.SNOWY_PLAINS)
							),
							biomes.getOrThrow(AWRBiomes.WOODED_TUNDRA),
							plateauBiomeTopography(allParameters, ridgesFolded, i)
									.climateRange(BiomeInjector.ClimateParameter.HUMIDITY, min(humidity[2]), max(humidity[2]))
					)
			);
		}
	}
	
	//` -----------------------------------------------------------------------------------------------------------------------------
	
	private static ResourceKey<BiomeInjector> createKey(String id) {
		return ResourceKey.create(LithostitchedRegistries.BIOME_INJECTOR, AWorldReimagined.id(id));
	}
	
	private static float min(Climate.Parameter parameter) {
		return Climate.unquantizeCoord(parameter.min());
	}
	
	private static float max(Climate.Parameter parameter) {
		return Climate.unquantizeCoord(parameter.max());
	}
	
	private static ParameterBuilder middleBiomeTopography(Climate.Parameter[][] parameters, Holder<DensityFunction> ridgesFolded, int index) {
		final Climate.Parameter[] erosion = parameters[2];
		final Climate.Parameter[] continentalness = parameters[3];
		final Climate.Parameter[] peaks_and_valleys = parameters[4];
		
		final Climate.Parameter coast = continentalness[3];
		final Climate.Parameter nearInland = continentalness[4];
		final Climate.Parameter midInland = continentalness[5];
		final Climate.Parameter farInland = continentalness[6];
		
		final Climate.Parameter pv_valley = peaks_and_valleys[0];
		final Climate.Parameter pv_low = peaks_and_valleys[1];
		final Climate.Parameter pv_mid = peaks_and_valleys[2];
		final Climate.Parameter pv_high = peaks_and_valleys[3];
		final Climate.Parameter pv_peak = peaks_and_valleys[4];
		
		return switch (index) {
			case 0 -> ParameterBuilder.create()
					.climateRange(BiomeInjector.ClimateParameter.EROSION, min(erosion[0]), max(erosion[1]))
					.climateRange(BiomeInjector.ClimateParameter.CONTINENTALNESS, min(midInland), max(farInland))
					.densityFunctionRange(ridgesFolded, min(pv_valley), max(pv_valley));
			case 1 -> ParameterBuilder.create()
					.climateRange(BiomeInjector.ClimateParameter.EROSION, min(erosion[0]), max(erosion[1]))
					.climateRange(BiomeInjector.ClimateParameter.CONTINENTALNESS, min(nearInland), max(farInland))
					.densityFunctionRange(ridgesFolded, min(pv_low), max(pv_low));
			case 2 -> ParameterBuilder.create()
					.climateRange(BiomeInjector.ClimateParameter.EROSION, min(erosion[0]), max(erosion[0]))
					.climateRange(BiomeInjector.ClimateParameter.CONTINENTALNESS, min(coast), max(coast))
					.densityFunctionRange(ridgesFolded, min(pv_high), max(pv_high));
			case 3 -> ParameterBuilder.create()
					.climateRange(BiomeInjector.ClimateParameter.EROSION, min(erosion[1]), max(erosion[2]))
					.climateRange(BiomeInjector.ClimateParameter.CONTINENTALNESS, min(nearInland), max(midInland))
					.densityFunctionRange(ridgesFolded, min(pv_mid), max(pv_mid));
			case 4 -> ParameterBuilder.create()
					.climateRange(BiomeInjector.ClimateParameter.EROSION, min(erosion[1]), max(erosion[2]))
					.climateRange(BiomeInjector.ClimateParameter.CONTINENTALNESS, min(coast), max(nearInland))
					.densityFunctionRange(ridgesFolded, min(pv_high), max(pv_peak));
			case 5 -> ParameterBuilder.create()
					.climateRange(BiomeInjector.ClimateParameter.EROSION, min(erosion[2]), max(erosion[4]))
					.climateRange(BiomeInjector.ClimateParameter.CONTINENTALNESS, min(nearInland), max(farInland))
					.densityFunctionRange(ridgesFolded, min(pv_low), max(pv_low));
			case 6 -> ParameterBuilder.create()
					.climateRange(BiomeInjector.ClimateParameter.EROSION, min(erosion[3]), max(erosion[3]))
					.climateRange(BiomeInjector.ClimateParameter.CONTINENTALNESS, min(coast), max(farInland))
					.densityFunctionRange(ridgesFolded, min(pv_mid), max(pv_mid));
			case 7 -> ParameterBuilder.create()
					.climateRange(BiomeInjector.ClimateParameter.EROSION, min(erosion[3]), max(erosion[3]))
					.climateRange(BiomeInjector.ClimateParameter.CONTINENTALNESS, min(coast), max(farInland))
					.densityFunctionRange(ridgesFolded, min(pv_high), max(pv_peak));
			case 8 -> ParameterBuilder.create()
					.climateRange(BiomeInjector.ClimateParameter.EROSION, min(erosion[4]), max(erosion[4]))
					.climateRange(BiomeInjector.ClimateParameter.CONTINENTALNESS, min(coast), max(farInland))
					.densityFunctionRange(ridgesFolded, min(pv_mid), max(pv_peak));
			case 9 -> ParameterBuilder.create()
					.climateRange(BiomeInjector.ClimateParameter.EROSION, min(erosion[5]), max(erosion[5]))
					.climateRange(BiomeInjector.ClimateParameter.CONTINENTALNESS, min(coast), max(farInland))
					.densityFunctionRange(ridgesFolded, min(pv_low), max(pv_low));
			case 10 -> ParameterBuilder.create()
					.climateRange(BiomeInjector.ClimateParameter.EROSION, min(erosion[5]), max(erosion[5]))
					.climateRange(BiomeInjector.ClimateParameter.CONTINENTALNESS, min(coast), max(nearInland))
					.densityFunctionRange(ridgesFolded, min(pv_mid), max(pv_high));
			case 11 -> ParameterBuilder.create()
					.climateRange(BiomeInjector.ClimateParameter.EROSION, min(erosion[6]), max(erosion[6]))
					.climateRange(BiomeInjector.ClimateParameter.CONTINENTALNESS, min(coast), max(farInland))
					.densityFunctionRange(ridgesFolded, min(pv_mid), max(pv_peak));
			default -> throw new IllegalArgumentException("Invalid index for middle biome injection: " + index);
		};
	}
	
	private static ParameterBuilder plateauBiomeTopography(Climate.Parameter[][] parameters, Holder<DensityFunction> ridgesFolded, int index) {
		
		final Climate.Parameter[] erosion = parameters[2];
		final Climate.Parameter[] continentalness = parameters[3];
		final Climate.Parameter[] peaks_and_valleys = parameters[4];
		
		final Climate.Parameter nearInland = continentalness[4];
		final Climate.Parameter midInland = continentalness[5];
		final Climate.Parameter farInland = continentalness[6];
		
		final Climate.Parameter pv_mid = peaks_and_valleys[2];
		final Climate.Parameter pv_high = peaks_and_valleys[3];
		final Climate.Parameter pv_peak = peaks_and_valleys[4];
		
		return switch (index) {
			case 0 -> ParameterBuilder.create()
					.climateRange(BiomeInjector.ClimateParameter.EROSION, min(erosion[0]), max(erosion[0]))
					.climateRange(BiomeInjector.ClimateParameter.CONTINENTALNESS, min(nearInland), max(farInland))
					.densityFunctionRange(ridgesFolded, min(pv_mid), max(pv_mid));
			case 1 -> ParameterBuilder.create()
					.climateRange(BiomeInjector.ClimateParameter.EROSION, min(erosion[0]), max(erosion[0]))
					.climateRange(BiomeInjector.ClimateParameter.CONTINENTALNESS, min(nearInland), max(nearInland))
					.densityFunctionRange(ridgesFolded, min(pv_high), max(pv_high));
			case 2 -> ParameterBuilder.create()
					.climateRange(BiomeInjector.ClimateParameter.EROSION, min(erosion[1]), max(erosion[2]))
					.climateRange(BiomeInjector.ClimateParameter.CONTINENTALNESS, min(farInland), max(farInland))
					.densityFunctionRange(ridgesFolded, min(pv_mid), max(pv_mid));
			case 3 -> ParameterBuilder.create()
					.climateRange(BiomeInjector.ClimateParameter.EROSION, min(erosion[1]), max(erosion[1]))
					.climateRange(BiomeInjector.ClimateParameter.CONTINENTALNESS, min(midInland), max(farInland))
					.densityFunctionRange(ridgesFolded, min(pv_high), max(pv_high));
			case 4 -> ParameterBuilder.create()
					.climateRange(BiomeInjector.ClimateParameter.EROSION, min(erosion[2]), max(erosion[2]))
					.climateRange(BiomeInjector.ClimateParameter.CONTINENTALNESS, min(midInland), max(farInland))
					.densityFunctionRange(ridgesFolded, min(pv_high), max(pv_peak));
			case 5 -> ParameterBuilder.create()
					.climateRange(BiomeInjector.ClimateParameter.EROSION, min(erosion[3]), max(erosion[3]))
					.climateRange(BiomeInjector.ClimateParameter.CONTINENTALNESS, min(farInland), max(farInland))
					.densityFunctionRange(ridgesFolded, min(pv_high), max(pv_peak));
			default -> throw new IllegalArgumentException("Invalid index for plateau biome injection: " + index);
		};
	}
	
	private static ParameterBuilder slopesBiomeTopography(Climate.Parameter[][] parameters, Holder<DensityFunction> ridgesFolded, int index) {
		
		final Climate.Parameter[] erosion = parameters[2];
		final Climate.Parameter[] continentalness = parameters[3];
		final Climate.Parameter[] peaks_and_valleys = parameters[4];
		
		final Climate.Parameter coast = continentalness[3];
		final Climate.Parameter nearInland = continentalness[4];
		final Climate.Parameter midInland = continentalness[5];
		final Climate.Parameter farInland = continentalness[6];
		
		final Climate.Parameter pv_valley = peaks_and_valleys[0];
		final Climate.Parameter pv_low = peaks_and_valleys[1];
		final Climate.Parameter pv_mid = peaks_and_valleys[2];
		final Climate.Parameter pv_high = peaks_and_valleys[3];
		final Climate.Parameter pv_peak = peaks_and_valleys[4];
		
		return switch (index) {
			case 0 -> ParameterBuilder.create()
					.climateRange(BiomeInjector.ClimateParameter.EROSION, min(erosion[0]), max(erosion[1]))
					.climateRange(BiomeInjector.ClimateParameter.CONTINENTALNESS, min(midInland), max(farInland))
					.densityFunctionRange(ridgesFolded, min(pv_valley), max(pv_low));
			case 1 -> ParameterBuilder.create()
					.climateRange(BiomeInjector.ClimateParameter.EROSION, min(erosion[1]), max(erosion[1]))
					.climateRange(BiomeInjector.ClimateParameter.CONTINENTALNESS, min(nearInland), max(farInland))
					.densityFunctionRange(ridgesFolded, min(pv_mid), max(pv_high));
			case 2 -> ParameterBuilder.create()
					.climateRange(BiomeInjector.ClimateParameter.EROSION, min(erosion[1]), max(erosion[1]))
					.climateRange(BiomeInjector.ClimateParameter.CONTINENTALNESS, min(coast), max(nearInland))
					.densityFunctionRange(ridgesFolded, min(pv_peak), max(pv_peak));
			default -> throw  new IllegalArgumentException("Invalid index for slopes biome injection: " + index);
		};
	}
}
