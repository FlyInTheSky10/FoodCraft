package com.cfyifei.block;

import com.cfyifei.FoodCraft;
import com.cfyifei.gui.blocks.*;
import com.cfyifei.item.ModItem;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	static public Block BlockShuidao,BlockDouzi,BlockHuashen,BlockWaike,BlockLuhuo,BlockShucai,BlockFanqie,BlockLajiao,BlockPutao,BlockQiezi,Blocksugar,
	BlockDami,BlockHuashenk,BlockLuobo,BlockTudou,BlockYan,BlockDouzik,BlockRuomi,BlockDouban,BlockQiaokeli,BlockCong,BlockQingjiao,BlockHongdou,BlockLvdou,
	BlockHongshu,BlockBailuobo,BlockYumi,BlockHuanggua,BlockCaomei,BlockNuodao,BlockPutaoDG,BlockJinputaoDG,BlockLiDG,BlockTaoziDG,BlockJuziDG,BlockNingmengDG,
	BlockCaomeiDG,BlockYeziDG;
	public static void init() {
		
		BlockQingjiao = new BlockFoodcraftCrops("foodcraft:ItemQingjiaozhong","foodcraft:ItemQingjiao");
		BlockQingjiao.setUnlocalizedName("BlockQingjiao");
		BlockQingjiao.setHarvestLevel("pickaxe", -1);
		BlockQingjiao.setStepSound(Block.soundTypeGrass);
		
		BlockHongdou = new BlockFoodcraftCrops("foodcraft:ItemHongdou","foodcraft:ItemHongdou");
		BlockHongdou.setUnlocalizedName("BlockHongdou");
		BlockHongdou.setHarvestLevel("pickaxe", -1);
		BlockHongdou.setStepSound(Block.soundTypeGrass);
		
		BlockHongshu = new BlockFoodcraftCrops("foodcraft:ItemHongshu","foodcraft:ItemHongshu");
		BlockHongshu.setUnlocalizedName("BlockHongshu");
		BlockHongshu.setHarvestLevel("pickaxe", -1);
		BlockHongshu.setStepSound(Block.soundTypeGrass);
		
		
		BlockLvdou = new BlockFoodcraftCrops("foodcraft:ItemLvdou","foodcraft:ItemLvdou");
		BlockLvdou.setUnlocalizedName("BlockLvdou");
		BlockLvdou.setHarvestLevel("pickaxe", -1);
		BlockLvdou.setStepSound(Block.soundTypeGrass);
		
		BlockBailuobo = new BlockFoodcraftCrops("foodcraft:ItemBailuobo","foodcraft:ItemBailuobo");
		BlockBailuobo.setUnlocalizedName("BlockBailuobo");
		BlockBailuobo.setHarvestLevel("pickaxe", -1);
		BlockBailuobo.setStepSound(Block.soundTypeGrass);
		
		BlockYumi = new BlockFoodcraftCrops("foodcraft:ItemYumizhong","foodcraft:ItemYumi");
		BlockYumi.setUnlocalizedName("BlockYumi");
		BlockYumi.setHarvestLevel("pickaxe", -1);
		BlockYumi.setStepSound(Block.soundTypeGrass);
		
		BlockHuanggua = new BlockFoodcraftCrops("foodcraft:ItemHuangguazhong","foodcraft:ItemHuanggua");
		BlockHuanggua.setUnlocalizedName("BlockHuanggua");
		BlockHuanggua.setHarvestLevel("pickaxe", -1);
		BlockHuanggua.setStepSound(Block.soundTypeGrass);
		
		BlockCaomei = new BlockFoodcraftCrops("foodcraft:ItemCaomei","foodcraft:ItemCaomei");
		BlockCaomei.setUnlocalizedName("BlockCaomei");
		BlockCaomei.setHarvestLevel("pickaxe", -1);
		BlockCaomei.setStepSound(Block.soundTypeGrass);
		
		BlockNuodao = new BlockFoodcraftCrops("foodcraft:ItemNuomi","foodcraft:ItemNuomi");
		BlockNuodao.setUnlocalizedName("BlockNuodao");
		BlockNuodao.setHarvestLevel("pickaxe", -1);
		BlockNuodao.setStepSound(Block.soundTypeGrass);
		
		BlockShuidao = new BlockFoodcraftCrops("foodcraft:ItemDami","foodcraft:ItemDami");
		BlockShuidao.setUnlocalizedName("BlockShuidao");
		BlockShuidao.setHarvestLevel("pickaxe", -1);
		BlockShuidao.setStepSound(Block.soundTypeGrass);
		
		BlockDouzi = new BlockFoodcraftCrops("foodcraft:ItemDouzi","foodcraft:ItemDouzi");
		BlockDouzi.setUnlocalizedName("BlockDouzi");
		BlockDouzi.setHarvestLevel("pickaxe", -1);
		BlockDouzi.setStepSound(Block.soundTypeGrass);

		BlockHuashen = new BlockFoodcraftCrops("foodcraft:ItemHuashen","foodcraft:ItemHuashen");
		BlockHuashen.setUnlocalizedName("BlockHuashen");
		BlockHuashen.setHarvestLevel("pickaxe", -1);
		BlockHuashen.setStepSound(Block.soundTypeGrass);
		
		BlockShucai = new BlockFoodcraftCrops("foodcraft:ItemShucaizhong","foodcraft:ItemShucai");
		BlockShucai.setUnlocalizedName("BlockShucai");
		BlockShucai.setHarvestLevel("pickaxe", -1);
		BlockShucai.setStepSound(Block.soundTypeGrass);
		
		BlockLajiao = new BlockFoodcraftCrops("foodcraft:ItemLajiaozhong","foodcraft:ItemLajiao");
		BlockLajiao.setUnlocalizedName("BlockLajiao");
		BlockLajiao.setHarvestLevel("pickaxe", -1);
		BlockLajiao.setStepSound(Block.soundTypeGrass);
		
		BlockFanqie = new BlockFoodcraftCrops("foodcraft:ItemFanqiezhong","foodcraft:ItemFanqie");
		BlockFanqie.setUnlocalizedName("BlockFanqie");
		BlockFanqie.setHarvestLevel("pickaxe", -1);
		BlockFanqie.setStepSound(Block.soundTypeGrass);

		BlockWaike = new BlockKB(Material.rock);
		BlockWaike.setUnlocalizedName("BlockWaike");
		BlockWaike.setHarvestLevel("pickaxe", 1);
		BlockWaike.setCreativeTab(FoodCraft.FcTabJiqi);
		BlockWaike.setStepSound(Block.soundTypeStone);

		BlockQiezi = new BlockFoodcraftCrops("foodcraft:ItemQiezizhong","foodcraft:ItemQiezi");
		BlockQiezi.setUnlocalizedName("BlockQiezi");
		BlockQiezi.setHarvestLevel("pickaxe", -1);
		BlockQiezi.setStepSound(Block.soundTypeGrass);
		
		BlockPutao = new BlockFoodcraftCrops("foodcraft:ItemPutaozhong","foodcraft:ItemPutao");
		BlockPutao.setUnlocalizedName("BlockPutao");
		BlockPutao.setHarvestLevel("pickaxe", -1);
		BlockPutao.setStepSound(Block.soundTypeGrass);
		
	
		Blocksugar = new BlockKB(Material.grass).setUnlocalizedName("Blocksugar")//.setBlockTextureName("FoodCraft:blocksugar")
				.setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTabJiqi);
	
		BlockDami = new BlockKB(Material.grass).setUnlocalizedName("BlockDami")//.setBlockTextureName("FoodCraft:blockdami")
				.setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTabJiqi);
		
		BlockHuashenk = new BlockKB(Material.grass).setUnlocalizedName("BlockHuashenk")//.setBlockTextureName("FoodCraft:blockhuashenk")
				.setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTabJiqi);
		
		BlockLuobo = new BlockKB(Material.grass).setUnlocalizedName("BlockLuobo")//.setBlockTextureName("FoodCraft:blockluobo")
				.setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTabJiqi);
		
		BlockTudou = new BlockKB(Material.grass).setUnlocalizedName("BlockTudou")//.setBlockTextureName("FoodCraft:blocktudou")
				.setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTabJiqi);
		
		BlockYan = new BlockKB(Material.grass).setUnlocalizedName("BlockYan")//.setBlockTextureName("FoodCraft:blockyan")
				.setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTabJiqi);
		
		BlockDouzik = new BlockKB(Material.grass).setUnlocalizedName("BlockDouzik")//.setBlockTextureName("FoodCraft:blockdouzik")
				.setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTabJiqi);
		
		BlockRuomi = new BlockKB(Material.grass).setUnlocalizedName("BlockRuomi")//.setBlockTextureName("FoodCraft:blockruomi")
				.setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTabJiqi);
		
		BlockDouban = new BlockKB(Material.grass).setUnlocalizedName("BlockDouban")//.setBlockTextureName("FoodCraft:blockdouban")
				.setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTabJiqi);
		
		BlockQiaokeli = new BlockKB(Material.grass).setUnlocalizedName("BlockQiaokeli")//.setBlockTextureName("FoodCraft:blockqiaokeli")
				.setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTabJiqi);

		BlockPutaoDG = new BlockDangao().setHardness(0.5F).setStepSound(Block.soundTypeCloth).setUnlocalizedName("BlockPutaoDG");//.setBlockTextureName("FoodCraft:BlockPutaoDG");
		BlockJinputaoDG = new BlockJinputaoDG().setHardness(0.5F).setStepSound(Block.soundTypeCloth).setUnlocalizedName("BlockJinputaoDG");//.setBlockTextureName("FoodCraft:BlockJinputaoDG");
		BlockLiDG = new BlockDangao().setHardness(0.5F).setStepSound(Block.soundTypeCloth).setUnlocalizedName("BlockLiDG");//.setBlockTextureName("FoodCraft:BlockLiDG");
		BlockTaoziDG = new BlockDangao().setHardness(0.5F).setStepSound(Block.soundTypeCloth).setUnlocalizedName("BlockTaoziDG");//.setBlockTextureName("FoodCraft:BlockTaoziDG");
		BlockJuziDG = new BlockDangao().setHardness(0.5F).setStepSound(Block.soundTypeCloth).setUnlocalizedName("BlockJuziDG");//.setBlockTextureName("FoodCraft:BlockJuziDG");
		BlockNingmengDG = new BlockDangao().setHardness(0.5F).setStepSound(Block.soundTypeCloth).setUnlocalizedName("BlockNingmengDG");//.setBlockTextureName("FoodCraft:BlockNingmengDG");
		BlockCaomeiDG = new BlockDangao().setHardness(0.5F).setStepSound(Block.soundTypeCloth).setUnlocalizedName("BlockCaomeiDG");//.setBlockTextureName("FoodCraft:BlockCaomeiDG");
		BlockYeziDG = new BlockDangao().setHardness(0.5F).setStepSound(Block.soundTypeCloth).setUnlocalizedName("BlockYeziDG");//.setBlockTextureName("FoodCraft:BlockYeziDG");
		
		BlockCong = new BlockCong().setHardness(0.0F).setStepSound(Block.soundTypeGrass).setUnlocalizedName("BlockCong");
		GameRegistry.registerBlock(BlockDouzi,"BlockDouzi");
		GameRegistry.registerBlock(BlockShuidao,"BlockShuidao");
		GameRegistry.registerBlock(BlockHuashen,"BlockHuashen");
		GameRegistry.registerBlock(BlockFanqie,"BlockFanqie");
		GameRegistry.registerBlock(BlockLajiao,"BlockLajiao");
		GameRegistry.registerBlock(BlockShucai,"BlockShucai");
		GameRegistry.registerBlock(BlockPutao,"BlockPutao");
		GameRegistry.registerBlock(BlockQiezi,"BlockQiezi");
		GameRegistry.registerBlock(BlockQingjiao,"BlockQingjiao");
		GameRegistry.registerBlock(BlockHongdou,"BlockHongdou");
		GameRegistry.registerBlock(BlockLvdou,"BlockLvdou");
		GameRegistry.registerBlock(BlockHongshu,"BlockHongshu");
		GameRegistry.registerBlock(BlockBailuobo,"BlockBailuobo");
		GameRegistry.registerBlock(BlockYumi,"BlockYumi");
		GameRegistry.registerBlock(BlockHuanggua,"BlockHuanggua");
		GameRegistry.registerBlock(BlockCaomei,"BlockCaomei");
		GameRegistry.registerBlock(BlockNuodao,"BlockNuodao");
		
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
		GameRegistry.registerBlock(BlockCong,"BlockCong");	
	}
}
