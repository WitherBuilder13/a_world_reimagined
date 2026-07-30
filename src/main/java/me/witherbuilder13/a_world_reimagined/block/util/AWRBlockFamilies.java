package me.witherbuilder13.a_world_reimagined.block.util;

import me.witherbuilder13.a_world_reimagined.block.AWRBlocks;
import net.minecraft.data.BlockFamilies;
import net.minecraft.data.BlockFamily;

import java.util.ArrayList;
import java.util.List;

import static me.witherbuilder13.a_world_reimagined.block.AWRBlocks.*;

public class AWRBlockFamilies {

    public static List<BlockFamily> BLOCK_FAMILIES = new ArrayList<>();

    public static final BlockFamily CEDAR = BlockFamilies.familyBuilder(CEDAR_PLANKS)
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
            .getFamily();

    public static final BlockFamily FIR = BlockFamilies.familyBuilder(FIR_PLANKS)
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
            .getFamily();

    public static final BlockFamily HEMLOCK = BlockFamilies.familyBuilder(HEMLOCK_PLANKS)
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
            .getFamily();

    public static final BlockFamily LARCH = BlockFamilies.familyBuilder(LARCH_PLANKS)
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
            .getFamily();

    public static final BlockFamily PINE = BlockFamilies.familyBuilder(PINE_PLANKS)
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
            .getFamily();

    public static final BlockFamily REDWOOD = BlockFamilies.familyBuilder(REDWOOD_PLANKS)
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
            .getFamily();

    public static final BlockFamily SEQUOIA = BlockFamilies.familyBuilder(SEQUOIA_PLANKS)
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
            .getFamily();

    public static final BlockFamily WHITE_SANDSTONE = BlockFamilies.familyBuilder(AWRBlocks.WHITE_SANDSTONE)
            .stairs(WHITE_SANDSTONE_STAIRS)
            .slab(WHITE_SANDSTONE_SLAB)
            .wall(WHITE_SANDSTONE_WALL)
            .cut(AWRBlocks.CUT_WHITE_SANDSTONE)
            .chiseled(CHISELED_WHITE_SANDSTONE)
            .dontGenerateCraftingRecipe()
            .generateStonecutterRecipe()
            .getFamily();

    public static final BlockFamily CUT_WHITE_SANDSTONE = BlockFamilies.familyBuilder(AWRBlocks.CUT_WHITE_SANDSTONE)
            .slab(CUT_WHITE_SANDSTONE_SLAB)
            .generateStonecutterRecipe()
            .getFamily();

    public static final BlockFamily SMOOTH_WHITE_SANDSTONE = BlockFamilies.familyBuilder(AWRBlocks.SMOOTH_WHITE_SANDSTONE)
            .stairs(SMOOTH_WHITE_SANDSTONE_STAIRS)
            .slab(SMOOTH_WHITE_SANDSTONE_SLAB)
            .generateStonecutterRecipe()
            .getFamily();

    //` -------------------------------------------------------------------------------------------------------------------------

    public static void init() {
        BLOCK_FAMILIES.add(CEDAR);
        BLOCK_FAMILIES.add(HEMLOCK);
        BLOCK_FAMILIES.add(LARCH);
        BLOCK_FAMILIES.add(PINE);
        BLOCK_FAMILIES.add(REDWOOD);
        BLOCK_FAMILIES.add(SEQUOIA);
        BLOCK_FAMILIES.add(WHITE_SANDSTONE);
        BLOCK_FAMILIES.add(CUT_WHITE_SANDSTONE);
        BLOCK_FAMILIES.add(SMOOTH_WHITE_SANDSTONE);
    }
}
