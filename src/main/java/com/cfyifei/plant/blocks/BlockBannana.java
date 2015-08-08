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


public class BlockBannana extends Block {
	private String name;
	private Item fruit;
	public BlockBannana(String name,Item fruit){
		 super(Material.wood);
	        this.setTickRandomly(true);
	        this.setHardness(0.2F);
	        this.setLightOpacity(1);
	        this.setStepSound(soundTypeWood);
		this.name=name;
		this.fruit = fruit;
		this.setCreativeTab(FoodCraft.FcTabJiqi);
	}
   
    public int quantityDropped(Random p_149745_1_)
    {
        return p_149745_1_.nextInt(2) + 1;
    }
	private IIcon Icon;
	private IIcon Icon2;
	@Override
	public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
		if (p_149691_1_ == 0)
        {
          return this.Icon2;
        }
        if (p_149691_1_ == 1)
        {
        return this.Icon2;
        		
        }
		return Icon;
	}
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg)
    {
        this.Icon = reg.registerIcon("foodcraft:" + name);
        this.Icon2 = reg.registerIcon("foodcraft:xiangjiao_top");
    }	 @Override
	   public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	    {
	        return fruit;
	    }
}
