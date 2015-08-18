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

public class BlockFruit extends Block {
	
	private String name;
	private Item fruit;
	
	public BlockFruit(String name,Item fruit){
		super(Material.leaves);
		this.setTickRandomly(true);
		this.setHardness(0.2F);
		this.setLightOpacity(1);
		this.setStepSound(soundTypeGrass);
		this.setUnlocalizedName(name);
		this.name=name;
		this.fruit = fruit;
		this.setCreativeTab(FoodCraft.FcTabJiqi);
	}
	
	@Override
    public int quantityDropped(Random p_149745_1_) {
		if(this == FoodcraftPlants.FCleaves){
    		 int i1 = p_149745_1_.nextInt(10);
    		 if(i1 < 7 && i1 >= 0){
    			 return 0;
    		 }
    		 else{
    			 return 1;
    		 }
    	}
        return p_149745_1_.nextInt(2) + 1;
    }
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
	        return fruit;
	}
}
