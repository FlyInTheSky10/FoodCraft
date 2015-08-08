package com.cfyifei.item;

import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemFoodJinpingguojiu extends ItemFood{


		public ItemFoodJinpingguojiu(int amount, float saturation, boolean isWolfFood, String name) {
			super((int)saturation, saturation/3F, isWolfFood);
			this.setUnlocalizedName(name);

		}
	    public boolean hasEffect(ItemStack par1ItemStack)
	    {
	        return true;
	    }
	   
	    protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	    {
	                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.nightVision.id, 3600, 4));
	                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.invisibility.id, 3600, 4));
	                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 3600, 4));
	                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 3600, 4));
	                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 3600, 4));
	                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 3600, 4));
	            }
	        
	    public EnumAction getItemUseAction(ItemStack par1ItemStack)
	    {
	        return EnumAction.drink;
	    }
	}

