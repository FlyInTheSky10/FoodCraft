package com.foodcraft.api;

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
     * @param pos position
     * @param result result
     * @param quantity Result Quantity
     * @return Add quantity
     */
    public int event(World world, BlockPos pos, ItemStack result, int quantity);
}
