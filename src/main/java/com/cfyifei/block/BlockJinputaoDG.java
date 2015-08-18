package com.cfyifei.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockCake;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockJinputaoDG extends BlockCake{

	public BlockJinputaoDG() {
		this.disableStats();
	}
	@Override
    @SideOnly(Side.CLIENT)
    public Item getItem(World worldIn, BlockPos pos) {
        return Item.getItemFromBlock(this);
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)  {
        if (!worldIn.isRemote) {
        	int j = ((Integer)state.getValue(BITES)).intValue();
        		if(j > 0) {
        			worldIn.setBlockState(pos, state.withProperty(BITES, Integer.valueOf(j - 1)), 3);
        		}
        }
    }
}

