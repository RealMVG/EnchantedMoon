
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enchantedmoon.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.enchantedmoon.network.UltimateKeyMessage;
import net.mcreator.enchantedmoon.network.ShadowTeleportKeyMessage;
import net.mcreator.enchantedmoon.network.MageActivatorMessage;
import net.mcreator.enchantedmoon.EnchantedmoonMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class EnchantedmoonModKeyMappings {
	public static final KeyMapping ULTIMATE_KEY = new KeyMapping("key.enchantedmoon.ultimate_key", GLFW.GLFW_KEY_V, "key.categories.enchantedmoon") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				EnchantedmoonMod.PACKET_HANDLER.sendToServer(new UltimateKeyMessage(0, 0));
				UltimateKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SHADOW_TELEPORT_KEY = new KeyMapping("key.enchantedmoon.shadow_teleport_key", GLFW.GLFW_KEY_X, "key.categories.enchantedmoon") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				EnchantedmoonMod.PACKET_HANDLER.sendToServer(new ShadowTeleportKeyMessage(0, 0));
				ShadowTeleportKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping MAGE_ACTIVATOR = new KeyMapping("key.enchantedmoon.mage_activator", GLFW.GLFW_KEY_N, "key.categories.enchantedmoon") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				EnchantedmoonMod.PACKET_HANDLER.sendToServer(new MageActivatorMessage(0, 0));
				MageActivatorMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				MAGE_ACTIVATOR_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - MAGE_ACTIVATOR_LASTPRESS);
				EnchantedmoonMod.PACKET_HANDLER.sendToServer(new MageActivatorMessage(1, dt));
				MageActivatorMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long MAGE_ACTIVATOR_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(ULTIMATE_KEY);
		event.register(SHADOW_TELEPORT_KEY);
		event.register(MAGE_ACTIVATOR);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				ULTIMATE_KEY.consumeClick();
				SHADOW_TELEPORT_KEY.consumeClick();
				MAGE_ACTIVATOR.consumeClick();
			}
		}
	}
}
