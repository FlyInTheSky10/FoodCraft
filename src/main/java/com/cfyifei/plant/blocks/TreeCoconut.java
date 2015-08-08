package com.cfyifei.plant.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

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
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenCanopyTree;
import net.minecraft.world.gen.feature.WorldGenForest;
import net.minecraft.world.gen.feature.WorldGenMegaJungle;
import net.minecraft.world.gen.feature.WorldGenMegaPineTree;
import net.minecraft.world.gen.feature.WorldGenSavannaTree;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.oredict.OreDictionary;

public class TreeCoconut extends BlockBush {

    public static IIcon[] IIcon = new IIcon[1];
    public Block fruit;

    public TreeCoconut(Block fruit) {
	this.fruit = fruit;
	float f = 0.4F;
	this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
	this.setCreativeTab(FoodCraft.FcTabZhiwu);
    }

    @Override
    public boolean onBlockActivated(World w, int x, int y,
	    int z, EntityPlayer par5EntityPlayer, int par6, float par7,
	    float par8, float par9) {
	ItemStack stack = par5EntityPlayer.inventory.mainInventory[par5EntityPlayer.inventory.currentItem];
	if (stack != null) {
	    if (stack.getItem() == ModItem.ItemJinkela) {
		if (canGlow(w, x, y, z)) {
		    glowTree(w, x, y, z);
		}
		--stack.stackSize;
		if (stack.stackSize <= 0) {
		    stack = null;
		}
	    }
	}
	return true;
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World w, int x, int y, int z, Random random) {
	if (!w.isRemote) {
	    super.updateTick(w, x, y, z, random);
	    //���ȴ��ڵ���9
	    if (w.getBlockLightValue(x, y + 1, z) >= 9 && random.nextInt(7) == 0) {

		if (canGlow(w, x, y, z)) {
		    glowTree(w, x, y, z);
		}

	    }
	}
    }

    public boolean canGlow(World w, int x, int y, int z) {
	if (isBlockAir(w, x, y + 1, z)
		&& isBlockAir(w, x, y + 2, z)
		&& isBlockAir(w, x, y + 3, z)
		&& isBlockAir(w, x, y + 4, z)
		&& isBlockAir(w, x, y + 5, z)
		&& isBlockAir(w, x, y + 6, z)
		&& isBlockAir(w, x, y + 7, z)
		&& isBlockAir(w, x - 1, y + 6, z)
		&& isBlockAir(w, x - 1, y + 7, z)
		&& isBlockAir(w, x + 1, y + 6, z)
		&& isBlockAir(w, x + 1, y + 7, z)
		&& isBlockAir(w, x, y + 6, z - 1)
		&& isBlockAir(w, x, y + 7, z - 1)
		&& isBlockAir(w, x, y + 6, z + 1)
		&& isBlockAir(w, x, y + 7, z + 1)
		&& isBlockAir(w, x - 2, y + 6, z)
		&& isBlockAir(w, x - 3, y + 6, z)
		&& isBlockAir(w, x - 3, y + 5, z)
		&& isBlockAir(w, x - 4, y + 5, z)
		&& isBlockAir(w, x + 2, y + 6, z)
		&& isBlockAir(w, x + 3, y + 6, z)
		&& isBlockAir(w, x + 3, y + 5, z)
		&& isBlockAir(w, x + 4, y + 5, z)
		&& isBlockAir(w, x, y + 6, z - 2)
		&& isBlockAir(w, x, y + 6, z - 3)
		&& isBlockAir(w, x, y + 5, z - 3)
		&& isBlockAir(w, x, y + 5, z - 4)
		&& isBlockAir(w, x, y + 6, z + 2)
		&& isBlockAir(w, x, y + 6, z + 3)
		&& isBlockAir(w, x, y + 5, z + 3)
		&& isBlockAir(w, x, y + 5, z + 4)
		&& isBlockAir(w, x, y + 5, z + 1)
		&& isBlockAir(w, x, y + 5, z - 1)
		&& isBlockAir(w, x + 1, y + 5, z)
		&& isBlockAir(w, x - 1, y + 5, z)) {
	    return true;
	} else {
	    return false;
	}
    }

