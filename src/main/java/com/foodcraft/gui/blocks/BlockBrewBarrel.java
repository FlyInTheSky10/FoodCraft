package com.foodcraft.gui.blocks;

import java.util.Random;













import com.foodcraft.FoodCraft;
import com.foodcraft.GuiIDs;
import com.foodcraft.gui.tileentities.TileEntityBrewBarrel;
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

public class BlockBrewBarrel extends BlockGuiFc {

    private boolean ifburn;
    private static boolean EE;

    public BlockBrewBarrel(boolean E) {
        ifburn = E;
        this.setUnlocalizedName("Nt");
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(3f);
        this.setStepSound(Block.soundTypeWood);
        this.setCreativeTab(FoodCraft.FcTabMachine);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        GameRegistry.registerBlock(this,"Nt");
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2) {
        return new TileEntityBrewBarrel();
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
        ItemStack stack = playerIn.inventory.mainInventory[playerIn.inventory.currentItem];
        playerIn.openGui(FoodCraft.instance, GuiIDs.GUI_Nt, worldIn, pos.getX(), pos.getY(), pos.getZ());
        return true;
    }


    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
        if (!EE) {
            TileEntity tileentity = worldIn.getTileEntity(pos);
            if (tileentity instanceof TileEntityBrewBarrel) {
                InventoryHelper.dropInventoryItems(worldIn, pos, (TileEntityBrewBarrel)tileentity);
                worldIn.updateComparatorOutputLevel(pos, this);
            }
        }
        super.breakBlock(worldIn, pos, state);
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(FoodcraftGuiBlocks.Nt);
    }

    @SideOnly(Side.CLIENT)
    public Item getItem(World worldIn, BlockPos pos) {
        return Item.getItemFromBlock(FoodcraftGuiBlocks.Nt);
    }
}