
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enchantedmoon.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.enchantedmoon.client.model.Modelmagic_circle;
import net.mcreator.enchantedmoon.client.model.Modeldummy;
import net.mcreator.enchantedmoon.client.model.Modeldemonic_horns;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class EnchantedmoonModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeldemonic_horns.LAYER_LOCATION, Modeldemonic_horns::createBodyLayer);
		event.registerLayerDefinition(Modelmagic_circle.LAYER_LOCATION, Modelmagic_circle::createBodyLayer);
		event.registerLayerDefinition(Modeldummy.LAYER_LOCATION, Modeldummy::createBodyLayer);
	}
}
