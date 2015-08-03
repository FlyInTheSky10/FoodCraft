package com.cfyifei.item;

import java.util.HashSet;

import com.cfyifei.FoodCraft;
import com.google.common.collect.Sets;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class ItemAnTools extends ItemTool{

	 public static final HashSet<String> HARVESTABLE = Sets.newHashSet("pickaxe","shovel","axe");

	 public ItemAnTools(String x)
	 {
	 super(9f, EnumHelper.addToolMaterial("An", 3, 5000, 8.0F, 3.0F, 15), new HashSet());
	 this.setUnlocalizedName(x);
	 this.setTextureName("foodcraft:"+x);
	 this.setCreativeTab(CreativeTabs.tabTools);
	 GameRegistry.registerItem(this, x);
	 }

	 @Override
	 public float getDigSpeed(ItemStack stack, Block block, int meta) {

	 if (HARVESTABLE.contains(block.getHarvestTool(meta)))
	 return efficiencyOnProperMaterial;
	 else
	 return super.getDigSpeed(stack, block, meta);
	 }
	 
	 @Override
	 public boolean canHarvestBlock(Block block, ItemStack itemStack) {
	 if (HARVESTABLE.contains(block.getHarvestTool(0)))
	 return true;
	 else
	 return super.canHarvestBlock(block, itemStack);
	 }
	 public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	 {
	     MovingObjectPosition movingobjectposition = this.getMovingObjectPositionFromPlayer(par2World, par3EntityPlayer, true);

	     if (movingobjectposition == null)
	     {
	         return par1ItemStack;
	     }
	     else
	     {
	         if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK)
	         {
	             int i = movingobjectposition.blockX;
	             int j = movingobjectposition.blockY;
	             int k = movingobjectposition.blockZ;
	             if (!par2World.canMineBlock(par3EntityPlayer, i, j, k))
	             {
	                 return par1ItemStack;
	             }

	             
	             
	             if(par1ItemStack.getItem() == ModItem.ItemAnlanTools){
	            	 
	            if (!par3EntityPlayer.canPlayerEdit(i, j, k, movingobjectposition.sideHit, par1ItemStack))
	             {
	                 return par1ItemStack;
	             }

	             if (par2World.getBlock(i, j + 1, k) == Blocks.air)
	             {
	             	par2World.setBlock(i, j + 1, k, Blocks.torch);
	        	 	par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "step.stone", 1F, 1F, false);
	                 	par1ItemStack.setItemDamage(par1ItemStack.getItemDamage() + 5);
	             }
	             else{
	                 if (par2World.getBlock(i + 1, j, k) == Blocks.air)
		             {
		             	par2World.setBlock(i + 1, j, k, Blocks.torch);
		        	 	par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "step.stone", 1F, 1F, false);
		                 	par1ItemStack.setItemDamage(par1ItemStack.getItemDamage() + 5);
		             }
		                 	else{
		                 	     if (par2World.getBlock(i, j, k + 1) == Blocks.air)
		    		             {
		    		             	par2World.setBlock(i, j, k + 1, Blocks.torch);
		    		        	 	par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "step.stone", 1F, 1F, false);
		    		                 	par1ItemStack.setItemDamage(par1ItemStack.getItemDamage() + 5);
		    		             }
		                 		
		                 	}
		             }
	             
	             }
	             if(par1ItemStack.getItem() == ModItem.ItemAnbiTools){
	            	 par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.orb", 1F, 1F, false);
	            	 par3EntityPlayer.setHealth(20F);
	            	 par1ItemStack.setItemDamage(par1ItemStack.getItemDamage() + 5);
	             }
	   
	         }
	         
	         
	         
	 if(par1ItemStack.getItemDamage() >= 2000){
	 	--par1ItemStack.stackSize;
		par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);
	 }



	             }
	         

	         return par1ItemStack;
	     }
	 }
	
