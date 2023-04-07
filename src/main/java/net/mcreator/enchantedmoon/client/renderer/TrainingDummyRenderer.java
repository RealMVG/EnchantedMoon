
package net.mcreator.enchantedmoon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.enchantedmoon.entity.TrainingDummyEntity;
import net.mcreator.enchantedmoon.client.model.Modeldummy;

public class TrainingDummyRenderer extends MobRenderer<TrainingDummyEntity, Modeldummy<TrainingDummyEntity>> {
	public TrainingDummyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldummy(context.bakeLayer(Modeldummy.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TrainingDummyEntity entity) {
		return new ResourceLocation("enchantedmoon:textures/entities/dummy.png");
	}
}
