package net.mcreator.enchantedmoon.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.enchantedmoon.network.EnchantedmoonModVariables;

public class ManaBarProc2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EnchantedmoonModVariables.PlayerVariables())).CurrectMana >= 20) {
			return true;
		}
		return false;
	}
}
