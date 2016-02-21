package com.foodcraft.item;

import com.foodcraft.FoodCraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemFoodChili extends FcFood {

	public ItemFoodChili() {
		super(3, 1F, "ItemChili");
		this.setCreativeTab(FoodCraft.FcTabPlant);
	}
	
	protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
    
		par3EntityPlayer.setFire(3);
	}
}
