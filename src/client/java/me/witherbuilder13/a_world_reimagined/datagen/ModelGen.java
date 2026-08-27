/*
package me.witherbuilder13.a_world_reimagined.datagen;

import com.google.common.collect.ImmutableMap;
import me.witherbuilder13.a_world_reimagined.block.AWRBlocks;
import me.witherbuilder13.a_world_reimagined.block.util.AWRBlockFamilies;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.data.BlockFamily;
import net.minecraft.world.level.block.Block;
import org.jspecify.annotations.NonNull;

import java.util.HashMap;
import java.util.Map;

import static me.witherbuilder13.a_world_reimagined.block.AWRBlocks.*;
import static me.witherbuilder13.a_world_reimagined.block.util.AWRBlockFamilies.*;

public class ModelGen extends FabricModelProvider {
    public ModelGen(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(@NonNull BlockModelGenerators blockModelGenerators) {

        Map<Block, TexturedModel> TEXTURED_MODELS = ImmutableMap.<Block, TexturedModel>builder()
                .put(AWRBlocks.WHITE_SANDSTONE, TexturedModel.TOP_BOTTOM_WITH_WALL.get(AWRBlocks.WHITE_SANDSTONE))
                .put(AWRBlocks.SMOOTH_WHITE_SANDSTONE, TexturedModel.createAllSame(TextureMapping.getBlockTexture(AWRBlocks.WHITE_SANDSTONE, "_top")))
                .put(AWRBlocks.CUT_WHITE_SANDSTONE, TexturedModel.COLUMN.get(AWRBlocks.WHITE_SANDSTONE).updateTextures(m ->
                        m.put(TextureSlot.SIDE, TextureMapping.getBlockTexture(AWRBlocks.CUT_WHITE_SANDSTONE))))
                .put(CHISELED_WHITE_SANDSTONE, TexturedModel.COLUMN.get(CHISELED_WHITE_SANDSTONE).updateTextures(m -> {
                        m.put(TextureSlot.END, TextureMapping.getBlockTexture(AWRBlocks.WHITE_SANDSTONE));
                        m.put(TextureSlot.SIDE, TextureMapping.getBlockTexture(CHISELED_WHITE_SANDSTONE));
                        }))
                .build();

        Block[] trivialCubes = {
                CEDAR_LEAVES, FIR_LEAVES, HEMLOCK_LEAVES, LARCH_LEAVES, PINE_LEAVES, REDWOOD_LEAVES, SEQUOIA_LEAVES,
                WHITE_SAND
        };

        for (Block block : trivialCubes)
            blockModelGenerators.createTrivialCube(block);

        Map<Block, Block> logBlocks = new HashMap<>();

        logBlocks.put(CEDAR_LOG, CEDAR_WOOD);
        logBlocks.put(FIR_LOG, FIR_WOOD);
        logBlocks.put(HEMLOCK_LOG, HEMLOCK_WOOD);
        logBlocks.put(LARCH_LOG, LARCH_WOOD);
        logBlocks.put(PINE_LOG, PINE_WOOD);
        logBlocks.put(REDWOOD_LOG, REDWOOD_WOOD);
        logBlocks.put(SEQUOIA_LOG, SEQUOIA_WOOD);

        logBlocks.put(STRIPPED_CEDAR_LOG, STRIPPED_CEDAR_WOOD);
        logBlocks.put(STRIPPED_FIR_LOG, STRIPPED_FIR_WOOD);
        logBlocks.put(STRIPPED_HEMLOCK_LOG, STRIPPED_HEMLOCK_WOOD);
        logBlocks.put(STRIPPED_LARCH_LOG, STRIPPED_LARCH_WOOD);
        logBlocks.put(STRIPPED_PINE_LOG, STRIPPED_PINE_WOOD);
        logBlocks.put(STRIPPED_REDWOOD_LOG, STRIPPED_REDWOOD_WOOD);
        logBlocks.put(STRIPPED_SEQUOIA_LOG, STRIPPED_SEQUOIA_WOOD);

        for (Block log : logBlocks.keySet())
            blockModelGenerators.woodProvider(log).logWithHorizontal(log).wood(logBlocks.get(log));

        Map<Block, BlockFamily> blockFamilies = new HashMap<>();

        blockFamilies.put(CEDAR_PLANKS, CEDAR);
        blockFamilies.put(FIR_PLANKS, FIR);
        blockFamilies.put(HEMLOCK_PLANKS, HEMLOCK);
        blockFamilies.put(LARCH_PLANKS, LARCH);
        blockFamilies.put(PINE_PLANKS, PINE);
        blockFamilies.put(REDWOOD_PLANKS, REDWOOD);
        blockFamilies.put(SEQUOIA_PLANKS, SEQUOIA);

        for (Block block : blockFamilies.keySet())
            blockModelGenerators.family(block).generateFor(blockFamilies.get(block));

        */
