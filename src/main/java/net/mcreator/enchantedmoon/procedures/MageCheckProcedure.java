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
		if (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel ? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("enchantedmoon:mage_advancement"))).isDone() : false) {
			{
				boolean _setval = true;
				entity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Mage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (!(entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
				? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("enchantedmoon:mage_advancement"))).isDone()
				: false)) {
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
