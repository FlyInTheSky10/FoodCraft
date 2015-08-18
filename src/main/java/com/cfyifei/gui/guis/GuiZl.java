package com.cfyifei.gui.guis;

import org.lwjgl.opengl.GL11;

import com.cfyifei.gui.containers.ContainerGyg;
import com.cfyifei.gui.containers.ContainerZl;
import com.cfyifei.gui.tileentitys.TileEntityGyg;
import com.cfyifei.gui.tileentitys.TileEntityZl;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

public class GuiZl extends GuiContainer{

	private TileEntityZl tile;

	public GuiZl(InventoryPlayer playerInv, TileEntityZl tileEntityZl) {
		super(new ContainerZl(playerInv, tileEntityZl));
		this.tile = tileEntityZl;
		this.doesGuiPauseGame();
	}

	@Override
	public void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(new ResourceLocation("foodcraft", "textures/gui/container/zl.png"));
        int k = (this.width - this.xSize) / 2;//x
        int l = (this.height - this.ySize) / 2;//y
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        float i1;
        if (this.tile.isBurning()) {
            i1 = this.tile.getBurnTimeRemainingScaled(12);
            this.drawTexturedModalRect(k + 81, (int)(l + 48 - i1), 176, (int)(12 - i1), 14, (int)(i1 + 2));
        }
        if(this.tile.canSmelt()) {
        	this.drawTexturedModalRect(k + 83, l + 22, 176, 14, 9, 9);
        }
    }
	
@Override
	public void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		String s = StatCollector.translateToLocal("TitleZl");
		this.fontRendererObj.drawString(s, this.xSize / 2 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
	}
}
