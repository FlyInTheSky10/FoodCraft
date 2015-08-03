package com.cfyifei.item;

import com.cfyifei.config.NERConfigHandler;
import com.cfyifei.gui.blocks.BlockNmj;
import com.cfyifei.gui.blocks.BlockTpj;
import com.cfyifei.gui.blocks.BlockYZJ;
import com.cfyifei.gui.blocks.BlockZl;
import com.cfyifei.gui.blocks.ModGui;
import com.cfyifei.util.FoodcraftUtil;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;


public class ItemWrench extends Item{


		public ItemWrench(String name) {
			this.setUnlocalizedName(name);
		}
		public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
		{
			if(NERConfigHandler.booleanwrench){
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

		            if (!par3EntityPlayer.canPlayerEdit(i, j, k, movingobjectposition.sideHit, par1ItemStack))
		            {
		                return par1ItemStack;
		            }
		            //*****************************************************
		            if (par2World.getBlock(i, j, k) == ModGui.Caiban)
		            {
		            	
		            	par2World.setBlockToAir(i, j, k);
		            	if(!par2World.isRemote){
		            	FoodcraftUtil.dropItemAsEntity(par2World, i, j, k, new ItemStack(ModGui.Caiban));
		            	}
		            	par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);
		            }
		            if (par2World.getBlock(i, j, k) == ModGui.Guo)
		            {
		            	
		            	par2World.setBlockToAir(i, j, k);
		            	if(!par2World.isRemote){
		            	FoodcraftUtil.dropItemAsEntity(par2World, i, j, k, new ItemStack(ModGui.Guo));
		            	}
		            	par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);
		            }
		            if (par2World.getBlock(i, j, k) == ModGui.Gyg)
		            {
		            	
		            	par2World.setBlockToAir(i, j, k);
		            	if(!par2World.isRemote){
		            	FoodcraftUtil.dropItemAsEntity(par2World, i, j, k, new ItemStack(ModGui.Gyg));
		            	}
		            	par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);
		            }
		            if (par2World.getBlock(i, j, k) instanceof BlockNmj)
		            {
		            	
		            	par2World.setBlockToAir(i, j, k);
		            	if(!par2World.isRemote){
		            	FoodcraftUtil.dropItemAsEntity(par2World, i, j, k, new ItemStack(ModGui.Nmj));
		            	}
		            	par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);
		            }
		            if (par2World.getBlock(i, j, k) == ModGui.Nt)
		            {
		            	
		            	par2World.setBlockToAir(i, j, k);
		            	if(!par2World.isRemote){
		            	FoodcraftUtil.dropItemAsEntity(par2World, i, j, k, new ItemStack(ModGui.Nt));
		            	}
		            	par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);
		            }
		            if (par2World.getBlock(i, j, k) == ModGui.PDG)
		            {
		            	
		            	par2World.setBlockToAir(i, j, k);
		            	if(!par2World.isRemote){
		            	FoodcraftUtil.dropItemAsEntity(par2World, i, j, k, new ItemStack(ModGui.PDG));
		            	}
		            	par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);
		            }
		            if (par2World.getBlock(i, j, k) instanceof BlockTpj)
		            {
		            	
		            	par2World.setBlockToAir(i, j, k);
		            	if(!par2World.isRemote){
		            	FoodcraftUtil.dropItemAsEntity(par2World, i, j, k, new ItemStack(ModGui.Tpj));
		            	}
		            	par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);
		            }
		            if (par2World.getBlock(i, j, k) instanceof BlockYZJ)
		            {
		            	
		            	par2World.setBlockToAir(i, j, k);
		            	if(!par2World.isRemote){
		            	FoodcraftUtil.dropItemAsEntity(par2World, i, j, k, new ItemStack(ModGui.YZJ));
		            	}
		            	par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);
		            }
		            if (par2World.getBlock(i, j, k) instanceof BlockZl)
		            {
		            	
		            	par2World.setBlockToAir(i, j, k);
		            	if(!par2World.isRemote){
		            	FoodcraftUtil.dropItemAsEntity(par2World, i, j, k, new ItemStack(ModGui.Zl));
		            	}
		            	par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);
		            }
		          //*****************************************************
		        }
		        return par1ItemStack;
		    }
		}
			return par1ItemStack;
		}
	}

