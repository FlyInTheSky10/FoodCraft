package com.cfyifei.item;

import com.cfyifei.api.IItemKitchenKnife;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCaidaoLBS extends Item implements IItemKitchenKnife {

    public ItemCaidaoLBS() {
	this.setMaxDamage(960);
	this.setMaxStackSize(1);
    }

    @Override
    public int getMaxUses() {
	return 960;
    }

    @Override
    public int event(World world, int x, int y, int z, ItemStack Result, int q) {
	return 0;
    }
}
