package net.mcreator.enchantedmoon.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.enchantedmoon.network.EnchantedmoonModVariables;

public class ManaAmuletProcedure2Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EnchantedmoonModVariables.PlayerVariables())).BonusMana - 30;
			entity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.BonusMana = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
