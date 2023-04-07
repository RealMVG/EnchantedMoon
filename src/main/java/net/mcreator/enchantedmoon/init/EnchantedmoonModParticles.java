
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enchantedmoon.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.enchantedmoon.client.particle.DarkParticleParticle;
import net.mcreator.enchantedmoon.client.particle.CyberSweepParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EnchantedmoonModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.register(EnchantedmoonModParticleTypes.CYBER_SWEEP.get(), CyberSweepParticle::provider);
		event.register(EnchantedmoonModParticleTypes.DARK_PARTICLE.get(), DarkParticleParticle::provider);
	}
}
