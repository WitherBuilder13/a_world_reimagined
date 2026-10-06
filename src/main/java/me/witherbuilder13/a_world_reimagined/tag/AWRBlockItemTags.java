package me.witherbuilder13.a_world_reimagined.tag;

import me.witherbuilder13.a_world_reimagined.AWorldReimagined;
import net.minecraft.tags.BlockItemTagId;

public abstract class AWRBlockItemTags {
	
	public static final BlockItemTagId ASPEN_LOGS = create("aspen_logs");
	public static final BlockItemTagId CEDAR_LOGS = create("cedar_logs");
	public static final BlockItemTagId FIR_LOGS = create("fir_logs");
	public static final BlockItemTagId HEMLOCK_LOGS = create("hemlock_logs");
	public static final BlockItemTagId LARCH_LOGS = create("larch_logs");
	public static final BlockItemTagId PINE_LOGS = create("pine_logs");
	public static final BlockItemTagId REDWOOD_LOGS = create("redwood_logs");
	public static final BlockItemTagId SEQUOIA_LOGS = create("sequoia_logs");
	
	private static BlockItemTagId create(String key) {
		return BlockItemTagId.create(AWorldReimagined.id(key), AWorldReimagined.id(key));
	}
}
