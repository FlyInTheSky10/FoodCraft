package com.cfyifei.block;

import java.util.List;

import net.minecraft.block.BlockCake;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockCakeFoodcraft extends BlockCake {
	String[] s = new String[]{"BlockPutaoDG","BlockJinputaoDG","BlockLiDG","BlockTaoziDG","BlockJuziDG","BlockNingmengDG","BlockCaomeiDG","BlockYeziDG"};
	public BlockCakeFoodcraft() {
		this.disableStats();
	}
	@Override
    @SideOnly(Side.CLIENT)
    public Item getItem(World worldIn, BlockPos pos) {
        return Item.getItemFromBlock(this);
    }
}
