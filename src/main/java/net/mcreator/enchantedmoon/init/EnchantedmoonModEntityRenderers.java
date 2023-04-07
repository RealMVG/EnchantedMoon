
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enchantedmoon.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.enchantedmoon.client.renderer.TrainingDummyRenderer;
import net.mcreator.enchantedmoon.client.renderer.KuroshiRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EnchantedmoonModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(EnchantedmoonModEntities.TRAINING_DUMMY.get(), TrainingDummyRenderer::new);
		event.registerEntityRenderer(EnchantedmoonModEntities.KUROSHI.get(), KuroshiRenderer::new);
	}
}