/*BlockFamilies.getAllFamilies()
                .filter(BlockFamily::shouldGenerateModel)
                .filter(blockFamily -> AWRBlockFamilies.BLOCK_FAMILIES.contains(blockFamily))
                .forEach(blockFamily -> blockModelGenerators.family(blockFamily.getBaseBlock()).generateFor(blockFamily)
        );*//*


        Map<Block, BlockFamily> specialFamilies = new HashMap<>();

        specialFamilies.put(AWRBlocks.WHITE_SANDSTONE, AWRBlockFamilies.WHITE_SANDSTONE);
        specialFamilies.put(AWRBlocks.SMOOTH_WHITE_SANDSTONE, AWRBlockFamilies.SMOOTH_WHITE_SANDSTONE);
        specialFamilies.put(AWRBlocks.CUT_WHITE_SANDSTONE, AWRBlockFamilies.CUT_WHITE_SANDSTONE);

        for (Block block : specialFamilies.keySet()) {
            TexturedModel model = TEXTURED_MODELS.getOrDefault(block, TexturedModel.CUBE.get(block));
        }

        Map<Block, Block> shelfBlocks = new HashMap<>();

        shelfBlocks.put(CEDAR_SHELF, STRIPPED_CEDAR_LOG);
        shelfBlocks.put(FIR_SHELF, STRIPPED_FIR_LOG);
        shelfBlocks.put(HEMLOCK_SHELF, STRIPPED_HEMLOCK_LOG);
        shelfBlocks.put(LARCH_SHELF, STRIPPED_LARCH_LOG);
        shelfBlocks.put(PINE_SHELF, STRIPPED_PINE_LOG);
        shelfBlocks.put(REDWOOD_SHELF, STRIPPED_REDWOOD_LOG);
        shelfBlocks.put(SEQUOIA_SHELF, STRIPPED_SEQUOIA_LOG);

        for (Block shelf : shelfBlocks.keySet())
            blockModelGenerators.createShelf(shelf, shelfBlocks.get(shelf));

        Map<Block, Block> saplings = new HashMap<>();

        saplings.put(CEDAR_SAPLING, POTTED_CEDAR_SAPLING);
        saplings.put(FIR_SAPLING, POTTED_FIR_SAPLING);
        saplings.put(HEMLOCK_SAPLING, POTTED_HEMLOCK_SAPLING);
        saplings.put(LARCH_SAPLING, POTTED_LARCH_SAPLING);
        saplings.put(PINE_SAPLING, POTTED_PINE_SAPLING);
        saplings.put(REDWOOD_SAPLING, POTTED_REDWOOD_SAPLING);
        saplings.put(SEQUOIA_SAPLING, POTTED_SEQUOIA_SAPLING);

        for (Block sapling : saplings.keySet())
            blockModelGenerators.createPlantWithDefaultItem(sapling, saplings.get(sapling), BlockModelGenerators.PlantType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(@NonNull ItemModelGenerators itemModelGenerators) {

    }
}
*/
