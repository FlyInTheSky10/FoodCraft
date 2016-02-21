package com.foodcraft.plant.blocks;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import com.foodcraft.FoodCraft;
import com.foodcraft.GuiIDs;
import com.foodcraft.init.FoodcraftBlocks;
import com.foodcraft.init.FoodcraftItems;
import com.foodcraft.init.FoodcraftPlants;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.IGrowable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class BlockTree extends BlockBush {
	private Block fruit;
    public BlockTree(Block fruit,String name) {
    	this.fruit = fruit;
        float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
        this.setUnlocalizedName(name);
        this.setCreativeTab(FoodCraft.FcTabPlant);
        this.setHarvestLevel("pickaxe", -1);
        this.setStepSound(Block.soundTypeGrass);
    }
    
	@Override
	 public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
		ItemStack stack = playerIn.inventory.mainInventory[playerIn.inventory.currentItem];
		if(stack != null){
			if(stack.getItem() == FoodcraftItems.ItemJinkela){
	            		if(canGlow(worldIn, pos.getX(),pos.getY(),pos.getZ())){
	            			glowTree(worldIn, pos.getX(),pos.getY(),pos.getZ());
	            		}
	            		--stack.stackSize;
	            		if(stack.stackSize <= 0){
	            			stack = null;
	            		}
			}
		}
        return true;
	}
 
	
	 public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        if (!worldIn.isRemote) {
            super.updateTick(worldIn, pos, state, rand);
            if (rand.nextInt(7) == 0) {
            		if(canGlow(worldIn,pos.getX(),pos.getY(),pos.getZ())) {
            			glowTree(worldIn, pos.getX(),pos.getY(),pos.getZ());
            		}
            }
        }
    }
	 private boolean canGlow(World w, int x, int y, int z) {
		if(
		
		isBlockAir(w, x, y + 1, z) &&
		isBlockAir(w, x, y + 2, z) && 
		isBlockAir(w, x, y + 3, z) && 
		isBlockAir(w, x, y + 4, z) && 
		isBlockAir(w, x, y + 5, z) && 
		isBlockAir(w, x + 1, y + 2, z) && 
		isBlockAir(w, x + 2, y + 2, z) && 
		isBlockAir(w, x - 1, y + 2, z) && 
		isBlockAir(w, x - 2, y + 2, z) &&  
		isBlockAir(w, x, y + 2, z + 1) && 
		isBlockAir(w, x, y + 2, z + 2) && 
		isBlockAir(w, x, y + 2, z - 1) && 
		isBlockAir(w, x, y + 2, z - 2) && 	
		 isBlockAir(w, x + 1, y + 2, z + 1) && 
		 isBlockAir(w, x + 2, y + 2, z + 1) && 
		 isBlockAir(w, x - 1, y + 2, z + 1) && 
		 isBlockAir(w, x - 2, y + 2, z + 1) && 	
		 isBlockAir(w, x + 1, y + 2, z + 2) && 
		 isBlockAir(w, x + 2, y + 2, z + 2) && 
		 isBlockAir(w, x - 1, y + 2, z + 2) && 
		 isBlockAir(w, x - 2, y + 2, z + 2) && 	
		 isBlockAir(w, x + 1, y + 2, z - 1) && 
		 isBlockAir(w, x + 2, y + 2, z - 1) && 
		 isBlockAir(w, x - 1, y + 2, z - 1) && 
		 isBlockAir(w, x - 2, y + 2, z - 1) && 	
		 isBlockAir(w, x + 1, y + 2, z - 2) && 
		 isBlockAir(w, x + 2, y + 2, z - 2) && 
		 isBlockAir(w, x - 1, y + 2, z - 2) && 
		 isBlockAir(w, x - 2, y + 2, z - 2) && 
		 isBlockAir(w, x + 1, y + 3, z) && 
		 isBlockAir(w, x + 2, y + 3, z) && 
		 isBlockAir(w, x - 1, y + 3, z) && 
		 isBlockAir(w, x - 2, y + 3, z) && 	 
		 isBlockAir(w, x, y + 3, z + 1) && 
		 isBlockAir(w, x, y + 3, z + 2) && 
		 isBlockAir(w, x, y + 3, z - 1) && 
		 isBlockAir(w, x, y + 3, z - 2) && 	 
		 isBlockAir(w, x + 1, y + 3, z + 1) && 
		 isBlockAir(w, x + 2, y + 3, z + 1) && 
		 isBlockAir(w, x - 1, y + 3, z + 1) && 
		 isBlockAir(w, x - 2, y + 3, z + 1) && 
		 isBlockAir(w, x + 1, y + 3, z + 2) && 
		 isBlockAir(w, x + 2, y + 3, z + 2) && 
		 isBlockAir(w, x - 1, y + 3, z + 2) && 
		 isBlockAir(w, x - 2, y + 3, z + 2) && 
		 isBlockAir(w, x + 1, y + 3, z - 1) && 
		 isBlockAir(w, x + 2, y + 3, z - 1) && 
		 isBlockAir(w, x - 1, y + 3, z - 1) && 
		 isBlockAir(w, x - 2, y + 3, z - 1) && 
		 isBlockAir(w, x + 1, y + 3, z - 2) && 
		 isBlockAir(w, x + 2, y + 3, z - 2) && 
		 isBlockAir(w, x - 1, y + 3, z - 2) && 
		isBlockAir(w, x - 2, y + 3, z - 2) && 
		isBlockAir(w, x - 1, y + 4, z) && 
		isBlockAir(w, x - 1, y + 5, z) && 
		isBlockAir(w, x + 1, y + 4, z) && 
		isBlockAir(w, x + 1, y + 5, z) && 
		isBlockAir(w, x, y + 4, z + 1) && 
		isBlockAir(w, x, y + 5, z + 1) && 
		isBlockAir(w, x, y + 4, z - 1) && 
		isBlockAir(w, x, y + 5, z - 1)){
			return true;
		}
		else{
		return false;
	}
}
	 private void glowTree(World w, int x, int y, int z) {
		w.setBlockToAir(new BlockPos(x, y, z));
		//A
		setBlockToTree(w, x, y, z,Blocks.log);
		setBlockToTree(w, x, y + 1, z,Blocks.log);
		setBlockToTree(w, x, y + 2, z,Blocks.log);
		setBlockToTree(w, x, y + 3, z,Blocks.log);
		setBlockToTree(w, x, y + 4, z,Blocks.log);
		setBlockToTree(w, x, y + 5, z,FoodcraftPlants.FCleaves);
		
		//U
		
		 setBlockToTree(w, x + 1, y + 2, z,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x + 2, y + 2, z,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x - 1, y + 2, z,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x - 2, y + 2, z,fruit);
		 
		 setBlockToTree(w, x, y + 2, z + 1,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x, y + 2, z + 2,fruit);
		 setBlockToTree(w, x, y + 2, z - 1,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x, y + 2, z - 2,FoodcraftPlants.FCleaves);
		
		 setBlockToTree(w, x + 1, y + 2, z + 1,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x + 2, y + 2, z + 1,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x - 1, y + 2, z + 1,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x - 2, y + 2, z + 1,FoodcraftPlants.FCleaves);
		
		 setBlockToTree(w, x + 1, y + 2, z + 2,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x + 2, y + 2, z + 2,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x - 1, y + 2, z + 2,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x - 2, y + 2, z + 2,fruit);
		
		 setBlockToTree(w, x + 1, y + 2, z - 1,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x + 2, y + 2, z - 1,fruit);
		 setBlockToTree(w, x - 1, y + 2, z - 1,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x - 2, y + 2, z - 1,FoodcraftPlants.FCleaves);
		
		 setBlockToTree(w, x + 1, y + 2, z - 2,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x + 2, y + 2, z - 2,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x - 1, y + 2, z - 2,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x - 2, y + 2, z - 2,fruit);
		 
		//UP
	
		 setBlockToTree(w, x + 1, y + 3, z,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x + 2, y + 3, z,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x - 1, y + 3, z,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x - 2, y + 3, z,FoodcraftPlants.FCleaves);
		 
		 setBlockToTree(w, x, y + 3, z + 1,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x, y + 3, z + 2,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x, y + 3, z - 1,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x, y + 3, z - 2,fruit);
		 
		 setBlockToTree(w, x + 1, y + 3, z + 1,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x + 2, y + 3, z + 1,fruit);
		 setBlockToTree(w, x - 1, y + 3, z + 1,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x - 2, y + 3, z + 1,FoodcraftPlants.FCleaves);
		
		 setBlockToTree(w, x + 1, y + 3, z + 2,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x + 2, y + 3, z + 2,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x - 1, y + 3, z + 2,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x - 2, y + 3, z + 2,fruit);
		
		 setBlockToTree(w, x + 1, y + 3, z - 1,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x + 2, y + 3, z - 1,fruit);
		 setBlockToTree(w, x - 1, y + 3, z - 1,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x - 2, y + 3, z - 1,FoodcraftPlants.FCleaves);
		
		 setBlockToTree(w, x + 1, y + 3, z - 2,fruit);
		 setBlockToTree(w, x + 2, y + 3, z - 2,FoodcraftPlants.FCleaves);
		 setBlockToTree(w, x - 1, y + 3, z - 2,FoodcraftPlants.FCleaves);
		setBlockToTree(w, x - 2, y + 3, z - 2,FoodcraftPlants.FCleaves);

		
		setBlockToTree(w, x - 1, y + 4, z,FoodcraftPlants.FCleaves);
		setBlockToTree(w, x - 1, y + 5, z,FoodcraftPlants.FCleaves);
		setBlockToTree(w, x + 1, y + 4, z,FoodcraftPlants.FCleaves);
		setBlockToTree(w, x + 1, y + 5, z,FoodcraftPlants.FCleaves);
		setBlockToTree(w, x, y + 4, z + 1,FoodcraftPlants.FCleaves);
		setBlockToTree(w, x, y + 5, z + 1,FoodcraftPlants.FCleaves);
		setBlockToTree(w, x, y + 4, z - 1,FoodcraftPlants.FCleaves);
		setBlockToTree(w, x, y + 5, z - 1,FoodcraftPlants.FCleaves);
	}

	private void setBlockToTree(World w, int x, int y, int z, Block leaves) {
		if(w.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.air 
				|| w.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.leaves 
				|| w.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.leaves2
				|| w.getBlockState(new BlockPos(x, y, z)).getBlock() == FoodcraftPlants.FCleaves){
			w.setBlockState(new BlockPos(x, y, z),leaves.getDefaultState());
		}
	}
	private boolean isBlockAir(World w, int x, int y, int z){
		if(w.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.air 
				|| w.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.leaves 
				|| w.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.leaves2
				|| w.getBlockState(new BlockPos(x, y, z)).getBlock() == FoodcraftPlants.FCleaves){
			return true;
		}
		else{
		return false;
		}
	}
}