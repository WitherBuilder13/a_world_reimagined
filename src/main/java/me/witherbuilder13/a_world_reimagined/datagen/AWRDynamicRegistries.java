package me.witherbuilder13.a_world_reimagined.datagen;

import dev.worldgen.lithostitched.api.registry.LithostitchedRegistries;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class AWRDynamicRegistries extends FabricDynamicRegistryProvider {
    public AWRDynamicRegistries(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(HolderLookup.@NonNull Provider registries, @NonNull Entries entries) {
        entries.addAll(registries.lookupOrThrow(Registries.BIOME));
        //entries.addAll(registries.lookupOrThrow(Registries.FEATURE));
        entries.addAll(registries.lookupOrThrow(Registries.PLACED_FEATURE));
        entries.addAll(registries.lookupOrThrow(LithostitchedRegistries.BIOME_INJECTOR));
        entries.addAll(registries.lookupOrThrow(LithostitchedRegistries.WORLDGEN_MODIFIER));
    }

    @Override
    public @NonNull String getName() {
        return "A World Reimagined: Dynamic Registries";
    }
}
