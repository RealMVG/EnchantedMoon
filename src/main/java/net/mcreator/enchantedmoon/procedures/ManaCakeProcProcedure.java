package net.mcreator.enchantedmoon.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.enchantedmoon.network.EnchantedmoonModVariables;

public class ManaCakeProcProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!((entity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EnchantedmoonModVariables.PlayerVariables())).ManaCakeCount >= 50)) {
			{
				double _setval = (entity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EnchantedmoonModVariables.PlayerVariables())).ManaCakeCount + 1;
				entity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ManaCakeCount = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
