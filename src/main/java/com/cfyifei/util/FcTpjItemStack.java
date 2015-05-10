package com.cfyifei.util;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FcTpjItemStack {
	public ItemStack Item;
	public boolean isMilk;
	public boolean iscold;
	public FcTpjItemStack(ItemStack Input, boolean isMilk, boolean iscold){
		this.Item = Input;
		this.isMilk = isMilk;
		this.iscold = iscold;
	}

}
