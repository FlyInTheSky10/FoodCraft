package com.cfyifei.item;

import com.cfyifei.FoodCraft;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;



public class ItemShi extends Item {
 public ItemShi(String x){
	 init(x);
 }
 public boolean hasEffect(ItemStack par1ItemStack)
 {
     return true;
 }
 public void init(String x){

		this.setUnlocalizedName(x);
		this.setTextureName("FoodCraft:"+x);
		this.setCreativeTab(CreativeTabs.tabTools);	
		GameRegistry.registerItem(this, x);
 }
}
