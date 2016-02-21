package com.foodcraft.gui.blocks;

import java.util.Random;














import com.foodcraft.FoodCraft;
import com.foodcraft.GuiIDs;
import com.foodcraft.gui.tileentities.TileEntityStove;
import com.foodcraft.init.FoodcraftGuiBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.tileentity.TileEntityPiston;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockStove extends GUIBlockFoodcraft {

	private boolean ifburn;
	private static boolean EE;

	public BlockStove(boolean ifb) {
		this.setHardness(3f);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(Block.soundTypeStone);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		if(!ifb) {
			this.setUnlocalizedName("Zl");
			this.setCreativeTab(FoodCraft.FcTabMachine);
			GameRegistry.registerBlock(this,"Zl");
		}
		else {
			this.setUnlocalizedName("litZl");
			this.setLightLevel(0.875F);
			GameRegistry.registerBlock(this,"lit_Zl");
		}
		ifburn = ifb;
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityStove();
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ){
		ItemStack stack = playerIn.inventory.mainInventory[playerIn.inventory.currentItem];
		playerIn.openGui(FoodCraft.instance, GuiIDs.GUI_Zl, worldIn, pos.getX(), pos.getY(), pos.getZ());
        return true;
	}

    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
        if (!EE) {
            TileEntity tileentity = worldIn.getTileEntity(pos);

            if (tileentity instanceof TileEntityStove) {
                InventoryHelper.dropInventoryItems(worldIn, pos, (TileEntityStove)tileentity);
                worldIn.updateComparatorOutputLevel(pos, this);
            }
        }
        super.breakBlock(worldIn, pos, state);
    }
    
    
    public static void setState(boolean active, World worldIn, BlockPos pos) {
        IBlockState iblockstate = worldIn.getBlockState(pos);
        TileEntity tileentity = worldIn.getTileEntity(pos);
        EE = true;

        if (active) {
            worldIn.setBlockState(pos, FoodcraftGuiBlocks.lit_Zl.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
            worldIn.setBlockState(pos, FoodcraftGuiBlocks.lit_Zl.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
        }
        else {
            worldIn.setBlockState(pos, FoodcraftGuiBlocks.Zl.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
            worldIn.setBlockState(pos, FoodcraftGuiBlocks.Zl.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
        }
        EE = false;
        if (tileentity != null) {
            tileentity.validate();
            worldIn.setTileEntity(pos, tileentity);
        }
    }
    
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(FoodcraftGuiBlocks.Zl);
    }

    @SideOnly(Side.CLIENT)
    public Item getItem(World worldIn, BlockPos pos) {
    	return Item.getItemFromBlock(FoodcraftGuiBlocks.Zl);
    }

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World w, BlockPos pos, IBlockState state, Random rand) {
    	int x = pos.getX();
    	int y = pos.getY();
    	int z = pos.getZ();
    	if (this.ifburn) {
    		if (rand.nextInt(24) == 0) {
    		w.playSound((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), "fire.fire", 1.0F + rand.nextFloat(), rand.nextFloat() * 0.7F + 0.3F, false);
    		}
    	w.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, (double)(x + 0.25F), (double)(y + 1.2F), (double)(z + 0.25F), 0.0D, 0.0D, 0.0D);
        w.spawnParticle(EnumParticleTypes.FLAME, (double)(x + 0.25F), (double)(y + 1.2F), (double)(z + 0.25F), 0.0D, 0.0D, 0.0D);
        
    	w.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, (double)(x + 0.5F), (double)(y + 1.2F), (double)(z + 0.25F), 0.0D, 0.0D, 0.0D);
        w.spawnParticle(EnumParticleTypes.FLAME, (double)(x + 0.5F), (double)(y + 1.2F), (double)(z + 0.25F), 0.0D, 0.0D, 0.0D);
        
    	w.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, (double)(x + 0.75F), (double)(y + 1.2F), (double)(z + 0.25F), 0.0D, 0.0D, 0.0D);
        w.spawnParticle(EnumParticleTypes.FLAME, (double)(x + 0.75F), (double)(y + 1.2F), (double)(z + 0.25F), 0.0D, 0.0D, 0.0D);
        
    	w.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, (double)(x + 0.25F), (double)(y + 1.2F), (double)(z + 0.5F), 0.0D, 0.0D, 0.0D);
        w.spawnParticle(EnumParticleTypes.FLAME, (double)(x + 0.25F), (double)(y + 1.2F), (double)(z + 0.5F), 0.0D, 0.0D, 0.0D);
        
    	w.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, (double)(x + 0.5F), (double)(y + 1.2F), (double)(z + 0.5F), 0.0D, 0.0D, 0.0D);
        w.spawnParticle(EnumParticleTypes.FLAME, (double)(x + 0.5F), (double)(y + 1.2F), (double)(z + 0.5F), 0.0D, 0.0D, 0.0D);
        
    	w.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, (double)(x + 0.75F), (double)(y + 1.2F), (double)(z + 0.5F), 0.0D, 0.0D, 0.0D);
        w.spawnParticle(EnumParticleTypes.FLAME, (double)(x + 0.75F), (double)(y + 1.2F), (double)(z + 0.5F), 0.0D, 0.0D, 0.0D);
        
    	w.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, (double)(x + 0.25F), (double)(y + 1.2F), (double)(z + 0.75F), 0.0D, 0.0D, 0.0D);
        w.spawnParticle(EnumParticleTypes.FLAME, (double)(x + 0.25F), (double)(y + 1.2F), (double)(z + 0.75F), 0.0D, 0.0D, 0.0D);
        
    	w.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, (double)(x + 0.5F), (double)(y + 1.2F), (double)(z + 0.75F), 0.0D, 0.0D, 0.0D);
        w.spawnParticle(EnumParticleTypes.FLAME, (double)(x + 0.5F), (double)(y + 1.2F), (double)(z + 0.75F), 0.0D, 0.0D, 0.0D);
        
    	w.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, (double)(x + 0.75F), (double)(y + 1.2F), (double)(z + 0.75F), 0.0D, 0.0D, 0.0D);
        w.spawnParticle(EnumParticleTypes.FLAME, (double)(x + 0.75F), (double)(y + 1.2F), (double)(z + 0.75F), 0.0D, 0.0D, 0.0D);
    	}
    }
}