package com.foodcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemTest extends Item {

    public ItemTest() {
        this.setUnlocalizedName("ItemTest");
        this.setCreativeTab(CreativeTabs.tabTools);
        GameRegistry.registerItem(this, "ItemTest");
    }

    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
        par3EntityPlayer.getFoodStats().setFoodLevel(0);
        return par1ItemStack;
    }
}
