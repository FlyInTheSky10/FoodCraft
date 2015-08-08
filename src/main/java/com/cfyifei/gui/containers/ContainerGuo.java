package com.cfyifei.gui.containers;

import com.cfyifei.gui.tileentitys.TileEntityGuo;

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



public class ContainerGuo extends Container{
	private int lastNowheat;
	private int lastMax;
	private int lastMin;
	  private int lastCookTime;
	    private int lastBurnTime;
	    private int lastItemBurnTime;
       private TileEntityGuo furnaceIn;
	private int lastAngles;
	private int lastfrequencyOfUse;
	public ContainerGuo(InventoryPlayer par1InventoryPlayer, TileEntityGuo tileEntityGuo)
       {
    	   this.furnaceIn = tileEntityGuo;
    	   //主菜
    	   this.addSlotToContainer(new Slot(tileEntityGuo, 0, 17, 19));
    	   this.addSlotToContainer(new Slot(tileEntityGuo, 1, 35, 19));
    	   this.addSlotToContainer(new Slot(tileEntityGuo, 2, 53, 19));
    	   this.addSlotToContainer(new Slot(tileEntityGuo, 3, 71, 19));
    	   //调味料
    	   this.addSlotToContainer(new Slot(tileEntityGuo, 4, 17, 45));
    	   this.addSlotToContainer(new Slot(tileEntityGuo, 5, 35, 45));
    	   this.addSlotToContainer(new Slot(tileEntityGuo, 6, 53, 45));
    	   this.addSlotToContainer(new Slot(tileEntityGuo, 7, 71, 45));
    	   this.addSlotToContainer(new Slot(tileEntityGuo, 8, 89, 45));
    	   this.addSlotToContainer(new Slot(tileEntityGuo, 9, 107, 45));
    	   this.addSlotToContainer(new Slot(tileEntityGuo, 10, 125, 45));
    	   this.addSlotToContainer(new Slot(tileEntityGuo, 11, 143, 45));
    	   
           this.addSlotToContainer(new SlotFurnace(par1InventoryPlayer.player, tileEntityGuo, 12, 125, 19));
           this.addSlotToContainer(new SlotFurnace(par1InventoryPlayer.player, tileEntityGuo, 13, 143, 19));
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
	        par1ICrafting.sendProgressBarUpdate(this, 3, this.furnaceIn.frequencyOfUse);      
	        par1ICrafting.sendProgressBarUpdate(this, 4, this.furnaceIn.Nowheat);  
	        par1ICrafting.sendProgressBarUpdate(this, 5, this.furnaceIn.min);  
	        par1ICrafting.sendProgressBarUpdate(this, 6, this.furnaceIn.max);  
	        
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
	        if (par1 == 3)
	        {
	            this.furnaceIn.frequencyOfUse = par2;
	        }
	        if (par1 == 4)
	        {
	            this.furnaceIn.Nowheat = par2;
	        }
	        if (par1 == 5)
	        {
	            this.furnaceIn.min = par2;
	        }
	        if (par1 == 6)
	        {
	            this.furnaceIn.max = par2;
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
	            if (this.lastfrequencyOfUse != this.furnaceIn.frequencyOfUse)
	            {
	                icrafting.sendProgressBarUpdate(this, 3, this.furnaceIn.frequencyOfUse);
	            }
	            if (this.lastNowheat != this.furnaceIn.Nowheat)
	            {
	                icrafting.sendProgressBarUpdate(this, 4, this.furnaceIn.Nowheat);
	            }
	            if (this.lastMin != this.furnaceIn.min)
	            {
	                icrafting.sendProgressBarUpdate(this, 5, this.furnaceIn.min);
	            }
	            if (this.lastMax != this.furnaceIn.max)
	            {
	                icrafting.sendProgressBarUpdate(this, 6, this.furnaceIn.max);
	            }
	        }

	        this.lastCookTime = this.furnaceIn.furnaceCookTime;
	        this.lastBurnTime = this.furnaceIn.tableBurnTime;
	        this.lastItemBurnTime = this.furnaceIn.currentItemBurnTime;
	        this.lastfrequencyOfUse = this.furnaceIn.frequencyOfUse; 
	        lastNowheat = this.furnaceIn.Nowheat;
	        lastMin = this.furnaceIn.min;
	        lastMax = this.furnaceIn.max;
	    }
	    
	   
	    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2)
	    {
	    	ItemStack var3 = null;
	        Slot var4 = (Slot)this.inventorySlots.get(par2);
	        
	        if (var4 != null && var4.getHasStack())
	        {
	            ItemStack var5 = var4.getStack();
	            var3 = var5.copy();
	            
	            {
	            // 点击到玩家的背包的时候将物品送到玩家的快捷栏中
	            if (par2 > 3 && par2 < 31)
	            {
	                if (!this.mergeItemStack(var5, 31, 40, false))
	                {
	                    return null;
	                }
	            }
	            // 点击到玩家的快捷栏的时候将物品送到背包中
	            else if (par2 >= 31 && par2 < 40)
	            {
	                if (!this.mergeItemStack(var5, 4, 31, false))
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
	            }
	        return var3;

	 
	}
}
