package com.cfyifei.gui.blocks;

import java.util.Random;

import com.cfyifei.FoodCraft;
import com.cfyifei.GuiIDs;
import com.cfyifei.gui.items.ItemBlockPan;
import com.cfyifei.gui.tileentities.TileEntityPan;










import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
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
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockPan extends BlockContainer {
	
	public BlockPan() {
	super(Material.rock);
	this.setHardness(3.0f);
	this.setBlockBounds(0F, 0F, 0F, 1F, 0.3F, 1F);
	this.setUnlocalizedName("PDG");
	this.setHarvestLevel("pickaxe", 2);
	this.setStepSound(Block.soundTypeStone);
	this.setCreativeTab(FoodCraft.FcTabJiqi);
    this.setLightOpacity(0);
	GameRegistry.registerBlock(this,ItemBlockPan.class, "PDG");
	}
	
	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityPan();
	}
	        
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		return Item.getItemFromBlock(FoodcraftGuiBlocks.PDG);
	}
	
	@SideOnly(Side.CLIENT)
	public Item getItem(World w, int x, int y, int z) {
		return Item.getItemFromBlock(FoodcraftGuiBlocks.PDG);
	}
	
    public int getRenderType() {
        return 3;
    }
    
	public boolean isOpaqueCube() {
		return false;
	}
	
    public boolean isFullCube() {
        return false;
    }
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
	ItemStack stack = playerIn.inventory.mainInventory[playerIn.inventory.currentItem];
	playerIn.openGui(FoodCraft.instance, GuiIDs.GUI_PDG, worldIn,pos.getX(), pos.getY(), pos.getZ());
	return true;
	    	}
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
		TileEntity tileentity = worldIn.getTileEntity(pos);
	if (tileentity instanceof TileEntityPan) {
		InventoryHelper.dropInventoryItems(worldIn, pos, (TileEntityPan)tileentity);
		worldIn.updateComparatorOutputLevel(pos, this);
	}
	super.breakBlock(worldIn, pos, state);
	}
	
	   
	   
	public static int getFrequencyOfUse(ItemStack item) {
		if (item.getTagCompound() == null) item.setTagCompound(new NBTTagCompound());
		return item.getTagCompound().getInteger("frequencyOfUse");
	}
	    	 
	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)  {
	if (stack.getTagCompound() != null) {
		int xh = getFrequencyOfUse(stack);
		TileEntityPan tep = (TileEntityPan)worldIn.getTileEntity(pos);
		tep.frequencyOfUse = xh;
		}
	}
}

