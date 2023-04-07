
package net.mcreator.enchantedmoon.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.enchantedmoon.init.EnchantedmoonModTabs;

public class DarkAmuletItem extends Item implements ICurioItem {
	public DarkAmuletItem() {
		super(new Item.Properties().tab(EnchantedmoonModTabs.TAB_ENCHANTED_MOON).stacksTo(1).rarity(Rarity.EPIC));
	}
}
