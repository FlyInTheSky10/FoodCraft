package com.cfyifei.item;

import com.cfyifei.block.ModBlocks;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ItemCong extends Item {
 

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

	                if (!par3EntityPlayer.canPlayerEdit(i, j, k, movingobjectposition.sideHit, par1ItemStack))
	                {
	                    return par1ItemStack;
	                }

	                if (par2World.getBlock(i, j, k) == Blocks.grass)
	                {
	                    --par1ItemStack.stackSize;
	                    
	                    par2World.setBlock(i, j + 1, k,ModBlocks.BlockCong);
	                }
    }
	            }
		return par1ItemStack;
	        }
    }
	            

