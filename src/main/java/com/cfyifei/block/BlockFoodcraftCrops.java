package com.cfyifei.block;

import java.util.Random;

import com.cfyifei.item.ModItem;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;





public class BlockFoodcraftCrops extends BlockCrops {
	public String crop;
	public String seed;

	public BlockFoodcraftCrops(String seed, String crop) {
		this.seed = seed;
		this.crop = crop;
	}
	@Override
	public Item getSeed() {
		return Item.getByNameOrId(seed);
	}

	@Override
	public Item getCrop() {
		return Item.getByNameOrId(crop);
	}
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
    	if(this == ModBlocks.BlockDouzi) {
    	if(((Integer)state.getValue(AGE)).intValue() == 7) {
    		return this.getCrop();
    	}else {
    		if(((Integer)state.getValue(AGE)) >= 4 && ((Integer)state.getValue(AGE)) <= 4 ) {
        		return ModItem.ItemDoujiao;
        	}else {
        		return  this.getSeed();
        	}
    	}
    }
    	else {
    		return super.getItemDropped(state, rand, fortune);
    	}
    }
}
