package me.witherbuilder13.a_world_reimagined;

import me.witherbuilder13.a_world_reimagined.block.AWRBlocks;
import me.witherbuilder13.a_world_reimagined.block.util.AWRCauldronInteractions;
import me.witherbuilder13.a_world_reimagined.entity.AWREntityTypes;
import me.witherbuilder13.a_world_reimagined.item.AWRCreativeModeTabs;
import me.witherbuilder13.a_world_reimagined.item.AWRItems;
import me.witherbuilder13.a_world_reimagined.devonly.AWRBiomeModifiers;
import me.witherbuilder13.a_world_reimagined.world.feature.AWRFeatureUtils;
import net.fabricmc.api.ModInitializer;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.core.cauldron.CauldronInteractions;
import net.minecraft.core.dispenser.BlockSource;
import net.minecraft.core.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.core.dispenser.DispenseItemBehavior;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.DispensibleContainerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DispenserBlock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AWorldReimagined implements ModInitializer {

	public static final String MOD_ID = "a_world_reimagined";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		AWRBlocks.init();
		AWRItems.init();
		AWRCreativeModeTabs.init();
		AWRFeatureUtils.init();
		AWREntityTypes.init();
		//AWRBiomeModifiers.init();
		AWRCauldronInteractions.bootstrap();
		
		DispenserBlock.registerBehavior(AWRItems.QUICKSAND_BUCKET, new DefaultDispenseItemBehavior() {
			private final DispenseItemBehavior defaultDispenseItemBehavior = new DefaultDispenseItemBehavior();
				
			@Override
			public ItemStack execute(final BlockSource source, final ItemStack dispensed) {
				DispensibleContainerItem bucket = (DispensibleContainerItem) dispensed.getItem();
				BlockPos target = source.pos().relative(source.state().getValue(DispenserBlock.FACING));
				Level level = source.level();
				if (bucket.emptyContents(null, level, target, null)) {
					bucket.checkExtraContent(null, level, dispensed, target);
					
					return this.consumeWithRemainder(source, dispensed, new ItemStack(Items.BUCKET));
				} else
					return this.defaultDispenseItemBehavior.dispense(source, dispensed);
			}
		});
	}

	public static Identifier id(String id) {
		return Identifier.fromNamespaceAndPath(MOD_ID, id);
	}
}
