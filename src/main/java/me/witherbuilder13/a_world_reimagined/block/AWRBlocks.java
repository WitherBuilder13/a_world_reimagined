package me.witherbuilder13.a_world_reimagined.block;

import me.witherbuilder13.a_world_reimagined.block.util.AWRBlockFamilies;
import me.witherbuilder13.a_world_reimagined.block.util.AWRBlockSetTypes;
import me.witherbuilder13.a_world_reimagined.block.util.AWRTreeGrowers;
import me.witherbuilder13.a_world_reimagined.block.util.AWRWoodTypes;
import me.witherbuilder13.a_world_reimagined.loot.AWRLootTables;
import me.witherbuilder13.a_world_reimagined.references.AWRBlockIds;
import me.witherbuilder13.a_world_reimagined.references.AWRBlockItemIds;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.ColorRGBA;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntityTypes;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.sounds.AmbientLeavesBlockSoundPlayer;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.phys.AABB;

import java.util.List;
import java.util.function.Function;

import static net.minecraft.world.level.block.Blocks.*;

public class AWRBlocks {
    
    public static final Block ALDER_LOG = register(
            AWRBlockItemIds.ALDER_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_LOG)
    );
    public static final Block ALDER_WOOD = register(
            AWRBlockItemIds.ALDER_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_WOOD)
    );
    public static final Block STRIPPED_ALDER_LOG = register(
            AWRBlockItemIds.STRIPPED_ALDER_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_LOG)
    );
    public static final Block STRIPPED_ALDER_WOOD = register(
            AWRBlockItemIds.STRIPPED_ALDER_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_WOOD)
    );
    public static final Block ALDER_PLANKS = register(
            AWRBlockItemIds.ALDER_PLANKS, BlockBehaviour.Properties.ofFullCopy(BIRCH_PLANKS)
    );
    public static final Block ALDER_STAIRS = registerStair(AWRBlockItemIds.ALDER_STAIRS, ALDER_PLANKS);
    public static final Block ALDER_SLAB = registerSlab(
            AWRBlockItemIds.ALDER_SLAB, ALDER_PLANKS
    );
    public static final Block ALDER_FENCE = register(
            AWRBlockItemIds.ALDER_FENCE, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE)
    );
    public static final Block ALDER_FENCE_GATE = register(
            AWRBlockItemIds.ALDER_FENCE_GATE,
            p -> new FenceGateBlock(AWRWoodTypes.ALDER, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE_GATE)
    );
    public static final Block ALDER_DOOR = register(
            AWRBlockItemIds.ALDER_DOOR,
            p -> new DoorBlock(AWRBlockSetTypes.ALDER, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_DOOR)
    );
    public static final Block ALDER_TRAPDOOR = register(
            AWRBlockItemIds.ALDER_TRAPDOOR,
            p -> new TrapDoorBlock(AWRBlockSetTypes.ALDER, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_TRAPDOOR)
    );
    public static final Block ALDER_PRESSURE_PLATE = register(
            AWRBlockItemIds.ALDER_PRESSURE_PLATE,
            p -> new PressurePlateBlock(AWRBlockSetTypes.ALDER, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_PRESSURE_PLATE)
    );
    public static final Block ALDER_BUTTON = register(
            AWRBlockItemIds.ALDER_BUTTON,
            p -> new ButtonBlock(AWRBlockSetTypes.ALDER, 30, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_BUTTON)
    );
    public static final Block ALDER_SIGN = register(
            AWRBlockItemIds.ALDER_SIGN,
            p -> new StandingSignBlock(AWRWoodTypes.ALDER, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SIGN)
    );
    public static final Block ALDER_WALL_SIGN = register(
            AWRBlockIds.ALDER_WALL_SIGN,
            p -> new WallSignBlock(AWRWoodTypes.ALDER, p), wallVariant(ALDER_SIGN, true)
                    .mapColor(ALDER_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block ALDER_HANGING_SIGN = register(
            AWRBlockItemIds.ALDER_HANGING_SIGN,
            p -> new CeilingHangingSignBlock(AWRWoodTypes.ALDER, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_HANGING_SIGN)
    );
    public static final Block ALDER_WALL_HANGING_SIGN = register(
            AWRBlockIds.ALDER_WALL_HANGING_SIGN,
            p -> new WallHangingSignBlock(AWRWoodTypes.ALDER, p), wallVariant(ALDER_SIGN, true)
                    .mapColor(ALDER_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block ALDER_SHELF = register(
            AWRBlockItemIds.ALDER_SHELF, ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_SHELF)
    );
    public static final Block ALDER_LEAVES = register(
            AWRBlockItemIds.ALDER_LEAVES,
            p -> new TintedParticleLeavesBlock(0.1F, p),
            leavesProperties(SoundType.GRASS)
    );
    public static final Block ALDER_SAPLING = register(
            AWRBlockItemIds.ALDER_SAPLING, p -> new SaplingBlock(TreeGrower.BIRCH, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SAPLING)
    );
    public static final Block POTTED_ALDER_SAPLING = register(
            AWRBlockIds.POTTED_ALDER_SAPLING, p -> new FlowerPotBlock(ALDER_SAPLING, p), flowerPotProperties()
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Block APPLE_LOG = register(
            AWRBlockItemIds.APPLE_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_LOG)
    );
    public static final Block APPLE_WOOD = register(
            AWRBlockItemIds.APPLE_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_WOOD)
    );
    public static final Block STRIPPED_APPLE_LOG = register(
            AWRBlockItemIds.STRIPPED_APPLE_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_LOG)
    );
    public static final Block STRIPPED_APPLE_WOOD = register(
            AWRBlockItemIds.STRIPPED_APPLE_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_WOOD)
    );
    public static final Block APPLE_PLANKS = register(
            AWRBlockItemIds.APPLE_PLANKS, BlockBehaviour.Properties.ofFullCopy(BIRCH_PLANKS)
    );
    public static final Block APPLE_STAIRS = registerStair(AWRBlockItemIds.APPLE_STAIRS, APPLE_PLANKS);
    public static final Block APPLE_SLAB = registerSlab(
            AWRBlockItemIds.APPLE_SLAB, APPLE_PLANKS
    );
    public static final Block APPLE_FENCE = register(
            AWRBlockItemIds.APPLE_FENCE, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE)
    );
    public static final Block APPLE_FENCE_GATE = register(
            AWRBlockItemIds.APPLE_FENCE_GATE,
            p -> new FenceGateBlock(AWRWoodTypes.APPLE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE_GATE)
    );
    public static final Block APPLE_DOOR = register(
            AWRBlockItemIds.APPLE_DOOR,
            p -> new DoorBlock(AWRBlockSetTypes.APPLE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_DOOR)
    );
    public static final Block APPLE_TRAPDOOR = register(
            AWRBlockItemIds.APPLE_TRAPDOOR,
            p -> new TrapDoorBlock(AWRBlockSetTypes.APPLE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_TRAPDOOR)
    );
    public static final Block APPLE_PRESSURE_PLATE = register(
            AWRBlockItemIds.APPLE_PRESSURE_PLATE,
            p -> new PressurePlateBlock(AWRBlockSetTypes.APPLE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_PRESSURE_PLATE)
    );
    public static final Block APPLE_BUTTON = register(
            AWRBlockItemIds.APPLE_BUTTON,
            p -> new ButtonBlock(AWRBlockSetTypes.APPLE, 30, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_BUTTON)
    );
    public static final Block APPLE_SIGN = register(
            AWRBlockItemIds.APPLE_SIGN,
            p -> new StandingSignBlock(AWRWoodTypes.APPLE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SIGN)
    );
    public static final Block APPLE_WALL_SIGN = register(
            AWRBlockIds.APPLE_WALL_SIGN,
            p -> new WallSignBlock(AWRWoodTypes.APPLE, p), wallVariant(APPLE_SIGN, true)
                    .mapColor(APPLE_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block APPLE_HANGING_SIGN = register(
            AWRBlockItemIds.APPLE_HANGING_SIGN,
            p -> new CeilingHangingSignBlock(AWRWoodTypes.APPLE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_HANGING_SIGN)
    );
    public static final Block APPLE_WALL_HANGING_SIGN = register(
            AWRBlockIds.APPLE_WALL_HANGING_SIGN,
            p -> new WallHangingSignBlock(AWRWoodTypes.APPLE, p), wallVariant(APPLE_SIGN, true)
                    .mapColor(APPLE_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block APPLE_SHELF = register(
            AWRBlockItemIds.APPLE_SHELF, ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_SHELF)
    );
    public static final Block APPLE_LEAVES = register(
            AWRBlockItemIds.APPLE_LEAVES,
            p -> new FruitLeavesBlock(0.1F, p, AWRLootTables.HARVEST_APPLE_LEAVES),
            leavesProperties(SoundType.GRASS)
    );
    public static final Block APPLE_SAPLING = register(
            AWRBlockItemIds.APPLE_SAPLING, p -> new SaplingBlock(TreeGrower.OAK, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SAPLING)
    );
    public static final Block POTTED_APPLE_SAPLING = register(
            AWRBlockIds.POTTED_APPLE_SAPLING, p -> new FlowerPotBlock(APPLE_SAPLING, p), flowerPotProperties()
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Block ASPEN_LOG = register(
            AWRBlockItemIds.ASPEN_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_LOG)
    );
    public static final Block ASPEN_WOOD = register(
            AWRBlockItemIds.ASPEN_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_WOOD)
    );
    public static final Block STRIPPED_ASPEN_LOG = register(
            AWRBlockItemIds.STRIPPED_ASPEN_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_LOG)
    );
    public static final Block STRIPPED_ASPEN_WOOD = register(
            AWRBlockItemIds.STRIPPED_ASPEN_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_WOOD)
    );
    public static final Block ASPEN_PLANKS = register(
            AWRBlockItemIds.ASPEN_PLANKS, BlockBehaviour.Properties.ofFullCopy(BIRCH_PLANKS)
    );
    public static final Block ASPEN_STAIRS = registerStair(AWRBlockItemIds.ASPEN_STAIRS, ASPEN_PLANKS);
    public static final Block ASPEN_SLAB = registerSlab(
            AWRBlockItemIds.ASPEN_SLAB, ASPEN_PLANKS
    );
    public static final Block ASPEN_FENCE = register(
            AWRBlockItemIds.ASPEN_FENCE, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE)
    );
    public static final Block ASPEN_FENCE_GATE = register(
            AWRBlockItemIds.ASPEN_FENCE_GATE,
            p -> new FenceGateBlock(AWRWoodTypes.ASPEN, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE_GATE)
    );
    public static final Block ASPEN_DOOR = register(
            AWRBlockItemIds.ASPEN_DOOR,
            p -> new DoorBlock(AWRBlockSetTypes.ASPEN, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_DOOR)
    );
    public static final Block ASPEN_TRAPDOOR = register(
            AWRBlockItemIds.ASPEN_TRAPDOOR,
            p -> new TrapDoorBlock(AWRBlockSetTypes.ASPEN, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_TRAPDOOR)
    );
    public static final Block ASPEN_PRESSURE_PLATE = register(
            AWRBlockItemIds.ASPEN_PRESSURE_PLATE,
            p -> new PressurePlateBlock(AWRBlockSetTypes.ASPEN, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_PRESSURE_PLATE)
    );
    public static final Block ASPEN_BUTTON = register(
            AWRBlockItemIds.ASPEN_BUTTON,
            p -> new ButtonBlock(AWRBlockSetTypes.ASPEN, 30, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_BUTTON)
    );
    public static final Block ASPEN_SIGN = register(
            AWRBlockItemIds.ASPEN_SIGN,
            p -> new StandingSignBlock(AWRWoodTypes.ASPEN, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SIGN)
    );
    public static final Block ASPEN_WALL_SIGN = register(
            AWRBlockIds.ASPEN_WALL_SIGN,
            p -> new WallSignBlock(AWRWoodTypes.ASPEN, p), wallVariant(ASPEN_SIGN, true)
                    .mapColor(ASPEN_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block ASPEN_HANGING_SIGN = register(
            AWRBlockItemIds.ASPEN_HANGING_SIGN,
            p -> new CeilingHangingSignBlock(AWRWoodTypes.ASPEN, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_HANGING_SIGN)
    );
    public static final Block ASPEN_WALL_HANGING_SIGN = register(
            AWRBlockIds.ASPEN_WALL_HANGING_SIGN,
            p -> new WallHangingSignBlock(AWRWoodTypes.ASPEN, p), wallVariant(ASPEN_SIGN, true)
                    .mapColor(ASPEN_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block ASPEN_SHELF = register(
            AWRBlockItemIds.ASPEN_SHELF, ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_SHELF)
    );
    public static final Block ASPEN_LEAVES = register(
            AWRBlockItemIds.ASPEN_LEAVES,
            p -> new UntintedParticleLeavesBlock(0.1F, ParticleTypes.YELLOW_POPLAR_LEAVES, AmbientLeavesBlockSoundPlayer.noAmbientSound(), p),
            leavesProperties(SoundType.GRASS)
    );
    public static final Block ASPEN_SAPLING = register(
            AWRBlockItemIds.ASPEN_SAPLING, p -> new SaplingBlock(AWRTreeGrowers.ASPEN, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SAPLING)
    );
    public static final Block POTTED_ASPEN_SAPLING = register(
            AWRBlockIds.POTTED_ASPEN_SAPLING, p -> new FlowerPotBlock(ASPEN_SAPLING, p), flowerPotProperties()
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Block BAOBAB_LOG = register(
            AWRBlockItemIds.BAOBAB_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_LOG)
    );
    public static final Block BAOBAB_WOOD = register(
            AWRBlockItemIds.BAOBAB_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_WOOD)
    );
    public static final Block STRIPPED_BAOBAB_LOG = register(
            AWRBlockItemIds.STRIPPED_BAOBAB_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_LOG)
    );
    public static final Block STRIPPED_BAOBAB_WOOD = register(
            AWRBlockItemIds.STRIPPED_BAOBAB_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_WOOD)
    );
    public static final Block BAOBAB_PLANKS = register(
            AWRBlockItemIds.BAOBAB_PLANKS, BlockBehaviour.Properties.ofFullCopy(BIRCH_PLANKS)
    );
    public static final Block BAOBAB_STAIRS = registerStair(AWRBlockItemIds.BAOBAB_STAIRS, BAOBAB_PLANKS);
    public static final Block BAOBAB_SLAB = registerSlab(
            AWRBlockItemIds.BAOBAB_SLAB, BAOBAB_PLANKS
    );
    public static final Block BAOBAB_FENCE = register(
            AWRBlockItemIds.BAOBAB_FENCE, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE)
    );
    public static final Block BAOBAB_FENCE_GATE = register(
            AWRBlockItemIds.BAOBAB_FENCE_GATE,
            p -> new FenceGateBlock(AWRWoodTypes.BAOBAB, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE_GATE)
    );
    public static final Block BAOBAB_DOOR = register(
            AWRBlockItemIds.BAOBAB_DOOR,
            p -> new DoorBlock(AWRBlockSetTypes.BAOBAB, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_DOOR)
    );
    public static final Block BAOBAB_TRAPDOOR = register(
            AWRBlockItemIds.BAOBAB_TRAPDOOR,
            p -> new TrapDoorBlock(AWRBlockSetTypes.BAOBAB, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_TRAPDOOR)
    );
    public static final Block BAOBAB_PRESSURE_PLATE = register(
            AWRBlockItemIds.BAOBAB_PRESSURE_PLATE,
            p -> new PressurePlateBlock(AWRBlockSetTypes.BAOBAB, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_PRESSURE_PLATE)
    );
    public static final Block BAOBAB_BUTTON = register(
            AWRBlockItemIds.BAOBAB_BUTTON,
            p -> new ButtonBlock(AWRBlockSetTypes.BAOBAB, 30, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_BUTTON)
    );
    public static final Block BAOBAB_SIGN = register(
            AWRBlockItemIds.BAOBAB_SIGN,
            p -> new StandingSignBlock(AWRWoodTypes.BAOBAB, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SIGN)
    );
    public static final Block BAOBAB_WALL_SIGN = register(
            AWRBlockIds.BAOBAB_WALL_SIGN,
            p -> new WallSignBlock(AWRWoodTypes.BAOBAB, p), wallVariant(BAOBAB_SIGN, true)
                    .mapColor(BAOBAB_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block BAOBAB_HANGING_SIGN = register(
            AWRBlockItemIds.BAOBAB_HANGING_SIGN,
            p -> new CeilingHangingSignBlock(AWRWoodTypes.BAOBAB, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_HANGING_SIGN)
    );
    public static final Block BAOBAB_WALL_HANGING_SIGN = register(
            AWRBlockIds.BAOBAB_WALL_HANGING_SIGN,
            p -> new WallHangingSignBlock(AWRWoodTypes.BAOBAB, p), wallVariant(BAOBAB_SIGN, true)
                    .mapColor(BAOBAB_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block BAOBAB_SHELF = register(
            AWRBlockItemIds.BAOBAB_SHELF, ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_SHELF)
    );
    public static final Block BAOBAB_LEAVES = register(
            AWRBlockItemIds.BAOBAB_LEAVES,
            p -> new TintedParticleLeavesBlock(0.1F, p),
            leavesProperties(SoundType.GRASS)
    );
    public static final Block BAOBAB_SAPLING = register(
            AWRBlockItemIds.BAOBAB_SAPLING, p -> new SaplingBlock(TreeGrower.ACACIA, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SAPLING)
    );
    public static final Block POTTED_BAOBAB_SAPLING = register(
            AWRBlockIds.POTTED_BAOBAB_SAPLING, p -> new FlowerPotBlock(BAOBAB_SAPLING, p), flowerPotProperties()
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Block BEECH_LOG = register(
            AWRBlockItemIds.BEECH_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_LOG)
    );
    public static final Block BEECH_WOOD = register(
            AWRBlockItemIds.BEECH_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_WOOD)
    );
    public static final Block STRIPPED_BEECH_LOG = register(
            AWRBlockItemIds.STRIPPED_BEECH_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_LOG)
    );
    public static final Block STRIPPED_BEECH_WOOD = register(
            AWRBlockItemIds.STRIPPED_BEECH_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_WOOD)
    );
    public static final Block BEECH_PLANKS = register(
            AWRBlockItemIds.BEECH_PLANKS, BlockBehaviour.Properties.ofFullCopy(BIRCH_PLANKS)
    );
    public static final Block BEECH_STAIRS = registerStair(AWRBlockItemIds.BEECH_STAIRS, BEECH_PLANKS);
    public static final Block BEECH_SLAB = registerSlab(
            AWRBlockItemIds.BEECH_SLAB, BEECH_PLANKS
    );
    public static final Block BEECH_FENCE = register(
            AWRBlockItemIds.BEECH_FENCE, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE)
    );
    public static final Block BEECH_FENCE_GATE = register(
            AWRBlockItemIds.BEECH_FENCE_GATE,
            p -> new FenceGateBlock(AWRWoodTypes.BEECH, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE_GATE)
    );
    public static final Block BEECH_DOOR = register(
            AWRBlockItemIds.BEECH_DOOR,
            p -> new DoorBlock(AWRBlockSetTypes.BEECH, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_DOOR)
    );
    public static final Block BEECH_TRAPDOOR = register(
            AWRBlockItemIds.BEECH_TRAPDOOR,
            p -> new TrapDoorBlock(AWRBlockSetTypes.BEECH, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_TRAPDOOR)
    );
    public static final Block BEECH_PRESSURE_PLATE = register(
            AWRBlockItemIds.BEECH_PRESSURE_PLATE,
            p -> new PressurePlateBlock(AWRBlockSetTypes.BEECH, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_PRESSURE_PLATE)
    );
    public static final Block BEECH_BUTTON = register(
            AWRBlockItemIds.BEECH_BUTTON,
            p -> new ButtonBlock(AWRBlockSetTypes.BEECH, 30, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_BUTTON)
    );
    public static final Block BEECH_SIGN = register(
            AWRBlockItemIds.BEECH_SIGN,
            p -> new StandingSignBlock(AWRWoodTypes.BEECH, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SIGN)
    );
    public static final Block BEECH_WALL_SIGN = register(
            AWRBlockIds.BEECH_WALL_SIGN,
            p -> new WallSignBlock(AWRWoodTypes.BEECH, p), wallVariant(BEECH_SIGN, true)
                    .mapColor(BEECH_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block BEECH_HANGING_SIGN = register(
            AWRBlockItemIds.BEECH_HANGING_SIGN,
            p -> new CeilingHangingSignBlock(AWRWoodTypes.BEECH, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_HANGING_SIGN)
    );
    public static final Block BEECH_WALL_HANGING_SIGN = register(
            AWRBlockIds.BEECH_WALL_HANGING_SIGN,
            p -> new WallHangingSignBlock(AWRWoodTypes.BEECH, p), wallVariant(BEECH_SIGN, true)
                    .mapColor(BEECH_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block BEECH_SHELF = register(
            AWRBlockItemIds.BEECH_SHELF, ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_SHELF)
    );
    public static final Block BEECH_LEAVES = register(
            AWRBlockItemIds.BEECH_LEAVES,
            p -> new TintedParticleLeavesBlock(0.1F, p),
            leavesProperties(SoundType.GRASS)
    );
    public static final Block BEECH_SAPLING = register(
            AWRBlockItemIds.BEECH_SAPLING, p -> new SaplingBlock(TreeGrower.OAK, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SAPLING)
    );
    public static final Block POTTED_BEECH_SAPLING = register(
            AWRBlockIds.POTTED_BEECH_SAPLING, p -> new FlowerPotBlock(BEECH_SAPLING, p), flowerPotProperties()
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Block CEDAR_LOG = register(
            AWRBlockItemIds.CEDAR_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_LOG)
    );
    public static final Block CEDAR_WOOD = register(
            AWRBlockItemIds.CEDAR_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_WOOD)
    );
    public static final Block STRIPPED_CEDAR_LOG = register(
            AWRBlockItemIds.STRIPPED_CEDAR_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_SPRUCE_LOG)
    );
    public static final Block STRIPPED_CEDAR_WOOD = register(
            AWRBlockItemIds.STRIPPED_CEDAR_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_SPRUCE_WOOD)
    );
    public static final Block CEDAR_PLANKS = register(
            AWRBlockItemIds.CEDAR_PLANKS, BlockBehaviour.Properties.ofFullCopy(SPRUCE_PLANKS)
    );
    public static final Block CEDAR_STAIRS = registerStair(AWRBlockItemIds.CEDAR_STAIRS, CEDAR_PLANKS);
    public static final Block CEDAR_SLAB = registerSlab(
            AWRBlockItemIds.CEDAR_SLAB, CEDAR_PLANKS
    );
    public static final Block CEDAR_FENCE = register(
            AWRBlockItemIds.CEDAR_FENCE, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_FENCE)
    );
    public static final Block CEDAR_FENCE_GATE = register(
            AWRBlockItemIds.CEDAR_FENCE_GATE,
            p -> new FenceGateBlock(AWRWoodTypes.CEDAR, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_FENCE_GATE)
    );
    public static final Block CEDAR_DOOR = register(
            AWRBlockItemIds.CEDAR_DOOR,
            p -> new DoorBlock(AWRBlockSetTypes.CEDAR, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_DOOR)
    );
    public static final Block CEDAR_TRAPDOOR = register(
            AWRBlockItemIds.CEDAR_TRAPDOOR,
            p -> new TrapDoorBlock(AWRBlockSetTypes.CEDAR, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_TRAPDOOR)
    );
    public static final Block CEDAR_PRESSURE_PLATE = register(
            AWRBlockItemIds.CEDAR_PRESSURE_PLATE,
            p -> new PressurePlateBlock(AWRBlockSetTypes.CEDAR, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_PRESSURE_PLATE)
    );
    public static final Block CEDAR_BUTTON = register(
            AWRBlockItemIds.CEDAR_BUTTON,
            p -> new ButtonBlock(AWRBlockSetTypes.CEDAR, 30, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_BUTTON)
    );
    public static final Block CEDAR_SIGN = register(
            AWRBlockItemIds.CEDAR_SIGN,
            p -> new StandingSignBlock(AWRWoodTypes.CEDAR, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_SIGN)
    );
    public static final Block CEDAR_WALL_SIGN = register(
            AWRBlockIds.CEDAR_WALL_SIGN,
            p -> new WallSignBlock(AWRWoodTypes.CEDAR, p), wallVariant(CEDAR_SIGN, true)
                    .mapColor(CEDAR_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block CEDAR_HANGING_SIGN = register(
            AWRBlockItemIds.CEDAR_HANGING_SIGN,
            p -> new CeilingHangingSignBlock(AWRWoodTypes.CEDAR, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_HANGING_SIGN)
    );
    public static final Block CEDAR_WALL_HANGING_SIGN = register(
            AWRBlockIds.CEDAR_WALL_HANGING_SIGN,
            p -> new WallHangingSignBlock(AWRWoodTypes.CEDAR, p), wallVariant(CEDAR_SIGN, true)
                    .mapColor(CEDAR_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block CEDAR_SHELF = register(
            AWRBlockItemIds.CEDAR_SHELF, ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_SHELF)
    );
    public static final Block CEDAR_LEAVES = register(
            AWRBlockItemIds.CEDAR_LEAVES, p -> new LeavesBlock(AmbientLeavesBlockSoundPlayer.noAmbientSound(), p), leavesProperties(SoundType.GRASS)
    );
    public static final Block CEDAR_SAPLING = register(
            AWRBlockItemIds.CEDAR_SAPLING, p -> new SaplingBlock(AWRTreeGrowers.CEDAR, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_SAPLING)
    );
    public static final Block POTTED_CEDAR_SAPLING = register(
            AWRBlockIds.POTTED_CEDAR_SAPLING, p -> new FlowerPotBlock(CEDAR_SAPLING, p), flowerPotProperties()
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Block CHERRY_LOG = register(
            AWRBlockItemIds.CHERRY_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_LOG)
    );
    public static final Block CHERRY_WOOD = register(
            AWRBlockItemIds.CHERRY_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_WOOD)
    );
    public static final Block STRIPPED_CHERRY_LOG = register(
            AWRBlockItemIds.STRIPPED_CHERRY_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_LOG)
    );
    public static final Block STRIPPED_CHERRY_WOOD = register(
            AWRBlockItemIds.STRIPPED_CHERRY_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_WOOD)
    );
    public static final Block CHERRY_PLANKS = register(
            AWRBlockItemIds.CHERRY_PLANKS, BlockBehaviour.Properties.ofFullCopy(BIRCH_PLANKS)
    );
    public static final Block CHERRY_STAIRS = registerStair(AWRBlockItemIds.CHERRY_STAIRS, CHERRY_PLANKS);
    public static final Block CHERRY_SLAB = registerSlab(
            AWRBlockItemIds.CHERRY_SLAB, CHERRY_PLANKS
    );
    public static final Block CHERRY_FENCE = register(
            AWRBlockItemIds.CHERRY_FENCE, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE)
    );
    public static final Block CHERRY_FENCE_GATE = register(
            AWRBlockItemIds.CHERRY_FENCE_GATE,
            p -> new FenceGateBlock(AWRWoodTypes.CHERRY, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE_GATE)
    );
    public static final Block CHERRY_DOOR = register(
            AWRBlockItemIds.CHERRY_DOOR,
            p -> new DoorBlock(AWRBlockSetTypes.CHERRY, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_DOOR)
    );
    public static final Block CHERRY_TRAPDOOR = register(
            AWRBlockItemIds.CHERRY_TRAPDOOR,
            p -> new TrapDoorBlock(AWRBlockSetTypes.CHERRY, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_TRAPDOOR)
    );
    public static final Block CHERRY_PRESSURE_PLATE = register(
            AWRBlockItemIds.CHERRY_PRESSURE_PLATE,
            p -> new PressurePlateBlock(AWRBlockSetTypes.CHERRY, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_PRESSURE_PLATE)
    );
    public static final Block CHERRY_BUTTON = register(
            AWRBlockItemIds.CHERRY_BUTTON,
            p -> new ButtonBlock(AWRBlockSetTypes.CHERRY, 30, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_BUTTON)
    );
    public static final Block CHERRY_SIGN = register(
            AWRBlockItemIds.CHERRY_SIGN,
            p -> new StandingSignBlock(AWRWoodTypes.CHERRY, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SIGN)
    );
    public static final Block CHERRY_WALL_SIGN = register(
            AWRBlockIds.CHERRY_WALL_SIGN,
            p -> new WallSignBlock(AWRWoodTypes.CHERRY, p), wallVariant(CHERRY_SIGN, true)
                    .mapColor(CHERRY_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block CHERRY_HANGING_SIGN = register(
            AWRBlockItemIds.CHERRY_HANGING_SIGN,
            p -> new CeilingHangingSignBlock(AWRWoodTypes.CHERRY, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_HANGING_SIGN)
    );
    public static final Block CHERRY_WALL_HANGING_SIGN = register(
            AWRBlockIds.CHERRY_WALL_HANGING_SIGN,
            p -> new WallHangingSignBlock(AWRWoodTypes.CHERRY, p), wallVariant(CHERRY_SIGN, true)
                    .mapColor(CHERRY_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block CHERRY_SHELF = register(
            AWRBlockItemIds.CHERRY_SHELF, ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_SHELF)
    );
    public static final Block CHERRY_LEAVES = register(
            AWRBlockItemIds.CHERRY_LEAVES,
            p -> new FruitLeavesBlock(0.1F, p, AWRLootTables.HARVEST_CHERRY_LEAVES),
            leavesProperties(SoundType.GRASS)
    );
    public static final Block CHERRY_SAPLING = register(
            AWRBlockItemIds.CHERRY_SAPLING, p -> new SaplingBlock(TreeGrower.OAK, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SAPLING)
    );
    public static final Block POTTED_CHERRY_SAPLING = register(
            AWRBlockIds.POTTED_CHERRY_SAPLING, p -> new FlowerPotBlock(CHERRY_SAPLING, p), flowerPotProperties()
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Block CYPRESS_LOG = register(
            AWRBlockItemIds.CYPRESS_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_LOG)
    );
    public static final Block CYPRESS_WOOD = register(
            AWRBlockItemIds.CYPRESS_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_WOOD)
    );
    public static final Block STRIPPED_CYPRESS_LOG = register(
            AWRBlockItemIds.STRIPPED_CYPRESS_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_LOG)
    );
    public static final Block STRIPPED_CYPRESS_WOOD = register(
            AWRBlockItemIds.STRIPPED_CYPRESS_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_WOOD)
    );
    public static final Block CYPRESS_PLANKS = register(
            AWRBlockItemIds.CYPRESS_PLANKS, BlockBehaviour.Properties.ofFullCopy(BIRCH_PLANKS)
    );
    public static final Block CYPRESS_STAIRS = registerStair(AWRBlockItemIds.CYPRESS_STAIRS, CYPRESS_PLANKS);
    public static final Block CYPRESS_SLAB = registerSlab(
            AWRBlockItemIds.CYPRESS_SLAB, CYPRESS_PLANKS
    );
    public static final Block CYPRESS_FENCE = register(
            AWRBlockItemIds.CYPRESS_FENCE, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE)
    );
    public static final Block CYPRESS_FENCE_GATE = register(
            AWRBlockItemIds.CYPRESS_FENCE_GATE,
            p -> new FenceGateBlock(AWRWoodTypes.CYPRESS, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE_GATE)
    );
    public static final Block CYPRESS_DOOR = register(
            AWRBlockItemIds.CYPRESS_DOOR,
            p -> new DoorBlock(AWRBlockSetTypes.CYPRESS, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_DOOR)
    );
    public static final Block CYPRESS_TRAPDOOR = register(
            AWRBlockItemIds.CYPRESS_TRAPDOOR,
            p -> new TrapDoorBlock(AWRBlockSetTypes.CYPRESS, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_TRAPDOOR)
    );
    public static final Block CYPRESS_PRESSURE_PLATE = register(
            AWRBlockItemIds.CYPRESS_PRESSURE_PLATE,
            p -> new PressurePlateBlock(AWRBlockSetTypes.CYPRESS, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_PRESSURE_PLATE)
    );
    public static final Block CYPRESS_BUTTON = register(
            AWRBlockItemIds.CYPRESS_BUTTON,
            p -> new ButtonBlock(AWRBlockSetTypes.CYPRESS, 30, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_BUTTON)
    );
    public static final Block CYPRESS_SIGN = register(
            AWRBlockItemIds.CYPRESS_SIGN,
            p -> new StandingSignBlock(AWRWoodTypes.CYPRESS, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SIGN)
    );
    public static final Block CYPRESS_WALL_SIGN = register(
            AWRBlockIds.CYPRESS_WALL_SIGN,
            p -> new WallSignBlock(AWRWoodTypes.CYPRESS, p), wallVariant(CYPRESS_SIGN, true)
                    .mapColor(CYPRESS_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block CYPRESS_HANGING_SIGN = register(
            AWRBlockItemIds.CYPRESS_HANGING_SIGN,
            p -> new CeilingHangingSignBlock(AWRWoodTypes.CYPRESS, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_HANGING_SIGN)
    );
    public static final Block CYPRESS_WALL_HANGING_SIGN = register(
            AWRBlockIds.CYPRESS_WALL_HANGING_SIGN,
            p -> new WallHangingSignBlock(AWRWoodTypes.CYPRESS, p), wallVariant(CYPRESS_SIGN, true)
                    .mapColor(CYPRESS_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block CYPRESS_SHELF = register(
            AWRBlockItemIds.CYPRESS_SHELF, ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_SHELF)
    );
    public static final Block CYPRESS_LEAVES = register(
            AWRBlockItemIds.CYPRESS_LEAVES,
            p -> new TintedParticleLeavesBlock(0.1F, p),
            leavesProperties(SoundType.GRASS)
    );
    public static final Block CYPRESS_SAPLING = register(
            AWRBlockItemIds.CYPRESS_SAPLING, p -> new SaplingBlock(TreeGrower.OAK, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SAPLING)
    );
    public static final Block POTTED_CYPRESS_SAPLING = register(
            AWRBlockIds.POTTED_CYPRESS_SAPLING, p -> new FlowerPotBlock(CYPRESS_SAPLING, p), flowerPotProperties()
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Block EBONY_LOG = register(
            AWRBlockItemIds.EBONY_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_LOG)
    );
    public static final Block EBONY_WOOD = register(
            AWRBlockItemIds.EBONY_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_WOOD)
    );
    public static final Block STRIPPED_EBONY_LOG = register(
            AWRBlockItemIds.STRIPPED_EBONY_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_LOG)
    );
    public static final Block STRIPPED_EBONY_WOOD = register(
            AWRBlockItemIds.STRIPPED_EBONY_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_WOOD)
    );
    public static final Block EBONY_PLANKS = register(
            AWRBlockItemIds.EBONY_PLANKS, BlockBehaviour.Properties.ofFullCopy(BIRCH_PLANKS)
    );
    public static final Block EBONY_STAIRS = registerStair(AWRBlockItemIds.EBONY_STAIRS, EBONY_PLANKS);
    public static final Block EBONY_SLAB = registerSlab(
            AWRBlockItemIds.EBONY_SLAB, EBONY_PLANKS
    );
    public static final Block EBONY_FENCE = register(
            AWRBlockItemIds.EBONY_FENCE, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE)
    );
    public static final Block EBONY_FENCE_GATE = register(
            AWRBlockItemIds.EBONY_FENCE_GATE,
            p -> new FenceGateBlock(AWRWoodTypes.EBONY, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE_GATE)
    );
    public static final Block EBONY_DOOR = register(
            AWRBlockItemIds.EBONY_DOOR,
            p -> new DoorBlock(AWRBlockSetTypes.EBONY, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_DOOR)
    );
    public static final Block EBONY_TRAPDOOR = register(
            AWRBlockItemIds.EBONY_TRAPDOOR,
            p -> new TrapDoorBlock(AWRBlockSetTypes.EBONY, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_TRAPDOOR)
    );
    public static final Block EBONY_PRESSURE_PLATE = register(
            AWRBlockItemIds.EBONY_PRESSURE_PLATE,
            p -> new PressurePlateBlock(AWRBlockSetTypes.EBONY, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_PRESSURE_PLATE)
    );
    public static final Block EBONY_BUTTON = register(
            AWRBlockItemIds.EBONY_BUTTON,
            p -> new ButtonBlock(AWRBlockSetTypes.EBONY, 30, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_BUTTON)
    );
    public static final Block EBONY_SIGN = register(
            AWRBlockItemIds.EBONY_SIGN,
            p -> new StandingSignBlock(AWRWoodTypes.EBONY, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SIGN)
    );
    public static final Block EBONY_WALL_SIGN = register(
            AWRBlockIds.EBONY_WALL_SIGN,
            p -> new WallSignBlock(AWRWoodTypes.EBONY, p), wallVariant(EBONY_SIGN, true)
                    .mapColor(EBONY_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block EBONY_HANGING_SIGN = register(
            AWRBlockItemIds.EBONY_HANGING_SIGN,
            p -> new CeilingHangingSignBlock(AWRWoodTypes.EBONY, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_HANGING_SIGN)
    );
    public static final Block EBONY_WALL_HANGING_SIGN = register(
            AWRBlockIds.EBONY_WALL_HANGING_SIGN,
            p -> new WallHangingSignBlock(AWRWoodTypes.EBONY, p), wallVariant(EBONY_SIGN, true)
                    .mapColor(EBONY_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block EBONY_SHELF = register(
            AWRBlockItemIds.EBONY_SHELF, ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_SHELF)
    );
    public static final Block EBONY_LEAVES = register(
            AWRBlockItemIds.EBONY_LEAVES,
            p -> new FruitLeavesBlock(0.1F, p, AWRLootTables.HARVEST_EBONY_LEAVES),
            leavesProperties(SoundType.GRASS)
    );
    public static final Block EBONY_SAPLING = register(
            AWRBlockItemIds.EBONY_SAPLING, p -> new SaplingBlock(TreeGrower.OAK, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SAPLING)
    );
    public static final Block POTTED_EBONY_SAPLING = register(
            AWRBlockIds.POTTED_EBONY_SAPLING, p -> new FlowerPotBlock(EBONY_SAPLING, p), flowerPotProperties()
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Block ELM_LOG = register(
            AWRBlockItemIds.ELM_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_LOG)
    );
    public static final Block ELM_WOOD = register(
            AWRBlockItemIds.ELM_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_WOOD)
    );
    public static final Block STRIPPED_ELM_LOG = register(
            AWRBlockItemIds.STRIPPED_ELM_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_LOG)
    );
    public static final Block STRIPPED_ELM_WOOD = register(
            AWRBlockItemIds.STRIPPED_ELM_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_WOOD)
    );
    public static final Block ELM_PLANKS = register(
            AWRBlockItemIds.ELM_PLANKS, BlockBehaviour.Properties.ofFullCopy(BIRCH_PLANKS)
    );
    public static final Block ELM_STAIRS = registerStair(AWRBlockItemIds.ELM_STAIRS, ELM_PLANKS);
    public static final Block ELM_SLAB = registerSlab(
            AWRBlockItemIds.ELM_SLAB, ELM_PLANKS
    );
    public static final Block ELM_FENCE = register(
            AWRBlockItemIds.ELM_FENCE, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE)
    );
    public static final Block ELM_FENCE_GATE = register(
            AWRBlockItemIds.ELM_FENCE_GATE,
            p -> new FenceGateBlock(AWRWoodTypes.ELM, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE_GATE)
    );
    public static final Block ELM_DOOR = register(
            AWRBlockItemIds.ELM_DOOR,
            p -> new DoorBlock(AWRBlockSetTypes.ELM, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_DOOR)
    );
    public static final Block ELM_TRAPDOOR = register(
            AWRBlockItemIds.ELM_TRAPDOOR,
            p -> new TrapDoorBlock(AWRBlockSetTypes.ELM, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_TRAPDOOR)
    );
    public static final Block ELM_PRESSURE_PLATE = register(
            AWRBlockItemIds.ELM_PRESSURE_PLATE,
            p -> new PressurePlateBlock(AWRBlockSetTypes.ELM, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_PRESSURE_PLATE)
    );
    public static final Block ELM_BUTTON = register(
            AWRBlockItemIds.ELM_BUTTON,
            p -> new ButtonBlock(AWRBlockSetTypes.ELM, 30, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_BUTTON)
    );
    public static final Block ELM_SIGN = register(
            AWRBlockItemIds.ELM_SIGN,
            p -> new StandingSignBlock(AWRWoodTypes.ELM, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SIGN)
    );
    public static final Block ELM_WALL_SIGN = register(
            AWRBlockIds.ELM_WALL_SIGN,
            p -> new WallSignBlock(AWRWoodTypes.ELM, p), wallVariant(ELM_SIGN, true)
                    .mapColor(ELM_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block ELM_HANGING_SIGN = register(
            AWRBlockItemIds.ELM_HANGING_SIGN,
            p -> new CeilingHangingSignBlock(AWRWoodTypes.ELM, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_HANGING_SIGN)
    );
    public static final Block ELM_WALL_HANGING_SIGN = register(
            AWRBlockIds.ELM_WALL_HANGING_SIGN,
            p -> new WallHangingSignBlock(AWRWoodTypes.ELM, p), wallVariant(ELM_SIGN, true)
                    .mapColor(ELM_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block ELM_SHELF = register(
            AWRBlockItemIds.ELM_SHELF, ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_SHELF)
    );
    public static final Block ELM_LEAVES = register(
            AWRBlockItemIds.ELM_LEAVES,
            p -> new TintedParticleLeavesBlock(0.1F, p),
            leavesProperties(SoundType.GRASS)
    );
    public static final Block ELM_SAPLING = register(
            AWRBlockItemIds.ELM_SAPLING, p -> new SaplingBlock(TreeGrower.OAK, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SAPLING)
    );
    public static final Block POTTED_ELM_SAPLING = register(
            AWRBlockIds.POTTED_ELM_SAPLING, p -> new FlowerPotBlock(ELM_SAPLING, p), flowerPotProperties()
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Block EUCALYPTUS_LOG = register(
            AWRBlockItemIds.EUCALYPTUS_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_LOG)
    );
    public static final Block EUCALYPTUS_WOOD = register(
            AWRBlockItemIds.EUCALYPTUS_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_WOOD)
    );
    public static final Block STRIPPED_EUCALYPTUS_LOG = register(
            AWRBlockItemIds.STRIPPED_EUCALYPTUS_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_LOG)
    );
    public static final Block STRIPPED_EUCALYPTUS_WOOD = register(
            AWRBlockItemIds.STRIPPED_EUCALYPTUS_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_WOOD)
    );
    public static final Block EUCALYPTUS_PLANKS = register(
            AWRBlockItemIds.EUCALYPTUS_PLANKS, BlockBehaviour.Properties.ofFullCopy(BIRCH_PLANKS)
    );
    public static final Block EUCALYPTUS_STAIRS = registerStair(AWRBlockItemIds.EUCALYPTUS_STAIRS, EUCALYPTUS_PLANKS);
    public static final Block EUCALYPTUS_SLAB = registerSlab(
            AWRBlockItemIds.EUCALYPTUS_SLAB, EUCALYPTUS_PLANKS
    );
    public static final Block EUCALYPTUS_FENCE = register(
            AWRBlockItemIds.EUCALYPTUS_FENCE, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE)
    );
    public static final Block EUCALYPTUS_FENCE_GATE = register(
            AWRBlockItemIds.EUCALYPTUS_FENCE_GATE,
            p -> new FenceGateBlock(AWRWoodTypes.EUCALYPTUS, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE_GATE)
    );
    public static final Block EUCALYPTUS_DOOR = register(
            AWRBlockItemIds.EUCALYPTUS_DOOR,
            p -> new DoorBlock(AWRBlockSetTypes.EUCALYPTUS, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_DOOR)
    );
    public static final Block EUCALYPTUS_TRAPDOOR = register(
            AWRBlockItemIds.EUCALYPTUS_TRAPDOOR,
            p -> new TrapDoorBlock(AWRBlockSetTypes.EUCALYPTUS, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_TRAPDOOR)
    );
    public static final Block EUCALYPTUS_PRESSURE_PLATE = register(
            AWRBlockItemIds.EUCALYPTUS_PRESSURE_PLATE,
            p -> new PressurePlateBlock(AWRBlockSetTypes.EUCALYPTUS, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_PRESSURE_PLATE)
    );
    public static final Block EUCALYPTUS_BUTTON = register(
            AWRBlockItemIds.EUCALYPTUS_BUTTON,
            p -> new ButtonBlock(AWRBlockSetTypes.EUCALYPTUS, 30, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_BUTTON)
    );
    public static final Block EUCALYPTUS_SIGN = register(
            AWRBlockItemIds.EUCALYPTUS_SIGN,
            p -> new StandingSignBlock(AWRWoodTypes.EUCALYPTUS, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SIGN)
    );
    public static final Block EUCALYPTUS_WALL_SIGN = register(
            AWRBlockIds.EUCALYPTUS_WALL_SIGN,
            p -> new WallSignBlock(AWRWoodTypes.EUCALYPTUS, p), wallVariant(EUCALYPTUS_SIGN, true)
                    .mapColor(EUCALYPTUS_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block EUCALYPTUS_HANGING_SIGN = register(
            AWRBlockItemIds.EUCALYPTUS_HANGING_SIGN,
            p -> new CeilingHangingSignBlock(AWRWoodTypes.EUCALYPTUS, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_HANGING_SIGN)
    );
    public static final Block EUCALYPTUS_WALL_HANGING_SIGN = register(
            AWRBlockIds.EUCALYPTUS_WALL_HANGING_SIGN,
            p -> new WallHangingSignBlock(AWRWoodTypes.EUCALYPTUS, p), wallVariant(EUCALYPTUS_SIGN, true)
                    .mapColor(EUCALYPTUS_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block EUCALYPTUS_SHELF = register(
            AWRBlockItemIds.EUCALYPTUS_SHELF, ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_SHELF)
    );
    public static final Block EUCALYPTUS_LEAVES = register(
            AWRBlockItemIds.EUCALYPTUS_LEAVES,
            p -> new TintedParticleLeavesBlock(0.1F, p),
            leavesProperties(SoundType.GRASS)
    );
    public static final Block EUCALYPTUS_SAPLING = register(
            AWRBlockItemIds.EUCALYPTUS_SAPLING, p -> new SaplingBlock(TreeGrower.OAK, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SAPLING)
    );
    public static final Block POTTED_EUCALYPTUS_SAPLING = register(
            AWRBlockIds.POTTED_EUCALYPTUS_SAPLING, p -> new FlowerPotBlock(EUCALYPTUS_SAPLING, p), flowerPotProperties()
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Block FIG_LOG = register(
            AWRBlockItemIds.FIG_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_LOG)
    );
    public static final Block FIG_WOOD = register(
            AWRBlockItemIds.FIG_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_WOOD)
    );
    public static final Block STRIPPED_FIG_LOG = register(
            AWRBlockItemIds.STRIPPED_FIG_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_LOG)
    );
    public static final Block STRIPPED_FIG_WOOD = register(
            AWRBlockItemIds.STRIPPED_FIG_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_WOOD)
    );
    public static final Block FIG_PLANKS = register(
            AWRBlockItemIds.FIG_PLANKS, BlockBehaviour.Properties.ofFullCopy(BIRCH_PLANKS)
    );
    public static final Block FIG_STAIRS = registerStair(AWRBlockItemIds.FIG_STAIRS, FIG_PLANKS);
    public static final Block FIG_SLAB = registerSlab(
            AWRBlockItemIds.FIG_SLAB, FIG_PLANKS
    );
    public static final Block FIG_FENCE = register(
            AWRBlockItemIds.FIG_FENCE, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE)
    );
    public static final Block FIG_FENCE_GATE = register(
            AWRBlockItemIds.FIG_FENCE_GATE,
            p -> new FenceGateBlock(AWRWoodTypes.FIG, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE_GATE)
    );
    public static final Block FIG_DOOR = register(
            AWRBlockItemIds.FIG_DOOR,
            p -> new DoorBlock(AWRBlockSetTypes.FIG, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_DOOR)
    );
    public static final Block FIG_TRAPDOOR = register(
            AWRBlockItemIds.FIG_TRAPDOOR,
            p -> new TrapDoorBlock(AWRBlockSetTypes.FIG, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_TRAPDOOR)
    );
    public static final Block FIG_PRESSURE_PLATE = register(
            AWRBlockItemIds.FIG_PRESSURE_PLATE,
            p -> new PressurePlateBlock(AWRBlockSetTypes.FIG, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_PRESSURE_PLATE)
    );
    public static final Block FIG_BUTTON = register(
            AWRBlockItemIds.FIG_BUTTON,
            p -> new ButtonBlock(AWRBlockSetTypes.FIG, 30, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_BUTTON)
    );
    public static final Block FIG_SIGN = register(
            AWRBlockItemIds.FIG_SIGN,
            p -> new StandingSignBlock(AWRWoodTypes.FIG, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SIGN)
    );
    public static final Block FIG_WALL_SIGN = register(
            AWRBlockIds.FIG_WALL_SIGN,
            p -> new WallSignBlock(AWRWoodTypes.FIG, p), wallVariant(FIG_SIGN, true)
                    .mapColor(FIG_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block FIG_HANGING_SIGN = register(
            AWRBlockItemIds.FIG_HANGING_SIGN,
            p -> new CeilingHangingSignBlock(AWRWoodTypes.FIG, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_HANGING_SIGN)
    );
    public static final Block FIG_WALL_HANGING_SIGN = register(
            AWRBlockIds.FIG_WALL_HANGING_SIGN,
            p -> new WallHangingSignBlock(AWRWoodTypes.FIG, p), wallVariant(FIG_SIGN, true)
                    .mapColor(FIG_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block FIG_SHELF = register(
            AWRBlockItemIds.FIG_SHELF, ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_SHELF)
    );
    public static final Block FIG_LEAVES = register(
            AWRBlockItemIds.FIG_LEAVES,
            p -> new FruitLeavesBlock(0.1F, p, AWRLootTables.HARVEST_FIG_LEAVES),
            leavesProperties(SoundType.GRASS)
    );
    public static final Block FIG_SAPLING = register(
            AWRBlockItemIds.FIG_SAPLING, p -> new SaplingBlock(TreeGrower.OAK, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SAPLING)
    );
    public static final Block POTTED_FIG_SAPLING = register(
            AWRBlockIds.POTTED_FIG_SAPLING, p -> new FlowerPotBlock(FIG_SAPLING, p), flowerPotProperties()
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Block FIR_LOG = register(
            AWRBlockItemIds.FIR_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_LOG)
    );
    public static final Block FIR_WOOD = register(
            AWRBlockItemIds.FIR_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_WOOD)
    );
    public static final Block STRIPPED_FIR_LOG = register(
            AWRBlockItemIds.STRIPPED_FIR_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_SPRUCE_LOG)
    );
    public static final Block STRIPPED_FIR_WOOD = register(
            AWRBlockItemIds.STRIPPED_FIR_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_SPRUCE_WOOD)
    );
    public static final Block FIR_PLANKS = register(
            AWRBlockItemIds.FIR_PLANKS, BlockBehaviour.Properties.ofFullCopy(SPRUCE_PLANKS)
    );
    public static final Block FIR_STAIRS = registerStair(AWRBlockItemIds.FIR_STAIRS, FIR_PLANKS);
    public static final Block FIR_SLAB = registerSlab(
            AWRBlockItemIds.FIR_SLAB, FIR_PLANKS
    );
    public static final Block FIR_FENCE = register(
            AWRBlockItemIds.FIR_FENCE, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_FENCE)
    );
    public static final Block FIR_FENCE_GATE = register(
            AWRBlockItemIds.FIR_FENCE_GATE,
            p -> new FenceGateBlock(AWRWoodTypes.FIR, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_FENCE_GATE)
    );
    public static final Block FIR_DOOR = register(
            AWRBlockItemIds.FIR_DOOR,
            p -> new DoorBlock(AWRBlockSetTypes.FIR, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_DOOR)
    );
    public static final Block FIR_TRAPDOOR = register(
            AWRBlockItemIds.FIR_TRAPDOOR,
            p -> new TrapDoorBlock(AWRBlockSetTypes.FIR, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_TRAPDOOR)
    );
    public static final Block FIR_PRESSURE_PLATE = register(
            AWRBlockItemIds.FIR_PRESSURE_PLATE,
            p -> new PressurePlateBlock(AWRBlockSetTypes.FIR, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_PRESSURE_PLATE)
    );
    public static final Block FIR_BUTTON = register(
            AWRBlockItemIds.FIR_BUTTON,
            p -> new ButtonBlock(AWRBlockSetTypes.FIR, 30, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_BUTTON)
    );
    public static final Block FIR_SIGN = register(
            AWRBlockItemIds.FIR_SIGN,
            p -> new StandingSignBlock(AWRWoodTypes.FIR, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_SIGN)
    );
    public static final Block FIR_WALL_SIGN = register(
            AWRBlockIds.FIR_WALL_SIGN,
            p -> new WallSignBlock(AWRWoodTypes.FIR, p), wallVariant(FIR_SIGN, true)
                    .mapColor(FIR_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block FIR_HANGING_SIGN = register(
            AWRBlockItemIds.FIR_HANGING_SIGN,
            p -> new CeilingHangingSignBlock(AWRWoodTypes.FIR, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_HANGING_SIGN)
    );
    public static final Block FIR_WALL_HANGING_SIGN = register(
            AWRBlockIds.FIR_WALL_HANGING_SIGN,
            p -> new WallHangingSignBlock(AWRWoodTypes.FIR, p), wallVariant(FIR_SIGN, true)
                    .mapColor(FIR_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block FIR_SHELF = register(
            AWRBlockItemIds.FIR_SHELF, ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_SHELF)
    );
    public static final Block FIR_LEAVES = register(
            AWRBlockItemIds.FIR_LEAVES, p -> new LeavesBlock(AmbientLeavesBlockSoundPlayer.noAmbientSound(), p), leavesProperties(SoundType.GRASS)
    );
    public static final Block FIR_SAPLING = register(
            AWRBlockItemIds.FIR_SAPLING, p -> new SaplingBlock(AWRTreeGrowers.FIR, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_SAPLING)
    );
    public static final Block POTTED_FIR_SAPLING = register(
            AWRBlockIds.POTTED_FIR_SAPLING, p -> new FlowerPotBlock(FIR_SAPLING, p), flowerPotProperties()
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Block HEMLOCK_LOG = register(
            AWRBlockItemIds.HEMLOCK_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_LOG)
    );
    public static final Block HEMLOCK_WOOD = register(
            AWRBlockItemIds.HEMLOCK_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_WOOD)
    );
    public static final Block STRIPPED_HEMLOCK_LOG = register(
            AWRBlockItemIds.STRIPPED_HEMLOCK_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_SPRUCE_LOG)
    );
    public static final Block STRIPPED_HEMLOCK_WOOD = register(
            AWRBlockItemIds.STRIPPED_HEMLOCK_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_SPRUCE_WOOD)
    );
    public static final Block HEMLOCK_PLANKS = register(
            AWRBlockItemIds.HEMLOCK_PLANKS, BlockBehaviour.Properties.ofFullCopy(SPRUCE_PLANKS)
    );
    public static final Block HEMLOCK_STAIRS = registerStair(AWRBlockItemIds.HEMLOCK_STAIRS, HEMLOCK_PLANKS);
    public static final Block HEMLOCK_SLAB = registerSlab(
            AWRBlockItemIds.HEMLOCK_SLAB, HEMLOCK_PLANKS
    );
    public static final Block HEMLOCK_FENCE = register(
            AWRBlockItemIds.HEMLOCK_FENCE, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_FENCE)
    );
    public static final Block HEMLOCK_FENCE_GATE = register(
            AWRBlockItemIds.HEMLOCK_FENCE_GATE,
            p -> new FenceGateBlock(AWRWoodTypes.HEMLOCK, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_FENCE_GATE)
    );
    public static final Block HEMLOCK_DOOR = register(
            AWRBlockItemIds.HEMLOCK_DOOR,
            p -> new DoorBlock(AWRBlockSetTypes.HEMLOCK, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_DOOR)
    );
    public static final Block HEMLOCK_TRAPDOOR = register(
            AWRBlockItemIds.HEMLOCK_TRAPDOOR,
            p -> new TrapDoorBlock(AWRBlockSetTypes.HEMLOCK, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_TRAPDOOR)
    );
    public static final Block HEMLOCK_PRESSURE_PLATE = register(
            AWRBlockItemIds.HEMLOCK_PRESSURE_PLATE,
            p -> new PressurePlateBlock(AWRBlockSetTypes.HEMLOCK, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_PRESSURE_PLATE)
    );
    public static final Block HEMLOCK_BUTTON = register(
            AWRBlockItemIds.HEMLOCK_BUTTON,
            p -> new ButtonBlock(AWRBlockSetTypes.HEMLOCK, 30, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_BUTTON)
    );
    public static final Block HEMLOCK_SIGN = register(
            AWRBlockItemIds.HEMLOCK_SIGN,
            p -> new StandingSignBlock(AWRWoodTypes.HEMLOCK, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_SIGN)
    );
    public static final Block HEMLOCK_WALL_SIGN = register(
            AWRBlockIds.HEMLOCK_WALL_SIGN,
            p -> new WallSignBlock(AWRWoodTypes.HEMLOCK, p), wallVariant(HEMLOCK_SIGN, true)
                    .mapColor(HEMLOCK_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block HEMLOCK_HANGING_SIGN = register(
            AWRBlockItemIds.HEMLOCK_HANGING_SIGN,
            p -> new CeilingHangingSignBlock(AWRWoodTypes.HEMLOCK, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_HANGING_SIGN)
    );
    public static final Block HEMLOCK_WALL_HANGING_SIGN = register(
            AWRBlockIds.HEMLOCK_WALL_HANGING_SIGN,
            p -> new WallHangingSignBlock(AWRWoodTypes.HEMLOCK, p), wallVariant(HEMLOCK_SIGN, true)
                    .mapColor(HEMLOCK_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block HEMLOCK_SHELF = register(
            AWRBlockItemIds.HEMLOCK_SHELF, ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_SHELF)
    );
    public static final Block HEMLOCK_LEAVES = register(
            AWRBlockItemIds.HEMLOCK_LEAVES, p -> new LeavesBlock(AmbientLeavesBlockSoundPlayer.noAmbientSound(), p), leavesProperties(SoundType.GRASS)
    );
    public static final Block HEMLOCK_SAPLING = register(
            AWRBlockItemIds.HEMLOCK_SAPLING, p -> new SaplingBlock(AWRTreeGrowers.HEMLOCK, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_SAPLING)
    );
    public static final Block POTTED_HEMLOCK_SAPLING = register(
            AWRBlockIds.POTTED_HEMLOCK_SAPLING, p -> new FlowerPotBlock(HEMLOCK_SAPLING, p), flowerPotProperties()
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Block HICKORY_LOG = register(
            AWRBlockItemIds.HICKORY_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_LOG)
    );
    public static final Block HICKORY_WOOD = register(
            AWRBlockItemIds.HICKORY_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_WOOD)
    );
    public static final Block STRIPPED_HICKORY_LOG = register(
            AWRBlockItemIds.STRIPPED_HICKORY_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_LOG)
    );
    public static final Block STRIPPED_HICKORY_WOOD = register(
            AWRBlockItemIds.STRIPPED_HICKORY_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_WOOD)
    );
    public static final Block HICKORY_PLANKS = register(
            AWRBlockItemIds.HICKORY_PLANKS, BlockBehaviour.Properties.ofFullCopy(BIRCH_PLANKS)
    );
    public static final Block HICKORY_STAIRS = registerStair(AWRBlockItemIds.HICKORY_STAIRS, HICKORY_PLANKS);
    public static final Block HICKORY_SLAB = registerSlab(
            AWRBlockItemIds.HICKORY_SLAB, HICKORY_PLANKS
    );
    public static final Block HICKORY_FENCE = register(
            AWRBlockItemIds.HICKORY_FENCE, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE)
    );
    public static final Block HICKORY_FENCE_GATE = register(
            AWRBlockItemIds.HICKORY_FENCE_GATE,
            p -> new FenceGateBlock(AWRWoodTypes.HICKORY, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE_GATE)
    );
    public static final Block HICKORY_DOOR = register(
            AWRBlockItemIds.HICKORY_DOOR,
            p -> new DoorBlock(AWRBlockSetTypes.HICKORY, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_DOOR)
    );
    public static final Block HICKORY_TRAPDOOR = register(
            AWRBlockItemIds.HICKORY_TRAPDOOR,
            p -> new TrapDoorBlock(AWRBlockSetTypes.HICKORY, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_TRAPDOOR)
    );
    public static final Block HICKORY_PRESSURE_PLATE = register(
            AWRBlockItemIds.HICKORY_PRESSURE_PLATE,
            p -> new PressurePlateBlock(AWRBlockSetTypes.HICKORY, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_PRESSURE_PLATE)
    );
    public static final Block HICKORY_BUTTON = register(
            AWRBlockItemIds.HICKORY_BUTTON,
            p -> new ButtonBlock(AWRBlockSetTypes.HICKORY, 30, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_BUTTON)
    );
    public static final Block HICKORY_SIGN = register(
            AWRBlockItemIds.HICKORY_SIGN,
            p -> new StandingSignBlock(AWRWoodTypes.HICKORY, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SIGN)
    );
    public static final Block HICKORY_WALL_SIGN = register(
            AWRBlockIds.HICKORY_WALL_SIGN,
            p -> new WallSignBlock(AWRWoodTypes.HICKORY, p), wallVariant(HICKORY_SIGN, true)
                    .mapColor(HICKORY_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block HICKORY_HANGING_SIGN = register(
            AWRBlockItemIds.HICKORY_HANGING_SIGN,
            p -> new CeilingHangingSignBlock(AWRWoodTypes.HICKORY, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_HANGING_SIGN)
    );
    public static final Block HICKORY_WALL_HANGING_SIGN = register(
            AWRBlockIds.HICKORY_WALL_HANGING_SIGN,
            p -> new WallHangingSignBlock(AWRWoodTypes.HICKORY, p), wallVariant(HICKORY_SIGN, true)
                    .mapColor(HICKORY_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block HICKORY_SHELF = register(
            AWRBlockItemIds.HICKORY_SHELF, ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_SHELF)
    );
    public static final Block HICKORY_LEAVES = register(
            AWRBlockItemIds.HICKORY_LEAVES,
            p -> new FruitLeavesBlock(0.1F, p, AWRLootTables.HARVEST_HICKORY_LEAVES),
            leavesProperties(SoundType.GRASS)
    );
    public static final Block HICKORY_SAPLING = register(
            AWRBlockItemIds.HICKORY_SAPLING, p -> new SaplingBlock(TreeGrower.OAK, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SAPLING)
    );
    public static final Block POTTED_HICKORY_SAPLING = register(
            AWRBlockIds.POTTED_HICKORY_SAPLING, p -> new FlowerPotBlock(HICKORY_SAPLING, p), flowerPotProperties()
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Block JUNIPER_LOG = register(
            AWRBlockItemIds.JUNIPER_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_LOG)
    );
    public static final Block JUNIPER_WOOD = register(
            AWRBlockItemIds.JUNIPER_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_WOOD)
    );
    public static final Block STRIPPED_JUNIPER_LOG = register(
            AWRBlockItemIds.STRIPPED_JUNIPER_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_LOG)
    );
    public static final Block STRIPPED_JUNIPER_WOOD = register(
            AWRBlockItemIds.STRIPPED_JUNIPER_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_WOOD)
    );
    public static final Block JUNIPER_PLANKS = register(
            AWRBlockItemIds.JUNIPER_PLANKS, BlockBehaviour.Properties.ofFullCopy(BIRCH_PLANKS)
    );
    public static final Block JUNIPER_STAIRS = registerStair(AWRBlockItemIds.JUNIPER_STAIRS, JUNIPER_PLANKS);
    public static final Block JUNIPER_SLAB = registerSlab(
            AWRBlockItemIds.JUNIPER_SLAB, JUNIPER_PLANKS
    );
    public static final Block JUNIPER_FENCE = register(
            AWRBlockItemIds.JUNIPER_FENCE, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE)
    );
    public static final Block JUNIPER_FENCE_GATE = register(
            AWRBlockItemIds.JUNIPER_FENCE_GATE,
            p -> new FenceGateBlock(AWRWoodTypes.JUNIPER, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE_GATE)
    );
    public static final Block JUNIPER_DOOR = register(
            AWRBlockItemIds.JUNIPER_DOOR,
            p -> new DoorBlock(AWRBlockSetTypes.JUNIPER, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_DOOR)
    );
    public static final Block JUNIPER_TRAPDOOR = register(
            AWRBlockItemIds.JUNIPER_TRAPDOOR,
            p -> new TrapDoorBlock(AWRBlockSetTypes.JUNIPER, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_TRAPDOOR)
    );
    public static final Block JUNIPER_PRESSURE_PLATE = register(
            AWRBlockItemIds.JUNIPER_PRESSURE_PLATE,
            p -> new PressurePlateBlock(AWRBlockSetTypes.JUNIPER, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_PRESSURE_PLATE)
    );
    public static final Block JUNIPER_BUTTON = register(
            AWRBlockItemIds.JUNIPER_BUTTON,
            p -> new ButtonBlock(AWRBlockSetTypes.JUNIPER, 30, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_BUTTON)
    );
    public static final Block JUNIPER_SIGN = register(
            AWRBlockItemIds.JUNIPER_SIGN,
            p -> new StandingSignBlock(AWRWoodTypes.JUNIPER, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SIGN)
    );
    public static final Block JUNIPER_WALL_SIGN = register(
            AWRBlockIds.JUNIPER_WALL_SIGN,
            p -> new WallSignBlock(AWRWoodTypes.JUNIPER, p), wallVariant(JUNIPER_SIGN, true)
                    .mapColor(JUNIPER_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block JUNIPER_HANGING_SIGN = register(
            AWRBlockItemIds.JUNIPER_HANGING_SIGN,
            p -> new CeilingHangingSignBlock(AWRWoodTypes.JUNIPER, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_HANGING_SIGN)
    );
    public static final Block JUNIPER_WALL_HANGING_SIGN = register(
            AWRBlockIds.JUNIPER_WALL_HANGING_SIGN,
            p -> new WallHangingSignBlock(AWRWoodTypes.JUNIPER, p), wallVariant(JUNIPER_SIGN, true)
                    .mapColor(JUNIPER_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block JUNIPER_SHELF = register(
            AWRBlockItemIds.JUNIPER_SHELF, ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_SHELF)
    );
    public static final Block JUNIPER_LEAVES = register(
            AWRBlockItemIds.JUNIPER_LEAVES,
            p -> new UntintedParticleLeavesBlock(0.1F, ParticleTypes.YELLOW_POPLAR_LEAVES, AmbientLeavesBlockSoundPlayer.noAmbientSound(), p),
            leavesProperties(SoundType.GRASS)
    );
    public static final Block JUNIPER_SAPLING = register(
            AWRBlockItemIds.JUNIPER_SAPLING, p -> new SaplingBlock(TreeGrower.OAK, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SAPLING)
    );
    public static final Block POTTED_JUNIPER_SAPLING = register(
            AWRBlockIds.POTTED_JUNIPER_SAPLING, p -> new FlowerPotBlock(JUNIPER_SAPLING, p), flowerPotProperties()
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Block KAPOK_LOG = register(
            AWRBlockItemIds.KAPOK_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_LOG)
    );
    public static final Block KAPOK_WOOD = register(
            AWRBlockItemIds.KAPOK_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_WOOD)
    );
    public static final Block STRIPPED_KAPOK_LOG = register(
            AWRBlockItemIds.STRIPPED_KAPOK_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_LOG)
    );
    public static final Block STRIPPED_KAPOK_WOOD = register(
            AWRBlockItemIds.STRIPPED_KAPOK_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_WOOD)
    );
    public static final Block KAPOK_PLANKS = register(
            AWRBlockItemIds.KAPOK_PLANKS, BlockBehaviour.Properties.ofFullCopy(BIRCH_PLANKS)
    );
    public static final Block KAPOK_STAIRS = registerStair(AWRBlockItemIds.KAPOK_STAIRS, KAPOK_PLANKS);
    public static final Block KAPOK_SLAB = registerSlab(
            AWRBlockItemIds.KAPOK_SLAB, KAPOK_PLANKS
    );
    public static final Block KAPOK_FENCE = register(
            AWRBlockItemIds.KAPOK_FENCE, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE)
    );
    public static final Block KAPOK_FENCE_GATE = register(
            AWRBlockItemIds.KAPOK_FENCE_GATE,
            p -> new FenceGateBlock(AWRWoodTypes.KAPOK, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE_GATE)
    );
    public static final Block KAPOK_DOOR = register(
            AWRBlockItemIds.KAPOK_DOOR,
            p -> new DoorBlock(AWRBlockSetTypes.KAPOK, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_DOOR)
    );
    public static final Block KAPOK_TRAPDOOR = register(
            AWRBlockItemIds.KAPOK_TRAPDOOR,
            p -> new TrapDoorBlock(AWRBlockSetTypes.KAPOK, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_TRAPDOOR)
    );
    public static final Block KAPOK_PRESSURE_PLATE = register(
            AWRBlockItemIds.KAPOK_PRESSURE_PLATE,
            p -> new PressurePlateBlock(AWRBlockSetTypes.KAPOK, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_PRESSURE_PLATE)
    );
    public static final Block KAPOK_BUTTON = register(
            AWRBlockItemIds.KAPOK_BUTTON,
            p -> new ButtonBlock(AWRBlockSetTypes.KAPOK, 30, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_BUTTON)
    );
    public static final Block KAPOK_SIGN = register(
            AWRBlockItemIds.KAPOK_SIGN,
            p -> new StandingSignBlock(AWRWoodTypes.KAPOK, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SIGN)
    );
    public static final Block KAPOK_WALL_SIGN = register(
            AWRBlockIds.KAPOK_WALL_SIGN,
            p -> new WallSignBlock(AWRWoodTypes.KAPOK, p), wallVariant(KAPOK_SIGN, true)
                    .mapColor(KAPOK_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block KAPOK_HANGING_SIGN = register(
            AWRBlockItemIds.KAPOK_HANGING_SIGN,
            p -> new CeilingHangingSignBlock(AWRWoodTypes.KAPOK, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_HANGING_SIGN)
    );
    public static final Block KAPOK_WALL_HANGING_SIGN = register(
            AWRBlockIds.KAPOK_WALL_HANGING_SIGN,
            p -> new WallHangingSignBlock(AWRWoodTypes.KAPOK, p), wallVariant(KAPOK_SIGN, true)
                    .mapColor(KAPOK_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block KAPOK_SHELF = register(
            AWRBlockItemIds.KAPOK_SHELF, ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_SHELF)
    );
    public static final Block KAPOK_LEAVES = register(
            AWRBlockItemIds.KAPOK_LEAVES,
            p -> new TintedParticleLeavesBlock(0.1F, p),
            leavesProperties(SoundType.GRASS)
    );
    public static final Block KAPOK_SAPLING = register(
            AWRBlockItemIds.KAPOK_SAPLING, p -> new SaplingBlock(TreeGrower.OAK, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SAPLING)
    );
    public static final Block POTTED_KAPOK_SAPLING = register(
            AWRBlockIds.POTTED_KAPOK_SAPLING, p -> new FlowerPotBlock(KAPOK_SAPLING, p), flowerPotProperties()
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Block LARCH_LOG = register(
            AWRBlockItemIds.LARCH_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_LOG)
    );
    public static final Block LARCH_WOOD = register(
            AWRBlockItemIds.LARCH_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_WOOD)
    );
    public static final Block STRIPPED_LARCH_LOG = register(
            AWRBlockItemIds.STRIPPED_LARCH_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_SPRUCE_LOG)
    );
    public static final Block STRIPPED_LARCH_WOOD = register(
            AWRBlockItemIds.STRIPPED_LARCH_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_SPRUCE_WOOD)
    );
    public static final Block LARCH_PLANKS = register(
            AWRBlockItemIds.LARCH_PLANKS, BlockBehaviour.Properties.ofFullCopy(SPRUCE_PLANKS)
    );
    public static final Block LARCH_STAIRS = registerStair(AWRBlockItemIds.LARCH_STAIRS, LARCH_PLANKS);
    public static final Block LARCH_SLAB = registerSlab(
            AWRBlockItemIds.LARCH_SLAB, LARCH_PLANKS
    );
    public static final Block LARCH_FENCE = register(
            AWRBlockItemIds.LARCH_FENCE, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_FENCE)
    );
    public static final Block LARCH_FENCE_GATE = register(
            AWRBlockItemIds.LARCH_FENCE_GATE,
            p -> new FenceGateBlock(AWRWoodTypes.LARCH, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_FENCE_GATE)
    );
    public static final Block LARCH_DOOR = register(
            AWRBlockItemIds.LARCH_DOOR,
            p -> new DoorBlock(AWRBlockSetTypes.LARCH, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_DOOR)
    );
    public static final Block LARCH_TRAPDOOR = register(
            AWRBlockItemIds.LARCH_TRAPDOOR,
            p -> new TrapDoorBlock(AWRBlockSetTypes.LARCH, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_TRAPDOOR)
    );
    public static final Block LARCH_PRESSURE_PLATE = register(
            AWRBlockItemIds.LARCH_PRESSURE_PLATE,
            p -> new PressurePlateBlock(AWRBlockSetTypes.LARCH, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_PRESSURE_PLATE)
    );
    public static final Block LARCH_BUTTON = register(
            AWRBlockItemIds.LARCH_BUTTON,
            p -> new ButtonBlock(AWRBlockSetTypes.LARCH, 30, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_BUTTON)
    );
    public static final Block LARCH_SIGN = register(
            AWRBlockItemIds.LARCH_SIGN,
            p -> new StandingSignBlock(AWRWoodTypes.LARCH, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_SIGN)
    );
    public static final Block LARCH_WALL_SIGN = register(
            AWRBlockIds.LARCH_WALL_SIGN,
            p -> new WallSignBlock(AWRWoodTypes.LARCH, p), wallVariant(LARCH_SIGN, true)
                    .mapColor(LARCH_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block LARCH_HANGING_SIGN = register(
            AWRBlockItemIds.LARCH_HANGING_SIGN,
            p -> new CeilingHangingSignBlock(AWRWoodTypes.LARCH, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_HANGING_SIGN)
    );
    public static final Block LARCH_WALL_HANGING_SIGN = register(
            AWRBlockIds.LARCH_WALL_HANGING_SIGN,
            p -> new WallHangingSignBlock(AWRWoodTypes.LARCH, p), wallVariant(LARCH_SIGN, true)
                    .mapColor(LARCH_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block LARCH_SHELF = register(
            AWRBlockItemIds.LARCH_SHELF, ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_SHELF)
    );
    public static final Block LARCH_LEAVES = register(
            AWRBlockItemIds.LARCH_LEAVES, p -> new LeavesBlock(AmbientLeavesBlockSoundPlayer.noAmbientSound(), p), leavesProperties(SoundType.GRASS)
    );
    public static final Block LARCH_SAPLING = register(
            AWRBlockItemIds.LARCH_SAPLING, p -> new SaplingBlock(AWRTreeGrowers.LARCH, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_SAPLING)
    );
    public static final Block POTTED_LARCH_SAPLING = register(
            AWRBlockIds.POTTED_LARCH_SAPLING, p -> new FlowerPotBlock(LARCH_SAPLING, p), flowerPotProperties()
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Block MAHOGANY_LOG = register(
            AWRBlockItemIds.MAHOGANY_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_LOG)
    );
    public static final Block MAHOGANY_WOOD = register(
            AWRBlockItemIds.MAHOGANY_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_WOOD)
    );
    public static final Block STRIPPED_MAHOGANY_LOG = register(
            AWRBlockItemIds.STRIPPED_MAHOGANY_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_LOG)
    );
    public static final Block STRIPPED_MAHOGANY_WOOD = register(
            AWRBlockItemIds.STRIPPED_MAHOGANY_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_WOOD)
    );
    public static final Block MAHOGANY_PLANKS = register(
            AWRBlockItemIds.MAHOGANY_PLANKS, BlockBehaviour.Properties.ofFullCopy(BIRCH_PLANKS)
    );
    public static final Block MAHOGANY_STAIRS = registerStair(AWRBlockItemIds.MAHOGANY_STAIRS, MAHOGANY_PLANKS);
    public static final Block MAHOGANY_SLAB = registerSlab(
            AWRBlockItemIds.MAHOGANY_SLAB, MAHOGANY_PLANKS
    );
    public static final Block MAHOGANY_FENCE = register(
            AWRBlockItemIds.MAHOGANY_FENCE, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE)
    );
    public static final Block MAHOGANY_FENCE_GATE = register(
            AWRBlockItemIds.MAHOGANY_FENCE_GATE,
            p -> new FenceGateBlock(AWRWoodTypes.MAHOGANY, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE_GATE)
    );
    public static final Block MAHOGANY_DOOR = register(
            AWRBlockItemIds.MAHOGANY_DOOR,
            p -> new DoorBlock(AWRBlockSetTypes.MAHOGANY, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_DOOR)
    );
    public static final Block MAHOGANY_TRAPDOOR = register(
            AWRBlockItemIds.MAHOGANY_TRAPDOOR,
            p -> new TrapDoorBlock(AWRBlockSetTypes.MAHOGANY, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_TRAPDOOR)
    );
    public static final Block MAHOGANY_PRESSURE_PLATE = register(
            AWRBlockItemIds.MAHOGANY_PRESSURE_PLATE,
            p -> new PressurePlateBlock(AWRBlockSetTypes.MAHOGANY, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_PRESSURE_PLATE)
    );
    public static final Block MAHOGANY_BUTTON = register(
            AWRBlockItemIds.MAHOGANY_BUTTON,
            p -> new ButtonBlock(AWRBlockSetTypes.MAHOGANY, 30, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_BUTTON)
    );
    public static final Block MAHOGANY_SIGN = register(
            AWRBlockItemIds.MAHOGANY_SIGN,
            p -> new StandingSignBlock(AWRWoodTypes.MAHOGANY, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SIGN)
    );
    public static final Block MAHOGANY_WALL_SIGN = register(
            AWRBlockIds.MAHOGANY_WALL_SIGN,
            p -> new WallSignBlock(AWRWoodTypes.MAHOGANY, p), wallVariant(MAHOGANY_SIGN, true)
                    .mapColor(MAHOGANY_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block MAHOGANY_HANGING_SIGN = register(
            AWRBlockItemIds.MAHOGANY_HANGING_SIGN,
            p -> new CeilingHangingSignBlock(AWRWoodTypes.MAHOGANY, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_HANGING_SIGN)
    );
    public static final Block MAHOGANY_WALL_HANGING_SIGN = register(
            AWRBlockIds.MAHOGANY_WALL_HANGING_SIGN,
            p -> new WallHangingSignBlock(AWRWoodTypes.MAHOGANY, p), wallVariant(MAHOGANY_SIGN, true)
                    .mapColor(MAHOGANY_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block MAHOGANY_SHELF = register(
            AWRBlockItemIds.MAHOGANY_SHELF, ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_SHELF)
    );
    public static final Block MAHOGANY_LEAVES = register(
            AWRBlockItemIds.MAHOGANY_LEAVES,
            p -> new TintedParticleLeavesBlock(0.1F, p),
            leavesProperties(SoundType.GRASS)
    );
    public static final Block MAHOGANY_SAPLING = register(
            AWRBlockItemIds.MAHOGANY_SAPLING, p -> new SaplingBlock(TreeGrower.OAK, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SAPLING)
    );
    public static final Block POTTED_MAHOGANY_SAPLING = register(
            AWRBlockIds.POTTED_MAHOGANY_SAPLING, p -> new FlowerPotBlock(MAHOGANY_SAPLING, p), flowerPotProperties()
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Block MAPLE_LOG = register(
            AWRBlockItemIds.MAPLE_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_LOG)
    );
    public static final Block MAPLE_WOOD = register(
            AWRBlockItemIds.MAPLE_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_WOOD)
    );
    public static final Block STRIPPED_MAPLE_LOG = register(
            AWRBlockItemIds.STRIPPED_MAPLE_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_LOG)
    );
    public static final Block STRIPPED_MAPLE_WOOD = register(
            AWRBlockItemIds.STRIPPED_MAPLE_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_WOOD)
    );
    public static final Block MAPLE_PLANKS = register(
            AWRBlockItemIds.MAPLE_PLANKS, BlockBehaviour.Properties.ofFullCopy(BIRCH_PLANKS)
    );
    public static final Block MAPLE_STAIRS = registerStair(AWRBlockItemIds.MAPLE_STAIRS, MAPLE_PLANKS);
    public static final Block MAPLE_SLAB = registerSlab(
            AWRBlockItemIds.MAPLE_SLAB, MAPLE_PLANKS
    );
    public static final Block MAPLE_FENCE = register(
            AWRBlockItemIds.MAPLE_FENCE, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE)
    );
    public static final Block MAPLE_FENCE_GATE = register(
            AWRBlockItemIds.MAPLE_FENCE_GATE,
            p -> new FenceGateBlock(AWRWoodTypes.MAPLE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE_GATE)
    );
    public static final Block MAPLE_DOOR = register(
            AWRBlockItemIds.MAPLE_DOOR,
            p -> new DoorBlock(AWRBlockSetTypes.MAPLE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_DOOR)
    );
    public static final Block MAPLE_TRAPDOOR = register(
            AWRBlockItemIds.MAPLE_TRAPDOOR,
            p -> new TrapDoorBlock(AWRBlockSetTypes.MAPLE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_TRAPDOOR)
    );
    public static final Block MAPLE_PRESSURE_PLATE = register(
            AWRBlockItemIds.MAPLE_PRESSURE_PLATE,
            p -> new PressurePlateBlock(AWRBlockSetTypes.MAPLE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_PRESSURE_PLATE)
    );
    public static final Block MAPLE_BUTTON = register(
            AWRBlockItemIds.MAPLE_BUTTON,
            p -> new ButtonBlock(AWRBlockSetTypes.MAPLE, 30, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_BUTTON)
    );
    public static final Block MAPLE_SIGN = register(
            AWRBlockItemIds.MAPLE_SIGN,
            p -> new StandingSignBlock(AWRWoodTypes.MAPLE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SIGN)
    );
    public static final Block MAPLE_WALL_SIGN = register(
            AWRBlockIds.MAPLE_WALL_SIGN,
            p -> new WallSignBlock(AWRWoodTypes.MAPLE, p), wallVariant(MAPLE_SIGN, true)
                    .mapColor(MAPLE_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block MAPLE_HANGING_SIGN = register(
            AWRBlockItemIds.MAPLE_HANGING_SIGN,
            p -> new CeilingHangingSignBlock(AWRWoodTypes.MAPLE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_HANGING_SIGN)
    );
    public static final Block MAPLE_WALL_HANGING_SIGN = register(
            AWRBlockIds.MAPLE_WALL_HANGING_SIGN,
            p -> new WallHangingSignBlock(AWRWoodTypes.MAPLE, p), wallVariant(MAPLE_SIGN, true)
                    .mapColor(MAPLE_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block MAPLE_SHELF = register(
            AWRBlockItemIds.MAPLE_SHELF, ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_SHELF)
    );
    public static final Block MAPLE_LEAVES = register(
            AWRBlockItemIds.MAPLE_LEAVES,
            p -> new TintedParticleLeavesBlock(0.1F, p),
            leavesProperties(SoundType.GRASS)
    );
    public static final Block MAPLE_SAPLING = register(
            AWRBlockItemIds.MAPLE_SAPLING, p -> new SaplingBlock(TreeGrower.OAK, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SAPLING)
    );
    public static final Block POTTED_MAPLE_SAPLING = register(
            AWRBlockIds.POTTED_MAPLE_SAPLING, p -> new FlowerPotBlock(MAPLE_SAPLING, p), flowerPotProperties()
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Block MESQUITE_LOG = register(
            AWRBlockItemIds.MESQUITE_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_LOG)
    );
    public static final Block MESQUITE_WOOD = register(
            AWRBlockItemIds.MESQUITE_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_WOOD)
    );
    public static final Block STRIPPED_MESQUITE_LOG = register(
            AWRBlockItemIds.STRIPPED_MESQUITE_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_LOG)
    );
    public static final Block STRIPPED_MESQUITE_WOOD = register(
            AWRBlockItemIds.STRIPPED_MESQUITE_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_WOOD)
    );
    public static final Block MESQUITE_PLANKS = register(
            AWRBlockItemIds.MESQUITE_PLANKS, BlockBehaviour.Properties.ofFullCopy(BIRCH_PLANKS)
    );
    public static final Block MESQUITE_STAIRS = registerStair(AWRBlockItemIds.MESQUITE_STAIRS, MESQUITE_PLANKS);
    public static final Block MESQUITE_SLAB = registerSlab(
            AWRBlockItemIds.MESQUITE_SLAB, MESQUITE_PLANKS
    );
    public static final Block MESQUITE_FENCE = register(
            AWRBlockItemIds.MESQUITE_FENCE, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE)
    );
    public static final Block MESQUITE_FENCE_GATE = register(
            AWRBlockItemIds.MESQUITE_FENCE_GATE,
            p -> new FenceGateBlock(AWRWoodTypes.MESQUITE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE_GATE)
    );
    public static final Block MESQUITE_DOOR = register(
            AWRBlockItemIds.MESQUITE_DOOR,
            p -> new DoorBlock(AWRBlockSetTypes.MESQUITE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_DOOR)
    );
    public static final Block MESQUITE_TRAPDOOR = register(
            AWRBlockItemIds.MESQUITE_TRAPDOOR,
            p -> new TrapDoorBlock(AWRBlockSetTypes.MESQUITE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_TRAPDOOR)
    );
    public static final Block MESQUITE_PRESSURE_PLATE = register(
            AWRBlockItemIds.MESQUITE_PRESSURE_PLATE,
            p -> new PressurePlateBlock(AWRBlockSetTypes.MESQUITE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_PRESSURE_PLATE)
    );
    public static final Block MESQUITE_BUTTON = register(
            AWRBlockItemIds.MESQUITE_BUTTON,
            p -> new ButtonBlock(AWRBlockSetTypes.MESQUITE, 30, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_BUTTON)
    );
    public static final Block MESQUITE_SIGN = register(
            AWRBlockItemIds.MESQUITE_SIGN,
            p -> new StandingSignBlock(AWRWoodTypes.MESQUITE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SIGN)
    );
    public static final Block MESQUITE_WALL_SIGN = register(
            AWRBlockIds.MESQUITE_WALL_SIGN,
            p -> new WallSignBlock(AWRWoodTypes.MESQUITE, p), wallVariant(MESQUITE_SIGN, true)
                    .mapColor(MESQUITE_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block MESQUITE_HANGING_SIGN = register(
            AWRBlockItemIds.MESQUITE_HANGING_SIGN,
            p -> new CeilingHangingSignBlock(AWRWoodTypes.MESQUITE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_HANGING_SIGN)
    );
    public static final Block MESQUITE_WALL_HANGING_SIGN = register(
            AWRBlockIds.MESQUITE_WALL_HANGING_SIGN,
            p -> new WallHangingSignBlock(AWRWoodTypes.MESQUITE, p), wallVariant(MESQUITE_SIGN, true)
                    .mapColor(MESQUITE_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block MESQUITE_SHELF = register(
            AWRBlockItemIds.MESQUITE_SHELF, ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_SHELF)
    );
    public static final Block MESQUITE_LEAVES = register(
            AWRBlockItemIds.MESQUITE_LEAVES,
            p -> new UntintedParticleLeavesBlock(0.1F, ParticleTypes.YELLOW_POPLAR_LEAVES, AmbientLeavesBlockSoundPlayer.noAmbientSound(), p),
            leavesProperties(SoundType.GRASS)
    );
    public static final Block MESQUITE_SAPLING = register(
            AWRBlockItemIds.MESQUITE_SAPLING, p -> new SaplingBlock(TreeGrower.OAK, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SAPLING)
    );
    public static final Block POTTED_MESQUITE_SAPLING = register(
            AWRBlockIds.POTTED_MESQUITE_SAPLING, p -> new FlowerPotBlock(MESQUITE_SAPLING, p), flowerPotProperties()
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Block OLIVE_LOG = register(
            AWRBlockItemIds.OLIVE_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_LOG)
    );
    public static final Block OLIVE_WOOD = register(
            AWRBlockItemIds.OLIVE_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_WOOD)
    );
    public static final Block STRIPPED_OLIVE_LOG = register(
            AWRBlockItemIds.STRIPPED_OLIVE_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_LOG)
    );
    public static final Block STRIPPED_OLIVE_WOOD = register(
            AWRBlockItemIds.STRIPPED_OLIVE_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_WOOD)
    );
    public static final Block OLIVE_PLANKS = register(
            AWRBlockItemIds.OLIVE_PLANKS, BlockBehaviour.Properties.ofFullCopy(BIRCH_PLANKS)
    );
    public static final Block OLIVE_STAIRS = registerStair(AWRBlockItemIds.OLIVE_STAIRS, OLIVE_PLANKS);
    public static final Block OLIVE_SLAB = registerSlab(
            AWRBlockItemIds.OLIVE_SLAB, OLIVE_PLANKS
    );
    public static final Block OLIVE_FENCE = register(
            AWRBlockItemIds.OLIVE_FENCE, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE)
    );
    public static final Block OLIVE_FENCE_GATE = register(
            AWRBlockItemIds.OLIVE_FENCE_GATE,
            p -> new FenceGateBlock(AWRWoodTypes.OLIVE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE_GATE)
    );
    public static final Block OLIVE_DOOR = register(
            AWRBlockItemIds.OLIVE_DOOR,
            p -> new DoorBlock(AWRBlockSetTypes.OLIVE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_DOOR)
    );
    public static final Block OLIVE_TRAPDOOR = register(
            AWRBlockItemIds.OLIVE_TRAPDOOR,
            p -> new TrapDoorBlock(AWRBlockSetTypes.OLIVE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_TRAPDOOR)
    );
    public static final Block OLIVE_PRESSURE_PLATE = register(
            AWRBlockItemIds.OLIVE_PRESSURE_PLATE,
            p -> new PressurePlateBlock(AWRBlockSetTypes.OLIVE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_PRESSURE_PLATE)
    );
    public static final Block OLIVE_BUTTON = register(
            AWRBlockItemIds.OLIVE_BUTTON,
            p -> new ButtonBlock(AWRBlockSetTypes.OLIVE, 30, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_BUTTON)
    );
    public static final Block OLIVE_SIGN = register(
            AWRBlockItemIds.OLIVE_SIGN,
            p -> new StandingSignBlock(AWRWoodTypes.OLIVE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SIGN)
    );
    public static final Block OLIVE_WALL_SIGN = register(
            AWRBlockIds.OLIVE_WALL_SIGN,
            p -> new WallSignBlock(AWRWoodTypes.OLIVE, p), wallVariant(OLIVE_SIGN, true)
                    .mapColor(OLIVE_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block OLIVE_HANGING_SIGN = register(
            AWRBlockItemIds.OLIVE_HANGING_SIGN,
            p -> new CeilingHangingSignBlock(AWRWoodTypes.OLIVE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_HANGING_SIGN)
    );
    public static final Block OLIVE_WALL_HANGING_SIGN = register(
            AWRBlockIds.OLIVE_WALL_HANGING_SIGN,
            p -> new WallHangingSignBlock(AWRWoodTypes.OLIVE, p), wallVariant(OLIVE_SIGN, true)
                    .mapColor(OLIVE_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block OLIVE_SHELF = register(
            AWRBlockItemIds.OLIVE_SHELF, ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_SHELF)
    );
    public static final Block OLIVE_LEAVES = register(
            AWRBlockItemIds.OLIVE_LEAVES,
            p -> new FruitLeavesBlock(0.1F, p, AWRLootTables.HARVEST_OLIVE_LEAVES),
            leavesProperties(SoundType.GRASS)
    );
    public static final Block OLIVE_SAPLING = register(
            AWRBlockItemIds.OLIVE_SAPLING, p -> new SaplingBlock(TreeGrower.OAK, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SAPLING)
    );
    public static final Block POTTED_OLIVE_SAPLING = register(
            AWRBlockIds.POTTED_OLIVE_SAPLING, p -> new FlowerPotBlock(OLIVE_SAPLING, p), flowerPotProperties()
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Block PALM_LOG = register(
            AWRBlockItemIds.PALM_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_LOG)
    );
    public static final Block PALM_WOOD = register(
            AWRBlockItemIds.PALM_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_WOOD)
    );
    public static final Block STRIPPED_PALM_LOG = register(
            AWRBlockItemIds.STRIPPED_PALM_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_LOG)
    );
    public static final Block STRIPPED_PALM_WOOD = register(
            AWRBlockItemIds.STRIPPED_PALM_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_WOOD)
    );
    public static final Block PALM_PLANKS = register(
            AWRBlockItemIds.PALM_PLANKS, BlockBehaviour.Properties.ofFullCopy(BIRCH_PLANKS)
    );
    public static final Block PALM_STAIRS = registerStair(AWRBlockItemIds.PALM_STAIRS, PALM_PLANKS);
    public static final Block PALM_SLAB = registerSlab(
            AWRBlockItemIds.PALM_SLAB, PALM_PLANKS
    );
    public static final Block PALM_FENCE = register(
            AWRBlockItemIds.PALM_FENCE, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE)
    );
    public static final Block PALM_FENCE_GATE = register(
            AWRBlockItemIds.PALM_FENCE_GATE,
            p -> new FenceGateBlock(AWRWoodTypes.PALM, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE_GATE)
    );
    public static final Block PALM_DOOR = register(
            AWRBlockItemIds.PALM_DOOR,
            p -> new DoorBlock(AWRBlockSetTypes.PALM, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_DOOR)
    );
    public static final Block PALM_TRAPDOOR = register(
            AWRBlockItemIds.PALM_TRAPDOOR,
            p -> new TrapDoorBlock(AWRBlockSetTypes.PALM, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_TRAPDOOR)
    );
    public static final Block PALM_PRESSURE_PLATE = register(
            AWRBlockItemIds.PALM_PRESSURE_PLATE,
            p -> new PressurePlateBlock(AWRBlockSetTypes.PALM, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_PRESSURE_PLATE)
    );
    public static final Block PALM_BUTTON = register(
            AWRBlockItemIds.PALM_BUTTON,
            p -> new ButtonBlock(AWRBlockSetTypes.PALM, 30, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_BUTTON)
    );
    public static final Block PALM_SIGN = register(
            AWRBlockItemIds.PALM_SIGN,
            p -> new StandingSignBlock(AWRWoodTypes.PALM, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SIGN)
    );
    public static final Block PALM_WALL_SIGN = register(
            AWRBlockIds.PALM_WALL_SIGN,
            p -> new WallSignBlock(AWRWoodTypes.PALM, p), wallVariant(PALM_SIGN, true)
                    .mapColor(PALM_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block PALM_HANGING_SIGN = register(
            AWRBlockItemIds.PALM_HANGING_SIGN,
            p -> new CeilingHangingSignBlock(AWRWoodTypes.PALM, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_HANGING_SIGN)
    );
    public static final Block PALM_WALL_HANGING_SIGN = register(
            AWRBlockIds.PALM_WALL_HANGING_SIGN,
            p -> new WallHangingSignBlock(AWRWoodTypes.PALM, p), wallVariant(PALM_SIGN, true)
                    .mapColor(PALM_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block PALM_SHELF = register(
            AWRBlockItemIds.PALM_SHELF, ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_SHELF)
    );
    public static final Block PALM_LEAVES = register(
            AWRBlockItemIds.PALM_LEAVES,
            p -> new TintedParticleLeavesBlock(0.1F, p),
            leavesProperties(SoundType.GRASS)
    );
    public static final Block PALM_SAPLING = register(
            AWRBlockItemIds.PALM_SAPLING, p -> new SaplingBlock(TreeGrower.OAK, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SAPLING)
    );
    public static final Block POTTED_PALM_SAPLING = register(
            AWRBlockIds.POTTED_PALM_SAPLING, p -> new FlowerPotBlock(PALM_SAPLING, p), flowerPotProperties()
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Block PALO_VERDE_LOG = register(
            AWRBlockItemIds.PALO_VERDE_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_LOG)
    );
    public static final Block PALO_VERDE_WOOD = register(
            AWRBlockItemIds.PALO_VERDE_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_WOOD)
    );
    public static final Block STRIPPED_PALO_VERDE_LOG = register(
            AWRBlockItemIds.STRIPPED_PALO_VERDE_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_LOG)
    );
    public static final Block STRIPPED_PALO_VERDE_WOOD = register(
            AWRBlockItemIds.STRIPPED_PALO_VERDE_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_WOOD)
    );
    public static final Block PALO_VERDE_PLANKS = register(
            AWRBlockItemIds.PALO_VERDE_PLANKS, BlockBehaviour.Properties.ofFullCopy(BIRCH_PLANKS)
    );
    public static final Block PALO_VERDE_STAIRS = registerStair(AWRBlockItemIds.PALO_VERDE_STAIRS, PALO_VERDE_PLANKS);
    public static final Block PALO_VERDE_SLAB = registerSlab(
            AWRBlockItemIds.PALO_VERDE_SLAB, PALO_VERDE_PLANKS
    );
    public static final Block PALO_VERDE_FENCE = register(
            AWRBlockItemIds.PALO_VERDE_FENCE, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE)
    );
    public static final Block PALO_VERDE_FENCE_GATE = register(
            AWRBlockItemIds.PALO_VERDE_FENCE_GATE,
            p -> new FenceGateBlock(AWRWoodTypes.PALO_VERDE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE_GATE)
    );
    public static final Block PALO_VERDE_DOOR = register(
            AWRBlockItemIds.PALO_VERDE_DOOR,
            p -> new DoorBlock(AWRBlockSetTypes.PALO_VERDE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_DOOR)
    );
    public static final Block PALO_VERDE_TRAPDOOR = register(
            AWRBlockItemIds.PALO_VERDE_TRAPDOOR,
            p -> new TrapDoorBlock(AWRBlockSetTypes.PALO_VERDE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_TRAPDOOR)
    );
    public static final Block PALO_VERDE_PRESSURE_PLATE = register(
            AWRBlockItemIds.PALO_VERDE_PRESSURE_PLATE,
            p -> new PressurePlateBlock(AWRBlockSetTypes.PALO_VERDE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_PRESSURE_PLATE)
    );
    public static final Block PALO_VERDE_BUTTON = register(
            AWRBlockItemIds.PALO_VERDE_BUTTON,
            p -> new ButtonBlock(AWRBlockSetTypes.PALO_VERDE, 30, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_BUTTON)
    );
    public static final Block PALO_VERDE_SIGN = register(
            AWRBlockItemIds.PALO_VERDE_SIGN,
            p -> new StandingSignBlock(AWRWoodTypes.PALO_VERDE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SIGN)
    );
    public static final Block PALO_VERDE_WALL_SIGN = register(
            AWRBlockIds.PALO_VERDE_WALL_SIGN,
            p -> new WallSignBlock(AWRWoodTypes.PALO_VERDE, p), wallVariant(PALO_VERDE_SIGN, true)
                    .mapColor(PALO_VERDE_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block PALO_VERDE_HANGING_SIGN = register(
            AWRBlockItemIds.PALO_VERDE_HANGING_SIGN,
            p -> new CeilingHangingSignBlock(AWRWoodTypes.PALO_VERDE, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_HANGING_SIGN)
    );
    public static final Block PALO_VERDE_WALL_HANGING_SIGN = register(
            AWRBlockIds.PALO_VERDE_WALL_HANGING_SIGN,
            p -> new WallHangingSignBlock(AWRWoodTypes.PALO_VERDE, p), wallVariant(PALO_VERDE_SIGN, true)
                    .mapColor(PALO_VERDE_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block PALO_VERDE_SHELF = register(
            AWRBlockItemIds.PALO_VERDE_SHELF, ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_SHELF)
    );
    public static final Block PALO_VERDE_LEAVES = register(
            AWRBlockItemIds.PALO_VERDE_LEAVES,
            p -> new UntintedParticleLeavesBlock(0.1F, ParticleTypes.YELLOW_POPLAR_LEAVES, AmbientLeavesBlockSoundPlayer.noAmbientSound(), p),
            leavesProperties(SoundType.GRASS)
    );
    public static final Block PALO_VERDE_SAPLING = register(
            AWRBlockItemIds.PALO_VERDE_SAPLING, p -> new SaplingBlock(TreeGrower.OAK, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SAPLING)
    );
    public static final Block POTTED_PALO_VERDE_SAPLING = register(
            AWRBlockIds.POTTED_PALO_VERDE_SAPLING, p -> new FlowerPotBlock(PALO_VERDE_SAPLING, p), flowerPotProperties()
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Block PINE_LOG = register(
            AWRBlockItemIds.PINE_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_LOG)
    );
    public static final Block PINE_WOOD = register(
            AWRBlockItemIds.PINE_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_WOOD)
    );
    public static final Block STRIPPED_PINE_LOG = register(
            AWRBlockItemIds.STRIPPED_PINE_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_SPRUCE_LOG)
    );
    public static final Block STRIPPED_PINE_WOOD = register(
            AWRBlockItemIds.STRIPPED_PINE_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_SPRUCE_WOOD)
    );
    public static final Block PINE_PLANKS = register(
            AWRBlockItemIds.PINE_PLANKS, BlockBehaviour.Properties.ofFullCopy(SPRUCE_PLANKS)
    );
    public static final Block PINE_STAIRS = registerStair(AWRBlockItemIds.PINE_STAIRS, PINE_PLANKS);
    public static final Block PINE_SLAB = registerSlab(
            AWRBlockItemIds.PINE_SLAB, PINE_PLANKS
    );
    public static final Block PINE_FENCE = register(
            AWRBlockItemIds.PINE_FENCE, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_FENCE)
    );
    public static final Block PINE_FENCE_GATE = register(
            AWRBlockItemIds.PINE_FENCE_GATE,
            p -> new FenceGateBlock(AWRWoodTypes.PINE, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_FENCE_GATE)
    );
    public static final Block PINE_DOOR = register(
            AWRBlockItemIds.PINE_DOOR,
            p -> new DoorBlock(AWRBlockSetTypes.PINE, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_DOOR)
    );
    public static final Block PINE_TRAPDOOR = register(
            AWRBlockItemIds.PINE_TRAPDOOR,
            p -> new TrapDoorBlock(AWRBlockSetTypes.PINE, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_TRAPDOOR)
    );
    public static final Block PINE_PRESSURE_PLATE = register(
            AWRBlockItemIds.PINE_PRESSURE_PLATE,
            p -> new PressurePlateBlock(AWRBlockSetTypes.PINE, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_PRESSURE_PLATE)
    );
    public static final Block PINE_BUTTON = register(
            AWRBlockItemIds.PINE_BUTTON,
            p -> new ButtonBlock(AWRBlockSetTypes.PINE, 30, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_BUTTON)
    );
    public static final Block PINE_SIGN = register(
            AWRBlockItemIds.PINE_SIGN,
            p -> new StandingSignBlock(AWRWoodTypes.PINE, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_SIGN)
    );
    public static final Block PINE_WALL_SIGN = register(
            AWRBlockIds.PINE_WALL_SIGN,
            p -> new WallSignBlock(AWRWoodTypes.PINE, p), wallVariant(PINE_SIGN, true)
                    .mapColor(PINE_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block PINE_HANGING_SIGN = register(
            AWRBlockItemIds.PINE_HANGING_SIGN,
            p -> new CeilingHangingSignBlock(AWRWoodTypes.PINE, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_HANGING_SIGN)
    );
    public static final Block PINE_WALL_HANGING_SIGN = register(
            AWRBlockIds.PINE_WALL_HANGING_SIGN,
            p -> new WallHangingSignBlock(AWRWoodTypes.PINE, p), wallVariant(PINE_SIGN, true)
                    .mapColor(PINE_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block PINE_SHELF = register(
            AWRBlockItemIds.PINE_SHELF, ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_SHELF)
    );
    public static final Block PINE_LEAVES = register(
            AWRBlockItemIds.PINE_LEAVES, p -> new LeavesBlock(AmbientLeavesBlockSoundPlayer.noAmbientSound(), p), leavesProperties(SoundType.GRASS)
    );
    public static final Block PINE_SAPLING = register(
            AWRBlockItemIds.PINE_SAPLING, p -> new SaplingBlock(AWRTreeGrowers.PINE, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_SAPLING)
    );
    public static final Block POTTED_PINE_SAPLING = register(
            AWRBlockIds.POTTED_PINE_SAPLING, p -> new FlowerPotBlock(PINE_SAPLING, p), flowerPotProperties()
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Block REDWOOD_LOG = register(
            AWRBlockItemIds.REDWOOD_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_LOG)
    );
    public static final Block REDWOOD_WOOD = register(
            AWRBlockItemIds.REDWOOD_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_WOOD)
    );
    public static final Block STRIPPED_REDWOOD_LOG = register(
            AWRBlockItemIds.STRIPPED_REDWOOD_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_SPRUCE_LOG)
    );
    public static final Block STRIPPED_REDWOOD_WOOD = register(
            AWRBlockItemIds.STRIPPED_REDWOOD_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_SPRUCE_WOOD)
    );
    public static final Block REDWOOD_PLANKS = register(
            AWRBlockItemIds.REDWOOD_PLANKS, BlockBehaviour.Properties.ofFullCopy(SPRUCE_PLANKS)
    );
    public static final Block REDWOOD_STAIRS = registerStair(AWRBlockItemIds.REDWOOD_STAIRS, REDWOOD_PLANKS);
    public static final Block REDWOOD_SLAB = registerSlab(
            AWRBlockItemIds.REDWOOD_SLAB, REDWOOD_PLANKS
    );
    public static final Block REDWOOD_FENCE = register(
            AWRBlockItemIds.REDWOOD_FENCE, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_FENCE)
    );
    public static final Block REDWOOD_FENCE_GATE = register(
            AWRBlockItemIds.REDWOOD_FENCE_GATE,
            p -> new FenceGateBlock(AWRWoodTypes.REDWOOD, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_FENCE_GATE)
    );
    public static final Block REDWOOD_DOOR = register(
            AWRBlockItemIds.REDWOOD_DOOR,
            p -> new DoorBlock(AWRBlockSetTypes.REDWOOD, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_DOOR)
    );
    public static final Block REDWOOD_TRAPDOOR = register(
            AWRBlockItemIds.REDWOOD_TRAPDOOR,
            p -> new TrapDoorBlock(AWRBlockSetTypes.REDWOOD, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_TRAPDOOR)
    );
    public static final Block REDWOOD_PRESSURE_PLATE = register(
            AWRBlockItemIds.REDWOOD_PRESSURE_PLATE,
            p -> new PressurePlateBlock(AWRBlockSetTypes.REDWOOD, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_PRESSURE_PLATE)
    );
    public static final Block REDWOOD_BUTTON = register(
            AWRBlockItemIds.REDWOOD_BUTTON,
            p -> new ButtonBlock(AWRBlockSetTypes.REDWOOD, 30, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_BUTTON)
    );
    public static final Block REDWOOD_SIGN = register(
            AWRBlockItemIds.REDWOOD_SIGN,
            p -> new StandingSignBlock(AWRWoodTypes.REDWOOD, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_SIGN)
    );
    public static final Block REDWOOD_WALL_SIGN = register(
            AWRBlockIds.REDWOOD_WALL_SIGN,
            p -> new WallSignBlock(AWRWoodTypes.REDWOOD, p), wallVariant(REDWOOD_SIGN, true)
                    .mapColor(REDWOOD_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block REDWOOD_HANGING_SIGN = register(
            AWRBlockItemIds.REDWOOD_HANGING_SIGN,
            p -> new CeilingHangingSignBlock(AWRWoodTypes.REDWOOD, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_HANGING_SIGN)
    );
    public static final Block REDWOOD_WALL_HANGING_SIGN = register(
            AWRBlockIds.REDWOOD_WALL_HANGING_SIGN,
            p -> new WallHangingSignBlock(AWRWoodTypes.REDWOOD, p), wallVariant(REDWOOD_SIGN, true)
                    .mapColor(REDWOOD_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block REDWOOD_SHELF = register(
            AWRBlockItemIds.REDWOOD_SHELF, ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_SHELF)
    );
    public static final Block REDWOOD_LEAVES = register(
            AWRBlockItemIds.REDWOOD_LEAVES, p -> new LeavesBlock(AmbientLeavesBlockSoundPlayer.noAmbientSound(), p), leavesProperties(SoundType.GRASS)
    );
    public static final Block REDWOOD_SAPLING = register(
            AWRBlockItemIds.REDWOOD_SAPLING, p -> new GiantSaplingBlock(AWRTreeGrowers.REDWOOD, p), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_SAPLING)
    );
    public static final Block POTTED_REDWOOD_SAPLING = register(
            AWRBlockIds.POTTED_REDWOOD_SAPLING, p -> new FlowerPotBlock(REDWOOD_SAPLING, p), flowerPotProperties()
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Block SEQUOIA_LOG = register(
            AWRBlockItemIds.SEQUOIA_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_LOG)
    );
    public static final Block SEQUOIA_WOOD = register(
            AWRBlockItemIds.SEQUOIA_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_WOOD)
    );
    public static final Block STRIPPED_SEQUOIA_LOG = register(
            AWRBlockItemIds.STRIPPED_SEQUOIA_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_SPRUCE_LOG)
    );
    public static final Block STRIPPED_SEQUOIA_WOOD = register(
            AWRBlockItemIds.STRIPPED_SEQUOIA_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_SPRUCE_WOOD)
    );
    public static final Block SEQUOIA_PLANKS = register(
            AWRBlockItemIds.SEQUOIA_PLANKS, BlockBehaviour.Properties.ofFullCopy(SPRUCE_PLANKS)
    );
    public static final Block SEQUOIA_STAIRS = registerStair(AWRBlockItemIds.SEQUOIA_STAIRS, SEQUOIA_PLANKS);
    public static final Block SEQUOIA_SLAB = registerSlab(
            AWRBlockItemIds.SEQUOIA_SLAB, SEQUOIA_PLANKS
    );
    public static final Block SEQUOIA_FENCE = register(
            AWRBlockItemIds.SEQUOIA_FENCE, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_FENCE)
    );
    public static final Block SEQUOIA_FENCE_GATE = register(
            AWRBlockItemIds.SEQUOIA_FENCE_GATE,
            p -> new FenceGateBlock(AWRWoodTypes.SEQUOIA, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_FENCE_GATE)
    );
    public static final Block SEQUOIA_DOOR = register(
            AWRBlockItemIds.SEQUOIA_DOOR,
            p -> new DoorBlock(AWRBlockSetTypes.SEQUOIA, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_DOOR)
    );
    public static final Block SEQUOIA_TRAPDOOR = register(
            AWRBlockItemIds.SEQUOIA_TRAPDOOR,
            p -> new TrapDoorBlock(AWRBlockSetTypes.SEQUOIA, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_TRAPDOOR)
    );
    public static final Block SEQUOIA_PRESSURE_PLATE = register(
            AWRBlockItemIds.SEQUOIA_PRESSURE_PLATE,
            p -> new PressurePlateBlock(AWRBlockSetTypes.SEQUOIA, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_PRESSURE_PLATE)
    );
    public static final Block SEQUOIA_BUTTON = register(
            AWRBlockItemIds.SEQUOIA_BUTTON,
            p -> new ButtonBlock(AWRBlockSetTypes.SEQUOIA, 30, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_BUTTON)
    );
    public static final Block SEQUOIA_SIGN = register(
            AWRBlockItemIds.SEQUOIA_SIGN,
            p -> new StandingSignBlock(AWRWoodTypes.SEQUOIA, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_SIGN)
    );
    public static final Block SEQUOIA_WALL_SIGN = register(
            AWRBlockIds.SEQUOIA_WALL_SIGN,
            p -> new WallSignBlock(AWRWoodTypes.SEQUOIA, p), wallVariant(SEQUOIA_SIGN, true)
                    .mapColor(SEQUOIA_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block SEQUOIA_HANGING_SIGN = register(
            AWRBlockItemIds.SEQUOIA_HANGING_SIGN,
            p -> new CeilingHangingSignBlock(AWRWoodTypes.SEQUOIA, p), BlockBehaviour.Properties.ofFullCopy(SPRUCE_HANGING_SIGN)
    );
    public static final Block SEQUOIA_WALL_HANGING_SIGN = register(
            AWRBlockIds.SEQUOIA_WALL_HANGING_SIGN,
            p -> new WallHangingSignBlock(AWRWoodTypes.SEQUOIA, p), wallVariant(SEQUOIA_SIGN, true)
                    .mapColor(SEQUOIA_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block SEQUOIA_SHELF = register(
            AWRBlockItemIds.SEQUOIA_SHELF, ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_SHELF)
    );
    public static final Block SEQUOIA_LEAVES = register(
            AWRBlockItemIds.SEQUOIA_LEAVES, p -> new LeavesBlock(AmbientLeavesBlockSoundPlayer.noAmbientSound(), p), leavesProperties(SoundType.GRASS)
    );
    public static final Block SEQUOIA_SAPLING = register(
            AWRBlockItemIds.SEQUOIA_SAPLING, p -> new GiantSaplingBlock(AWRTreeGrowers.SEQUOIA, p), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_SAPLING)
    );
    public static final Block POTTED_SEQUOIA_SAPLING = register(
            AWRBlockIds.POTTED_SEQUOIA_SAPLING, p -> new FlowerPotBlock(SEQUOIA_SAPLING, p), flowerPotProperties()
    );
    
    //' ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static final Block WILLOW_LOG = register(
            AWRBlockItemIds.WILLOW_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_LOG)
    );
    public static final Block WILLOW_WOOD = register(
            AWRBlockItemIds.WILLOW_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_WOOD)
    );
    public static final Block STRIPPED_WILLOW_LOG = register(
            AWRBlockItemIds.STRIPPED_WILLOW_LOG, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_LOG)
    );
    public static final Block STRIPPED_WILLOW_WOOD = register(
            AWRBlockItemIds.STRIPPED_WILLOW_WOOD, RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(STRIPPED_BIRCH_WOOD)
    );
    public static final Block WILLOW_PLANKS = register(
            AWRBlockItemIds.WILLOW_PLANKS, BlockBehaviour.Properties.ofFullCopy(BIRCH_PLANKS)
    );
    public static final Block WILLOW_STAIRS = registerStair(AWRBlockItemIds.WILLOW_STAIRS, WILLOW_PLANKS);
    public static final Block WILLOW_SLAB = registerSlab(
            AWRBlockItemIds.WILLOW_SLAB, WILLOW_PLANKS
    );
    public static final Block WILLOW_FENCE = register(
            AWRBlockItemIds.WILLOW_FENCE, FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE)
    );
    public static final Block WILLOW_FENCE_GATE = register(
            AWRBlockItemIds.WILLOW_FENCE_GATE,
            p -> new FenceGateBlock(AWRWoodTypes.WILLOW, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_FENCE_GATE)
    );
    public static final Block WILLOW_DOOR = register(
            AWRBlockItemIds.WILLOW_DOOR,
            p -> new DoorBlock(AWRBlockSetTypes.WILLOW, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_DOOR)
    );
    public static final Block WILLOW_TRAPDOOR = register(
            AWRBlockItemIds.WILLOW_TRAPDOOR,
            p -> new TrapDoorBlock(AWRBlockSetTypes.WILLOW, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_TRAPDOOR)
    );
    public static final Block WILLOW_PRESSURE_PLATE = register(
            AWRBlockItemIds.WILLOW_PRESSURE_PLATE,
            p -> new PressurePlateBlock(AWRBlockSetTypes.WILLOW, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_PRESSURE_PLATE)
    );
    public static final Block WILLOW_BUTTON = register(
            AWRBlockItemIds.WILLOW_BUTTON,
            p -> new ButtonBlock(AWRBlockSetTypes.WILLOW, 30, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_BUTTON)
    );
    public static final Block WILLOW_SIGN = register(
            AWRBlockItemIds.WILLOW_SIGN,
            p -> new StandingSignBlock(AWRWoodTypes.WILLOW, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SIGN)
    );
    public static final Block WILLOW_WALL_SIGN = register(
            AWRBlockIds.WILLOW_WALL_SIGN,
            p -> new WallSignBlock(AWRWoodTypes.WILLOW, p), wallVariant(WILLOW_SIGN, true)
                    .mapColor(WILLOW_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block WILLOW_HANGING_SIGN = register(
            AWRBlockItemIds.WILLOW_HANGING_SIGN,
            p -> new CeilingHangingSignBlock(AWRWoodTypes.WILLOW, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_HANGING_SIGN)
    );
    public static final Block WILLOW_WALL_HANGING_SIGN = register(
            AWRBlockIds.WILLOW_WALL_HANGING_SIGN,
            p -> new WallHangingSignBlock(AWRWoodTypes.WILLOW, p), wallVariant(WILLOW_SIGN, true)
                    .mapColor(WILLOW_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block WILLOW_SHELF = register(
            AWRBlockItemIds.WILLOW_SHELF, ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_SHELF)
    );
    public static final Block WILLOW_LEAVES = register(
            AWRBlockItemIds.WILLOW_LEAVES,
            p -> new TintedParticleLeavesBlock(0.1F, p),
            leavesProperties(SoundType.GRASS)
    );
    public static final Block WILLOW_SAPLING = register(
            AWRBlockItemIds.WILLOW_SAPLING, p -> new SaplingBlock(TreeGrower.OAK, p), BlockBehaviour.Properties.ofFullCopy(BIRCH_SAPLING)
    );
    public static final Block POTTED_WILLOW_SAPLING = register(
            AWRBlockIds.POTTED_WILLOW_SAPLING, p -> new FlowerPotBlock(WILLOW_SAPLING, p), flowerPotProperties()
    );
    
    //* ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static final Block WHITE_SAND = register(
            AWRBlockItemIds.WHITE_SAND, p -> new SandBlock(new ColorRGBA(16383998), p), BlockBehaviour.Properties.ofFullCopy(Blocks.SAND)
    );
    public static final Block WHITE_SANDSTONE = register(
            AWRBlockItemIds.WHITE_SANDSTONE, BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)
    );
    public static final Block WHITE_SANDSTONE_SLAB = registerSlab(AWRBlockItemIds.WHITE_SANDSTONE_SLAB, WHITE_SANDSTONE);
    public static final Block WHITE_SANDSTONE_STAIRS = registerStair(AWRBlockItemIds.WHITE_SANDSTONE_STAIRS, WHITE_SANDSTONE);
    public static final Block WHITE_SANDSTONE_WALL = registerWall(AWRBlockItemIds.WHITE_SANDSTONE_WALL, WHITE_SANDSTONE);
    public static final Block CUT_WHITE_SANDSTONE = register(
            AWRBlockItemIds.CUT_WHITE_SANDSTONE, BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_SANDSTONE)
    );
    public static final Block CUT_WHITE_SANDSTONE_SLAB = registerSlab(AWRBlockItemIds.CUT_WHITE_SANDSTONE_SLAB, CUT_WHITE_SANDSTONE);
    public static final Block SMOOTH_WHITE_SANDSTONE = register(
            AWRBlockItemIds.SMOOTH_WHITE_SANDSTONE, BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_SANDSTONE)
    );
    public static final Block SMOOTH_WHITE_SANDSTONE_SLAB = registerSlab(AWRBlockItemIds.SMOOTH_WHITE_SANDSTONE_SLAB, SMOOTH_WHITE_SANDSTONE);
    public static final Block SMOOTH_WHITE_SANDSTONE_STAIRS = registerStair(AWRBlockItemIds.SMOOTH_WHITE_SANDSTONE_STAIRS, SMOOTH_WHITE_SANDSTONE);
    public static final Block CHISELED_WHITE_SANDSTONE = register(
            AWRBlockItemIds.CHISELED_WHITE_SANDSTONE, BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_SANDSTONE)
    );
    
    public static final Block SNOW_BRICKS = register(
            AWRBlockItemIds.SNOW_BRICKS, BlockBehaviour.Properties.ofFullCopy(Blocks.SNOW_BLOCK).destroyTime(0.3F)
    );
    public static final Block SNOW_BRICK_STAIRS = registerStair(AWRBlockItemIds.SNOW_BRICK_STAIRS, SNOW_BRICKS);
    public static final Block SNOW_BRICK_SLAB = registerSlab(AWRBlockItemIds.SNOW_BRICK_SLAB, SNOW_BRICKS);
    public static final Block SNOW_BRICK_WALL = registerWall(AWRBlockItemIds.SNOW_BRICK_WALL, SNOW_BRICKS);
    
    public static final Block PACKED_ICE_BRICKS = register(
            AWRBlockItemIds.PACKED_ICE_BRICKS, BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_ICE).friction(0.8F).destroyTime(0.6F)
    );
    public static final Block PACKED_ICE_BRICK_STAIRS = registerStair(AWRBlockItemIds.PACKED_ICE_BRICK_STAIRS, PACKED_ICE_BRICKS);
    public static final Block PACKED_ICE_BRICK_SLAB = registerSlab(AWRBlockItemIds.PACKED_ICE_BRICK_SLAB, PACKED_ICE_BRICKS);
    public static final Block PACKED_ICE_BRICK_WALL = registerWall(AWRBlockItemIds.PACKED_ICE_BRICK_WALL, SNOW_BRICKS);

    public static final Block PERMAFROST = register(
            AWRBlockItemIds.PERMAFROST, SnowyBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.GRASS_BLOCK)
    );
    public static final Block SHORT_FROSTED_GRASS = register(
            AWRBlockItemIds.SHORT_FROSTED_GRASS, ShortFrostedGrassBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.SHORT_DRY_GRASS)
    );
    public static final Block TALL_FROSTED_GRASS = register(
            AWRBlockItemIds.TALL_FROSTED_GRASS, TallFrostedGrassBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_DRY_GRASS)
    );
    public static final Block SHORT_TUNDRA_GRASS = register(
            AWRBlockItemIds.SHORT_TUNDRA_GRASS, ShortTundraGrassBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.SHORT_DRY_GRASS)
    );
    public static final Block TALL_TUNDRA_GRASS = register(
            AWRBlockItemIds.TALL_TUNDRA_GRASS, TallTundraGrassBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_DRY_GRASS)
    );
    public static final Block PINECONES = register(
            AWRBlockItemIds.PINECONES, LeafLitterBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.LEAF_LITTER)
    );
    public static final Block PEAT = register(
            AWRBlockItemIds.PEAT, PeatBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.GRASS_BLOCK).sound(SoundType.WART_BLOCK)
    );
    public static final Block PEAT_BLOCK = register(
            AWRBlockItemIds.PEAT_BLOCK, Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.GRASS_BLOCK).sound(SoundType.WART_BLOCK)
    );
    public static final Block QUICKSAND = register(
            AWRBlockItemIds.QUICKSAND, QuicksandBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.POWDER_SNOW)
    );
    public static final Block QUICKSAND_CAULDRON = register(
            AWRBlockIds.QUICKSAND_CAULDRON, QuicksandCauldronBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)
    );
    public static final Block CATTAIL = register(
            AWRBlockItemIds.CATTAIL, CattailBlock::new, BlockBehaviour.Properties.ofFullCopy(TALL_SEAGRASS)
    );
    public static final Block SHORT_PRAIRIE_GRASS = register(
            AWRBlockItemIds.SHORT_PRAIRIE_GRASS, DoublePlantBlock::new, BlockBehaviour.Properties.ofFullCopy(TALL_GRASS)
    );
    public static final Block TALL_PRAIRIE_GRASS = register(
            AWRBlockItemIds.TALL_PRAIRIE_GRASS, DoublePlantBlock::new, BlockBehaviour.Properties.ofFullCopy(TALL_GRASS)
    );

    //` ---------------------------------------------------------------------------------------------------------------------------------------

    public static Block register(final BlockItemId id, final Function<BlockBehaviour.Properties, Block> factory, final BlockBehaviour.Properties properties) {
        return register(id.block(), factory, properties);
    }

    public static Block register(final ResourceKey<Block> id, final Function<BlockBehaviour.Properties, Block> factory, final BlockBehaviour.Properties properties) {
        return Blocks.register(id, factory, properties);
    }

    public static Block register(final BlockItemId id, final BlockBehaviour.Properties properties) {
        return Blocks.register(id.block(), properties);
    }

    public static Block registerStair(final BlockItemId id, final Block base) {
        return register(id, p -> new StairBlock(base.defaultBlockState(), p), BlockBehaviour.Properties.ofFullCopy(base));
    }
    
    private static Block registerSlab(final BlockItemId id, final Block base) {
	    return register(id, SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(base).isViewBlocking(NEAR_PLANE_INTERSECTS_OUTLINE));
    }
    
    private static Block registerWall(final BlockItemId id, final Block base) {
        return register(id, WallBlock::new, BlockBehaviour.Properties.ofFullCopy(base).forceSolidOn());
    }
    
    //` ---------------------------------------------------------------------------------------------------------------------------------------
    
    private static final BlockBehaviour.StateArgumentPredicate<AABB> NEAR_PLANE_INTERSECTS_OUTLINE = (state, _, blockPos, nearPlaneBox) -> {
        for (AABB outlineBox : state.getOcclusionShape().toAabbs())
            if (outlineBox.move(blockPos).intersects(nearPlaneBox))
                return true;
        
        return false;
    };
    
    private static BlockBehaviour.Properties wallVariant(final Block standingBlock, final boolean copyName) {
        BlockBehaviour.Properties wallProperties = BlockBehaviour.Properties.of().overrideLootTable(standingBlock.getLootTable());
        if (copyName)
            wallProperties = wallProperties.overrideDescription(standingBlock.getDescriptionId());
        
        return wallProperties;
    }
    
    //` ---------------------------------------------------------------------------------------------------------------------------------------

    public static void init() {
        AWRBlockFamilies.init();
        AWRBlockSetTypes.init();
        
        List<Block> signs = List.of(
                ALDER_SIGN, ALDER_WALL_SIGN,
                APPLE_SIGN, APPLE_WALL_SIGN,
                ASPEN_SIGN, ASPEN_WALL_SIGN,
                BAOBAB_SIGN, BAOBAB_WALL_SIGN,
                BEECH_SIGN, BEECH_WALL_SIGN,
                CEDAR_SIGN, CEDAR_WALL_SIGN,
                CHERRY_SIGN, CHERRY_WALL_SIGN,
                CYPRESS_SIGN, CYPRESS_WALL_SIGN,
                EBONY_SIGN, EBONY_WALL_SIGN,
                ELM_SIGN, ELM_WALL_SIGN,
                EUCALYPTUS_SIGN, EUCALYPTUS_WALL_SIGN,
                FIG_SIGN, FIG_WALL_SIGN,
                FIR_SIGN, FIR_WALL_SIGN,
                HEMLOCK_SIGN, HEMLOCK_WALL_SIGN,
                HICKORY_SIGN, HICKORY_WALL_SIGN,
                JUNIPER_SIGN, JUNIPER_WALL_SIGN,
                KAPOK_SIGN, KAPOK_WALL_SIGN,
                LARCH_SIGN, LARCH_WALL_SIGN,
                MAHOGANY_SIGN, MAHOGANY_WALL_SIGN,
                MAPLE_SIGN, MAPLE_WALL_SIGN,
                MESQUITE_SIGN, MESQUITE_WALL_SIGN,
                OLIVE_SIGN, OLIVE_WALL_SIGN,
                PALM_SIGN, PALM_WALL_SIGN,
                PALO_VERDE_SIGN, PALO_VERDE_WALL_SIGN,
                PINE_SIGN, PINE_WALL_SIGN,
                REDWOOD_SIGN, REDWOOD_WALL_SIGN,
                SEQUOIA_SIGN, SEQUOIA_WALL_SIGN,
                WILLOW_SIGN, WILLOW_WALL_SIGN
        );
        
        List<Block> hangingSigns = List.of(
                ALDER_HANGING_SIGN, ALDER_WALL_HANGING_SIGN,
                APPLE_HANGING_SIGN, APPLE_WALL_HANGING_SIGN,
                ASPEN_HANGING_SIGN, ASPEN_WALL_HANGING_SIGN,
                BAOBAB_HANGING_SIGN, BAOBAB_WALL_HANGING_SIGN,
                BEECH_HANGING_SIGN, BEECH_WALL_HANGING_SIGN,
                CEDAR_HANGING_SIGN, CEDAR_WALL_HANGING_SIGN,
                CHERRY_HANGING_SIGN, CHERRY_WALL_HANGING_SIGN,
                CYPRESS_HANGING_SIGN, CYPRESS_WALL_HANGING_SIGN,
                EBONY_HANGING_SIGN, EBONY_WALL_HANGING_SIGN,
                ELM_HANGING_SIGN, ELM_WALL_HANGING_SIGN,
                EUCALYPTUS_HANGING_SIGN, EUCALYPTUS_WALL_HANGING_SIGN,
                FIG_HANGING_SIGN, FIG_WALL_HANGING_SIGN,
                FIR_HANGING_SIGN, FIR_WALL_HANGING_SIGN,
                HEMLOCK_HANGING_SIGN, HEMLOCK_WALL_HANGING_SIGN,
                HICKORY_HANGING_SIGN, HICKORY_WALL_HANGING_SIGN,
                JUNIPER_HANGING_SIGN, JUNIPER_WALL_HANGING_SIGN,
                KAPOK_HANGING_SIGN, KAPOK_WALL_HANGING_SIGN,
                LARCH_HANGING_SIGN, LARCH_WALL_HANGING_SIGN,
                MAHOGANY_HANGING_SIGN, MAHOGANY_WALL_HANGING_SIGN,
                MAPLE_HANGING_SIGN, MAPLE_WALL_HANGING_SIGN,
                MESQUITE_HANGING_SIGN, MESQUITE_WALL_HANGING_SIGN,
                OLIVE_HANGING_SIGN, OLIVE_WALL_HANGING_SIGN,
                PALM_HANGING_SIGN, PALM_WALL_HANGING_SIGN,
                PALO_VERDE_HANGING_SIGN, PALO_VERDE_WALL_HANGING_SIGN,
                PINE_HANGING_SIGN, PINE_WALL_HANGING_SIGN,
                REDWOOD_HANGING_SIGN, REDWOOD_WALL_HANGING_SIGN,
                SEQUOIA_HANGING_SIGN, SEQUOIA_WALL_HANGING_SIGN,
                WILLOW_HANGING_SIGN, WILLOW_WALL_HANGING_SIGN
        );
        
        List<Block> shelves = List.of(
                ALDER_SHELF,
                APPLE_SHELF,
                ASPEN_SHELF,
                BAOBAB_SHELF,
                BEECH_SHELF,
                CEDAR_SHELF,
                CHERRY_SHELF,
                CYPRESS_SHELF,
                EBONY_SHELF,
                ELM_SHELF,
                EUCALYPTUS_SHELF,
                FIG_SHELF,
                FIR_SHELF,
                HEMLOCK_SHELF,
                HICKORY_SHELF,
                JUNIPER_SHELF,
                KAPOK_SHELF,
                LARCH_SHELF,
                MAHOGANY_SHELF,
                MAPLE_SHELF,
                MESQUITE_SHELF,
                OLIVE_SHELF,
                PALM_SHELF,
                PALO_VERDE_SHELF,
                PINE_SHELF,
                REDWOOD_SHELF,
                SEQUOIA_SHELF,
                WILLOW_SHELF
        );
        
        signs.forEach(BlockEntityTypes.SIGN::addValidBlock);
        hangingSigns.forEach(BlockEntityTypes.HANGING_SIGN::addValidBlock);
        shelves.forEach(BlockEntityTypes.SHELF::addValidBlock);
    }
}
