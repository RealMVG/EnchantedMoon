
package net.mcreator.enchantedmoon.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.enchantedmoon.procedures.ManaRingProc2Procedure;
import net.mcreator.enchantedmoon.procedures.ManaRingProc1Procedure;
import net.mcreator.enchantedmoon.init.EnchantedmoonModTabs;

public class ManaRingItem extends Item implements ICurioItem {
	public ManaRingItem() {
		super(new Item.Properties().tab(EnchantedmoonModTabs.TAB_ENCHANTED_MOON).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		ManaRingProc1Procedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		ManaRingProc2Procedure.execute(slotContext.entity());
	}
}
