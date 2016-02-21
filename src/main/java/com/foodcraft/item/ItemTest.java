package com.foodcraft.item;

import com.foodcraft.init.FoodcraftBlocks;
import com.foodcraft.util.FoodcraftUtil;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
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
