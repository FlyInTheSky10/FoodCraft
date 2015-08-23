package com.cfyifei.gui.containers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class ContainerFoodcraft extends Container {
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return true;
	}
}
