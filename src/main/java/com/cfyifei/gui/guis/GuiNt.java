package com.cfyifei.gui.guis;

import org.lwjgl.opengl.GL11;

import com.cfyifei.gui.containers.ContainerGyg;
import com.cfyifei.gui.containers.ContainerNt;
import com.cfyifei.gui.tileentitys.TileEntityGyg;
import com.cfyifei.gui.tileentitys.TileEntityNt;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

public class GuiNt extends GuiContainer{

	private TileEntityNt tile;

	public GuiNt(InventoryPlayer playerInv, TileEntityNt tileEntityNt) {
		super(new ContainerNt(playerInv, tileEntityNt));
		this.tile = tileEntityNt;
		this.doesGuiPauseGame();
	}

	@Override
	public void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(new ResourceLocation("foodcraft", "textures/gui/container/nt.png"));
        int k = (this.width - this.xSize) / 2;//x
        int l = (this.height - this.ySize) / 2;//y
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
       
        float i1;

       int i2 = this.tile.getWater();
        this.drawTexturedModalRect(k + 18, l + 14 + 58 - i2, 176, 31 + 58 - i2, 11,(int) (58 * ((float)i2 / 58)));
        if (this.tile.isBurning()) {
        String time = StatCollector.translateToLocal("Nt.Time");
        String second = StatCollector.translateToLocal("Nt.Second");
		this.fontRendererObj.drawString(time + ": " + ((3600 - this.tile.furnaceCookTime)/20 + " " + second), k + 53, l + 53, 4210752);
        }
	}

	
	@Override
	public void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		String s = StatCollector.translateToLocal("TitleNt");
		this.fontRendererObj.drawString(s, this.xSize / 2 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
	}
}
