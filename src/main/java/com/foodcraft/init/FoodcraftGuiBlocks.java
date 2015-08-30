package com.foodcraft.init;

import com.foodcraft.FoodCraft;
import com.foodcraft.gui.blocks.BlockBeverageMaking;
import com.foodcraft.gui.blocks.BlockBrewBarrel;
import com.foodcraft.gui.blocks.BlockChoppingBoard;
import com.foodcraft.gui.blocks.BlockFrying;
import com.foodcraft.gui.blocks.BlockMill;
import com.foodcraft.gui.blocks.BlockPan;
import com.foodcraft.gui.blocks.BlockPot;
import com.foodcraft.gui.blocks.BlockPressureCooker;
import com.foodcraft.gui.blocks.BlockStove;
import com.foodcraft.gui.items.ItemBlockPan;
import com.foodcraft.gui.items.ItemBlockPot;
import com.foodcraft.gui.tileentities.*;
import com.foodcraft.proxy.ClientProxy;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FoodcraftGuiBlocks { 
	
	public static Block Nmj,lit_Nmj,PDG,Guo,Gyg,Caiban,YZJ,lit_YZJ,Nt,lit_Nt,Zl,lit_Zl,Tpj,lit_Tpj;
	
	public static void init() {
		Nmj = new BlockMill(false);
		lit_Nmj = new BlockMill(true);
		YZJ = new BlockFrying(false);
		lit_YZJ = new BlockFrying(true);
		Zl = new BlockStove(false);
		lit_Zl = new BlockStove(true);
		Tpj = new BlockBeverageMaking(false);
		lit_Tpj = new BlockBeverageMaking(true);	
		Nt = new BlockBrewBarrel(false);
		PDG = new BlockPan();
		Guo = new BlockPot();
		Gyg = new BlockPressureCooker();
		Caiban = new BlockChoppingBoard();
	}
}