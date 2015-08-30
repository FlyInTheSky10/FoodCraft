package com.foodcraft.item;

import java.util.Random;

import com.foodcraft.FoodCraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemGoldenGrapeWine extends ItemFood{

	public ItemGoldenGrapeWine(int amount, float saturation, String name) {
		super((int)saturation, saturation, false);
		this.setUnlocalizedName(name);
		this.setCreativeTab(FoodCraft.FcTabDrink);
	}
	    
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}
	   
	protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 9600, 4));
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 9600, 4));
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 9600, 4));
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.heal.id, 9600, 4));
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 9600, 4));
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 9600, 4));       
	}
	        
	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		return EnumAction.DRINK;
	}
}

