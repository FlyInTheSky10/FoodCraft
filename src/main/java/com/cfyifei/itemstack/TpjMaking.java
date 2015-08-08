package com.cfyifei.itemstack;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TpjMaking {

    public ItemStack Item;
    public boolean isMilk;
    public boolean iscold;

    public TpjMaking(ItemStack Input, boolean isMilk, boolean iscold) {
	this.Item = Input;
	this.isMilk = isMilk;
	this.iscold = iscold;
    }

}
