package net.mcreator.enchantedmoon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.enchantedmoon.network.EnchantedmoonModVariables;
import net.mcreator.enchantedmoon.init.EnchantedmoonModParticleTypes;
import net.mcreator.enchantedmoon.init.EnchantedmoonModMobEffects;

public class ShadowTeleport1Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double particleAmount = 0;
		if ((entity.getCapability(EnchantedmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EnchantedmoonModVariables.PlayerVariables())).CurrectMana >= 20
				&& !(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(EnchantedmoonModMobEffects.COOLDOWN.get()) : false)) {
			world.addParticle((SimpleParticleType) (EnchantedmoonModParticleTypes.DARK_PARTICLE.get()),
					(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5.5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
					(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(6)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
					(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5.5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 0, 1, 0);
		}
	}
}
