package me.witherbuilder13.a_world_reimagined.datagen;

import com.google.common.collect.ImmutableMap;
import com.google.gson.*;
import me.witherbuilder13.a_world_reimagined.block.AWRBlocks;
import me.witherbuilder13.a_world_reimagined.block.util.AWRBlockFamilies;
import me.witherbuilder13.a_world_reimagined.item.AWRItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LayeredCauldronBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import org.jspecify.annotations.NonNull;

import java.util.*;

import static me.witherbuilder13.a_world_reimagined.block.AWRBlocks.*;

public class AWRModelProvider extends FabricModelProvider {
    public AWRModelProvider(FabricPackOutput output) {
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
        
        AWRBlockFamilies.getAllFamilies().forEach(blockFamily -> family(blockModelGenerators, TEXTURED_MODELS, blockFamily.getBaseBlock()).generateFor(blockFamily));

        List<Block> trivialCubes = List.of(
                ASPEN_LEAVES, CEDAR_LEAVES, FIR_LEAVES, HEMLOCK_LEAVES, JUNIPER_LEAVES, LARCH_LEAVES, PALO_VERDE_LEAVES, PINE_LEAVES, REDWOOD_LEAVES, SEQUOIA_LEAVES,
                QUICKSAND
        );

        trivialCubes.forEach(blockModelGenerators::createTrivialCube);

        Map<Block, Block> logBlocks = new HashMap<>();

        logBlocks.put(ALDER_LOG, ALDER_WOOD);
        logBlocks.put(APPLE_LOG, APPLE_WOOD);
        logBlocks.put(ASPEN_LOG, ASPEN_WOOD);
        logBlocks.put(BAOBAB_LOG, BAOBAB_WOOD);
        logBlocks.put(BEECH_LOG, BEECH_WOOD);
        logBlocks.put(CEDAR_LOG, CEDAR_WOOD);
        logBlocks.put(CHERRY_LOG, CHERRY_WOOD);
        logBlocks.put(CYPRESS_LOG, CYPRESS_WOOD);
        logBlocks.put(EBONY_LOG, EBONY_WOOD);
        logBlocks.put(ELM_LOG, ELM_WOOD);
        logBlocks.put(EUCALYPTUS_LOG, EUCALYPTUS_WOOD);
        logBlocks.put(FIG_LOG, FIG_WOOD);
        logBlocks.put(FIR_LOG, FIR_WOOD);
        logBlocks.put(HEMLOCK_LOG, HEMLOCK_WOOD);
        logBlocks.put(HICKORY_LOG, HICKORY_WOOD);
        logBlocks.put(JUNIPER_LOG, JUNIPER_WOOD);
        logBlocks.put(KAPOK_LOG, KAPOK_WOOD);
        logBlocks.put(LARCH_LOG, LARCH_WOOD);
        logBlocks.put(MAHOGANY_LOG, MAHOGANY_WOOD);
        logBlocks.put(MAPLE_LOG, MAPLE_WOOD);
        logBlocks.put(MESQUITE_LOG, MESQUITE_WOOD);
        logBlocks.put(OLIVE_LOG, OLIVE_WOOD);
        logBlocks.put(PALM_LOG, PALM_WOOD);
        logBlocks.put(PALO_VERDE_LOG, PALO_VERDE_WOOD);
        logBlocks.put(PINE_LOG, PINE_WOOD);
        logBlocks.put(REDWOOD_LOG, REDWOOD_WOOD);
        logBlocks.put(SEQUOIA_LOG, SEQUOIA_WOOD);
        logBlocks.put(WILLOW_LOG, WILLOW_WOOD);

        logBlocks.put(STRIPPED_ALDER_LOG, STRIPPED_ALDER_WOOD);
        logBlocks.put(STRIPPED_APPLE_LOG, STRIPPED_APPLE_WOOD);
        logBlocks.put(STRIPPED_ASPEN_LOG, STRIPPED_ASPEN_WOOD);
        logBlocks.put(STRIPPED_BAOBAB_LOG, STRIPPED_BAOBAB_WOOD);
        logBlocks.put(STRIPPED_BEECH_LOG, STRIPPED_BEECH_WOOD);
        logBlocks.put(STRIPPED_CEDAR_LOG, STRIPPED_CEDAR_WOOD);
        logBlocks.put(STRIPPED_CHERRY_LOG, STRIPPED_CHERRY_WOOD);
        logBlocks.put(STRIPPED_CYPRESS_LOG, STRIPPED_CYPRESS_WOOD);
        logBlocks.put(STRIPPED_EBONY_LOG, STRIPPED_EBONY_WOOD);
        logBlocks.put(STRIPPED_ELM_LOG, STRIPPED_ELM_WOOD);
        logBlocks.put(STRIPPED_EUCALYPTUS_LOG, STRIPPED_EUCALYPTUS_WOOD);
        logBlocks.put(STRIPPED_FIG_LOG, STRIPPED_FIG_WOOD);
        logBlocks.put(STRIPPED_FIR_LOG, STRIPPED_FIR_WOOD);
        logBlocks.put(STRIPPED_HEMLOCK_LOG, STRIPPED_HEMLOCK_WOOD);
        logBlocks.put(STRIPPED_HICKORY_LOG, STRIPPED_HICKORY_WOOD);
        logBlocks.put(STRIPPED_JUNIPER_LOG, STRIPPED_JUNIPER_WOOD);
        logBlocks.put(STRIPPED_KAPOK_LOG, STRIPPED_KAPOK_WOOD);
        logBlocks.put(STRIPPED_LARCH_LOG, STRIPPED_LARCH_WOOD);
        logBlocks.put(STRIPPED_MAHOGANY_LOG, STRIPPED_MAHOGANY_WOOD);
        logBlocks.put(STRIPPED_MAPLE_LOG, STRIPPED_MAPLE_WOOD);
        logBlocks.put(STRIPPED_MESQUITE_LOG, STRIPPED_MESQUITE_WOOD);
        logBlocks.put(STRIPPED_OLIVE_LOG, STRIPPED_OLIVE_WOOD);
        logBlocks.put(STRIPPED_PALM_LOG, STRIPPED_PALM_WOOD);
        logBlocks.put(STRIPPED_PALO_VERDE_LOG, STRIPPED_PALO_VERDE_WOOD);
        logBlocks.put(STRIPPED_PINE_LOG, STRIPPED_PINE_WOOD);
        logBlocks.put(STRIPPED_REDWOOD_LOG, STRIPPED_REDWOOD_WOOD);
        logBlocks.put(STRIPPED_SEQUOIA_LOG, STRIPPED_SEQUOIA_WOOD);
        logBlocks.put(STRIPPED_WILLOW_LOG, STRIPPED_WILLOW_WOOD);

        logBlocks.forEach((log, wood) -> blockModelGenerators.woodProvider(log).logWithHorizontal(log).wood(wood));

        Map<Block, Block> shelfBlocks = new HashMap<>();

        shelfBlocks.put(ALDER_SHELF, STRIPPED_ALDER_LOG);
        shelfBlocks.put(APPLE_SHELF, STRIPPED_APPLE_LOG);
        shelfBlocks.put(ASPEN_SHELF, STRIPPED_ASPEN_LOG);
        shelfBlocks.put(BAOBAB_SHELF, STRIPPED_BAOBAB_LOG);
        shelfBlocks.put(BEECH_SHELF, STRIPPED_BEECH_LOG);
        shelfBlocks.put(CEDAR_SHELF, STRIPPED_CEDAR_LOG);
        shelfBlocks.put(CHERRY_SHELF, STRIPPED_CHERRY_LOG);
        shelfBlocks.put(CYPRESS_SHELF, STRIPPED_CYPRESS_LOG);
        shelfBlocks.put(EBONY_SHELF, STRIPPED_EBONY_LOG);
        shelfBlocks.put(ELM_SHELF, STRIPPED_ELM_LOG);
        shelfBlocks.put(EUCALYPTUS_SHELF, STRIPPED_EUCALYPTUS_LOG);
        shelfBlocks.put(FIG_SHELF, STRIPPED_FIG_LOG);
        shelfBlocks.put(FIR_SHELF, STRIPPED_FIR_LOG);
        shelfBlocks.put(HEMLOCK_SHELF, STRIPPED_HEMLOCK_LOG);
        shelfBlocks.put(HICKORY_SHELF, STRIPPED_HICKORY_LOG);
        shelfBlocks.put(JUNIPER_SHELF, STRIPPED_JUNIPER_LOG);
        shelfBlocks.put(KAPOK_SHELF, STRIPPED_KAPOK_LOG);
        shelfBlocks.put(LARCH_SHELF, STRIPPED_LARCH_LOG);
        shelfBlocks.put(MAHOGANY_SHELF, STRIPPED_MAHOGANY_LOG);
        shelfBlocks.put(MAPLE_SHELF, STRIPPED_MAPLE_LOG);
        shelfBlocks.put(MESQUITE_SHELF, STRIPPED_MESQUITE_LOG);
        shelfBlocks.put(OLIVE_SHELF, STRIPPED_OLIVE_LOG);
        shelfBlocks.put(PALM_SHELF, STRIPPED_PALM_LOG);
        shelfBlocks.put(PALO_VERDE_SHELF, STRIPPED_PALO_VERDE_LOG);
        shelfBlocks.put(PINE_SHELF, STRIPPED_PINE_LOG);
        shelfBlocks.put(REDWOOD_SHELF, STRIPPED_REDWOOD_LOG);
        shelfBlocks.put(SEQUOIA_SHELF, STRIPPED_SEQUOIA_LOG);
        shelfBlocks.put(WILLOW_SHELF, STRIPPED_WILLOW_LOG);

        shelfBlocks.forEach(blockModelGenerators::createShelf);
        
        List<Block> tintedLeaves = List.of(
                ALDER_LEAVES, APPLE_LEAVES, BAOBAB_LEAVES, BEECH_LEAVES, CHERRY_LEAVES, CYPRESS_LEAVES,
                EBONY_LEAVES, ELM_LEAVES, EUCALYPTUS_LEAVES, FIG_LEAVES, HICKORY_LEAVES, KAPOK_LEAVES,
                MAHOGANY_LEAVES, MAPLE_LEAVES, MESQUITE_LEAVES, OLIVE_LEAVES, PALM_LEAVES, WILLOW_LEAVES
        );
        
        for (Block tintedLeaf : tintedLeaves) {
            blockModelGenerators.createTintedLeaves(tintedLeaf, TexturedModel.LEAVES, -12012264);
        }

        Map<Block, Block> saplings = new HashMap<>();

        saplings.put(ALDER_SAPLING, POTTED_ALDER_SAPLING);
        saplings.put(APPLE_SAPLING, POTTED_APPLE_SAPLING);
        saplings.put(ASPEN_SAPLING, POTTED_ASPEN_SAPLING);
        saplings.put(BAOBAB_SAPLING, POTTED_BAOBAB_SAPLING);
        saplings.put(BEECH_SAPLING, POTTED_BEECH_SAPLING);
        saplings.put(CEDAR_SAPLING, POTTED_CEDAR_SAPLING);
        saplings.put(CHERRY_SAPLING, POTTED_CHERRY_SAPLING);
        saplings.put(CYPRESS_SAPLING, POTTED_CYPRESS_SAPLING);
        saplings.put(EBONY_SAPLING, POTTED_EBONY_SAPLING);
        saplings.put(ELM_SAPLING, POTTED_ELM_SAPLING);
        saplings.put(EUCALYPTUS_SAPLING, POTTED_EUCALYPTUS_SAPLING);
        saplings.put(FIG_SAPLING, POTTED_FIG_SAPLING);
        saplings.put(FIR_SAPLING, POTTED_FIR_SAPLING);
        saplings.put(HEMLOCK_SAPLING, POTTED_HEMLOCK_SAPLING);
        saplings.put(HICKORY_SAPLING, POTTED_HICKORY_SAPLING);
        saplings.put(JUNIPER_SAPLING, POTTED_JUNIPER_SAPLING);
        saplings.put(KAPOK_SAPLING, POTTED_KAPOK_SAPLING);
        saplings.put(LARCH_SAPLING, POTTED_LARCH_SAPLING);
        saplings.put(MAHOGANY_SAPLING, POTTED_MAHOGANY_SAPLING);
        saplings.put(MAPLE_SAPLING, POTTED_MAPLE_SAPLING);
        saplings.put(MESQUITE_SAPLING, POTTED_MESQUITE_SAPLING);
        saplings.put(OLIVE_SAPLING, POTTED_OLIVE_SAPLING);
        saplings.put(PALM_SAPLING, POTTED_PALM_SAPLING);
        saplings.put(PALO_VERDE_SAPLING, POTTED_PALO_VERDE_SAPLING);
        saplings.put(PINE_SAPLING, POTTED_PINE_SAPLING);
        saplings.put(REDWOOD_SAPLING, POTTED_REDWOOD_SAPLING);
        saplings.put(SEQUOIA_SAPLING, POTTED_SEQUOIA_SAPLING);
        saplings.put(WILLOW_SAPLING, POTTED_WILLOW_SAPLING);

        saplings.forEach((sapling, pottedSapling) -> blockModelGenerators.createPlantWithDefaultItem(sapling, pottedSapling, BlockModelGenerators.PlantType.NOT_TINTED));
        
        createPermafrost(blockModelGenerators);
        blockModelGenerators.createCrossBlockWithDefaultItem(SHORT_FROSTED_GRASS, BlockModelGenerators.PlantType.NOT_TINTED);
        blockModelGenerators.createDoublePlantWithDefaultItem(TALL_FROSTED_GRASS, BlockModelGenerators.PlantType.NOT_TINTED);
        blockModelGenerators.createCrossBlockWithDefaultItem(SHORT_TUNDRA_GRASS, BlockModelGenerators.PlantType.NOT_TINTED);
        blockModelGenerators.createCrossBlockWithDefaultItem(TALL_TUNDRA_GRASS, BlockModelGenerators.PlantType.NOT_TINTED);
        blockModelGenerators.createCrossBlockWithDefaultItem(SHORT_PRAIRIE_GRASS, BlockModelGenerators.PlantType.NOT_TINTED);
        blockModelGenerators.createDoublePlantWithDefaultItem(TALL_PRAIRIE_GRASS, BlockModelGenerators.PlantType.NOT_TINTED);
        
        blockModelGenerators.createRotatedVariantBlock(WHITE_SAND);
        
        blockModelGenerators.createLeafLitter(PINECONES);
        
        createPeatBlocks(blockModelGenerators);
        
        createQuicksandCauldron(blockModelGenerators);
        
        blockModelGenerators.createDoublePlantWithDefaultItem(CATTAIL, BlockModelGenerators.PlantType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(@NonNull ItemModelGenerators itemModelGenerators) {
        
        List<Item> items = List.of(
                
                AWRItems.ALDER_BOAT, AWRItems.ALDER_CHEST_BOAT,
                AWRItems.APPLE_BOAT, AWRItems.APPLE_CHEST_BOAT,
                AWRItems.ASPEN_BOAT, AWRItems.ASPEN_CHEST_BOAT,
                AWRItems.BAOBAB_BOAT, AWRItems.BAOBAB_CHEST_BOAT,
                AWRItems.BEECH_BOAT, AWRItems.BEECH_CHEST_BOAT,
                AWRItems.CEDAR_BOAT, AWRItems.CEDAR_CHEST_BOAT,
                AWRItems.CHERRY_BOAT, AWRItems.CHERRY_CHEST_BOAT,
                AWRItems.CYPRESS_BOAT, AWRItems.CYPRESS_CHEST_BOAT,
                AWRItems.EBONY_BOAT, AWRItems.EBONY_CHEST_BOAT,
                AWRItems.ELM_BOAT, AWRItems.ELM_CHEST_BOAT,
                AWRItems.EUCALYPTUS_BOAT, AWRItems.EUCALYPTUS_CHEST_BOAT,
                AWRItems.FIG_BOAT, AWRItems.FIG_CHEST_BOAT,
                AWRItems.FIR_BOAT, AWRItems.FIR_CHEST_BOAT,
                AWRItems.HEMLOCK_BOAT, AWRItems.HEMLOCK_CHEST_BOAT,
                AWRItems.HICKORY_BOAT, AWRItems.HICKORY_CHEST_BOAT,
                AWRItems.JUNIPER_BOAT, AWRItems.JUNIPER_CHEST_BOAT,
                AWRItems.KAPOK_BOAT, AWRItems.KAPOK_CHEST_BOAT,
                AWRItems.LARCH_BOAT, AWRItems.LARCH_CHEST_BOAT,
                AWRItems.MAHOGANY_BOAT, AWRItems.MAHOGANY_CHEST_BOAT,
                AWRItems.MAPLE_BOAT, AWRItems.MAPLE_CHEST_BOAT,
                AWRItems.MESQUITE_BOAT, AWRItems.MESQUITE_CHEST_BOAT,
                AWRItems.OLIVE_BOAT, AWRItems.OLIVE_CHEST_BOAT,
                AWRItems.PALM_BOAT, AWRItems.PALM_CHEST_BOAT,
                AWRItems.PALO_VERDE_BOAT, AWRItems.PALO_VERDE_CHEST_BOAT,
                AWRItems.PINE_BOAT, AWRItems.PINE_CHEST_BOAT,
                AWRItems.REDWOOD_BOAT, AWRItems.REDWOOD_CHEST_BOAT,
                AWRItems.SEQUOIA_BOAT, AWRItems.SEQUOIA_CHEST_BOAT,
                AWRItems.WILLOW_BOAT, AWRItems.WILLOW_CHEST_BOAT,
                
                AWRItems.QUICKSAND_BUCKET,
                AWRItems.ACORN, AWRItems.BAOBAB_FRUIT, AWRItems.CHERRY, AWRItems.COCONUT, AWRItems.DATE,
                AWRItems.FIG, AWRItems.OLIVE, AWRItems.PECAN, AWRItems.PERSIMMON
        );
        
        items.forEach(item -> itemModelGenerators.generateFlatItem(item, ModelTemplates.FLAT_ITEM));
    }
    
    //` -------------------------------------------------------------------------------------------------------------------------------------------------------
    
    private static BlockModelGenerators.BlockFamilyProvider family(BlockModelGenerators blockModelGenerators, Map<Block, TexturedModel> TEXTURED_MODELS, final Block block) {
        TexturedModel model = TEXTURED_MODELS.getOrDefault(block, TexturedModel.CUBE.get(block));
		return blockModelGenerators.new BlockFamilyProvider(model.getMapping()).fullBlock(block, model.getTemplate());
    }
    
    private static void createPermafrost(BlockModelGenerators blockModelGenerators) {
        Material bottomTexture = TextureMapping.getBlockTexture(Blocks.DIRT);
        TextureMapping snowyMapping = new TextureMapping()
                .put(TextureSlot.BOTTOM, bottomTexture)
                .copyForced(TextureSlot.BOTTOM, TextureSlot.PARTICLE)
                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(Blocks.GRASS_BLOCK, "_top"))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(Blocks.GRASS_BLOCK, "_snow"));
        MultiVariant snowyGrass = BlockModelGenerators.plainVariant(ModelTemplates.CUBE_BOTTOM_TOP.createWithSuffix(
                Blocks.GRASS_BLOCK, "_snow", snowyMapping, blockModelGenerators.modelOutput
        ));
        MultiVariant permafrostModel = BlockModelGenerators.createRotatedVariants(
                BlockModelGenerators.plainModel(
                        TexturedModel.CUBE_BOTTOM_TOP
                                .get(PERMAFROST)
                                .updateTextures(m -> m.put(TextureSlot.BOTTOM, bottomTexture))
                                .create(PERMAFROST, blockModelGenerators.modelOutput)
                )
        );
        blockModelGenerators.createGrassLikeBlock(PERMAFROST, permafrostModel, snowyGrass);
    }
    
