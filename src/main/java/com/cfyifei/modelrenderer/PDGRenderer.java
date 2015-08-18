package com.cfyifei.modelrenderer;

import org.lwjgl.opengl.GL11;

import com.cfyifei.gui.blocks.ModelPDG;





import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class PDGRenderer extends TileEntitySpecialRenderer {
    private final ModelPDG model;
    private static ResourceLocation RL = new ResourceLocation("foodcraft:textures/blocks/pdg.png");
    
    public PDGRenderer() {
            this.model = new ModelPDG();
    }
    public void render(double x, double y, double z) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float) x + 0.5f, (float) y + 1.5f, (float) z + 0.5f);
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
        this.bindTexture(RL);
        model.renderHatch();
        GL11.glPopMatrix();

    }

    @Override
    public void renderTileEntityAt(TileEntity p_180535_1_, double posX, double posY, double posZ, float p_180535_8_, int p_180535_9_) {
        render(posX,posY,posZ);
    }
}
