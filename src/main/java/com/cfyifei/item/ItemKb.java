package com.cfyifei.item;

import com.cfyifei.achievement.AchievementFcList;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemKb extends Item {
 public ItemKb(){
	 
 }
 public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
 {
	 if(par1ItemStack.getItem() == ModItem.Itemfan){
		 	par3EntityPlayer.triggerAchievement(AchievementFcList.Getfan);
		 }
	 if(par1ItemStack.getItem() == ModItem.ItemHuashenyou){
		 	par3EntityPlayer.triggerAchievement(AchievementFcList.GetHuashenyou);
		 }
	 if(par1ItemStack.getItem() == ModItem.ItemMianfen){
		 	par3EntityPlayer.triggerAchievement(AchievementFcList.GetMianfen);
		 }
	 return par1ItemStack;
 }
}
