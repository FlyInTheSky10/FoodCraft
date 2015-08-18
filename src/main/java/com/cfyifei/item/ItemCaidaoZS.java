package com.cfyifei.item;

import com.cfyifei.api.IItemKitchenKnife;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class ItemCaidaoZS extends Item implements IItemKitchenKnife{

	public ItemCaidaoZS() {
		this.setMaxDamage(480);
		this.setMaxStackSize(1);
	}

	@Override
	public int getMaxUses() {
		return 480;
	}

	@Override
	public int event(World world, BlockPos pos, ItemStack Result, int Quantity) {
		return 0;
	}
	
}
