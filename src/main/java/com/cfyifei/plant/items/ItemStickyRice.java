package com.cfyifei.plant.items;

import com.cfyifei.FoodCraft;
import com.cfyifei.block.FoodcraftBlocks;
import com.cfyifei.item.FoodcraftItems;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

public class ItemStickyRice extends ItemPlant{

	public ItemStickyRice()
    {
        super(FoodcraftItems.ItemNuomi, FoodcraftBlocks.BlockNuodao);
        this.setCreativeTab(FoodCraft.FcTabZhiwu);
    }
	
}
