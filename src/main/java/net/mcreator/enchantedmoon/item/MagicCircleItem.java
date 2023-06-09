
package net.mcreator.enchantedmoon.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.monster.EnderMan;

import net.mcreator.enchantedmoon.procedures.MagicCircleProcedureProcedure;
import net.mcreator.enchantedmoon.procedures.MagicCircleProcedure2Procedure;
import net.mcreator.enchantedmoon.init.EnchantedmoonModTabs;

public class MagicCircleItem extends Item implements ICurioItem {
	public MagicCircleItem() {
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

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		MagicCircleProcedureProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		MagicCircleProcedure2Procedure.execute(slotContext.entity());
	}
}
