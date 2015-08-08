package com.cfyifei.itemstack;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CookingOutput {

    public ItemStack is;
    public int min;
    public int max;

    public CookingOutput(ItemStack is, int min, int max) {
	this.is = is;
	this.min = min;
	this.max = max;
    }

    public Item getItem() {
	if (is != null) {
	    return is.getItem();
	}
	return null;
    }
}
