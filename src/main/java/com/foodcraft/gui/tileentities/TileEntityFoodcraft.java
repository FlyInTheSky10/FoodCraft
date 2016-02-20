package com.foodcraft.gui.tileentities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;

public abstract class TileEntityFoodcraft extends TileEntity implements IInventory {
    public ItemStack stack[];

    @Override
    public abstract String getName();

    @Override
    public boolean hasCustomName() {
        return false;
    }

    @Override
    public IChatComponent getDisplayName() {
        return new ChatComponentText(this.getName());
    }

    @Override
    public int getSizeInventory() {
        return stack.length;
    }

    @Override
    public ItemStack getStackInSlot(int var1) {
        return stack[var1];
    }

    @Override
    public ItemStack decrStackSize(int par1, int par2) {
        if (this.stack[par1] != null) {
            ItemStack var3;
            if (this.stack[par1].stackSize <= par2) {
                var3 = this.stack[par1];
                this.stack[par1] = null;
                return var3;
            } else {
                var3 = this.stack[par1].splitStack(par2);

                if (this.stack[par1].stackSize == 0) {
                    this.stack[par1] = null;
                }

                return var3;
            }
        } else {
            return null;
        }
    }

    @Override
    public ItemStack removeStackFromSlot(int par1) {
        if (this.stack[par1] != null) {
            ItemStack itemstack = this.stack[par1];
            this.stack[par1] = null;
            return itemstack;
        } else {
            return null;
        }
    }

    @Override
    public void setInventorySlotContents(int var1, ItemStack var2) {
        this.stack[var1] = var2;
        if (var2 != null && var2.stackSize > this.getInventoryStackLimit()) {
            var2.stackSize = this.getInventoryStackLimit();
        }
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        return true;
    }

    @Override
    public void openInventory(EntityPlayer player) {}

    @Override
    public void closeInventory(EntityPlayer player) {}

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        return false;
    }

    @Override
    public int getField(int id) {
        return 0;
    }

    @Override
    public void setField(int id, int value) {}

    @Override
    public int getFieldCount() {
        return 0;
    }

    @Override
    public void clear() {
        for (int i = 0; i < this.stack.length; ++i) {
            this.stack[i] = null;
        }
    }
}
