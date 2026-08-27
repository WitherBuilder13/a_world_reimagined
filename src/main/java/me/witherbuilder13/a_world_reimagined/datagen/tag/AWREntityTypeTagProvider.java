package me.witherbuilder13.a_world_reimagined.datagen.tag;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.EntityTypeTags;

import java.util.concurrent.CompletableFuture;

import static me.witherbuilder13.a_world_reimagined.entity.AWREntityTypeIds.*;

public class AWREntityTypeTagProvider extends FabricTagsProvider.EntityTypeTagsProvider {
	
	public AWREntityTypeTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
		super(output, registryLookupFuture);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	protected void addTags(HolderLookup.Provider registries) {
		builder(EntityTypeTags.BOAT)
				.add(ASPEN_BOAT, CEDAR_BOAT, FIR_BOAT, HEMLOCK_BOAT, LARCH_BOAT, PINE_BOAT, REDWOOD_BOAT, SEQUOIA_BOAT);
	}
}
