package com.cfyifei.gui.blocks;

import java.util.Random;












import com.cfyifei.FoodCraft;
import com.cfyifei.GuiIDs;
import com.cfyifei.gui.tileentities.TileEntityStove;

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

public class BlockStove extends BlockContainer {

	private boolean ifburn;
	private static boolean EE;
    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	
	public BlockStove(boolean ifb) {
		super(Material.rock);
		this.setHardness(3f);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(Block.soundTypeStone);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		if(!ifb) {
			this.setUnlocalizedName("Zl");
			this.setCreativeTab(FoodCraft.FcTabJiqi);
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
	
	@Override
    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
        this.setDefaultFacing(worldIn, pos, state);
    }

   
    private void setDefaultFacing(World worldIn, BlockPos pos, IBlockState state) {
        if (!worldIn.isRemote) {
            Block block = worldIn.getBlockState(pos.north()).getBlock();
            Block block1 = worldIn.getBlockState(pos.south()).getBlock();
            Block block2 = worldIn.getBlockState(pos.west()).getBlock();
            Block block3 = worldIn.getBlockState(pos.east()).getBlock();
            EnumFacing enumfacing = (EnumFacing)state.getValue(FACING);

            if (enumfacing == EnumFacing.NORTH && block.isFullBlock() && !block1.isFullBlock()) {
                enumfacing = EnumFacing.SOUTH;
            }
            else if (enumfacing == EnumFacing.SOUTH && block1.isFullBlock() && !block.isFullBlock()) {
                enumfacing = EnumFacing.NORTH;
            }
            else if (enumfacing == EnumFacing.WEST && block2.isFullBlock() && !block3.isFullBlock()) {
                enumfacing = EnumFacing.EAST;
            }
            else if (enumfacing == EnumFacing.EAST && block3.isFullBlock() && !block2.isFullBlock()) {
                enumfacing = EnumFacing.WEST;
            }
            worldIn.setBlockState(pos, state.withProperty(FACING, enumfacing), 2);
        }
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
    
    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }

    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        worldIn.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing().getOpposite()), 2);
    }

    public boolean hasComparatorInputOverride() {
        return true;
    }
    
    public int getComparatorInputOverride(World worldIn, BlockPos pos) {
        return Container.calcRedstone(worldIn.getTileEntity(pos));
    }
    
    public int getRenderType() {
        return 3;
    }
    
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(FoodcraftGuiBlocks.Zl);
    }

    @SideOnly(Side.CLIENT)
    public Item getItem(World worldIn, BlockPos pos) {
    	return Item.getItemFromBlock(FoodcraftGuiBlocks.Zl);
    }

    @SideOnly(Side.CLIENT)
    public IBlockState getStateForEntityRender(IBlockState state) {
    	return this.getDefaultState().withProperty(FACING, EnumFacing.SOUTH);
    }

    public IBlockState getStateFromMeta(int meta) {
    	EnumFacing enumfacing = EnumFacing.getFront(meta);
    	if (enumfacing.getAxis() == EnumFacing.Axis.Y) {
    		enumfacing = EnumFacing.NORTH;
    	}
    return this.getDefaultState().withProperty(FACING, enumfacing);
    }


    public int getMetaFromState(IBlockState state) {
    	return ((EnumFacing)state.getValue(FACING)).getIndex();
    }

    protected BlockState createBlockState() {
    	return new BlockState(this, new IProperty[] {FACING});
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