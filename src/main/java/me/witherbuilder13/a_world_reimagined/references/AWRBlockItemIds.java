/*
package me.witherbuilder13.a_world_reimagined.references;

import me.witherbuilder13.a_world_reimagined.AWorldReimagined;
import net.minecraft.core.registries.Registries;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;

public class AWRBlockItemIds {

    public static final BlockItemId CEDAR_LOG = create("cedar_log");
    public static final BlockItemId FIR_LOG = create("fir_log");
    public static final BlockItemId HEMLOCK_LOG = create("hemlock_log");
    public static final BlockItemId LARCH_LOG = create("larch_log");
    public static final BlockItemId PINE_LOG = create("pine_log");
    public static final BlockItemId REDWOOD_LOG = create("redwood_log");
    public static final BlockItemId SEQUOIA_LOG = create("sequoia_log");
    
    public static final BlockItemId CEDAR_WOOD = create("cedar_wood");
    public static final BlockItemId FIR_WOOD = create("fir_wood");
    public static final BlockItemId HEMLOCK_WOOD = create("hemlock_wood");
    public static final BlockItemId LARCH_WOOD = create("larch_wood");
    public static final BlockItemId PINE_WOOD = create("pine_wood");
    public static final BlockItemId REDWOOD_WOOD = create("redwood_wood");
    public static final BlockItemId SEQUOIA_WOOD = create("sequoia_wood");
    
    public static final BlockItemId STRIPPED_CEDAR_LOG = create("stripped_cedar_log");
    public static final BlockItemId STRIPPED_FIR_LOG = create("stripped_fir_log");
    public static final BlockItemId STRIPPED_HEMLOCK_LOG = create("stripped_hemlock_log");
    public static final BlockItemId STRIPPED_LARCH_LOG = create("stripped_larch_log");
    public static final BlockItemId STRIPPED_PINE_LOG = create("stripped_pine_log");
    public static final BlockItemId STRIPPED_REDWOOD_LOG = create("stripped_redwood_log");
    public static final BlockItemId STRIPPED_SEQUOIA_LOG = create("stripped_sequoia_log");
    
    public static final BlockItemId STRIPPED_CEDAR_WOOD = create("stripped_cedar_wood");
    public static final BlockItemId STRIPPED_FIR_WOOD = create("stripped_fir_wood");
    public static final BlockItemId STRIPPED_HEMLOCK_WOOD = create("stripped_hemlock_wood");
    public static final BlockItemId STRIPPED_LARCH_WOOD = create("stripped_larch_wood");
    public static final BlockItemId STRIPPED_PINE_WOOD = create("stripped_pine_wood");
    public static final BlockItemId STRIPPED_REDWOOD_WOOD = create("stripped_redwood_wood");
    public static final BlockItemId STRIPPED_SEQUOIA_WOOD = create("stripped_sequoia_wood");
    
    public static final BlockItemId CEDAR_PLANKS = create("cedar_planks");
    public static final BlockItemId FIR_PLANKS = create("fir_planks");
    public static final BlockItemId HEMLOCK_PLANKS = create("hemlock_planks");
    public static final BlockItemId LARCH_PLANKS = create("larch_planks");
    public static final BlockItemId PINE_PLANKS = create("pine_planks");
    public static final BlockItemId REDWOOD_PLANKS = create("redwood_planks");
    public static final BlockItemId SEQUOIA_PLANKS = create("sequoia_planks");
    
    public static final BlockItemId CEDAR_STAIRS = create("cedar_stairs");
    public static final BlockItemId FIR_STAIRS = create("fir_stairs");
    public static final BlockItemId HEMLOCK_STAIRS = create("hemlock_stairs");
    public static final BlockItemId LARCH_STAIRS = create("larch_stairs");
    public static final BlockItemId PINE_STAIRS = create("pine_stairs");
    public static final BlockItemId REDWOOD_STAIRS = create("redwood_stairs");
    public static final BlockItemId SEQUOIA_STAIRS = create("sequoia_stairs");
    
    public static final BlockItemId CEDAR_SLAB = create("cedar_slab");
    public static final BlockItemId FIR_SLAB = create("fir_slab");
    public static final BlockItemId HEMLOCK_SLAB = create("hemlock_slab");
    public static final BlockItemId LARCH_SLAB = create("larch_slab");
    public static final BlockItemId PINE_SLAB = create("pine_slab");
    public static final BlockItemId REDWOOD_SLAB = create("redwood_slab");
    public static final BlockItemId SEQUOIA_SLAB = create("sequoia_slab");
    
    public static final BlockItemId CEDAR_FENCE = create("cedar_fence");
    public static final BlockItemId FIR_FENCE = create("fir_fence");
    public static final BlockItemId HEMLOCK_FENCE = create("hemlock_fence");
    public static final BlockItemId LARCH_FENCE = create("larch_fence");
    public static final BlockItemId PINE_FENCE = create("pine_fence");
    public static final BlockItemId REDWOOD_FENCE = create("redwood_fence");
    public static final BlockItemId SEQUOIA_FENCE = create("sequoia_fence");
    
    public static final BlockItemId CEDAR_FENCE_GATE = create("cedar_fence_gate");
    public static final BlockItemId FIR_FENCE_GATE = create("fir_fence_gate");
    public static final BlockItemId HEMLOCK_FENCE_GATE = create("hemlock_fence_gate");
    public static final BlockItemId LARCH_FENCE_GATE = create("larch_fence_gate");
    public static final BlockItemId PINE_FENCE_GATE = create("pine_fence_gate");
    public static final BlockItemId REDWOOD_FENCE_GATE = create("redwood_fence_gate");
    public static final BlockItemId SEQUOIA_FENCE_GATE = create("sequoia_fence_gate");
    
    public static final BlockItemId CEDAR_DOOR = create("cedar_door");
    public static final BlockItemId FIR_DOOR = create("fir_door");
    public static final BlockItemId HEMLOCK_DOOR = create("hemlock_door");
    public static final BlockItemId LARCH_DOOR = create("larch_door");
    public static final BlockItemId PINE_DOOR = create("pine_door");
    public static final BlockItemId REDWOOD_DOOR = create("redwood_door");
    public static final BlockItemId SEQUOIA_DOOR = create("sequoia_door");
    
    public static final BlockItemId CEDAR_TRAPDOOR = create("cedar_trapdoor");
    public static final BlockItemId FIR_TRAPDOOR = create("fir_trapdoor");
    public static final BlockItemId HEMLOCK_TRAPDOOR = create("hemlock_trapdoor");
    public static final BlockItemId LARCH_TRAPDOOR = create("larch_trapdoor");
    public static final BlockItemId PINE_TRAPDOOR = create("pine_trapdoor");
    public static final BlockItemId REDWOOD_TRAPDOOR = create("redwood_trapdoor");
    public static final BlockItemId SEQUOIA_TRAPDOOR = create("sequoia_trapdoor");
    
    public static final BlockItemId CEDAR_BUTTON = create("cedar_button");
    public static final BlockItemId FIR_BUTTON = create("fir_button");
    public static final BlockItemId HEMLOCK_BUTTON = create("hemlock_button");
    public static final BlockItemId LARCH_BUTTON = create("larch_button");
    public static final BlockItemId PINE_BUTTON = create("pine_button");
    public static final BlockItemId REDWOOD_BUTTON = create("redwood_button");
    public static final BlockItemId SEQUOIA_BUTTON = create("sequoia_button");
    
    public static final BlockItemId CEDAR_PRESSURE_PLATE = create("cedar_pressure_plate");
    public static final BlockItemId FIR_PRESSURE_PLATE = create("fir_pressure_plate");
    public static final BlockItemId HEMLOCK_PRESSURE_PLATE = create("hemlock_pressure_plate");
    public static final BlockItemId LARCH_PRESSURE_PLATE = create("larch_pressure_plate");
    public static final BlockItemId PINE_PRESSURE_PLATE = create("pine_pressure_plate");
    public static final BlockItemId REDWOOD_PRESSURE_PLATE = create("redwood_pressure_plate");
    public static final BlockItemId SEQUOIA_PRESSURE_PLATE = create("sequoia_pressure_plate");
    
    public static final BlockItemId CEDAR_SIGN = create("cedar_sign");
    public static final BlockItemId FIR_SIGN = create("fir_sign");
    public static final BlockItemId HEMLOCK_SIGN = create("hemlock_sign");
    public static final BlockItemId LARCH_SIGN = create("larch_sign");
    public static final BlockItemId PINE_SIGN = create("pine_sign");
    public static final BlockItemId REDWOOD_SIGN = create("redwood_sign");
    public static final BlockItemId SEQUOIA_SIGN = create("sequoia_sign");
    
    public static final BlockItemId CEDAR_HANGING_SIGN = create("cedar_hanging_sign");
    public static final BlockItemId FIR_HANGING_SIGN = create("fir_hanging_sign");
    public static final BlockItemId HEMLOCK_HANGING_SIGN = create("hemlock_hanging_sign");
    public static final BlockItemId LARCH_HANGING_SIGN = create("larch_hanging_sign");
    public static final BlockItemId PINE_HANGING_SIGN = create("pine_hanging_sign");
    public static final BlockItemId REDWOOD_HANGING_SIGN = create("redwood_hanging_sign");
    public static final BlockItemId SEQUOIA_HANGING_SIGN = create("sequoia_hanging_sign");
    
    public static final BlockItemId CEDAR_SHELF = create("cedar_shelf");
    public static final BlockItemId FIR_SHELF = create("fir_shelf");
    public static final BlockItemId HEMLOCK_SHELF = create("hemlock_shelf");
    public static final BlockItemId LARCH_SHELF = create("larch_shelf");
    public static final BlockItemId PINE_SHELF = create("pine_shelf");
    public static final BlockItemId REDWOOD_SHELF = create("redwood_shelf");
    public static final BlockItemId SEQUOIA_SHELF = create("sequoia_shelf");

    public static final BlockItemId CEDAR_LEAVES = create("cedar_leaves");
    public static final BlockItemId FIR_LEAVES = create("fir_leaves");
    public static final BlockItemId HEMLOCK_LEAVES = create("hemlock_leaves");
    public static final BlockItemId LARCH_LEAVES = create("larch_leaves");
    public static final BlockItemId PINE_LEAVES = create("pine_leaves");
    public static final BlockItemId REDWOOD_LEAVES = create("redwood_leaves");
    public static final BlockItemId SEQUOIA_LEAVES = create("sequoia_leaves");

    public static final BlockItemId CEDAR_SAPLING = create("cedar_sapling");
    public static final BlockItemId FIR_SAPLING = create("fir_sapling");
    public static final BlockItemId HEMLOCK_SAPLING = create("hemlock_sapling");
    public static final BlockItemId LARCH_SAPLING = create("larch_sapling");
    public static final BlockItemId PINE_SAPLING = create("pine_sapling");
    public static final BlockItemId REDWOOD_SAPLING = create("redwood_sapling");
    public static final BlockItemId SEQUOIA_SAPLING = create("sequoia_sapling");

    public static final BlockItemId WHITE_SAND = create("white_sand");
    public static final BlockItemId WHITE_SANDSTONE = create("white_sandstone");
    public static final BlockItemId WHITE_SANDSTONE_SLAB = create("white_sandstone_slab");
    public static final BlockItemId WHITE_SANDSTONE_STAIRS = create("white_sandstone_stairs");
    public static final BlockItemId WHITE_SANDSTONE_WALL = create("white_sandstone_wall");
    public static final BlockItemId CUT_WHITE_SANDSTONE = create("cut_white_sandstone");
    public static final BlockItemId CUT_WHITE_SANDSTONE_SLAB = create("cut_white_sandstone_slab");
    public static final BlockItemId SMOOTH_WHITE_SANDSTONE = create("smooth_white_sandstone");
    public static final BlockItemId SMOOTH_WHITE_SANDSTONE_SLAB = create("smooth_white_sandstone_slab");
    public static final BlockItemId SMOOTH_WHITE_SANDSTONE_STAIRS = create("smooth_white_sandstone_stairs");
    public static final BlockItemId CHISELED_WHITE_SANDSTONE = create("chiseled_white_sandstone");

    public static final BlockItemId PERMAFROST = create("permafrost");
    public static final BlockItemId SHORT_FROSTED_GRASS = create("short_frosted_grass");
    public static final BlockItemId TALL_FROSTED_GRASS = create("tall_frosted_grass");
    public static final BlockItemId SHORT_TUNDRA_GRASS = create("short_tundra_grass");
    public static final BlockItemId TALL_TUNDRA_GRASS = create("tall_tundra_grass");

    //` ---------------------------------------------------------------------------------------------------------------------------------------

    public static BlockItemId create(final String name) {
        Identifier id = Identifier.fromNamespaceAndPath(AWorldReimagined.MOD_ID, name);
        return create(id, id);
    }

    public static BlockItemId create(final Identifier blockId, final Identifier itemId) {
        return new BlockItemId(ResourceKey.create(Registries.BLOCK, blockId), ResourceKey.create(Registries.ITEM, itemId));
    }
}
*/
