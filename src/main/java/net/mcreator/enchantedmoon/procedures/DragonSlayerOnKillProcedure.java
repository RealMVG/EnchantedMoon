package net.mcreator.enchantedmoon.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.enchantedmoon.network.EnchantedmoonModVariables;
import net.mcreator.enchantedmoon.init.EnchantedmoonModItems;

public class DragonSlayerOnKillProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof Chicken == true) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EnchantedmoonModItems.DRAGON_SLAYER.get() && (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 0) {
				{
					double _setval = (sourceentity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EnchantedmoonModVariables.PlayerVariables())).DragonSlayerCount + 0.1;
					sourceentity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.DragonSlayerCount = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			}
		}
	}
}
