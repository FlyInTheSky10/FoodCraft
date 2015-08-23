package com.cfyifei.modelrenderer;

import com.cfyifei.gui.blocks.ModelPressureCooker;
import com.cfyifei.gui.blocks.ModelPot;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;

public class GygItemRenderer implements IItemRenderer {

	private ModelPressureCooker model;
	private TileEntity te;
	private double x, y, z;

	public GygItemRenderer(TileEntity tileentity, double xloc, double yloc, double zloc) {
		model = new ModelPressureCooker();
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
