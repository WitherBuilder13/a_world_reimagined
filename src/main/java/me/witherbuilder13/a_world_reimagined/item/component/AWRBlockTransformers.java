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
		
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(ASPEN_LOG), new CopyPropertiesProvider(STRIPPED_ASPEN_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(ASPEN_WOOD), new CopyPropertiesProvider(STRIPPED_ASPEN_WOOD));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(CEDAR_LOG), new CopyPropertiesProvider(STRIPPED_CEDAR_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(CEDAR_WOOD), new CopyPropertiesProvider(STRIPPED_CEDAR_WOOD));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(FIR_LOG), new CopyPropertiesProvider(STRIPPED_FIR_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(FIR_WOOD), new CopyPropertiesProvider(STRIPPED_FIR_WOOD));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(HEMLOCK_LOG), new CopyPropertiesProvider(STRIPPED_HEMLOCK_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(HEMLOCK_WOOD), new CopyPropertiesProvider(STRIPPED_HEMLOCK_WOOD));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(LARCH_LOG), new CopyPropertiesProvider(STRIPPED_LARCH_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(LARCH_WOOD), new CopyPropertiesProvider(STRIPPED_LARCH_WOOD));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(PINE_LOG), new CopyPropertiesProvider(STRIPPED_PINE_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(PINE_WOOD), new CopyPropertiesProvider(STRIPPED_PINE_WOOD));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(REDWOOD_LOG), new CopyPropertiesProvider(STRIPPED_REDWOOD_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(REDWOOD_WOOD), new CopyPropertiesProvider(STRIPPED_REDWOOD_WOOD));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(SEQUOIA_LOG), new CopyPropertiesProvider(STRIPPED_SEQUOIA_LOG));
		rules.ifTrueThenProvide(BlockPredicate.matchesBlocks(SEQUOIA_WOOD), new CopyPropertiesProvider(STRIPPED_SEQUOIA_WOOD));
		
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
