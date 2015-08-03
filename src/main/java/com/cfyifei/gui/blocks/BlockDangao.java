package com.cfyifei.gui.blocks;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockCake;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BlockDangao extends BlockCake{
	String[] s = new String[]{"BlockPutaoDG","BlockJinputaoDG","BlockLiDG","BlockTaoziDG","BlockJuziDG","BlockNingmengDG","BlockCaomeiDG","BlockYeziDG"};
	public BlockDangao() {
	}
	@Override
	@SideOnly(Side.CLIENT)
    public void getSubBlocks(Item p_150895_1_, CreativeTabs p_150895_2_, List p_150895_3_)
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
}
