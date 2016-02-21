package com.foodcraft.gui.containers;






import com.foodcraft.gui.tileentities.TileEntityBeverageMaking;
import com.foodcraft.gui.tileentities.TileEntityPressureCooker;

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



public class ContainerBeverageMaking extends ContainerFoodcraft {
	
	private int lastCookTime;
	private int lastBurnTime;
	private int lastItemBurnTime;
	private TileEntityBeverageMaking furnaceIn;
	private int lastWater;
	private int lastcurrentItemcoldBurnTime;
	private int lastcoldBurnTime;
	private int lastmilk;
	
	public ContainerBeverageMaking(InventoryPlayer par1InventoryPlayer, TileEntityBeverageMaking tileEntityTpj) {
		this.furnaceIn = tileEntityTpj;
		this.addSlotToContainer(new Slot(tileEntityTpj, 0, 37, 59));
		this.addSlotToContainer(new Slot(tileEntityTpj, 1, 37, 31));
		this.addSlotToContainer(new SlotFurnaceOutput(par1InventoryPlayer.player, tileEntityTpj, 2, 85, 31));
		this.addSlotToContainer(new Slot(tileEntityTpj, 3, 118, 20));
		this.addSlotToContainer(new Slot(tileEntityTpj, 4, 118, 52));
		int var3;
		for (var3 = 0; var3 < 3; ++var3) {
			for (int var4 = 0; var4 < 9; ++var4){
                   this.addSlotToContainer(new Slot(par1InventoryPlayer, var4 + var3 * 9 + 9, 8 + var4 * 18, 84 + var3 * 18));
			}
		}

		for (var3 = 0; var3 < 9; ++var3) {
			this.addSlotToContainer(new Slot(par1InventoryPlayer, var3, 8 + var3 * 18, 142));
		}
	}
	
	public void addCraftingToCrafters(ICrafting par1ICrafting) {
		super.addCraftingToCrafters(par1ICrafting);
		par1ICrafting.sendProgressBarUpdate(this, 0, this.furnaceIn.furnaceCookTime);
		par1ICrafting.sendProgressBarUpdate(this, 1, this.furnaceIn.tableBurnTime);
		par1ICrafting.sendProgressBarUpdate(this, 2, this.furnaceIn.currentItemBurnTime);
		par1ICrafting.sendProgressBarUpdate(this, 3, this.furnaceIn.water);
		par1ICrafting.sendProgressBarUpdate(this, 4, this.furnaceIn.currentItemcoldBurnTime);
		par1ICrafting.sendProgressBarUpdate(this, 5, this.furnaceIn.coldBurnTime);
		par1ICrafting.sendProgressBarUpdate(this, 6, this.furnaceIn.milk);
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
	        
		if (par1 == 3) {
			this.furnaceIn.water = par2;
		}
	        
		if (par1 == 4) {
			this.furnaceIn.currentItemcoldBurnTime = par2;
		}
	        
		if (par1 == 5) {
			this.furnaceIn.coldBurnTime = par2;
		}
	        
		if (par1 == 6) {
			this.furnaceIn.milk = par2;
		} 
	}
	    
	public void detectAndSendChanges() {
		super.detectAndSendChanges();
		for (int i = 0; i < this.crafters.size(); ++i) {
			ICrafting icrafting = (ICrafting)this.crafters.get(i);

			if (this.lastCookTime != this.furnaceIn.furnaceCookTime){
				icrafting.sendProgressBarUpdate(this, 0, this.furnaceIn.furnaceCookTime);
			}

			if (this.lastBurnTime != this.furnaceIn.tableBurnTime) {
				icrafting.sendProgressBarUpdate(this, 1, this.furnaceIn.tableBurnTime);
			}

			if (this.lastItemBurnTime != this.furnaceIn.currentItemBurnTime) {
				icrafting.sendProgressBarUpdate(this, 2, this.furnaceIn.currentItemBurnTime);
			}
			
			if (this.lastWater != this.furnaceIn.water) {
				icrafting.sendProgressBarUpdate(this, 3, this.furnaceIn.water);
			}
			
			if (this.lastcurrentItemcoldBurnTime != this.furnaceIn.currentItemcoldBurnTime) {
				icrafting.sendProgressBarUpdate(this, 4, this.furnaceIn.currentItemcoldBurnTime);
			}
	           
			if (this.lastcoldBurnTime != this.furnaceIn.coldBurnTime) {
				icrafting.sendProgressBarUpdate(this, 5, this.furnaceIn.coldBurnTime);
			}
			
			if (this.lastmilk != this.furnaceIn.milk) {
				icrafting.sendProgressBarUpdate(this, 6, this.furnaceIn.milk);
			}
		}

		this.lastCookTime = this.furnaceIn.furnaceCookTime;
		this.lastBurnTime = this.furnaceIn.tableBurnTime;
		this.lastItemBurnTime = this.furnaceIn.currentItemBurnTime;
		this.lastWater = this.furnaceIn.water;
		this.lastcurrentItemcoldBurnTime = this.furnaceIn.currentItemcoldBurnTime;
		this.lastcoldBurnTime = this.furnaceIn.coldBurnTime;
		this.lastmilk = this.furnaceIn.milk;
	}
	   
	public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2) {
		return null;
	}
}
