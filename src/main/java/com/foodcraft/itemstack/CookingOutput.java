package com.foodcraft.itemstack;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CookingOutput {
	
	private ItemStack is;
	private int min;
	private int max;

	public CookingOutput(ItemStack is, int min, int max) {
		this.is = is;
		this.min = min;
		this.max = max;
	}
	public Item getItem() {
		if(is != null){
			return is.getItem();
		}
		return null;
	}
	
	public ItemStack getItemStack() {
		return is;
	}
	
	public int getMin() {
		return min;
	}
	
	public int getMax() {
		return max;
	}
}
