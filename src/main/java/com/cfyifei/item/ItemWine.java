package com.cfyifei.item;

import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemWine extends ItemFood {

	public ItemWine(int amount, float saturation, boolean isWolfFood, String name) {
		super((int)saturation, saturation, isWolfFood);
		this.setUnlocalizedName(name);
	}
	
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}
	   
	protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
	    	
		if (!par2World.isRemote) {
			Random r = new Random();  
			int e = r.nextInt(2);
			if(e == 1) {
				par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 600, 3));
				par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 600, 3));
				par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 600, 3));
				par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.heal.id, 600, 3));
	        }
			else {
				par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.hunger.id, 600, 3));
				par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 600, 3));
				par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 600, 3));
				par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, 600, 3));
	        }
	    }
	}
	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		return EnumAction.DRINK;
	}
}