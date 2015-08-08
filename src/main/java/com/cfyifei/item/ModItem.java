package com.cfyifei.item;

import com.cfyifei.FoodCraft;
import com.cfyifei.nei.NEIAPI;
import com.cfyifei.plant.items.*;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

import com.cfyifei.block.ModBlocks;

public class ModItem {

    static public Item ItemCong, ItemZongye, ItemXifan, ItemDangeng, ItemTiepian, ItemCaidao, ItemDami, Itemfan, ItemMianfen, ItemHuashen,
	    ItemDouzi, ItemHuashenyou, ItemDoujiang, ItemDianluban, ItemJianjidan, ItemLaobing, ItemMianpi, ItemJiaozixian, ItemJiaozi, ItemJianjiao,
	    ItemQiaokeli, ItemQiaokelifen, ItemShucai, ItemFanqie, ItemLajiao, ItemMianfensi, ItemQiezi, ItemPutao, ItemYan, Itemwater, ItemDoufu,
	    ItemJiangyou, ItemNuomi, ItemDoufugan, ItemBaifan, ItemFanqiechaojidanfan, ItemDisanxian, ItemCu, ItemYuxiangrousi, ItemGongbaojiding,
	    ItemJitui, ItemTudoupian, ItemTudousi, ItemChaotudousifan, ItemChaotudoupian, ItemDuojiaoyutou, ItemDouban, ItemMapodoufufan,
	    ItemDianfen, ItemHongshaoroufan, ItemHuiguoroufan, ItemMogudunjitang, ItemZongzi, ItemNuomifen, ItemTangyuan,
	    ItemHuashentangyuanxian, ItemNuomituan, ItemMahua, ItemNiangao, ItemChunjuan, ItemJikuai, ItemShutiao, ItemAeljichi, ItemJimihua,
	    ItemAeljichifan, ItemYuanweijikuai, ItemZhadoufu, ItemZhaniangao, ItemShupian, ItemZhamianbao, ItemZhachunjuan, ItemZhamahua,
	    ItemZhajitui, ItemDajirou, ItemZhongjirou, ItemXiaojirou, ItemJichi, ItemDoufusi, ItemLuobosi, ItemHongjiu, ItemBaijiu, ItemPingguojiu,
	    ItemPutaojiu, ItemJinputaojiu, ItemJinpingguojiu, ItemJinputao, ItemQiaokelishui, ItemQiaokelinai, ItemHuluobozhi, ItemPutaozhi,
	    ItemPingguozhi, ItemShucaizhi, ItemJinputaozhi, ItemJinpingguozhi, ItemDounai, ItemKele, ItemXuebi, ItemXiguazhi, ItemQiaokelinaiice,
	    ItemPutaozhiice, ItemPingguozhiice, ItemJinputaozhiice, ItemJinpingguozhiice, ItemXiguazhiice, ItemCha, ItemNaicha, ItemKafei,
	    ItemBaiqiuji, ItemCongyouji, ItemKoushuiji, ItemLaziji, ItemQingzhenyu, ItemMalayu, ItemSuancaiyu, ItemKelejichifan, ItemGalikuai,
	    ItemGalijiroufan, ItemShuizhuniurou, ItemMian, ItemGuoqiaomixian, ItemYifen, ItemYifenpork, ItemYifenbeef, ItemYifenchicken,
	    ItemPidanshourouzhou, ItemYuebing, ItemMantou, ItemSuancaibing, ItemYoutiao, ItemLatiao, ItemHetaosu, ItemAici, ItemCiba, ItemChangfen,
	    ItemXiangchang, ItemRegou, ItemLachang, ItemLarou, ItemZhaxiangchang, ItemRibendoufu, ItemLabazhou, ItemLaweixunliao, ItemNainao,
	    ItemPisa, ItemHanbaobao, ItemJinghuashuitong, ItemSCBlock, ItemSCPlant, ItemSCMW1, ItemSCMW2, ItemSCKFC, ItemSCCn, ItemSCYz,
	    ItemSCJ, ItemSCShui1, ItemSCShui2, ItemSCFan1, ItemSCFan2, ItemSCFan3, ItemSCTh, ItemAnbizhishi, ItemAnlanzhishi, ItemZongjiqianguzhishi,
	    ItemAnlanTools, ItemAnbiTools, ItemZongjiTools, ItemZongjiTools2, ItemZongjiTools3, ItemZongjiTools4, ItemNull, ItemYangrou, ItemShuyangrou,
	    ItemYouyurou, ItemShuyouyurou, ItemYouyusi, ItemShucaizhong, ItemLajiaozhong, ItemFanqiezhong, ItemPutaozhong, ItemQiezizhong, ItemBailuobo,
	    ItemQingjiao, ItemQingjiaozhong, ItemHongdou, ItemLvdou, ItemHongshu, ItemKaohongshu, ItemDoujiao, ItemWrench, ItemHuanggua, ItemHuangguazhong,
	    ItemYumizhong, ItemYumi, ItemBailuobosi, ItemBailuobozhi, ItemFanqiezhi, ItemYumizhi, ItemHuangguazhi, ItemDousha, ItemKaoyumi, ItemBaoyumihua,
	    ItemLi, ItemLizhi, ItemTaozi, ItemJuzi, ItemPipa, ItemMangguo, ItemNingmeng, ItemYouzi, ItemShizi, ItemMugua, ItemShanzha, ItemLongyan, ItemShiliu,
	    ItemCaomei, ItemHongzao, ItemYezi, ItemYingtao, ItemXiangjiao, ItemJinkela, ItemLizizhi, ItemLizhizhi, ItemTaozizhi, ItemJuzizhi, ItemPipazhi,
	    ItemMangguozhi, ItemNingmengzhi, ItemYouzizhi, ItemShizizhi, ItemMuguazhi, ItemShanzhazhi, ItemShiliuzhi, ItemHongzaozhi, ItemCaomeizhi,
	    ItemYezizhi, ItemYingtaozhi, ItemXiangjiaozhi, ItemYenai, ItemLizhizhiice, ItemTaozizhiice, ItemJuzizhiice, ItemMangguozhiice,
	    ItemNingmengzhiice, ItemMuguazhiice, ItemCaomeizhiice, ItemYezizhiice, ItemXiangjiaozhiice, ItemLizijiu, ItemLizhijiu,
	    ItemTaozijiu, ItemMangguojiu, ItemNingmengjiu, ItemShiliujiu, ItemGuojiang, ItemBinggan, ItemDangao,
	    ItemCaidaoHJ, ItemCaidaoZS, ItemCaidaoLBS, ItemBingganF, ItemBingganXN, ItemTest;

