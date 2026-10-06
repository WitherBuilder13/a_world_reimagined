package me.witherbuilder13.a_world_reimagined.mixin;

import net.minecraft.data.worldgen.material.OverworldMaterialRules;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.material.rule.MaterialRule;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(OverworldMaterialRules.class)
public interface MaterialRulesAccessor {
	
	@Accessor("BIOME_SURFACE")
	static ResourceKey<MaterialRule> biomeSurface() {
		throw new AssertionError("Untransformed @Accessor");
	}
	
	@Accessor("UNDER_BIOME_SURFACE")
	static ResourceKey<MaterialRule> underBiomeSurface() {
		throw new AssertionError("Untransformed @Accessor");
	}
	
	@Accessor("SURFACE")
	static ResourceKey<MaterialRule> surface() {
		throw new AssertionError("Untransformed @Accessor");
	}
	
	@Accessor("SAND_OR_SANDSTONE_IF_CEILING")
	static ResourceKey<MaterialRule> sandOrSandstoneIfCeiling() {
		throw new AssertionError("Untransformed @Accessor");
	}
}
