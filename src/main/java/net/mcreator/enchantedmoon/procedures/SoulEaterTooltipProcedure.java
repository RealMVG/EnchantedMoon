package net.mcreator.enchantedmoon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.Screen;

import net.mcreator.enchantedmoon.init.EnchantedmoonModItems;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class SoulEaterTooltipProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onItemTooltip(ItemTooltipEvent event) {
		execute(event, event.getItemStack(), event.getToolTip());
	}

	public static void execute(ItemStack itemstack, List<Component> tooltip) {
		execute(null, itemstack, tooltip);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack, List<Component> tooltip) {
		if (tooltip == null)
			return;
		if (itemstack.getItem() == EnchantedmoonModItems.SOUL_EATER.get()) {
			tooltip.add(Component.literal(""));
			if (!Screen.hasControlDown() && !Screen.hasShiftDown()) {
				tooltip.add(Component.literal("Press [\u00A76LShift\u00A7r] for spells"));
				tooltip.add(Component.literal("Press [\u00A73LControl\u00A7r] for item stats"));
			}
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A77\u269D\u2500\u2500\u2B52\u2500\u2B51\u2500\u2B52\u2500\u2500\u269D"));
				tooltip.add(Component.literal("\u00A77\u2726 Active skill"));
				tooltip.add(Component.literal("\u00A77[ \u00A7e+ \u00A77] \u00A76Shadow Dissection\u00A77 - make a series of attacks on a large number of targets"));
				tooltip.add(Component.literal("\u00A77\u269D\u2500\u2500\u2B52\u2500\u2B51\u2500\u2B52\u2500\u2500\u269D"));
				tooltip.add(Component.literal(""));
				tooltip.add(Component.literal("\u00A77\u269D\u2500\u2500\u2B52\u2500\u2B51\u2500\u2B52\u2500\u2500\u269D"));
				tooltip.add(Component.literal("\u00A77\u2727 Passive skill"));
				tooltip.add(Component.literal("\u00A77[ \u00A7e+ \u00A77] \u00A7bQuickstep\u00A77 - increases movement speed"));
				tooltip.add(Component.literal("\u00A77\u269D\u2500\u2500\u2B52\u2500\u2B51\u2500\u2B52\u2500\u2500\u269D"));
				tooltip.add(Component.literal(""));
			}
			if (Screen.hasControlDown()) {
				tooltip.add(Component.literal("\u00A77\u269D\u2500\u2500\u2B52\u2500\u2B51\u2500\u2B52\u2500\u2500\u269D"));
				tooltip.add(Component.literal("\u00A77Durability: \u00A74\u00A7lUnbreakable"));
				tooltip.add(Component.literal("\u00A77Repair Material: \u00A7fNone"));
				tooltip.add(Component.literal("\u00A77Enchantable: \u00A7aTrue"));
				tooltip.add(Component.literal("\u00A77Rarity: \u00A76Legendary"));
				tooltip.add(Component.literal("\u00A77\u269D\u2500\u2500\u2B52\u2500\u2B51\u2500\u2B52\u2500\u2500\u269D"));
				tooltip.add(Component.literal(""));
			}
			tooltip.add(Component.literal("\u00A77\u269D\u2500\u2500\u2B52\u2500\u2B51\u2500\u2B52\u2500\u2500\u269D"));
			tooltip.add(Component.literal("\u00A7k\u00A7l11\u00A7r\u00A7b\u00A7lEncnated\u00A7f\u00A7lMoon\u00A7k\u00A7l11\u00A7r"));
		}
	}
}
