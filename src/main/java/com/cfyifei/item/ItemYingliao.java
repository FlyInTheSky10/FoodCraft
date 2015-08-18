package com.cfyifei.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemYingliao extends ItemFood{
public boolean e;
public int e1 = 10;
public int color;

		public ItemYingliao(int amount, float saturation, boolean isWolfFood, String name,int color) {
			super((int)saturation, saturation, isWolfFood);
			this.setUnlocalizedName(name);
this.color = color;
		}
		public ItemYingliao(int amount, float saturation, boolean isWolfFood, String name, boolean is,int color) {
			super((int)saturation, saturation, isWolfFood);
			this.setUnlocalizedName(name);
           e = is;
           this.color = color;
		}
		
		public ItemYingliao(int amount, float saturation, boolean isWolfFood, String name, boolean is, int r,int color) {
			super((int)saturation, saturation, isWolfFood);
			this.setUnlocalizedName(name);
           e = is;
           e1 = r;
           this.color = color;
		}
	    public boolean hasEffect(ItemStack par1ItemStack)
	    {
	        return e;
	    }
	    public EnumAction getItemUseAction(ItemStack par1ItemStack)
	    {
	        return EnumAction.DRINK;
	    }
	    protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	    {
	    	if(e1 == 0){
	 
	                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.heal.id, 9600, 4));
	                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 9600, 4));
	                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 9600, 4));
	    	}
	    	else{
	    		if(e1 == 1){
	                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 9600, 4));
	                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 9600, 4));
	    		}
	    	}
	            }
	    @SideOnly(Side.CLIENT)
	    public int getColorFromItemStack(ItemStack stack, int renderPass)
	    {
	    	if(!this.getUnlocalizedName().contains("ice")){
	        return renderPass == 0 ? 16777215 : color;
	    	}
	    	return 16777215;
	    }
	}

