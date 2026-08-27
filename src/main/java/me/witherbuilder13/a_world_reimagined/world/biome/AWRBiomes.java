package me.witherbuilder13.a_world_reimagined.world.biome;

import me.witherbuilder13.a_world_reimagined.AWorldReimagined;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;

public abstract class AWRBiomes {

    public static final ResourceKey<Biome> ASPEN_GROVE = register("aspen_grove");
    public static final ResourceKey<Biome> BOG = register("bog");
    public static final ResourceKey<Biome> DEEP_WARM_OCEAN = register("deep_warm_ocean");
    public static final ResourceKey<Biome> FORESTED_SLOPES = register("forested_slopes");
    public static final ResourceKey<Biome> GIANT_GROVE = register("giant_grove");
    public static final ResourceKey<Biome> GLACIAL_SHORE = register("glacial_shore");
    public static final ResourceKey<Biome> OLD_GROWTH_SNOWY_TAIGA = register("old_growth_snowy_taiga");
    public static final ResourceKey<Biome> PRAIRIE = register("prairie");
    public static final ResourceKey<Biome> REDWOOD_FOREST = register("redwood_forest");
    public static final ResourceKey<Biome> ROCKY_GROVE = register("rocky_grove");
    public static final ResourceKey<Biome> STEPPE = register("steppe");
    public static final ResourceKey<Biome> TUNDRA = register("tundra");
    public static final ResourceKey<Biome> WOODED_TUNDRA = register("wooded_tundra");

    //` --------------------------------------------------------------------------------------------------------------
    
    private static ResourceKey<Biome> register(String id) {
        return ResourceKey.create(Registries.BIOME, AWorldReimagined.id(id));
    }
}
