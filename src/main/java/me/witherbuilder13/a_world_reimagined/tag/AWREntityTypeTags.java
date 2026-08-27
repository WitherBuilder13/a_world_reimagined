package me.witherbuilder13.a_world_reimagined.tag;

import me.witherbuilder13.a_world_reimagined.AWorldReimagined;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;

public abstract class AWREntityTypeTags {
	
	public static final TagKey<EntityType<?>> QUICKSAND_WALKABLE_MOBS = create("quicksand_walkable_mobs");
	
	private static TagKey<EntityType<?>> create(String key) {
		return TagKey.create(Registries.ENTITY_TYPE, AWorldReimagined.id(key));
	}
}
