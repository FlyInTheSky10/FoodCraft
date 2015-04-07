package com.cfyifei.block;

import com.cfyifei.FoodCraft;
import com.cfyifei.gui.blocks.BlockNmj;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ModBlocks {
	static public Block BlockShuidao,BlockDouzi,BlockHuashen,BlockWaike,BlockLuhuo,BlockShucai,BlockFanqie,BlockLajiao;
	public static Block BlockPutao;
	public static Block BlockQiezi;


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
		
		GameRegistry.registerBlock(BlockDouzi,"BlockDouzi");
		GameRegistry.registerBlock(BlockShuidao,"BlockShuidao");
		GameRegistry.registerBlock(BlockHuashen,"BlockHuashen");
		GameRegistry.registerBlock(BlockFanqie,"BlockFanqie");
		GameRegistry.registerBlock(BlockLajiao,"BlockLajiao");
		GameRegistry.registerBlock(BlockShucai,"BlockShucai");
		GameRegistry.registerBlock(BlockPutao,"BlockPutao");
		GameRegistry.registerBlock(BlockQiezi,"BlockQiezi");
		
		GameRegistry.registerBlock(BlockWaike,"BlockWaike");
	}
}
