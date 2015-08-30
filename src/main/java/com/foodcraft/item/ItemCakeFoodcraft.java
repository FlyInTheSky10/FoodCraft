package com.foodcraft.item;

import java.util.List;

import com.foodcraft.FoodCraft;
import com.foodcraft.init.FoodcraftBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemCakeFoodcraft extends Item {
	
	private String[] names = new String[]{"ItemPutaoDG","ItemJinputaoDG","ItemLiDG","ItemTaoziDG","ItemJuziDG","ItemNingmengDG","ItemCaomeiDG","ItemYeziDG"};
	private Block[] blocks = new Block[]{FoodcraftBlocks.BlockPutaoDG,FoodcraftBlocks.BlockJinputaoDG,FoodcraftBlocks.BlockLiDG,FoodcraftBlocks.BlockTaoziDG,FoodcraftBlocks.BlockJuziDG,FoodcraftBlocks.BlockNingmengDG,FoodcraftBlocks.BlockCaomeiDG,FoodcraftBlocks.BlockYeziDG};
	
	public ItemCakeFoodcraft() {
		this.setHasSubtypes(true);
		this.setUnlocalizedName("ItemDangao");
		this.setCreativeTab(FoodCraft.FcTabSnack);
	}

    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack) {
        return stack.getItemDamage() == 1;
    }
    
 @SideOnly(Side.CLIENT)
    public void getSubItems(Item Item, CreativeTabs Tabs, List list) {
	 	list.add(new ItemStack(Item, 1, 0));
	 	list.add(new ItemStack(Item, 1, 1));
	 	list.add(new ItemStack(Item, 1, 2));
	 	list.add(new ItemStack(Item, 1, 3));
	 	list.add(new ItemStack(Item, 1, 4));
	 	list.add(new ItemStack(Item, 1, 5));
        list.add(new ItemStack(Item, 1, 6));
        list.add(new ItemStack(Item, 1, 7));
    }
 
    public String getUnlocalizedName(ItemStack is1) {
    	 return names[is1.getItemDamage()];
    }
    
    public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {
        IBlockState iblockstate = worldIn.getBlockState(pos);
        Block block = iblockstate.getBlock();

        if (block == Blocks.snow_layer && ((Integer)iblockstate.getValue(BlockSnow.LAYERS)).intValue() < 1) {
            side = EnumFacing.UP;
        }
        else if (!block.isReplaceable(worldIn, pos)) {
            pos = pos.offset(side);
        }

        if (!playerIn.canPlayerEdit(pos, side, stack)) {
            return false;
        }
        else if (stack.stackSize == 0) {
            return false;
        }
        else {
            if (worldIn.canBlockBePlaced(blocks[stack.getItemDamage()], pos, false, side, (Entity)null, stack)) {
                IBlockState iblockstate1 = this.blocks[stack.getItemDamage()].onBlockPlaced(worldIn, pos, side, hitX, hitY, hitZ, 0, playerIn);

                if (worldIn.setBlockState(pos, iblockstate1, 3)) {
                    iblockstate1 = worldIn.getBlockState(pos);

                    if (iblockstate1.getBlock() == this.blocks[stack.getItemDamage()]) {
                        ItemBlock.setTileEntityNBT(worldIn, pos, stack);
                        iblockstate1.getBlock().onBlockPlacedBy(worldIn, pos, iblockstate1, playerIn, stack);
                    }

                    worldIn.playSoundEffect((double)((float)pos.getX() + 0.5F), (double)((float)pos.getY() + 0.5F), (double)((float)pos.getZ() + 0.5F), this.blocks[stack.getItemDamage()].stepSound.getPlaceSound(), (this.blocks[stack.getItemDamage()].stepSound.getVolume() + 1.0F) / 2.0F, this.blocks[stack.getItemDamage()].stepSound.getFrequency() * 0.8F);
                    --stack.stackSize;
                    return true;
                }
            }
            return false;
        }
    }
}
