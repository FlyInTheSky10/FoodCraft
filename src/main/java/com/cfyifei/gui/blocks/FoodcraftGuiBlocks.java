package com.cfyifei.gui.blocks;

import com.cfyifei.FoodCraft;
import com.cfyifei.gui.items.ItemBlockPan;
import com.cfyifei.gui.items.ItemBlockPot;
import com.cfyifei.gui.tileentities.*;
import com.cfyifei.proxy.ClientProxy;







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