package com.foodcraft.itemstack;

import net.minecraft.item.Item;

public class FoodcraftItemStack {
	
	private Item[] Stack;
	
	public FoodcraftItemStack(Item[] Item1) {
		this.Stack = Item1;
	}
	
	public Item[] getItems() {
		return Stack;
	}
}
