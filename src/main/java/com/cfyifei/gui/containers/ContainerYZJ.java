package com.cfyifei.gui.containers;

import com.cfyifei.gui.tileentitys.TileEntityGyg;
import com.cfyifei.gui.tileentitys.TileEntityYZJ;

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



public class ContainerYZJ extends Container{
	  private int lastCookTime;
	    private int lastBurnTime;
	    private int lastItemBurnTime;
       private TileEntityYZJ furnaceIn;
	private int lastWater;
	public ContainerYZJ(InventoryPlayer par1InventoryPlayer, TileEntityYZJ tileEntityYZJ)
       {
    	   this.furnaceIn = tileEntityYZJ;
    	   this.addSlotToContainer(new Slot(tileEntityYZJ, 0, 58, 31));
    	   this.addSlotToContainer(new Slot(tileEntityYZJ, 1, 95, 60));
    	   this.addSlotToContainer(new Slot(tileEntityYZJ, 2, 37, 59));
           this.addSlotToContainer(new SlotFurnace(par1InventoryPlayer.player, tileEntityYZJ, 3, 130, 31));
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
	        par1ICrafting.sendProgressBarUpdate(this, 3, this.furnaceIn.water);
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
	        	this.furnaceIn.water = par2;
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
	            if (this.lastWater != this.furnaceIn.water)
	            {
	                icrafting.sendProgressBarUpdate(this, 3, this.furnaceIn.water);
	            }
	        }

	        this.lastCookTime = this.furnaceIn.furnaceCookTime;
	        this.lastBurnTime = this.furnaceIn.tableBurnTime;
	        this.lastItemBurnTime = this.furnaceIn.currentItemBurnTime;
	        this.lastWater = this.furnaceIn.water;
	    }
	    
	   
	    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2)
	    {
			return null;
	 
	}
}
