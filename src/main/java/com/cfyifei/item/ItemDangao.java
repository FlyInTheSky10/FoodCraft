package com.cfyifei.item;

import java.util.List;

import com.cfyifei.block.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemDangao extends Item{
	String[] s = new String[]{"ItemPutaoDG","ItemJinputaoDG","ItemLiDG","ItemTaoziDG","ItemJuziDG","ItemNingmengDG","ItemCaomeiDG","ItemYeziDG"};
	Block[] b = new Block[]{ModBlocks.BlockPutaoDG,ModBlocks.BlockJinputaoDG,ModBlocks.BlockLiDG,ModBlocks.BlockTaoziDG,ModBlocks.BlockJuziDG,ModBlocks.BlockNingmengDG,ModBlocks.BlockCaomeiDG,ModBlocks.BlockYeziDG};
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
 
    public String getUnlocalizedName(ItemStack is1)
    {
    	 return s[is1.getItemDamage()];
    }
    
    public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        IBlockState iblockstate = worldIn.getBlockState(pos);
        Block block = iblockstate.getBlock();

        if (block == Blocks.snow_layer && ((Integer)iblockstate.getValue(BlockSnow.LAYERS)).intValue() < 1)
        {
            side = EnumFacing.UP;
        }
        else if (!block.isReplaceable(worldIn, pos))
        {
            pos = pos.offset(side);
        }

        if (!playerIn.canPlayerEdit(pos, side, stack))
        {
            return false;
        }
        else if (stack.stackSize == 0)
        {
            return false;
        }
        else
        {
            if (worldIn.canBlockBePlaced(b[stack.getItemDamage()], pos, false, side, (Entity)null, stack))
            {
                IBlockState iblockstate1 = this.b[stack.getItemDamage()].onBlockPlaced(worldIn, pos, side, hitX, hitY, hitZ, 0, playerIn);

                if (worldIn.setBlockState(pos, iblockstate1, 3))
                {
                    iblockstate1 = worldIn.getBlockState(pos);

                    if (iblockstate1.getBlock() == this.b[stack.getItemDamage()])
                    {
                        ItemBlock.setTileEntityNBT(worldIn, pos, stack);
                        iblockstate1.getBlock().onBlockPlacedBy(worldIn, pos, iblockstate1, playerIn, stack);
                    }

                    worldIn.playSoundEffect((double)((float)pos.getX() + 0.5F), (double)((float)pos.getY() + 0.5F), (double)((float)pos.getZ() + 0.5F), this.b[stack.getItemDamage()].stepSound.getPlaceSound(), (this.b[stack.getItemDamage()].stepSound.getVolume() + 1.0F) / 2.0F, this.b[stack.getItemDamage()].stepSound.getFrequency() * 0.8F);
                    --stack.stackSize;
                    return true;
                }
            }

            return false;
        }
    }
}
