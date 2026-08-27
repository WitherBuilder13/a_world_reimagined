package me.witherbuilder13.a_world_reimagined.api;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

import java.util.Locale;

public class TranslationUtils {
	
	public static String createItem(Item item) {
		return create(item.getDescriptionId());
	}
	
	public static String getBiomeTranslationKey(ResourceKey<Biome> biome) {
		return "biome." + biome.identifier().toLanguageKey();
	}
	
	public static String createBiome(ResourceKey<Biome> biome) {
		return create(getBiomeTranslationKey(biome));
	}
	
	public static String createChestBoat(Item chestBoat) {
		String[] words = split(chestBoat.getDescriptionId());
		String first = words[0];
		
		return first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase() + " Boat with Chest";
	}
	
	public static String createChestBoat(EntityType<ChestBoat> chestBoat) {
		String[] words = split(chestBoat.getDescriptionId());
		String first = words[0];
		
		return first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase() + " Boat with Chest";
	}
	
	public static String create(String input) {
		String[] words = split(input);
		
		for (int i = 0; i < words.length; i++)
			words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
		
		return String.join(" ", words);
	}
	
	private static String[] split(String input) {
		String lastPart = input.substring(input.lastIndexOf('.') + 1);
		
		return lastPart.split("_");
	}
}
