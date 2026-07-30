package me.witherbuilder13.a_world_reimagined.world.placement;

import me.witherbuilder13.a_world_reimagined.AWorldReimagined;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class AWRPlacementUtils {

    public static void bootstrap(final BootstrapContext<PlacedFeature> context) {
        AWRTreePlacements.bootstrap(context);
        AWRVegetationPlacements.bootstrap(context);
    }

    public static ResourceKey<PlacedFeature> of(String id) {
        return ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(AWorldReimagined.MOD_ID, id));
    }
}
