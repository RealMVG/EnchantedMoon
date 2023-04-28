package net.mcreator.enchantedmoon.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.enchantedmoon.network.EnchantedmoonModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class CakeComProc2Procedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = DoubleArgumentType.getDouble(arguments, "count");
			entity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ManaCakeCount = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
