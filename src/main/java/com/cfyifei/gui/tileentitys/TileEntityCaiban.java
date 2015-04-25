package com.cfyifei.gui.tileentitys;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;

import net.minecraft.item.ItemStack;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.cfyifei.gui.blocks.ModGui;
import com.cfyifei.item.ModItem;


public class TileEntityCaiban extends TileEntity implements IInventory{
	private ItemStack stack[] = new ItemStack[13];
	public int tableBurnTime = 0;
    public int currentItemBurnTime;
    public int furnaceCookTime;
	private String field_145958_o;
	public ItemStack cai;

	@Override
    public void updateEntity() {

	        if (!this.worldObj.isRemote)
	        {
	        	cai = this.canchao();
	            if (stack[0] != null)
	            {
	            	if (stack[0].getItem() == ModItem.ItemCaidao){
	            		if(cai != null){	    
	            			if(isst()){
	            			s();
	            			if(stack[0].getItemDamage() < 59){
	            			stack[0].setItemDamage(stack[0].getItemDamage() + 1);
	            			}
	            	        
	            			else{
	            				stack[0] = null;
	            			}
	            		}
	            	}
	            	}
	          }
	            }
	        }
	            
	
		 

	private boolean isst() {
		if(stack[4] != null){
		int result = stack[4].stackSize + cai.stackSize;
        boolean e =  result <= getInventoryStackLimit() && result <= this.stack[4].getMaxStackSize();
		return e; 
		}
		return true;
	}




	private void s() {
		
         if (this.stack[4] == null)
         {
            this.stack[4] = cai.copy();

         }
         else if (this.stack[4].getItem() == cai.getItem())
         {
       
        	 this.stack[4].stackSize += cai.stackSize; // Forge BugFix: Results may have multiple items
         
         }
       
      if(stack[1] != null && stack[2] == null  && stack[3] == null ){
         	--this.stack[1].stackSize;       	
         	if (this.stack[1].stackSize <= 0)
             {
                 this.stack[1] = null;
             }
         }
      
      if(stack[1] == null && stack[2] != null  && stack[3] == null ){
       	--this.stack[2].stackSize;       	
       	if (this.stack[2].stackSize <= 0)
           {
               this.stack[2] = null;
           }
       }
      
      if(stack[1] != null && stack[2] != null  && stack[3] == null ){
       	--this.stack[1].stackSize;       	
       	--this.stack[2].stackSize;     	
       	if (this.stack[1].stackSize <= 0)
           {
               this.stack[1] = null;
           }
      	if (this.stack[2].stackSize <= 0)
        {
            this.stack[2] = null;
        }
       }
        }	
	


	private ItemStack canchao() {
   if(stack[1] != null && stack[2] != null){
	   if(stack[1].getItem() == Items.cooked_porkchop && stack[2].getItem() == ModItem.ItemShucai)return new ItemStack(ModItem.ItemJiaozixian,2);
	   if(stack[1].getItem() == Items.cooked_chicken && stack[2].getItem() == Items.cooked_chicken)return new ItemStack(ModItem.ItemDajirou,4);
	   if(stack[1].getItem() == ModItem.ItemDajirou && stack[2].getItem() == ModItem.ItemDajirou)return new ItemStack(ModItem.ItemZhongjirou,4);
	   if(stack[1].getItem() == ModItem.ItemZhongjirou && stack[2].getItem() == ModItem.ItemZhongjirou)return new ItemStack(ModItem.ItemXiaojirou,4);
   }
   if(stack[1] != null){
	   if(stack[1].getItem() == Items.potato)return new ItemStack(ModItem.ItemTudoupian,3);
	   if(stack[1].getItem() == ModItem.ItemTudoupian)return new ItemStack(ModItem.ItemTudousi,8);
	   if(stack[1].getItem() == Items.cooked_chicken)return new ItemStack(ModItem.ItemJitui,2);	   
	   if(stack[1].getItem() == ModItem.ItemDoufu)return new ItemStack(ModItem.ItemDoufusi,3);	   
	   if(stack[1].getItem() == Items.carrot)return new ItemStack(ModItem.ItemLuobosi,3);	   
	   if(stack[1].getItem() == ModItem.ItemMianpi)return new ItemStack(ModItem.ItemMianfensi,3);	   
   }	
   if(stack[2] != null){
	   if(stack[2].getItem() == Items.cooked_chicken)return new ItemStack(ModItem.ItemJichi,6);	   
   }	

		return null;
		 
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
            if (this.stack[par1] != null)
    {
        ItemStack var3;

        if (this.stack[par1].stackSize <= par2)
        {
            var3 = this.stack[par1];
            this.stack[par1] = null;
            return var3;
        }
        else
        {
            var3 = this.stack[par1].splitStack(par2);

            if (this.stack[par1].stackSize == 0)
            {
                this.stack[par1] = null;
            }

            return var3;
        }
    }
    else
    {
        return null;
    }
    }

	@Override
	 public ItemStack getStackInSlotOnClosing(int par1)
    {
        if (this.stack[par1] != null)
        {
            ItemStack itemstack = this.stack[par1];
            this.stack[par1] = null;
            return itemstack;
        }
        else
        {
            return null;
        }
    }

	@Override
	public void setInventorySlotContents(int var1, ItemStack var2) {
        this.stack[var1] = var2;
        if (var2 != null && var2.stackSize > this.getInventoryStackLimit())
        {
                var2.stackSize = this.getInventoryStackLimit();
        }
	}

	@Override
	public String getInventoryName() {

		return "Caiban";
	}

	@Override
	public boolean hasCustomInventoryName() {

		return false;
	}

	@Override
	public int getInventoryStackLimit() {

		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer var1) {

		return true;
	}

	@Override
	public void openInventory() {

		
	}

	@Override
	public void closeInventory() {

		
	}

	@Override
	public boolean isItemValidForSlot(int var1, ItemStack var2) {

		return false;
	}

	public void readFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.readFromNBT(par1NBTTagCompound);
        NBTTagList var2 = par1NBTTagCompound.getTagList("ItemsCaiban", 10);
        this.stack = new ItemStack[this.getSizeInventory()];
        for (int var3 = 0; var3 < var2.tagCount(); ++var3)
        {
            NBTTagCompound var4 = (NBTTagCompound)var2.getCompoundTagAt(var3);
            byte var5 = var4.getByte("Slot");
            if (var5 >= 0 && var5 < this.stack.length)
            {
                this.stack[var5] = ItemStack.loadItemStackFromNBT(var4);
            }
        }
        this.tableBurnTime = par1NBTTagCompound.getShort("tableBurnTime");
        this.furnaceCookTime = par1NBTTagCompound.getShort("furnaceCookTime");
    }

    public void writeToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setShort("tableBurnTime", (short)this.tableBurnTime);
        par1NBTTagCompound.setShort("furnaceCookTime", (short)this.furnaceCookTime);
        NBTTagList var2 = new NBTTagList();
        for (int var3 = 0; var3 < this.stack.length; ++var3)
        {
            if (this.stack[var3] != null)
            {
                NBTTagCompound var4 = new NBTTagCompound();
                var4.setByte("Slot", (byte)var3);
                this.stack[var3].writeToNBT(var4);
                var2.appendTag(var4);
            }
        }
        par1NBTTagCompound.setTag("ItemsCaiban", var2);
       
    }
    }
