package me.witherbuilder13.a_world_reimagined.block;

import me.witherbuilder13.a_world_reimagined.block.util.AWRBlockFamilies;
import me.witherbuilder13.a_world_reimagined.block.util.AWRBlockSetTypes;
import me.witherbuilder13.a_world_reimagined.block.util.AWRTreeGrowers;
import me.witherbuilder13.a_world_reimagined.block.util.AWRWoodTypes;
import me.witherbuilder13.a_world_reimagined.references.AWRBlockIds;
import me.witherbuilder13.a_world_reimagined.references.AWRBlockItemIds;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.ColorRGBA;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntityTypes;
import net.minecraft.world.level.block.sounds.AmbientLeavesBlockSoundPlayer;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.phys.AABB;

import java.util.List;
import java.util.function.Function;

import static net.minecraft.world.level.block.Blocks.*;

public class AWRBlocks {
    
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
                ASPEN_SIGN, ASPEN_WALL_SIGN,
                CEDAR_SIGN, CEDAR_WALL_SIGN,
                FIR_SIGN, FIR_WALL_SIGN,
                HEMLOCK_SIGN, HEMLOCK_WALL_SIGN,
                LARCH_SIGN, LARCH_WALL_SIGN,
                PINE_SIGN, PINE_WALL_SIGN,
                REDWOOD_SIGN, REDWOOD_WALL_SIGN,
                SEQUOIA_SIGN, SEQUOIA_WALL_SIGN
        );
        
        List<Block> hangingSigns = List.of(
                ASPEN_HANGING_SIGN, ASPEN_WALL_HANGING_SIGN,
                CEDAR_HANGING_SIGN, CEDAR_WALL_HANGING_SIGN,
                FIR_HANGING_SIGN, FIR_WALL_HANGING_SIGN,
                HEMLOCK_HANGING_SIGN, HEMLOCK_WALL_HANGING_SIGN,
                LARCH_HANGING_SIGN, LARCH_WALL_HANGING_SIGN,
                PINE_HANGING_SIGN, PINE_WALL_HANGING_SIGN,
                REDWOOD_HANGING_SIGN, REDWOOD_WALL_HANGING_SIGN,
                SEQUOIA_HANGING_SIGN, SEQUOIA_WALL_HANGING_SIGN
        );
        
        List<Block> shelves = List.of(
                ASPEN_SHELF,
                CEDAR_SHELF,
                FIR_SHELF,
                HEMLOCK_SHELF,
                LARCH_SHELF,
                PINE_SHELF,
                REDWOOD_SHELF,
                SEQUOIA_SHELF
        );
        
        signs.forEach(BlockEntityTypes.SIGN::addValidBlock);
        hangingSigns.forEach(BlockEntityTypes.HANGING_SIGN::addValidBlock);
        shelves.forEach(BlockEntityTypes.SHELF::addValidBlock);
    }
}
