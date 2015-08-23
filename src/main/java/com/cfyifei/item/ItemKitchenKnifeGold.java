package com.cfyifei.item;

import com.cfyifei.FoodCraft;
import com.cfyifei.api.IItemKitchenKnife;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class ItemKitchenKnifeGold extends Item implements IItemKitchenKnife {

	public ItemKitchenKnifeGold() {
		this.setMaxDamage(32);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("ItemCaidaoHJ");
		this.setCreativeTab(FoodCraft.FcTabJiqi);
	}

	@Override
	public int getMaxUses() {
		return 32;
	}
	
	@Override
	public int event(World world, BlockPos bp, ItemStack Result, int q){
		return 1;
	}
}
