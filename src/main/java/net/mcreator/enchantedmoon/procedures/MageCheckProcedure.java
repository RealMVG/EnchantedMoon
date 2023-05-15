package net.mcreator.enchantedmoon.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.enchantedmoon.network.EnchantedmoonModVariables;

public class MageCheckProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _plr0 && _plr0.level instanceof ServerLevel && _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("enchantedmoon:mage_advancement"))).isDone()) {
			{
				boolean _setval = true;
				entity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Mage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (!(entity instanceof ServerPlayer _plr1 && _plr1.level instanceof ServerLevel && _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().getAdvancement(new ResourceLocation("enchantedmoon:mage_advancement"))).isDone())) {
			{
				boolean _setval = false;
				entity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Mage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
