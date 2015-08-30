package com.foodcraft.api;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public interface IItemKitchenKnife {
	/**
	 * Get the Kitchen Knife MaxUses.
	 * @return The Kitchen Knife MaxUses.
	 */
	public int getMaxUses();
	/**
	 * 
	 * When the chopping board chopping.	 
	 * @param world world
	 * @param x PosX
	 * @param y PosY
	 * @param z PosZ
	 * @param Result result
	 * @param Quantity Result Quantity
     * @return Add quantity
     */
	public int event(World world, BlockPos pos, ItemStack Result, int Quantity);
}
