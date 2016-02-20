package com.foodcraft.gui.containers;







import com.foodcraft.gui.tileentities.TileEntityChoppingBoard;
import com.ibm.icu.util.BytesTrie.Iterator;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotCrafting;
import net.minecraft.inventory.SlotFurnaceFuel;
import net.minecraft.inventory.SlotFurnaceOutput;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;



public class ContainerChoppingBoard extends ContainerFoodcraft {

    private int lastCookTime;
    private int lastBurnTime;
    private int lastItemBurnTime;
    private TileEntityChoppingBoard furnaceIn;

    public ContainerChoppingBoard(InventoryPlayer par1InventoryPlayer, TileEntityChoppingBoard tileEntityCaiban) {

        this.furnaceIn = tileEntityCaiban;

        this.addSlotToContainer(new Slot(tileEntityCaiban, 0, 31, 26));
        this.addSlotToContainer(new Slot(tileEntityCaiban, 1, 70, 26));
        this.addSlotToContainer(new Slot(tileEntityCaiban, 2, 97, 26));
        this.addSlotToContainer(new Slot(tileEntityCaiban, 3, 124, 26));
        this.addSlotToContainer(new SlotFurnaceOutput(par1InventoryPlayer.player, tileEntityCaiban, 4, 97, 58));
        int var3;
        for (var3 = 0; var3 < 3; ++var3) {
            for (int var4 = 0; var4 < 9; ++var4) {
                this.addSlotToContainer(new Slot(par1InventoryPlayer, var4 + var3 * 9 + 9, 8 + var4 * 18, 84 + var3 * 18));
            }
        }

        for (var3 = 0; var3 < 9; ++var3) {
            this.addSlotToContainer(new Slot(par1InventoryPlayer, var3, 8 + var3 * 18, 142));
        }
    }

    public void addCraftingToCrafters(ICrafting par1ICrafting) {
        super.addCraftingToCrafters(par1ICrafting);
    }

    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2) {
        return null;
    }
}
