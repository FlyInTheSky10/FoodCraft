package com.cfyifei.gui.blocks;

import com.cfyifei.FoodCraft;
import com.cfyifei.GuiID;
import com.cfyifei.block.ModBlocks;
import com.cfyifei.config.NERConfigHandler;
import com.cfyifei.gui.tileentities.TileEntityGyg;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import java.util.Random;

public class BlockGYG extends BlockContainer {
    private final Random Random = new Random();

    public BlockGYG(Material Material) {
        super(Material.rock);
        this.setHardness(3.0f);
        //this.setBlockBounds(0F, 0F, 0F, 1F, 0.3F, 1F);
    }


    @Override
    public TileEntity createNewTileEntity(World var1, int var2) {
        return new TileEntityGyg();
    }

    @Override
    public int getRenderType() {
        return -1;
    }

    //It's not an opaque cube, so you need this.
    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    //It's not a normal block, so you need this too.
    public boolean renderAsNormalBlock() {
        return false;
    }

    //This is the icon to use for showing the block in your hand.
    public void registerIcons(IIconRegister icon) {
        this.blockIcon = icon.registerIcon("foodcraft:textures/blocks/gyg.png");
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return NERConfigHandler.booleanwrench ?
                Item.getItemFromBlock(ModBlocks.BlockWaike) : Item.getItemFromBlock(ModGui.Gyg);

    }

    @SideOnly(Side.CLIENT)
    public Item getItem(World w, int x, int y, int z) {
        return Item.getItemFromBlock(ModGui.Gyg);
    }

    @Override
    public boolean onBlockActivated(World par1World, int par2, int par3,
                                    int par4, EntityPlayer par5EntityPlayer, int par6, float par7,
                                    float par8, float par9) {
        ItemStack stack = par5EntityPlayer.inventory.mainInventory[par5EntityPlayer.inventory.currentItem];
        par5EntityPlayer.openGui(FoodCraft.instance, GuiID.GUI_Gyg, par1World, par2, par3, par4);
        return true;
    }

    public void breakBlock(World World, int x, int y, int z, Block Block, int var1) {

        TileEntityGyg tileentity = (TileEntityGyg) World.getTileEntity(x, y, z);

        if (tileentity != null) {
            for (int i1 = 0; i1 < tileentity.getSizeInventory(); ++i1) {
                ItemStack itemstack = tileentity.getStackInSlot(i1);

                if (itemstack != null) {
                    float f = this.Random.nextFloat() * 0.8F + 0.1F;
                    float f1 = this.Random.nextFloat() * 0.8F + 0.1F;
                    float f2 = this.Random.nextFloat() * 0.8F + 0.1F;

                    while (itemstack.stackSize > 0) {
                        int j1 = this.Random.nextInt(21) + 10;

                        if (j1 > itemstack.stackSize) {
                            j1 = itemstack.stackSize;
                        }

                        itemstack.stackSize -= j1;
                        EntityItem entityitem = new EntityItem(World, (double) ((float) x + f), (double) ((float) y + f1), (double) ((float) z + f2), new ItemStack(itemstack.getItem(), j1, itemstack.getMetadata()));

                        if (itemstack.hasTagCompound()) {
                            entityitem.getEntityItem().setTagCompound((NBTTagCompound) itemstack.getTagCompound().copy());
                        }

                        float f3 = 0.05F;
                        entityitem.motionX = (double) ((float) this.Random.nextGaussian() * f3);
                        entityitem.motionY = (double) ((float) this.Random.nextGaussian() * f3 + 0.2F);
                        entityitem.motionZ = (double) ((float) this.Random.nextGaussian() * f3);
                        World.spawnEntityInWorld(entityitem);
                    }
                }
            }

            World.updateNeighborsAboutBlockChange(x, y, z, Block);
        }


        super.breakBlock(World, x, y, z, Block, var1);
    }
}

