package com.cfyifei.block;

import com.cfyifei.item.ModItem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.Random;

public class BlockCong extends Block implements IPlantable {

    public BlockCong() {
        super(Material.plants);
        float f = 0.375F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
        this.setTickRandomly(true);//�����������
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World w, int x, int y, int z, Random random) {
        if (w.getBlock(x, y - 1, z) == ModBlocks.BlockCong || this.canstay(w, x, y, z))//�������ķ����Ǵз���
        {
            if (w.isAirBlock(x, y + 1, z))//������淽��Ϊ����
            {
                int l;//����int l

                for (l = 1; w.getBlock(x, y - l, z) == this; ++l)//��������ж����ٸ��з���
                {
                    ;
                }

                if (l < 3)//���С��3��
                {
                    int i1 = w.getBlockMetadata(x, y, z);//���Ԫ����

                    if (i1 == 15)//���Ԫ����=15
                    {
                        w.setBlock(x, y + 1, z, this);//��
                        w.setBlockMetadataWithNotify(x, y, z, 0, 4);//����Ԫ����Ϊ0
                    } else {
                        w.setBlockMetadataWithNotify(x, y, z, i1 + 1, 4);//Ԫ����+1
                    }
                }
            }
        }
    }

    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    public boolean canPlaceBlockAt(World World, int x, int y, int z) {
        Block block = World.getBlock(x, y - 1, z);
        return block.canSustainPlant(World, x, y - 1, z, ForgeDirection.UP, this);
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor Block
     */
    public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_) {
        //this.canstay(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_);
    }

    protected final boolean canstay(World World, int x, int y, int z) {
        if (!this.canBlockStay(World, x, y, z))//������鲻����ס
        {
            //ɾ������
            this.dropBlockAsItem(World, x, y, z, World.getBlockMetadata(x, y, z), 0);
            World.setBlockToAir(x, y, z);
            return false;
        } else//�����������ס
        {
            return true;//������
        }
    }

    /**
     * Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
     */
    public boolean canBlockStay(World World, int x, int y, int z) {
        return this.canPlaceBlockAt(World, x, y, z);
    }

    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_) {
        return null;
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return ModItem.ItemCong;
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube() {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock() {
        return false;
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType() {
        return 1;
    }

    /**
     * Gets an item for the block being called on. Args: world, x, y, z
     */
    @SideOnly(Side.CLIENT)
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_) {
        return ModItem.ItemCong;
    }

    /**
     * Returns a integer with hex for 0xrrggbb with this color multiplied against the blocks color. Note only called
     * when first determining what to render.
     */
    @SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess p_149720_1_, int p_149720_2_, int p_149720_3_, int p_149720_4_) {
        return p_149720_1_.getBiomeGenForCoords(p_149720_2_, p_149720_4_).getBiomeGrassColor(p_149720_2_, p_149720_3_, p_149720_4_);
    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
        return EnumPlantType.Plains;
    }

    @Override
    public Block getPlant(IBlockAccess world, int x, int y, int z) {
        return this;
    }

    @Override
    public int getPlantMetadata(IBlockAccess world, int x, int y, int z) {
        return world.getBlockMetadata(x, y, z);
    }
}