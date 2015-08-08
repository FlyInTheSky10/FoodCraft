package com.cfyifei.gui.tileentitys;

import java.util.List;

import com.cfyifei.gui.recipes.PDGrecipe;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

import com.cfyifei.gui.blocks.BlockPDG;
import com.cfyifei.gui.blocks.ModGui;
import com.cfyifei.gui.containers.ContainerPDG;
import com.cfyifei.itemstack.CookingOutput;


public class TileEntityPDG extends TileEntity implements IInventory{
	private ItemStack stack[] = new ItemStack[4];
	public int Nowheat = 0;
	public int tableBurnTime = 1;//max
    public int currentItemBurnTime = 50;
    public int furnaceCookTime;
    public int frequencyOfUse;
	public boolean isfire;
	public int max;
	public int min;
	private int w;


	@Override
    public void updateEntity() {
		if(worldObj.getBlock(xCoord, yCoord - 1, zCoord) != Blocks.fire ||worldObj.getBlock(xCoord, yCoord - 1, zCoord) != ModGui.lit_Zl){
	isfire = false;
}		
		if(worldObj.getBlock(xCoord, yCoord - 1, zCoord) == Blocks.fire){
	isfire = true;
}
else{
	if(worldObj.getBlock(xCoord, yCoord - 1, zCoord) == ModGui.lit_Zl){
		isfire = true;
	}
}
		//	isfire = worldObj.getBlock(xCoord, yCoord - 1, zCoord) == Blocks.fire;

	        

	        if (!this.worldObj.isRemote)
	        {
	        	AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox(this.xCoord - 20, this.yCoord - 20, this.zCoord -20, this.xCoord + 20, this.yCoord + 20, this.zCoord + 20);
	        	List<EntityLivingBase> l1 = worldObj.getEntitiesWithinAABB(EntityLivingBase.class, aabb);
	        	for(EntityLivingBase elb : l1){
	        		if(isfire){
		    			if(!(elb==null)){
			    			if((int)(elb.posX)-1 == this.xCoord && (int)(elb.posZ) == this.zCoord && (int)(elb.posY) == this.yCoord){
			    				if(elb instanceof EntityPlayer){
			    					if(((EntityPlayer)elb).capabilities.isCreativeMode){
			    						continue;
			    					}
			    				}
			    				if(!elb.isBurning()){
		    					elb.setFire(3);
		    				}
		    				
		    			}
	        	}
	    			}
	        		else{
	        			if(currentItemBurnTime < 0){
	        				currentItemBurnTime = 0;
	        			}
	        		}
	    			
	    		}
	            if (isfire && this.canSmelt())
	            {
	                this.furnaceCookTime = this.furnaceCookTime + 1;
	               if(w == 16){
	            	   Nowheat += (float)((float)currentItemBurnTime/2F);
	            	   w = 0;
	               }
	                	w++;
	                if(Nowheat > max){
	                	 --this.stack[0].stackSize;
	                	 this.stack[2] = new ItemStack(Items.coal);
	                	this.furnaceCookTime = 0;
	                	Nowheat = 0;
	                	if(stack[0].stackSize <= 0){
	                		stack[0]=null;
	                	}
	                }
	                
	                if (this.furnaceCookTime == 400)
	                {
	                    this.furnaceCookTime = 0;
	                    this.smeltItem();
	                }
	            }
	            else
	            {
	                this.furnaceCookTime = 0;
	                Nowheat = 0;
	            }
	          }
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
		
		return "PDG";
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
        NBTTagList var2 = par1NBTTagCompound.getTagList("ItemsPDG", 10);
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
        this.currentItemBurnTime = par1NBTTagCompound.getShort("currentItemBurnTime");
        this.frequencyOfUse = par1NBTTagCompound.getShort("frequencyOfUse");
        this.Nowheat = par1NBTTagCompound.getShort("Nowheat");
    }

    public void writeToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setShort("tableBurnTime", (short)this.tableBurnTime);
        par1NBTTagCompound.setShort("furnaceCookTime", (short)this.furnaceCookTime);
        par1NBTTagCompound.setShort("currentItemBurnTime", (short)this.currentItemBurnTime);
        par1NBTTagCompound.setShort("frequencyOfUse", (short)this.frequencyOfUse);
        par1NBTTagCompound.setShort("Nowheat", (short)this.Nowheat);     
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
        par1NBTTagCompound.setTag("ItemsPDG", var2);
       
    }
    

    
    private boolean canSmelt()
    {
        if (this.stack[0] == null)
        {
            return false;
        }
        else
        {
            CookingOutput pdgc = PDGrecipe.smelting().getSmeltingResult(this.stack[0]);
            if(pdgc == null){
            	return false;
            }
        	ItemStack itemstack = pdgc.is;
            this.min = pdgc.min;
            this.max = pdgc.max;
            if (itemstack == null) return false;
            if (this.stack[1] == null) return true;
            if (!this.stack[1].isItemEqual(itemstack)) return false;
            int result = stack[1].stackSize + itemstack.stackSize;
            return result <= getInventoryStackLimit() && result <= this.stack[1].getMaxStackSize(); //Forge BugFix: Make it respect stack sizes properly.
        }
    }

    public void smeltItem()
    {
        if (this.canSmelt())
        {
        	 CookingOutput pdgc = PDGrecipe.smelting().getSmeltingResult(this.stack[0]);
             ItemStack itemstack = pdgc.is;
             if(Nowheat < min){
            	 this.stack[2] = new ItemStack(stack[0].getItem());
            	 --this.stack[0].stackSize;
            	 if (this.stack[0].stackSize <= 0)
                 {
                     this.stack[0] = null;
                 }
            	 Nowheat = 0;
            	 return;
             }
            if (this.stack[1] == null)
            {
                this.stack[1] = itemstack.copy();
            }
            else if (this.stack[1].getItem() == itemstack.getItem())
            {
                this.stack[1].stackSize += itemstack.stackSize; // Forge BugFix: Results may have multiple items
            }

            --this.stack[0].stackSize;

            if (this.stack[0].stackSize <= 0)
            {
                this.stack[0] = null;
            }
            Nowheat = 0;
        	if(frequencyOfUse < 3000){
        		frequencyOfUse += 1;
        	}
        }
    }

    @SideOnly(Side.CLIENT)
    public float getCookProgressScaled(int int1)
    {
        return this.furnaceCookTime * int1 / 400;
    }


    @SideOnly(Side.CLIENT)
    public float getBurnTimeRemainingScaled(int int1)
    {
        return (((float)this.currentItemBurnTime)* int1) / 100F;
    }
    
    public void setcurrentItemBurnTime(int a){
    	currentItemBurnTime = a;
    }
}
