package com.cfyifei.gui.blocks;

import com.cfyifei.FoodCraft;
import com.cfyifei.gui.item.ItemBlockGuo;
import com.cfyifei.gui.item.ItemBlockPDG;
import com.cfyifei.gui.tileentitys.*;
import com.cfyifei.proxy.ClientProxy;





import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModGui { 
	public static Block Nmj,lit_Nmj,PDG;
	public static Block Guo;
	public static Block Gyg;
	public static Block Caiban;
	public static Block YZJ;
	public static Block lit_YZJ;
	public static Block Nt;
	public static Block lit_Nt;
	public static Block Zl;
	public static Block lit_Zl;
	public static Block Tpj;
	public static Block lit_Tpj;
	public static void init() {
		Tpj = new BlockTpj(false);
		Tpj.setUnlocalizedName("Tpj");
		Tpj.setHarvestLevel("pickaxe", 2);
		Tpj.setHardness(3f);
		Tpj.setStepSound(Block.soundTypeStone);
		Tpj.setCreativeTab(FoodCraft.FcTabJiqi);

		lit_Tpj = new BlockTpj(true);
		lit_Tpj.setUnlocalizedName("litTpj");
		lit_Tpj.setHarvestLevel("pickaxe", 2);
		lit_Tpj.setHardness(3f);
		lit_Tpj.setStepSound(Block.soundTypeStone);
		lit_Tpj.setLightLevel(0.875F);
		
		Nmj = new BlockNmj(false);
		Nmj.setUnlocalizedName("Nmj");
		Nmj.setHarvestLevel("pickaxe", 2);
		Nmj.setHardness(3f);
		Nmj.setStepSound(Block.soundTypeStone);
		Nmj.setCreativeTab(FoodCraft.FcTabJiqi);

		lit_Nmj = new BlockNmj(true);
		lit_Nmj.setUnlocalizedName("litNmj");
		lit_Nmj.setHarvestLevel("pickaxe", 2);
		lit_Nmj.setHardness(3f);
		lit_Nmj.setStepSound(Block.soundTypeStone);
		lit_Nmj.setLightLevel(0.875F);
		
		Zl = new BlockZl(false);
		Zl.setUnlocalizedName("Zl");
		Zl.setHarvestLevel("pickaxe", 2);
		Zl.setHardness(3f);
		Zl.setStepSound(Block.soundTypeStone);
		Zl.setCreativeTab(FoodCraft.FcTabJiqi);

		lit_Zl = new BlockZl(true);
		lit_Zl.setUnlocalizedName("litZl");
		lit_Zl.setHarvestLevel("pickaxe", 2);
		lit_Zl.setHardness(3f);
		lit_Zl.setStepSound(Block.soundTypeStone);
		lit_Zl.setLightLevel(0.875F);
		
		Nt = new BlockNt(false);
		Nt.setUnlocalizedName("Nt");
		Nt.setHarvestLevel("pickaxe", 2);
		Nt.setHardness(3f);
		Nt.setStepSound(Block.soundTypeWood);
		Nt.setCreativeTab(FoodCraft.FcTabJiqi);

		YZJ = new BlockYZJ(false);
		YZJ.setUnlocalizedName("YZJ");
		YZJ.setHarvestLevel("pickaxe", 2);
		YZJ.setHardness(3f);
		YZJ.setStepSound(Block.soundTypeStone);
		YZJ.setCreativeTab(FoodCraft.FcTabJiqi);

		lit_YZJ = new BlockYZJ(true);
		lit_YZJ.setUnlocalizedName("litYZJ");
		lit_YZJ.setHarvestLevel("pickaxe", 2);
		lit_YZJ.setHardness(3f);
		lit_YZJ.setStepSound(Block.soundTypeStone);
		lit_YZJ.setLightLevel(0.875F);
		
		PDG = new BlockPDG(Material.rock);
		PDG.setUnlocalizedName("PDG");
		PDG.setHarvestLevel("pickaxe", 2);
		PDG.setStepSound(Block.soundTypeStone);
		PDG.setCreativeTab(FoodCraft.FcTabJiqi);
		
		Guo = new BlockGuo(Material.rock);
		Guo.setUnlocalizedName("Guo");
		Guo.setHarvestLevel("pickaxe", 2);
		Guo.setStepSound(Block.soundTypeStone);
		Guo.setCreativeTab(FoodCraft.FcTabJiqi);

		Gyg = new BlockGYG(Material.rock);
		Gyg.setUnlocalizedName("Gyg");
		Gyg.setHarvestLevel("pickaxe", 2);
		Gyg.setStepSound(Block.soundTypeStone);
		Gyg.setCreativeTab(FoodCraft.FcTabJiqi);
		
		Caiban = new BlockCaiban(Material.rock);
		Caiban.setUnlocalizedName("Caiban");
		Caiban.setHarvestLevel("pickaxe", 2);
		Caiban.setStepSound(Block.soundTypeWood);
		Caiban.setCreativeTab(FoodCraft.FcTabJiqi);
		
		GameRegistry.registerBlock(lit_Nmj,"lit_Nmj");
		GameRegistry.registerBlock(Nmj,"Nmj");
		GameRegistry.registerBlock(lit_YZJ,"lit_YZJ");
		GameRegistry.registerBlock(YZJ,"YZJ");
		GameRegistry.registerBlock(lit_Zl,"lit_Zl");
		GameRegistry.registerBlock(Zl,"Zl");
		GameRegistry.registerBlock(lit_Tpj,"lit_Tpj");
		GameRegistry.registerBlock(Tpj,"Tpj");
		GameRegistry.registerBlock(Nt,"Nt");
		GameRegistry.registerBlock(PDG,ItemBlockPDG.class, "PDG");
		GameRegistry.registerBlock(Guo,ItemBlockGuo.class,"Guo");
		GameRegistry.registerBlock(Gyg,"Gyg");
		GameRegistry.registerBlock(Caiban,"Caiban");

		
		 GameRegistry.registerTileEntity(TileEntityNmj.class, "TileEntityNmj");
		 GameRegistry.registerTileEntity(TileEntityPDG.class, "TileEntityPDG");
		 GameRegistry.registerTileEntity(TileEntityGuo.class, "TileEntityGuo");
		 GameRegistry.registerTileEntity(TileEntityGyg.class, "TileEntityGyg");
		 GameRegistry.registerTileEntity(TileEntityCaiban.class, "TileEntityCaiban");
		 GameRegistry.registerTileEntity(TileEntityYZJ.class, "TileEntityYZJ");
		 GameRegistry.registerTileEntity(TileEntityNt.class, "TileEntityNt");
		 GameRegistry.registerTileEntity(TileEntityZl.class, "TileEntityZl");
		 GameRegistry.registerTileEntity(TileEntityTpj.class, "TileEntityTpj");
	}


	

	
}
