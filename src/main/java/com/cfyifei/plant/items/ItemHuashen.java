package com.cfyifei.plant.items;

import com.cfyifei.FoodCraft;
import com.cfyifei.block.ModBlocks;
import com.cfyifei.item.ModItem;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

public class ItemHuashen extends ItemPlant{

	public ItemHuashen()
    {
        super(ModItem.ItemHuashen, ModBlocks.BlockHuashen);
        this.setCreativeTab(FoodCraft.FcTabZhiwu);
    }
	
}