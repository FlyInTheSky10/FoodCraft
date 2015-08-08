package com.cfyifei.gui.containers;

import com.cfyifei.gui.tileentitys.TileEntityCaiban;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotCrafting;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntityFurnace;



public class ContainerCaiban extends Container{
	  private int lastCookTime;
	    private int lastBurnTime;
	    private int lastItemBurnTime;
       private TileEntityCaiban furnaceIn;
	public ContainerCaiban(InventoryPlayer par1InventoryPlayer, TileEntityCaiban tileEntityCaiban)
       {
    	   this.furnaceIn = tileEntityCaiban;

    	   this.addSlotToContainer(new Slot(tileEntityCaiban, 0, 31, 26));
    	   this.addSlotToContainer(new Slot(tileEntityCaiban, 1, 70, 26));
    	   this.addSlotToContainer(new Slot(tileEntityCaiban, 2, 97, 26));
    	  this.addSlotToContainer(new Slot(tileEntityCaiban, 3, 124, 26));

           this.addSlotToContainer(new SlotFurnace(par1InventoryPlayer.player, tileEntityCaiban, 4, 97, 58));
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
		return this.furnaceIn.isUseableByPlayer(playerIn);
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
	    
	   
	    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int p_82846_2_)
	    {
	        
	    	ItemStack itemstack = null;
	        Slot slot = (Slot)this.inventorySlots.get(p_82846_2_);

	        if (slot != null && slot.getHasStack())
	        {
	            ItemStack itemstack1 = slot.getStack();
	            itemstack = itemstack1.copy();

	            if (p_82846_2_ == 2)
	            {
	                if (!this.mergeItemStack(itemstack1, 3, 39, true))
	                {
	                    return null;
	                }

	                slot.onSlotChange(itemstack1, itemstack);
	            }
	            else if (p_82846_2_ != 1 && p_82846_2_ != 0)
	            {
	                if (FurnaceRecipes.smelting().getSmeltingResult(itemstack1) != null)
	                {
	                    if (!this.mergeItemStack(itemstack1, 0, 1, false))
	                    {
	                        return null;
	                    }
	                }
	                else if (TileEntityFurnace.isItemFuel(itemstack1))
	                {
	                    if (!this.mergeItemStack(itemstack1, 1, 2, false))
	                    {
	                        return null;
	                    }
	                }
	                else if (p_82846_2_ >= 3 && p_82846_2_ < 30)
	                {
	                    if (!this.mergeItemStack(itemstack1, 30, 39, false))
	                    {
	                        return null;
	                    }
	                }
	                else if (p_82846_2_ >= 30 && p_82846_2_ < 39 && !this.mergeItemStack(itemstack1, 3, 30, false))
	                {
	                    return null;
	                }
	            }
	            else if (!this.mergeItemStack(itemstack1, 3, 39, false))
	            {
	                return null;
	            }

	            if (itemstack1.stackSize == 0)
	            {
	                slot.putStack((ItemStack)null);
	            }
	            else
	            {
	                slot.onSlotChanged();
	            }

	            if (itemstack1.stackSize == itemstack.stackSize)
	            {
	                return null;
	            }

	            slot.onPickupFromSlot(par1EntityPlayer, itemstack1);
	        }

	        return itemstack;
	    }
}
