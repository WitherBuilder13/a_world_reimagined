package me.witherbuilder13.a_world_reimagined.world.feature;

import me.witherbuilder13.a_world_reimagined.AWorldReimagined;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.Feature;

public class AWRFeatureUtils {

    public static void bootstrap(final BootstrapContext<Feature> context) {
        AWRTreeFeatures.bootstrap(context);
        AWRVegetationFeatures.bootstrap(context);
    }
    
    public static ResourceKey<Feature> of(String id) {
        return ResourceKey.create(Registries.FEATURE, Identifier.fromNamespaceAndPath(AWorldReimagined.MOD_ID, id));
    }
}
