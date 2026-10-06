package me.witherbuilder13.a_world_reimagined.tag;

import me.witherbuilder13.a_world_reimagined.AWorldReimagined;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class AWRItemTags {
	
	public static final TagKey<Item> ALLOWS_WALKING_ON_QUICKSAND = create("allows_walking_on_quicksand");
	
	private static TagKey<Item> create(String key) {
		return TagKey.create(Registries.ITEM, AWorldReimagined.id(key));
	}
}
