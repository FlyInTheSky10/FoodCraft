package com.cfyifei.item;

import com.cfyifei.block.FoodcraftBlocks;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ItemJinghuashuitong extends ItemSpade {
            
	public ItemJinghuashuitong(ToolMaterial wood) {
		super(wood);
	}

	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		MovingObjectPosition movingobjectposition = this.getMovingObjectPositionFromPlayer(par2World, par3EntityPlayer, true);

		if (movingobjectposition == null) {
			return par1ItemStack;
		}
		else { if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
            BlockPos blockpos = movingobjectposition.getBlockPos();
            
            if (!par2World.isBlockModifiable(par3EntityPlayer, blockpos)) {
                return par1ItemStack;
            }

            if (!par3EntityPlayer.canPlayerEdit(blockpos.offset(movingobjectposition.sideHit), movingobjectposition.sideHit, par1ItemStack)) {
                return par1ItemStack;
            }

            if (par2World.getBlockState(blockpos).getBlock().getMaterial() == Material.water) {
            	par2World.setBlockState(blockpos, Blocks.air.getDefaultState());
            	par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "game.player.swim", 1F, 1F, false);
            	
            if (!par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(FoodcraftItems.Itemwater))) {
                par3EntityPlayer.dropPlayerItemWithRandomChoice(new ItemStack(FoodcraftItems.Itemwater), false);
           }

          par1ItemStack.setItemDamage(par1ItemStack.getItemDamage() +1);
  
          if(par1ItemStack.getItemDamage() >= 16) {
        	  par1ItemStack = new ItemStack(Items.bucket);
        	  par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);
	
          }


            }
      }
        return par1ItemStack;
    }
}
}
