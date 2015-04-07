package com.cfyifei.gui.guis;

import org.lwjgl.opengl.GL11;

import com.cfyifei.gui.containers.ContainerNmj;
import com.cfyifei.gui.tileentitys.TileEntityNmj;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

public class GuiNmj extends GuiContainer{

	private TileEntityNmj tile;

	public GuiNmj(InventoryPlayer playerInv, TileEntityNmj furnaceInv) {
		super(new ContainerNmj(playerInv, furnaceInv));
		this.tile = furnaceInv;
		this.doesGuiPauseGame();
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void drawGuiContainerBackgroundLayer(float partialTicks,
		int mouseX, int mouseY) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(new ResourceLocation("foodcraft", "textures/gui/container/repairtable.png"));
        int k = (this.width - this.xSize) / 2;//x
        int l = (this.height - this.ySize) / 2;//y
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        int a = tile.tableBurnTime;
        int b = tile.currentItemBurnTime;
        float i1;
        if (this.tile.isBurning())
        {
            i1 = this.tile.getBurnTimeRemainingScaled(12);
            this.drawTexturedModalRect(k + 81, (int)(l + 49 - i1), 176, (int)(12 - i1), 14, (int)(i1 + 2));
        }

        i1 = this.tile.getCookProgressScaled(24);
        this.drawTexturedModalRect(k + 76, l + 19, 176, 14, (int)(i1 + 1), 16);
    }
    
	
@Override
	public void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
	 //String s = this.tile.hasCustomInventoryName() ? this.tile.getInventoryName() : I18n.format(this.tile.getInventoryName(), new Object[0]);
	String s = StatCollector.translateToLocal("TitleNmj");
	this.fontRendererObj.drawString(s, this.xSize / 2 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
     this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, this.ySize - 96 + 2, 4210752);
	}
}
