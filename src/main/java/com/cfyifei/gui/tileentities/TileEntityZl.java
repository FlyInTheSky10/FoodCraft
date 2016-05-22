package com.cfyifei.gui.tileentities;


import com.cfyifei.gui.blocks.BlockZl;
import com.cfyifei.gui.blocks.ModGui;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.*;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;


public class TileEntityZl extends TileEntity implements IInventory {
    public int tableBurnTime = 0;
    public int maxBurnTime = 0;
    public int currentItemBurnTime;
    public int furnaceCookTime;
    public int water;
    private ItemStack stack[] = new ItemStack[4];
    private String field_145958_o;

    public static int getItemBurnTime(ItemStack par0ItemStack) {
        if (par0ItemStack == null) {
            return 0;
        } else {
            net.minecraft.item.Item item = par0ItemStack.getItem();

            if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air) {
                Block block = Block.getBlockFromItem(item);

                if (block == Blocks.wooden_slab) {
                    return 300;
                }

                if (block.getMaterial() == Material.wood) {
                    return 600;
                }
                if (block == Blocks.coal_block) {
                    return 32000;
                }
            }
            if (item instanceof ItemTool && ((ItemTool) item).getToolMaterialName().equals("WOOD")) return 400;
            if (item instanceof ItemSword && ((ItemSword) item).getToolMaterialName().equals("WOOD")) return 400;
            if (item instanceof ItemHoe && ((ItemHoe) item).getMaterialName().equals("WOOD")) return 400;
            if (item == Items.stick) return 400;
            if (item == Items.coal) return 3200;
            if (item == Items.lava_bucket) return 40000;
            if (item == Item.getItemFromBlock(Blocks.sapling)) return 200;
            if (item == Items.blaze_rod) return 4800;
            return GameRegistry.getFuelValue(par0ItemStack);
        }
    }

    @Override
    public void updateEntity() {

        boolean flag = this.tableBurnTime > 0;
        boolean flag1 = false;
        if (this.tableBurnTime > 0) {
            --this.tableBurnTime;

        }


        if (!this.worldObj.isRemote) {

            if (this.tableBurnTime == 0 && this.canSmelt()) {
                this.currentItemBurnTime = this.tableBurnTime = getItemBurnTime(this.stack[0]);

                if (this.tableBurnTime > 0) {
                    flag1 = true;

                    if (this.stack[0] != null) {
                        --this.stack[0].stackSize;

                        if (this.stack[0].stackSize == 0) {
                            this.stack[0] = stack[0].getItem().getContainerItem(stack[0]);
                        }
                    }
                }

            }
            BlockZl.updateFurnaceBlockState(this.tableBurnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);//
            if (flag1) {
                this.markDirty();
            }
        }

    }

    public boolean canSmelt() {
        if (this.worldObj.getBlock(xCoord, yCoord + 1, zCoord) == ModGui.PDG ||
                this.worldObj.getBlock(xCoord, yCoord + 1, zCoord) == ModGui.Guo) {
            return true;
        }
        return false;

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
        if (this.stack[par1] != null) {
            ItemStack var3;

            if (this.stack[par1].stackSize <= par2) {
                var3 = this.stack[par1];
                this.stack[par1] = null;
                return var3;
            } else {
                var3 = this.stack[par1].splitStack(par2);

                if (this.stack[par1].stackSize == 0) {
                    this.stack[par1] = null;
                }

                return var3;
            }
        } else {
            return null;
        }
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int par1) {
        if (this.stack[par1] != null) {
            ItemStack itemstack = this.stack[par1];
            this.stack[par1] = null;
            return itemstack;
        } else {
            return null;
        }
    }

    @Override
    public void setInventorySlotContents(int var1, ItemStack var2) {
        this.stack[var1] = var2;
        if (var2 != null && var2.stackSize > this.getInventoryStackLimit()) {
            var2.stackSize = this.getInventoryStackLimit();
        }
    }

    @Override
    public String getInventoryName() {

        return "Mill";
    }

    /**
     * Returns if the inventory is named
     */
    @Override
    public boolean isCustomInventoryName() {
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
    public void openChest() {

    }

    @Override
    public void closeChest() {

    }

    @Override
    public boolean isItemValidForSlot(int var1, ItemStack var2) {

        return false;
    }

    public void readFromNBT(NBTTagCompound par1NBTTagCompound) {
        super.readFromNBT(par1NBTTagCompound);
        NBTTagList var2 = par1NBTTagCompound.getTagList("Items", 10);
        this.stack = new ItemStack[this.getSizeInventory()];
        for (int var3 = 0; var3 < var2.tagCount(); ++var3) {
            NBTTagCompound var4 = (NBTTagCompound) var2.getCompoundTagAt(var3);
            byte var5 = var4.getByte("Slot");
            if (var5 >= 0 && var5 < this.stack.length) {
                this.stack[var5] = ItemStack.loadItemStackFromNBT(var4);
            }
        }
        this.tableBurnTime = par1NBTTagCompound.getShort("tableBurnTime");
        this.furnaceCookTime = par1NBTTagCompound.getShort("furnaceCookTime");
        this.water = par1NBTTagCompound.getShort("water");
    }

    public void writeToNBT(NBTTagCompound par1NBTTagCompound) {
        super.writeToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setShort("tableBurnTime", (short) this.tableBurnTime);
        par1NBTTagCompound.setShort("furnaceCookTime", (short) this.furnaceCookTime);
        par1NBTTagCompound.setShort("water", (short) this.water);
        NBTTagList var2 = new NBTTagList();
        for (int var3 = 0; var3 < this.stack.length; ++var3) {
            if (this.stack[var3] != null) {
                NBTTagCompound var4 = new NBTTagCompound();
                var4.setByte("Slot", (byte) var3);
                this.stack[var3].writeToNBT(var4);
                var2.appendTag(var4);
            }
        }
        par1NBTTagCompound.setTag("Items", var2);

    }

    public boolean isBurning() {
        return this.tableBurnTime > 0;
    }


    @SideOnly(Side.CLIENT)
    public float getBurnTimeRemainingScaled(int int1) {
        if (this.currentItemBurnTime == 0) {
            this.currentItemBurnTime = 200;
        }

        return this.tableBurnTime * int1 / this.currentItemBurnTime;
    }

    public void name(String int1) {
        this.field_145958_o = int1;
    }


}
