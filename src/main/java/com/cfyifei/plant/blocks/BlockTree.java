package com.cfyifei.plant.blocks;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import com.cfyifei.FoodCraft;
import com.cfyifei.GuiIDs;
import com.cfyifei.block.ModBlocks;
import com.cfyifei.item.ModItem;

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

public class BlockTree extends BlockBush
{
	public Block fruit;
    public BlockTree(Block fruit,String name)
    {
    	this.fruit = fruit;
        float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
        this.setUnlocalizedName(name);
        this.setCreativeTab(FoodCraft.FcTabZhiwu);
    }
	@Override
	 public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
		ItemStack stack = playerIn.inventory.mainInventory[playerIn.inventory.currentItem];
		if(stack != null){
			if(stack.getItem() == ModItem.ItemJinkela){
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
    /**
     * Ticks the block if it's been scheduled
     */
	 public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (!worldIn.isRemote)
        {
            super.updateTick(worldIn, pos, state, rand);
            //亮度大于等于9
            if (rand.nextInt(7) == 0)
            {
            		if(canGlow(worldIn,pos.getX(),pos.getY(),pos.getZ())){
            			glowTree(worldIn, pos.getX(),pos.getY(),pos.getZ());
            		}
               
            }
        }
    }
public boolean canGlow(World w, int x, int y, int z){
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
		//System.out.println(true);
		return true;
	}
	else{
	//System.out.println(false);
	return false;
	}
}
    private void glowTree(World w, int x, int y, int z) {
		w.setBlockToAir(new BlockPos(x, y, z));
		//中
		setBlockToTree(w, x, y, z,Blocks.log);
		setBlockToTree(w, x, y + 1, z,Blocks.log);
		setBlockToTree(w, x, y + 2, z,Blocks.log);
		setBlockToTree(w, x, y + 3, z,Blocks.log);
		setBlockToTree(w, x, y + 4, z,Blocks.log);
		setBlockToTree(w, x, y + 5, z,Plant.FCleaves);
		
		//下层
		
		 setBlockToTree(w, x + 1, y + 2, z,Plant.FCleaves);
		 setBlockToTree(w, x + 2, y + 2, z,Plant.FCleaves);
		 setBlockToTree(w, x - 1, y + 2, z,Plant.FCleaves);
		 setBlockToTree(w, x - 2, y + 2, z,fruit);
		 
		 setBlockToTree(w, x, y + 2, z + 1,Plant.FCleaves);
		 setBlockToTree(w, x, y + 2, z + 2,fruit);
		 setBlockToTree(w, x, y + 2, z - 1,Plant.FCleaves);
		 setBlockToTree(w, x, y + 2, z - 2,Plant.FCleaves);
		
		 setBlockToTree(w, x + 1, y + 2, z + 1,Plant.FCleaves);
		 setBlockToTree(w, x + 2, y + 2, z + 1,Plant.FCleaves);
		 setBlockToTree(w, x - 1, y + 2, z + 1,Plant.FCleaves);
		 setBlockToTree(w, x - 2, y + 2, z + 1,Plant.FCleaves);
		
		 setBlockToTree(w, x + 1, y + 2, z + 2,Plant.FCleaves);
		 setBlockToTree(w, x + 2, y + 2, z + 2,Plant.FCleaves);
		 setBlockToTree(w, x - 1, y + 2, z + 2,Plant.FCleaves);
		 setBlockToTree(w, x - 2, y + 2, z + 2,fruit);
		
		 setBlockToTree(w, x + 1, y + 2, z - 1,Plant.FCleaves);
		 setBlockToTree(w, x + 2, y + 2, z - 1,fruit);
		 setBlockToTree(w, x - 1, y + 2, z - 1,Plant.FCleaves);
		 setBlockToTree(w, x - 2, y + 2, z - 1,Plant.FCleaves);
		
		 setBlockToTree(w, x + 1, y + 2, z - 2,Plant.FCleaves);
		 setBlockToTree(w, x + 2, y + 2, z - 2,Plant.FCleaves);
		 setBlockToTree(w, x - 1, y + 2, z - 2,Plant.FCleaves);
		 setBlockToTree(w, x - 2, y + 2, z - 2,fruit);
		 
		//上层
	
		 setBlockToTree(w, x + 1, y + 3, z,Plant.FCleaves);
		 setBlockToTree(w, x + 2, y + 3, z,Plant.FCleaves);
		 setBlockToTree(w, x - 1, y + 3, z,Plant.FCleaves);
		 setBlockToTree(w, x - 2, y + 3, z,Plant.FCleaves);
		 
		 setBlockToTree(w, x, y + 3, z + 1,Plant.FCleaves);
		 setBlockToTree(w, x, y + 3, z + 2,Plant.FCleaves);
		 setBlockToTree(w, x, y + 3, z - 1,Plant.FCleaves);
		 setBlockToTree(w, x, y + 3, z - 2,fruit);
		 
		 setBlockToTree(w, x + 1, y + 3, z + 1,Plant.FCleaves);
		 setBlockToTree(w, x + 2, y + 3, z + 1,fruit);
		 setBlockToTree(w, x - 1, y + 3, z + 1,Plant.FCleaves);
		 setBlockToTree(w, x - 2, y + 3, z + 1,Plant.FCleaves);
		
		 setBlockToTree(w, x + 1, y + 3, z + 2,Plant.FCleaves);
		 setBlockToTree(w, x + 2, y + 3, z + 2,Plant.FCleaves);
		 setBlockToTree(w, x - 1, y + 3, z + 2,Plant.FCleaves);
		 setBlockToTree(w, x - 2, y + 3, z + 2,fruit);
		
		 setBlockToTree(w, x + 1, y + 3, z - 1,Plant.FCleaves);
		 setBlockToTree(w, x + 2, y + 3, z - 1,fruit);
		 setBlockToTree(w, x - 1, y + 3, z - 1,Plant.FCleaves);
		 setBlockToTree(w, x - 2, y + 3, z - 1,Plant.FCleaves);
		
		 setBlockToTree(w, x + 1, y + 3, z - 2,fruit);
		 setBlockToTree(w, x + 2, y + 3, z - 2,Plant.FCleaves);
		 setBlockToTree(w, x - 1, y + 3, z - 2,Plant.FCleaves);
		setBlockToTree(w, x - 2, y + 3, z - 2,Plant.FCleaves);

		
		setBlockToTree(w, x - 1, y + 4, z,Plant.FCleaves);
		setBlockToTree(w, x - 1, y + 5, z,Plant.FCleaves);
		setBlockToTree(w, x + 1, y + 4, z,Plant.FCleaves);
		setBlockToTree(w, x + 1, y + 5, z,Plant.FCleaves);
		setBlockToTree(w, x, y + 4, z + 1,Plant.FCleaves);
		setBlockToTree(w, x, y + 5, z + 1,Plant.FCleaves);
		setBlockToTree(w, x, y + 4, z - 1,Plant.FCleaves);
		setBlockToTree(w, x, y + 5, z - 1,Plant.FCleaves);
	}

	private void setBlockToTree(World w, int x, int y, int z, Block leaves) {
		if(w.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.air 
				|| w.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.leaves 
				|| w.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.leaves2
				|| w.getBlockState(new BlockPos(x, y, z)).getBlock() == Plant.FCleaves){
			w.setBlockState(new BlockPos(x, y, z),leaves.getDefaultState());
		}
	}
	private boolean isBlockAir(World w, int x, int y, int z){
		if(w.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.air 
				|| w.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.leaves 
				|| w.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.leaves2
				|| w.getBlockState(new BlockPos(x, y, z)).getBlock() == Plant.FCleaves){
			return true;
		}
		else{
		return false;
		}
	}
}