/*
package me.witherbuilder13.a_world_reimagined.item;

import me.witherbuilder13.a_world_reimagined.block.AWRBlocks;
import me.witherbuilder13.a_world_reimagined.references.AWRBlockItemIds;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.WallHangingSignBlock;

import java.util.function.BiFunction;
import java.util.function.Function;

public class AWRItems {

    public static final Item CEDAR_LOG = registerBlock(AWRBlockItemIds.CEDAR_LOG, AWRBlocks.CEDAR_LOG);
    public static final Item FIR_LOG = registerBlock(AWRBlockItemIds.FIR_LOG, AWRBlocks.FIR_LOG);
    public static final Item HEMLOCK_LOG = registerBlock(AWRBlockItemIds.HEMLOCK_LOG, AWRBlocks.HEMLOCK_LOG);
    public static final Item LARCH_LOG = registerBlock(AWRBlockItemIds.LARCH_LOG, AWRBlocks.LARCH_LOG);
    public static final Item PINE_LOG = registerBlock(AWRBlockItemIds.PINE_LOG, AWRBlocks.PINE_LOG);
    public static final Item REDWOOD_LOG = registerBlock(AWRBlockItemIds.REDWOOD_LOG, AWRBlocks.REDWOOD_LOG);
    public static final Item SEQUOIA_LOG = registerBlock(AWRBlockItemIds.SEQUOIA_LOG, AWRBlocks.SEQUOIA_LOG);

    public static final Item CEDAR_WOOD = registerBlock(AWRBlockItemIds.CEDAR_WOOD, AWRBlocks.CEDAR_WOOD);
    public static final Item FIR_WOOD = registerBlock(AWRBlockItemIds.FIR_WOOD, AWRBlocks.FIR_WOOD);
    public static final Item HEMLOCK_WOOD = registerBlock(AWRBlockItemIds.HEMLOCK_WOOD, AWRBlocks.HEMLOCK_WOOD);
    public static final Item LARCH_WOOD = registerBlock(AWRBlockItemIds.LARCH_WOOD, AWRBlocks.LARCH_WOOD);
    public static final Item PINE_WOOD = registerBlock(AWRBlockItemIds.PINE_WOOD, AWRBlocks.PINE_WOOD);
    public static final Item REDWOOD_WOOD = registerBlock(AWRBlockItemIds.REDWOOD_WOOD, AWRBlocks.REDWOOD_WOOD);
    public static final Item SEQUOIA_WOOD = registerBlock(AWRBlockItemIds.SEQUOIA_WOOD, AWRBlocks.SEQUOIA_WOOD);

    public static final Item STRIPPED_CEDAR_LOG = registerBlock(AWRBlockItemIds.STRIPPED_CEDAR_LOG, AWRBlocks.STRIPPED_CEDAR_LOG);
    public static final Item STRIPPED_FIR_LOG = registerBlock(AWRBlockItemIds.STRIPPED_FIR_LOG, AWRBlocks.STRIPPED_FIR_LOG);
    public static final Item STRIPPED_HEMLOCK_LOG = registerBlock(AWRBlockItemIds.STRIPPED_HEMLOCK_LOG, AWRBlocks.STRIPPED_HEMLOCK_LOG);
    public static final Item STRIPPED_LARCH_LOG = registerBlock(AWRBlockItemIds.STRIPPED_LARCH_LOG, AWRBlocks.STRIPPED_LARCH_LOG);
    public static final Item STRIPPED_PINE_LOG = registerBlock(AWRBlockItemIds.STRIPPED_PINE_LOG, AWRBlocks.STRIPPED_PINE_LOG);
    public static final Item STRIPPED_REDWOOD_LOG = registerBlock(AWRBlockItemIds.STRIPPED_REDWOOD_LOG, AWRBlocks.STRIPPED_REDWOOD_LOG);
    public static final Item STRIPPED_SEQUOIA_LOG = registerBlock(AWRBlockItemIds.STRIPPED_SEQUOIA_LOG, AWRBlocks.STRIPPED_SEQUOIA_LOG);

    public static final Item STRIPPED_CEDAR_WOOD = registerBlock(AWRBlockItemIds.STRIPPED_CEDAR_WOOD, AWRBlocks.STRIPPED_CEDAR_WOOD);
    public static final Item STRIPPED_FIR_WOOD = registerBlock(AWRBlockItemIds.STRIPPED_FIR_WOOD, AWRBlocks.STRIPPED_FIR_WOOD);
    public static final Item STRIPPED_HEMLOCK_WOOD = registerBlock(AWRBlockItemIds.STRIPPED_HEMLOCK_WOOD, AWRBlocks.STRIPPED_HEMLOCK_WOOD);
    public static final Item STRIPPED_LARCH_WOOD = registerBlock(AWRBlockItemIds.STRIPPED_LARCH_WOOD, AWRBlocks.STRIPPED_LARCH_WOOD);
    public static final Item STRIPPED_PINE_WOOD = registerBlock(AWRBlockItemIds.STRIPPED_PINE_WOOD, AWRBlocks.STRIPPED_PINE_WOOD);
    public static final Item STRIPPED_REDWOOD_WOOD = registerBlock(AWRBlockItemIds.STRIPPED_REDWOOD_WOOD, AWRBlocks.STRIPPED_REDWOOD_WOOD);
    public static final Item STRIPPED_SEQUOIA_WOOD = registerBlock(AWRBlockItemIds.STRIPPED_SEQUOIA_WOOD, AWRBlocks.STRIPPED_SEQUOIA_WOOD);

    public static final Item CEDAR_PLANKS = registerBlock(AWRBlockItemIds.CEDAR_PLANKS, AWRBlocks.CEDAR_PLANKS);
    public static final Item FIR_PLANKS = registerBlock(AWRBlockItemIds.FIR_PLANKS, AWRBlocks.FIR_PLANKS);
    public static final Item HEMLOCK_PLANKS = registerBlock(AWRBlockItemIds.HEMLOCK_PLANKS, AWRBlocks.HEMLOCK_PLANKS);
    public static final Item LARCH_PLANKS = registerBlock(AWRBlockItemIds.LARCH_PLANKS, AWRBlocks.LARCH_PLANKS);
    public static final Item PINE_PLANKS = registerBlock(AWRBlockItemIds.PINE_PLANKS, AWRBlocks.PINE_PLANKS);
    public static final Item REDWOOD_PLANKS = registerBlock(AWRBlockItemIds.REDWOOD_PLANKS, AWRBlocks.REDWOOD_PLANKS);
    public static final Item SEQUOIA_PLANKS = registerBlock(AWRBlockItemIds.SEQUOIA_PLANKS, AWRBlocks.SEQUOIA_PLANKS);

    public static final Item CEDAR_STAIRS = registerBlock(AWRBlockItemIds.CEDAR_STAIRS, AWRBlocks.CEDAR_STAIRS);
    public static final Item FIR_STAIRS = registerBlock(AWRBlockItemIds.FIR_STAIRS, AWRBlocks.FIR_STAIRS);
    public static final Item HEMLOCK_STAIRS = registerBlock(AWRBlockItemIds.HEMLOCK_STAIRS, AWRBlocks.HEMLOCK_STAIRS);
    public static final Item LARCH_STAIRS = registerBlock(AWRBlockItemIds.LARCH_STAIRS, AWRBlocks.LARCH_STAIRS);
    public static final Item PINE_STAIRS = registerBlock(AWRBlockItemIds.PINE_STAIRS, AWRBlocks.PINE_STAIRS);
    public static final Item REDWOOD_STAIRS = registerBlock(AWRBlockItemIds.REDWOOD_STAIRS, AWRBlocks.REDWOOD_STAIRS);
    public static final Item SEQUOIA_STAIRS = registerBlock(AWRBlockItemIds.SEQUOIA_STAIRS, AWRBlocks.SEQUOIA_STAIRS);

    public static final Item CEDAR_SLAB = registerBlock(AWRBlockItemIds.CEDAR_SLAB, AWRBlocks.CEDAR_SLAB);
    public static final Item FIR_SLAB = registerBlock(AWRBlockItemIds.FIR_SLAB, AWRBlocks.FIR_SLAB);
    public static final Item HEMLOCK_SLAB = registerBlock(AWRBlockItemIds.HEMLOCK_SLAB, AWRBlocks.HEMLOCK_SLAB);
    public static final Item LARCH_SLAB = registerBlock(AWRBlockItemIds.LARCH_SLAB, AWRBlocks.LARCH_SLAB);
    public static final Item PINE_SLAB = registerBlock(AWRBlockItemIds.PINE_SLAB, AWRBlocks.PINE_SLAB);
    public static final Item REDWOOD_SLAB = registerBlock(AWRBlockItemIds.REDWOOD_SLAB, AWRBlocks.REDWOOD_SLAB);
    public static final Item SEQUOIA_SLAB = registerBlock(AWRBlockItemIds.SEQUOIA_SLAB, AWRBlocks.SEQUOIA_SLAB);

    public static final Item CEDAR_FENCE = registerBlock(AWRBlockItemIds.CEDAR_FENCE, AWRBlocks.CEDAR_FENCE);
    public static final Item FIR_FENCE = registerBlock(AWRBlockItemIds.FIR_FENCE, AWRBlocks.FIR_FENCE);
    public static final Item HEMLOCK_FENCE = registerBlock(AWRBlockItemIds.HEMLOCK_FENCE, AWRBlocks.HEMLOCK_FENCE);
    public static final Item LARCH_FENCE = registerBlock(AWRBlockItemIds.LARCH_FENCE, AWRBlocks.LARCH_FENCE);
    public static final Item PINE_FENCE = registerBlock(AWRBlockItemIds.PINE_FENCE, AWRBlocks.PINE_FENCE);
    public static final Item REDWOOD_FENCE = registerBlock(AWRBlockItemIds.REDWOOD_FENCE, AWRBlocks.REDWOOD_FENCE);
    public static final Item SEQUOIA_FENCE = registerBlock(AWRBlockItemIds.SEQUOIA_FENCE, AWRBlocks.SEQUOIA_FENCE);

    public static final Item CEDAR_FENCE_GATE = registerBlock(AWRBlockItemIds.CEDAR_FENCE_GATE, AWRBlocks.CEDAR_FENCE_GATE);
    public static final Item FIR_FENCE_GATE = registerBlock(AWRBlockItemIds.FIR_FENCE_GATE, AWRBlocks.FIR_FENCE_GATE);
    public static final Item HEMLOCK_FENCE_GATE = registerBlock(AWRBlockItemIds.HEMLOCK_FENCE_GATE, AWRBlocks.HEMLOCK_FENCE_GATE);
    public static final Item LARCH_FENCE_GATE = registerBlock(AWRBlockItemIds.LARCH_FENCE_GATE, AWRBlocks.LARCH_FENCE_GATE);
    public static final Item PINE_FENCE_GATE = registerBlock(AWRBlockItemIds.PINE_FENCE_GATE, AWRBlocks.PINE_FENCE_GATE);
    public static final Item REDWOOD_FENCE_GATE = registerBlock(AWRBlockItemIds.REDWOOD_FENCE_GATE, AWRBlocks.REDWOOD_FENCE_GATE);
    public static final Item SEQUOIA_FENCE_GATE = registerBlock(AWRBlockItemIds.SEQUOIA_FENCE_GATE, AWRBlocks.SEQUOIA_FENCE_GATE);

    public static final Item CEDAR_DOOR = registerBlock(AWRBlockItemIds.CEDAR_DOOR, AWRBlocks.CEDAR_DOOR);
    public static final Item FIR_DOOR = registerBlock(AWRBlockItemIds.FIR_DOOR, AWRBlocks.FIR_DOOR);
    public static final Item HEMLOCK_DOOR = registerBlock(AWRBlockItemIds.HEMLOCK_DOOR, AWRBlocks.HEMLOCK_DOOR);
    public static final Item LARCH_DOOR = registerBlock(AWRBlockItemIds.LARCH_DOOR, AWRBlocks.LARCH_DOOR);
    public static final Item PINE_DOOR = registerBlock(AWRBlockItemIds.PINE_DOOR, AWRBlocks.PINE_DOOR);
    public static final Item REDWOOD_DOOR = registerBlock(AWRBlockItemIds.REDWOOD_DOOR, AWRBlocks.REDWOOD_DOOR);
    public static final Item SEQUOIA_DOOR = registerBlock(AWRBlockItemIds.SEQUOIA_DOOR, AWRBlocks.SEQUOIA_DOOR);

    public static final Item CEDAR_TRAPDOOR = registerBlock(AWRBlockItemIds.CEDAR_TRAPDOOR, AWRBlocks.CEDAR_TRAPDOOR);
    public static final Item FIR_TRAPDOOR = registerBlock(AWRBlockItemIds.FIR_TRAPDOOR, AWRBlocks.FIR_TRAPDOOR);
    public static final Item HEMLOCK_TRAPDOOR = registerBlock(AWRBlockItemIds.HEMLOCK_TRAPDOOR, AWRBlocks.HEMLOCK_TRAPDOOR);
    public static final Item LARCH_TRAPDOOR = registerBlock(AWRBlockItemIds.LARCH_TRAPDOOR, AWRBlocks.LARCH_TRAPDOOR);
    public static final Item PINE_TRAPDOOR = registerBlock(AWRBlockItemIds.PINE_TRAPDOOR, AWRBlocks.PINE_TRAPDOOR);
    public static final Item REDWOOD_TRAPDOOR = registerBlock(AWRBlockItemIds.REDWOOD_TRAPDOOR, AWRBlocks.REDWOOD_TRAPDOOR);
    public static final Item SEQUOIA_TRAPDOOR = registerBlock(AWRBlockItemIds.SEQUOIA_TRAPDOOR, AWRBlocks.SEQUOIA_TRAPDOOR);

    public static final Item CEDAR_PRESSURE_PLATE = registerBlock(AWRBlockItemIds.CEDAR_PRESSURE_PLATE, AWRBlocks.CEDAR_PRESSURE_PLATE);
    public static final Item FIR_PRESSURE_PLATE = registerBlock(AWRBlockItemIds.FIR_PRESSURE_PLATE, AWRBlocks.FIR_PRESSURE_PLATE);
    public static final Item HEMLOCK_PRESSURE_PLATE = registerBlock(AWRBlockItemIds.HEMLOCK_PRESSURE_PLATE, AWRBlocks.HEMLOCK_PRESSURE_PLATE);
    public static final Item LARCH_PRESSURE_PLATE = registerBlock(AWRBlockItemIds.LARCH_PRESSURE_PLATE, AWRBlocks.LARCH_PRESSURE_PLATE);
    public static final Item PINE_PRESSURE_PLATE = registerBlock(AWRBlockItemIds.PINE_PRESSURE_PLATE, AWRBlocks.PINE_PRESSURE_PLATE);
    public static final Item REDWOOD_PRESSURE_PLATE = registerBlock(AWRBlockItemIds.REDWOOD_PRESSURE_PLATE, AWRBlocks.REDWOOD_PRESSURE_PLATE);
    public static final Item SEQUOIA_PRESSURE_PLATE = registerBlock(AWRBlockItemIds.SEQUOIA_PRESSURE_PLATE, AWRBlocks.SEQUOIA_PRESSURE_PLATE);

    public static final Item CEDAR_BUTTON = registerBlock(AWRBlockItemIds.CEDAR_BUTTON, AWRBlocks.CEDAR_BUTTON);
    public static final Item FIR_BUTTON = registerBlock(AWRBlockItemIds.FIR_BUTTON, AWRBlocks.FIR_BUTTON);
    public static final Item HEMLOCK_BUTTON = registerBlock(AWRBlockItemIds.HEMLOCK_BUTTON, AWRBlocks.HEMLOCK_BUTTON);
    public static final Item LARCH_BUTTON = registerBlock(AWRBlockItemIds.LARCH_BUTTON, AWRBlocks.LARCH_BUTTON);
    public static final Item PINE_BUTTON = registerBlock(AWRBlockItemIds.PINE_BUTTON, AWRBlocks.PINE_BUTTON);
    public static final Item REDWOOD_BUTTON = registerBlock(AWRBlockItemIds.REDWOOD_BUTTON, AWRBlocks.REDWOOD_BUTTON);
    public static final Item SEQUOIA_BUTTON = registerBlock(AWRBlockItemIds.SEQUOIA_BUTTON, AWRBlocks.SEQUOIA_BUTTON);

    public static final Item CEDAR_SIGN = signItem(AWRBlockItemIds.CEDAR_SIGN, AWRBlocks.CEDAR_SIGN, AWRBlocks.CEDAR_WALL_SIGN);
    public static final Item FIR_SIGN = signItem(AWRBlockItemIds.FIR_SIGN, AWRBlocks.FIR_SIGN, AWRBlocks.FIR_WALL_SIGN);
    public static final Item LARCH_SIGN = signItem(AWRBlockItemIds.LARCH_SIGN, AWRBlocks.LARCH_SIGN, AWRBlocks.LARCH_WALL_SIGN);
    public static final Item PINE_SIGN = signItem(AWRBlockItemIds.PINE_SIGN, AWRBlocks.PINE_SIGN, AWRBlocks.PINE_WALL_SIGN);
    public static final Item REDWOOD_SIGN = signItem(AWRBlockItemIds.REDWOOD_SIGN, AWRBlocks.REDWOOD_SIGN, AWRBlocks.REDWOOD_WALL_SIGN);
    public static final Item SEQUOIA_SIGN = signItem(AWRBlockItemIds.SEQUOIA_SIGN, AWRBlocks.SEQUOIA_SIGN, AWRBlocks.SEQUOIA_WALL_SIGN);

    public static final Item CEDAR_HANGING_SIGN = signItem(AWRBlockItemIds.CEDAR_HANGING_SIGN, AWRBlocks.CEDAR_HANGING_SIGN, AWRBlocks.CEDAR_WALL_HANGING_SIGN);
    public static final Item FIR_HANGING_SIGN = signItem(AWRBlockItemIds.FIR_HANGING_SIGN, AWRBlocks.FIR_HANGING_SIGN, AWRBlocks.FIR_WALL_HANGING_SIGN);
    public static final Item HEMLOCK_HANGING_SIGN = signItem(AWRBlockItemIds.HEMLOCK_HANGING_SIGN, AWRBlocks.HEMLOCK_HANGING_SIGN, AWRBlocks.HEMLOCK_WALL_HANGING_SIGN);
    public static final Item LARCH_HANGING_SIGN = signItem(AWRBlockItemIds.LARCH_HANGING_SIGN, AWRBlocks.LARCH_HANGING_SIGN, AWRBlocks.LARCH_WALL_HANGING_SIGN);
    public static final Item PINE_HANGING_SIGN = signItem(AWRBlockItemIds.PINE_HANGING_SIGN, AWRBlocks.PINE_HANGING_SIGN, AWRBlocks.PINE_WALL_HANGING_SIGN);
    public static final Item REDWOOD_HANGING_SIGN = signItem(AWRBlockItemIds.REDWOOD_HANGING_SIGN, AWRBlocks.REDWOOD_HANGING_SIGN, AWRBlocks.REDWOOD_WALL_HANGING_SIGN);
    public static final Item SEQUOIA_HANGING_SIGN = signItem(AWRBlockItemIds.SEQUOIA_HANGING_SIGN, AWRBlocks.SEQUOIA_HANGING_SIGN, AWRBlocks.SEQUOIA_WALL_HANGING_SIGN);

    public static final Item CEDAR_SHELF = registerBlock(AWRBlockItemIds.CEDAR_SHELF, AWRBlocks.CEDAR_SHELF);
    public static final Item FIR_SHELF = registerBlock(AWRBlockItemIds.FIR_SHELF, AWRBlocks.FIR_SHELF);
    public static final Item HEMLOCK_SHELF = registerBlock(AWRBlockItemIds.HEMLOCK_SHELF, AWRBlocks.HEMLOCK_SHELF);
    public static final Item LARCH_SHELF = registerBlock(AWRBlockItemIds.LARCH_SHELF, AWRBlocks.LARCH_SHELF);
    public static final Item PINE_SHELF = registerBlock(AWRBlockItemIds.PINE_SHELF, AWRBlocks.PINE_SHELF);
    public static final Item REDWOOD_SHELF = registerBlock(AWRBlockItemIds.REDWOOD_SHELF, AWRBlocks.REDWOOD_SHELF);
    public static final Item SEQUOIA_SHELF = registerBlock(AWRBlockItemIds.SEQUOIA_SHELF, AWRBlocks.SEQUOIA_SHELF);

    */
