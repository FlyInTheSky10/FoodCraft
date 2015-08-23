package com.cfyifei.block;

import com.cfyifei.FoodCraft;
import com.cfyifei.gui.blocks.*;
import com.cfyifei.item.FoodcraftItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FoodcraftBlocks {

	static public Block BlockWaike,Blocksugar,BlockDami,BlockHuashenk,BlockLuobo,BlockTudou,BlockYan,BlockDouzik,BlockRuomi,BlockDouban,
	BlockQiaokeli,BlockPutaoDG,BlockJinputaoDG,BlockLiDG,BlockTaoziDG,BlockJuziDG,BlockNingmengDG,BlockCaomeiDG,BlockYeziDG;
	
	public static void init() {
		BlockWaike = new BlockFc(Material.rock, "BlockWaike").setStepSound(Block.soundTypeStone);BlockWaike.setHarvestLevel("pickaxe", 3);
		Blocksugar = new BlockFc(Material.grass, "Blocksugar").setHardness(0.5F).setStepSound(Block.soundTypeSnow);
		BlockDami = new BlockFc(Material.grass, "BlockDami").setHardness(0.5F).setStepSound(Block.soundTypeSnow);
		BlockHuashenk = new BlockFc(Material.grass,"BlockHuashenk").setHardness(0.5F).setStepSound(Block.soundTypeSnow);
		BlockLuobo = new BlockFc(Material.grass, "BlockLuobo").setHardness(0.5F).setStepSound(Block.soundTypeSnow);		
		BlockTudou = new BlockFc(Material.grass, "BlockTudou").setHardness(0.5F).setStepSound(Block.soundTypeSnow);	
		BlockYan = new BlockFc(Material.grass, "BlockYan").setHardness(0.5F).setStepSound(Block.soundTypeSnow);		
		BlockDouzik = new BlockFc(Material.grass, "BlockDouzik").setHardness(0.5F).setStepSound(Block.soundTypeSnow);	
		BlockRuomi = new BlockFc(Material.grass, "BlockRuomi").setHardness(0.5F).setStepSound(Block.soundTypeSnow);	
		BlockDouban = new BlockFc(Material.grass, "BlockDouban").setHardness(0.5F).setStepSound(Block.soundTypeSnow);
		BlockQiaokeli = new BlockFc(Material.grass, "BlockQiaokeli").setHardness(0.5F).setStepSound(Block.soundTypeSnow);
		BlockPutaoDG = new BlockCakeFoodcraft().setUnlocalizedName("BlockPutaoDG");
		BlockJinputaoDG = new BlockGoldenGrapeCake().setUnlocalizedName("BlockJinputaoDG");
		BlockLiDG = new BlockCakeFoodcraft().setUnlocalizedName("BlockLiDG");
		BlockTaoziDG = new BlockCakeFoodcraft().setUnlocalizedName("BlockTaoziDG");
		BlockJuziDG = new BlockCakeFoodcraft().setUnlocalizedName("BlockJuziDG");
		BlockNingmengDG = new BlockCakeFoodcraft().setUnlocalizedName("BlockNingmengDG");
		BlockCaomeiDG = new BlockCakeFoodcraft().setUnlocalizedName("BlockCaomeiDG");
		BlockYeziDG = new BlockCakeFoodcraft().setUnlocalizedName("BlockYeziDG");
		
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
		GameRegistry.registerBlock(BlockPutaoDG,"BlockPutaoDG");		
		GameRegistry.registerBlock(BlockJinputaoDG,"BlockJinputaoDG");	
		GameRegistry.registerBlock(BlockLiDG,"BlockLiDG");	
		GameRegistry.registerBlock(BlockTaoziDG,"BlockTaoziDG");	
		GameRegistry.registerBlock(BlockJuziDG,"BlockJuziDG");	
		GameRegistry.registerBlock(BlockNingmengDG,"BlockNingmengDG");	
		GameRegistry.registerBlock(BlockCaomeiDG,"BlockCaomeiDG");	
		GameRegistry.registerBlock(BlockYeziDG,"BlockYeziDG");	
	}
}
