package com.foodcraft.block;

import com.foodcraft.FoodCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockFc extends Block {
	public BlockFc(Material material, String name) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(FoodCraft.FcTabMachine);
	}
}
