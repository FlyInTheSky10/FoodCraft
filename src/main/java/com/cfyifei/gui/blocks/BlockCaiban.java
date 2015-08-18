package com.cfyifei.gui.blocks;

import java.util.Random;

import com.cfyifei.FoodCraft;
import com.cfyifei.GuiIDs;
import com.cfyifei.gui.tileentitys.TileEntityCaiban;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockCaiban extends BlockContainer {
	private final Random Random = new Random();
	public BlockCaiban(Material Material) {
		super(Material.rock);
		this.setHardness(3.0f);
		this.setBlockBounds(0F, 0F, 0F, 1F, 0.15F, 1F);
	}
		@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityCaiban();
	}
		
		@Override
	public int getRenderType() {
		return -1;
	}
	        
	    @Override
	public boolean isOpaqueCube() {
	    return false;
	}
	        
	public boolean renderAsNormalBlock() {
		return false;
	}
	        

	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		return Item.getItemFromBlock(ModGui.Caiban);
	}
	
	@SideOnly(Side.CLIENT)
	public Item getItem(World w, int x, int y, int z) {
		return Item.getItemFromBlock(ModGui.Caiban);
	}
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
		ItemStack stack = playerIn.inventory.mainInventory[playerIn.inventory.currentItem];
		playerIn.openGui(FoodCraft.instance, GuiIDs.GUI_Caiban, worldIn,pos.getX(), pos.getY(), pos.getZ());
		return true;
	}
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
		TileEntity tileentity = worldIn.getTileEntity(pos);
		if (tileentity instanceof TileEntityCaiban) {
				InventoryHelper.dropInventoryItems(worldIn, pos, (TileEntityCaiban)tileentity);
				worldIn.updateComparatorOutputLevel(pos, this);
		}
		super.breakBlock(worldIn, pos, state);
	}
}