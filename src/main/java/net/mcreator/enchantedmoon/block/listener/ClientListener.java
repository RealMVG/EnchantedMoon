package net.mcreator.enchantedmoon.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.enchantedmoon.init.EnchantedmoonModBlockEntities;
import net.mcreator.enchantedmoon.block.renderer.RuneTileRenderer;
import net.mcreator.enchantedmoon.EnchantedmoonMod;

@Mod.EventBusSubscriber(modid = EnchantedmoonMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(EnchantedmoonModBlockEntities.RUNE.get(), RuneTileRenderer::new);
	}
}
