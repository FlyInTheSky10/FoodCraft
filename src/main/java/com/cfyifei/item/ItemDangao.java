package com.cfyifei.item;

import java.util.List;

import com.cfyifei.block.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDangao extends Item{
	String[] s = new String[]{"ItemPutaoDG","ItemJinputaoDG","ItemLiDG","ItemTaoziDG","ItemJuziDG","ItemNingmengDG","ItemCaomeiDG","ItemYeziDG"};
	Block[] b = new Block[]{ModBlocks.BlockPutaoDG,ModBlocks.BlockJinputaoDG,ModBlocks.BlockLiDG,ModBlocks.BlockTaoziDG,ModBlocks.BlockJuziDG,ModBlocks.BlockNingmengDG,ModBlocks.BlockCaomeiDG,ModBlocks.BlockYeziDG};
	IIcon[] ii = new IIcon[8];
	public ItemDangao() {
		this.setHasSubtypes(true);
	}

    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack p_77636_1_)
    {
        return p_77636_1_.getItemDamage() == 1;
    }
 @SideOnly(Side.CLIENT)
    public void getSubItems(Item p_150895_1_, CreativeTabs p_150895_2_, List p_150895_3_)
    {
        p_150895_3_.add(new ItemStack(p_150895_1_, 1, 0));
        p_150895_3_.add(new ItemStack(p_150895_1_, 1, 1));
        p_150895_3_.add(new ItemStack(p_150895_1_, 1, 2));
        p_150895_3_.add(new ItemStack(p_150895_1_, 1, 3));
        p_150895_3_.add(new ItemStack(p_150895_1_, 1, 4));
        p_150895_3_.add(new ItemStack(p_150895_1_, 1, 5));
        p_150895_3_.add(new ItemStack(p_150895_1_, 1, 6));
        p_150895_3_.add(new ItemStack(p_150895_1_, 1, 7));
    }
 @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister p_94581_1_)
    {
	 for(int i1 = 0;i1 < 8;i1++){
		 ii[i1] = p_94581_1_.registerIcon("foodcraft:" + s[i1]);
	 }
    }
   @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int int1)
    {
	   return ii[int1];
    }

    public String getUnlocalizedName(ItemStack is1)
    {
    	 return s[is1.getItemDamage()];
    }
    
    public boolean onItemUse(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_)
    {
        Block block = p_77648_3_.getBlock(p_77648_4_, p_77648_5_, p_77648_6_);

        if (block == Blocks.snow_layer && (p_77648_3_.getBlockMetadata(p_77648_4_, p_77648_5_, p_77648_6_) & 7) < 1)
        {
            p_77648_7_ = 1;
        }
        else if (block != Blocks.vine && block != Blocks.tallgrass && block != Blocks.deadbush)
        {
            if (p_77648_7_ == 0)
            {
                --p_77648_5_;
            }

            if (p_77648_7_ == 1)
            {
                ++p_77648_5_;
            }

            if (p_77648_7_ == 2)
            {
                --p_77648_6_;
            }

            if (p_77648_7_ == 3)
            {
                ++p_77648_6_;
            }

            if (p_77648_7_ == 4)
            {
                --p_77648_4_;
            }

            if (p_77648_7_ == 5)
            {
                ++p_77648_4_;
            }
        }

        if (!p_77648_2_.canPlayerEdit(p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_1_))
        {
            return false;
        }
        else if (p_77648_1_.stackSize == 0)
        {
            return false;
        }
        else
        {
            if (p_77648_3_.canPlaceEntityOnSide(b[p_77648_1_.getItemDamage()], p_77648_4_, p_77648_5_, p_77648_6_, false, p_77648_7_, (Entity)null, p_77648_1_))
            {
                int i1 = b[p_77648_1_.getItemDamage()].onBlockPlaced(p_77648_3_, p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_8_, p_77648_9_, p_77648_10_, 0);

                if (p_77648_3_.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, b[p_77648_1_.getItemDamage()], i1, 3))
                {
                    if (p_77648_3_.getBlock(p_77648_4_, p_77648_5_, p_77648_6_) == b[p_77648_1_.getItemDamage()])
                    {
                    	b[p_77648_1_.getItemDamage()].onBlockPlacedBy(p_77648_3_, p_77648_4_, p_77648_5_, p_77648_6_, p_77648_2_, p_77648_1_);
                    	b[p_77648_1_.getItemDamage()].onPostBlockPlaced(p_77648_3_, p_77648_4_, p_77648_5_, p_77648_6_, i1);
                    }

                    p_77648_3_.playSoundEffect((double)((float)p_77648_4_ + 0.5F), (double)((float)p_77648_5_ + 0.5F), (double)((float)p_77648_6_ + 0.5F), b[p_77648_1_.getItemDamage()].stepSound.func_150496_b(), (b[p_77648_1_.getItemDamage()].stepSound.getVolume() + 1.0F) / 2.0F, b[p_77648_1_.getItemDamage()].stepSound.getPitch() * 0.8F);
                    --p_77648_1_.stackSize;
                }
            }

            return true;
        }
    }
}
