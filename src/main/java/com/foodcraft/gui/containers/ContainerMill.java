package com.foodcraft.gui.containers;

import com.foodcraft.gui.tileentities.TileEntityMill;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnaceOutput;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class ContainerMill extends ContainerFoodcraft {

    private int lastCookTime;
    private int lastBurnTime;
    private int lastItemBurnTime;
    private TileEntityMill furnaceIn;

    public ContainerMill(InventoryPlayer par1InventoryPlayer, TileEntityMill furnaceInv) {
        this.furnaceIn = furnaceInv;
        this.addSlotToContainer(new Slot(furnaceInv, 0, 49, 19));
        this.addSlotToContainer(new SlotFurnaceOutput(par1InventoryPlayer.player, furnaceInv, 1, 112, 19));
        this.addSlotToContainer(new Slot(furnaceInv, 2, 80, 54));
        int var3;

        for (var3 = 0; var3 < 3; ++var3) {
            for (int var4 = 0; var4 < 9; ++var4) {
                this.addSlotToContainer(new Slot(par1InventoryPlayer, var4 + var3 * 9 + 9, 8 + var4 * 18, 84 + var3 * 18));
            }
        }

        for (var3 = 0; var3 < 9; ++var3) {
            this.addSlotToContainer(new Slot(par1InventoryPlayer, var3, 8 + var3 * 18, 142));
        }
    }

    public void onCraftGuiOpened(ICrafting par1ICrafting) {
        super.onCraftGuiOpened(par1ICrafting);
        par1ICrafting.sendProgressBarUpdate(this, 0, this.furnaceIn.furnaceCookTime);
        par1ICrafting.sendProgressBarUpdate(this, 1, this.furnaceIn.tableBurnTime);
        par1ICrafting.sendProgressBarUpdate(this, 2, this.furnaceIn.currentItemBurnTime);
    }

    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int par1, int par2) {

        if (par1 == 0) {
            this.furnaceIn.furnaceCookTime = par2;
        }

        if (par1 == 1) {
            this.furnaceIn.tableBurnTime = par2;
        }

        if (par1 == 2) {
            this.furnaceIn.currentItemBurnTime = par2;
        }
    }

    public void detectAndSendChanges() {
        super.detectAndSendChanges();

        for (int i = 0; i < this.crafters.size(); ++i) {
            ICrafting icrafting = (ICrafting)this.crafters.get(i);

            if (this.lastCookTime != this.furnaceIn.furnaceCookTime) {
                icrafting.sendProgressBarUpdate(this, 0, this.furnaceIn.furnaceCookTime);
            }

            if (this.lastBurnTime != this.furnaceIn.tableBurnTime) {
                icrafting.sendProgressBarUpdate(this, 1, this.furnaceIn.tableBurnTime);
            }

            if (this.lastItemBurnTime != this.furnaceIn.currentItemBurnTime) {
                icrafting.sendProgressBarUpdate(this, 2, this.furnaceIn.currentItemBurnTime);
            }
        }
        this.lastCookTime = this.furnaceIn.furnaceCookTime;
        this.lastBurnTime = this.furnaceIn.tableBurnTime;
        this.lastItemBurnTime = this.furnaceIn.currentItemBurnTime;
    }


    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2) {
        ItemStack var3 = null;
        Slot var4 = (Slot)this.inventorySlots.get(par2);
        if (var4 != null && var4.getHasStack()) {
            ItemStack var5 = var4.getStack();
            var3 = var5.copy();
            if (par2 >= 0 && par2 <= 2) {
                if (!this.mergeItemStack(var5, 3, 30, false)) {
                    return null;
                }
                var4.onSlotChange(var5, var3);
            } else if (par2 > 3 && par2 < 30) {
                if (!this.mergeItemStack(var5, 30, 39, false)) {
                    return null;
                }
            } else if (par2 >= 30 && par2 < 39) {
                if (!this.mergeItemStack(var5, 3, 30, false)) {
                    return null;
                }
            }
            if (var5.stackSize == 0) {
                var4.putStack((ItemStack)null);
            } else {
                var4.onSlotChanged();
            }
            if (var5.stackSize == var3.stackSize) {
                return null;
            }
            var4.onPickupFromSlot(par1EntityPlayer, var5);
        }
        return var3;

    }
}
