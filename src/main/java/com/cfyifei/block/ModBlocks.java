package com.cfyifei.block;

import com.cfyifei.FoodCraft;
import com.cfyifei.gui.blocks.*;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ModBlocks {
	static public Block BlockShuidao,BlockDouzi,BlockHuashen,BlockWaike,BlockLuhuo,BlockShucai,BlockFanqie,BlockLajiao;
	public static Block BlockPutao;
	public static Block BlockQiezi;
	public static Block Blocksugar,BlockDami,BlockHuashenk,BlockLuobo,
	BlockTudou,BlockYan,BlockDouzik,BlockRuomi,BlockDouban,BlockQiaokeli;


	public static void init() {
		
		BlockShuidao = new BlockShuiDao();
		BlockShuidao.setBlockName("BlockShuidao");
		BlockShuidao.setHarvestLevel("pickaxe", -1);
		BlockShuidao.setStepSound(Block.soundTypeGrass);
		
		BlockDouzi = new BlockDouzi();
		BlockDouzi.setBlockName("BlockDouzi");
		BlockDouzi.setHarvestLevel("pickaxe", -1);
		BlockDouzi.setStepSound(Block.soundTypeGrass);

		BlockHuashen = new BlockHuashen();
		BlockHuashen.setBlockName("BlockHuashen");
		BlockHuashen.setHarvestLevel("pickaxe", -1);
		BlockHuashen.setStepSound(Block.soundTypeGrass);
		
		BlockShucai = new BlockShucai();
		BlockShucai.setBlockName("BlockShucai");
		BlockShucai.setHarvestLevel("pickaxe", -1);
		BlockShucai.setStepSound(Block.soundTypeGrass);
		
		BlockLajiao = new BlockLajiao();
		BlockLajiao.setBlockName("BlockLajiao");
		BlockLajiao.setHarvestLevel("pickaxe", -1);
		BlockLajiao.setStepSound(Block.soundTypeGrass);
		
		BlockFanqie = new BlockFanqie();
		BlockFanqie.setBlockName("BlockFanqie");
		BlockFanqie.setHarvestLevel("pickaxe", -1);
		BlockFanqie.setStepSound(Block.soundTypeGrass);

		BlockWaike = new BlockKB(Material.rock);
		BlockWaike.setBlockName("BlockWaike");
		BlockWaike.setHarvestLevel("pickaxe", 1);
		BlockWaike.setCreativeTab(FoodCraft.FcTab);
		BlockWaike.setBlockTextureName("foodcraft:nmj_side");
		BlockWaike.setStepSound(Block.soundTypeStone);

		BlockQiezi = new BlockQiezi();
		BlockQiezi.setBlockName("BlockQiezi");
		BlockQiezi.setHarvestLevel("pickaxe", -1);
		BlockQiezi.setStepSound(Block.soundTypeGrass);
		
		BlockPutao = new BlockPutao();
		BlockPutao.setBlockName("BlockPutao");
		BlockPutao.setHarvestLevel("pickaxe", -1);
		BlockPutao.setStepSound(Block.soundTypeGrass);
	
		Blocksugar = new BlockKB(Material.grass).setBlockName("Blocksugar").setBlockTextureName("FoodCraft:blocksugar")
				.setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTab);
	
		BlockDami = new BlockKB(Material.grass).setBlockName("BlockDami").setBlockTextureName("FoodCraft:blockdami")
				.setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTab);
		
		BlockHuashenk = new BlockKB(Material.grass).setBlockName("BlockHuashenk").setBlockTextureName("FoodCraft:blockhuashenk")
				.setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTab);
		
		BlockLuobo = new BlockKB(Material.grass).setBlockName("BlockLuobo").setBlockTextureName("FoodCraft:blockluobo")
				.setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTab);
		
		BlockTudou = new BlockKB(Material.grass).setBlockName("BlockTudou").setBlockTextureName("FoodCraft:blocktudou")
				.setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTab);
		
		BlockYan = new BlockKB(Material.grass).setBlockName("BlockYan").setBlockTextureName("FoodCraft:blockyan")
				.setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTab);
		
		BlockDouzik = new BlockKB(Material.grass).setBlockName("BlockDouzik").setBlockTextureName("FoodCraft:blockdouzik")
				.setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTab);
		
		BlockRuomi = new BlockKB(Material.grass).setBlockName("BlockRuomi").setBlockTextureName("FoodCraft:blockruomi")
				.setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTab);
		
		BlockDouban = new BlockKB(Material.grass).setBlockName("BlockDouban").setBlockTextureName("FoodCraft:blockdouban")
				.setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTab);
		
		BlockQiaokeli = new BlockKB(Material.grass).setBlockName("BlockQiaokeli").setBlockTextureName("FoodCraft:blockqiaokeli")
				.setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTab);
		
		GameRegistry.registerBlock(BlockDouzi,"BlockDouzi");
		GameRegistry.registerBlock(BlockShuidao,"BlockShuidao");
		GameRegistry.registerBlock(BlockHuashen,"BlockHuashen");
		GameRegistry.registerBlock(BlockFanqie,"BlockFanqie");
		GameRegistry.registerBlock(BlockLajiao,"BlockLajiao");
		GameRegistry.registerBlock(BlockShucai,"BlockShucai");
		GameRegistry.registerBlock(BlockPutao,"BlockPutao");
		GameRegistry.registerBlock(BlockQiezi,"BlockQiezi");
		
		GameRegistry.registerBlock(Blocksugar,"Blocksugar");
		GameRegistry.registerBlock(BlockDami,"BlockDami");
		GameRegistry.registerBlock(BlockHuashenk,"BlockHuashenk");
		GameRegistry.registerBlock(BlockLuobo,"BlockLuobo");
		GameRegistry.registerBlock(BlockTudou,"BlockTudou");
		GameRegistry.registerBlock(BlockYan,"BlockYan");
		GameRegistry.registerBlock(BlockDouzik,"BlockDouzik");
		GameRegistry.registerBlock(BlockRuomi,"BlockRuomi");
		GameRegistry.registerBlock(BlockDouban,"BlockDouban");
		GameRegistry.registerBlock(BlockQiaokeli,"BlockQiaokeli");
		
		GameRegistry.registerBlock(BlockWaike,"BlockWaike");
	}
}
