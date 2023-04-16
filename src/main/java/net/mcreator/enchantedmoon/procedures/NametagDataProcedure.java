package net.mcreator.enchantedmoon.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.enchantedmoon.network.EnchantedmoonModVariables;

public class NametagDataProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = entity.getDisplayName().getString();
			entity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.nametag = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
