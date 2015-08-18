package com.cfyifei.item;

import com.cfyifei.config.NERConfigHandler;
import com.cfyifei.gui.blocks.BlockNmj;
import com.cfyifei.gui.blocks.BlockTpj;
import com.cfyifei.gui.blocks.BlockYZJ;
import com.cfyifei.gui.blocks.BlockZl;
import com.cfyifei.gui.blocks.ModGui;
import com.cfyifei.gui.tileentitys.TileEntityGuo;
import com.cfyifei.gui.tileentitys.TileEntityPDG;
import com.cfyifei.util.FoodcraftSubscribeEvent;
import com.cfyifei.util.FoodcraftUtil;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;


public class ItemWrench extends Item{

		public ItemWrench(String name) {
			this.setUnlocalizedName(name);
		}
		
		public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
			if(NERConfigHandler.booleanwrench){
			MovingObjectPosition movingobjectposition = this.getMovingObjectPositionFromPlayer(par2World, par3EntityPlayer, true);

		    if (movingobjectposition == null) {
		        return par1ItemStack;
		    }
		    else { if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
		            int i = movingobjectposition.getBlockPos().getX();
		            int j = movingobjectposition.getBlockPos().getY();
		            int k = movingobjectposition.getBlockPos().getZ();
		            if (!par2World.canMineBlockBody(par3EntityPlayer, movingobjectposition.getBlockPos())) {
		                return par1ItemStack;
		            }

		            if (!par3EntityPlayer.canPlayerEdit(movingobjectposition.getBlockPos(), movingobjectposition.sideHit, par1ItemStack)) {
		                return par1ItemStack;
		            }
		            TileEntity te = par2World.getTileEntity(movingobjectposition.getBlockPos());
		            if (par2World.getBlockState(movingobjectposition.getBlockPos()).getBlock() == ModGui.Caiban) {
		            	
		            	par2World.setBlockToAir(movingobjectposition.getBlockPos());
		            	if(!par2World.isRemote){
		            	FoodcraftUtil.dropItemAsEntity(par2World, i, j, k, new ItemStack(ModGui.Caiban));
		            	}
		            	par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);
		            }
		            if (par2World.getBlockState(movingobjectposition.getBlockPos()).getBlock() == ModGui.Guo) {
		            	if(!par2World.isRemote) {
		            		 if ((te != null) && ((te instanceof TileEntityGuo))) {
		            			  TileEntityGuo t = (TileEntityGuo)te;
		            		    ItemStack stack = new ItemStack(ModGui.Guo);
		            		    FoodcraftSubscribeEvent.setItemStackNBT(stack, "frequencyOfUse", t.frequencyOfUse);
	
		            		    	par2World.setBlockToAir(movingobjectposition.getBlockPos());
		            		    	FoodcraftUtil.dropItemAsEntity(par2World, i, j, k, stack);
		            			
		            		  }
		            	}
		            	par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);
		            }
		            if (par2World.getBlockState(movingobjectposition.getBlockPos()).getBlock() == ModGui.Gyg) {
		            	
		            	par2World.setBlockToAir(movingobjectposition.getBlockPos());
		            	if(!par2World.isRemote){
		            	FoodcraftUtil.dropItemAsEntity(par2World, i, j, k, new ItemStack(ModGui.Gyg));
		            	}
		            	par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);
		            }
		            if (par2World.getBlockState(movingobjectposition.getBlockPos()).getBlock() instanceof BlockNmj) {
		            	
		            	par2World.setBlockToAir(movingobjectposition.getBlockPos());
		            	if(!par2World.isRemote){
		            	FoodcraftUtil.dropItemAsEntity(par2World, i, j, k, new ItemStack(ModGui.Nmj));
		            	}
		            	par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);
		            }
		            if (par2World.getBlockState(movingobjectposition.getBlockPos()).getBlock() == ModGui.Nt) {
		            	
		            	par2World.setBlockToAir(movingobjectposition.getBlockPos());
		            	if(!par2World.isRemote){
		            	FoodcraftUtil.dropItemAsEntity(par2World, i, j, k, new ItemStack(ModGui.Nt));
		            	}
		            	par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);
		            }
		            if (par2World.getBlockState(movingobjectposition.getBlockPos()).getBlock() == ModGui.PDG) {
		            	if(!par2World.isRemote){
		            		 if ((te != null) && ((te instanceof TileEntityPDG))) {
		            			  TileEntityPDG t = (TileEntityPDG)te;
		            		    ItemStack stack = new ItemStack(ModGui.PDG);
		            		    FoodcraftSubscribeEvent.setItemStackNBT(stack, "frequencyOfUse", t.frequencyOfUse);
		            		    	par2World.setBlockToAir(movingobjectposition.getBlockPos());
		            		    	FoodcraftUtil.dropItemAsEntity(par2World, i, j, k, stack);
		            			
		            		  }
		            	}
		            	par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);
		            }
		            if (par2World.getBlockState(movingobjectposition.getBlockPos()).getBlock() instanceof BlockTpj) {
		            	
		            	par2World.setBlockToAir(movingobjectposition.getBlockPos());
		            	if(!par2World.isRemote){
		            	FoodcraftUtil.dropItemAsEntity(par2World, i, j, k, new ItemStack(ModGui.Tpj));
		            	}
		            	par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);
		            }
		            if (par2World.getBlockState(movingobjectposition.getBlockPos()).getBlock() instanceof BlockYZJ) {
		            	
		            	par2World.setBlockToAir(movingobjectposition.getBlockPos());
		            	if(!par2World.isRemote){
		            	FoodcraftUtil.dropItemAsEntity(par2World, i, j, k, new ItemStack(ModGui.YZJ));
		            	}
		            	par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);
		            }
		            if (par2World.getBlockState(movingobjectposition.getBlockPos()).getBlock() instanceof BlockZl) {
		            	
		            	par2World.setBlockToAir(movingobjectposition.getBlockPos());
		            	if(!par2World.isRemote){
		            	FoodcraftUtil.dropItemAsEntity(par2World, i, j, k, new ItemStack(ModGui.Zl));
		            	}
		            	par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);
		            }
		        }
		        return par1ItemStack;
		    }
		}
			return par1ItemStack;
		}
	}

