package com.cfyifei.gui.tileentitys;

import com.cfyifei.gui.recipes.PDGrecipe;

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

import com.cfyifei.gui.blocks.BlockPDG;
import com.cfyifei.gui.blocks.ModGui;
import com.cfyifei.gui.containers.ContainerPDG;


public class TileEntityPDG extends TileEntity implements IInventory{
	private ItemStack stack[] = new ItemStack[3];
	public int tableBurnTime = 0;
    public int currentItemBurnTime;
    public int furnaceCookTime;
	private String field_145958_o;
	public boolean isfire;


	@Override
    public void updateEntity() {
		TileEntityZl te = (TileEntityZl)this.worldObj.getTileEntity(xCoord, yCoord - 1, zCoord);
		if(te != null){
	if(te.isBurning()){
		isfire = true;
	}
}
		else{
			isfire =worldObj.getBlock(xCoord, yCoord - 1, zCoord) == Blocks.fire;
		}
	        

	        if (this.tableBurnTime > 0)
	        {
	            --this.tableBurnTime;
	            
	        }
	        
	        if (!this.worldObj.isRemote)
	        {

	            if (isfire && this.canSmelt())
	            {
	                ++this.furnaceCookTime;

	              // this.worldObj.setBlock(this.xCoord, this.yCoord, this.zCoord,this.worldObj.getBlock(this.xCoord, this.yCoord, this.zCoord-2));
	                if (this.furnaceCookTime == 400)
	                {
	                    this.furnaceCookTime = 0;
	                    this.smeltItem();
	                }
	            }
	            else
	            {
	                this.furnaceCookTime = 0;
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
            // TODO Auto-generated method stub
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
            ItemStack itemstack = PDGrecipe.smelting().getSmeltingResult(this.stack[0]);
            if (itemstack == null) return false;
            if (this.stack[1] == null) return true;
            if (!this.stack[1].isItemEqual(itemstack)) return false;
            int result = stack[1].stackSize + itemstack.stackSize;
            return result <= getInventoryStackLimit() && result <= this.stack[1].getMaxStackSize(); //Forge BugFix: Make it respect stack sizes properly.
        }
    }
    public boolean isBurning()
    {
        return this.tableBurnTime > 0;
    }
   
    public void smeltItem()
    {
        if (this.canSmelt())
        {
            ItemStack itemstack = PDGrecipe.smelting().getSmeltingResult(this.stack[0]);

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
        }
    }

    @SideOnly(Side.CLIENT)
    public float getCookProgressScaled(int int1)
    {
        return this.furnaceCookTime * int1 / 400;
    }

}
