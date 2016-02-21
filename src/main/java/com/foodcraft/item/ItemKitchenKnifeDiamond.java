package com.foodcraft.item;

import com.foodcraft.FoodCraft;
import com.foodcraft.api.IItemKitchenKnife;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class ItemKitchenKnifeDiamond extends Item implements IItemKitchenKnife {

	public ItemKitchenKnifeDiamond() {
		this.setMaxDamage(480);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("ItemCaidaoZS");
		this.setCreativeTab(FoodCraft.FcTabMachine);
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
