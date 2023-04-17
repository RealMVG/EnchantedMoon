package net.mcreator.enchantedmoon.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.enchantedmoon.network.EnchantedmoonModVariables;
import net.mcreator.enchantedmoon.init.EnchantedmoonModItems;

public class MagicCircleProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(EnchantedmoonModItems.MAGIC_CIRCLE.get(), lv).isPresent() : false) {
			{
				double _setval = (entity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EnchantedmoonModVariables.PlayerVariables())).ManaRegeneration * 2;
				entity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ManaRegeneration = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
