
package net.mcreator.enchantedmoon.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.monster.EnderMan;

import net.mcreator.enchantedmoon.init.EnchantedmoonModTabs;

public class MiniKuroshiItem extends Item implements ICurioItem {
	public MiniKuroshiItem() {
		super(new Item.Properties().tab(EnchantedmoonModTabs.TAB_ENCHANTED_MOON).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public boolean makesPiglinsNeutral(SlotContext slotContext, ItemStack stack) {
		return true;
	}

	@Override
	public boolean isEnderMask(SlotContext slotContext, EnderMan enderMan, ItemStack stack) {
		return true;
	}
}
