package me.witherbuilder13.a_world_reimagined.references;

import me.witherbuilder13.a_world_reimagined.AWorldReimagined;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;

public class AWRBlockIds {

    public static final ResourceKey<Block> CEDAR_WALL_SIGN = create("cedar_wall_sign");
    public static final ResourceKey<Block> FIR_WALL_SIGN = create("fir_wall_sign");
    public static final ResourceKey<Block> HEMLOCK_WALL_SIGN = create("hemlock_wall_sign");
    public static final ResourceKey<Block> LARCH_WALL_SIGN = create("larch_wall_sign");
    public static final ResourceKey<Block> PINE_WALL_SIGN = create("pine_wall_sign");
    public static final ResourceKey<Block> REDWOOD_WALL_SIGN = create("redwood_wall_sign");
    public static final ResourceKey<Block> SEQUOIA_WALL_SIGN = create("sequoia_wall_sign");
    
    public static final ResourceKey<Block> CEDAR_WALL_HANGING_SIGN = create("cedar_wall_hanging_sign");
    public static final ResourceKey<Block> FIR_WALL_HANGING_SIGN = create("fir_wall_hanging_sign");
    public static final ResourceKey<Block> HEMLOCK_WALL_HANGING_SIGN = create("hemlock_wall_hanging_sign");
    public static final ResourceKey<Block> LARCH_WALL_HANGING_SIGN = create("larch_wall_hanging_sign");
    public static final ResourceKey<Block> PINE_WALL_HANGING_SIGN = create("pine_wall_hanging_sign");
    public static final ResourceKey<Block> REDWOOD_WALL_HANGING_SIGN = create("redwood_wall_hanging_sign");
    public static final ResourceKey<Block> SEQUOIA_WALL_HANGING_SIGN = create("sequoia_wall_hanging_sign");

    public static final ResourceKey<Block> POTTED_CEDAR_SAPLING = create("potted_cedar_sapling");
    public static final ResourceKey<Block> POTTED_FIR_SAPLING = create("potted_fir_sapling");
    public static final ResourceKey<Block> POTTED_HEMLOCK_SAPLING = create("potted_hemlock_sapling");
    public static final ResourceKey<Block> POTTED_LARCH_SAPLING = create("potted_larch_sapling");
    public static final ResourceKey<Block> POTTED_PINE_SAPLING = create("potted_pine_sapling");
    public static final ResourceKey<Block> POTTED_REDWOOD_SAPLING = create("potted_redwood_sapling");
    public static final ResourceKey<Block> POTTED_SEQUOIA_SAPLING = create("potted_sequoia_sapling");

    //` -------------------------------------------------------------------------------------------------------------------------

    private static ResourceKey<Block> create(final String name) {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(AWorldReimagined.MOD_ID, name));
    }
}
