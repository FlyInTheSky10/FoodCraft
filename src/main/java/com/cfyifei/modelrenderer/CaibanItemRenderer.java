package com.cfyifei.modelrenderer;

import com.cfyifei.gui.blocks.ModelCaiban;
import com.cfyifei.gui.blocks.ModelGuo;
import com.cfyifei.gui.blocks.ModelPDG;

import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;




public class CaibanItemRenderer implements IItemRenderer {

	private ModelCaiban model;
	private TileEntity te;
	private double x, y, z;

	public CaibanItemRenderer(TileEntity tileentity, double xloc, double yloc, double zloc) {
		model = new ModelCaiban();
		if (tileentity == null) {
			return;
		}
		te = tileentity;
		x = xloc;
		y = yloc;
		z = zloc;
	}

	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return true;
	}

	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		TileEntityRendererDispatcher.instance.renderTileEntityAt(te, x, y, z, 0.0F);
	}

}
