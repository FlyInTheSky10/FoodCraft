package com.cfyifei.recipe;


import com.cfyifei.block.FoodcraftBlocks;
import com.cfyifei.gui.blocks.FoodcraftGuiBlocks;
import com.cfyifei.item.FoodcraftItems;
import com.cfyifei.plant.blocks.FoodcraftPlants;
import com.cfyifei.util.FoodcraftUtil;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class Recipe{
	public static void init() {
		Items.egg.setMaxStackSize(64);
		Items.snowball.setMaxStackSize(64);

	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemTiepian, 16), new Object[] {"###", "#X#","###", '#',Items.iron_ingot,'X',Blocks.stone});	
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemCaidao, 1), new Object[] {"## ", "## ","X  ", '#',FoodcraftItems.ItemTiepian,'X',Items.stick});
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemCaidaoHJ, 1), new Object[] {"## ", "## ","X  ", '#',Items.gold_ingot,'X',Items.stick});
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemCaidaoZS, 1), new Object[] {"## ", "## ","X  ", '#',Items.diamond,'X',Items.stick});
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemCaidaoLBS, 1), new Object[] {"## ", "## ","X  ", '#',Items.emerald,'X',Items.stick});
	
	FoodcraftUtil.removeRecipe(new ItemStack(Items.cake));
	FoodcraftUtil.removeRecipe(new ItemStack(Items.bread));
	FoodcraftUtil.removeRecipe(new ItemStack(Items.pumpkin_pie));
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemPisa), new Object[] {FoodcraftItems.ItemLaobing,Items.cooked_porkchop,Items.carrot,FoodcraftItems.ItemNainao,Blocks.brown_mushroom});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemJinghuashuitong), new Object[] {Items.bucket,Blocks.wool});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemHanbaobao), new Object[] {Items.bread,FoodcraftItems.ItemShucai,Items.cooked_porkchop,Items.bread});
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemYuebing, 1), new Object[] {"AAA", "XBX", "AAA", 'A', FoodcraftItems.ItemMianfen, 'B', FoodcraftItems.ItemDousha,'X',new ItemStack(Items.dye,1,11)});
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemYuebing, 1), new Object[] {"AAA", "XBX", "AAA", 'A', FoodcraftItems.ItemMianfen, 'B', Items.egg,'X',new ItemStack(Items.dye,1,11)});
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemNiangao, 1), new Object[] {"AAA", "ABA", "AAA", 'A', FoodcraftItems.ItemNuomifen,'B',FoodcraftItems.Itemfan});

	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemWrench, 1), new Object[] {"A A", " A ", " A ", 'A', Items.iron_ingot});
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemCiba, 1), new Object[] {"AAA", "ABA", "AAA", 'A', FoodcraftItems.ItemNuomifen, 'B', FoodcraftItems.Itemwater});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemAici), new Object[] {FoodcraftItems.ItemCiba,Blocks.leaves});
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemChangfen, 1), new Object[] {"AAA", "BBB", "CDE", 'A', FoodcraftItems.Itemfan, 'B', FoodcraftItems.Itemwater, 'C', FoodcraftItems.ItemCong, 'D', Items.cooked_porkchop, 'E', FoodcraftItems.ItemJiangyou});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemRegou), new Object[] {FoodcraftItems.ItemShucai,FoodcraftItems.ItemXiangchang,Items.bread});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemLabazhou), new Object[] {FoodcraftItems.ItemXifan,Items.wheat,FoodcraftItems.ItemHuashen,FoodcraftItems.Itemfan,FoodcraftItems.ItemDouzi,FoodcraftItems.ItemLarou,FoodcraftItems.ItemNuomi,FoodcraftItems.ItemLachang,Items.carrot});
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemMian, 1), new Object[] {"ABA", "ABA", "ABA", 'A', FoodcraftItems.ItemMianfen, 'B', FoodcraftItems.Itemwater});
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemGuoqiaomixian, 1), new Object[] {"ABA", "ABA", "ABA", 'A', FoodcraftItems.Itemfan, 'B', FoodcraftItems.Itemwater});
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemYifen, 1), new Object[] {"ABA", "ABA", "ABA", 'A', Items.wheat, 'B', FoodcraftItems.Itemwater});
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemMantou, 1), new Object[] {"AAA", "ABA", "AAA", 'A', FoodcraftItems.ItemMianfen, 'B', FoodcraftItems.Itemwater});
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemSuancaibing, 1), new Object[] {"AAA", "ABA", "AAA", 'A', FoodcraftItems.ItemMianfen, 'B', FoodcraftItems.ItemShucai});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemLatiao), new Object[] {FoodcraftItems.ItemDoufusi,FoodcraftItems.ItemLajiao});
	
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemLachang), new Object[] {FoodcraftItems.ItemXiangchang,FoodcraftItems.ItemLaweixunliao});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemLarou), new Object[] {Items.cooked_porkchop,FoodcraftItems.ItemLaweixunliao});
	
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemYifenpork), new Object[] {FoodcraftItems.ItemYifen,Items.cooked_porkchop});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemYifenchicken), new Object[] {FoodcraftItems.ItemYifen,Items.cooked_chicken});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemYifenbeef), new Object[] {FoodcraftItems.ItemYifen,Items.cooked_beef});
	
	GameRegistry.addRecipe(new ItemStack(Items.cake, 1), new Object[] {"AAA", "BEB", "CCC", 'A', Items.milk_bucket, 'B', Items.sugar, 'C', FoodcraftItems.ItemMianfen, 'E', Items.egg});
	GameRegistry.addRecipe(new ItemStack(Items.bread, 1), new Object[] {"AAA", 'A', FoodcraftItems.ItemMianfen});
	GameRegistry.addRecipe(new ItemStack(Items.pumpkin_pie, 1), new Object[] {"AAA", "BBB", "CCC", 'A', FoodcraftItems.ItemNuomifen,'B',Blocks.pumpkin,'C',Items.egg});
	GameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockWaike, 1), new Object[] {"AAA", "ABA", "AAA", 'A', FoodcraftItems.ItemHuashen,'B',Blocks.iron_block});
	GameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockWaike, 1), new Object[] {"AAA", "ABA", "AAA", 'A', FoodcraftItems.ItemDouzi,'B',Blocks.iron_block});
	GameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockWaike, 1), new Object[] {"AAA", "ABA", "AAA", 'A', FoodcraftItems.ItemDami,'B',Blocks.iron_block});
	GameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockWaike, 1), new Object[] {"AAA", "ABA", "AAA", 'A', Items.wheat,'B',Blocks.iron_block});

	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemDianluban, 1), new Object[] {"AAA", "CBC", "AAA", 'A', FoodcraftItems.ItemHuashen,'B',Items.iron_ingot,'C',Items.redstone});
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemDianluban, 1), new Object[] {"AAA", "CBC", "AAA", 'A', FoodcraftItems.ItemDouzi,'B',Items.iron_ingot,'C',Items.redstone});
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemDianluban, 1), new Object[] {"AAA", "CBC", "AAA", 'A', FoodcraftItems.ItemDami,'B',Items.iron_ingot,'C',Items.redstone});
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemDianluban, 1), new Object[] {"AAA", "CBC", "AAA", 'A', Items.wheat,'B',Items.iron_ingot,'C',Items.redstone});
	

	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemQiaokeli), new Object[] {FoodcraftItems.ItemQiaokelifen,Items.sugar});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemNuomi,2), new Object[] {FoodcraftItems.ItemNuomi,Items.bone});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemDouban,2), new Object[] {FoodcraftItems.ItemDouban,Items.bone});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemDoufugan), new Object[] {FoodcraftItems.ItemDoufu,FoodcraftItems.ItemJiangyou});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemDoufu), new Object[] {FoodcraftItems.ItemDoujiang,FoodcraftItems.ItemYan});

	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemChunjuan), new Object[] {FoodcraftItems.ItemDoufusi,FoodcraftItems.ItemLuobosi,FoodcraftItems.ItemShucai,Items.cooked_porkchop});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemAeljichifan), new Object[] {FoodcraftItems.ItemAeljichi,FoodcraftItems.ItemBaifan});
	
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemZongzi), new Object[] {FoodcraftItems.ItemNuomi,Items.cooked_porkchop,Items.string,FoodcraftItems.ItemZongye});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemNuomituan), new Object[] {FoodcraftItems.ItemNuomifen,FoodcraftItems.ItemNuomifen,FoodcraftItems.ItemNuomifen,FoodcraftItems.Itemwater});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemHuashentangyuanxian,1), new Object[] {FoodcraftItems.ItemHuashen,Items.sugar});
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftGuiBlocks.Nmj, 1), new Object[] {"AAA", "DBD", "ECE", 'A', Items.wheat,'B',FoodcraftBlocks.BlockWaike,'C',FoodcraftItems.ItemDianluban,'E',Items.milk_bucket,'D',Blocks.glass});
	GameRegistry.addRecipe(new ItemStack(FoodcraftGuiBlocks.PDG, 1), new Object[] {"AAA", "EBE", " C ", 'A', FoodcraftItems.ItemTiepian,'B',FoodcraftBlocks.BlockWaike,'C',FoodcraftItems.ItemDianluban,'E',new ItemStack(Items.dye)});
	GameRegistry.addRecipe(new ItemStack(FoodcraftGuiBlocks.Guo, 1), new Object[] {"AAA", "EBE", " C ", 'A', Items.iron_ingot,'B',FoodcraftBlocks.BlockWaike,'C',FoodcraftItems.ItemDianluban,'E',new ItemStack(Items.dye)});
	GameRegistry.addRecipe(new ItemStack(FoodcraftGuiBlocks.Gyg, 1), new Object[] {"AAA", "EBE", "XCX", 'A', Items.iron_ingot,'B',FoodcraftBlocks.BlockWaike,'C',FoodcraftItems.ItemDianluban,'E',new ItemStack(Items.dye),'X',new ItemStack(Items.dye,1,15)});
	GameRegistry.addRecipe(new ItemStack(FoodcraftGuiBlocks.Caiban, 1), new Object[] {"AAA", "ABA", "ACA", 'A', Blocks.planks,'B',FoodcraftItems.ItemCaidao,'C',FoodcraftBlocks.BlockWaike});
	GameRegistry.addRecipe(new ItemStack(FoodcraftGuiBlocks.YZJ, 1), new Object[] {"AAA", "DBD", "CCC", 'A', FoodcraftItems.ItemHuashenyou,'B',FoodcraftBlocks.BlockWaike,'C',FoodcraftItems.ItemDianluban,'D',Blocks.glass});
	GameRegistry.addRecipe(new ItemStack(FoodcraftGuiBlocks.Tpj, 1), new Object[] {"ABA", "CDC", " F ", 'A', Items.redstone,'B',Blocks.ice,'C',new ItemStack(Items.dye,1,3),'D',FoodcraftBlocks.BlockWaike,'F',FoodcraftItems.ItemDianluban});
	GameRegistry.addRecipe(new ItemStack(FoodcraftGuiBlocks.Nt, 1), new Object[] {"ABA", "CDC", "ABA", 'A', Blocks.planks,'B',FoodcraftItems.ItemDianluban,'C',new ItemStack(Items.dye,1,3),'D',FoodcraftBlocks.BlockWaike});
	GameRegistry.addRecipe(new ItemStack(FoodcraftGuiBlocks.Zl, 1), new Object[] {"ABA", "CDC", "FBF", 'A', Items.flint_and_steel,'B',FoodcraftItems.ItemDianluban,'C',new ItemStack(Items.dye,1,3),'D',FoodcraftBlocks.BlockWaike,'F',Items.redstone});
	
	GameRegistry.addSmelting(new ItemStack(FoodcraftItems.ItemYouyurou), new ItemStack(FoodcraftItems.ItemShuyouyurou), 0.5f);	
	GameRegistry.addSmelting(new ItemStack(FoodcraftItems.ItemYumi), new ItemStack(FoodcraftItems.ItemKaoyumi), 0.5f);
	GameRegistry.addSmelting(new ItemStack(FoodcraftItems.ItemHongshu), new ItemStack(FoodcraftItems.ItemKaohongshu), 0.5f);
	GameRegistry.addSmelting(new ItemStack(FoodcraftItems.Itemwater), new ItemStack(FoodcraftItems.ItemYan, 2), 0.5f);
	
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemNainao, 1), new Object[] {Items.milk_bucket});
	
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemMianpi, 2), new Object[] {FoodcraftItems.ItemMianfen,FoodcraftItems.ItemMianfen,FoodcraftItems.ItemMianfen,FoodcraftItems.Itemwater});
	
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemJiaozi), new Object[] {FoodcraftItems.ItemJiaozixian,FoodcraftItems.ItemMianpi});
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemJinputao, 1), new Object[] {"AAA", "ABA", "AAA", 'A', Blocks.gold_block,'B', FoodcraftItems.ItemPutao});
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.Blocksugar, 1), new Object[] {"AAA", "AAA", "AAA", 'A', Items.sugar});
	GameRegistry.addShapelessRecipe(new ItemStack(Items.sugar,9), new Object[] {FoodcraftBlocks.Blocksugar});
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockDami, 1), new Object[] {"AAA", "AAA", "AAA", 'A', FoodcraftItems.ItemDami});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemDami,9), new Object[] {FoodcraftBlocks.BlockDami});
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockHuashenk, 1), new Object[] {"AAA", "AAA", "AAA", 'A', FoodcraftItems.ItemHuashen});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemHuashen,9), new Object[] {FoodcraftBlocks.BlockHuashenk});
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockLuobo, 1), new Object[] {"AAA", "AAA", "AAA", 'A', Items.carrot});
	GameRegistry.addShapelessRecipe(new ItemStack(Items.carrot,9), new Object[] {FoodcraftBlocks.BlockLuobo});
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockTudou, 1), new Object[] {"AAA", "AAA", "AAA", 'A', Items.potato});
	GameRegistry.addShapelessRecipe(new ItemStack(Items.potato,9), new Object[] {FoodcraftBlocks.BlockTudou});
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockYan, 1), new Object[] {"AAA", "AAA", "AAA", 'A', FoodcraftItems.ItemYan});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemYan,9), new Object[] {FoodcraftBlocks.BlockYan});
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockDouzik, 1), new Object[] {"AAA", "AAA", "AAA", 'A', FoodcraftItems.ItemDouzi});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemDouzi,9), new Object[] {FoodcraftBlocks.BlockDouzik});
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockRuomi, 1), new Object[] {"AAA", "AAA", "AAA", 'A', FoodcraftItems.ItemNuomi});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemNuomi,9), new Object[] {FoodcraftBlocks.BlockRuomi});

	GameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockDouban, 1), new Object[] {"AAA", "AAA", "AAA", 'A', FoodcraftItems.ItemDouban});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemDouban,9), new Object[] {FoodcraftBlocks.BlockDouban});
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockQiaokeli, 1), new Object[] {"AAA", "AAA", "AAA", 'A', FoodcraftItems.ItemQiaokeli});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemQiaokeli,9), new Object[] {FoodcraftBlocks.BlockQiaokeli});
	
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemQiaokelinaiice), new Object[] {FoodcraftItems.ItemQiaokelinai,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemPutaozhiice), new Object[] {FoodcraftItems.ItemPutaozhi,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemPingguozhiice), new Object[] {FoodcraftItems.ItemPingguozhi,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemJinpingguozhiice), new Object[] {FoodcraftItems.ItemJinpingguozhi,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemJinputaozhiice), new Object[] {FoodcraftItems.ItemJinputaozhi,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemXiguazhiice), new Object[] {FoodcraftItems.ItemXiguazhi,Items.snowball});
	
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemLizhizhiice), new Object[] {FoodcraftItems.ItemLizhizhi,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemTaozizhiice), new Object[] {FoodcraftItems.ItemTaozizhi,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemJuzizhiice), new Object[] {FoodcraftItems.ItemJuzizhi,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemMangguozhiice), new Object[] {FoodcraftItems.ItemMangguozhi,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemNingmengzhiice), new Object[] {FoodcraftItems.ItemNingmengzhi,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemMuguazhiice), new Object[] {FoodcraftItems.ItemMuguazhi,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemCaomeizhiice), new Object[] {FoodcraftItems.ItemCaomeizhi,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemYezizhiice), new Object[] {FoodcraftItems.ItemYezizhi,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemXiangjiaozhiice), new Object[] {FoodcraftItems.ItemXiangjiaozhi,Items.snowball});
	
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemJinkela, 8), new Object[] {"AAA", "ABA", "AAA", 'A', new ItemStack(Items.dye,1,15),  'B', Items.gold_ingot});
	
	
	registerChestLoot(new ItemStack(FoodcraftItems.ItemDouban), 1, 1, 16);
	registerChestLoot(new ItemStack(FoodcraftItems.ItemZongye), 1, 10, 16);
	registerChestLoot(new ItemStack(FoodcraftItems.ItemKafei), 1, 1, 10);
	registerChestLoot(new ItemStack(FoodcraftItems.ItemGalikuai), 1, 10, 16);
	registerChestLoot(new ItemStack(FoodcraftItems.ItemHetaosu), 1, 10, 16);
	registerChestLoot(new ItemStack(FoodcraftItems.ItemXiangchang), 1, 10, 16);
	registerChestLoot(new ItemStack(FoodcraftItems.ItemLaweixunliao), 1, 10, 32);
	 for(int i1 = 0;i1 < 8;i1++){
		 GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemDangao,1,i1), new Object[] {new ItemStack(FoodcraftItems.ItemGuojiang,1,i1),Items.cake});
	 }
	 for(int i1 = 0;i1 < 8;i1++){
		 GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemBinggan,1,i1), new Object[] {FoodcraftItems.ItemBingganF, new ItemStack(FoodcraftItems.ItemGuojiang,1,i1),FoodcraftItems.ItemBingganF});
	 }
	 GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemBingganF,3,0), new Object[] {"AAA","BBB","AAA", 'A', FoodcraftItems.ItemMianfen, 'B' ,Items.egg});
	 GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemBingganXN,1,0), new Object[] {"AAA","ABA","AAA", 'A', FoodcraftItems.ItemMianfen,'B' ,Items.egg});
	 
	 GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemGuojiang,1,0), new Object[] {FoodcraftItems.Itemwater,FoodcraftItems.ItemPutao,Items.sugar});
	 GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemGuojiang,1,1), new Object[] {FoodcraftItems.Itemwater,FoodcraftItems.ItemJinputao,Items.sugar});
	 GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemGuojiang,1,2), new Object[] {FoodcraftItems.Itemwater,FoodcraftItems.ItemLi,Items.sugar});
	 GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemGuojiang,1,3), new Object[] {FoodcraftItems.Itemwater,FoodcraftItems.ItemTaozi,Items.sugar});
	 GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemGuojiang,1,4), new Object[] {FoodcraftItems.Itemwater,FoodcraftItems.ItemJuzi,Items.sugar});
	 GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemGuojiang,1,5), new Object[] {FoodcraftItems.Itemwater,FoodcraftItems.ItemNingmeng,Items.sugar});
	 GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemGuojiang,1,6), new Object[] {FoodcraftItems.Itemwater,FoodcraftItems.ItemCaomei,Items.sugar});
	 GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemGuojiang,1,7), new Object[] {FoodcraftItems.Itemwater,FoodcraftItems.ItemYezi,Items.sugar});
	 
	 GameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockLishu,2), new Object[] {" B ","BAB"," B ", 'A', Blocks.sapling, 'B', FoodcraftItems.ItemLi});
	 GameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockLizhishu,2), new Object[] {" B ","BAB"," B ", 'A', Blocks.sapling, 'B', FoodcraftItems.ItemLizhi});
	 GameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockTaozishu,2), new Object[] {" B ","BAB"," B ", 'A', Blocks.sapling, 'B', FoodcraftItems.ItemTaozi});
	 GameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockJuzishu,2), new Object[] {" B ","BAB"," B ", 'A', Blocks.sapling, 'B', FoodcraftItems.ItemJuzi});
	 GameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockPipashu,2), new Object[] {" B ","BAB"," B ", 'A', Blocks.sapling, 'B', FoodcraftItems.ItemPipa});
	 GameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockMangguoshu,2), new Object[] {" B ","BAB"," B ", 'A', Blocks.sapling, 'B', FoodcraftItems.ItemMangguo});
	 GameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockNingmengshu,2), new Object[] {" B ","BAB"," B ", 'A', Blocks.sapling, 'B', FoodcraftItems.ItemNingmeng});
	 GameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockYouzishu,2), new Object[] {" B ","BAB"," B ", 'A', Blocks.sapling, 'B', FoodcraftItems.ItemYouzi});
	 GameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockShizishu,2), new Object[] {" B ","BAB"," B ", 'A', Blocks.sapling, 'B', FoodcraftItems.ItemShizi});
	 GameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockMuguashu,2), new Object[] {" B ","BAB"," B ", 'A', Blocks.sapling, 'B', FoodcraftItems.ItemMugua});
	 GameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockShanzhashu,2), new Object[] {" B ","BAB"," B ", 'A', Blocks.sapling, 'B', FoodcraftItems.ItemShanzha});
	 GameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockLongyanshu,2), new Object[] {" B ","BAB"," B ", 'A', Blocks.sapling, 'B', FoodcraftItems.ItemLongyan});
	 GameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockShiliushu,2), new Object[] {" B ","BAB"," B ", 'A', Blocks.sapling, 'B', FoodcraftItems.ItemShiliu});
	 GameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockHongzaoshu,2), new Object[] {" B ","BAB"," B ", 'A', Blocks.sapling, 'B', FoodcraftItems.ItemHongzao});
	 GameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockYezishu,2), new Object[] {" B ","BAB"," B ", 'A', Blocks.sapling, 'B', FoodcraftItems.ItemYezi});
	 GameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockYingtaoshu,2), new Object[] {" B ","BAB"," B ", 'A', Blocks.sapling, 'B', FoodcraftItems.ItemYingtao});
	 GameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockXiangjiaoshu,2), new Object[] {" B ","BAB"," B ", 'A', Blocks.sapling, 'B', FoodcraftItems.ItemXiangjiao});
	}
    public static void registerChestLoot(ItemStack loot, int min, int max, int rarity) {
        ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST,
                new WeightedRandomChestContent(loot, min, max, rarity));
        ChestGenHooks.addItem(ChestGenHooks.MINESHAFT_CORRIDOR,
                new WeightedRandomChestContent(loot, min, max, rarity));
        ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_CORRIDOR,
                new WeightedRandomChestContent(loot, min, max, rarity));
        ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_CROSSING,
                new WeightedRandomChestContent(loot, min, max, rarity));
        ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_LIBRARY,
                new WeightedRandomChestContent(loot, min, max, rarity));
        ChestGenHooks.addItem(ChestGenHooks.PYRAMID_JUNGLE_CHEST,
                new WeightedRandomChestContent(loot, min, max, rarity));
    }
}