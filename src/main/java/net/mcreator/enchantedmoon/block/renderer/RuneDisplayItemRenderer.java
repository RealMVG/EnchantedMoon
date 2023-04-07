package net.mcreator.enchantedmoon.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.enchantedmoon.block.model.RuneDisplayModel;
import net.mcreator.enchantedmoon.block.display.RuneDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class RuneDisplayItemRenderer extends GeoItemRenderer<RuneDisplayItem> {
	public RuneDisplayItemRenderer() {
		super(new RuneDisplayModel());
	}

	@Override
	public RenderType getRenderType(RuneDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
