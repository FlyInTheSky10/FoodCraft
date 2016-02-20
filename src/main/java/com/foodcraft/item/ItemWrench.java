package com.foodcraft.item;

import com.foodcraft.FoodCraft;
import com.foodcraft.config.NERConfigHandler;
import com.foodcraft.gui.blocks.BlockBeverageMaking;
import com.foodcraft.gui.blocks.BlockFrying;
import com.foodcraft.gui.blocks.BlockMill;
import com.foodcraft.gui.blocks.BlockStove;
import com.foodcraft.gui.tileentities.TileEntityPan;
import com.foodcraft.gui.tileentities.TileEntityPot;
import com.foodcraft.init.FoodcraftGuiBlocks;
import com.foodcraft.util.FoodcraftSubscribeEvent;
import com.foodcraft.util.FoodcraftUtil;

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


public class ItemWrench extends Item {

    public ItemWrench(String name) {
        this.setUnlocalizedName(name);
        this.setCreativeTab(FoodCraft.FcTabMachine);
        this.setMaxStackSize(1);
    }

    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
        if(NERConfigHandler.booleanwrench) {
            MovingObjectPosition movingobjectposition = this.getMovingObjectPositionFromPlayer(par2World, par3EntityPlayer, true);

            if (movingobjectposition == null) {
                return par1ItemStack;
            } else {
                if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
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
                    if (par2World.getBlockState(movingobjectposition.getBlockPos()).getBlock() == FoodcraftGuiBlocks.Caiban) {

                        par2World.setBlockToAir(movingobjectposition.getBlockPos());
                        if(!par2World.isRemote) {
                            FoodcraftUtil.dropItemAsEntity(par2World, i, j, k, new ItemStack(FoodcraftGuiBlocks.Caiban));
                        }
                        par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);
                    }
                    if (par2World.getBlockState(movingobjectposition.getBlockPos()).getBlock() == FoodcraftGuiBlocks.Guo) {
                        if(!par2World.isRemote) {
                            if ((te != null) && ((te instanceof TileEntityPot))) {
                                TileEntityPot t = (TileEntityPot)te;
                                ItemStack stack = new ItemStack(FoodcraftGuiBlocks.Guo);
                                FoodcraftSubscribeEvent.setItemStackNBT(stack, "frequencyOfUse", t.frequencyOfUse);

                                par2World.setBlockToAir(movingobjectposition.getBlockPos());
                                FoodcraftUtil.dropItemAsEntity(par2World, i, j, k, stack);

                            }
                        }
                        par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);
                    }
                    if (par2World.getBlockState(movingobjectposition.getBlockPos()).getBlock() == FoodcraftGuiBlocks.Gyg) {

                        par2World.setBlockToAir(movingobjectposition.getBlockPos());
                        if(!par2World.isRemote) {
                            FoodcraftUtil.dropItemAsEntity(par2World, i, j, k, new ItemStack(FoodcraftGuiBlocks.Gyg));
                        }
                        par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);
                    }
                    if (par2World.getBlockState(movingobjectposition.getBlockPos()).getBlock() instanceof BlockMill) {

                        par2World.setBlockToAir(movingobjectposition.getBlockPos());
                        if(!par2World.isRemote) {
                            FoodcraftUtil.dropItemAsEntity(par2World, i, j, k, new ItemStack(FoodcraftGuiBlocks.Nmj));
                        }
                        par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);
                    }
                    if (par2World.getBlockState(movingobjectposition.getBlockPos()).getBlock() == FoodcraftGuiBlocks.Nt) {

                        par2World.setBlockToAir(movingobjectposition.getBlockPos());
                        if(!par2World.isRemote) {
                            FoodcraftUtil.dropItemAsEntity(par2World, i, j, k, new ItemStack(FoodcraftGuiBlocks.Nt));
                        }
                        par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);
                    }
                    if (par2World.getBlockState(movingobjectposition.getBlockPos()).getBlock() == FoodcraftGuiBlocks.PDG) {
                        if(!par2World.isRemote) {
                            if ((te != null) && ((te instanceof TileEntityPan))) {
                                TileEntityPan t = (TileEntityPan)te;
                                ItemStack stack = new ItemStack(FoodcraftGuiBlocks.PDG);
                                FoodcraftSubscribeEvent.setItemStackNBT(stack, "frequencyOfUse", t.frequencyOfUse);
                                par2World.setBlockToAir(movingobjectposition.getBlockPos());
                                FoodcraftUtil.dropItemAsEntity(par2World, i, j, k, stack);

                            }
                        }
                        par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);
                    }
                    if (par2World.getBlockState(movingobjectposition.getBlockPos()).getBlock() instanceof BlockBeverageMaking) {

                        par2World.setBlockToAir(movingobjectposition.getBlockPos());
                        if(!par2World.isRemote) {
                            FoodcraftUtil.dropItemAsEntity(par2World, i, j, k, new ItemStack(FoodcraftGuiBlocks.Tpj));
                        }
                        par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);
                    }
                    if (par2World.getBlockState(movingobjectposition.getBlockPos()).getBlock() instanceof BlockFrying) {

                        par2World.setBlockToAir(movingobjectposition.getBlockPos());
                        if(!par2World.isRemote) {
                            FoodcraftUtil.dropItemAsEntity(par2World, i, j, k, new ItemStack(FoodcraftGuiBlocks.YZJ));
                        }
                        par2World.playSound(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, "random.break", 1F, 1F, false);
                    }
                    if (par2World.getBlockState(movingobjectposition.getBlockPos()).getBlock() instanceof BlockStove) {

                        par2World.setBlockToAir(movingobjectposition.getBlockPos());
                        if(!par2World.isRemote) {
                            FoodcraftUtil.dropItemAsEntity(par2World, i, j, k, new ItemStack(FoodcraftGuiBlocks.Zl));
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

