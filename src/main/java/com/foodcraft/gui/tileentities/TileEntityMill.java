package com.foodcraft.gui.tileentities;

import com.foodcraft.gui.blocks.BlockMill;
import com.foodcraft.gui.recipes.RecipeMill;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.*;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.ITickable;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TileEntityMill extends TileEntityFoodcraft implements ITickable {

    public int tableBurnTime = 0;
    public int maxBurnTime = 0;
    public int currentItemBurnTime;
    public int furnaceCookTime;

    public TileEntityMill() {
        this.stack = new ItemStack[3];
    }

    @Override
    public void update() {
        boolean flag = this.tableBurnTime > 0;
        boolean flag1 = false;
        if (this.tableBurnTime > 0) {
            --this.tableBurnTime;
        }

        if (!this.worldObj.isRemote) {
            if (this.tableBurnTime == 0 && this.canSmelt()) {
                this.currentItemBurnTime = this.tableBurnTime = getItemBurnTime(this.stack[2]);

                if (this.tableBurnTime > 0) {
                    flag1 = true;

                    if (this.stack[2] != null) {
                        --this.stack[2].stackSize;

                        if (this.stack[2].stackSize == 0) {
                            this.stack[2] = stack[2].getItem().getContainerItem(stack[2]);
                        }
                    }
                }
            }

            if (this.isBurning() && this.canSmelt()) {
                ++this.furnaceCookTime;

                if (this.furnaceCookTime == 200) {
                    this.furnaceCookTime = 0;
                    this.smeltItem();
                    flag1 = true;
                }
            } else {
                this.furnaceCookTime = 0;
            }

            BlockMill.setState(this.isBurning(), this.worldObj, this.pos);

        }

        if (flag1) {
            this.markDirty();
        }
    }

    @Override
    public String getName() {
        return "Mill";
    }

    public void readFromNBT(NBTTagCompound par1NBTTagCompound) {
        super.readFromNBT(par1NBTTagCompound);
        NBTTagList var2 = par1NBTTagCompound.getTagList("Items", 10);
        this.stack = new ItemStack[this.getSizeInventory()];
        for (int var3 = 0; var3 < var2.tagCount(); ++var3) {
            NBTTagCompound var4 = (NBTTagCompound)var2.getCompoundTagAt(var3);
            byte var5 = var4.getByte("Slot");
            if (var5 >= 0 && var5 < this.stack.length) {
                this.stack[var5] = ItemStack.loadItemStackFromNBT(var4);
            }
        }
        this.tableBurnTime = par1NBTTagCompound.getShort("tableBurnTime");
        this.furnaceCookTime = par1NBTTagCompound.getShort("furnaceCookTime");
    }

    public void writeToNBT(NBTTagCompound par1NBTTagCompound) {
        super.writeToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setShort("tableBurnTime", (short)this.tableBurnTime);
        par1NBTTagCompound.setShort("furnaceCookTime", (short)this.furnaceCookTime);
        NBTTagList var2 = new NBTTagList();
        for (int var3 = 0; var3 < this.stack.length; ++var3) {
            if (this.stack[var3] != null) {
                NBTTagCompound var4 = new NBTTagCompound();
                var4.setByte("Slot", (byte)var3);
                this.stack[var3].writeToNBT(var4);
                var2.appendTag(var4);
            }
        }
        par1NBTTagCompound.setTag("Items", var2);

    }

    public static int getItemBurnTime(ItemStack par0ItemStack) {
        if (par0ItemStack == null) {
            return 0;
        } else {
            net.minecraft.item.Item item = par0ItemStack.getItem();

            if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air) {
                Block block = Block.getBlockFromItem(item);

                if (block == Blocks.wooden_slab) {
                    return 150;
                }

                if (block.getMaterial() == Material.wood) {
                    return 300;
                }
                if (block == Blocks.coal_block) {
                    return 16000;
                }
            }
            if (item instanceof ItemTool && ((ItemTool) item).getToolMaterialName().equals("WOOD")) return 200;
            if (item instanceof ItemSword && ((ItemSword) item).getToolMaterialName().equals("WOOD")) return 200;
            if (item instanceof ItemHoe && ((ItemHoe) item).getMaterialName().equals("WOOD")) return 200;
            if (item == Items.stick) return 100;
            if (item == Items.coal) return 1600;
            if (item == Items.lava_bucket) return 20000;
            if (item == Item.getItemFromBlock(Blocks.sapling)) return 100;
            if (item == Items.blaze_rod) return 2400;
            return GameRegistry.getFuelValue(par0ItemStack);
        }
    }

    private boolean canSmelt() {
        if (this.stack[0] == null) {
            return false;
        } else {
            ItemStack itemstack = RecipeMill.smelting().getSmeltingResult(this.stack[0]);
            if (itemstack == null) return false;
            if (this.stack[1] == null) return true;
            if (!this.stack[1].isItemEqual(itemstack)) return false;
            int result = stack[1].stackSize + itemstack.stackSize;
            return result <= getInventoryStackLimit() && result <= this.stack[1].getMaxStackSize();
        }
    }
    public boolean isBurning() {
        return this.tableBurnTime > 0;
    }

    private void smeltItem() {
        if (this.canSmelt()) {
            ItemStack itemstack = RecipeMill.smelting().getSmeltingResult(this.stack[0]);

            if (this.stack[1] == null) {
                this.stack[1] = itemstack.copy();
            } else if (this.stack[1].getItem() == itemstack.getItem()) {
                this.stack[1].stackSize += itemstack.stackSize;
            }

            --this.stack[0].stackSize;

            if (this.stack[0].stackSize <= 0) {
                this.stack[0] = null;
            }
        }
    }
    @SideOnly(Side.CLIENT)
    public float getBurnTimeRemainingScaled(int int1) {
        if (this.currentItemBurnTime == 0) {
            this.currentItemBurnTime = 200;
        }

        return this.tableBurnTime * int1 / this.currentItemBurnTime;
    }

    public float getCookProgressScaled(int int1) {
        return this.furnaceCookTime * int1 / 200;
    }
}
