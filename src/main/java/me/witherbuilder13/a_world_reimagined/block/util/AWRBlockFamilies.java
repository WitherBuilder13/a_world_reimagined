package me.witherbuilder13.a_world_reimagined.block.util;

import com.google.common.collect.Maps;
import me.witherbuilder13.a_world_reimagined.block.AWRBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.BlockFamily;
import net.minecraft.world.level.block.Block;

import java.util.Map;
import java.util.stream.Stream;

import static me.witherbuilder13.a_world_reimagined.block.AWRBlocks.*;

public class AWRBlockFamilies {
    
    private static final Map<Block, BlockFamily> MAP = Maps.newHashMap();
    private static final String RECIPE_GROUP_PREFIX_WOODEN = "wooden";
    private static final String RECIPE_UNLOCKED_BY_HAS_PLANKS = "has_planks";
    
    public static final BlockFamily ASPEN = familyBuilder(ASPEN_PLANKS)
            .log(ASPEN_LOG)
            .strippedLog(STRIPPED_ASPEN_LOG)
            .stairs(ASPEN_STAIRS)
            .slab(ASPEN_SLAB)
            .fence(ASPEN_FENCE)
            .fenceGate(ASPEN_FENCE_GATE)
            .door(ASPEN_DOOR)
            .trapdoor(ASPEN_TRAPDOOR)
            .pressurePlate(ASPEN_PRESSURE_PLATE)
            .button(ASPEN_BUTTON)
            .sign(ASPEN_SIGN, ASPEN_WALL_SIGN)
            .hangingSign(ASPEN_HANGING_SIGN, ASPEN_WALL_HANGING_SIGN)
            .recipeGroupPrefix(RECIPE_GROUP_PREFIX_WOODEN)
            .recipeUnlockedBy(RECIPE_UNLOCKED_BY_HAS_PLANKS)
            .getFamily();

    public static final BlockFamily CEDAR = familyBuilder(CEDAR_PLANKS)
            .log(CEDAR_LOG)
            .strippedLog(STRIPPED_CEDAR_LOG)
            .stairs(CEDAR_STAIRS)
            .slab(CEDAR_SLAB)
            .fence(CEDAR_FENCE)
            .fenceGate(CEDAR_FENCE_GATE)
            .door(CEDAR_DOOR)
            .trapdoor(CEDAR_TRAPDOOR)
            .pressurePlate(CEDAR_PRESSURE_PLATE)
            .button(CEDAR_BUTTON)
            .sign(CEDAR_SIGN, CEDAR_WALL_SIGN)
            .hangingSign(CEDAR_HANGING_SIGN, CEDAR_WALL_HANGING_SIGN)
            .recipeGroupPrefix(RECIPE_GROUP_PREFIX_WOODEN)
            .recipeUnlockedBy(RECIPE_UNLOCKED_BY_HAS_PLANKS)
            .getFamily();

    public static final BlockFamily FIR = familyBuilder(FIR_PLANKS)
            .log(FIR_LOG)
            .strippedLog(STRIPPED_FIR_LOG)
            .stairs(FIR_STAIRS)
            .slab(FIR_SLAB)
            .fence(FIR_FENCE)
            .fenceGate(FIR_FENCE_GATE)
            .door(FIR_DOOR)
            .trapdoor(FIR_TRAPDOOR)
            .pressurePlate(FIR_PRESSURE_PLATE)
            .button(FIR_BUTTON)
            .sign(FIR_SIGN, FIR_WALL_SIGN)
            .hangingSign(FIR_HANGING_SIGN, FIR_WALL_HANGING_SIGN)
            .recipeGroupPrefix(RECIPE_GROUP_PREFIX_WOODEN)
            .recipeUnlockedBy(RECIPE_UNLOCKED_BY_HAS_PLANKS)
            .getFamily();

    public static final BlockFamily HEMLOCK = familyBuilder(HEMLOCK_PLANKS)
            .log(HEMLOCK_LOG)
            .strippedLog(STRIPPED_HEMLOCK_LOG)
            .stairs(HEMLOCK_STAIRS)
            .slab(HEMLOCK_SLAB)
            .fence(HEMLOCK_FENCE)
            .fenceGate(HEMLOCK_FENCE_GATE)
            .door(HEMLOCK_DOOR)
            .trapdoor(HEMLOCK_TRAPDOOR)
            .pressurePlate(HEMLOCK_PRESSURE_PLATE)
            .button(HEMLOCK_BUTTON)
            .sign(HEMLOCK_SIGN, HEMLOCK_WALL_SIGN)
            .hangingSign(HEMLOCK_HANGING_SIGN, HEMLOCK_WALL_HANGING_SIGN)
            .recipeGroupPrefix(RECIPE_GROUP_PREFIX_WOODEN)
            .recipeUnlockedBy(RECIPE_UNLOCKED_BY_HAS_PLANKS)
            .getFamily();

    public static final BlockFamily LARCH = familyBuilder(LARCH_PLANKS)
            .log(LARCH_LOG)
            .strippedLog(STRIPPED_LARCH_LOG)
            .stairs(LARCH_STAIRS)
            .slab(LARCH_SLAB)
            .fence(LARCH_FENCE)
            .fenceGate(LARCH_FENCE_GATE)
            .door(LARCH_DOOR)
            .trapdoor(LARCH_TRAPDOOR)
            .pressurePlate(LARCH_PRESSURE_PLATE)
            .button(LARCH_BUTTON)
            .sign(LARCH_SIGN, LARCH_WALL_SIGN)
            .hangingSign(LARCH_HANGING_SIGN, LARCH_WALL_HANGING_SIGN)
            .recipeGroupPrefix(RECIPE_GROUP_PREFIX_WOODEN)
            .recipeUnlockedBy(RECIPE_UNLOCKED_BY_HAS_PLANKS)
            .getFamily();

