package com.foodcraft.gui.guis;

import org.lwjgl.opengl.GL11;

import com.foodcraft.gui.containers.ContainerBeverageMaking;
import com.foodcraft.gui.containers.ContainerPressureCooker;
import com.foodcraft.gui.tileentities.TileEntityBeverageMaking;
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

public class GuiBeverageMaking extends GuiContainer{

	private TileEntityBeverageMaking tile;

	public GuiBeverageMaking(InventoryPlayer playerInv, TileEntityBeverageMaking tileEntityTpj) {
		super(new ContainerBeverageMaking(playerInv, tileEntityTpj));
		this.tile = tileEntityTpj;
		this.doesGuiPauseGame();
	}

	@Override
	public void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(new ResourceLocation("foodcraft", "textures/gui/container/tpj.png"));
        int k = (this.width - this.xSize) / 2;//x
        int l = (this.height - this.ySize) / 2;//y
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        float i1;
        if (this.tile.isBurning()) {
            i1 = this.tile.getBurnTimeRemainingScaled(12);
            this.drawTexturedModalRect(k + 145, (int)(l + 35 - i1), 176, (int)(12 - i1), 14, (int)(i1 + 2));;
        }
        else {
        	if(this.tile.iscold()) {
        	    i1 = this.tile.getcoldRemainingScaled(11);
                this.drawTexturedModalRect(k + 146, (int)(l + 65 - i1), 190, (int)(11 - i1), 13, (int)(i1 + 2));;
        	}
        	
        }

        i1 = this.tile.getCookProgressScaled(24);
        this.drawTexturedModalRect(k + 58, l + 30, 176, 14, (int)(i1 + 1), 16);
      if(this.tile.water > 0) {
        int i2 = this.tile.getWater();
        this.drawTexturedModalRect(k + 18, l + 14 + 58 - i2, 176, 31 + 58 - i2, 11,(int) (58 * ((float)i2 / 58)));
      }
      else{ if(this.tile.milk > 0) {
        int i3 = this.tile.getMilk();
        this.drawTexturedModalRect(k + 18, l + 14 + 58 - i3, 187, 31 + 58 - i3, 11,(int) (58 * ((float)i3 / 58)));
    	 }
       }
    }
	
	@Override
	public void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		String s = StatCollector.translateToLocal("TitleTpj");
		this.fontRendererObj.drawString(s, this.xSize / 2 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
	}
}
