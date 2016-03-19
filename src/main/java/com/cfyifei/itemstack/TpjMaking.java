package com.cfyifei.itemstack;

import net.minecraft.item.ItemStack;

public class TpjMaking {
    public ItemStack itemStack;
    public boolean isMilk;
    public boolean isCold;

    public TpjMaking(ItemStack itemStack, boolean isMilk, boolean isCold) {
        this.itemStack = itemStack;
        this.isMilk = isMilk;
        this.isCold = isCold;
    }

}
