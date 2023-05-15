package net.mcreator.enchantedmoon.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.enchantedmoon.network.EnchantedmoonModVariables;

public class DragonSlayerDamageCountProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		{
			String _setval = "Damage: " + ((entity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EnchantedmoonModVariables.PlayerVariables())).DragonSlayerCount + 8);
			entity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.DragonSlayer = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		return (entity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EnchantedmoonModVariables.PlayerVariables())).DragonSlayer;
	}
}
