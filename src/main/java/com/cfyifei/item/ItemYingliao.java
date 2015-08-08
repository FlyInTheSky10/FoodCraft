package com.cfyifei.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemYingliao extends ItemFood{
public boolean e;
public int e1 = 10;

		public ItemYingliao(int amount, float saturation, boolean isWolfFood, String name) {
			super((int)saturation, saturation/3F, isWolfFood);
			this.setUnlocalizedName(name);

		}
		public ItemYingliao(int amount, float saturation, boolean isWolfFood, String name, boolean is) {
			super((int)saturation, saturation/3F, isWolfFood);
			this.setUnlocalizedName(name);
           e = is;
		}
		
		public ItemYingliao(int amount, float saturation, boolean isWolfFood, String name, boolean is, int r) {
			super((int)saturation, saturation/3F, isWolfFood);
			this.setUnlocalizedName(name);
           e = is;
           e1 = r;
		}
	    public boolean hasEffect(ItemStack par1ItemStack)
	    {
	        return e;
	    }
	    public EnumAction getItemUseAction(ItemStack par1ItemStack)
	    {
	        return EnumAction.drink;
	    }
	    protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	    {
	    	if(e1 == 0){
	 
	                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.heal.id, 36000, 4));
	                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 36000, 4));
	                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 36000, 4));
	    	}
	    	else{
	    		if(e1 == 1){
	                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 36000, 4));
	                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 36000, 4));
	                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 36000, 4));
	    		}
	    	}
	            }
	}

