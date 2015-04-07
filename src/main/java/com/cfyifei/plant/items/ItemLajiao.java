package com.cfyifei.plant.items;

import com.cfyifei.FoodCraft;
import com.cfyifei.block.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

public class ItemLajiao extends Item implements IPlantable{

	public ItemLajiao()
    {
        super();
        this.setCreativeTab(FoodCraft.FcTab);
    }
	   public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	    {
	        if (par7 != 1)
	        {
	            return false;
	        }
	        else if (par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack) && par2EntityPlayer.canPlayerEdit(par4, par5 + 1, par6, par7, par1ItemStack))
	        {
	            if (par3World.getBlock(par4, par5, par6).canSustainPlant(par3World, par4, par5, par6, ForgeDirection.UP, this) && par3World.isAirBlock(par4, par5 + 1, par6))
	            {
	                par3World.setBlock(par4, par5 + 1, par6, ModBlocks.BlockLajiao);
	                --par1ItemStack.stackSize;
	                return true;
	            }
	            else
	            {
	                return false;
	            }
	        }
	        else
	        {
	            return false;
	        }
	    }
	   
	   
	    @Override
	    public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z)
	    {
	        return EnumPlantType.Crop;
	    }

	    @Override
	    public Block getPlant(IBlockAccess world, int x, int y, int z)
	    {
	        return ModBlocks.BlockLajiao;
	    }

	    @Override
	    public int getPlantMetadata(IBlockAccess world, int x, int y, int z)
	    {
	        return 0;
	    }
}
