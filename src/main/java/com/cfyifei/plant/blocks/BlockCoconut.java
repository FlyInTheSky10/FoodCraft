package com.cfyifei.plant.blocks;

import java.util.Random;

import com.cfyifei.FoodCraft;
import com.cfyifei.item.FoodcraftItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.biome.BiomeGenBase;

public class BlockCoconut extends Block {
	
	private String name;
	private String fruit;
	
	public BlockCoconut(String name,String fruit){
		super(Material.wood);
		this.setTickRandomly(true);
		this.setHardness(0.2F);
		this.setLightOpacity(1);
		this.setStepSound(this.soundTypeWood);
		this.setUnlocalizedName(name);
		this.name=name;
		this.fruit = fruit;
		this.setCreativeTab(FoodCraft.FcTabJiqi);
	}
   
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getByNameOrId(fruit);
	}
}
