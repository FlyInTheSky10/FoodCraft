package com.foodcraft.gui.guis;

import org.lwjgl.opengl.GL11;

import com.foodcraft.gui.containers.ContainerFrying;
import com.foodcraft.gui.containers.ContainerPressureCooker;
import com.foodcraft.gui.tileentities.TileEntityFrying;
import com.foodcraft.gui.tileentities.TileEntityPressureCooker;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

public class GuiFrying extends GuiContainer{

	private TileEntityFrying tile;

	public GuiFrying(InventoryPlayer playerInv, TileEntityFrying tileEntityYZJ) {
		super(new ContainerFrying(playerInv, tileEntityYZJ));
		this.tile = tileEntityYZJ;
		this.doesGuiPauseGame();
	}

	@Override
	public void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(new ResourceLocation("foodcraft", "textures/gui/container/yzj.png"));
        int k = (this.width - this.xSize) / 2;//x
        int l = (this.height - this.ySize) / 2;//y
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        float i1;
        if (this.tile.isBurning()) {
            i1 = this.tile.getBurnTimeRemainingScaled(12);
            this.drawTexturedModalRect(k + 122, (int)(l + 74 - i1), 176, (int)(12 - i1), 14, (int)(i1 + 2));;
        }
        i1 = this.tile.getCookProgressScaled(24);
        this.drawTexturedModalRect(k + 92, l + 30, 176, 14, (int)(i1 + 1), 16);
       int i2 = this.tile.getWater();
        this.drawTexturedModalRect(k + 18, l + 14 + 58 - i2, 176, 31 + 58 - i2, 11,(int) (58 * ((float)i2 / 58)));
    } 
	
	@Override
	public void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
	String s = StatCollector.translateToLocal("TitleYZJ");
	this.fontRendererObj.drawString(s, this.xSize / 2 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
	}
}
