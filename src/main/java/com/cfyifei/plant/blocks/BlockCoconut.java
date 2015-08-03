package com.cfyifei.plant.blocks;

import java.util.Random;

import com.cfyifei.FoodCraft;
import com.cfyifei.item.ModItem;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.biome.BiomeGenBase;


public class BlockCoconut extends Block {
	private String name;
	private Item fruit;
	public BlockCoconut(String name,Item fruit){
		 super(Material.wood);
	        this.setTickRandomly(true);
	        this.setHardness(0.2F);
	        this.setLightOpacity(1);
	        this.setStepSound(this.soundTypeWood);
		this.name=name;
		this.fruit = fruit;
		this.setCreativeTab(FoodCraft.FcTabJiqi);
	}
   
	private IIcon Icon;
	@Override
	public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
		return Icon;
	}
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg)
    {
        this.Icon = reg.registerIcon("foodcraft:" + name);
    }	 @Override
	   public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	    {
	        return fruit;
	    }
}
