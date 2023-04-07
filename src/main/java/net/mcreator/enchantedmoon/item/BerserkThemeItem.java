
package net.mcreator.enchantedmoon.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.enchantedmoon.init.EnchantedmoonModTabs;

public class BerserkThemeItem extends RecordItem {
	public BerserkThemeItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("enchantedmoon:berserktheme")), new Item.Properties().tab(EnchantedmoonModTabs.TAB_ENCHANTED_MOON).stacksTo(1).rarity(Rarity.RARE), 100);
	}
}
