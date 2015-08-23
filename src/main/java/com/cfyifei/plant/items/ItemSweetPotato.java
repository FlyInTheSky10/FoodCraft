package com.cfyifei.plant.items;

import com.cfyifei.FoodCraft;
import com.cfyifei.block.FoodcraftBlocks;
import com.cfyifei.item.FcFood;
import com.cfyifei.plant.blocks.FoodcraftPlants;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.MinecraftForge;

public class ItemSweetPotato extends FcFood implements IPlantable{

	public Item seed;
	public Block seedblock;
	public ItemSweetPotato(Block b, int e, String name)
    {
        super(e, e, "ItemHongshu");
        this.setUnlocalizedName(name);
        MinecraftForge.addGrassSeed(new ItemStack(this), 2);
        this.setCreativeTab(FoodCraft.FcTabZhiwu);
        this.seedblock = b;
    }
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
    {
	        if (side != EnumFacing.UP)
	        {
	            return false;
	        }
	        else if (!playerIn.canPlayerEdit(pos.offset(side), side, stack))
	        {
	            return false;
	        }
	        else if (worldIn.getBlockState(pos).getBlock().canSustainPlant(worldIn, pos, EnumFacing.UP, this) && worldIn.isAirBlock(pos.up()))
	        {
	            worldIn.setBlockState(pos.up(), this.seedblock.getDefaultState());
	            --stack.stackSize;
	            return true;
	        }
	        else
	        {
	            return false;
	        }
	    }
	@Override
	public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
		return EnumPlantType.Crop;
	}
	@Override
	public IBlockState getPlant(IBlockAccess world, BlockPos pos) {
		return FoodcraftPlants.BlockDouzi.getDefaultState();
	}
	   

}
