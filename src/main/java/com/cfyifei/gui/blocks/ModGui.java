package com.cfyifei.gui.blocks;

import com.cfyifei.FoodCraft;
import com.cfyifei.gui.tileentitys.*;
import com.cfyifei.proxy.ClientProxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModGui {
	public static Block Nmj,lit_Nmj,PDG;
	public static Block Guo;
	public static Block Gyg;
	public static Block Caiban;
	
	public static void init() {
		Nmj = new BlockNmj(false);
		Nmj.setBlockName("Nmj");
		Nmj.setHarvestLevel("pickaxe", 2);
		Nmj.setHardness(3f);
		Nmj.setStepSound(Block.soundTypeStone);
		Nmj.setCreativeTab(FoodCraft.FcTab);

		lit_Nmj = new BlockNmj(true);
		lit_Nmj.setBlockName("litNmj");
		lit_Nmj.setHarvestLevel("pickaxe", 2);
		lit_Nmj.setHardness(3f);
		lit_Nmj.setStepSound(Block.soundTypeStone);
		lit_Nmj.setLightLevel(0.875F);
		
		PDG = new BlockPDG(Material.rock);
		PDG.setBlockName("PDG");
		PDG.setHarvestLevel("pickaxe", 2);
		PDG.setStepSound(Block.soundTypeStone);
		PDG.setBlockTextureName("foodcraft:pdg_");
		PDG.setCreativeTab(FoodCraft.FcTab);
		
		Guo = new BlockGuo(Material.rock);
		Guo.setBlockName("Guo");
		Guo.setHarvestLevel("pickaxe", 2);
		Guo.setStepSound(Block.soundTypeStone);
		Guo.setBlockTextureName("foodcraft:pdg_");
		Guo.setCreativeTab(FoodCraft.FcTab);

		Gyg = new BlockGYG(Material.rock);
		Gyg.setBlockName("Gyg");
		Gyg.setHarvestLevel("pickaxe", 2);
		Gyg.setStepSound(Block.soundTypeStone);
		Gyg.setBlockTextureName("foodcraft:pdg_");
		Gyg.setCreativeTab(FoodCraft.FcTab);
		
		Caiban = new BlockCaiban(Material.rock);
		Caiban.setBlockName("Caiban");
		Caiban.setHarvestLevel("pickaxe", 2);
		Caiban.setStepSound(Block.soundTypeStone);
		Caiban.setBlockTextureName("foodcraft:pdg_");
		Caiban.setCreativeTab(FoodCraft.FcTab);
		GameRegistry.registerBlock(lit_Nmj,"lit_Milling machine");
		GameRegistry.registerBlock(Nmj,"Milling machine");
		GameRegistry.registerBlock(PDG,"PDG");
		GameRegistry.registerBlock(Guo,"Guo");
		GameRegistry.registerBlock(Gyg,"Gyg");
		GameRegistry.registerBlock(Caiban,"Caiban");
		
		 GameRegistry.registerTileEntity(TileEntityNmj.class, "TileEntityNmj");
		 GameRegistry.registerTileEntity(TileEntityPDG.class, "TileEntityPDG");
		 GameRegistry.registerTileEntity(TileEntityGuo.class, "TileEntityGuo");
		 GameRegistry.registerTileEntity(TileEntityGyg.class, "TileEntityGyg");
		 GameRegistry.registerTileEntity(TileEntityCaiban.class, "TileEntity Caiban");
		
	}


	

	
}