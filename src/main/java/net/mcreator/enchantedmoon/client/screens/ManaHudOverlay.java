
package net.mcreator.enchantedmoon.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.enchantedmoon.procedures.ManaCountProcedure;
import net.mcreator.enchantedmoon.procedures.ManaBarVisibilityProcedure;
import net.mcreator.enchantedmoon.procedures.ManaBarProc9Procedure;
import net.mcreator.enchantedmoon.procedures.ManaBarProc8Procedure;
import net.mcreator.enchantedmoon.procedures.ManaBarProc7Procedure;
import net.mcreator.enchantedmoon.procedures.ManaBarProc6Procedure;
import net.mcreator.enchantedmoon.procedures.ManaBarProc5Procedure;
import net.mcreator.enchantedmoon.procedures.ManaBarProc4Procedure;
import net.mcreator.enchantedmoon.procedures.ManaBarProc3Procedure;
import net.mcreator.enchantedmoon.procedures.ManaBarProc2Procedure;
import net.mcreator.enchantedmoon.procedures.ManaBarProc1Procedure;
import net.mcreator.enchantedmoon.procedures.ManaBarProc10Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class ManaHudOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		int posX = w / 2;
		int posY = h / 2;
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level;
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (ManaBarVisibilityProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("enchantedmoon:textures/screens/manabar_empry.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -207, posY + 113, 0, 0, 84, 5, 84, 5);

			if (ManaBarProc1Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("enchantedmoon:textures/screens/mana_full_1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -207, posY + 113, 0, 0, 10, 5, 10, 5);
			}
			if (ManaBarProc2Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("enchantedmoon:textures/screens/mana_full_2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -198, posY + 113, 0, 0, 10, 5, 10, 5);
			}
			if (ManaBarProc3Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("enchantedmoon:textures/screens/mana_full_1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -191, posY + 113, 0, 0, 10, 5, 10, 5);
			}
			if (ManaBarProc4Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("enchantedmoon:textures/screens/mana_full_2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -182, posY + 113, 0, 0, 10, 5, 10, 5);
			}
			if (ManaBarProc5Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("enchantedmoon:textures/screens/mana_full_1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -175, posY + 113, 0, 0, 10, 5, 10, 5);
			}
			if (ManaBarProc6Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("enchantedmoon:textures/screens/mana_full_2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -166, posY + 113, 0, 0, 10, 5, 10, 5);
			}
			if (ManaBarProc7Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("enchantedmoon:textures/screens/mana_full_1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -159, posY + 113, 0, 0, 10, 5, 10, 5);
			}
			if (ManaBarProc8Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("enchantedmoon:textures/screens/mana_full_2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -150, posY + 113, 0, 0, 10, 5, 10, 5);
			}
			if (ManaBarProc9Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("enchantedmoon:textures/screens/mana_full_1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -143, posY + 113, 0, 0, 10, 5, 10, 5);
			}
			if (ManaBarProc10Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("enchantedmoon:textures/screens/mana_full_2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -134, posY + 113, 0, 0, 10, 5, 10, 5);
			}
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					ManaCountProcedure.execute(entity), posX + -207, posY + 101, -1);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