    private void glowTree(World w, int x, int y, int z) {
	w.setBlockToAir(x, y, z);
	//��
	setBlockToTree(w, x, y, z, Blocks.log);
	setBlockToTree(w, x, y + 1, z, Blocks.log);
	setBlockToTree(w, x, y + 2, z, Blocks.log);
	setBlockToTree(w, x, y + 3, z, Blocks.log);
	setBlockToTree(w, x, y + 4, z, Blocks.log);
	setBlockToTree(w, x, y + 5, z, Blocks.log);
	setBlockToTree(w, x, y + 6, z, Blocks.leaves);
	setBlockToTree(w, x, y + 7, z, Blocks.leaves);

	//-x
	setBlockToTree(w, x - 1, y + 6, z, Blocks.leaves);
	setBlockToTree(w, x - 1, y + 7, z, Blocks.leaves);
	//+x
	setBlockToTree(w, x + 1, y + 6, z, Blocks.leaves);
	setBlockToTree(w, x + 1, y + 7, z, Blocks.leaves);
	//-z
	setBlockToTree(w, x, y + 6, z - 1, Blocks.leaves);
	setBlockToTree(w, x, y + 7, z - 1, Blocks.leaves);
	//+z
	setBlockToTree(w, x, y + 6, z + 1, Blocks.leaves);
	setBlockToTree(w, x, y + 7, z + 1, Blocks.leaves);

	//-x leaves
	setBlockToTree(w, x - 2, y + 6, z, Blocks.leaves);
	setBlockToTree(w, x - 3, y + 6, z, Blocks.leaves);
	setBlockToTree(w, x - 3, y + 5, z, Blocks.leaves);
	setBlockToTree(w, x - 4, y + 5, z, Blocks.leaves);
	//+x leaves
	setBlockToTree(w, x + 2, y + 6, z, Blocks.leaves);
	setBlockToTree(w, x + 3, y + 6, z, Blocks.leaves);
	setBlockToTree(w, x + 3, y + 5, z, Blocks.leaves);
	setBlockToTree(w, x + 4, y + 5, z, Blocks.leaves);

	//-z leaves
	setBlockToTree(w, x, y + 6, z - 2, Blocks.leaves);
	setBlockToTree(w, x, y + 6, z - 3, Blocks.leaves);
	setBlockToTree(w, x, y + 5, z - 3, Blocks.leaves);
	setBlockToTree(w, x, y + 5, z - 4, Blocks.leaves);
	//+z leaves
	setBlockToTree(w, x, y + 6, z + 2, Blocks.leaves);
	setBlockToTree(w, x, y + 6, z + 3, Blocks.leaves);
	setBlockToTree(w, x, y + 5, z + 3, Blocks.leaves);
	setBlockToTree(w, x, y + 5, z + 4, Blocks.leaves);

	//fruit
	setBlockToFruit(w, x, y + 5, z + 1, fruit);
	setBlockToFruit(w, x, y + 5, z - 1, fruit);
	setBlockToFruit(w, x + 1, y + 5, z, fruit);
	setBlockToFruit(w, x - 1, y + 5, z, fruit);
    }

    private void setBlockToTree(World w, int x, int y, int z, Block leaves) {
	if (w.getBlock(x, y, z) == Blocks.air
		|| w.getBlock(x, y, z) == Blocks.leaves
		|| w.getBlock(x, y, z) == Blocks.leaves2
		|| w.getBlock(x, y, z) == Plant.FCleaves) {
	    w.setBlock(x, y, z, leaves, 3, 4);
	}
    }

    private void setBlockToFruit(World w, int x, int y, int z, Block leaves) {
	if (w.getBlock(x, y, z) == Blocks.air
		|| w.getBlock(x, y, z) == Blocks.leaves
		|| w.getBlock(x, y, z) == Blocks.leaves2
		|| w.getBlock(x, y, z) == Plant.FCleaves) {
	    w.setBlock(x, y, z, leaves);
	}
    }

    private boolean isBlockAir(World w, int x, int y, int z) {
	if (w.getBlock(x, y, z) == Blocks.air
		|| w.getBlock(x, y, z) == Blocks.leaves
		|| w.getBlock(x, y, z) == Blocks.leaves2
		|| w.getBlock(x, y, z) == Plant.FCleaves) {
	    return true;
	} else {
	    return false;
	}
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
    public IIcon getIcon(int par1, int par2) {
	return IIcon[0];
    }

    public void registerBlockIcons(IIconRegister par1) {

	IIcon[0] = par1.registerIcon("foodcraft:BlockYezishu");

    }
}
