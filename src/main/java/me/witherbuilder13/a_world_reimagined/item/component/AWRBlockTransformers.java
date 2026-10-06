package me.witherbuilder13.a_world_reimagined.item.component;

import me.witherbuilder13.a_world_reimagined.api.ExtensibleBlockTransformer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.component.BlockTransformer;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.component.BlockTransformers;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.stateproviders.CopyPropertiesProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.RuleBasedStateProvider;

import static me.witherbuilder13.a_world_reimagined.block.AWRBlocks.*;

public class AWRBlockTransformers {
	
	private static BlockTransformer.BlockTransformData awrStrippables() {
		RuleBasedStateProvider.Builder rules = RuleBasedStateProvider.builder();
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(ALDER_LOG), new CopyPropertiesProvider(STRIPPED_ALDER_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(ALDER_WOOD), new CopyPropertiesProvider(STRIPPED_ALDER_WOOD));
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(APPLE_LOG), new CopyPropertiesProvider(STRIPPED_APPLE_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(APPLE_WOOD), new CopyPropertiesProvider(STRIPPED_APPLE_WOOD));
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(ASPEN_LOG), new CopyPropertiesProvider(STRIPPED_ASPEN_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(ASPEN_WOOD), new CopyPropertiesProvider(STRIPPED_ASPEN_WOOD));
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(BAOBAB_LOG), new CopyPropertiesProvider(STRIPPED_BAOBAB_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(BAOBAB_WOOD), new CopyPropertiesProvider(STRIPPED_BAOBAB_WOOD));
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(BEECH_LOG), new CopyPropertiesProvider(STRIPPED_BEECH_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(BEECH_WOOD), new CopyPropertiesProvider(STRIPPED_BEECH_WOOD));
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(CEDAR_LOG), new CopyPropertiesProvider(STRIPPED_CEDAR_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(CEDAR_WOOD), new CopyPropertiesProvider(STRIPPED_CEDAR_WOOD));
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(CHERRY_LOG), new CopyPropertiesProvider(STRIPPED_CHERRY_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(CHERRY_WOOD), new CopyPropertiesProvider(STRIPPED_CHERRY_WOOD));
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(CYPRESS_LOG), new CopyPropertiesProvider(STRIPPED_CYPRESS_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(CYPRESS_WOOD), new CopyPropertiesProvider(STRIPPED_CYPRESS_WOOD));
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(EBONY_LOG), new CopyPropertiesProvider(STRIPPED_EBONY_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(EBONY_WOOD), new CopyPropertiesProvider(STRIPPED_EBONY_WOOD));
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(ELM_LOG), new CopyPropertiesProvider(STRIPPED_ELM_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(ELM_WOOD), new CopyPropertiesProvider(STRIPPED_ELM_WOOD));
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(EUCALYPTUS_LOG), new CopyPropertiesProvider(STRIPPED_EUCALYPTUS_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(EUCALYPTUS_WOOD), new CopyPropertiesProvider(STRIPPED_EUCALYPTUS_WOOD));
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(FIG_LOG), new CopyPropertiesProvider(STRIPPED_FIG_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(FIG_WOOD), new CopyPropertiesProvider(STRIPPED_FIG_WOOD));
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(FIR_LOG), new CopyPropertiesProvider(STRIPPED_FIR_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(FIR_WOOD), new CopyPropertiesProvider(STRIPPED_FIR_WOOD));
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(HEMLOCK_LOG), new CopyPropertiesProvider(STRIPPED_HEMLOCK_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(HEMLOCK_WOOD), new CopyPropertiesProvider(STRIPPED_HEMLOCK_WOOD));
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(HICKORY_LOG), new CopyPropertiesProvider(STRIPPED_HICKORY_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(HICKORY_WOOD), new CopyPropertiesProvider(STRIPPED_HICKORY_WOOD));
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(JUNIPER_LOG), new CopyPropertiesProvider(STRIPPED_JUNIPER_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(JUNIPER_WOOD), new CopyPropertiesProvider(STRIPPED_JUNIPER_WOOD));
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(KAPOK_LOG), new CopyPropertiesProvider(STRIPPED_KAPOK_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(KAPOK_WOOD), new CopyPropertiesProvider(STRIPPED_KAPOK_WOOD));
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(LARCH_LOG), new CopyPropertiesProvider(STRIPPED_LARCH_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(LARCH_WOOD), new CopyPropertiesProvider(STRIPPED_LARCH_WOOD));
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(MAHOGANY_LOG), new CopyPropertiesProvider(STRIPPED_MAHOGANY_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(MAHOGANY_WOOD), new CopyPropertiesProvider(STRIPPED_MAHOGANY_WOOD));
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(MAPLE_LOG), new CopyPropertiesProvider(STRIPPED_MAPLE_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(MAPLE_WOOD), new CopyPropertiesProvider(STRIPPED_MAPLE_WOOD));
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(MESQUITE_LOG), new CopyPropertiesProvider(STRIPPED_MESQUITE_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(MESQUITE_WOOD), new CopyPropertiesProvider(STRIPPED_MESQUITE_WOOD));
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(OLIVE_LOG), new CopyPropertiesProvider(STRIPPED_OLIVE_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(OLIVE_WOOD), new CopyPropertiesProvider(STRIPPED_OLIVE_WOOD));
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(PALM_LOG), new CopyPropertiesProvider(STRIPPED_PALM_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(PALM_WOOD), new CopyPropertiesProvider(STRIPPED_PALM_WOOD));
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(PALO_VERDE_LOG), new CopyPropertiesProvider(STRIPPED_PALO_VERDE_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(PALO_VERDE_WOOD), new CopyPropertiesProvider(STRIPPED_PALO_VERDE_WOOD));
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(PINE_LOG), new CopyPropertiesProvider(STRIPPED_PINE_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(PINE_WOOD), new CopyPropertiesProvider(STRIPPED_PINE_WOOD));
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(REDWOOD_LOG), new CopyPropertiesProvider(STRIPPED_REDWOOD_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(REDWOOD_WOOD), new CopyPropertiesProvider(STRIPPED_REDWOOD_WOOD));
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(SEQUOIA_LOG), new CopyPropertiesProvider(STRIPPED_SEQUOIA_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(SEQUOIA_WOOD), new CopyPropertiesProvider(STRIPPED_SEQUOIA_WOOD));
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(WILLOW_LOG), new CopyPropertiesProvider(STRIPPED_WILLOW_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(WILLOW_WOOD), new CopyPropertiesProvider(STRIPPED_WILLOW_WOOD));
		
		
		return BlockTransformer.BlockTransformData.builder(rules.build())
				.sound(SoundEvents.AXE_STRIP)
				.build();
	}
	
	public static void init() {
		ServerLifecycleEvents.SERVER_STARTING.register((server) -> {
			RegistryAccess registryAccess = server.registryAccess();
			
			BlockTransformer axe = registryAccess.lookupOrThrow(Registries.BLOCK_TRANSFORMER).getOrThrow(BlockTransformers.AXE).value();
			
			((ExtensibleBlockTransformer) (Object) axe).awr$addTransform(awrStrippables());
		});
	}
	
}
