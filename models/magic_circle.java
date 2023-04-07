// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class magic_circle<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "magic_circle"), "main");
	private final ModelPart Magic_Circle;

	public magic_circle(ModelPart root) {
		this.Magic_Circle = root.getChild("Magic_Circle");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Magic_Circle = partdefinition.addOrReplaceChild("Magic_Circle", CubeListBuilder.create().texOffs(0, 0).addBox(-12.5F, -33.0F, 8.0F, 25.0F, 25.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Magic_Circle.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}