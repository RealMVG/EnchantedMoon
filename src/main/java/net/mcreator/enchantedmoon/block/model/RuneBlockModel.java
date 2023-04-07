package net.mcreator.enchantedmoon.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.enchantedmoon.block.entity.RuneTileEntity;

public class RuneBlockModel extends AnimatedGeoModel<RuneTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RuneTileEntity animatable) {
		return new ResourceLocation("enchantedmoon", "animations/runev2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RuneTileEntity animatable) {
		return new ResourceLocation("enchantedmoon", "geo/runev2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RuneTileEntity entity) {
		return new ResourceLocation("enchantedmoon", "textures/blocks/runev2.png");
	}
}
