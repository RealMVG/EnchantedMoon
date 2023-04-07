package net.mcreator.enchantedmoon.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.enchantedmoon.block.display.RuneDisplayItem;

public class RuneDisplayModel extends AnimatedGeoModel<RuneDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RuneDisplayItem animatable) {
		return new ResourceLocation("enchantedmoon", "animations/runev2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RuneDisplayItem animatable) {
		return new ResourceLocation("enchantedmoon", "geo/runev2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RuneDisplayItem entity) {
		return new ResourceLocation("enchantedmoon", "textures/blocks/runev2.png");
	}
}
