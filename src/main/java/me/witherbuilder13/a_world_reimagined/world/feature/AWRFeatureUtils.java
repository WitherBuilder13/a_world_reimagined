package me.witherbuilder13.a_world_reimagined.world.feature;

import com.mojang.serialization.MapCodec;
import me.witherbuilder13.a_world_reimagined.AWorldReimagined;
import me.witherbuilder13.a_world_reimagined.world.feature.trunkplacer.ExtraGiantTrunkPlacer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

public class AWRFeatureUtils {
    
    public static final TrunkPlacerType<ExtraGiantTrunkPlacer> EXTRA_GIANT_TRUNK_PLACER = register("extra_giant_trunk_placer", ExtraGiantTrunkPlacer.CODEC);
    
    private static <P extends TrunkPlacer> TrunkPlacerType<P> register(final String name, final MapCodec<P> codec) {
        return Registry.register(BuiltInRegistries.TRUNK_PLACER_TYPE, AWorldReimagined.id(name), new TrunkPlacerType<>(codec));
    }
    
    public static void init() {}

    public static void bootstrap(final BootstrapContext<Feature> context) {
        AWRTreeFeatures.bootstrap(context);
        AWRVegetationFeatures.bootstrap(context);
    }
    
    public static ResourceKey<Feature> of(String id) {
        return ResourceKey.create(Registries.FEATURE, AWorldReimagined.id(id));
    }
}
