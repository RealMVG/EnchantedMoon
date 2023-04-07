package net.mcreator.enchantedmoon.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeldemonic_horns<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("enchantedmoon", "modeldemonic_horns"), "main");
	public final ModelPart DemonicHorns;

	public Modeldemonic_horns(ModelPart root) {
		this.DemonicHorns = root.getChild("DemonicHorns");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition DemonicHorns = partdefinition.addOrReplaceChild("DemonicHorns", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = DemonicHorns.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.3993F, -0.0053F, -1.5308F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-0.3507F, -8.2314F, -4.2849F, 0.5493F, 0.3733F, 0.0137F));
		PartDefinition cube_r2 = DemonicHorns.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 3).addBox(2.2133F, -2.2778F, -2.2735F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-0.3507F, -8.2314F, -4.2849F, -0.2355F, -0.4116F, -0.0152F));
		PartDefinition cube_r3 = DemonicHorns.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(4, 0).addBox(-2.4005F, -1.3027F, -1.4304F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3507F, -8.2314F, -4.2849F, 0.1566F, 0.3733F, 0.0137F));
		PartDefinition cube_r4 = DemonicHorns.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(4, 3).addBox(-2.4005F, -2.5051F, -1.8699F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-0.3507F, -8.2314F, -4.2849F, -0.2361F, 0.3733F, 0.0137F));
		PartDefinition cube_r5 = DemonicHorns.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 6).addBox(2.2133F, -1.2587F, -1.8983F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3507F, -8.2314F, -4.2849F, 0.1572F, -0.4116F, -0.0152F));
		PartDefinition cube_r6 = DemonicHorns.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(4, 6).addBox(2.2119F, -0.236F, -1.9416F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-0.3507F, -8.2314F, -4.2849F, 0.5499F, -0.4116F, -0.0152F));
		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		DemonicHorns.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
