package com.foodcraft.plant.blocks;

import java.util.Random;

import com.foodcraft.init.FoodcraftItems;
import com.foodcraft.init.FoodcraftPlants;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;





public class BlockFoodcraftCrops extends BlockCrops {
    private String crop;
    private String seed;

    public BlockFoodcraftCrops(String seed, String crop, String name) {
        this.seed = seed;
        this.crop = crop;
        this.setUnlocalizedName(name);
        this.setHarvestLevel("pickaxe", -1);
        this.setStepSound(Block.soundTypeGrass);
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
        if(this == FoodcraftPlants.BlockDouzi) {
            if(((Integer)state.getValue(AGE)).intValue() == 7) {
                return this.getCrop();
            } else {
                if(((Integer)state.getValue(AGE)) >= 4 && ((Integer)state.getValue(AGE)) <= 4 ) {
                    return FoodcraftItems.ItemDoujiao;
                } else {
                    return  this.getSeed();
                }
            }
        } else {
            return super.getItemDropped(state, rand, fortune);
        }
    }
}
