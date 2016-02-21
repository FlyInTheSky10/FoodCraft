package com.foodcraft.item;

import com.foodcraft.FoodCraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemDrink extends ItemFood {
	
	private boolean hasEffect;
	private int type = 10;
	private int color;

	public ItemDrink(int amount, float saturation, String name,int color) {
		super((int)saturation, saturation, false);
		this.setUnlocalizedName(name);
		this.setCreativeTab(FoodCraft.FcTabDrink);
		this.color = color;
	}
	
	public ItemDrink(int amount, float saturation, String name, boolean Effect,int color) {
		super((int)saturation, saturation, false);
		this.setUnlocalizedName(name);
		this.setCreativeTab(FoodCraft.FcTabDrink);
		this.hasEffect = Effect;
		this.color = color;
	}
		
	public ItemDrink(int amount, float saturation, String name, boolean Effect, int type,int color) {
		super((int)saturation, saturation, false);
		this.setUnlocalizedName(name);
		setCreativeTab(FoodCraft.FcTabDrink);
		this.hasEffect = Effect;
		this.type = type;
		this.color = color;
	}
	
	public boolean hasEffect(ItemStack par1ItemStack) {
		return hasEffect;
	}
	    
	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		return EnumAction.DRINK;
	}
	
	protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		if(type == 0) {
			par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.heal.id, 9600, 4));
			par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 9600, 4));
			par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 9600, 4));
		}
		else {
			if(type == 1) {
				par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 9600, 4));
				par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 9600, 4));
			}
		}
	}
	
	@SideOnly(Side.CLIENT)
	public int getColorFromItemStack(ItemStack stack, int renderPass) {
		if(!this.getUnlocalizedName().contains("_ice")){
			return renderPass == 0 ? 16777215 : color;
		}
		return 16777215;
	}
}