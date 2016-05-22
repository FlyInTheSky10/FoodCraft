package com.cfyifei.gui.guis;

import com.cfyifei.gui.containers.ContainerCaiban;
import com.cfyifei.gui.tileentities.TileEntityCaiban;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;

public class GuiCaiban extends GuiContainer {

    private TileEntityCaiban tile;

    public GuiCaiban(InventoryPlayer playerInv, TileEntityCaiban tileEntityCaiban) {
        super(new ContainerCaiban(playerInv, tileEntityCaiban));
        this.tile = tileEntityCaiban;
        this.doesGuiPauseGame();

    }

    @Override
    public void drawGuiContainerBackgroundLayer(float partialTicks,
                                                int mouseX, int mouseY) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(new ResourceLocation("foodcraft", "textures/gui/container/caiban.png"));
        int k = (this.width - this.xSize) / 2;//x
        int l = (this.height - this.ySize) / 2;//y
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);

    }

    @Override
    public void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        //String s = this.tile.hasCustomInventoryName() ? this.tile.getInventoryName() : I18n.format(this.tile.getInventoryName(), new Object[0]);
        String s = StatCollector.translateToLocal("TitleCaiban");
        this.fontRendererObj.drawString(s, this.xSize / 2 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
        this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, this.ySize - 96 + 2, 4210752);
    }
}
