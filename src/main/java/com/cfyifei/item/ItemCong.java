package com.cfyifei.item;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCong extends Item {
    private static final String __OBFID = "CL_00001773";
    private Block field_150935_a;

    public ItemCong(Block p_i45329_1_) {
        this.field_150935_a = p_i45329_1_;
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack ItemStack, EntityPlayer EntityPlayer, World World, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_) {
        Block block = World.getBlock(p_77648_4_, p_77648_5_, p_77648_6_);

        if (block == Blocks.snow_layer && (World.getBlockMetadata(p_77648_4_, p_77648_5_, p_77648_6_) & 7) < 1) {
            p_77648_7_ = 1;
        } else if (block != Blocks.vine && block != Blocks.tallgrass && block != Blocks.deadbush) {
            if (p_77648_7_ == 0) {
                --p_77648_5_;
            }

            if (p_77648_7_ == 1) {
                ++p_77648_5_;
            }

            if (p_77648_7_ == 2) {
                --p_77648_6_;
            }

            if (p_77648_7_ == 3) {
                ++p_77648_6_;
            }

            if (p_77648_7_ == 4) {
                --p_77648_4_;
            }

            if (p_77648_7_ == 5) {
                ++p_77648_4_;
            }
        }

        if (!EntityPlayer.canPlayerEdit(p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, ItemStack)) {
            return false;
        } else if (ItemStack.stackSize == 0) {
            return false;
        } else {
            if (World.canPlaceEntityOnSide(this.field_150935_a, p_77648_4_, p_77648_5_, p_77648_6_, false, p_77648_7_, (Entity) null, ItemStack)) {
                int i1 = this.field_150935_a.onBlockPlaced(World, p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_8_, p_77648_9_, p_77648_10_, 0);

                if (World.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, this.field_150935_a, i1, 3)) {
                    if (World.getBlock(p_77648_4_, p_77648_5_, p_77648_6_) == this.field_150935_a) {
                        this.field_150935_a.onBlockPlacedBy(World, p_77648_4_, p_77648_5_, p_77648_6_, EntityPlayer, ItemStack);
                        this.field_150935_a.onPostBlockPlaced(World, p_77648_4_, p_77648_5_, p_77648_6_, i1);
                    }

                    World.playSoundEffect((double) ((float) p_77648_4_ + 0.5F), (double) ((float) p_77648_5_ + 0.5F), (double) ((float) p_77648_6_ + 0.5F), this.field_150935_a.stepSound.getPlaceSound(), (this.field_150935_a.stepSound.getVolume() + 1.0F) / 2.0F, this.field_150935_a.stepSound.frequency * 0.8F);
                    --ItemStack.stackSize;
                }
            }

            return true;
        }
    }
}