/*public static final Item CEDAR_LEAVES = registerBlock(AWRBlockItemIds.CEDAR_LEAVES, AWRBlocks.CEDAR_LEAVES);
    public static final Item FIR_LEAVES = registerBlock(AWRBlockItemIds.FIR_LEAVES, AWRBlocks.FIR_LEAVES);
    public static final Item HEMLOCK_LEAVES = registerBlock(AWRBlockItemIds.HEMLOCK_LEAVES, AWRBlocks.HEMLOCK_LEAVES);
    public static final Item LARCH_LEAVES = registerBlock(AWRBlockItemIds.LARCH_LEAVES, AWRBlocks.LARCH_LEAVES);
    public static final Item PINE_LEAVES = registerBlock(AWRBlockItemIds.PINE_LEAVES, AWRBlocks.PINE_LEAVES);
    public static final Item REDWOOD_LEAVES = registerBlock(AWRBlockItemIds.REDWOOD_LEAVES, AWRBlocks.REDWOOD_LEAVES);
    public static final Item SEQUOIA_LEAVES = registerBlock(AWRBlockItemIds.SEQUOIA_LEAVES, AWRBlocks.SEQUOIA_LEAVES);*//*


    public static final Item CEDAR_SAPLING = registerBlock(AWRBlockItemIds.CEDAR_SAPLING, AWRBlocks.CEDAR_SAPLING);
    public static final Item FIR_SAPLING = registerBlock(AWRBlockItemIds.FIR_SAPLING, AWRBlocks.FIR_SAPLING);
    public static final Item HEMLOCK_SAPLING = registerBlock(AWRBlockItemIds.HEMLOCK_SAPLING, AWRBlocks.HEMLOCK_SAPLING);
    public static final Item LARCH_SAPLING = registerBlock(AWRBlockItemIds.LARCH_SAPLING, AWRBlocks.LARCH_SAPLING);
    public static final Item PINE_SAPLING = registerBlock(AWRBlockItemIds.PINE_SAPLING, AWRBlocks.PINE_SAPLING);
    public static final Item REDWOOD_SAPLING = registerBlock(AWRBlockItemIds.REDWOOD_SAPLING, AWRBlocks.REDWOOD_SAPLING);
    public static final Item SEQUOIA_SAPLING = registerBlock(AWRBlockItemIds.SEQUOIA_SAPLING, AWRBlocks.SEQUOIA_SAPLING);
    
    //` -------------------------------------------------------------------------------------------------------------------------

    public static Item signItem(BlockItemId id, Block sign, Block wallSign) {
        BiFunction<Block, Item.Properties, Item> factory;
        Item.Properties properties = new Item.Properties().stacksTo(16);

        if (sign instanceof CeilingHangingSignBlock && wallSign instanceof WallHangingSignBlock)
            factory = (b, p) -> new HangingSignItem(b, wallSign, p);
        else
            factory = (b, p) -> new StandingAndWallBlockItem(b, wallSign, Direction.DOWN, p);

        return registerBlock(id, sign, factory, properties);
    }
    
    public static Item registerBlock(final BlockItemId id, final Block block) {
        return registerBlock(id, block, BlockItem::new);
    }

    public static Item registerBlock(final BlockItemId id, final Block block, final BiFunction<Block, Item.Properties, Item> itemFactory) {
        return registerBlock(id, block, itemFactory, new Item.Properties());
    }

    public static Item registerBlock(final BlockItemId id, final Block block, final BiFunction<Block, Item.Properties, Item> itemFactory, final Item.Properties properties) {
        return registerItem(id.item(), (p) -> itemFactory.apply(block, p), properties.useBlockDescriptionPrefix().requiredFeatures(block.requiredFeatures()));
    }
    
    public static Item registerItem(final ResourceKey<Item> id, final Function<Item.Properties, Item> itemFactory, final Item.Properties properties) {
        Item item = itemFactory.apply(properties.setId(id));
        if (item instanceof BlockItem blockItem) {
            blockItem.registerBlocks(Item.BY_BLOCK, item);
        }

        return Registry.register(BuiltInRegistries.ITEM, id, item);
    }

    public static void init() {}
}
*/
