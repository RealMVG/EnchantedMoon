
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enchantedmoon.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class EnchantedmoonModTabs {
	public static CreativeModeTab TAB_ENCHANTED_MOON;

	public static void load() {
		TAB_ENCHANTED_MOON = new CreativeModeTab("tabenchanted_moon") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(EnchantedmoonModItems.MAGIC_CIRCLE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
