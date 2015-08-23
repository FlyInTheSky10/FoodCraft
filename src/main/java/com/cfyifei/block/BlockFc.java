package com.cfyifei.block;

import com.cfyifei.FoodCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockFc extends Block {
	protected BlockFc(Material material, String name) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(FoodCraft.FcTabJiqi);
	}
}
