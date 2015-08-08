package com.cfyifei.recipe;

import com.cfyifei.FoodCraft;
import com.cfyifei.block.ModBlocks;
import com.cfyifei.gui.blocks.ModGui;
import com.cfyifei.gui.recipes.Gygrecipe;
import com.cfyifei.item.ModItem;

import com.cfyifei.nei.NEIAPI;
import com.cfyifei.util.RemoveRecipe;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipe {

    public static void init() {
	Items.egg.setMaxStackSize(64);
	Items.snowball.setMaxStackSize(64);

	GameRegistry.addRecipe(new ItemStack(ModItem.ItemTiepian, 16), new Object[]{"###", "#X#", "###", '#', Items.iron_ingot, 'X', Blocks.stone});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemCaidao, 1), new Object[]{"## ", "## ", "X  ", '#', ModItem.ItemTiepian, 'X', Items.stick});
	RemoveRecipe.removeAnyRecipe(new ItemStack(Items.cake));
	RemoveRecipe.removeAnyRecipe(new ItemStack(Items.bread));
	RemoveRecipe.removeAnyRecipe(new ItemStack(Items.pumpkin_pie));
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemPisa), new Object[]{ModItem.ItemLaobing, Items.cooked_porkchop, Items.carrot, ModItem.ItemNainao, Blocks.brown_mushroom});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemJinghuashuitong), new Object[]{Items.bucket, Blocks.wool});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemHanbaobao), new Object[]{Items.bread, ModItem.ItemShucai, Items.cooked_porkchop, Items.bread});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemYuebing, 1), new Object[]{"AAA", "XBX", "AAA", 'A', ModItem.ItemMianfen, 'B', ModItem.ItemDousha, 'X', new ItemStack(Items.dye, 1, 11)});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemYuebing, 1), new Object[]{"AAA", "XBX", "AAA", 'A', ModItem.ItemMianfen, 'B', Items.egg, 'X', new ItemStack(Items.dye, 1, 11)});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemNiangao, 1), new Object[]{"AAA", "ABA", "AAA", 'A', ModItem.ItemNuomifen, 'B', ModItem.Itemfan});

	GameRegistry.addRecipe(new ItemStack(ModItem.ItemWrench, 1), new Object[]{"A A", " A ", " A ", 'A', Items.iron_ingot});

	GameRegistry.addRecipe(new ItemStack(ModItem.ItemCiba, 1), new Object[]{"AAA", "ABA", "AAA", 'A', ModItem.ItemNuomifen, 'B', ModItem.Itemwater});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemAici), new Object[]{ModItem.ItemCiba, Blocks.leaves});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemChangfen, 1), new Object[]{"AAA", "BBB", "CDE", 'A', ModItem.Itemfan, 'B', ModItem.Itemwater, 'C', ModItem.ItemCong, 'D', Items.cooked_porkchop, 'E', ModItem.ItemJiangyou});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemRegou), new Object[]{ModItem.ItemXiangchang, Items.bread});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemLabazhou), new Object[]{ModItem.ItemXifan, Items.wheat, ModItem.ItemHuashen, ModItem.Itemfan, ModItem.ItemDouzi, ModItem.ItemLarou, ModItem.ItemNuomi, ModItem.ItemLachang, Items.carrot});

	GameRegistry.addRecipe(new ItemStack(ModItem.ItemMian, 1), new Object[]{"ABA", "ABA", "ABA", 'A', ModItem.ItemMianfen, 'B', ModItem.Itemwater});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemGuoqiaomixian, 1), new Object[]{"ABA", "ABA", "ABA", 'A', ModItem.Itemfan, 'B', ModItem.Itemwater});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemYifen, 1), new Object[]{"ABA", "ABA", "ABA", 'A', Items.wheat, 'B', ModItem.Itemwater});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemMantou, 1), new Object[]{"AAA", "ABA", "AAA", 'A', ModItem.ItemMianfen, 'B', ModItem.Itemwater});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemSuancaibing, 1), new Object[]{"AAA", "ABA", "AAA", 'A', ModItem.ItemMianfen, 'B', ModItem.ItemShucai});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemLatiao), new Object[]{ModItem.ItemDoufusi, ModItem.ItemLajiao});

	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemLachang), new Object[]{ModItem.ItemXiangchang, ModItem.ItemLaweixunliao});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemLarou), new Object[]{Items.cooked_porkchop, ModItem.ItemLaweixunliao});

	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemYifenpork), new Object[]{ModItem.ItemYifen, Items.cooked_porkchop});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemYifenchicken), new Object[]{ModItem.ItemYifen, Items.cooked_chicken});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemYifenbeef), new Object[]{ModItem.ItemYifen, Items.cooked_beef});

	GameRegistry.addRecipe(new ItemStack(Items.cake, 1), new Object[]{"AAA", "BEB", "CCC", 'A', Items.milk_bucket, 'B', Items.sugar, 'C', ModItem.ItemMianfen, 'E', Items.egg});
	GameRegistry.addRecipe(new ItemStack(Items.bread, 1), new Object[]{"AAA", 'A', ModItem.ItemMianfen});
	GameRegistry.addRecipe(new ItemStack(Items.pumpkin_pie, 1), new Object[]{"AAA", "BBB", "CCC", 'A', ModItem.ItemNuomifen, 'B', Blocks.pumpkin, 'C', Items.egg});
	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockWaike, 1), new Object[]{"AAA", "ABA", "AAA", 'A', ModItem.ItemHuashen, 'B', Blocks.iron_block});
	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockWaike, 1), new Object[]{"AAA", "ABA", "AAA", 'A', ModItem.ItemDouzi, 'B', Blocks.iron_block});
	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockWaike, 1), new Object[]{"AAA", "ABA", "AAA", 'A', ModItem.ItemDami, 'B', Blocks.iron_block});
	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockWaike, 1), new Object[]{"AAA", "ABA", "AAA", 'A', Items.wheat, 'B', Blocks.iron_block});

	GameRegistry.addRecipe(new ItemStack(ModItem.ItemDianluban, 1), new Object[]{"AAA", "CBC", "AAA", 'A', ModItem.ItemHuashen, 'B', Items.iron_ingot, 'C', Items.redstone});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemDianluban, 1), new Object[]{"AAA", "CBC", "AAA", 'A', ModItem.ItemDouzi, 'B', Items.iron_ingot, 'C', Items.redstone});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemDianluban, 1), new Object[]{"AAA", "CBC", "AAA", 'A', ModItem.ItemDami, 'B', Items.iron_ingot, 'C', Items.redstone});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemDianluban, 1), new Object[]{"AAA", "CBC", "AAA", 'A', Items.wheat, 'B', Items.iron_ingot, 'C', Items.redstone});

	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemQiaokeli), new Object[]{ModItem.ItemQiaokelifen, Items.sugar});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemNuomi, 2), new Object[]{ModItem.ItemNuomi, Items.bone});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemDouban, 2), new Object[]{ModItem.ItemDouban, Items.bone});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemDoufugan), new Object[]{ModItem.ItemDoufu, ModItem.ItemJiangyou});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemDoufu), new Object[]{ModItem.ItemDoujiang, ModItem.ItemYan});

	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemChunjuan), new Object[]{ModItem.ItemDoufusi, ModItem.ItemLuobosi, ModItem.ItemShucai, Items.cooked_porkchop});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemAeljichifan), new Object[]{ModItem.ItemAeljichi, ModItem.ItemBaifan});

	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemZongzi), new Object[]{ModItem.ItemNuomi, Items.cooked_porkchop, Items.string, ModItem.ItemZongye});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemNuomituan), new Object[]{ModItem.ItemNuomifen, ModItem.ItemNuomifen, ModItem.ItemNuomifen, ModItem.Itemwater});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemHuashentangyuanxian, 1), new Object[]{ModItem.ItemHuashen, Items.sugar});

	GameRegistry.addRecipe(new ItemStack(ModGui.Nmj, 1), new Object[]{"AAA", "DBD", "ECE", 'A', Items.wheat, 'B', ModBlocks.BlockWaike, 'C', ModItem.ItemDianluban, 'E', Items.milk_bucket, 'D', Blocks.glass});
	GameRegistry.addRecipe(new ItemStack(ModGui.PDG, 1), new Object[]{"AAA", "EBE", " C ", 'A', ModItem.ItemTiepian, 'B', ModBlocks.BlockWaike, 'C', ModItem.ItemDianluban, 'E', new ItemStack(Items.dye)});
	GameRegistry.addRecipe(new ItemStack(ModGui.Guo, 1), new Object[]{"AAA", "EBE", " C ", 'A', Items.iron_ingot, 'B', ModBlocks.BlockWaike, 'C', ModItem.ItemDianluban, 'E', new ItemStack(Items.dye)});
	GameRegistry.addRecipe(new ItemStack(ModGui.Gyg, 1), new Object[]{"AAA", "EBE", "XCX", 'A', Items.iron_ingot, 'B', ModBlocks.BlockWaike, 'C', ModItem.ItemDianluban, 'E', new ItemStack(Items.dye), 'X', new ItemStack(Items.dye, 1, 15)});
	GameRegistry.addRecipe(new ItemStack(ModGui.Caiban, 1), new Object[]{"AAA", "ABA", "AAA", 'A', Blocks.planks, 'B', ModItem.ItemCaidao});
	GameRegistry.addRecipe(new ItemStack(ModGui.YZJ, 1), new Object[]{"AAA", "DBD", "CCC", 'A', ModItem.ItemHuashenyou, 'B', ModBlocks.BlockWaike, 'C', ModItem.ItemDianluban, 'D', Blocks.glass});
	GameRegistry.addRecipe(new ItemStack(ModGui.Tpj, 1), new Object[]{"ABA", "CDC", "EFE", 'A', Items.redstone, 'B', Blocks.ice, 'C', Items.diamond, 'D', ModBlocks.BlockWaike, 'E', Items.emerald, 'F', ModItem.ItemDianluban});
	GameRegistry.addRecipe(new ItemStack(ModGui.Nt, 1), new Object[]{"ABA", "CDC", "ABA", 'A', Blocks.planks, 'B', ModItem.ItemDianluban, 'C', Items.diamond, 'D', ModBlocks.BlockWaike});
	GameRegistry.addRecipe(new ItemStack(ModGui.Zl, 1), new Object[]{"ABA", "CDC", "FBF", 'A', Items.flint_and_steel, 'B', ModItem.ItemDianluban, 'C', Items.diamond, 'D', ModBlocks.BlockWaike, 'F', Items.redstone});

	GameRegistry.addSmelting(new ItemStack(ModItem.ItemYouyurou), new ItemStack(ModItem.ItemShuyouyurou), 0.5f);
	GameRegistry.addSmelting(new ItemStack(ModItem.ItemYumi), new ItemStack(ModItem.ItemKaoyumi), 0.5f);
	GameRegistry.addSmelting(new ItemStack(ModItem.ItemHongshu), new ItemStack(ModItem.ItemKaohongshu), 0.5f);
	GameRegistry.addSmelting(new ItemStack(ModItem.Itemwater), new ItemStack(ModItem.ItemYan, 2), 0.5f);
	GameRegistry.addSmelting(new ItemStack(Items.milk_bucket), new ItemStack(ModItem.ItemNainao), 0.5f);
	GameRegistry.addSmelting(new ItemStack(ModItem.ItemYangrou), new ItemStack(ModItem.ItemShuyangrou), 0.5f);

	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemMianpi, 2), new Object[]{ModItem.ItemMianfen, ModItem.ItemMianfen, ModItem.ItemMianfen, ModItem.Itemwater});

	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemJiaozi), new Object[]{ModItem.ItemJiaozixian, ModItem.ItemMianpi});

	GameRegistry.addRecipe(new ItemStack(ModItem.ItemJinputao, 1), new Object[]{"AAA", "ABA", "AAA", 'A', Blocks.gold_block, 'B', ModItem.ItemPutao});

	GameRegistry.addRecipe(new ItemStack(ModBlocks.Blocksugar, 1), new Object[]{"AAA", "AAA", "AAA", 'A', Items.sugar});
	GameRegistry.addShapelessRecipe(new ItemStack(Items.sugar, 9), new Object[]{ModBlocks.Blocksugar});

	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockDami, 1), new Object[]{"AAA", "AAA", "AAA", 'A', ModItem.ItemDami});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemDami, 9), new Object[]{ModBlocks.BlockDami});

	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockHuashenk, 1), new Object[]{"AAA", "AAA", "AAA", 'A', ModItem.ItemHuashen});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemHuashen, 9), new Object[]{ModBlocks.BlockHuashenk});

	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockLuobo, 1), new Object[]{"AAA", "AAA", "AAA", 'A', Items.carrot});
	GameRegistry.addShapelessRecipe(new ItemStack(Items.carrot, 9), new Object[]{ModBlocks.BlockLuobo});

	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockTudou, 1), new Object[]{"AAA", "AAA", "AAA", 'A', Items.potato});
	GameRegistry.addShapelessRecipe(new ItemStack(Items.potato, 9), new Object[]{ModBlocks.BlockTudou});

	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockYan, 1), new Object[]{"AAA", "AAA", "AAA", 'A', ModItem.ItemYan});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemYan, 9), new Object[]{ModBlocks.BlockYan});

	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockDouzik, 1), new Object[]{"AAA", "AAA", "AAA", 'A', ModItem.ItemDouzi});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemDouzi, 9), new Object[]{ModBlocks.BlockDouzik});

	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockRuomi, 1), new Object[]{"AAA", "AAA", "AAA", 'A', ModItem.ItemNuomi});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemNuomi, 9), new Object[]{ModBlocks.BlockRuomi});

	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockDouban, 1), new Object[]{"AAA", "AAA", "AAA", 'A', ModItem.ItemDouban});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemDouban, 9), new Object[]{ModBlocks.BlockDouban});

	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockQiaokeli, 1), new Object[]{"AAA", "AAA", "AAA", 'A', ModItem.ItemQiaokeli});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemQiaokeli, 9), new Object[]{ModBlocks.BlockQiaokeli});

	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemQiaokelinaiice), new Object[]{ModItem.ItemQiaokelinai, Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemPutaozhiice), new Object[]{ModItem.ItemPutaozhi, Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemPingguozhiice), new Object[]{ModItem.ItemPingguozhi, Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemJinpingguozhiice), new Object[]{ModItem.ItemJinpingguozhi, Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemJinputaozhiice), new Object[]{ModItem.ItemJinputaozhi, Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemXiguazhiice), new Object[]{ModItem.ItemXiguazhi, Items.snowball});

	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemLizhizhiice), new Object[]{ModItem.ItemLizhizhi, Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemTaozizhiice), new Object[]{ModItem.ItemTaozizhi, Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemJuzizhiice), new Object[]{ModItem.ItemJuzizhi, Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemMangguozhiice), new Object[]{ModItem.ItemMangguozhi, Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemNingmengzhiice), new Object[]{ModItem.ItemNingmengzhi, Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemMuguazhiice), new Object[]{ModItem.ItemMuguazhi, Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemCaomeizhiice), new Object[]{ModItem.ItemCaomeizhi, Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemYezizhiice), new Object[]{ModItem.ItemYezizhi, Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemXiangjiaozhiice), new Object[]{ModItem.ItemXiangjiaozhi, Items.snowball});

	GameRegistry.addRecipe(new ItemStack(ModItem.ItemJinkela, 8), new Object[]{"AAA", "ABA", "AAA", 'A', new ItemStack(Items.dye, 1, 15), 'B', Items.gold_ingot});

	GameRegistry.addRecipe(new ItemStack(ModItem.ItemSCBlock, 1), new Object[]{
	    "ABC",
	    "DEF",
	    "GHI",
	    'A', ModBlocks.BlockQiaokeli, 'B', ModBlocks.BlockDouban, 'C', ModBlocks.BlockLuobo,
	    'D', ModBlocks.BlockDouzik, 'E', ModBlocks.BlockHuashenk, 'F', ModBlocks.BlockDami,
	    'G', ModBlocks.BlockTudou, 'H', ModBlocks.BlockYan, 'I', ModBlocks.Blocksugar,});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemSCPlant, 1), new Object[]{
	    "ABC",
	    "DEF",
	    "GHI",
	    'A', ModItem.ItemDami, 'B', ModItem.ItemHuashen, 'C', ModItem.ItemDouzi,
	    'D', ModItem.ItemShucai, 'E', ModItem.ItemLajiao, 'F', ModItem.ItemFanqie,
	    'G', ModItem.ItemQiezi, 'H', ModItem.ItemPutao, 'I', Items.sugar,});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemSCMW1, 1), new Object[]{
	    "ABC",
	    "DEF",
	    "GHI",
	    'A', ModItem.ItemJianjidan, 'B', ModItem.ItemLaobing, 'C', ModItem.ItemDoufugan,
	    'D', ModItem.ItemChaotudoupian, 'E', ModItem.ItemXiangchang, 'F', ModItem.ItemHetaosu,
	    'G', ModItem.ItemAici, 'H', ModItem.ItemNiangao, 'I', ModItem.ItemChunjuan,});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemSCMW2, 1), new Object[]{
	    "ABC",
	    "DEF",
	    "GHI",
	    'A', ModItem.ItemRegou, 'B', ModItem.ItemNainao, 'C', ModItem.ItemPisa,
	    'D', ModItem.ItemMantou, 'E', ModItem.ItemSuancaibing, 'F', ModItem.ItemLatiao,
	    'G', ModItem.ItemMahua, 'H', ModItem.ItemLachang, 'I', ModItem.ItemLarou,});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemSCKFC, 1), new Object[]{
	    "ABC",
	    "DEF",
	    "GHI",
	    'A', ModItem.ItemHanbaobao, 'B', ModItem.ItemShutiao, 'C', ModItem.ItemJichi,
	    'D', ModItem.ItemJimihua, 'E', ModItem.ItemJikuai, 'F', ModItem.ItemYuanweijikuai,
	    'G', ModItem.ItemYoutiao, 'H', ModItem.ItemKele, 'I', ModItem.ItemXuebi,});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemSCCn, 1), new Object[]{
	    "ABC",
	    "DEF",
	    "GHI",
	    'A', ModItem.ItemJiaozi, 'B', ModItem.ItemZongzi, 'C', ModItem.ItemYuebing,
	    'D', ModItem.ItemTangyuan, 'E', ModItem.ItemNiangao, 'F', ModItem.ItemChunjuan,
	    'G', ModItem.ItemCiba, 'H', ModItem.ItemHetaosu, 'I', ModItem.ItemBaifan,});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemSCYz, 1), new Object[]{
	    "ABC",
	    "DEF",
	    "GHI",
	    'A', ModItem.ItemShupian, 'B', ModItem.ItemZhaniangao, 'C', ModItem.ItemZhaxiangchang,
	    'D', ModItem.ItemZhamianbao, 'E', ModItem.ItemZhamahua, 'F', ModItem.ItemZhajitui,
	    'G', ModItem.ItemJimihua, 'H', ModItem.ItemJikuai, 'I', ModItem.ItemYuanweijikuai,});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemSCJ, 1), new Object[]{
	    "ABC",
	    "DED",
	    "GHI",
	    'A', ModItem.ItemHongjiu, 'B', ModItem.ItemBaijiu, 'C', ModItem.ItemPutaojiu,
	    'D', ModItem.ItemJinputao, 'E', Items.golden_apple,
	    'G', ModItem.ItemPingguojiu, 'H', ModItem.ItemJinputaojiu, 'I', ModItem.ItemJinpingguojiu,});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemSCShui1, 1), new Object[]{
	    "ABC",
	    "DEF",
	    "GHI",
	    'A', ModItem.ItemQiaokelishui, 'B', ModItem.ItemPutaozhi, 'C', ModItem.ItemPingguozhi,
	    'D', ModItem.ItemKafei, 'E', Items.apple, 'F', ModItem.ItemQiaokelinai,
	    'G', ModItem.ItemDounai, 'H', ModItem.ItemXiguazhi, 'I', ModItem.ItemNaicha,});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemSCShui2, 1), new Object[]{
	    "ABC",
	    "DEF",
	    "GHI",
	    'A', ModItem.ItemHuluobozhi, 'B', ModItem.ItemCha, 'C', ModItem.ItemShucaizhi,
	    'D', ModItem.ItemPingguozhiice, 'E', ModItem.ItemPutaozhiice, 'F', ModItem.ItemKafei,
	    'G', ModItem.ItemXiguazhiice, 'H', ModItem.ItemQiaokelinaiice, 'I', ModItem.ItemNaicha,});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemSCFan1, 1), new Object[]{
	    "ABC",
	    "DEF",
	    "GHI",
	    'A', ModItem.ItemFanqiechaojidanfan, 'B', ModItem.ItemDisanxian, 'C', ModItem.ItemYuxiangrousi,
	    'D', ModItem.ItemGongbaojiding, 'E', ModItem.ItemChaotudousifan, 'F', ModItem.ItemDuojiaoyutou,
	    'G', ModItem.ItemMapodoufufan, 'H', ModItem.ItemHongshaoroufan, 'I', ModItem.ItemHuiguoroufan,});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemSCFan2, 1), new Object[]{
	    "ABC",
	    "DEF",
	    "GHI",
	    'A', ModItem.ItemAeljichifan, 'B', ModItem.ItemLaziji, 'C', ModItem.ItemKoushuiji,
	    'D', ModItem.ItemBaiqiuji, 'E', ModItem.ItemCongyouji, 'F', ModItem.ItemSuancaiyu,
	    'G', ModItem.ItemMalayu, 'H', ModItem.ItemQingzhenyu, 'I', ModItem.ItemKelejichifan,});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemSCFan3, 1), new Object[]{
	    "ABC",
	    "DEF",
	    "GHI",
	    'A', ModItem.ItemGalijiroufan, 'B', ModItem.ItemShuizhuniurou, 'C', ModItem.ItemYifen,
	    'D', ModItem.ItemRibendoufu, 'E', ModItem.ItemShucai, 'F', ModItem.ItemYifenpork,
	    'G', ModItem.ItemChangfen, 'H', ModItem.ItemYifenchicken, 'I', ModItem.ItemYifenbeef,});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemSCTh, 1), new Object[]{
	    "ABC",
	    "DED",
	    "GHI",
	    'A', ModItem.ItemJinpingguojiu, 'B', ModItem.ItemJinputaozhi, 'C', ModItem.ItemJinpingguojiu,
	    'D', new ItemStack(Items.golden_apple, 1, 1), 'E', ModItem.ItemJinputao,
	    'G', ModItem.ItemJinpingguozhiice, 'H', ModItem.ItemJinpingguozhi, 'I', ModItem.ItemJinputaozhiice,});

	GameRegistry.addRecipe(new ItemStack(ModItem.ItemAnlanzhishi, 1), new Object[]{
	    "ABC", "#X#", "DEF",
	    'A', ModItem.ItemSCShui1, 'B', ModItem.ItemSCShui2, 'C', ModItem.ItemSCFan1,
	    'D', ModItem.ItemSCFan2, 'E', ModItem.ItemSCFan3, 'F', ModItem.ItemSCBlock,
	    '#', Items.iron_ingot, 'X', Items.diamond,});

	GameRegistry.addRecipe(new ItemStack(ModItem.ItemAnbizhishi, 1), new Object[]{
	    "ABC", "#X#", "DEF",
	    'A', ModItem.ItemSCMW1, 'B', ModItem.ItemSCMW2, 'C', ModItem.ItemSCKFC,
	    'D', ModItem.ItemSCCn, 'E', ModItem.ItemSCYz, 'F', ModItem.ItemSCPlant,
	    '#', Items.iron_ingot, 'X', Items.emerald,});

	GameRegistry.addRecipe(new ItemStack(ModItem.ItemZongjiqianguzhishi, 1), new Object[]{
	    "AAA", "CDE", "BBB",
	    'A', ModItem.ItemAnlanzhishi, 'C', ModItem.ItemSCTh, 'B', ModItem.ItemAnbizhishi,
	    'E', ModItem.ItemSCJ, 'D', Items.diamond,});
	ItemStack islan = new ItemStack(ModItem.ItemAnlanTools, 1);
	islan.addEnchantment(Enchantment.efficiency, 6);
	islan.addEnchantment(Enchantment.unbreaking, 6);
	islan.addEnchantment(Enchantment.fortune, 3);
	GameRegistry.addRecipe(islan, new Object[]{
	    "ABA", "ADA", " D ",
	    'A', ModItem.ItemAnlanzhishi, 'B', ModItem.ItemZongjiqianguzhishi, 'D', Items.diamond,});
	ItemStack isbi = new ItemStack(ModItem.ItemAnbiTools, 1);
	isbi.addEnchantment(Enchantment.efficiency, 6);
	isbi.addEnchantment(Enchantment.unbreaking, 6);
	isbi.addEnchantment(Enchantment.silkTouch, 1);
	GameRegistry.addRecipe(isbi, new Object[]{
	    "ABA", "ADA", " D ",
	    'A', ModItem.ItemAnbizhishi, 'B', ModItem.ItemZongjiqianguzhishi, 'D', Items.emerald,});

	/*GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemCong,16), new Object[] {ModItem.ItemSCBlock});
	 GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemLaweixunliao,16), new Object[] {ModItem.ItemSCPlant});
	 GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemXiangchang,16), new Object[] {ModItem.ItemSCShui1});
	 GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemGalikuai,16), new Object[] {ModItem.ItemSCShui2});
	 GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemZongye,16), new Object[] {ModItem.ItemSCYz});
	 GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemDouban,16), new Object[] {ModItem.ItemSCCn});
	 GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemNuomi,16), new Object[] {ModItem.ItemSCKFC});
	 */
	//registerChestLoot(new ItemStack(ModItem.ItemNuomi), 1, 1, 16);
	registerChestLoot(new ItemStack(ModItem.ItemDouban), 1, 1, 16);
	//registerChestLoot(new ItemStack(ModItem.ItemCong), 1, 1, 16);
	registerChestLoot(new ItemStack(ModItem.ItemZongye), 1, 10, 16);
	registerChestLoot(new ItemStack(ModItem.ItemKafei), 1, 1, 10);
	registerChestLoot(new ItemStack(ModItem.ItemGalikuai), 1, 10, 16);
	registerChestLoot(new ItemStack(ModItem.ItemHetaosu), 1, 10, 16);
	registerChestLoot(new ItemStack(ModItem.ItemXiangchang), 1, 10, 16);
	registerChestLoot(new ItemStack(ModItem.ItemLaweixunliao), 1, 10, 32);
	for (int i1 = 0; i1 < 8; i1++) {
	    GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemDangao, 1, i1), new Object[]{new ItemStack(ModItem.ItemGuojiang, 1, i1), Items.cake});
	}
	for (int i1 = 0; i1 < 8; i1++) {
	    GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemBinggan, 1, i1), new Object[]{ModItem.ItemBingganF, new ItemStack(ModItem.ItemGuojiang, 1, i1), ModItem.ItemBingganF});
	}
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemBingganF, 3, 0), new Object[]{"AAA", "BBB", "AAA", 'A', ModItem.ItemMianfen, 'B', Items.egg});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemBingganXN, 1, 0), new Object[]{"AAA", "ABA", "AAA", 'A', ModItem.ItemMianfen, 'B', Items.egg});

	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemGuojiang, 1, 0), new Object[]{ModItem.Itemwater, ModItem.ItemPutao, Items.sugar});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemGuojiang, 1, 1), new Object[]{ModItem.Itemwater, ModItem.ItemJinputao, Items.sugar});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemGuojiang, 1, 2), new Object[]{ModItem.Itemwater, ModItem.ItemLi, Items.sugar});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemGuojiang, 1, 3), new Object[]{ModItem.Itemwater, ModItem.ItemTaozi, Items.sugar});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemGuojiang, 1, 4), new Object[]{ModItem.Itemwater, ModItem.ItemJuzi, Items.sugar});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemGuojiang, 1, 5), new Object[]{ModItem.Itemwater, ModItem.ItemNingmeng, Items.sugar});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemGuojiang, 1, 6), new Object[]{ModItem.Itemwater, ModItem.ItemCaomei, Items.sugar});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemGuojiang, 1, 7), new Object[]{ModItem.Itemwater, ModItem.ItemYezi, Items.sugar});
	if (FoodCraft.IC2IsLoad) {
	    new IC2RecipeAdder();
	}
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
