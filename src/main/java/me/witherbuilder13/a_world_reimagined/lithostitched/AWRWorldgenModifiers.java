package me.witherbuilder13.a_world_reimagined.lithostitched;

import dev.worldgen.lithostitched.api.registry.LithostitchedRegistries;
import dev.worldgen.lithostitched.api.worldgen.modifier.WorldgenModifier;
import me.witherbuilder13.a_world_reimagined.AWorldReimagined;
import net.minecraft.resources.ResourceKey;

public class AWRWorldgenModifiers {
	public static ResourceKey<WorldgenModifier> createKey(String id) {
		return ResourceKey.create(LithostitchedRegistries.WORLDGEN_MODIFIER, AWorldReimagined.id(id));
	}
}
