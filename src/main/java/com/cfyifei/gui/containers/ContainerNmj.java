package com.cfyifei.gui.containers;

import com.cfyifei.gui.tileentitys.TileEntityNmj;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;


public class ContainerNmj extends Container{
	  private int lastCookTime;
	    private int lastBurnTime;
	    private int lastItemBurnTime;
       private TileEntityNmj furnaceIn;
	public ContainerNmj(InventoryPlayer par1InventoryPlayer, TileEntityNmj furnaceInv)
       {
    	   this.furnaceIn = furnaceInv;
    	   this.addSlotToContainer(new Slot(furnaceInv, 0, 49, 19));
           this.addSlotToContainer(new SlotFurnace(par1InventoryPlayer.player, furnaceInv, 1, 112, 19));
           this.addSlotToContainer(new Slot(furnaceInv, 2, 80, 54));
           int var3;
           for (var3 = 0; var3 < 3; ++var3)
           {
               for (int var4 = 0; var4 < 9; ++var4)
               {
                   this.addSlotToContainer(new Slot(par1InventoryPlayer, var4 + var3 * 9 + 9, 8 + var4 * 18, 84 + var3 * 18));
               }
           }

           for (var3 = 0; var3 < 9; ++var3)
           {
               this.addSlotToContainer(new Slot(par1InventoryPlayer, var3, 8 + var3 * 18, 142));
           }
       }
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return true;
	}
 
	   public void addCraftingToCrafters(ICrafting par1ICrafting)
	    {
	        super.addCraftingToCrafters(par1ICrafting);
	        par1ICrafting.sendProgressBarUpdate(this, 0, this.furnaceIn.furnaceCookTime);
	        par1ICrafting.sendProgressBarUpdate(this, 1, this.furnaceIn.tableBurnTime);
	        par1ICrafting.sendProgressBarUpdate(this, 2, this.furnaceIn.currentItemBurnTime);
	    }

	    @SideOnly(Side.CLIENT)
	    public void updateProgressBar(int par1, int par2)
	    {
	        if (par1 == 0)
	        {
	            this.furnaceIn.furnaceCookTime = par2;
	        }

	        if (par1 == 1)
	        {
	            this.furnaceIn.tableBurnTime = par2;
	        }

	        if (par1 == 2)
	        {
	            this.furnaceIn.currentItemBurnTime = par2;
	        }
	    }
	    
	    public void detectAndSendChanges()
	    {
	        super.detectAndSendChanges();

	        for (int i = 0; i < this.crafters.size(); ++i)
	        {
	            ICrafting icrafting = (ICrafting)this.crafters.get(i);

	            if (this.lastCookTime != this.furnaceIn.furnaceCookTime)
	            {
	                icrafting.sendProgressBarUpdate(this, 0, this.furnaceIn.furnaceCookTime);
	            }

	            if (this.lastBurnTime != this.furnaceIn.tableBurnTime)
	            {
	                icrafting.sendProgressBarUpdate(this, 1, this.furnaceIn.tableBurnTime);
	            }

	            if (this.lastItemBurnTime != this.furnaceIn.currentItemBurnTime)
	            {
	                icrafting.sendProgressBarUpdate(this, 2, this.furnaceIn.currentItemBurnTime);
	            }
	        }

	        this.lastCookTime = this.furnaceIn.furnaceCookTime;
	        this.lastBurnTime = this.furnaceIn.tableBurnTime;
	        this.lastItemBurnTime = this.furnaceIn.currentItemBurnTime;
	    }
	    
	   
	    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2)
	    {
	        ItemStack var3 = null;
	        Slot var4 = (Slot)this.inventorySlots.get(par2);
	        if (var4 != null && var4.getHasStack())
	        {
	            ItemStack var5 = var4.getStack();
	            var3 = var5.copy();
	            // 点击到Slot的ID为0-2之间的时候，将物品送回玩家的背包中，这个地方是
	            if (par2 >= 0 && par2 <= 2)
	            {
	                if (!this.mergeItemStack(var5, 3, 30, false))
	                {
	                    return null;
	                }
	                var4.onSlotChange(var5, var3);
	            }
	            // 点击到玩家的背包的时候将物品送到玩家的快捷栏中
	            else if (par2 > 3 && par2 < 30)
	            {
	                if (!this.mergeItemStack(var5, 30, 39, false))
	                {
	                    return null;
	                }
	            }
	            // 点击到玩家的快捷栏的时候将物品送到背包中
	            else if (par2 >= 30 && par2 < 39)
	            {
	                if (!this.mergeItemStack(var5, 3, 30, false))
	                {
	                    return null;
	                }
	            }
	            if (var5.stackSize == 0)
	            {
	                var4.putStack((ItemStack)null);
	            }
	            else
	            {
	                var4.onSlotChanged();
	            }
	            if (var5.stackSize == var3.stackSize)
	            {
	                return null;
	            }
	            var4.onPickupFromSlot(par1EntityPlayer, var5);
	        }
	        return var3;

	}
}
