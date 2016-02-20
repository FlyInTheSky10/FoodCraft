package com.foodcraft.itemstack;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BeverageMaking {

    private ItemStack Item;
    private boolean isMilk;
    private boolean iscold;

    public BeverageMaking(ItemStack Input, boolean isMilk, boolean iscold) {
        this.Item = Input;
        this.isMilk = isMilk;
        this.iscold = iscold;
    }

    public ItemStack getItemStack() {
        return Item;
    }

    public boolean isMilk() {
        return isMilk;
    }

    public boolean iscold() {
        return iscold;
    }
}
