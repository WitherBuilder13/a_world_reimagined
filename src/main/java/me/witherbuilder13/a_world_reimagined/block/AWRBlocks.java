/*
package me.witherbuilder13.a_world_reimagined.block;

import me.witherbuilder13.a_world_reimagined.block.util.AWRBlockFamilies;
import me.witherbuilder13.a_world_reimagined.block.util.AWRBlockSetTypes;
import me.witherbuilder13.a_world_reimagined.block.util.AWRTreeGrowers;
import me.witherbuilder13.a_world_reimagined.block.util.AWRWoodTypes;
import me.witherbuilder13.a_world_reimagined.references.AWRBlockIds;
import me.witherbuilder13.a_world_reimagined.references.AWRBlockItemIds;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.ColorRGBA;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

import java.util.function.Function;

import static net.minecraft.world.level.block.state.BlockBehaviour.Properties.ofFullCopy;

public class AWRBlocks {

    public static final Block CEDAR_LOG = logBlock(AWRBlockItemIds.CEDAR_LOG);
    public static final Block FIR_LOG = logBlock(AWRBlockItemIds.FIR_LOG);
    public static final Block HEMLOCK_LOG = logBlock(AWRBlockItemIds.HEMLOCK_LOG);
    public static final Block LARCH_LOG = logBlock(AWRBlockItemIds.LARCH_LOG);
    public static final Block PINE_LOG = logBlock(AWRBlockItemIds.PINE_LOG);
    public static final Block REDWOOD_LOG = logBlock(AWRBlockItemIds.REDWOOD_LOG);
    public static final Block SEQUOIA_LOG = logBlock(AWRBlockItemIds.SEQUOIA_LOG);

    public static final Block CEDAR_WOOD = logBlock(AWRBlockItemIds.CEDAR_WOOD);
    public static final Block FIR_WOOD = logBlock(AWRBlockItemIds.FIR_WOOD);
    public static final Block HEMLOCK_WOOD = logBlock(AWRBlockItemIds.HEMLOCK_WOOD);
    public static final Block LARCH_WOOD = logBlock(AWRBlockItemIds.LARCH_WOOD);
    public static final Block PINE_WOOD = logBlock(AWRBlockItemIds.PINE_WOOD);
    public static final Block REDWOOD_WOOD = logBlock(AWRBlockItemIds.REDWOOD_WOOD);
    public static final Block SEQUOIA_WOOD = logBlock(AWRBlockItemIds.SEQUOIA_WOOD);

    public static final Block STRIPPED_CEDAR_LOG = logBlock(AWRBlockItemIds.STRIPPED_CEDAR_LOG);
    public static final Block STRIPPED_FIR_LOG = logBlock(AWRBlockItemIds.STRIPPED_FIR_LOG);
    public static final Block STRIPPED_HEMLOCK_LOG = logBlock(AWRBlockItemIds.STRIPPED_HEMLOCK_LOG);
    public static final Block STRIPPED_LARCH_LOG = logBlock(AWRBlockItemIds.STRIPPED_LARCH_LOG);
    public static final Block STRIPPED_PINE_LOG = logBlock(AWRBlockItemIds.STRIPPED_PINE_LOG);
    public static final Block STRIPPED_REDWOOD_LOG = logBlock(AWRBlockItemIds.STRIPPED_REDWOOD_LOG);
    public static final Block STRIPPED_SEQUOIA_LOG = logBlock(AWRBlockItemIds.STRIPPED_SEQUOIA_LOG);

    public static final Block STRIPPED_CEDAR_WOOD = logBlock(AWRBlockItemIds.STRIPPED_CEDAR_WOOD);
    public static final Block STRIPPED_FIR_WOOD = logBlock(AWRBlockItemIds.STRIPPED_FIR_WOOD);
    public static final Block STRIPPED_HEMLOCK_WOOD = logBlock(AWRBlockItemIds.STRIPPED_HEMLOCK_WOOD);
    public static final Block STRIPPED_LARCH_WOOD = logBlock(AWRBlockItemIds.STRIPPED_LARCH_WOOD);
    public static final Block STRIPPED_PINE_WOOD = logBlock(AWRBlockItemIds.STRIPPED_PINE_WOOD);
    public static final Block STRIPPED_REDWOOD_WOOD = logBlock(AWRBlockItemIds.STRIPPED_REDWOOD_WOOD);
    public static final Block STRIPPED_SEQUOIA_WOOD = logBlock(AWRBlockItemIds.STRIPPED_SEQUOIA_WOOD);

    public static final Block CEDAR_PLANKS = planksBlock(AWRBlockItemIds.CEDAR_PLANKS);
    public static final Block FIR_PLANKS = planksBlock(AWRBlockItemIds.FIR_PLANKS);
    public static final Block HEMLOCK_PLANKS = planksBlock(AWRBlockItemIds.HEMLOCK_PLANKS);
    public static final Block LARCH_PLANKS = planksBlock(AWRBlockItemIds.LARCH_PLANKS);
    public static final Block PINE_PLANKS = planksBlock(AWRBlockItemIds.PINE_PLANKS);
    public static final Block REDWOOD_PLANKS = planksBlock(AWRBlockItemIds.REDWOOD_PLANKS);
    public static final Block SEQUOIA_PLANKS = planksBlock(AWRBlockItemIds.SEQUOIA_PLANKS);

    public static final Block CEDAR_STAIRS = registerStair(AWRBlockItemIds.CEDAR_STAIRS, CEDAR_PLANKS);
    public static final Block FIR_STAIRS = registerStair(AWRBlockItemIds.FIR_STAIRS, FIR_PLANKS);
    public static final Block HEMLOCK_STAIRS = registerStair(AWRBlockItemIds.HEMLOCK_STAIRS, HEMLOCK_PLANKS);
    public static final Block LARCH_STAIRS = registerStair(AWRBlockItemIds.LARCH_STAIRS, LARCH_PLANKS);
    public static final Block PINE_STAIRS = registerStair(AWRBlockItemIds.PINE_STAIRS, PINE_PLANKS);
    public static final Block REDWOOD_STAIRS = registerStair(AWRBlockItemIds.REDWOOD_STAIRS, REDWOOD_PLANKS);
    public static final Block SEQUOIA_STAIRS = registerStair(AWRBlockItemIds.SEQUOIA_STAIRS, SEQUOIA_PLANKS);

    public static final Block CEDAR_SLAB = slabBlock(AWRBlockItemIds.CEDAR_SLAB);
    public static final Block FIR_SLAB = slabBlock(AWRBlockItemIds.FIR_SLAB);
    public static final Block HEMLOCK_SLAB = slabBlock(AWRBlockItemIds.HEMLOCK_SLAB);
    public static final Block LARCH_SLAB = slabBlock(AWRBlockItemIds.LARCH_SLAB);
    public static final Block PINE_SLAB = slabBlock(AWRBlockItemIds.PINE_SLAB);
    public static final Block REDWOOD_SLAB = slabBlock(AWRBlockItemIds.REDWOOD_SLAB);
    public static final Block SEQUOIA_SLAB = slabBlock(AWRBlockItemIds.SEQUOIA_SLAB);

    public static final Block CEDAR_FENCE = fenceBlock(AWRBlockItemIds.CEDAR_FENCE);
    public static final Block FIR_FENCE = fenceBlock(AWRBlockItemIds.FIR_FENCE);
    public static final Block HEMLOCK_FENCE = fenceBlock(AWRBlockItemIds.HEMLOCK_FENCE);
    public static final Block LARCH_FENCE = fenceBlock(AWRBlockItemIds.LARCH_FENCE);
    public static final Block PINE_FENCE = fenceBlock(AWRBlockItemIds.PINE_FENCE);
    public static final Block REDWOOD_FENCE = fenceBlock(AWRBlockItemIds.REDWOOD_FENCE);
    public static final Block SEQUOIA_FENCE = fenceBlock(AWRBlockItemIds.SEQUOIA_FENCE);

    public static final Block CEDAR_FENCE_GATE = fenceGateBlock(AWRBlockItemIds.CEDAR_FENCE_GATE, AWRWoodTypes.CEDAR);
    public static final Block FIR_FENCE_GATE = fenceGateBlock(AWRBlockItemIds.FIR_FENCE_GATE, AWRWoodTypes.FIR);
    public static final Block HEMLOCK_FENCE_GATE = fenceGateBlock(AWRBlockItemIds.HEMLOCK_FENCE_GATE, AWRWoodTypes.HEMLOCK);
    public static final Block LARCH_FENCE_GATE = fenceGateBlock(AWRBlockItemIds.LARCH_FENCE_GATE, AWRWoodTypes.LARCH);
    public static final Block PINE_FENCE_GATE = fenceGateBlock(AWRBlockItemIds.PINE_FENCE_GATE, AWRWoodTypes.PINE);
    public static final Block REDWOOD_FENCE_GATE = fenceGateBlock(AWRBlockItemIds.REDWOOD_FENCE_GATE, AWRWoodTypes.REDWOOD);
    public static final Block SEQUOIA_FENCE_GATE = fenceGateBlock(AWRBlockItemIds.SEQUOIA_FENCE_GATE, AWRWoodTypes.SEQUOIA);

    public static final Block CEDAR_DOOR = doorBlock(AWRBlockItemIds.CEDAR_DOOR, AWRBlockSetTypes.CEDAR);
    public static final Block FIR_DOOR = doorBlock(AWRBlockItemIds.FIR_DOOR, AWRBlockSetTypes.FIR);
    public static final Block HEMLOCK_DOOR = doorBlock(AWRBlockItemIds.HEMLOCK_DOOR, AWRBlockSetTypes.HEMLOCK);
    public static final Block LARCH_DOOR = doorBlock(AWRBlockItemIds.LARCH_DOOR, AWRBlockSetTypes.LARCH);
    public static final Block PINE_DOOR = doorBlock(AWRBlockItemIds.PINE_DOOR, AWRBlockSetTypes.PINE);
    public static final Block REDWOOD_DOOR = doorBlock(AWRBlockItemIds.REDWOOD_DOOR, AWRBlockSetTypes.REDWOOD);
    public static final Block SEQUOIA_DOOR = doorBlock(AWRBlockItemIds.SEQUOIA_DOOR, AWRBlockSetTypes.SEQUOIA);

    public static final Block CEDAR_TRAPDOOR = trapdoorBlock(AWRBlockItemIds.CEDAR_TRAPDOOR, AWRBlockSetTypes.CEDAR);
    public static final Block FIR_TRAPDOOR = trapdoorBlock(AWRBlockItemIds.FIR_TRAPDOOR, AWRBlockSetTypes.FIR);
    public static final Block HEMLOCK_TRAPDOOR = trapdoorBlock(AWRBlockItemIds.HEMLOCK_TRAPDOOR, AWRBlockSetTypes.HEMLOCK);
    public static final Block LARCH_TRAPDOOR = trapdoorBlock(AWRBlockItemIds.LARCH_TRAPDOOR, AWRBlockSetTypes.LARCH);
    public static final Block PINE_TRAPDOOR = trapdoorBlock(AWRBlockItemIds.PINE_TRAPDOOR, AWRBlockSetTypes.PINE);
    public static final Block REDWOOD_TRAPDOOR = trapdoorBlock(AWRBlockItemIds.REDWOOD_TRAPDOOR, AWRBlockSetTypes.REDWOOD);
    public static final Block SEQUOIA_TRAPDOOR = trapdoorBlock(AWRBlockItemIds.SEQUOIA_TRAPDOOR, AWRBlockSetTypes.SEQUOIA);

    public static final Block CEDAR_PRESSURE_PLATE = pressurePlateBlock(AWRBlockItemIds.CEDAR_PRESSURE_PLATE, AWRBlockSetTypes.CEDAR);
    public static final Block FIR_PRESSURE_PLATE = pressurePlateBlock(AWRBlockItemIds.FIR_PRESSURE_PLATE, AWRBlockSetTypes.FIR);
    public static final Block HEMLOCK_PRESSURE_PLATE = pressurePlateBlock(AWRBlockItemIds.HEMLOCK_PRESSURE_PLATE, AWRBlockSetTypes.HEMLOCK);
    public static final Block LARCH_PRESSURE_PLATE = pressurePlateBlock(AWRBlockItemIds.LARCH_PRESSURE_PLATE, AWRBlockSetTypes.LARCH);
    public static final Block PINE_PRESSURE_PLATE = pressurePlateBlock(AWRBlockItemIds.PINE_PRESSURE_PLATE, AWRBlockSetTypes.PINE);
    public static final Block REDWOOD_PRESSURE_PLATE = pressurePlateBlock(AWRBlockItemIds.REDWOOD_PRESSURE_PLATE, AWRBlockSetTypes.REDWOOD);
    public static final Block SEQUOIA_PRESSURE_PLATE = pressurePlateBlock(AWRBlockItemIds.SEQUOIA_PRESSURE_PLATE, AWRBlockSetTypes.SEQUOIA);

    public static final Block CEDAR_BUTTON = buttonBlock(AWRBlockItemIds.CEDAR_BUTTON, AWRBlockSetTypes.CEDAR);
    public static final Block FIR_BUTTON = buttonBlock(AWRBlockItemIds.FIR_BUTTON, AWRBlockSetTypes.FIR);
    public static final Block HEMLOCK_BUTTON = buttonBlock(AWRBlockItemIds.HEMLOCK_BUTTON, AWRBlockSetTypes.HEMLOCK);
    public static final Block LARCH_BUTTON = buttonBlock(AWRBlockItemIds.LARCH_BUTTON, AWRBlockSetTypes.LARCH);
    public static final Block PINE_BUTTON = buttonBlock(AWRBlockItemIds.PINE_BUTTON, AWRBlockSetTypes.PINE);
    public static final Block REDWOOD_BUTTON = buttonBlock(AWRBlockItemIds.REDWOOD_BUTTON, AWRBlockSetTypes.REDWOOD);
    public static final Block SEQUOIA_BUTTON = buttonBlock(AWRBlockItemIds.SEQUOIA_BUTTON, AWRBlockSetTypes.SEQUOIA);

    public static final Block CEDAR_SIGN = signBlock(AWRBlockItemIds.CEDAR_SIGN, AWRWoodTypes.CEDAR);
    public static final Block FIR_SIGN = signBlock(AWRBlockItemIds.FIR_SIGN, AWRWoodTypes.FIR);
    public static final Block HEMLOCK_SIGN = signBlock(AWRBlockItemIds.HEMLOCK_SIGN, AWRWoodTypes.HEMLOCK);
    public static final Block LARCH_SIGN = signBlock(AWRBlockItemIds.LARCH_SIGN, AWRWoodTypes.LARCH);
    public static final Block PINE_SIGN = signBlock(AWRBlockItemIds.PINE_SIGN, AWRWoodTypes.PINE);
    public static final Block REDWOOD_SIGN = signBlock(AWRBlockItemIds.REDWOOD_SIGN, AWRWoodTypes.REDWOOD);
    public static final Block SEQUOIA_SIGN = signBlock(AWRBlockItemIds.SEQUOIA_SIGN, AWRWoodTypes.SEQUOIA);

    public static final Block CEDAR_WALL_SIGN = wallSignBlock(AWRBlockIds.CEDAR_WALL_SIGN, AWRWoodTypes.CEDAR, CEDAR_SIGN);
    public static final Block FIR_WALL_SIGN = wallSignBlock(AWRBlockIds.FIR_WALL_SIGN, AWRWoodTypes.FIR, FIR_SIGN);
    public static final Block HEMLOCK_WALL_SIGN = wallSignBlock(AWRBlockIds.HEMLOCK_WALL_SIGN, AWRWoodTypes.HEMLOCK, HEMLOCK_SIGN);
    public static final Block LARCH_WALL_SIGN = wallSignBlock(AWRBlockIds.LARCH_WALL_SIGN, AWRWoodTypes.LARCH, LARCH_SIGN);
    public static final Block PINE_WALL_SIGN = wallSignBlock(AWRBlockIds.PINE_WALL_SIGN, AWRWoodTypes.PINE, PINE_SIGN);
    public static final Block REDWOOD_WALL_SIGN = wallSignBlock(AWRBlockIds.REDWOOD_WALL_SIGN, AWRWoodTypes.REDWOOD, REDWOOD_SIGN);
    public static final Block SEQUOIA_WALL_SIGN = wallSignBlock(AWRBlockIds.SEQUOIA_WALL_SIGN, AWRWoodTypes.SEQUOIA, SEQUOIA_SIGN);

    public static final Block CEDAR_HANGING_SIGN = hangingSignBlock(AWRBlockItemIds.CEDAR_HANGING_SIGN, AWRWoodTypes.CEDAR);
    public static final Block FIR_HANGING_SIGN = hangingSignBlock(AWRBlockItemIds.FIR_HANGING_SIGN, AWRWoodTypes.FIR);
    public static final Block HEMLOCK_HANGING_SIGN = hangingSignBlock(AWRBlockItemIds.HEMLOCK_HANGING_SIGN, AWRWoodTypes.HEMLOCK);
    public static final Block LARCH_HANGING_SIGN = hangingSignBlock(AWRBlockItemIds.LARCH_HANGING_SIGN, AWRWoodTypes.LARCH);
    public static final Block PINE_HANGING_SIGN = hangingSignBlock(AWRBlockItemIds.PINE_HANGING_SIGN, AWRWoodTypes.PINE);
    public static final Block REDWOOD_HANGING_SIGN = hangingSignBlock(AWRBlockItemIds.REDWOOD_HANGING_SIGN, AWRWoodTypes.REDWOOD);
    public static final Block SEQUOIA_HANGING_SIGN = hangingSignBlock(AWRBlockItemIds.SEQUOIA_HANGING_SIGN, AWRWoodTypes.SEQUOIA);

    public static final Block CEDAR_WALL_HANGING_SIGN = wallHangingSignBlock(AWRBlockIds.CEDAR_WALL_HANGING_SIGN, AWRWoodTypes.CEDAR, CEDAR_HANGING_SIGN);
    public static final Block FIR_WALL_HANGING_SIGN = wallHangingSignBlock(AWRBlockIds.FIR_WALL_HANGING_SIGN, AWRWoodTypes.FIR, FIR_HANGING_SIGN);
    public static final Block HEMLOCK_WALL_HANGING_SIGN = wallHangingSignBlock(AWRBlockIds.HEMLOCK_WALL_HANGING_SIGN, AWRWoodTypes.HEMLOCK, HEMLOCK_HANGING_SIGN);
    public static final Block LARCH_WALL_HANGING_SIGN = wallHangingSignBlock(AWRBlockIds.LARCH_WALL_HANGING_SIGN, AWRWoodTypes.LARCH, LARCH_HANGING_SIGN);
    public static final Block PINE_WALL_HANGING_SIGN = wallHangingSignBlock(AWRBlockIds.PINE_WALL_HANGING_SIGN, AWRWoodTypes.PINE, PINE_HANGING_SIGN);
    public static final Block REDWOOD_WALL_HANGING_SIGN = wallHangingSignBlock(AWRBlockIds.REDWOOD_WALL_HANGING_SIGN, AWRWoodTypes.REDWOOD, REDWOOD_HANGING_SIGN);
    public static final Block SEQUOIA_WALL_HANGING_SIGN = wallHangingSignBlock(AWRBlockIds.SEQUOIA_WALL_HANGING_SIGN, AWRWoodTypes.SEQUOIA, SEQUOIA_HANGING_SIGN);

    public static final Block CEDAR_SHELF = shelfBlock(AWRBlockItemIds.CEDAR_SHELF);
    public static final Block FIR_SHELF = shelfBlock(AWRBlockItemIds.FIR_SHELF);
    public static final Block HEMLOCK_SHELF = shelfBlock(AWRBlockItemIds.HEMLOCK_SHELF);
    public static final Block LARCH_SHELF = shelfBlock(AWRBlockItemIds.LARCH_SHELF);
    public static final Block PINE_SHELF = shelfBlock(AWRBlockItemIds.PINE_SHELF);
    public static final Block REDWOOD_SHELF = shelfBlock(AWRBlockItemIds.REDWOOD_SHELF);
    public static final Block SEQUOIA_SHELF = shelfBlock(AWRBlockItemIds.SEQUOIA_SHELF);

    public static final Block CEDAR_LEAVES = leavesBlock(AWRBlockItemIds.CEDAR_LEAVES);
    public static final Block FIR_LEAVES = leavesBlock(AWRBlockItemIds.FIR_LEAVES);
    public static final Block HEMLOCK_LEAVES = leavesBlock(AWRBlockItemIds.HEMLOCK_LEAVES);
    public static final Block LARCH_LEAVES = leavesBlock(AWRBlockItemIds.LARCH_LEAVES);
    public static final Block PINE_LEAVES = leavesBlock(AWRBlockItemIds.PINE_LEAVES);
    public static final Block REDWOOD_LEAVES = leavesBlock(AWRBlockItemIds.REDWOOD_LEAVES);
    public static final Block SEQUOIA_LEAVES = leavesBlock(AWRBlockItemIds.SEQUOIA_LEAVES);

    public static final Block CEDAR_SAPLING = saplingBlock(AWRBlockItemIds.CEDAR_SAPLING, AWRTreeGrowers.CEDAR);
    public static final Block FIR_SAPLING = saplingBlock(AWRBlockItemIds.FIR_SAPLING, AWRTreeGrowers.FIR);
    public static final Block HEMLOCK_SAPLING = saplingBlock(AWRBlockItemIds.HEMLOCK_SAPLING, AWRTreeGrowers.HEMLOCK);
    public static final Block LARCH_SAPLING = saplingBlock(AWRBlockItemIds.LARCH_SAPLING, AWRTreeGrowers.LARCH);
    public static final Block PINE_SAPLING = saplingBlock(AWRBlockItemIds.PINE_SAPLING, AWRTreeGrowers.PINE);
    public static final Block REDWOOD_SAPLING = register(
            AWRBlockItemIds.REDWOOD_SAPLING, p -> new GiantSaplingBlock(AWRTreeGrowers.REDWOOD, p), ofFullCopy(Blocks.SPRUCE_SAPLING)
    );
    public static final Block SEQUOIA_SAPLING = register(
            AWRBlockItemIds.SEQUOIA_SAPLING, p -> new GiantSaplingBlock(AWRTreeGrowers.SEQUOIA, p), ofFullCopy(Blocks.SPRUCE_SAPLING)
    );
    
    public static final Block POTTED_CEDAR_SAPLING = pottedSaplingBlock(AWRBlockIds.POTTED_CEDAR_SAPLING, CEDAR_SAPLING);
    public static final Block POTTED_FIR_SAPLING = pottedSaplingBlock(AWRBlockIds.POTTED_FIR_SAPLING, FIR_SAPLING);
    public static final Block POTTED_HEMLOCK_SAPLING = pottedSaplingBlock(AWRBlockIds.POTTED_HEMLOCK_SAPLING, HEMLOCK_SAPLING);
    public static final Block POTTED_LARCH_SAPLING = pottedSaplingBlock(AWRBlockIds.POTTED_LARCH_SAPLING, LARCH_SAPLING);
    public static final Block POTTED_PINE_SAPLING = pottedSaplingBlock(AWRBlockIds.POTTED_PINE_SAPLING, PINE_SAPLING);
    public static final Block POTTED_REDWOOD_SAPLING = pottedSaplingBlock(AWRBlockIds.POTTED_REDWOOD_SAPLING, REDWOOD_SAPLING);
    public static final Block POTTED_SEQUOIA_SAPLING = pottedSaplingBlock(AWRBlockIds.POTTED_SEQUOIA_SAPLING, SEQUOIA_SAPLING);

    public static final Block WHITE_SAND = gravityBlock(AWRBlockItemIds.WHITE_SAND, ofFullCopy(Blocks.SAND), 13232621);
    public static final Block WHITE_SANDSTONE = register(AWRBlockItemIds.WHITE_SANDSTONE, ofFullCopy(Blocks.SANDSTONE));
    public static final Block WHITE_SANDSTONE_SLAB = register(AWRBlockItemIds.WHITE_SANDSTONE_SLAB, SlabBlock::new, ofFullCopy(Blocks.SANDSTONE_SLAB));
    public static final Block WHITE_SANDSTONE_STAIRS = registerStair(AWRBlockItemIds.WHITE_SANDSTONE_STAIRS, WHITE_SANDSTONE);
    public static final Block WHITE_SANDSTONE_WALL = register(AWRBlockItemIds.WHITE_SANDSTONE_WALL, WallBlock::new, ofFullCopy(Blocks.SANDSTONE_WALL));
    public static final Block CUT_WHITE_SANDSTONE = register(AWRBlockItemIds.CUT_WHITE_SANDSTONE, ofFullCopy(Blocks.CUT_SANDSTONE));
    public static final Block CUT_WHITE_SANDSTONE_SLAB = register(AWRBlockItemIds.CUT_WHITE_SANDSTONE_SLAB, SlabBlock::new, ofFullCopy(Blocks.CUT_SANDSTONE_SLAB));
    public static final Block SMOOTH_WHITE_SANDSTONE = register(AWRBlockItemIds.SMOOTH_WHITE_SANDSTONE, ofFullCopy(Blocks.SMOOTH_SANDSTONE));
    public static final Block SMOOTH_WHITE_SANDSTONE_SLAB = register(AWRBlockItemIds.SMOOTH_WHITE_SANDSTONE_SLAB, SlabBlock::new, ofFullCopy(Blocks.SMOOTH_SANDSTONE_SLAB));
    public static final Block SMOOTH_WHITE_SANDSTONE_STAIRS = registerStair(AWRBlockItemIds.SMOOTH_WHITE_SANDSTONE_STAIRS, SMOOTH_WHITE_SANDSTONE);
    public static final Block CHISELED_WHITE_SANDSTONE = register(AWRBlockItemIds.CHISELED_WHITE_SANDSTONE, ofFullCopy(Blocks.CHISELED_SANDSTONE));

    public static final Block PERMAFROST = register(AWRBlockItemIds.PERMAFROST, ofFullCopy(Blocks.GRASS_BLOCK));
    public static final Block SHORT_FROSTED_GRASS = register(AWRBlockItemIds.SHORT_FROSTED_GRASS, ofFullCopy(Blocks.SHORT_DRY_GRASS));
    public static final Block TALL_FROSTED_GRASS = register(AWRBlockItemIds.TALL_FROSTED_GRASS, ofFullCopy(Blocks.TALL_DRY_GRASS));
    public static final Block SHORT_TUNDRA_GRASS = register(AWRBlockItemIds.SHORT_TUNDRA_GRASS, ofFullCopy(Blocks.SHORT_DRY_GRASS));
    public static final Block TALL_TUNDRA_GRASS = register(AWRBlockItemIds.TALL_TUNDRA_GRASS, ofFullCopy(Blocks.TALL_DRY_GRASS));

    //` ---------------------------------------------------------------------------------------------------------------------------------------

    public static Block logBlock(BlockItemId id) {
        return register(id, RotatedPillarBlock::new, ofFullCopy(Blocks.SPRUCE_LOG));
    }

    public static Block planksBlock(BlockItemId id) {
        return register(id, ofFullCopy(Blocks.SPRUCE_PLANKS));
    }

    public static Block slabBlock(BlockItemId id) {
        return register(id, SlabBlock::new, ofFullCopy(Blocks.SPRUCE_PLANKS));
    }

    public static Block fenceBlock(BlockItemId id) {
        return register(id, FenceBlock::new, ofFullCopy(Blocks.SPRUCE_PLANKS));
    }

    public static Block fenceGateBlock(BlockItemId id, WoodType woodType) {
        return register(id, p -> new FenceGateBlock(woodType, p), ofFullCopy(Blocks.SPRUCE_PLANKS));
    }

    public static Block doorBlock(BlockItemId id, BlockSetType blockSetType) {
        return register(id, p -> new DoorBlock(blockSetType, p), ofFullCopy(Blocks.SPRUCE_PLANKS));
    }

    public static Block trapdoorBlock(BlockItemId id, BlockSetType blockSetType) {
        return register(id, p -> new TrapDoorBlock(blockSetType, p), ofFullCopy(Blocks.SPRUCE_PLANKS));
    }

    public static Block pressurePlateBlock(BlockItemId id, BlockSetType blockSetType) {
        return register(id, p -> new PressurePlateBlock(blockSetType, p), ofFullCopy(Blocks.SPRUCE_PLANKS));
    }

    public static Block buttonBlock(BlockItemId id, BlockSetType blockSetType) {
        return register(id, p -> new ButtonBlock(blockSetType, 30, p), ofFullCopy(Blocks.SPRUCE_PLANKS));
    }

    public static Block signBlock(BlockItemId id, WoodType woodType) {
        return register(id, p -> new StandingSignBlock(woodType, p), ofFullCopy(Blocks.SPRUCE_SIGN));
    }

    public static Block wallSignBlock(ResourceKey<Block> id, WoodType woodType, Block drops) {
        return registerBlockOnly(id, p -> new WallSignBlock(woodType, p), ofFullCopy(Blocks.SPRUCE_WALL_SIGN).overrideLootTable(drops.getLootTable()));
    }

    public static Block hangingSignBlock(BlockItemId id, WoodType woodType) {
        return register(id, p -> new CeilingHangingSignBlock(woodType, p), ofFullCopy(Blocks.SPRUCE_HANGING_SIGN));
    }

    public static Block wallHangingSignBlock(ResourceKey<Block> id, WoodType woodType, Block drops) {
        return registerBlockOnly(id, p -> new WallSignBlock(woodType, p), ofFullCopy(Blocks.SPRUCE_WALL_SIGN).overrideLootTable(drops.getLootTable()));
    }

    public static Block shelfBlock(BlockItemId id) {
        return register(id, ShelfBlock::new, ofFullCopy(Blocks.SPRUCE_SHELF));
    }

    private static Block leavesBlock(BlockItemId id) {
        return register(id, p -> new TintedParticleLeavesBlock(1.0F, p), Blocks.leavesProperties(SoundType.GRASS));
    }
    
    private static Block saplingBlock(BlockItemId id, TreeGrower treeGrower) {
        return saplingBlock(id, treeGrower, null);
    }
    
    private static Block saplingBlock(BlockItemId id, TreeGrower treeGrower, SoundType soundType) {
        BlockBehaviour.Properties properties = ofFullCopy(Blocks.SPRUCE_SAPLING);

        if (soundType != null)
            properties = properties.sound(soundType);

        return register(id, p -> new SaplingBlock(treeGrower, p), properties);
    }

    private static Block pottedSaplingBlock(ResourceKey<Block> id, Block sapling) {
        return registerBlockOnly(id, p -> new FlowerPotBlock(sapling, p), Blocks.flowerPotProperties());
    }

    private static Block gravityBlock(BlockItemId id, BlockBehaviour.Properties properties, int color) {
        return register(id, p -> new ColoredFallingBlock(new ColorRGBA(color), p), properties);
    }

    //` ---------------------------------------------------------------------------------------------------------------------------------------

    public static Block register(final BlockItemId id, final Function<BlockBehaviour.Properties, Block> factory, final BlockBehaviour.Properties properties) {
        return registerBlockOnly(id.block(), factory, properties);
    }

    public static Block registerBlockOnly(final ResourceKey<Block> id, final Function<BlockBehaviour.Properties, Block> factory, final BlockBehaviour.Properties properties) {
        return Blocks.register(id, factory, properties);
    }

    public static Block register(final BlockItemId id, final BlockBehaviour.Properties properties) {
        return Blocks.register(id.block(), properties);
    }

    public static Block registerStair(final BlockItemId id, final Block base) {
        return register(id, p -> new StairBlock(base.defaultBlockState(), p), BlockBehaviour.Properties.ofFullCopy(base));
    }

    //` ---------------------------------------------------------------------------------------------------------------------------------------

    public static void init() {
        AWRBlockFamilies.init();
        AWRBlockSetTypes.init();
    }
}
*/
