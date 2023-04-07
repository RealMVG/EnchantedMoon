package net.mcreator.enchantedmoon.init;

import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;

import net.mcreator.enchantedmoon.client.renderer.MagicCircleRenderer;
import net.mcreator.enchantedmoon.client.model.Modelmagic_circle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EnchantedmoonModCuriosRenderers {
	@SubscribeEvent
	public static void registerLayers(final EntityRenderersEvent.RegisterLayerDefinitions evt) {
		evt.registerLayerDefinition(EnchantedmoonModLayerDefinitions.MAGIC_CIRCLE, Modelmagic_circle::createBodyLayer);
	}

	@SubscribeEvent
	public static void clientSetup(final FMLClientSetupEvent evt) {
		CuriosRendererRegistry.register(EnchantedmoonModItems.MAGIC_CIRCLE.get(), MagicCircleRenderer::new);
	}
}