    public static void init() {
	//���˹���	
	ItemTiepian = new ItemKb();
	ItemTiepian.setUnlocalizedName("ItemTiepian");
	ItemTiepian.setTextureName("FoodCraft:ItemTiepian");
	ItemTiepian.setCreativeTab(FoodCraft.FcTabJiqi);

	Itemwater = new ItemKb();
	Itemwater.setUnlocalizedName("Itemwater");
	Itemwater.setTextureName("FoodCraft:Itemwater");
	Itemwater.setCreativeTab(FoodCraft.FcTabShicai);

	ItemCaidao = new Item();
	ItemCaidao.setUnlocalizedName("ItemCaidao");
	ItemCaidao.setTextureName("FoodCraft:ItemCaidao");
	ItemCaidao.setCreativeTab(FoodCraft.FcTabJiqi);
	ItemCaidao.setMaxDamage(59);
	ItemCaidao.setMaxStackSize(1);

	ItemCaidaoHJ = new ItemCaidaoHJ();
	ItemCaidaoHJ.setUnlocalizedName("ItemCaidaoHJ");
	ItemCaidaoHJ.setTextureName("FoodCraft:ItemCaidaoHJ");
	ItemCaidaoHJ.setCreativeTab(FoodCraft.FcTabJiqi);

	ItemCaidaoZS = new ItemCaidaoZS();
	ItemCaidaoZS.setUnlocalizedName("ItemCaidaoZS");
	ItemCaidaoZS.setTextureName("FoodCraft:ItemCaidaoZS");
	ItemCaidaoZS.setCreativeTab(FoodCraft.FcTabJiqi);

	ItemCaidaoLBS = new ItemCaidaoLBS();
	ItemCaidaoLBS.setUnlocalizedName("ItemCaidaoLBS");
	ItemCaidaoLBS.setTextureName("FoodCraft:ItemCaidaoLBS");
	ItemCaidaoLBS.setCreativeTab(FoodCraft.FcTabJiqi);

	ItemJinghuashuitong = new ItemJinghuashuitong(EnumHelper.addToolMaterial("JHST", 0, 16, 2.0F, 0.0F, 15));
	ItemJinghuashuitong.setMaxStackSize(1);
	ItemJinghuashuitong.setUnlocalizedName("ItemJinghuashuitong");
	ItemJinghuashuitong.setTextureName("FoodCraft:ItemJinghuashuitong");
	ItemJinghuashuitong.setCreativeTab(FoodCraft.FcTabJiqi);
	//��	
	ItemDami = new ItemShuidao(ModBlocks.BlockShuidao);
	MinecraftForge.addGrassSeed(new ItemStack(ItemDami), 2);
	ItemDami.setUnlocalizedName("ItemDami");
	ItemDami.setTextureName("FoodCraft:ItemDami");
	ItemDami.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemHuashen = new ItemHuashen(ModBlocks.BlockHuashen);
	ItemHuashen.setUnlocalizedName("ItemHuashen");
	MinecraftForge.addGrassSeed(new ItemStack(ItemHuashen), 2);
	ItemHuashen.setTextureName("FoodCraft:ItemHuashen");
	ItemHuashen.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemShucaizhong = new ItemShucai(ModBlocks.BlockShucai);
	ItemShucaizhong.setUnlocalizedName("ItemShucaizhong");
	MinecraftForge.addGrassSeed(new ItemStack(ItemShucaizhong), 1);
	ItemShucaizhong.setTextureName("FoodCraft:ItemShucaizhong");
	ItemShucaizhong.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemDouzi = new ItemDouzi(ModBlocks.BlockDouzi);
	MinecraftForge.addGrassSeed(new ItemStack(ItemDouzi), 2);
	ItemDouzi.setUnlocalizedName("ItemDouzi");
	ItemDouzi.setTextureName("FoodCraft:ItemDouzi");
	ItemDouzi.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemNull = new ItemKb();
	ItemNull.setUnlocalizedName("ItemNull");
	ItemNull.setTextureName("FoodCraft:ItemNull");

	Itemfan = new ItemKb();
	Itemfan.setUnlocalizedName("Itemfan");
	Itemfan.setTextureName("FoodCraft:Itemfan");
	Itemfan.setCreativeTab(FoodCraft.FcTabShicai);

	//���
	ItemMianfen = new ItemKb();
	ItemMianfen.setUnlocalizedName("ItemMianfen");
	ItemMianfen.setTextureName("FoodCraft:ItemMianfen");
	ItemMianfen.setCreativeTab(FoodCraft.FcTabShicai);

	ItemHuashenyou = new ItemKb();
	ItemHuashenyou.setUnlocalizedName("ItemHuashenyou");
	ItemHuashenyou.setTextureName("FoodCraft:ItemHuashenyou");
	ItemHuashenyou.setCreativeTab(FoodCraft.FcTabShicai);

	ItemDoujiang = new ITemFood(2, 4F, false, "ItemDoujiang");
	ItemDoujiang.setUnlocalizedName("ItemDoujiang");
	ItemDoujiang.setTextureName("FoodCraft:ItemDoujiang");
	ItemDoujiang.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemDianluban = new ItemKb();
	ItemDianluban.setUnlocalizedName("ItemDianluban");
	ItemDianluban.setTextureName("FoodCraft:ItemDianluban");
	ItemDianluban.setCreativeTab(FoodCraft.FcTabJiqi);

	ItemJianjidan = new ITemFood(3, 5F, false, "ItemJianjidan");
	ItemJianjidan.setUnlocalizedName("ItemJianjidan");
	ItemJianjidan.setTextureName("FoodCraft:ItemJianjidan");
	ItemJianjidan.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemLaobing = new ITemFood(3, 5F, false, "ItemLaobing");
	ItemLaobing.setUnlocalizedName("ItemLaobing");
	ItemLaobing.setTextureName("FoodCraft:Itembing");
	ItemLaobing.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemMianpi = new ItemKb();
	ItemMianpi.setUnlocalizedName("ItemMianpi");
	ItemMianpi.setTextureName("FoodCraft:ItemMianpi");
	ItemMianpi.setCreativeTab(FoodCraft.FcTabShicai);

	ItemJiaozixian = new ItemKb();
	ItemJiaozixian.setUnlocalizedName("ItemJiaozixian");
	ItemJiaozixian.setTextureName("FoodCraft:ItemJiaozixian");
	ItemJiaozixian.setCreativeTab(FoodCraft.FcTabShicai);

	ItemJiaozi = new ITemFood(3, 8F, false, "ItemJiaozi");
	ItemJiaozi.setUnlocalizedName("ItemJiaozi");
	ItemJiaozi.setTextureName("FoodCraft:ItemJiaozi");
	ItemJiaozi.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemJianjiao = new ITemFood(3, 10F, false, "ItemJianJiao");
	ItemJianjiao.setUnlocalizedName("ItemJianJiao");
	ItemJianjiao.setTextureName("FoodCraft:ItemJianJiao0");
	ItemJianjiao.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemQiaokelifen = new ItemKb();
	ItemQiaokelifen.setUnlocalizedName("ItemQiaokelifen");
	ItemQiaokelifen.setTextureName("FoodCraft:ItemQiaokelifen");
	ItemQiaokelifen.setCreativeTab(FoodCraft.FcTabShicai);

	ItemQiaokeli = new ITemFood(3, 4F, false, "ItemQiaokeli");
	ItemQiaokeli.setUnlocalizedName("ItemQiaokeli");
	ItemQiaokeli.setTextureName("FoodCraft:ItemQiaokeli");
	ItemQiaokeli.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemLajiaozhong = new ItemLajiao(ModBlocks.BlockLajiao);
	MinecraftForge.addGrassSeed(new ItemStack(ItemLajiaozhong), 2);
	ItemLajiaozhong.setUnlocalizedName("ItemLajiaozhong");
	ItemLajiaozhong.setTextureName("FoodCraft:ItemLajiaozhong");
	ItemLajiaozhong.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemFanqiezhong = new ItemFanqie(ModBlocks.BlockFanqie);
	MinecraftForge.addGrassSeed(new ItemStack(ItemFanqiezhong), 2);
	ItemFanqiezhong.setUnlocalizedName("ItemFanqiezhong");
	ItemFanqiezhong.setTextureName("FoodCraft:ItemFanqiezhong");
	ItemFanqiezhong.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemPutaozhong = new ItemPutao(ModBlocks.BlockPutao);
	MinecraftForge.addGrassSeed(new ItemStack(ItemPutaozhong), 2);
	ItemPutaozhong.setUnlocalizedName("ItemPutaozhong");
	ItemPutaozhong.setTextureName("FoodCraft:ItemPutaozhong");
	ItemPutaozhong.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemQiezizhong = new ItemQiezi(ModBlocks.BlockQiezi);
	MinecraftForge.addGrassSeed(new ItemStack(ItemQiezizhong), 2);
	ItemQiezizhong.setUnlocalizedName("ItemQiezizhong");
	ItemQiezizhong.setTextureName("FoodCraft:ItemQiezizhong");
	ItemQiezizhong.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemYan = new ItemKb();
	ItemYan.setUnlocalizedName("ItemYan");
	ItemYan.setTextureName("FoodCraft:ItemYan");
	ItemYan.setCreativeTab(FoodCraft.FcTabShicai);

	ItemDoufu = new ITemFood(3, 4F, false, "ItemDoufu");
	ItemDoufu.setUnlocalizedName("ItemDoufu");
	ItemDoufu.setTextureName("FoodCraft:ItemDoufu");
	ItemDoufu.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemJiangyou = new ItemKb();
	ItemJiangyou.setUnlocalizedName("ItemJiangyou");
	ItemJiangyou.setTextureName("FoodCraft:ItemJiangyou");
	ItemJiangyou.setCreativeTab(FoodCraft.FcTabShicai);

	ItemNuomi = new ItemNuodao(ModBlocks.BlockNuodao);
	MinecraftForge.addGrassSeed(new ItemStack(ItemNuomi), 2);
	ItemNuomi.setUnlocalizedName("ItemNuomi");
	ItemNuomi.setTextureName("FoodCraft:ItemNuomi");
	ItemNuomi.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemDoufugan = new ITemFood(3, 6F, false, "ItemDoufugan");
	ItemDoufugan.setUnlocalizedName("ItemDoufugan");
	ItemDoufugan.setTextureName("FoodCraft:ItemDoufugan");
	ItemDoufugan.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemBaifan = new ITemFood(3, 3F, false, "ItemBaifan");
	ItemBaifan.setUnlocalizedName("ItemBaifan");
	ItemBaifan.setTextureName("FoodCraft:ItemBaifan");
	ItemBaifan.setCreativeTab(FoodCraft.FcTabShicai);

	ItemFanqiechaojidanfan = new ItemZhushi(3, 18F, false, "ItemFanqiechaojidanfan");
	ItemFanqiechaojidanfan.setUnlocalizedName("ItemFanqiechaojidanfan");
	ItemFanqiechaojidanfan.setTextureName("FoodCraft:ItemFanqiechaojidanfan");
	ItemFanqiechaojidanfan.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemDisanxian = new ItemZhushi(3, 18F, false, "ItemDisanxian");
	ItemDisanxian.setUnlocalizedName("ItemDisanxian");
	ItemDisanxian.setTextureName("FoodCraft:ItemDisanxian");
	ItemDisanxian.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemYuxiangrousi = new ItemZhushi(3, 18F, false, "ItemYuxiangrousi");
	ItemYuxiangrousi.setUnlocalizedName("ItemYuxiangrousi");
	ItemYuxiangrousi.setTextureName("FoodCraft:ItemYuxiangrousi");
	ItemYuxiangrousi.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemCu = new ItemKb();
	ItemCu.setUnlocalizedName("ItemCu");
	ItemCu.setTextureName("FoodCraft:ItemCu");
	ItemCu.setCreativeTab(FoodCraft.FcTabShicai);

	ItemGongbaojiding = new ItemZhushi(3, 18F, false, "ItemGongbaojiding");
	ItemGongbaojiding.setUnlocalizedName("ItemGongbaojiding");
	ItemGongbaojiding.setTextureName("FoodCraft:ItemGongbaojiding");
	ItemGongbaojiding.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemJitui = new ITemFood(3, 3F, false, "ItemJitui");
	ItemJitui.setUnlocalizedName("ItemJitui");
	ItemJitui.setTextureName("FoodCraft:ItemJitui");
	ItemJitui.setCreativeTab(FoodCraft.FcTabShicai);

	ItemTudoupian = new ItemKb();
	ItemTudoupian.setUnlocalizedName("ItemTudoupian");
	ItemTudoupian.setTextureName("FoodCraft:ItemTudoupian");
	ItemTudoupian.setCreativeTab(FoodCraft.FcTabShicai);

	ItemTudousi = new ItemKb();
	ItemTudousi.setUnlocalizedName("ItemTudousi");
	ItemTudousi.setTextureName("FoodCraft:ItemTudousi");
	ItemTudousi.setCreativeTab(FoodCraft.FcTabShicai);

	ItemChaotudousifan = new ItemZhushi(3, 18F, false, "ItemChaotudousifan");
	ItemChaotudousifan.setUnlocalizedName("ItemChaotudousifan");
	ItemChaotudousifan.setTextureName("FoodCraft:ItemChaotudousifan");
	ItemChaotudousifan.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemChaotudoupian = new ITemFood(3, 7F, false, "ItemChaotudoupian");
	ItemChaotudoupian.setUnlocalizedName("ItemChaotudoupian");
	ItemChaotudoupian.setTextureName("FoodCraft:ItemChaotudoupian");
	ItemChaotudoupian.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemDuojiaoyutou = new ItemZhushi(3, 18F, false, "ItemDuojiaoyutou");
	ItemDuojiaoyutou.setUnlocalizedName("ItemDuojiaoyutou");
	ItemDuojiaoyutou.setTextureName("FoodCraft:ItemDuojiaoyutou");
	ItemDuojiaoyutou.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemDouban = new ItemKb();
	ItemDouban.setUnlocalizedName("ItemDouban");
	ItemDouban.setTextureName("FoodCraft:ItemDouban");
	ItemDouban.setCreativeTab(FoodCraft.FcTabShicai);

	ItemMapodoufufan = new ItemZhushi(3, 18F, false, "ItemMapodoufufan");
	ItemMapodoufufan.setUnlocalizedName("ItemMapodoufufan");
	ItemMapodoufufan.setTextureName("FoodCraft:ItemMapodoufufan");
	ItemMapodoufufan.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemDianfen = new ItemKb();
	ItemDianfen.setUnlocalizedName("ItemDianfen");
	ItemDianfen.setTextureName("FoodCraft:ItemDianfen");
	ItemDianfen.setCreativeTab(FoodCraft.FcTabShicai);

	ItemHongshaoroufan = new ItemZhushi(3, 18F, false, "ItemHongshaoroufan");
	ItemHongshaoroufan.setUnlocalizedName("ItemHongshaoroufan");
	ItemHongshaoroufan.setTextureName("FoodCraft:ItemHongshaoroufan");
	ItemHongshaoroufan.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemHuiguoroufan = new ItemZhushi(3, 18F, false, "ItemHuiguoroufan");
	ItemHuiguoroufan.setUnlocalizedName("ItemHuiguoroufan");
	ItemHuiguoroufan.setTextureName("FoodCraft:ItemHuiguoroufan");
	ItemHuiguoroufan.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemXifan = new ITemFood(3, 7F, false, "ItemXifan");
	ItemXifan.setUnlocalizedName("ItemXifan");
	ItemXifan.setTextureName("FoodCraft:ItemXifan");
	ItemXifan.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemDangeng = new ITemFood(3, 8F, false, "ItemDangeng");
	ItemDangeng.setUnlocalizedName("ItemDangeng");
	ItemDangeng.setTextureName("FoodCraft:ItemDangeng");
	ItemDangeng.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemMogudunjitang = new ITemFood(3, 8F, false, "ItemMogudunjitang");
	ItemMogudunjitang.setUnlocalizedName("ItemMogudunjitang");
	ItemMogudunjitang.setTextureName("FoodCraft:ItemMgdjt");
	ItemMogudunjitang.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemZongzi = new ITemFood(3, 8F, false, "ItemZongzi");
	ItemZongzi.setUnlocalizedName("ItemZongzi");
	ItemZongzi.setTextureName("FoodCraft:ItemZongzi");
	ItemZongzi.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemZongye = new ItemKb();
	ItemZongye.setUnlocalizedName("ItemZongye");
	ItemZongye.setTextureName("FoodCraft:ItemZongye");
	ItemZongye.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemCong = new ItemCong(ModBlocks.BlockCong);
	ItemCong.setUnlocalizedName("ItemCong");
	MinecraftForge.addGrassSeed(new ItemStack(ItemCong), 2);
	ItemCong.setTextureName("FoodCraft:ItemCong");
	ItemCong.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemNuomifen = new ItemKb();
	ItemNuomifen.setUnlocalizedName("ItemNuomifen");
	ItemNuomifen.setTextureName("FoodCraft:ItemNuomifen");
	ItemNuomifen.setCreativeTab(FoodCraft.FcTabShicai);

	ItemNuomituan = new ItemKb();
	ItemNuomituan.setUnlocalizedName("ItemNuomituan");
	ItemNuomituan.setTextureName("FoodCraft:ItemNuomituan");
	ItemNuomituan.setCreativeTab(FoodCraft.FcTabShicai);

	ItemHuashentangyuanxian = new ItemKb();
	ItemHuashentangyuanxian.setUnlocalizedName("ItemHuashentangyuanxian");
	ItemHuashentangyuanxian.setTextureName("FoodCraft:ItemHuashentangyuanxian");
	ItemHuashentangyuanxian.setCreativeTab(FoodCraft.FcTabShicai);

	ItemTangyuan = new ITemFood(3, 8F, false, "ItemTangyuan");
	ItemTangyuan.setUnlocalizedName("ItemTangyuan");
	ItemTangyuan.setTextureName("FoodCraft:ItemTangyuan");
	ItemTangyuan.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemJikuai = new ITemFood(3, 6F, false, "ItemJikuai");
	ItemJikuai.setUnlocalizedName("ItemJikuai");
	ItemJikuai.setTextureName("FoodCraft:ItemJikuai");
	ItemJikuai.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemShutiao = new ITemFood(3, 7F, false, "ItemShutiao");
	ItemShutiao.setUnlocalizedName("ItemShutiao");
	ItemShutiao.setTextureName("FoodCraft:ItemShutiao");
	ItemShutiao.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemAeljichi = new ITemFood(3, 8F, false, "ItemAeljichi");
	ItemAeljichi.setUnlocalizedName("ItemAeljichi");
	ItemAeljichi.setTextureName("FoodCraft:ItemAeljichi");
	ItemAeljichi.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemJimihua = new ITemFood(3, 4F, false, "ItemJimihua");
	ItemJimihua.setUnlocalizedName("ItemJimihua");
	ItemJimihua.setTextureName("FoodCraft:ItemJimihua");
	ItemJimihua.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemYuanweijikuai = new ITemFood(3, 8F, false, "ItemYuanweijikuai");
	ItemYuanweijikuai.setUnlocalizedName("ItemYuanweijikuai");
	ItemYuanweijikuai.setTextureName("FoodCraft:ItemYuanweijikuai");
	ItemYuanweijikuai.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemAeljichifan = new ItemZhushi(3, 20F, false, "ItemAeljichifan");
	ItemAeljichifan.setUnlocalizedName("ItemAeljichifan");
	ItemAeljichifan.setTextureName("FoodCraft:ItemAeljichifan");
	ItemAeljichifan.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemMahua = new ITemFood(3, 7F, false, "ItemMahua");
	ItemMahua.setUnlocalizedName("ItemMahua");
	ItemMahua.setTextureName("FoodCraft:ItemMahua");
	ItemMahua.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemNiangao = new ITemFood(3, 8F, false, "ItemNiangao");
	ItemNiangao.setUnlocalizedName("ItemNiangao");
	ItemNiangao.setTextureName("FoodCraft:ItemNiangao");
	ItemNiangao.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemChunjuan = new ITemFood(3, 8F, false, "ItemChunjuan");
	ItemChunjuan.setUnlocalizedName("ItemChunjuan");
	ItemChunjuan.setTextureName("FoodCraft:ItemChunjuan");
	ItemChunjuan.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemZhadoufu = new ITemFood(3, 6F, false, "ItemZhadoufu");
	ItemZhadoufu.setUnlocalizedName("ItemZhadoufu");
	ItemZhadoufu.setTextureName("FoodCraft:ItemZhadoufu");
	ItemZhadoufu.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemZhaniangao = new ITemFood(3, 10F, false, "ItemZhaniangao");
	ItemZhaniangao.setUnlocalizedName("ItemZhaniangao");
	ItemZhaniangao.setTextureName("FoodCraft:ItemZhaniangao");
	ItemZhaniangao.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemShupian = new ITemFood(3, 7F, false, "ItemShupian");
	ItemShupian.setUnlocalizedName("ItemShupian");
	ItemShupian.setTextureName("FoodCraft:ItemShupian");
	ItemShupian.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemZhamianbao = new ITemFood(3, 7F, false, "ItemZhamianbao");
	ItemZhamianbao.setUnlocalizedName("ItemZhamianbao");
	ItemZhamianbao.setTextureName("FoodCraft:ItemZhamianbao");
	ItemZhamianbao.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemZhachunjuan = new ITemFood(3, 10F, false, "ItemZhachunjuan");
	ItemZhachunjuan.setUnlocalizedName("ItemZhachunjuan");
	ItemZhachunjuan.setTextureName("FoodCraft:ItemZhachunjuan");
	ItemZhachunjuan.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemZhamahua = new ITemFood(3, 10F, false, "ItemZhamahua");
	ItemZhamahua.setUnlocalizedName("ItemZhamahua");
	ItemZhamahua.setTextureName("FoodCraft:ItemZhamahua");
	ItemZhamahua.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemZhajitui = new ITemFood(3, 5F, false, "ItemZhajitui");
	ItemZhajitui.setUnlocalizedName("ItemZhajitui");
	ItemZhajitui.setTextureName("FoodCraft:ItemZhajitui");
	ItemZhajitui.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemDajirou = new ItemKb();
	ItemDajirou.setUnlocalizedName("ItemDajirou");
	ItemDajirou.setTextureName("FoodCraft:ItemDajirou");
	ItemDajirou.setCreativeTab(FoodCraft.FcTabShicai);

	ItemZhongjirou = new ItemKb();
	ItemZhongjirou.setUnlocalizedName("ItemZhongjirou");
	ItemZhongjirou.setTextureName("FoodCraft:ItemZhongjirou");
	ItemZhongjirou.setCreativeTab(FoodCraft.FcTabShicai);

	ItemXiaojirou = new ItemKb();
	ItemXiaojirou.setUnlocalizedName("ItemXiaojirou");
	ItemXiaojirou.setTextureName("FoodCraft:ItemXiaojirou");
	ItemXiaojirou.setCreativeTab(FoodCraft.FcTabShicai);

	ItemJichi = new ITemFood(3, 4F, false, "ItemJichi");
	ItemJichi.setUnlocalizedName("ItemJichi");
	ItemJichi.setTextureName("FoodCraft:ItemJichi");
	ItemJichi.setCreativeTab(FoodCraft.FcTabShicai);

	ItemDoufusi = new ItemKb();
	ItemDoufusi.setUnlocalizedName("ItemDoufusi");
	ItemDoufusi.setTextureName("FoodCraft:ItemDoufusi");
	ItemDoufusi.setCreativeTab(FoodCraft.FcTabShicai);

	ItemLuobosi = new ItemKb();
	ItemLuobosi.setUnlocalizedName("ItemLuobosi");
	ItemLuobosi.setTextureName("FoodCraft:ItemLuobosi");
	ItemLuobosi.setCreativeTab(FoodCraft.FcTabShicai);

	ItemHongjiu = new ItemFoodJiu(3, 8F, false, "ItemHongjiu").setAlwaysEdible();
	ItemHongjiu.setUnlocalizedName("ItemHongjiu");
	ItemHongjiu.setTextureName("FoodCraft:ItemHongjiu");
	ItemHongjiu.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemBaijiu = new ItemFoodJiu(3, 8F, false, "ItemBaijiu").setAlwaysEdible();
	ItemBaijiu.setUnlocalizedName("ItemBaijiu");
	ItemBaijiu.setTextureName("FoodCraft:ItemBaijiu");
	ItemBaijiu.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemPingguojiu = new ItemFoodJiu(3, 8F, false, "ItemPingguojiu").setAlwaysEdible();
	ItemPingguojiu.setUnlocalizedName("ItemPingguojiu");
	ItemPingguojiu.setTextureName("FoodCraft:ItemPingguojiu");
	ItemPingguojiu.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemPutaojiu = new ItemFoodJiu(3, 8F, false, "ItemPutaojiu").setAlwaysEdible();
	ItemPutaojiu.setUnlocalizedName("ItemPutaojiu");
	ItemPutaojiu.setTextureName("FoodCraft:ItemPutaojiu");
	ItemPutaojiu.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemJinputao = new ITemFood(3, 20F, false, "ItemJinputao", true);
	ItemJinputao.setUnlocalizedName("ItemJinputao");
	ItemJinputao.setTextureName("FoodCraft:ItemJinputao");
	ItemJinputao.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemJinputaojiu = new ItemFoodJinputaojiu(3, 20F, false, "ItemJinputaojiu").setAlwaysEdible();
	ItemJinputaojiu.setUnlocalizedName("ItemJinputaojiu");
	ItemJinputaojiu.setTextureName("FoodCraft:ItemJinputaojiu");
	ItemJinputaojiu.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemJinpingguojiu = new ItemFoodJinpingguojiu(3, 20F, false, "ItemJinpingguojiu").setAlwaysEdible();
	ItemJinpingguojiu.setUnlocalizedName("ItemJinpingguojiu");
	ItemJinpingguojiu.setTextureName("FoodCraft:ItemJinpingguojiu");
	ItemJinpingguojiu.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemQiaokelishui = new ItemYingliao(3, 7F, false, "ItemQiaokelishui");
	ItemQiaokelishui.setUnlocalizedName("ItemQiaokelishui");
	ItemQiaokelishui.setTextureName("FoodCraft:ItemQiaokelishui");
	ItemQiaokelishui.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemQiaokelinai = new ItemMilk(3, 7F, false, "ItemQiaokelinai").setAlwaysEdible();
	ItemQiaokelinai.setUnlocalizedName("ItemQiaokelinai");
	ItemQiaokelinai.setTextureName("FoodCraft:ItemQiaokelinai");
	ItemQiaokelinai.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemHuluobozhi = new ItemYingliao(3, 7F, false, "ItemHuluobozhi");
	ItemHuluobozhi.setUnlocalizedName("ItemHuluobozhi");
	ItemHuluobozhi.setTextureName("FoodCraft:ItemHuluobozhi");
	ItemHuluobozhi.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemPutaozhi = new ItemYingliao(3, 7F, false, "ItemPutaozhi");
	ItemPutaozhi.setUnlocalizedName("ItemPutaozhi");
	ItemPutaozhi.setTextureName("FoodCraft:ItemPutaozhi");
	ItemPutaozhi.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemPingguozhi = new ItemYingliao(3, 7F, false, "ItemPingguozhi");
	ItemPingguozhi.setUnlocalizedName("ItemPingguozhi");
	ItemPingguozhi.setTextureName("FoodCraft:ItemPingguozhi");
	ItemPingguozhi.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemShucaizhi = new ItemYingliao(3, 7F, false, "ItemShucaizhi");
	ItemShucaizhi.setUnlocalizedName("ItemShucaizhi");
	ItemShucaizhi.setTextureName("FoodCraft:ItemShucaizhi");
	ItemShucaizhi.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemJinputaozhi = new ItemYingliao(3, 20F, false, "ItemJinputaozhi", true, 0);
	ItemJinputaozhi.setUnlocalizedName("ItemJinputaozhi");
	ItemJinputaozhi.setTextureName("FoodCraft:ItemJinputaozhi");
	ItemJinputaozhi.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemJinpingguozhi = new ItemYingliao(3, 20F, false, "ItemJinpingguozhi", true, 1);
	ItemJinpingguozhi.setUnlocalizedName("ItemJinpingguozhi");
	ItemJinpingguozhi.setTextureName("FoodCraft:ItemJinpingguozhi");
	ItemJinpingguozhi.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemDounai = new ItemYingliao(3, 7F, false, "ItemDounai");
	ItemDounai.setUnlocalizedName("ItemDounai");
	ItemDounai.setTextureName("FoodCraft:ItemDounai");
	ItemDounai.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemKele = new ItemYingliao(3, 7F, false, "ItemKele");
	ItemKele.setUnlocalizedName("ItemKele");
	ItemKele.setTextureName("FoodCraft:ItemKele");
	ItemKele.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemXuebi = new ItemYingliao(3, 7F, false, "ItemXuebi");
	ItemXuebi.setUnlocalizedName("ItemXuebi");
	ItemXuebi.setTextureName("FoodCraft:ItemXuebi");
	ItemXuebi.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemQiaokelinaiice = new ItemMilk(3, 9F, false, "ItemQiaokelinaiice").setAlwaysEdible();
	ItemQiaokelinaiice.setUnlocalizedName("ItemQiaokelinaiice");
	ItemQiaokelinaiice.setTextureName("FoodCraft:ItemQiaokelinaiice");
	ItemQiaokelinaiice.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemPutaozhiice = new ItemYingliao(3, 9F, false, "ItemPutaozhiice");
	ItemPutaozhiice.setUnlocalizedName("ItemPutaozhiice");
	ItemPutaozhiice.setTextureName("FoodCraft:ItemPutaozhiice");
	ItemPutaozhiice.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemPingguozhiice = new ItemYingliao(3, 9F, false, "ItemPingguozhiice");
	ItemPingguozhiice.setUnlocalizedName("ItemPingguozhiice");
	ItemPingguozhiice.setTextureName("FoodCraft:ItemPingguozhiice");
	ItemPingguozhiice.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemJinputaozhiice = new ItemYingliao(3, 9F, false, "ItemJinputaozhiice", true, 0);
	ItemJinputaozhiice.setUnlocalizedName("ItemJinputaozhiice");
	ItemJinputaozhiice.setTextureName("FoodCraft:ItemJinputaozhiice");
	ItemJinputaozhiice.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemJinpingguozhiice = new ItemYingliao(3, 9F, false, "ItemJinpingguozhiice", true, 1);
	ItemJinpingguozhiice.setUnlocalizedName("ItemJinpingguozhiice");
	ItemJinpingguozhiice.setTextureName("FoodCraft:ItemJinpingguozhiice");
	ItemJinpingguozhiice.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemXiguazhi = new ItemYingliao(3, 7F, false, "ItemXiguazhi");
	ItemXiguazhi.setUnlocalizedName("ItemXiguazhi");
	ItemXiguazhi.setTextureName("FoodCraft:ItemXiguazhi");
	ItemXiguazhi.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemXiguazhiice = new ItemYingliao(3, 9F, false, "ItemXiguazhiice");
	ItemXiguazhiice.setUnlocalizedName("ItemXiguazhiice");
	ItemXiguazhiice.setTextureName("FoodCraft:ItemXiguazhiice");
	ItemXiguazhiice.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemMianfensi = new ItemKb();
	ItemMianfensi.setUnlocalizedName("ItemMianfensi");
	ItemMianfensi.setTextureName("FoodCraft:ItemMianfensi");
	ItemMianfensi.setCreativeTab(FoodCraft.FcTabShicai);

	ItemCha = new ItemYingliao(3, 6F, false, "ItemCha");
	ItemCha.setUnlocalizedName("ItemCha");
	ItemCha.setTextureName("FoodCraft:ItemCha");
	ItemCha.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemNaicha = new ItemMilk(3, 7F, false, "ItemXiguazhi").setAlwaysEdible();
	ItemNaicha.setUnlocalizedName("ItemNaicha");
	ItemNaicha.setTextureName("FoodCraft:ItemNaicha");
	ItemNaicha.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemKafei = new ItemMilk(3, 7F, false, "ItemKafei").setAlwaysEdible();
	ItemKafei.setUnlocalizedName("ItemKafei");
	ItemKafei.setTextureName("FoodCraft:ItemKafei");
	ItemKafei.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemBaiqiuji = new ItemZhushi(3, 18F, false, "ItemBaiqiuji");
	ItemBaiqiuji.setUnlocalizedName("ItemBaiqiuji");
	ItemBaiqiuji.setTextureName("FoodCraft:ItemBaiqiuji");
	ItemBaiqiuji.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemCongyouji = new ItemZhushi(3, 18F, false, "ItemCongyouji");
	ItemCongyouji.setUnlocalizedName("ItemCongyouji");
	ItemCongyouji.setTextureName("FoodCraft:ItemCongyouji");
	ItemCongyouji.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemKoushuiji = new ItemZhushi(3, 18F, false, "ItemKoushuiji");
	ItemKoushuiji.setUnlocalizedName("ItemKoushuiji");
	ItemKoushuiji.setTextureName("FoodCraft:ItemKoushuiji");
	ItemKoushuiji.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemLaziji = new ItemZhushi(3, 18F, false, "ItemLaziji");
	ItemLaziji.setUnlocalizedName("ItemLaziji");
	ItemLaziji.setTextureName("FoodCraft:ItemLaziji");
	ItemLaziji.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemQingzhenyu = new ItemZhushi(3, 18F, false, "ItemQingzhenyu");
	ItemQingzhenyu.setUnlocalizedName("ItemQingzhenyu");
	ItemQingzhenyu.setTextureName("FoodCraft:ItemQingzhenyu");
	ItemQingzhenyu.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemMalayu = new ItemZhushi(3, 18F, false, "ItemMalayu");
	ItemMalayu.setUnlocalizedName("ItemMalayu");
	ItemMalayu.setTextureName("FoodCraft:ItemMalayu");
	ItemMalayu.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemSuancaiyu = new ItemZhushi(3, 18F, false, "ItemSuancaiyu");
	ItemSuancaiyu.setUnlocalizedName("ItemSuancaiyu");
	ItemSuancaiyu.setTextureName("FoodCraft:ItemSuancaiyu");
	ItemSuancaiyu.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemKelejichifan = new ItemZhushi(3, 20F, false, "ItemKelejichifan");
	ItemKelejichifan.setUnlocalizedName("ItemKelejichifan");
	ItemKelejichifan.setTextureName("FoodCraft:ItemKelejichifan");
	ItemKelejichifan.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemGalijiroufan = new ItemZhushi(3, 18F, false, "ItemGalijiroufan");
	ItemGalijiroufan.setUnlocalizedName("ItemGalijiroufan");
	ItemGalijiroufan.setTextureName("FoodCraft:ItemGalijiroufan");
	ItemGalijiroufan.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemGalikuai = new ITemFood(3, 3F, false, "ItemGalikuai");
	ItemGalikuai.setUnlocalizedName("ItemGalikuai");
	ItemGalikuai.setTextureName("FoodCraft:ItemGalikuai");
	ItemGalikuai.setCreativeTab(FoodCraft.FcTabShicai);

	ItemShuizhuniurou = new ItemZhushi(3, 18F, false, "ItemShuizhuniurou");
	ItemShuizhuniurou.setUnlocalizedName("ItemShuizhuniurou");
	ItemShuizhuniurou.setTextureName("FoodCraft:ItemShuizhuniurou");
	ItemShuizhuniurou.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemMian = new ITemFood(3, 7F, false, "ItemMian");
	ItemMian.setUnlocalizedName("ItemMian");
	ItemMian.setTextureName("FoodCraft:ItemMian");
	ItemMian.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemGuoqiaomixian = new ITemFood(3, 7F, false, "ItemGuoqiaomixian");
	ItemGuoqiaomixian.setUnlocalizedName("ItemGuoqiaomixian");
	ItemGuoqiaomixian.setTextureName("FoodCraft:ItemGuoqiaomixian");
	ItemGuoqiaomixian.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemYifen = new ITemFood(3, 7F, false, "ItemYifen");
	ItemYifen.setUnlocalizedName("ItemYifen");
	ItemYifen.setTextureName("FoodCraft:ItemYifen");
	ItemYifen.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemYifenpork = new ItemZhushi(3, 18F, false, "ItemYifenpork");
	ItemYifenpork.setUnlocalizedName("ItemYifenpork");
	ItemYifenpork.setTextureName("FoodCraft:ItemYifenpork");
	ItemYifenpork.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemYifenbeef = new ItemZhushi(3, 18F, false, "ItemYifenbeef");
	ItemYifenbeef.setUnlocalizedName("ItemYifenbeef");
	ItemYifenbeef.setTextureName("FoodCraft:ItemYifenbeef");
	ItemYifenbeef.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemYifenchicken = new ItemZhushi(3, 18F, false, "ItemYifenchicken");
	ItemYifenchicken.setUnlocalizedName("ItemYifenchicken");
	ItemYifenchicken.setTextureName("FoodCraft:ItemYifenchicken");
	ItemYifenchicken.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemPidanshourouzhou = new ITemFood(3, 7F, false, "ItemPidanshourouzhou");
	ItemPidanshourouzhou.setUnlocalizedName("ItemPidanshourouzhou");
	ItemPidanshourouzhou.setTextureName("FoodCraft:ItemPidanshourouzhou");
	ItemPidanshourouzhou.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemYuebing = new ITemFood(3, 8F, false, "ItemYuebing");
	ItemYuebing.setUnlocalizedName("ItemYuebing");
	ItemYuebing.setTextureName("FoodCraft:ItemYuebing");
	ItemYuebing.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemMantou = new ITemFood(3, 4F, false, "ItemMantou");
	ItemMantou.setUnlocalizedName("ItemMantou");
	ItemMantou.setTextureName("FoodCraft:ItemMantou");
	ItemMantou.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemSuancaibing = new ITemFood(3, 7F, false, "ItemSuancaibing");
	ItemSuancaibing.setUnlocalizedName("ItemSuancaibing");
	ItemSuancaibing.setTextureName("FoodCraft:ItemSuancaibing");
	ItemSuancaibing.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemYoutiao = new ITemFood(3, 8F, false, "ItemYoutiao");
	ItemYoutiao.setUnlocalizedName("ItemYoutiao");
	ItemYoutiao.setTextureName("FoodCraft:ItemYoutiao");
	ItemYoutiao.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemLatiao = new ITemFood(3, 4F, false, "ItemLatiao");
	ItemLatiao.setUnlocalizedName("ItemLatiao");
	ItemLatiao.setTextureName("FoodCraft:ItemLatiao");
	ItemLatiao.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemHetaosu = new ITemFood(3, 8F, false, "ItemHetaosu");
	ItemHetaosu.setUnlocalizedName("ItemHetaosu");
	ItemHetaosu.setTextureName("FoodCraft:ItemHetaosu");
	ItemHetaosu.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemAici = new ITemFood(3, 8F, false, "ItemAici");
	ItemAici.setUnlocalizedName("ItemAici");
	ItemAici.setTextureName("FoodCraft:ItemAici");
	ItemAici.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemCiba = new ITemFood(3, 7F, false, "ItemCiba");
	ItemCiba.setUnlocalizedName("ItemCiba");
	ItemCiba.setTextureName("FoodCraft:ItemCiba");
	ItemCiba.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemChangfen = new ITemFood(3, 7F, false, "ItemChangfen");
	ItemChangfen.setUnlocalizedName("ItemChangfen");
	ItemChangfen.setTextureName("FoodCraft:ItemChangfen");
	ItemChangfen.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemXiangchang = new ITemFood(3, 6F, false, "ItemXiangchang");
	ItemXiangchang.setUnlocalizedName("ItemXiangchang");
	ItemXiangchang.setTextureName("FoodCraft:ItemXiangchang");
	ItemXiangchang.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemRegou = new ITemFood(3, 8F, false, "ItemRegou");
	ItemRegou.setUnlocalizedName("ItemRegou");
	ItemRegou.setTextureName("FoodCraft:ItemRegou");
	ItemRegou.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemLachang = new ITemFood(3, 8F, false, "ItemLachang");
	ItemLachang.setUnlocalizedName("ItemLachang");
	ItemLachang.setTextureName("FoodCraft:ItemLachang");
	ItemLachang.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemLarou = new ITemFood(3, 9F, false, "ItemLarou");
	ItemLarou.setUnlocalizedName("ItemLarou");
	ItemLarou.setTextureName("FoodCraft:ItemLarou");
	ItemLarou.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemZhaxiangchang = new ITemFood(3, 8F, false, "ItemZhaxiangchang");
	ItemZhaxiangchang.setUnlocalizedName("ItemZhaxiangchang");
	ItemZhaxiangchang.setTextureName("FoodCraft:ItemZhaxiangchang");
	ItemZhaxiangchang.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemRibendoufu = new ItemZhushi(3, 18F, false, "ItemRibendoufu");
	ItemRibendoufu.setUnlocalizedName("ItemRibendoufu");
	ItemRibendoufu.setTextureName("FoodCraft:ItemRibendoufu");
	ItemRibendoufu.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemLabazhou = new ITemFood(3, 9F, false, "ItemLabazhou");
	ItemLabazhou.setUnlocalizedName("ItemLabazhou");
	ItemLabazhou.setTextureName("FoodCraft:ItemLabazhou");
	ItemLabazhou.setCreativeTab(FoodCraft.FcTabZhushi);

	ItemLaweixunliao = new ItemKb();
	ItemLaweixunliao.setUnlocalizedName("ItemLaweixunliao");
	ItemLaweixunliao.setTextureName("FoodCraft:ItemLaweixunliao");
	ItemLaweixunliao.setCreativeTab(FoodCraft.FcTabShicai);

	ItemNainao = new ITemFood(3, 5F, false, "ItemNainao");
	ItemNainao.setUnlocalizedName("ItemNainao");
	ItemNainao.setTextureName("FoodCraft:ItemNainao");
	ItemNainao.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemPisa = new ITemFood(3, 12F, false, "ItemPisa");
	ItemPisa.setUnlocalizedName("ItemPisa");
	ItemPisa.setTextureName("FoodCraft:ItemPisa");
	ItemPisa.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemHanbaobao = new ITemFood(3, 12F, false, "ItemHanbaobao");
	ItemHanbaobao.setUnlocalizedName("ItemHanbaobao");
	ItemHanbaobao.setTextureName("FoodCraft:ItemHanbaobao");
	ItemHanbaobao.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemYangrou = new ITemFood(3, 8F, false, "ItemYangrou");
	ItemYangrou.setUnlocalizedName("ItemYangrou");
	ItemYangrou.setTextureName("FoodCraft:ItemYangrou");
	ItemYangrou.setCreativeTab(FoodCraft.FcTabShicai);

	ItemShuyangrou = new ITemFood(3, 10F, false, "ItemShuyangrou");
	ItemShuyangrou.setUnlocalizedName("ItemShuyangrou");
	ItemShuyangrou.setTextureName("FoodCraft:ItemShuyangrou");
	ItemShuyangrou.setCreativeTab(FoodCraft.FcTabShicai);

	ItemYouyurou = new ITemFood(3, 8F, false, "ItemYouyurou");
	ItemYouyurou.setUnlocalizedName("ItemYouyurou");
	ItemYouyurou.setTextureName("FoodCraft:ItemYouyurou");
	ItemYouyurou.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemShuyouyurou = new ITemFood(3, 10F, false, "ItemShuyouyurou");
	ItemShuyouyurou.setUnlocalizedName("ItemShuyouyurou");
	ItemShuyouyurou.setTextureName("FoodCraft:ItemShuyouyurou");
	ItemShuyouyurou.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemYouyusi = new ITemFood(3, 3F, false, "ItemYouyusi");
	ItemYouyusi.setUnlocalizedName("ItemYouyusi");
	ItemYouyusi.setTextureName("FoodCraft:ItemYouyusi");
	ItemYouyusi.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemShucai = new ITemFood(3, 3F, false, "ItemShucai");
	ItemShucai.setUnlocalizedName("ItemShucai");
	ItemShucai.setTextureName("FoodCraft:ItemShucai");
	ItemShucai.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemLajiao = new ItemChili();
	ItemLajiao.setUnlocalizedName("ItemLajiao");
	ItemLajiao.setTextureName("FoodCraft:ItemLajiao");
	ItemLajiao.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemFanqie = new ITemFood(3, 3F, false, "ItemFanqie");
	ItemFanqie.setUnlocalizedName("ItemFanqie");
	ItemFanqie.setTextureName("FoodCraft:ItemFanqie");
	ItemFanqie.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemPutao = new ITemFood(3, 3F, false, "ItemPutao");
	ItemPutao.setUnlocalizedName("ItemPutao");
	ItemPutao.setTextureName("FoodCraft:ItemPutao");
	ItemPutao.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemQiezi = new ITemFood(3, 3F, false, "ItemQiezi");
	ItemQiezi.setUnlocalizedName("ItemQiezi");
	ItemQiezi.setTextureName("FoodCraft:ItemQiezi");
	ItemQiezi.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemQingjiao = new ITemFood(3, 3F, false, "ItemQingjiao");
	ItemQingjiao.setUnlocalizedName("ItemQingjiao");
	ItemQingjiao.setTextureName("FoodCraft:ItemQingjiao");
	ItemQingjiao.setCreativeTab(FoodCraft.FcTabZhiwu);
	/*ItemHongdou,ItemLvdou,ItemHongshu;*/

	ItemBailuobo = new ItemHongshu(ModBlocks.BlockBailuobo, 3);
	MinecraftForge.addGrassSeed(new ItemStack(ItemBailuobo), 2);
	ItemBailuobo.setUnlocalizedName("ItemBailuobo");
	ItemBailuobo.setTextureName("FoodCraft:ItemBailuobo");
	ItemBailuobo.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemQingjiaozhong = new ItemCropPlant(ModBlocks.BlockQingjiao);
	MinecraftForge.addGrassSeed(new ItemStack(ItemQingjiaozhong), 2);
	ItemQingjiaozhong.setUnlocalizedName("ItemQingjiaozhong");
	ItemQingjiaozhong.setTextureName("FoodCraft:ItemQingjiaozhong");
	ItemQingjiaozhong.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemHongdou = new ItemCropPlant(ModBlocks.BlockHongdou);
	MinecraftForge.addGrassSeed(new ItemStack(ItemHongdou), 2);
	ItemHongdou.setUnlocalizedName("ItemHongdou");
	ItemHongdou.setTextureName("FoodCraft:ItemHongdou");
	ItemHongdou.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemLvdou = new ItemCropPlant(ModBlocks.BlockLvdou);
	MinecraftForge.addGrassSeed(new ItemStack(ItemHongdou), 2);
	ItemLvdou.setUnlocalizedName("ItemLvdou");
	ItemLvdou.setTextureName("FoodCraft:ItemLvdou");
	ItemLvdou.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemHongshu = new ItemHongshu(ModBlocks.BlockHongshu, 3);
	MinecraftForge.addGrassSeed(new ItemStack(ItemHongdou), 2);
	ItemHongshu.setUnlocalizedName("ItemHongshu");
	ItemHongshu.setTextureName("FoodCraft:ItemHongshu");
	ItemHongshu.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemKaohongshu = new ITemFood(3, 8F, false, "ItemKaohongshu");
	ItemKaohongshu.setUnlocalizedName("ItemKaohongshu");
	ItemKaohongshu.setTextureName("FoodCraft:ItemKaohongshu");
	ItemKaohongshu.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemDoujiao = new ITemFood(3, 3F, false, "ItemDoujiao");
	ItemDoujiao.setUnlocalizedName("ItemDoujiao");
	ItemDoujiao.setTextureName("FoodCraft:ItemDoujiao");
	ItemDoujiao.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemWrench = new ItemWrench("ItemWrench");
	ItemWrench.setUnlocalizedName("ItemWrench");
	ItemWrench.setTextureName("FoodCraft:ItemWrench");
	ItemWrench.setCreativeTab(FoodCraft.FcTabJiqi);
	ItemWrench.setMaxStackSize(1);

	ItemYumi = new ITemFood(3, 3F, false, "ItemYumi");
	ItemYumi.setUnlocalizedName("ItemYumi");
	ItemYumi.setTextureName("FoodCraft:ItemYumi");
	ItemYumi.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemHuanggua = new ITemFood(3, 3F, false, "ItemHuanggua");
	ItemHuanggua.setUnlocalizedName("ItemHuanggua");
	ItemHuanggua.setTextureName("FoodCraft:ItemHuanggua");
	ItemHuanggua.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemYumizhong = new ItemCropPlant(ModBlocks.BlockYumi);
	MinecraftForge.addGrassSeed(new ItemStack(ItemYumizhong), 2);
	ItemYumizhong.setUnlocalizedName("ItemYumizhong");
	ItemYumizhong.setTextureName("FoodCraft:ItemYumizhong");
	ItemYumizhong.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemHuangguazhong = new ItemCropPlant(ModBlocks.BlockHuanggua);
	MinecraftForge.addGrassSeed(new ItemStack(ItemHongdou), 2);
	ItemHuangguazhong.setUnlocalizedName("ItemHuangguazhong");
	ItemHuangguazhong.setTextureName("FoodCraft:ItemHuangguazhong");
	ItemHuangguazhong.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemBailuobosi = new ItemKb();
	ItemBailuobosi.setUnlocalizedName("ItemBailuobosi");
	ItemBailuobosi.setTextureName("FoodCraft:ItemBailuobosi");
	ItemBailuobosi.setCreativeTab(FoodCraft.FcTabShicai);

	ItemBailuobozhi = new ItemYingliao(3, 8F, false, "ItemBailuobozhi");
	ItemBailuobozhi.setUnlocalizedName("ItemBailuobozhi");
	ItemBailuobozhi.setTextureName("FoodCraft:ItemBailuobozhi");
	ItemBailuobozhi.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemFanqiezhi = new ItemYingliao(3, 8F, false, "ItemFanqiezhi");
	ItemFanqiezhi.setUnlocalizedName("ItemFanqiezhi");
	ItemFanqiezhi.setTextureName("FoodCraft:ItemFanqiezhi");
	ItemFanqiezhi.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemHuangguazhi = new ItemYingliao(3, 8F, false, "ItemHuangguazhi");
	ItemHuangguazhi.setUnlocalizedName("ItemHuangguazhi");
	ItemHuangguazhi.setTextureName("FoodCraft:ItemHuangguazhi");
	ItemHuangguazhi.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemYumizhi = new ItemYingliao(3, 8F, false, "ItemYumizhi");
	ItemYumizhi.setUnlocalizedName("ItemYumizhi");
	ItemYumizhi.setTextureName("FoodCraft:ItemYumizhi");
	ItemYumizhi.setCreativeTab(FoodCraft.FcTabYingliao);

	ItemDousha = new ItemKb();
	ItemDousha.setUnlocalizedName("ItemDousha");
	ItemDousha.setTextureName("FoodCraft:ItemDousha");
	ItemDousha.setCreativeTab(FoodCraft.FcTabShicai);

	ItemKaoyumi = new ITemFood(3, 6F, false, "ItemKaoyumi");
	ItemKaoyumi.setUnlocalizedName("ItemKaoyumi");
	ItemKaoyumi.setTextureName("FoodCraft:ItemKaoyumi");
	ItemKaoyumi.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemBaoyumihua = new ITemFood(3, 6F, false, "ItemBaoyumihua");
	ItemBaoyumihua.setUnlocalizedName("ItemBaoyumihua");
	ItemBaoyumihua.setTextureName("FoodCraft:ItemBaoyumihua");
	ItemBaoyumihua.setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemLi = new ITemFood(3, 2F, false, "ItemLi");
	ItemLi.setUnlocalizedName("ItemLi");
	ItemLi.setTextureName("FoodCraft:ItemLi");
	ItemLi.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemLizhi = new ITemFood(3, 2F, false, "ItemLizhi");
	ItemLizhi.setUnlocalizedName("ItemLizhi");
	ItemLizhi.setTextureName("FoodCraft:ItemLizhi");
	ItemLizhi.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemTaozi = new ITemFood(3, 2F, false, "ItemTaozi");
	ItemTaozi.setUnlocalizedName("ItemTaozi");
	ItemTaozi.setTextureName("FoodCraft:ItemTaozi");
	ItemTaozi.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemJuzi = new ITemFood(3, 2F, false, "ItemJuzi");
	ItemJuzi.setUnlocalizedName("ItemJuzi");
	ItemJuzi.setTextureName("FoodCraft:ItemJuzi");
	ItemJuzi.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemPipa = new ITemFood(3, 2F, false, "ItemPipa");
	ItemPipa.setUnlocalizedName("ItemPipa");
	ItemPipa.setTextureName("FoodCraft:ItemPipa");
	ItemPipa.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemMangguo = new ITemFood(3, 2F, false, "ItemMangguo");
	ItemMangguo.setUnlocalizedName("ItemMangguo");
	ItemMangguo.setTextureName("FoodCraft:ItemMangguo");
	ItemMangguo.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemNingmeng = new ITemFood(3, 2F, false, "ItemNingmeng");
	ItemNingmeng.setUnlocalizedName("ItemNingmeng");
	ItemNingmeng.setTextureName("FoodCraft:ItemNingmeng");
	ItemNingmeng.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemYouzi = new ITemFood(3, 2F, false, "ItemYouzi");
	ItemYouzi.setUnlocalizedName("ItemYouzi");
	ItemYouzi.setTextureName("FoodCraft:ItemYouzi");
	ItemYouzi.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemShizi = new ITemFood(3, 2F, false, "ItemShizi");
	ItemShizi.setUnlocalizedName("ItemShizi");
	ItemShizi.setTextureName("FoodCraft:ItemShizi");
	ItemShizi.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemMugua = new ITemFood(3, 2F, false, "ItemMugua");
	ItemMugua.setUnlocalizedName("ItemMugua");
	ItemMugua.setTextureName("FoodCraft:ItemMugua");
	ItemMugua.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemShanzha = new ITemFood(3, 2F, false, "ItemShanzha");
	ItemShanzha.setUnlocalizedName("ItemShanzha");
	ItemShanzha.setTextureName("FoodCraft:ItemShanzha");
	ItemShanzha.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemLongyan = new ITemFood(3, 2F, false, "ItemLongyan");
	ItemLongyan.setUnlocalizedName("ItemLongyan");
	ItemLongyan.setTextureName("FoodCraft:ItemLongyan");
	ItemLongyan.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemShiliu = new ITemFood(3, 2F, false, "ItemShiliu");
	ItemShiliu.setUnlocalizedName("ItemShiliu");
	ItemShiliu.setTextureName("FoodCraft:ItemShiliu");
	ItemShiliu.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemCaomei = new ItemHongshu(ModBlocks.BlockCaomei, 3);
	MinecraftForge.addGrassSeed(new ItemStack(ItemCaomei), 2);
	ItemCaomei.setUnlocalizedName("ItemCaomei");
	ItemCaomei.setTextureName("FoodCraft:ItemCaomei");
	ItemCaomei.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemHongzao = new ITemFood(3, 2F, false, "ItemHongzao");
	ItemHongzao.setUnlocalizedName("ItemHongzao");
	ItemHongzao.setTextureName("FoodCraft:ItemHongzao");
	ItemHongzao.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemYezi = new ITemFood(3, 2F, false, "ItemYezi");
	ItemYezi.setUnlocalizedName("ItemYezi");
	ItemYezi.setTextureName("FoodCraft:ItemYezi");
	ItemYezi.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemYingtao = new ITemFood(3, 2F, false, "ItemYingtao");
	ItemYingtao.setUnlocalizedName("ItemYingtao");
	ItemYingtao.setTextureName("FoodCraft:ItemYingtao");
	ItemYingtao.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemXiangjiao = new ITemFood(3, 2F, false, "ItemXiangjiao");
	ItemXiangjiao.setUnlocalizedName("ItemXiangjiao");
	ItemXiangjiao.setTextureName("FoodCraft:ItemXiangjiao");
	ItemXiangjiao.setCreativeTab(FoodCraft.FcTabZhiwu);

	ItemJinkela = new ItemKb();
	ItemJinkela.setUnlocalizedName("ItemJinkela");
	ItemJinkela.setTextureName("FoodCraft:ItemJinkela");
	ItemJinkela.setCreativeTab(FoodCraft.FcTabJiqi);

	ItemLizizhi = new ItemYingliao(3, 8F, false, "ItemLizizhi").setUnlocalizedName("ItemLizizhi")
		.setTextureName("FoodCraft:ItemLizizhi").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemLizhizhi = new ItemYingliao(3, 8F, false, "ItemLizhizhi").setUnlocalizedName("ItemLizhizhi")
		.setTextureName("FoodCraft:ItemLizhizhi").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemTaozizhi = new ItemYingliao(3, 8F, false, "ItemTaozizhi").setUnlocalizedName("ItemTaozizhi")
		.setTextureName("FoodCraft:ItemTaozizhi").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemJuzizhi = new ItemYingliao(3, 8F, false, "ItemJuzizhi").setUnlocalizedName("ItemJuzizhi")
		.setTextureName("FoodCraft:ItemJuzizhi").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemPipazhi = new ItemYingliao(3, 8F, false, "ItemPipazhi").setUnlocalizedName("ItemPipazhi")
		.setTextureName("FoodCraft:ItemPipazhi").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemMangguozhi = new ItemYingliao(3, 8F, false, "ItemMangguozhi").setUnlocalizedName("ItemMangguozhi")
		.setTextureName("FoodCraft:ItemMangguozhi").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemNingmengzhi = new ItemYingliao(3, 8F, false, "ItemNingmengzhi").setUnlocalizedName("ItemNingmengzhi")
		.setTextureName("FoodCraft:ItemNingmengzhi").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemYouzizhi = new ItemYingliao(3, 8F, false, "ItemYouzizhi").setUnlocalizedName("ItemYouzizhi")
		.setTextureName("FoodCraft:ItemYouzizhi").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemShizizhi = new ItemYingliao(3, 8F, false, "ItemShizizhi").setUnlocalizedName("ItemShizizhi")
		.setTextureName("FoodCraft:ItemShizizhi").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemMuguazhi = new ItemYingliao(3, 8F, false, "ItemMuguazhi").setUnlocalizedName("ItemMuguazhi")
		.setTextureName("FoodCraft:ItemMuguazhi").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemShanzhazhi = new ItemYingliao(3, 8F, false, "ItemShanzhazhi").setUnlocalizedName("ItemShanzhazhi")
		.setTextureName("FoodCraft:ItemShanzhazhi").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemShiliuzhi = new ItemYingliao(3, 8F, false, "ItemShiliuzhi").setUnlocalizedName("ItemShiliuzhi")
		.setTextureName("FoodCraft:ItemShiliuzhi").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemHongzaozhi = new ItemYingliao(3, 8F, false, "ItemHongzaozhi").setUnlocalizedName("ItemHongzaozhi")
		.setTextureName("FoodCraft:ItemHongzaozhi").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemCaomeizhi = new ItemYingliao(3, 8F, false, "ItemCaomeizhi").setUnlocalizedName("ItemCaomeizhi")
		.setTextureName("FoodCraft:ItemCaomeizhi").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemYezizhi = new ItemYingliao(3, 8F, false, "ItemYezizhi").setUnlocalizedName("ItemYezizhi")
		.setTextureName("FoodCraft:ItemYezizhi").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemYingtaozhi = new ItemYingliao(3, 8F, false, "ItemYingtaozhi").setUnlocalizedName("ItemYingtaozhi")
		.setTextureName("FoodCraft:ItemYingtaozhi").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemXiangjiaozhi = new ItemYingliao(3, 8F, false, "ItemXiangjiaozhi").setUnlocalizedName("ItemXiangjiaozhi")
		.setTextureName("FoodCraft:ItemXiangjiaozhi").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemYenai = new ItemYingliao(3, 8F, false, "ItemYenai").setUnlocalizedName("ItemYenai")
		.setTextureName("FoodCraft:ItemYenai").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemLizhizhiice = new ItemYingliao(3, 9F, false, "ItemLizhizhiice").setUnlocalizedName("ItemLizhizhiice")
		.setTextureName("FoodCraft:ItemLizhizhiice").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemTaozizhiice = new ItemYingliao(3, 9F, false, "ItemTaozizhiice").setUnlocalizedName("ItemTaozizhiice")
		.setTextureName("FoodCraft:ItemTaozizhiice").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemJuzizhiice = new ItemYingliao(3, 9F, false, "ItemJuzizhiice").setUnlocalizedName("ItemJuzizhiice")
		.setTextureName("FoodCraft:ItemJuzizhiice").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemMangguozhiice = new ItemYingliao(3, 9F, false, "ItemMangguozhiice").setUnlocalizedName("ItemMangguozhiice")
		.setTextureName("FoodCraft:ItemMangguozhiice").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemNingmengzhiice = new ItemYingliao(3, 9F, false, "ItemNingmengzhiice").setUnlocalizedName("ItemNingmengzhiice")
		.setTextureName("FoodCraft:ItemNingmengzhiice").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemMuguazhiice = new ItemYingliao(3, 9F, false, "ItemMuguazhiice").setUnlocalizedName("ItemMuguazhiice")
		.setTextureName("FoodCraft:ItemMuguazhiice").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemCaomeizhiice = new ItemYingliao(3, 9F, false, "ItemCaomeizhiice").setUnlocalizedName("ItemCaomeizhiice")
		.setTextureName("FoodCraft:ItemCaomeizhiice").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemYezizhiice = new ItemYingliao(3, 9F, false, "ItemYezizhiice").setUnlocalizedName("ItemYezizhiice")
		.setTextureName("FoodCraft:ItemYezizhiice").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemXiangjiaozhiice = new ItemYingliao(3, 9F, false, "ItemXiangjiaozhiice").setUnlocalizedName("ItemXiangjiaozhiice")
		.setTextureName("FoodCraft:ItemXiangjiaozhiice").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemLizijiu = new ItemFoodJiu(3, 8F, false, "ItemLizijiu").setAlwaysEdible().setUnlocalizedName("ItemLizijiu")
		.setTextureName("FoodCraft:ItemLizijiu").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemLizhijiu = new ItemFoodJiu(3, 8F, false, "ItemLizhijiu").setAlwaysEdible().setUnlocalizedName("ItemLizhijiu")
		.setTextureName("FoodCraft:ItemLizhijiu").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemTaozijiu = new ItemFoodJiu(3, 8F, false, "ItemTaozijiu").setAlwaysEdible().setUnlocalizedName("ItemTaozijiu")
		.setTextureName("FoodCraft:ItemTaozijiu").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemMangguojiu = new ItemFoodJiu(3, 8F, false, "ItemMangguojiu").setAlwaysEdible().setUnlocalizedName("ItemMangguojiu")
		.setTextureName("FoodCraft:ItemMangguojiu").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemNingmengjiu = new ItemFoodJiu(3, 8F, false, "ItemNingmengjiu").setAlwaysEdible().setUnlocalizedName("ItemNingmengjiu")
		.setTextureName("FoodCraft:ItemNingmengjiu").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemShiliujiu = new ItemFoodJiu(3, 8F, false, "ItemShiliujiu").setAlwaysEdible().setUnlocalizedName("ItemShiliujiu")
		.setTextureName("FoodCraft:ItemShiliujiu").setCreativeTab(FoodCraft.FcTabYingliao);

	ItemGuojiang = new ItemGuojiang().setUnlocalizedName("ItemGuojiang")
		.setTextureName("FoodCraft:ItemGuojiang").setCreativeTab(FoodCraft.FcTabShicai);

	ItemBinggan = new ItemBinggan(3, 10F, false, "ItemBinggan").setUnlocalizedName("ItemBinggan")
		.setTextureName("FoodCraft:ItemBinggan").setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemDangao = new ItemDangao().setUnlocalizedName("ItemDangao")
		.setTextureName("FoodCraft:ItemDangao").setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemBingganF = new ITemFood(3, 6F, false, "ItemBingganF").setUnlocalizedName("ItemBingganF")
		.setTextureName("FoodCraft:ItemBinggan").setCreativeTab(FoodCraft.FcTabXiaodian);
	ItemBingganXN = new ITemFood(3, 7F, false, "ItemBingganXN").setUnlocalizedName("ItemBingganXN")
		.setTextureName("FoodCraft:ItemBingganXN").setCreativeTab(FoodCraft.FcTabXiaodian);

	ItemTest = new ItemTest().setUnlocalizedName("ItemTest")
		.setTextureName("FoodCraft:ItemTest").setCreativeTab(CreativeTabs.tabTools);
	GameRegistry.registerItem(ItemTest, "ItemTest");
	/**
	 * ------------------------------ �������� ------------------------------
	 */
	GameRegistry.registerItem(ItemTiepian, "ItemTiepian");
	GameRegistry.registerItem(ItemJinghuashuitong, "ItemJinghuashuitong");
	GameRegistry.registerItem(ItemDianluban, "ItemDianluban");
	GameRegistry.registerItem(ItemCaidao, "ItemCaidao");
	GameRegistry.registerItem(ItemCaidaoHJ, "ItemCaidaoHJ");
	GameRegistry.registerItem(ItemCaidaoZS, "ItemCaidaoZS");
	GameRegistry.registerItem(ItemCaidaoLBS, "ItemCaidaoLBS");
	GameRegistry.registerItem(ItemWrench, "ItemWrench");
	GameRegistry.registerItem(ItemJinkela, "ItemJinkela");
	GameRegistry.registerItem(ItemNull, "ItemNull");
	/**
	 * ------------------------------ ֲ�� ------------------------------
	 */
	GameRegistry.registerItem(ItemDami, "ItemDami");
	GameRegistry.registerItem(ItemHuashen, "ItemHuashen");
	GameRegistry.registerItem(ItemDouzi, "ItemDouzi");
	GameRegistry.registerItem(ItemNuomi, "ItemNuomi");
	GameRegistry.registerItem(ItemHongdou, "ItemHongdou");
	GameRegistry.registerItem(ItemLvdou, "ItemLvdou");

	GameRegistry.registerItem(ItemBailuobo, "ItemBailuobo");
	GameRegistry.registerItem(ItemShucai, "ItemShucai");
	GameRegistry.registerItem(ItemLajiao, "ItemLajiao");
	GameRegistry.registerItem(ItemQingjiao, "ItemQingjiao");
	GameRegistry.registerItem(ItemFanqie, "ItemFanqie");
	GameRegistry.registerItem(ItemQiezi, "ItemQiezi");
	GameRegistry.registerItem(ItemCong, "ItemCong");
	GameRegistry.registerItem(ItemDoujiao, "ItemDoujiao");
	GameRegistry.registerItem(ItemHuanggua, "ItemHuanggua");
	GameRegistry.registerItem(ItemYumi, "ItemYumi");

	GameRegistry.registerItem(ItemHongshu, "ItemHongshu");
	GameRegistry.registerItem(ItemZongye, "ItemZongye");
	GameRegistry.registerItem(ItemPutao, "ItemPutao");
	GameRegistry.registerItem(ItemJinputao, "ItemJinputao");
	GameRegistry.registerItem(ItemLi, "ItemLi");
	GameRegistry.registerItem(ItemLizhi, "ItemLizhi");
	GameRegistry.registerItem(ItemTaozi, "ItemTaozi");
	GameRegistry.registerItem(ItemJuzi, "ItemJuzi");
	GameRegistry.registerItem(ItemPipa, "ItemPipa");
	GameRegistry.registerItem(ItemMangguo, "ItemMangguo");
	GameRegistry.registerItem(ItemNingmeng, "ItemNingmeng");
	GameRegistry.registerItem(ItemYouzi, "ItemYouzi");
	GameRegistry.registerItem(ItemShizi, "ItemShizi");
	GameRegistry.registerItem(ItemMugua, "ItemMugua");
	GameRegistry.registerItem(ItemShanzha, "ItemShanzha");
	GameRegistry.registerItem(ItemLongyan, "ItemLongyan");
	GameRegistry.registerItem(ItemShiliu, "ItemShiliu");
	GameRegistry.registerItem(ItemHongzao, "ItemHongzao");
	GameRegistry.registerItem(ItemCaomei, "ItemCaomei");
	GameRegistry.registerItem(ItemYezi, "ItemYezi");
	GameRegistry.registerItem(ItemYingtao, "ItemYingtao");
	GameRegistry.registerItem(ItemXiangjiao, "ItemXiangjiao");

	GameRegistry.registerItem(ItemShucaizhong, "ItemShucaizhong");
	GameRegistry.registerItem(ItemLajiaozhong, "ItemLajiaozhong");
	GameRegistry.registerItem(ItemFanqiezhong, "ItemFanqiezhong");
	GameRegistry.registerItem(ItemPutaozhong, "ItemPutaozhong");
	GameRegistry.registerItem(ItemQiezizhong, "ItemQiezizhong");
	GameRegistry.registerItem(ItemQingjiaozhong, "ItemQingjiaozhong");
	GameRegistry.registerItem(ItemYumizhong, "ItemYumizhong");
	GameRegistry.registerItem(ItemHuangguazhong, "ItemHuangguazhong");
	new NEIAPI().loadConfig();
	/**
	 * ------------------------------ ���� ------------------------------
	 */
	GameRegistry.registerItem(ItemDoujiang, "ItemDoujiang");
	GameRegistry.registerItem(ItemHongjiu, "ItemHongjiu");
	GameRegistry.registerItem(ItemBaijiu, "ItemBaijiu");
	GameRegistry.registerItem(ItemPutaojiu, "ItemPutaojiu");
	GameRegistry.registerItem(ItemPingguojiu, "ItemPingguojiu");
	GameRegistry.registerItem(ItemJinputaojiu, "ItemJinputaojiu");
	GameRegistry.registerItem(ItemJinpingguojiu, "ItemJinpingguojiu");
	GameRegistry.registerItem(ItemLizijiu, "ItemLizijiu");
	GameRegistry.registerItem(ItemLizhijiu, "ItemLizhijiu");
	GameRegistry.registerItem(ItemTaozijiu, "ItemTaozijiu");
	GameRegistry.registerItem(ItemMangguojiu, "ItemMangguojiu");
	GameRegistry.registerItem(ItemNingmengjiu, "ItemNingmengjiu");
	GameRegistry.registerItem(ItemShiliujiu, "ItemShiliujiu");

	GameRegistry.registerItem(ItemQiaokelishui, "ItemQiaokelishui");
	GameRegistry.registerItem(ItemHuluobozhi, "ItemHuluobozhi");
	GameRegistry.registerItem(ItemCha, "ItemCha");
	GameRegistry.registerItem(ItemPutaozhi, "ItemPutaozhi");
	GameRegistry.registerItem(ItemPingguozhi, "ItemPingguozhi");
	GameRegistry.registerItem(ItemShucaizhi, "ItemShucaizhi");
	GameRegistry.registerItem(ItemXiguazhi, "ItemXiguazhi");
	GameRegistry.registerItem(ItemJinputaozhi, "ItemJinputaozhi");
	GameRegistry.registerItem(ItemJinpingguozhi, "ItemJinpingguozhi");
	GameRegistry.registerItem(ItemKele, "ItemKele");
	GameRegistry.registerItem(ItemXuebi, "ItemXuebi");
	GameRegistry.registerItem(ItemNaicha, "ItemNaicha");
	GameRegistry.registerItem(ItemKafei, "ItemKafei");
	GameRegistry.registerItem(ItemQiaokelinai, "ItemQiaokelinai");
	GameRegistry.registerItem(ItemDounai, "ItemDounai");
	GameRegistry.registerItem(ItemBailuobozhi, "ItemBailuobozhi");
	GameRegistry.registerItem(ItemFanqiezhi, "ItemFanqiezhi");
	GameRegistry.registerItem(ItemYumizhi, "ItemYumizhi");
	GameRegistry.registerItem(ItemHuangguazhi, "ItemHuangguazhi");

	GameRegistry.registerItem(ItemLizizhi, "ItemLizizhi");
	GameRegistry.registerItem(ItemLizhizhi, "ItemLizhizhi");
	GameRegistry.registerItem(ItemTaozizhi, "ItemTaozizhi");
	GameRegistry.registerItem(ItemJuzizhi, "ItemJuzizhi");
	GameRegistry.registerItem(ItemPipazhi, "ItemPipazhi");
	GameRegistry.registerItem(ItemMangguozhi, "ItemMangguozhi");
	GameRegistry.registerItem(ItemNingmengzhi, "ItemNingmengzhi");
	GameRegistry.registerItem(ItemYouzizhi, "ItemYouzizhi");
	GameRegistry.registerItem(ItemShizizhi, "ItemShizizhi");
	GameRegistry.registerItem(ItemMuguazhi, "ItemMuguazhi");
	GameRegistry.registerItem(ItemShanzhazhi, "ItemShanzhazhi");
	GameRegistry.registerItem(ItemShiliuzhi, "ItemShiliuzhi");
	GameRegistry.registerItem(ItemHongzaozhi, "ItemHongzaozhi");
	GameRegistry.registerItem(ItemCaomeizhi, "ItemCaomeizhi");
	GameRegistry.registerItem(ItemYezizhi, "ItemYezizhi");
	GameRegistry.registerItem(ItemYingtaozhi, "ItemYingtaozhi");
	GameRegistry.registerItem(ItemXiangjiaozhi, "ItemXiangjiaozhi");
	GameRegistry.registerItem(ItemYenai, "ItemYenai");

	GameRegistry.registerItem(ItemQiaokelinaiice, "ItemQiaokelinaiice");
	GameRegistry.registerItem(ItemPutaozhiice, "ItemPutaozhiice");
	GameRegistry.registerItem(ItemPingguozhiice, "ItemPingguozhiice");
	GameRegistry.registerItem(ItemJinputaozhiice, "ItemJinputaozhiice");
	GameRegistry.registerItem(ItemXiguazhiice, "ItemXiguazhiice");
	GameRegistry.registerItem(ItemJinpingguozhiice, "ItemJinpingguozhiice");

	GameRegistry.registerItem(ItemLizhizhiice, "ItemLizhizhiice");
	GameRegistry.registerItem(ItemTaozizhiice, "ItemTaozizhiice");
	GameRegistry.registerItem(ItemJuzizhiice, "ItemJuzizhiice");
	GameRegistry.registerItem(ItemMangguozhiice, "ItemMangguozhiice");
	GameRegistry.registerItem(ItemNingmengzhiice, "ItemNingmengzhiice");
	GameRegistry.registerItem(ItemMuguazhiice, "ItemMuguazhiice");
	GameRegistry.registerItem(ItemCaomeizhiice, "ItemCaomeizhiice");
	GameRegistry.registerItem(ItemYezizhiice, "ItemYezizhiice");
	GameRegistry.registerItem(ItemXiangjiaozhiice, "ItemXiangjiaozhiice");
	/**
	 * ------------------------------ ��ʳ ------------------------------
	 */
	GameRegistry.registerItem(ItemMogudunjitang, "ItemMogudunjitang");
	GameRegistry.registerItem(ItemDangeng, "ItemDangeng");
	GameRegistry.registerItem(ItemMian, "ItemMian");
	GameRegistry.registerItem(ItemGuoqiaomixian, "ItemGuoqiaomixian");
	GameRegistry.registerItem(ItemPidanshourouzhou, "ItemPidanshourouzhou");
	GameRegistry.registerItem(ItemLabazhou, "ItemLabazhou");
	GameRegistry.registerItem(ItemFanqiechaojidanfan, "ItemFanqiechaojidanfan");
	GameRegistry.registerItem(ItemDisanxian, "ItemDisanxian");
	GameRegistry.registerItem(ItemYuxiangrousi, "ItemYuxiangrousi");
	GameRegistry.registerItem(ItemGongbaojiding, "ItemGongbaojiding");
	GameRegistry.registerItem(ItemChaotudousifan, "ItemChaotudousifan");
	GameRegistry.registerItem(ItemDuojiaoyutou, "ItemDuojiaoyutou");
	GameRegistry.registerItem(ItemMapodoufufan, "ItemMapodoufufan");
	GameRegistry.registerItem(ItemHongshaoroufan, "ItemHongshaoroufan");
	GameRegistry.registerItem(ItemHuiguoroufan, "ItemHuiguoroufan");
	GameRegistry.registerItem(ItemAeljichifan, "ItemAeljichifan");
	GameRegistry.registerItem(ItemLaziji, "ItemLaziji");
	GameRegistry.registerItem(ItemKoushuiji, "ItemKoushuiji");
	GameRegistry.registerItem(ItemBaiqiuji, "ItemBaiqiuji");
	GameRegistry.registerItem(ItemCongyouji, "ItemCongyouji");
	GameRegistry.registerItem(ItemSuancaiyu, "ItemSuancaiyu");
	GameRegistry.registerItem(ItemMalayu, "ItemMalayu");
	GameRegistry.registerItem(ItemQingzhenyu, "ItemQingzhenyu");
	GameRegistry.registerItem(ItemKelejichifan, "ItemKelejichifan");
	GameRegistry.registerItem(ItemGalijiroufan, "ItemGalijiroufan");
	GameRegistry.registerItem(ItemShuizhuniurou, "ItemShuizhuniurou");
	GameRegistry.registerItem(ItemYifen, "ItemYifen");
	GameRegistry.registerItem(ItemYifenpork, "ItemYifenpork");
	GameRegistry.registerItem(ItemYifenbeef, "ItemYifenbeef");
	GameRegistry.registerItem(ItemYifenchicken, "ItemYifenchicken");
	GameRegistry.registerItem(ItemRibendoufu, "ItemRibendoufu");
	GameRegistry.registerItem(ItemChangfen, "ItemChangfen");
	/**
	 * ------------------------------ ʳ�� ------------------------------
	 */
	GameRegistry.registerItem(Itemwater, "Itemwater");
	GameRegistry.registerItem(Itemfan, "Itemfan");
	GameRegistry.registerItem(ItemMianfen, "ItemMianfen");
	GameRegistry.registerItem(ItemYan, "ItemYan");
	GameRegistry.registerItem(ItemMianpi, "ItemMianpi");
	GameRegistry.registerItem(ItemDouban, "ItemDouban");
	GameRegistry.registerItem(ItemQiaokelifen, "ItemQiaokelifen");
	GameRegistry.registerItem(ItemJiaozixian, "ItemJiaozixian");
	GameRegistry.registerItem(ItemHuashenyou, "ItemHuashenyou");
	GameRegistry.registerItem(ItemBaifan, "ItemBaifan");
	GameRegistry.registerItem(ItemJitui, "ItemJitui");
	GameRegistry.registerItem(ItemJichi, "ItemJichi");
	GameRegistry.registerItem(ItemDajirou, "ItemDajirou");
	GameRegistry.registerItem(ItemZhongjirou, "ItemZhongjirou");
	GameRegistry.registerItem(ItemXiaojirou, "ItemXiaojirou");
	GameRegistry.registerItem(ItemTudoupian, "ItemTudoupian");
	GameRegistry.registerItem(ItemTudousi, "ItemTudousi");
	GameRegistry.registerItem(ItemJiangyou, "ItemJiangyou");
	GameRegistry.registerItem(ItemCu, "ItemCu");
	GameRegistry.registerItem(ItemDousha, "ItemDousha");
	GameRegistry.registerItem(ItemDianfen, "ItemDianfen");
	GameRegistry.registerItem(ItemNuomifen, "ItemNuomifen");
	GameRegistry.registerItem(ItemNuomituan, "ItemNuomituan");
	GameRegistry.registerItem(ItemHuashentangyuanxian, "ItemHuashentangyuanxian");
	GameRegistry.registerItem(ItemDoufusi, "ItemDoufusi");
	GameRegistry.registerItem(ItemLuobosi, "ItemLuobosi");
	GameRegistry.registerItem(ItemBailuobosi, "ItemBailuobosi");
	GameRegistry.registerItem(ItemMianfensi, "ItemMianfensi");
	GameRegistry.registerItem(ItemGalikuai, "ItemGalikuai");
	GameRegistry.registerItem(ItemLaweixunliao, "ItemLaweixunliao");
	GameRegistry.registerItem(ItemYangrou, "ItemYangrou");
	GameRegistry.registerItem(ItemShuyangrou, "ItemShuyangrou");
	GameRegistry.registerItem(ItemGuojiang, "ItemGuojiang");

	/**
	 * ------------------------------ С�� ------------------------------
	 */
	GameRegistry.registerItem(ItemYouyurou, "ItemYouyurou");
	GameRegistry.registerItem(ItemShuyouyurou, "ItemShuyouyurou");
	GameRegistry.registerItem(ItemYouyusi, "ItemYouyusi");
	GameRegistry.registerItem(ItemJianjidan, "ItemJianjidan");
	GameRegistry.registerItem(ItemLaobing, "ItemLaobing");
	GameRegistry.registerItem(ItemJiaozi, "ItemJiaozi");
	GameRegistry.registerItem(ItemJianjiao, "ItemJianJiao");
	GameRegistry.registerItem(ItemDoufu, "ItemDoufu");
	GameRegistry.registerItem(ItemDoufugan, "ItemDoufugan");
	GameRegistry.registerItem(ItemChaotudoupian, "ItemChaotudoupian");
	GameRegistry.registerItem(ItemXifan, "ItemXifan");
	GameRegistry.registerItem(ItemZongzi, "ItemZongzi");
	GameRegistry.registerItem(ItemYuebing, "ItemYuebing");
	GameRegistry.registerItem(ItemTangyuan, "ItemTangyuan");
	GameRegistry.registerItem(ItemMahua, "ItemMahua");
	GameRegistry.registerItem(ItemChunjuan, "ItemChunjuan");
	GameRegistry.registerItem(ItemShupian, "ItemShupian");
	GameRegistry.registerItem(ItemXiangchang, "ItemXiangchang");
	GameRegistry.registerItem(ItemLachang, "ItemLachang");
	GameRegistry.registerItem(ItemLarou, "ItemLarou");
	GameRegistry.registerItem(ItemZhaxiangchang, "ItemZhaxiangchang");
	GameRegistry.registerItem(ItemPisa, "ItemPisa");
	GameRegistry.registerItem(ItemHanbaobao, "ItemHanbaobao");
	GameRegistry.registerItem(ItemYoutiao, "ItemYoutiao");
	GameRegistry.registerItem(ItemLatiao, "ItemLatiao");
	GameRegistry.registerItem(ItemJikuai, "ItemJikuai");
	GameRegistry.registerItem(ItemYuanweijikuai, "ItemYuanweijikuai");
	GameRegistry.registerItem(ItemShutiao, "ItemShutiao");
	GameRegistry.registerItem(ItemJimihua, "ItemJimihua");
	GameRegistry.registerItem(ItemAeljichi, "ItemAeljichi");
	GameRegistry.registerItem(ItemZhadoufu, "ItemZhadoufu");
	GameRegistry.registerItem(ItemZhachunjuan, "ItemZhachunjuan");
	GameRegistry.registerItem(ItemZhamahua, "ItemZhamahua");
	GameRegistry.registerItem(ItemZhajitui, "ItemZhajitui");
	GameRegistry.registerItem(ItemKaohongshu, "ItemKaohongshu");
	GameRegistry.registerItem(ItemKaoyumi, "ItemKaoyumi");
	GameRegistry.registerItem(ItemBaoyumihua, "ItemBaoyumihua");
	/**
	 * ------------------------------ ��� ------------------------------
	 */
	GameRegistry.registerItem(ItemQiaokeli, "ItemQiaokeli");
	GameRegistry.registerItem(ItemNiangao, "ItemNiangao");
	GameRegistry.registerItem(ItemHetaosu, "ItemHetaosu");
	GameRegistry.registerItem(ItemAici, "ItemAici");
	GameRegistry.registerItem(ItemCiba, "ItemCiba");
	GameRegistry.registerItem(ItemNainao, "ItemNainao");
	GameRegistry.registerItem(ItemMantou, "ItemMantou");
	GameRegistry.registerItem(ItemSuancaibing, "ItemSuancaibing");
	GameRegistry.registerItem(ItemZhaniangao, "ItemZhaniangao");
	GameRegistry.registerItem(ItemZhamianbao, "ItemZhamianbao");
	GameRegistry.registerItem(ItemRegou, "ItemRegou");
	GameRegistry.registerItem(ItemBingganXN, "ItemBingganXN");
	GameRegistry.registerItem(ItemBingganF, "ItemBingganF");
	GameRegistry.registerItem(ItemBinggan, "ItemBinggan");
	GameRegistry.registerItem(ItemDangao, "ItemDangao");
	/**
	 * ----------------------------------------------------------------
	 */

	ItemAnlanzhishi = new ItemShi("ItemAnlanzhishi");
	ItemAnbizhishi = new ItemShi("ItemAnbizhishi");
	ItemZongjiqianguzhishi = new ItemShi("ItemZongjiqianguzhishi");
	ItemSCBlock = new ItemBook("ItemSCBlock");
	ItemSCPlant = new ItemBook("ItemSCPlant");
	ItemSCMW1 = new ItemBook("ItemSCMW1");
	ItemSCMW2 = new ItemBook("ItemSCMW2");
	ItemSCKFC = new ItemBook("ItemSCKFC");
	ItemSCCn = new ItemBook("ItemSCCn");
	ItemSCYz = new ItemBook("ItemSCYz");
	ItemSCJ = new ItemBook("ItemSCJ");
	ItemSCShui1 = new ItemBook("ItemSCShui1");
	ItemSCShui2 = new ItemBook("ItemSCShui2");
	ItemSCFan1 = new ItemBook("ItemSCFan1");
	ItemSCFan2 = new ItemBook("ItemSCFan2");
	ItemSCFan3 = new ItemBook("ItemSCFan3");
	ItemSCTh = new ItemBook("ItemSCTh");
	ItemAnlanTools = new ItemAnTools("ItemAnlanTools");
	ItemAnbiTools = new ItemAnTools("ItemAnbiTools");
    }
}
