package me.witherbuilder13.a_world_reimagined.mixin;

import com.google.common.collect.ImmutableList;
import me.witherbuilder13.a_world_reimagined.api.ExtensibleBlockTransformer;
import net.minecraft.core.component.BlockTransformer;
import net.minecraft.core.component.BlockTransformer.BlockTransformData;
import org.spongepowered.asm.mixin.*;

import java.util.List;

@Mixin(BlockTransformer.class)
public abstract class BlockTransformerMixin implements ExtensibleBlockTransformer {
	
	@Mutable
	@Shadow
	@Final
	private List<BlockTransformData> transforms;
	
	@Override
	public void awr$addTransform(BlockTransformData data) {
		this.transforms = ImmutableList.<BlockTransformData>builder()
				.addAll(this.transforms)
				.add(data)
				.build();
	}
}
