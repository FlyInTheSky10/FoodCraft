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
	public static Block YZJ;
	public static Block lit_YZJ;
	public static Block Nt;
	public static Block lit_Nt;
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
		
		Nt = new BlockNt(false);
		Nt.setBlockName("Nt");
		Nt.setHarvestLevel("pickaxe", 2);
		Nt.setHardness(3f);
		Nt.setStepSound(Block.soundTypeWood);
		Nt.setCreativeTab(FoodCraft.FcTab);

		
		
		YZJ = new BlockYZJ(false);
		YZJ.setBlockName("YZJ");
		YZJ.setHarvestLevel("pickaxe", 2);
		YZJ.setHardness(3f);
		YZJ.setStepSound(Block.soundTypeStone);
		YZJ.setCreativeTab(FoodCraft.FcTab);

		lit_YZJ = new BlockYZJ(true);
		lit_YZJ.setBlockName("litYZJ");
		lit_YZJ.setHarvestLevel("pickaxe", 2);
		lit_YZJ.setHardness(3f);
		lit_YZJ.setStepSound(Block.soundTypeStone);
		lit_YZJ.setLightLevel(0.875F);
		
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
		Caiban.setStepSound(Block.soundTypeWood);
		Caiban.setBlockTextureName("foodcraft:pdg_");
		Caiban.setCreativeTab(FoodCraft.FcTab);
		GameRegistry.registerBlock(lit_Nmj,"lit_Milling machine");
		GameRegistry.registerBlock(Nmj,"Milling machine");
		GameRegistry.registerBlock(lit_YZJ,"litYZJ");
		GameRegistry.registerBlock(YZJ,"YZJ");
		GameRegistry.registerBlock(Nt,"Nt");
		GameRegistry.registerBlock(PDG,"PDG");
		GameRegistry.registerBlock(Guo,"Guo");
		GameRegistry.registerBlock(Gyg,"Gyg");
		GameRegistry.registerBlock(Caiban,"Caiban");

		
		 GameRegistry.registerTileEntity(TileEntityNmj.class, "TileEntityNmj");
		 GameRegistry.registerTileEntity(TileEntityPDG.class, "TileEntityPDG");
		 GameRegistry.registerTileEntity(TileEntityGuo.class, "TileEntityGuo");
		 GameRegistry.registerTileEntity(TileEntityGyg.class, "TileEntityGyg");
		 GameRegistry.registerTileEntity(TileEntityCaiban.class, "TileEntityCaiban");
		 GameRegistry.registerTileEntity(TileEntityYZJ.class, "TileEntityYZJ");
		 GameRegistry.registerTileEntity(TileEntityNt.class, "TileEntityNt");
	}


	

	
}
