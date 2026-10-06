package me.witherbuilder13.a_world_reimagined.mixin;

import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value = CauldronInteraction.Dispatcher.class, remap = false)
public interface CauldronDispatchAccessor {
	
	@Invoker("put")
	void awr$put(Item item, CauldronInteraction interaction);
	
	/*@Invoker("put")
	void awr$putTag(TagKey<Item> tag, CauldronInteraction interaction);*/
}
