package me.witherbuilder13.a_world_reimagined.tag;

import me.witherbuilder13.a_world_reimagined.AWorldReimagined;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public abstract class AWRBlockTags {
	
	public static final TagKey<Block> SUPPORTS_SNOWY_VEGETATION = create("supports_snowy_vegetation");
	public static final TagKey<Block> SUPPORTS_TUNDRA_VEGETATION = create("supports_tundra_vegetation");
	public static final TagKey<Block> CANNOT_SUPPORT_PEAT_LAYER = create("cannot_support_peat_layer");
	public static final TagKey<Block> SUPPORT_OVERRIDE_PEAT_LAYER = create("support_override_peat_layer");
	public static final TagKey<Block> SUPPORTS_CATTAIL = create("supports_cattail");
	
	public static final TagKey<Block> FILLS_QUICKSAND_CAULDRON = create("fills_quicksand_cauldron");
	public static final TagKey<Block> ADDS_LAYER_TO_QUICKSAND_CAULDRON = create("adds_layer_to_quicksand_cauldron");
	
	private static TagKey<Block> create(String key) {
		return TagKey.create(Registries.BLOCK, AWorldReimagined.id(key));
	}
}