    public static final BlockFamily PINE = familyBuilder(PINE_PLANKS)
            .log(PINE_LOG)
            .strippedLog(STRIPPED_PINE_LOG)
            .stairs(PINE_STAIRS)
            .slab(PINE_SLAB)
            .fence(PINE_FENCE)
            .fenceGate(PINE_FENCE_GATE)
            .door(PINE_DOOR)
            .trapdoor(PINE_TRAPDOOR)
            .pressurePlate(PINE_PRESSURE_PLATE)
            .button(PINE_BUTTON)
            .sign(PINE_SIGN, PINE_WALL_SIGN)
            .hangingSign(PINE_HANGING_SIGN, PINE_WALL_HANGING_SIGN)
            .recipeGroupPrefix(RECIPE_GROUP_PREFIX_WOODEN)
            .recipeUnlockedBy(RECIPE_UNLOCKED_BY_HAS_PLANKS)
            .getFamily();

    public static final BlockFamily REDWOOD = familyBuilder(REDWOOD_PLANKS)
            .log(REDWOOD_LOG)
            .strippedLog(STRIPPED_REDWOOD_LOG)
            .stairs(REDWOOD_STAIRS)
            .slab(REDWOOD_SLAB)
            .fence(REDWOOD_FENCE)
            .fenceGate(REDWOOD_FENCE_GATE)
            .door(REDWOOD_DOOR)
            .trapdoor(REDWOOD_TRAPDOOR)
            .pressurePlate(REDWOOD_PRESSURE_PLATE)
            .button(REDWOOD_BUTTON)
            .sign(REDWOOD_SIGN, REDWOOD_WALL_SIGN)
            .hangingSign(REDWOOD_HANGING_SIGN, REDWOOD_WALL_HANGING_SIGN)
            .recipeGroupPrefix(RECIPE_GROUP_PREFIX_WOODEN)
            .recipeUnlockedBy(RECIPE_UNLOCKED_BY_HAS_PLANKS)
            .getFamily();

    public static final BlockFamily SEQUOIA = familyBuilder(SEQUOIA_PLANKS)
            .log(SEQUOIA_LOG)
            .strippedLog(STRIPPED_SEQUOIA_LOG)
            .stairs(SEQUOIA_STAIRS)
            .slab(SEQUOIA_SLAB)
            .fence(SEQUOIA_FENCE)
            .fenceGate(SEQUOIA_FENCE_GATE)
            .door(SEQUOIA_DOOR)
            .trapdoor(SEQUOIA_TRAPDOOR)
            .pressurePlate(SEQUOIA_PRESSURE_PLATE)
            .button(SEQUOIA_BUTTON)
            .sign(SEQUOIA_SIGN, SEQUOIA_WALL_SIGN)
            .hangingSign(SEQUOIA_HANGING_SIGN, SEQUOIA_WALL_HANGING_SIGN)
            .recipeGroupPrefix(RECIPE_GROUP_PREFIX_WOODEN)
            .recipeUnlockedBy(RECIPE_UNLOCKED_BY_HAS_PLANKS)
            .getFamily();

    public static final BlockFamily WHITE_SANDSTONE = familyBuilder(AWRBlocks.WHITE_SANDSTONE)
            .stairs(WHITE_SANDSTONE_STAIRS)
            .slab(WHITE_SANDSTONE_SLAB)
            .wall(WHITE_SANDSTONE_WALL)
            .cut(AWRBlocks.CUT_WHITE_SANDSTONE)
            .chiseled(CHISELED_WHITE_SANDSTONE)
            .dontGenerateCraftingRecipe()
            .generateStonecutterRecipe()
            .getFamily();

    public static final BlockFamily CUT_WHITE_SANDSTONE = familyBuilder(AWRBlocks.CUT_WHITE_SANDSTONE)
            .slab(CUT_WHITE_SANDSTONE_SLAB)
            .generateStonecutterRecipe()
            .getFamily();

    public static final BlockFamily SMOOTH_WHITE_SANDSTONE = familyBuilder(AWRBlocks.SMOOTH_WHITE_SANDSTONE)
            .stairs(SMOOTH_WHITE_SANDSTONE_STAIRS)
            .slab(SMOOTH_WHITE_SANDSTONE_SLAB)
            .generateStonecutterRecipe()
            .getFamily();
    
    public static final BlockFamily SNOW_BRICK = familyBuilder(SNOW_BRICKS)
            .stairs(SNOW_BRICK_STAIRS)
            .slab(SNOW_BRICK_SLAB)
            .wall(SNOW_BRICK_WALL)
            .generateStonecutterRecipe()
            .getFamily();
    
    public static final BlockFamily PACKED_ICE_BRICK = familyBuilder(PACKED_ICE_BRICKS)
            .stairs(PACKED_ICE_BRICK_STAIRS)
            .slab(PACKED_ICE_BRICK_SLAB)
            .wall(PACKED_ICE_BRICK_WALL)
            .generateStonecutterRecipe()
            .getFamily();

    //` -------------------------------------------------------------------------------------------------------------------------
    
    public static BlockFamily.Builder familyBuilder(final Block base) {
        BlockFamily.Builder builder = new BlockFamily.Builder(base);
        BlockFamily blockFamily = MAP.put(base, builder.getFamily());
        if (blockFamily != null) {
            throw new IllegalStateException("Duplicate family definition for " + BuiltInRegistries.BLOCK.getKey(base));
        } else {
            return builder;
        }
    }
    
    public static Stream<BlockFamily> getAllFamilies() {
        return MAP.values().stream();
    }

    public static void init() {}
}
