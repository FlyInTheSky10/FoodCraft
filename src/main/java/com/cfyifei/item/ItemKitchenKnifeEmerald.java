package com.cfyifei.item;

import com.cfyifei.api.IItemKitchenKnife;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class ItemKitchenKnifeEmerald extends Item implements IItemKitchenKnife {

	public ItemKitchenKnifeEmerald() {
		this.setMaxDamage(960);
		this.setMaxStackSize(1);
	}
	
	@Override
	public int getMaxUses() {
		return 960;
	}
	
	@Override
	public int event(World world,BlockPos bp, ItemStack Result, int q){
		return 0;
	}
}
