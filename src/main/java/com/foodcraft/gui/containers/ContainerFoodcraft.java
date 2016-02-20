package com.foodcraft.gui.containers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;

public class ContainerFoodcraft extends Container {
    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }

    /**
     * Add Crafting to Crafters.
     * Restore old forge's function.
     * @param par1ICrafting Crafting to be added
     */
    public void addCraftingToCrafters(ICrafting par1ICrafting) {
        this.crafters.add(par1ICrafting);
    }
}
