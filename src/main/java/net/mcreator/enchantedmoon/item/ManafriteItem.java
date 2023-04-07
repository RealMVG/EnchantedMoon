
package net.mcreator.enchantedmoon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.enchantedmoon.init.EnchantedmoonModTabs;

public class ManafriteItem extends Item {
	public ManafriteItem() {
		super(new Item.Properties().tab(EnchantedmoonModTabs.TAB_ENCHANTED_MOON).stacksTo(64).rarity(Rarity.COMMON));
	}
}