    private void createPeatBlocks(BlockModelGenerators blockModelGenerators) {
        TextureMapping textures = TextureMapping.cube(PEAT);
        Identifier peatTexture = textures.get(TextureSlot.ALL).sprite();
        MultiVariant peatModel = BlockModelGenerators.plainVariant(ModelTemplates.CUBE_ALL.create(PEAT_BLOCK, textures, blockModelGenerators.modelOutput));
        
        for (int level = 1; level < 8; level++) {
            int height = level * 2;
            Identifier modelLoc = ModelLocationUtils.getModelLocation(PEAT, "_height" + height);
            blockModelGenerators.modelOutput.accept(modelLoc, () -> createLayerModel(peatTexture, height));
        }
        
        blockModelGenerators.blockStateOutput
                .accept(
                        MultiVariantGenerator.dispatch(PEAT)
                                .with(
                                        PropertyDispatch.initial(BlockStateProperties.LAYERS)
                                                .generate(level -> level < 8
                                                        ? BlockModelGenerators.plainVariant(ModelLocationUtils.getModelLocation(PEAT, "_height" + level * 2))
                                                        : peatModel
                                                )
                                )
                );
        blockModelGenerators.registerSimpleItemModel(PEAT, ModelLocationUtils.getModelLocation(PEAT, "_height2"));
        blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(PEAT_BLOCK, peatModel));
    }
    
    private void createQuicksandCauldron(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.blockStateOutput
                .accept(
                        MultiVariantGenerator.dispatch(QUICKSAND_CAULDRON)
                                .with(
                                        PropertyDispatch.initial(LayeredCauldronBlock.LEVEL)
                                                .select(
                                                        1,
                                                        BlockModelGenerators.plainVariant(
                                                                ModelTemplates.CAULDRON_LEVEL1
                                                                        .createWithSuffix(
                                                                                QUICKSAND_CAULDRON,
                                                                                "_level1",
                                                                                TextureMapping.cauldron(TextureMapping.getBlockTexture(QUICKSAND)),
                                                                                blockModelGenerators.modelOutput
                                                                        )
                                                        )
                                                )
                                                .select(
                                                        2,
                                                        BlockModelGenerators.plainVariant(
                                                                ModelTemplates.CAULDRON_LEVEL2
                                                                        .createWithSuffix(
                                                                                QUICKSAND_CAULDRON,
                                                                                "_level2",
                                                                                TextureMapping.cauldron(TextureMapping.getBlockTexture(QUICKSAND)),
                                                                                blockModelGenerators.modelOutput
                                                                        )
                                                        )
                                                )
                                                .select(
                                                        3,
                                                        BlockModelGenerators.plainVariant(
                                                                ModelTemplates.CAULDRON_FULL
                                                                        .createWithSuffix(
                                                                                QUICKSAND_CAULDRON,
                                                                                "_full",
                                                                                TextureMapping.cauldron(TextureMapping.getBlockTexture(QUICKSAND)),
                                                                                blockModelGenerators.modelOutput
                                                                        )
                                                        )
                                                )
                                )
                );
    }
    
    private static JsonElement createLayerModel(Identifier texture, int height) {
        String textureRef = texture.toString();
        
        Map<String, Face> faces = new LinkedHashMap<>();
        faces.put("down",  new Face(new int[]{0, 0, 16, 16}, "#texture", "down"));
        faces.put("up",    new Face(new int[]{0, 0, 16, 16}, "#texture", null));
        int uvTop = 16 - height;
        faces.put("north", new Face(new int[]{0, uvTop, 16, 16}, "#texture", "north"));
        faces.put("south", new Face(new int[]{0, uvTop, 16, 16}, "#texture", "south"));
        faces.put("west",  new Face(new int[]{0, uvTop, 16, 16}, "#texture", "west"));
        faces.put("east",  new Face(new int[]{0, uvTop, 16, 16}, "#texture", "east"));
        
        String parent = height == 2 ? "block/thin_block": null;
        
        LayerModel model = new LayerModel(
                parent,
                Map.of("particle", textureRef, "texture", textureRef),
                List.of(new Element(new int[]{0, 0, 0}, new int[]{16, height, 16}, faces))
        );
        
        return GSON.toJsonTree(model);
    }
    
    private static final Gson GSON = new GsonBuilder().create();
    
    private record LayerModel(String parent, Map<String, String> textures, List<Element> elements) {}
    private record Element(int[] from, int[] to, Map<String, Face> faces) {}
    private record Face(int[] uv, String texture, String cullface) {}
}
