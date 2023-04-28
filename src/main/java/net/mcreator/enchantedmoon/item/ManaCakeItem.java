
package net.mcreator.enchantedmoon.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.enchantedmoon.procedures.ManaCakeProcProcedure;
import net.mcreator.enchantedmoon.init.EnchantedmoonModTabs;

public class ManaCakeItem extends Item {
	public ManaCakeItem() {
		super(new Item.Properties().tab(EnchantedmoonModTabs.TAB_ENCHANTED_MOON).stacksTo(1).rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f).alwaysEat()

				.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ManaCakeProcProcedure.execute(entity);
		return retval;
	}
}
