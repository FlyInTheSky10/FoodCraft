package com.foodcraft.gui.blocks;

import java.util.Random;





















import com.foodcraft.FoodCraft;
import com.foodcraft.GuiIDs;
import com.foodcraft.gui.tileentities.TileEntityFrying;
import com.foodcraft.init.FoodcraftGuiBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockFrying extends BlockGuiFc {


    private boolean ifburn;
    private static boolean EE;

    public BlockFrying(boolean ifb) {
        this.setHardness(3f);
        this.setHarvestLevel("pickaxe", 2);
        this.setStepSound(Block.soundTypeStone);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        if(!ifb) {
            this.setUnlocalizedName("YZJ");
            this.setCreativeTab(FoodCraft.FcTabMachine);
            GameRegistry.registerBlock(this,"YZJ");
        } else {
            this.setUnlocalizedName("litYZJ");
            this.setLightLevel(0.875F);
            GameRegistry.registerBlock(this,"lit_YZJ");
        }
        ifburn = ifb;
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2) {
        return new TileEntityFrying();
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
        ItemStack stack = playerIn.inventory.mainInventory[playerIn.inventory.currentItem];
        playerIn.openGui(FoodCraft.instance, GuiIDs.GUI_YZJ, worldIn, pos.getX(), pos.getY(), pos.getZ());
        return true;
    }

    @Override
    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
        this.setDefaultFacing(worldIn, pos, state);
    }

    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
        if (!EE) {
            TileEntity tileentity = worldIn.getTileEntity(pos);
            if (tileentity instanceof TileEntityFrying) {
                InventoryHelper.dropInventoryItems(worldIn, pos, (TileEntityFrying)tileentity);
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
            worldIn.setBlockState(pos, FoodcraftGuiBlocks.lit_YZJ.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
            worldIn.setBlockState(pos, FoodcraftGuiBlocks.lit_YZJ.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
        } else {
            worldIn.setBlockState(pos, FoodcraftGuiBlocks.YZJ.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
            worldIn.setBlockState(pos, FoodcraftGuiBlocks.YZJ.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
        }
        EE = false;
        if (tileentity != null) {
            tileentity.validate();
            worldIn.setTileEntity(pos, tileentity);
        }
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(FoodcraftGuiBlocks.YZJ);
    }

    @SideOnly(Side.CLIENT)
    public Item getItem(World worldIn, BlockPos pos) {
        return Item.getItemFromBlock(FoodcraftGuiBlocks.YZJ);
    }
}