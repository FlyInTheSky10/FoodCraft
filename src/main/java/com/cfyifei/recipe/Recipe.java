package com.cfyifei.recipe;


import com.cfyifei.block.ModBlocks;
import com.cfyifei.gui.blocks.ModGui;
import com.cfyifei.item.ModItem;
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

	GameRegistry.addRecipe(new ItemStack(ModItem.ItemTiepian, 16), new Object[] {"###", "#X#","###", '#',Items.iron_ingot,'X',Blocks.stone});	
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemCaidao, 1), new Object[] {"## ", "## ","X  ", '#',ModItem.ItemTiepian,'X',Items.stick});
	
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemCaidaoHJ, 1), new Object[] {"## ", "## ","X  ", '#',Items.gold_ingot,'X',Items.stick});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemCaidaoZS, 1), new Object[] {"## ", "## ","X  ", '#',Items.diamond,'X',Items.stick});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemCaidaoLBS, 1), new Object[] {"## ", "## ","X  ", '#',Items.emerald,'X',Items.stick});
	
	FoodcraftUtil.removeAnyRecipe(new ItemStack(Items.cake));
	FoodcraftUtil.removeAnyRecipe(new ItemStack(Items.bread));
	FoodcraftUtil.removeAnyRecipe(new ItemStack(Items.pumpkin_pie));
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemPisa), new Object[] {ModItem.ItemLaobing,Items.cooked_porkchop,Items.carrot,ModItem.ItemNainao,Blocks.brown_mushroom});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemJinghuashuitong), new Object[] {Items.bucket,Blocks.wool});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemHanbaobao), new Object[] {Items.bread,ModItem.ItemShucai,Items.cooked_porkchop,Items.bread});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemYuebing, 1), new Object[] {"AAA", "XBX", "AAA", 'A', ModItem.ItemMianfen, 'B', ModItem.ItemDousha,'X',new ItemStack(Items.dye,1,11)});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemYuebing, 1), new Object[] {"AAA", "XBX", "AAA", 'A', ModItem.ItemMianfen, 'B', Items.egg,'X',new ItemStack(Items.dye,1,11)});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemNiangao, 1), new Object[] {"AAA", "ABA", "AAA", 'A', ModItem.ItemNuomifen,'B',ModItem.Itemfan});

	GameRegistry.addRecipe(new ItemStack(ModItem.ItemWrench, 1), new Object[] {"A A", " A ", " A ", 'A', Items.iron_ingot});
	
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemCiba, 1), new Object[] {"AAA", "ABA", "AAA", 'A', ModItem.ItemNuomifen, 'B', ModItem.Itemwater});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemAici), new Object[] {ModItem.ItemCiba,Blocks.leaves});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemChangfen, 1), new Object[] {"AAA", "BBB", "CDE", 'A', ModItem.Itemfan, 'B', ModItem.Itemwater, 'C', ModItem.ItemCong, 'D', Items.cooked_porkchop, 'E', ModItem.ItemJiangyou});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemRegou), new Object[] {ModItem.ItemShucai,ModItem.ItemXiangchang,Items.bread});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemLabazhou), new Object[] {ModItem.ItemXifan,Items.wheat,ModItem.ItemHuashen,ModItem.Itemfan,ModItem.ItemDouzi,ModItem.ItemLarou,ModItem.ItemNuomi,ModItem.ItemLachang,Items.carrot});
	
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemMian, 1), new Object[] {"ABA", "ABA", "ABA", 'A', ModItem.ItemMianfen, 'B', ModItem.Itemwater});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemGuoqiaomixian, 1), new Object[] {"ABA", "ABA", "ABA", 'A', ModItem.Itemfan, 'B', ModItem.Itemwater});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemYifen, 1), new Object[] {"ABA", "ABA", "ABA", 'A', Items.wheat, 'B', ModItem.Itemwater});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemMantou, 1), new Object[] {"AAA", "ABA", "AAA", 'A', ModItem.ItemMianfen, 'B', ModItem.Itemwater});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemSuancaibing, 1), new Object[] {"AAA", "ABA", "AAA", 'A', ModItem.ItemMianfen, 'B', ModItem.ItemShucai});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemLatiao), new Object[] {ModItem.ItemDoufusi,ModItem.ItemLajiao});
	
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemLachang), new Object[] {ModItem.ItemXiangchang,ModItem.ItemLaweixunliao});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemLarou), new Object[] {Items.cooked_porkchop,ModItem.ItemLaweixunliao});
	
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemYifenpork), new Object[] {ModItem.ItemYifen,Items.cooked_porkchop});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemYifenchicken), new Object[] {ModItem.ItemYifen,Items.cooked_chicken});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemYifenbeef), new Object[] {ModItem.ItemYifen,Items.cooked_beef});
	
	GameRegistry.addRecipe(new ItemStack(Items.cake, 1), new Object[] {"AAA", "BEB", "CCC", 'A', Items.milk_bucket, 'B', Items.sugar, 'C', ModItem.ItemMianfen, 'E', Items.egg});
	GameRegistry.addRecipe(new ItemStack(Items.bread, 1), new Object[] {"AAA", 'A', ModItem.ItemMianfen});
	GameRegistry.addRecipe(new ItemStack(Items.pumpkin_pie, 1), new Object[] {"AAA", "BBB", "CCC", 'A', ModItem.ItemNuomifen,'B',Blocks.pumpkin,'C',Items.egg});
	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockWaike, 1), new Object[] {"AAA", "ABA", "AAA", 'A', ModItem.ItemHuashen,'B',Blocks.iron_block});
	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockWaike, 1), new Object[] {"AAA", "ABA", "AAA", 'A', ModItem.ItemDouzi,'B',Blocks.iron_block});
	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockWaike, 1), new Object[] {"AAA", "ABA", "AAA", 'A', ModItem.ItemDami,'B',Blocks.iron_block});
	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockWaike, 1), new Object[] {"AAA", "ABA", "AAA", 'A', Items.wheat,'B',Blocks.iron_block});

	GameRegistry.addRecipe(new ItemStack(ModItem.ItemDianluban, 1), new Object[] {"AAA", "CBC", "AAA", 'A', ModItem.ItemHuashen,'B',Items.iron_ingot,'C',Items.redstone});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemDianluban, 1), new Object[] {"AAA", "CBC", "AAA", 'A', ModItem.ItemDouzi,'B',Items.iron_ingot,'C',Items.redstone});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemDianluban, 1), new Object[] {"AAA", "CBC", "AAA", 'A', ModItem.ItemDami,'B',Items.iron_ingot,'C',Items.redstone});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemDianluban, 1), new Object[] {"AAA", "CBC", "AAA", 'A', Items.wheat,'B',Items.iron_ingot,'C',Items.redstone});
	

	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemQiaokeli), new Object[] {ModItem.ItemQiaokelifen,Items.sugar});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemNuomi,2), new Object[] {ModItem.ItemNuomi,Items.bone});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemDouban,2), new Object[] {ModItem.ItemDouban,Items.bone});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemDoufugan), new Object[] {ModItem.ItemDoufu,ModItem.ItemJiangyou});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemDoufu), new Object[] {ModItem.ItemDoujiang,ModItem.ItemYan});

	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemChunjuan), new Object[] {ModItem.ItemDoufusi,ModItem.ItemLuobosi,ModItem.ItemShucai,Items.cooked_porkchop});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemAeljichifan), new Object[] {ModItem.ItemAeljichi,ModItem.ItemBaifan});
	
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemZongzi), new Object[] {ModItem.ItemNuomi,Items.cooked_porkchop,Items.string,ModItem.ItemZongye});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemNuomituan), new Object[] {ModItem.ItemNuomifen,ModItem.ItemNuomifen,ModItem.ItemNuomifen,ModItem.Itemwater});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemHuashentangyuanxian,1), new Object[] {ModItem.ItemHuashen,Items.sugar});
	
	GameRegistry.addRecipe(new ItemStack(ModGui.Nmj, 1), new Object[] {"AAA", "DBD", "ECE", 'A', Items.wheat,'B',ModBlocks.BlockWaike,'C',ModItem.ItemDianluban,'E',Items.milk_bucket,'D',Blocks.glass});
	GameRegistry.addRecipe(new ItemStack(ModGui.PDG, 1), new Object[] {"AAA", "EBE", " C ", 'A', ModItem.ItemTiepian,'B',ModBlocks.BlockWaike,'C',ModItem.ItemDianluban,'E',new ItemStack(Items.dye)});
	GameRegistry.addRecipe(new ItemStack(ModGui.Guo, 1), new Object[] {"AAA", "EBE", " C ", 'A', Items.iron_ingot,'B',ModBlocks.BlockWaike,'C',ModItem.ItemDianluban,'E',new ItemStack(Items.dye)});
	GameRegistry.addRecipe(new ItemStack(ModGui.Gyg, 1), new Object[] {"AAA", "EBE", "XCX", 'A', Items.iron_ingot,'B',ModBlocks.BlockWaike,'C',ModItem.ItemDianluban,'E',new ItemStack(Items.dye),'X',new ItemStack(Items.dye,1,15)});
	GameRegistry.addRecipe(new ItemStack(ModGui.Caiban, 1), new Object[] {"AAA", "ABA", "ACA", 'A', Blocks.planks,'B',ModItem.ItemCaidao,'C',ModBlocks.BlockWaike});
	GameRegistry.addRecipe(new ItemStack(ModGui.YZJ, 1), new Object[] {"AAA", "DBD", "CCC", 'A', ModItem.ItemHuashenyou,'B',ModBlocks.BlockWaike,'C',ModItem.ItemDianluban,'D',Blocks.glass});
	GameRegistry.addRecipe(new ItemStack(ModGui.Tpj, 1), new Object[] {"ABA", "CDC", " F ", 'A', Items.redstone,'B',Blocks.ice,'C',new ItemStack(Items.dye,1,3),'D',ModBlocks.BlockWaike,'F',ModItem.ItemDianluban});
	GameRegistry.addRecipe(new ItemStack(ModGui.Nt, 1), new Object[] {"ABA", "CDC", "ABA", 'A', Blocks.planks,'B',ModItem.ItemDianluban,'C',new ItemStack(Items.dye,1,3),'D',ModBlocks.BlockWaike});
	GameRegistry.addRecipe(new ItemStack(ModGui.Zl, 1), new Object[] {"ABA", "CDC", "FBF", 'A', Items.flint_and_steel,'B',ModItem.ItemDianluban,'C',new ItemStack(Items.dye,1,3),'D',ModBlocks.BlockWaike,'F',Items.redstone});
	
	GameRegistry.addSmelting(new ItemStack(ModItem.ItemYouyurou), new ItemStack(ModItem.ItemShuyouyurou), 0.5f);	
	GameRegistry.addSmelting(new ItemStack(ModItem.ItemYumi), new ItemStack(ModItem.ItemKaoyumi), 0.5f);
	GameRegistry.addSmelting(new ItemStack(ModItem.ItemHongshu), new ItemStack(ModItem.ItemKaohongshu), 0.5f);
	GameRegistry.addSmelting(new ItemStack(ModItem.Itemwater), new ItemStack(ModItem.ItemYan, 2), 0.5f);
	
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemNainao, 1), new Object[] {Items.milk_bucket});
	
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemMianpi, 2), new Object[] {ModItem.ItemMianfen,ModItem.ItemMianfen,ModItem.ItemMianfen,ModItem.Itemwater});
	
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemJiaozi), new Object[] {ModItem.ItemJiaozixian,ModItem.ItemMianpi});
	
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemJinputao, 1), new Object[] {"AAA", "ABA", "AAA", 'A', Blocks.gold_block,'B', ModItem.ItemPutao});
	
	GameRegistry.addRecipe(new ItemStack(ModBlocks.Blocksugar, 1), new Object[] {"AAA", "AAA", "AAA", 'A', Items.sugar});
	GameRegistry.addShapelessRecipe(new ItemStack(Items.sugar,9), new Object[] {ModBlocks.Blocksugar});
	
	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockDami, 1), new Object[] {"AAA", "AAA", "AAA", 'A', ModItem.ItemDami});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemDami,9), new Object[] {ModBlocks.BlockDami});
	
	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockHuashenk, 1), new Object[] {"AAA", "AAA", "AAA", 'A', ModItem.ItemHuashen});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemHuashen,9), new Object[] {ModBlocks.BlockHuashenk});
	
	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockLuobo, 1), new Object[] {"AAA", "AAA", "AAA", 'A', Items.carrot});
	GameRegistry.addShapelessRecipe(new ItemStack(Items.carrot,9), new Object[] {ModBlocks.BlockLuobo});
	
	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockTudou, 1), new Object[] {"AAA", "AAA", "AAA", 'A', Items.potato});
	GameRegistry.addShapelessRecipe(new ItemStack(Items.potato,9), new Object[] {ModBlocks.BlockTudou});
	
	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockYan, 1), new Object[] {"AAA", "AAA", "AAA", 'A', ModItem.ItemYan});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemYan,9), new Object[] {ModBlocks.BlockYan});
	
	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockDouzik, 1), new Object[] {"AAA", "AAA", "AAA", 'A', ModItem.ItemDouzi});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemDouzi,9), new Object[] {ModBlocks.BlockDouzik});
	
	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockRuomi, 1), new Object[] {"AAA", "AAA", "AAA", 'A', ModItem.ItemNuomi});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemNuomi,9), new Object[] {ModBlocks.BlockRuomi});

	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockDouban, 1), new Object[] {"AAA", "AAA", "AAA", 'A', ModItem.ItemDouban});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemDouban,9), new Object[] {ModBlocks.BlockDouban});
	
	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockQiaokeli, 1), new Object[] {"AAA", "AAA", "AAA", 'A', ModItem.ItemQiaokeli});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemQiaokeli,9), new Object[] {ModBlocks.BlockQiaokeli});
	
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemQiaokelinaiice), new Object[] {ModItem.ItemQiaokelinai,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemPutaozhiice), new Object[] {ModItem.ItemPutaozhi,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemPingguozhiice), new Object[] {ModItem.ItemPingguozhi,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemJinpingguozhiice), new Object[] {ModItem.ItemJinpingguozhi,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemJinputaozhiice), new Object[] {ModItem.ItemJinputaozhi,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemXiguazhiice), new Object[] {ModItem.ItemXiguazhi,Items.snowball});
	
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemLizhizhiice), new Object[] {ModItem.ItemLizhizhi,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemTaozizhiice), new Object[] {ModItem.ItemTaozizhi,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemJuzizhiice), new Object[] {ModItem.ItemJuzizhi,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemMangguozhiice), new Object[] {ModItem.ItemMangguozhi,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemNingmengzhiice), new Object[] {ModItem.ItemNingmengzhi,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemMuguazhiice), new Object[] {ModItem.ItemMuguazhi,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemCaomeizhiice), new Object[] {ModItem.ItemCaomeizhi,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemYezizhiice), new Object[] {ModItem.ItemYezizhi,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemXiangjiaozhiice), new Object[] {ModItem.ItemXiangjiaozhi,Items.snowball});
	
	
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemJinkela, 8), new Object[] {"AAA", "ABA", "AAA", 'A', new ItemStack(Items.dye,1,15),  'B', Items.gold_ingot});
	
	
	registerChestLoot(new ItemStack(ModItem.ItemDouban), 1, 1, 16);
	registerChestLoot(new ItemStack(ModItem.ItemZongye), 1, 10, 16);
	registerChestLoot(new ItemStack(ModItem.ItemKafei), 1, 1, 10);
	registerChestLoot(new ItemStack(ModItem.ItemGalikuai), 1, 10, 16);
	registerChestLoot(new ItemStack(ModItem.ItemHetaosu), 1, 10, 16);
	registerChestLoot(new ItemStack(ModItem.ItemXiangchang), 1, 10, 16);
	registerChestLoot(new ItemStack(ModItem.ItemLaweixunliao), 1, 10, 32);
	 for(int i1 = 0;i1 < 8;i1++){
		 GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemDangao,1,i1), new Object[] {new ItemStack(ModItem.ItemGuojiang,1,i1),Items.cake});
	 }
	 for(int i1 = 0;i1 < 8;i1++){
		 GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemBinggan,1,i1), new Object[] {ModItem.ItemBingganF, new ItemStack(ModItem.ItemGuojiang,1,i1),ModItem.ItemBingganF});
	 }
	 GameRegistry.addRecipe(new ItemStack(ModItem.ItemBingganF,3,0), new Object[] {"AAA","BBB","AAA", 'A', ModItem.ItemMianfen, 'B' ,Items.egg});
	 GameRegistry.addRecipe(new ItemStack(ModItem.ItemBingganXN,1,0), new Object[] {"AAA","ABA","AAA", 'A', ModItem.ItemMianfen,'B' ,Items.egg});
	 
	 GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemGuojiang,1,0), new Object[] {ModItem.Itemwater,ModItem.ItemPutao,Items.sugar});
	 GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemGuojiang,1,1), new Object[] {ModItem.Itemwater,ModItem.ItemJinputao,Items.sugar});
	 GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemGuojiang,1,2), new Object[] {ModItem.Itemwater,ModItem.ItemLi,Items.sugar});
	 GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemGuojiang,1,3), new Object[] {ModItem.Itemwater,ModItem.ItemTaozi,Items.sugar});
	 GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemGuojiang,1,4), new Object[] {ModItem.Itemwater,ModItem.ItemJuzi,Items.sugar});
	 GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemGuojiang,1,5), new Object[] {ModItem.Itemwater,ModItem.ItemNingmeng,Items.sugar});
	 GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemGuojiang,1,6), new Object[] {ModItem.Itemwater,ModItem.ItemCaomei,Items.sugar});
	 GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemGuojiang,1,7), new Object[] {ModItem.Itemwater,ModItem.ItemYezi,Items.sugar});
	}
    public static void registerChestLoot(ItemStack loot, int min, int max, int rarity)
    {
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