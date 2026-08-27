package me.witherbuilder13.a_world_reimagined.mixin;

import com.google.common.collect.ImmutableList;
import net.minecraft.core.component.BlockTransformer.BlockTransformData;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.component.BlockTransformerMappings;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.stateproviders.CopyPropertiesProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.RuleBasedStateProvider;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import static me.witherbuilder13.a_world_reimagined.block.AWRBlocks.*;

@Mixin(BlockTransformerMappings.class)
public class BlockTransformerMappingsMixin {
	
	@Redirect(
			method = "<clinit>",
			at = @At(
					value = "INVOKE",
					target = "Lcom/google/common/collect/ImmutableList$Builder;build()Lcom/google/common/collect/ImmutableList;",
					ordinal = 0
			)
	)
	private static ImmutableList<BlockTransformData> awr$addStrippables(ImmutableList.Builder<BlockTransformData> builder) {
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
		
		BlockTransformData strippables = BlockTransformData.builder(rules.build())
				.sound(SoundEvents.AXE_STRIP)
				.build();
		
		builder.add(strippables);
		return builder.build();
	}
}
