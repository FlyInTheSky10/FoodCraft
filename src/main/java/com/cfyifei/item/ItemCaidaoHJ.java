package com.cfyifei.item;

import com.cfyifei.api.IItemKitchenKnife;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCaidaoHJ extends Item implements IItemKitchenKnife{

	public ItemCaidaoHJ() {
		this.setMaxDamage(32);
		this.setMaxStackSize(1);
	}

	@Override
	public int getMaxUses() {
		return 32;
	}
	@Override
	public int event(World world, int x, int y, int z, ItemStack Result, int q){
		return 1;
	}
}
