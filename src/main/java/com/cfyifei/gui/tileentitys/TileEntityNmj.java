package com.cfyifei.gui.tileentitys;

import com.cfyifei.gui.recipes.Nmjrecipe;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.cfyifei.gui.blocks.BlockNmj;
import com.cfyifei.gui.blocks.ModGui;
import com.cfyifei.gui.containers.ContainerNmj;


public class TileEntityNmj extends TileEntity implements IInventory{
	private ItemStack stack[] = new ItemStack[3];
	public int tableBurnTime = 0;
	public int maxBurnTime = 0;
    public int currentItemBurnTime;
    public int furnaceCookTime;
	private String field_145958_o;


	@Override
    public void updateEntity() {
		
		boolean flag = this.tableBurnTime > 0;
	        boolean flag1 = false;
	        if (this.tableBurnTime > 0)
	        {
	            --this.tableBurnTime;
	            
	        }
	        
	        if (!this.worldObj.isRemote)
	        {
	            if (this.tableBurnTime == 0 && this.canSmelt())
	            {
	                this.currentItemBurnTime = this.tableBurnTime = getItemBurnTime(this.stack[2]);

	                if (this.tableBurnTime > 0)
	                {
	                    flag1 = true;

	                    if (this.stack[2] != null)
	                    {
	                        --this.stack[2].stackSize;

	                        if (this.stack[2].stackSize == 0)
	                        {
	                            this.stack[2] = stack[2].getItem().getContainerItem(stack[2]);
	                        }
	                    }
	                }
	            }

	            if (this.isBurning() && this.canSmelt())
	            {
	                ++this.furnaceCookTime;

	                if (this.furnaceCookTime == 200)
	                {
	                    this.furnaceCookTime = 0;
	                    this.smeltItem();
	                    flag1 = true;
	                }
	            }
	            else
	            {
	                this.furnaceCookTime = 0;
	            }
	            if (flag != this.tableBurnTime > 0)//没有燃烧时间
	            {
	                flag1 = true;
	                BlockNmj.updateFurnaceBlockState(this.tableBurnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);//
	            }
	        }

	        if (flag1)
	        {
	            this.markDirty();
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
		
		return "Mill";
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
        NBTTagList var2 = par1NBTTagCompound.getTagList("Items", 10);
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
        par1NBTTagCompound.setTag("Items", var2);
       
    }
    
    public static int getItemBurnTime(ItemStack par0ItemStack)
    {
        if (par0ItemStack == null)
        {
            return 0;
        }
        else
        {
            net.minecraft.item.Item item = par0ItemStack.getItem();

            if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air)
            {
            	Block block = Block.getBlockFromItem(item);

                if (block == Blocks.wooden_slab)
                {
                    return 150;
                }

                if (block.getMaterial() == Material.wood)
                {
                    return 300;
                }
                if (block == Blocks.coal_block)
                {
                    return 16000;
                }
            }
            if (item instanceof ItemTool && ((ItemTool) item).getToolMaterialName().equals("WOOD")) return 200;
            if (item instanceof ItemSword && ((ItemSword) item).getToolMaterialName().equals("WOOD")) return 200;
            if (item instanceof ItemHoe && ((ItemHoe) item).getToolMaterialName().equals("WOOD")) return 200;
            if (item == Items.stick) return 100;
            if (item == Items.coal) return 1600;
            if (item == Items.lava_bucket) return 20000;
            if (item == Item.getItemFromBlock(Blocks.sapling)) return 100;
            if (item == Items.blaze_rod) return 2400;
            return GameRegistry.getFuelValue(par0ItemStack);
        }
    }
    
    private boolean canSmelt()
    {
        if (this.stack[0] == null)
        {
            return false;
        }
        else
        {
            ItemStack itemstack = Nmjrecipe.smelting().getSmeltingResult(this.stack[0]);
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
            ItemStack itemstack = Nmjrecipe.smelting().getSmeltingResult(this.stack[0]);

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
    public float getBurnTimeRemainingScaled(int int1)
    {
        if (this.currentItemBurnTime == 0)
        {
            this.currentItemBurnTime = 200;
        }

        return this.tableBurnTime * int1 / this.currentItemBurnTime;
    }
    
    public float getCookProgressScaled(int int1)
    {
        return this.furnaceCookTime * int1 / 200;
    }

    public void name(String int1)
    {
        this.field_145958_o = int1;
       }

}
