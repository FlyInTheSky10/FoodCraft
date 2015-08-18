package com.cfyifei.gui.blocks;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGYG extends ModelBase {
    ModelRenderer S1;
    ModelRenderer S2;
    ModelRenderer S3;
    ModelRenderer S4;
    ModelRenderer S5;
    ModelRenderer S6;
    ModelRenderer S7;
    ModelRenderer S8;
    ModelRenderer S9;
    ModelRenderer S10;
  
  public ModelGYG() {
    textureWidth = 128;
    textureHeight = 32;
    
      S1 = new ModelRenderer(this, 0, 0);
      S1.addBox(0F, 0F, 0F, 14, 13, 14);
      S1.setRotationPoint(-7F, 10F, -7F);
      S1.setTextureSize(128, 32);
      S1.mirror = true;
      setRotation(S1, 0F, 0F, 0F);
      S2 = new ModelRenderer(this, 56, 0);
      S2.addBox(0F, 0F, 0F, 12, 2, 12);
      S2.setRotationPoint(-6F, 8F, -6F);
      S2.setTextureSize(128, 32);
      S2.mirror = true;
      setRotation(S2, 0F, 0F, 0F);
      S3 = new ModelRenderer(this, 56, 14);
      S3.addBox(0F, 0F, 0F, 5, 1, 2);
      S3.setRotationPoint(-3F, 10F, 7F);
      S3.setTextureSize(128, 32);
      S3.mirror = true;
      setRotation(S3, 0F, 0F, 0F);
      S4 = new ModelRenderer(this, 56, 14);
      S4.addBox(0F, 0F, 0F, 5, 1, 2);
      S4.setRotationPoint(-3F, 10F, -9F);
      S4.setTextureSize(128, 32);
      S4.mirror = true;
      setRotation(S4, 0F, 0F, 0F);
      S5 = new ModelRenderer(this, 56, 17);
      S5.addBox(0F, 0F, 0F, 12, 1, 5);
      S5.setRotationPoint(-6F, 23F, 1F);
      S5.setTextureSize(128, 32);
      S5.mirror = true;
      setRotation(S5, 0F, 0F, 0F);
      S6 = new ModelRenderer(this, 56, 17);
      S6.addBox(0F, 0F, 0F, 12, 1, 5);
      S6.setRotationPoint(-6F, 23F, -6F);
      S6.setTextureSize(128, 32);
      S6.mirror = true;
      setRotation(S6, 0F, 0F, 0F);
      S7 = new ModelRenderer(this, 94, 16);
      S7.addBox(0F, 0F, 0F, 3, 3, 14);
      S7.setRotationPoint(-2F, 7F, -7F);
      S7.setTextureSize(128, 32);
      S7.mirror = true;
      setRotation(S7, 0F, 0F, 0F);
      S8 = new ModelRenderer(this, 71, 14);
      S8.addBox(0F, 0F, 0F, 3, 2, 1);
      S8.setRotationPoint(-2F, 5F, 0F);
      S8.setTextureSize(128, 32);
      S8.mirror = true;
      setRotation(S8, 0F, 0F, 0F);
      S9 = new ModelRenderer(this, 71, 14);
      S9.addBox(0F, 0F, 0F, 3, 2, 1);
      S9.setRotationPoint(-2F, 5F, -6F);
      S9.setTextureSize(128, 32);
      S9.mirror = true;
      setRotation(S9, 0F, 0F, 0F);
      S10 = new ModelRenderer(this, 78, 27);
      S10.addBox(0F, 0F, 0F, 3, 0, 5);
      S10.setRotationPoint(-2F, 5F, -5F);
      S10.setTextureSize(128, 32);
      S10.mirror = true;
      setRotation(S10, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5,entity);
    S1.render(f5);
    S2.render(f5);
    S3.render(f5);
    S4.render(f5);
    S5.render(f5);
    S6.render(f5);
    S7.render(f5);
    S8.render(f5);
    S9.render(f5);
    S10.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
    super.setRotationAngles(f, f1, f2, f3, f4, f5,entity);
  }

  public void renderHatch() {
        render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
    }
}
