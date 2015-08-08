package com.cfyifei.item;

import com.cfyifei.block.ModBlocks;
import com.cfyifei.util.FoodcraftUtil;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
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
	} else {
	    if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
		int i = movingobjectposition.blockX;
		int j = movingobjectposition.blockY;
		int k = movingobjectposition.blockZ;
		if (!par2World.canMineBlock(par3EntityPlayer, i, j, k)) {
		    return par1ItemStack;
		}

		if (!par3EntityPlayer.canPlayerEdit(i, j, k, movingobjectposition.sideHit, par1ItemStack)) {
		    return par1ItemStack;
		}

		if (par2World.getBlock(i, j, k).getMaterial() == Material.water) {
		    par2World.setBlock(i, j, k, Blocks.air);
		    par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "game.player.swim", 1F, 1F, false);

		    if (!par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModItem.Itemwater))) {
			par3EntityPlayer.dropPlayerItemWithRandomChoice(new ItemStack(ModItem.Itemwater), false);
		    }

		    par1ItemStack.setItemDamage(par1ItemStack.getItemDamage() + 1);

		    if (par1ItemStack.getItemDamage() >= 16) {
			par1ItemStack = new ItemStack(Items.bucket);
			par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);

		    }

		}
	    }
	    return par1ItemStack;
	}
    }
}
