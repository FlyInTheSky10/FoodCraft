package com.cfyifei.gui.tileentitys;


import com.cfyifei.api.IItemKitchenKnife;
import com.cfyifei.gui.recipes.Caibanrecipe;
import com.cfyifei.item.ModItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;


public class TileEntityCaiban extends TileEntity implements IInventory {
    public int tableBurnTime = 0;
    public int currentItemBurnTime;
    public int furnaceCookTime;
    public ItemStack cai;
    public int q = 0;
    private ItemStack stack[] = new ItemStack[13];
    private String field_145958_o;

    @Override
    public void updateEntity() {

        if (!this.worldObj.isRemote) {

            cai = this.canchao();
            if (stack[0] != null) {
                if (stack[0].getItem() == ModItem.ItemCaidao) {
                    if (cai != null) {
                        if (isst()) {
                            q = 0;
                            s();
                            if (stack[0].getCurrentDurability() < stack[0].getMaxDurability()) {
                                stack[0].setMetadata(stack[0].getMetadata() + 1);
                            } else {
                                stack[0] = null;
                            }
                        }
                    }
                }
                if (stack[0].getItem() instanceof IItemKitchenKnife) {
                    if (cai != null) {
                        if (isst()) {
                            IItemKitchenKnife iikk = (IItemKitchenKnife) stack[0].getItem();

                            q = iikk.event(worldObj, xCoord, yCoord, zCoord, cai, cai.stackSize);
                            s();
                            if (stack[0].getMetadata() < iikk.getMaxUses()) {
                                stack[0].setMetadata(stack[0].getMetadata() + 1);
                            } else {
                                stack[0] = null;
                            }
                        }
                    }
                }
            }
        }
    }


    private boolean isst() {
        if (stack[4] != null) {
            int result = stack[4].stackSize + cai.stackSize;
            boolean e = result <= getInventoryStackLimit() && result <= this.stack[4].getMaxStackSize();
            return e;
        }
        return true;
    }


    private void s() {

        if (this.stack[4] == null) {
            this.stack[4] = cai.copy();
            if (this.stack[4].stackSize + q <= 64) {
                this.stack[4].stackSize += q;
            }
        } else if (this.stack[4].getItem() == cai.getItem()) {
            this.stack[4].stackSize += cai.stackSize; // Forge BugFix: Results may have multiple items
            if (this.stack[4].stackSize + q <= 64) {
                this.stack[4].stackSize += q;
            }

        }

        if (this.stack[1] != null) {
            --stack[1].stackSize;
        }
        if (this.stack[2] != null) {
            --stack[2].stackSize;
        }
        if (this.stack[3] != null) {
            --stack[3].stackSize;
        }
        if (stack[1] != null) {
            if (this.stack[1].stackSize <= 0) {
                this.stack[1] = null;
            }
        }
        if (stack[2] != null) {
            if (this.stack[2].stackSize <= 0) {
                this.stack[2] = null;
            }
        }
        if (stack[3] != null) {
            if (this.stack[3].stackSize <= 0) {
                this.stack[3] = null;
            }
        }
    }


    private ItemStack canchao() {
        if (stack[1] != null && stack[2] == null && stack[3] == null) {//1 not null
            return Caibanrecipe.smelting().getOutput(stack[1].getItem(), null, null);
        }
        if (stack[1] != null && stack[2] != null && stack[3] == null) {//1,2 not null
            return Caibanrecipe.smelting().getOutput(stack[1].getItem(), stack[2].getItem(), null);
        }
        if (stack[1] != null && stack[2] == null && stack[3] != null) {//1,3 not null
            return Caibanrecipe.smelting().getOutput(stack[1].getItem(), null, stack[3].getItem());
        }
        if (stack[1] == null && stack[2] != null && stack[3] == null) {//2 not null
            return Caibanrecipe.smelting().getOutput(null, stack[2].getItem(), null);
        }
        if (stack[1] == null && stack[2] != null && stack[3] != null) {//2,3 not null
            return Caibanrecipe.smelting().getOutput(null, stack[2].getItem(), stack[3].getItem());
        }
        if (stack[1] == null && stack[2] != null && stack[3] != null) {//3 not null
            return Caibanrecipe.smelting().getOutput(null, null, stack[3].getItem());
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

        return "Caiban";
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
    public boolean isUseableByPlayer(EntityPlayer p_70300_1_) {
        return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : p_70300_1_.getDistanceSq((double) this.xCoord + 0.5D, (double) this.yCoord + 0.5D, (double) this.zCoord + 0.5D) <= 64.0D;
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
        NBTTagList var2 = par1NBTTagCompound.getTagList("ItemsCaiban", 10);
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
    }

    public void writeToNBT(NBTTagCompound par1NBTTagCompound) {
        super.writeToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setShort("tableBurnTime", (short) this.tableBurnTime);
        par1NBTTagCompound.setShort("furnaceCookTime", (short) this.furnaceCookTime);
        NBTTagList var2 = new NBTTagList();
        for (int var3 = 0; var3 < this.stack.length; ++var3) {
            if (this.stack[var3] != null) {
                NBTTagCompound var4 = new NBTTagCompound();
                var4.setByte("Slot", (byte) var3);
                this.stack[var3].writeToNBT(var4);
                var2.appendTag(var4);
            }
        }
        par1NBTTagCompound.setTag("ItemsCaiban", var2);

    }

    @Override
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity packet) {
        this.readFromNBT(packet.getNbtCompound());
    }

    @Override
    public Packet getDescriptionPacket() {
        NBTTagCompound tag = new NBTTagCompound();
        this.writeToNBT(tag);
        return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, 0, tag);
    }
}
