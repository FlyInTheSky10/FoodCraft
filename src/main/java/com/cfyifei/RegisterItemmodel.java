package com.cfyifei;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.cfyifei.block.ModBlocks;
import com.cfyifei.gui.blocks.ModGui;
import com.cfyifei.item.ModItem;
import com.cfyifei.plant.blocks.Plant;
import com.google.common.collect.Lists;

public class RegisterItemmodel {
public static void init() {
ModItem.registermodel(ModItem.ItemTiepian,"ItemTiepian");
ModItem.registermodel(ModItem.Itemwater,"Itemwater");
ModItem.registermodel(ModItem.ItemCaidao,"ItemCaidao");
ModItem.registermodel(ModItem.ItemJinghuashuitong,"ItemJinghuashuitong");
ModItem.registermodel(ModItem.ItemDami,"ItemDami");
ModItem.registermodel(ModItem.ItemHuashen,"ItemHuashen");
ModItem.registermodel(ModItem.ItemShucai,"ItemShucai");
ModItem.registermodel(ModItem.ItemDouzi,"ItemDouzi");
ModItem.registermodel(ModItem.Itemfan,"Itemfan");
ModItem.registermodel(ModItem.ItemMianfen,"ItemMianfen");
ModItem.registermodel(ModItem.ItemHuashenyou,"ItemHuashenyou");
ModItem.registermodel(ModItem.ItemDoujiang,"ItemDoujiang");
ModItem.registermodel(ModItem.ItemDianluban,"ItemDianluban");
ModItem.registermodel(ModItem.ItemJianjidan,"ItemJianjidan");
ModItem.registermodel(ModItem.ItemLaobing,"Itembing");
ModItem.registermodel(ModItem.ItemMianpi,"ItemMianpi");
ModItem.registermodel(ModItem.ItemJiaozixian,"ItemJiaozixian");
ModItem.registermodel(ModItem.ItemJiaozi,"ItemJiaozi");
ModItem.registermodel(ModItem.ItemJianjiao,"ItemJianJiao0");
ModItem.registermodel(ModItem.ItemQiaokelifen,"ItemQiaokelifen");
ModItem.registermodel(ModItem.ItemQiaokeli,"ItemQiaokeli");
ModItem.registermodel(ModItem.ItemLajiao,"ItemLajiao");
ModItem.registermodel(ModItem.ItemFanqie,"ItemFanqie");
ModItem.registermodel(ModItem.ItemPutao,"ItemPutao");
ModItem.registermodel(ModItem.ItemQiezi,"ItemQiezi");
ModItem.registermodel(ModItem.ItemYan,"ItemYan");
ModItem.registermodel(ModItem.ItemDoufu,"ItemDoufu");
ModItem.registermodel(ModItem.ItemJiangyou,"ItemJiangyou");
ModItem.registermodel(ModItem.ItemNuomi,"ItemNuomi");
ModItem.registermodel(ModItem.ItemDoufugan,"ItemDoufugan");
ModItem.registermodel(ModItem.ItemBaifan,"ItemBaifan");
ModItem.registermodel(ModItem.ItemFanqiechaojidanfan,"ItemFanqiechaojidanfan");
ModItem.registermodel(ModItem.ItemDisanxian,"ItemDisanxian");
ModItem.registermodel(ModItem.ItemYuxiangrousi,"ItemYuxiangrousi");
ModItem.registermodel(ModItem.ItemCu,"ItemCu");
ModItem.registermodel(ModItem.ItemGongbaojiding,"ItemGongbaojiding");
ModItem.registermodel(ModItem.ItemJitui,"ItemJitui");
ModItem.registermodel(ModItem.ItemTudoupian,"ItemTudoupian");
ModItem.registermodel(ModItem.ItemTudousi,"ItemTudousi");
ModItem.registermodel(ModItem.ItemChaotudousifan,"ItemChaotudousifan");
ModItem.registermodel(ModItem.ItemChaotudoupian,"ItemChaotudoupian");
ModItem.registermodel(ModItem.ItemDuojiaoyutou,"ItemDuojiaoyutou");
ModItem.registermodel(ModItem.ItemDouban,"ItemDouban");
ModItem.registermodel(ModItem.ItemMapodoufufan,"ItemMapodoufufan");
ModItem.registermodel(ModItem.ItemDianfen,"ItemDianfen");
ModItem.registermodel(ModItem.ItemHongshaoroufan,"ItemHongshaoroufan");
ModItem.registermodel(ModItem.ItemHuiguoroufan,"ItemHuiguoroufan");
ModItem.registermodel(ModItem.ItemXifan,"ItemXifan");
ModItem.registermodel(ModItem.ItemDangeng,"ItemDangeng");
ModItem.registermodel(ModItem.ItemMogudunjitang,"ItemMgdjt");
ModItem.registermodel(ModItem.ItemZongzi,"ItemZongzi");
ModItem.registermodel(ModItem.ItemZongye,"ItemZongye");
ModItem.registermodel(ModItem.ItemCong,"ItemCong");
ModItem.registermodel(ModItem.ItemNuomifen,"ItemNuomifen");
ModItem.registermodel(ModItem.ItemNuomituan,"ItemNuomituan");
ModItem.registermodel(ModItem.ItemHuashentangyuanxian,"ItemHuashentangyuanxian");
ModItem.registermodel(ModItem.ItemTangyuan,"ItemTangyuan");
ModItem.registermodel(ModItem.ItemJikuai,"ItemJikuai");
ModItem.registermodel(ModItem.ItemShutiao,"ItemShutiao");
ModItem.registermodel(ModItem.ItemAeljichi,"ItemAeljichi");
ModItem.registermodel(ModItem.ItemJimihua,"ItemJimihua");
ModItem.registermodel(ModItem.ItemYuanweijikuai,"ItemYuanweijikuai");
ModItem.registermodel(ModItem.ItemAeljichifan,"ItemAeljichifan");
ModItem.registermodel(ModItem.ItemMahua,"ItemMahua");
ModItem.registermodel(ModItem.ItemNiangao,"ItemNiangao");
ModItem.registermodel(ModItem.ItemChunjuan,"ItemChunjuan");
ModItem.registermodel(ModItem.ItemZhadoufu,"ItemZhadoufu");
ModItem.registermodel(ModItem.ItemZhaniangao,"ItemZhaniangao");
ModItem.registermodel(ModItem.ItemShupian,"ItemShupian");
ModItem.registermodel(ModItem.ItemZhamianbao,"ItemZhamianbao");
ModItem.registermodel(ModItem.ItemZhachunjuan,"ItemZhachunjuan");
ModItem.registermodel(ModItem.ItemZhamahua,"ItemZhamahua");
ModItem.registermodel(ModItem.ItemZhajitui,"ItemZhajitui");
ModItem.registermodel(ModItem.ItemDajirou,"ItemDajirou");
ModItem.registermodel(ModItem.ItemZhongjirou,"ItemZhongjirou");
ModItem.registermodel(ModItem.ItemXiaojirou,"ItemXiaojirou");
ModItem.registermodel(ModItem.ItemJichi,"ItemJichi");
ModItem.registermodel(ModItem.ItemDoufusi,"ItemDoufusi");
ModItem.registermodel(ModItem.ItemLuobosi,"ItemLuobosi");
ModItem.registermodel(ModItem.ItemHongjiu,"ItemHongjiu");
ModItem.registermodel(ModItem.ItemBaijiu,"ItemBaijiu");
ModItem.registermodel(ModItem.ItemPingguojiu,"ItemPingguojiu");
ModItem.registermodel(ModItem.ItemPutaojiu,"ItemPutaojiu");
ModItem.registermodel(ModItem.ItemJinputao,"ItemJinputao");
ModItem.registermodel(ModItem.ItemJinputaojiu,"ItemJinputaojiu");
ModItem.registermodel(ModItem.ItemJinpingguojiu,"ItemJinpingguojiu");
ModItem.registermodel(ModItem.ItemQiaokelishui,"ItemQiaokelishui");
ModItem.registermodel(ModItem.ItemQiaokelinai,"ItemQiaokelinai");
ModItem.registermodel(ModItem.ItemHuluobozhi,"ItemHuluobozhi");
ModItem.registermodel(ModItem.ItemPutaozhi,"ItemPutaozhi");
ModItem.registermodel(ModItem.ItemPingguozhi,"ItemPingguozhi");
ModItem.registermodel(ModItem.ItemShucaizhi,"ItemShucaizhi");
ModItem.registermodel(ModItem.ItemJinputaozhi,"ItemJinputaozhi");
ModItem.registermodel(ModItem.ItemJinpingguozhi,"ItemJinpingguozhi");
ModItem.registermodel(ModItem.ItemDounai,"ItemDounai");
ModItem.registermodel(ModItem.ItemKele,"ItemKele");
ModItem.registermodel(ModItem.ItemXuebi,"ItemXuebi");
ModItem.registermodel(ModItem.ItemQiaokelinaiice,"ItemQiaokelinaiice");
ModItem.registermodel(ModItem.ItemPutaozhiice,"ItemPutaozhiice");
ModItem.registermodel(ModItem.ItemPingguozhiice,"ItemPingguozhiice");
ModItem.registermodel(ModItem.ItemJinputaozhiice,"ItemJinputaozhiice");
ModItem.registermodel(ModItem.ItemJinpingguozhiice,"ItemJinpingguozhiice");
ModItem.registermodel(ModItem.ItemXiguazhi,"ItemXiguazhi");
ModItem.registermodel(ModItem.ItemXiguazhiice,"ItemXiguazhiice");
ModItem.registermodel(ModItem.ItemMianfensi,"ItemMianfensi");
ModItem.registermodel(ModItem.ItemCha,"ItemCha");
ModItem.registermodel(ModItem.ItemNaicha,"ItemNaicha");
ModItem.registermodel(ModItem.ItemKafei,"ItemKafei");
ModItem.registermodel(ModItem.ItemBaiqiuji,"ItemBaiqiuji");
ModItem.registermodel(ModItem.ItemCongyouji,"ItemCongyouji");
ModItem.registermodel(ModItem.ItemKoushuiji,"ItemKoushuiji");
ModItem.registermodel(ModItem.ItemLaziji,"ItemLaziji");
ModItem.registermodel(ModItem.ItemQingzhenyu,"ItemQingzhenyu");
ModItem.registermodel(ModItem.ItemMalayu,"ItemMalayu");
ModItem.registermodel(ModItem.ItemSuancaiyu,"ItemSuancaiyu");
ModItem.registermodel(ModItem.ItemKelejichifan,"ItemKelejichifan");
ModItem.registermodel(ModItem.ItemGalijiroufan,"ItemGalijiroufan");
ModItem.registermodel(ModItem.ItemGalikuai,"ItemGalikuai");
ModItem.registermodel(ModItem.ItemShuizhuniurou,"ItemShuizhuniurou");
ModItem.registermodel(ModItem.ItemMian,"ItemMian");
ModItem.registermodel(ModItem.ItemGuoqiaomixian,"ItemGuoqiaomixian");
ModItem.registermodel(ModItem.ItemYifen,"ItemYifen");
ModItem.registermodel(ModItem.ItemYifenpork,"ItemYifenpork");
ModItem.registermodel(ModItem.ItemYifenbeef,"ItemYifenbeef");
ModItem.registermodel(ModItem.ItemYifenchicken,"ItemYifenchicken");
ModItem.registermodel(ModItem.ItemPidanshourouzhou,"ItemPidanshourouzhou");
ModItem.registermodel(ModItem.ItemYuebing,"ItemYuebing");
ModItem.registermodel(ModItem.ItemMantou,"ItemMantou");
ModItem.registermodel(ModItem.ItemSuancaibing,"ItemSuancaibing");
ModItem.registermodel(ModItem.ItemYoutiao,"ItemYoutiao");
ModItem.registermodel(ModItem.ItemLatiao,"ItemLatiao");
ModItem.registermodel(ModItem.ItemHetaosu,"ItemHetaosu");
ModItem.registermodel(ModItem.ItemAici,"ItemAici");
ModItem.registermodel(ModItem.ItemCiba,"ItemCiba");
ModItem.registermodel(ModItem.ItemChangfen,"ItemChangfen");
ModItem.registermodel(ModItem.ItemXiangchang,"ItemXiangchang");
ModItem.registermodel(ModItem.ItemRegou,"ItemRegou");
ModItem.registermodel(ModItem.ItemLachang,"ItemLachang");
ModItem.registermodel(ModItem.ItemLarou,"ItemLarou");
ModItem.registermodel(ModItem.ItemZhaxiangchang,"ItemZhaxiangchang");
ModItem.registermodel(ModItem.ItemRibendoufu,"ItemRibendoufu");
ModItem.registermodel(ModItem.ItemLabazhou,"ItemLabazhou");
ModItem.registermodel(ModItem.ItemLaweixunliao,"ItemLaweixunliao");
ModItem.registermodel(ModItem.ItemNainao,"ItemNainao");
ModItem.registermodel(ModItem.ItemPisa,"ItemPisa");
ModItem.registermodel(ModItem.ItemHanbaobao,"ItemHanbaobao");
ModItem.registermodel(ModItem.ItemYouyurou,"ItemYouyurou");
ModItem.registermodel(ModItem.ItemShuyouyurou,"ItemShuyouyurou");
ModItem.registermodel(ModItem.ItemYouyusi,"ItemYouyusi");
ModItem.registermodel(ModItem.ItemCaidaoHJ,"ItemCaidaoHJ");
ModItem.registermodel(ModItem.ItemCaidaoZS,"ItemCaidaoZS");
ModItem.registermodel(ModItem.ItemCaidaoLBS,"ItemCaidaoLBS");
ModItem.registermodel(ModItem.ItemWrench,"ItemWrench");
ModItem.registermodel(ModItem.ItemJinkela,"ItemJinkela");
ModItem.registermodel(ModItem.ItemKaoyumi,"ItemKaoyumi");
ModItem.registermodel(ModItem.ItemKaohongshu,"ItemKaohongshu");
ModItem.registermodel(ModItem.ItemBaoyumihua,"ItemBaoyumihua");
ModItem.registermodel(ModItem.ItemBingganXN,"ItemBingganXN");
ModItem.registermodel(ModItem.ItemBingganF,"ItemBingganF");
ModItem.registermodel(ModItem.ItemHongdou,"ItemHongdou");
ModItem.registermodel(ModItem.ItemLvdou,"ItemLvdou");
ModItem.registermodel(ModItem.ItemBailuobo,"ItemBailuobo");
ModItem.registermodel(ModItem.ItemQingjiao,"ItemQingjiao");
ModItem.registermodel(ModItem.ItemDoujiao,"ItemDoujiao");
ModItem.registermodel(ModItem.ItemHuanggua,"ItemHuanggua");
ModItem.registermodel(ModItem.ItemYumi,"ItemYumi");
ModItem.registermodel(ModItem.ItemHongshu,"ItemHongshu");
ModItem.registermodel(ModItem.ItemLi,"ItemLi");
ModItem.registermodel(ModItem.ItemLizhi,"ItemLizhi");
ModItem.registermodel(ModItem.ItemTaozi,"ItemTaozi");
ModItem.registermodel(ModItem.ItemJuzi,"ItemJuzi");
ModItem.registermodel(ModItem.ItemPipa,"ItemPipa");
ModItem.registermodel(ModItem.ItemMangguo,"ItemMangguo");
ModItem.registermodel(ModItem.ItemNingmeng,"ItemNingmeng");
ModItem.registermodel(ModItem.ItemYouzi,"ItemYouzi");
ModItem.registermodel(ModItem.ItemShizi,"ItemShizi");
ModItem.registermodel(ModItem.ItemMugua,"ItemMugua");
ModItem.registermodel(ModItem.ItemShanzha,"ItemShanzha");
ModItem.registermodel(ModItem.ItemLongyan,"ItemLongyan");
ModItem.registermodel(ModItem.ItemShiliu,"ItemShiliu");
ModItem.registermodel(ModItem.ItemHongzao,"ItemHongzao");
ModItem.registermodel(ModItem.ItemCaomei,"ItemCaomei");
ModItem.registermodel(ModItem.ItemYezi,"ItemYezi");
ModItem.registermodel(ModItem.ItemYingtao,"ItemYingtao");
ModItem.registermodel(ModItem.ItemXiangjiao,"ItemXiangjiao");
ModItem.registermodel(ModItem.ItemShucaizhong,"ItemShucaizhong");
ModItem.registermodel(ModItem.ItemLajiaozhong,"ItemLajiaozhong");
ModItem.registermodel(ModItem.ItemFanqiezhong,"ItemFanqiezhong");
ModItem.registermodel(ModItem.ItemPutaozhong,"ItemPutaozhong");
ModItem.registermodel(ModItem.ItemQiezizhong,"ItemQiezizhong");
ModItem.registermodel(ModItem.ItemQingjiaozhong,"ItemQingjiaozhong");
ModItem.registermodel(ModItem.ItemYumizhong,"ItemYumizhong");
ModItem.registermodel(ModItem.ItemHuangguazhong,"ItemHuangguazhong");
ModItem.registermodel(ModItem.ItemLizijiu,"ItemLizijiu");
ModItem.registermodel(ModItem.ItemLizhijiu,"ItemLizhijiu");
ModItem.registermodel(ModItem.ItemTaozijiu,"ItemTaozijiu");
ModItem.registermodel(ModItem.ItemMangguojiu,"ItemMangguojiu");
ModItem.registermodel(ModItem.ItemNingmengjiu,"ItemNingmengjiu");
ModItem.registermodel(ModItem.ItemShiliujiu,"ItemShiliujiu");
ModItem.registermodel(ModItem.ItemBailuobozhi,"ItemBailuobozhi");
ModItem.registermodel(ModItem.ItemFanqiezhi,"ItemFanqiezhi");
ModItem.registermodel(ModItem.ItemYumizhi,"ItemYumizhi");
ModItem.registermodel(ModItem.ItemHuangguazhi,"ItemHuangguazhi");
ModItem.registermodel(ModItem.ItemLizizhi,"ItemLizizhi");
ModItem.registermodel(ModItem.ItemLizhizhi,"ItemLizhizhi");
ModItem.registermodel(ModItem.ItemTaozizhi,"ItemTaozizhi");
ModItem.registermodel(ModItem.ItemJuzizhi,"ItemJuzizhi");
ModItem.registermodel(ModItem.ItemPipazhi,"ItemPipazhi");
ModItem.registermodel(ModItem.ItemMangguozhi,"ItemMangguozhi");
ModItem.registermodel(ModItem.ItemNingmengzhi,"ItemNingmengzhi");
ModItem.registermodel(ModItem.ItemYouzizhi,"ItemYouzizhi");
ModItem.registermodel(ModItem.ItemShizizhi,"ItemShizizhi");
ModItem.registermodel(ModItem.ItemMuguazhi,"ItemMuguazhi");
ModItem.registermodel(ModItem.ItemShanzhazhi,"ItemShanzhazhi");
ModItem.registermodel(ModItem.ItemShiliuzhi,"ItemShiliuzhi");
ModItem.registermodel(ModItem.ItemHongzaozhi,"ItemHongzaozhi");
ModItem.registermodel(ModItem.ItemCaomeizhi,"ItemCaomeizhi");
ModItem.registermodel(ModItem.ItemYezizhi,"ItemYezizhi");
ModItem.registermodel(ModItem.ItemYingtaozhi,"ItemYingtaozhi");
ModItem.registermodel(ModItem.ItemXiangjiaozhi,"ItemXiangjiaozhi");
ModItem.registermodel(ModItem.ItemYenai,"ItemYenai");
ModItem.registermodel(ModItem.ItemLizhizhiice,"ItemLizhizhiice");
ModItem.registermodel(ModItem.ItemTaozizhiice,"ItemTaozizhiice");
ModItem.registermodel(ModItem.ItemJuzizhiice,"ItemJuzizhiice");
ModItem.registermodel(ModItem.ItemMangguozhiice,"ItemMangguozhiice");
ModItem.registermodel(ModItem.ItemNingmengzhiice,"ItemNingmengzhiice");
ModItem.registermodel(ModItem.ItemMuguazhiice,"ItemMuguazhiice");
ModItem.registermodel(ModItem.ItemCaomeizhiice,"ItemCaomeizhiice");
ModItem.registermodel(ModItem.ItemYezizhiice,"ItemYezizhiice");
ModItem.registermodel(ModItem.ItemXiangjiaozhiice,"ItemXiangjiaozhiice");
ModItem.registermodel(ModItem.ItemDousha,"ItemDousha");
ModItem.registermodel(ModItem.ItemBailuobosi,"ItemBailuobosi");
ModItem.registermodel(ModItem.ItemNull,"ItemNull");
registermodelGJ(ModItem.ItemGuojiang,"ItemGuojiang");
registermodelBG(ModItem.ItemBinggan,"ItemBinggan");
registermodelDG(ModItem.ItemDangao,"ItemDangao");
ModItem.registermodelBlock(Plant.BlockYezi,"BlockYezi");
ModItem.registermodelBlock(ModBlocks.Blocksugar,"blocksugar");
ModItem.registermodelBlock(ModBlocks.BlockDami,"blockdami");
ModItem.registermodelBlock(ModBlocks.BlockHuashenk,"blockhuashenk");
ModItem.registermodelBlock(ModBlocks.BlockLuobo,"blockluobo");
ModItem.registermodelBlock(ModBlocks.BlockTudou,"blocktudou");
ModItem.registermodelBlock(ModBlocks.BlockYan,"blockyan");
ModItem.registermodelBlock(ModBlocks.BlockDouzik,"blockdouzik");
ModItem.registermodelBlock(ModBlocks.BlockRuomi,"blockruomi");
ModItem.registermodelBlock(ModBlocks.BlockDouban,"blockdouban");
ModItem.registermodelBlock(ModBlocks.BlockQiaokeli,"blockqiaokeli");
ModItem.registermodelBlock(ModBlocks.BlockWaike,"blockwaike");
ModItem.registermodelBlock(Plant.BlockXiangjiao,"BlockXiangjiao");
ModItem.registermodelBlock(Plant.BlockYezi,"BlockYezi");
ModItem.registermodelBlock(ModGui.Nmj,"Nmj");
ModItem.registermodelBlock(ModGui.Tpj,"Tpj");
ModItem.registermodelBlock(ModGui.YZJ,"YZJ");
ModItem.registermodelBlock(ModGui.Zl,"Zl");
ModItem.registermodelBlock(ModGui.Nt,"Nt");
ModItem.registermodelBlock(ModGui.PDG,"PDG");
ModItem.registermodelBlock(ModGui.Guo,"Guo");
ModItem.registermodelBlock(ModGui.Gyg,"Gyg");
ModItem.registermodelBlock(ModGui.Caiban,"Caiban");
ModItem.registermodelBlock(Plant.FCleaves,"FCleaves");
ModItem.registermodelBlock(Plant.BlockLi,"BlockLi");
ModItem.registermodelBlock(Plant.BlockLizhi,"BlockLizhi");
ModItem.registermodelBlock(Plant.BlockTaozi,"BlockTaozi");
ModItem.registermodelBlock(Plant.BlockJuzi,"BlockJuzi");
ModItem.registermodelBlock(Plant.BlockPipa,"BlockPipa");
ModItem.registermodelBlock(Plant.BlockMangguo,"BlockMangguo");
ModItem.registermodelBlock(Plant.BlockNingmeng,"BlockNingmeng");
ModItem.registermodelBlock(Plant.BlockYouzi,"BlockYouzi");
ModItem.registermodelBlock(Plant.BlockShizi,"BlockShizi");
ModItem.registermodelBlock(Plant.BlockMugua,"BlockMugua");
ModItem.registermodelBlock(Plant.BlockShanzha,"BlockShanzha");
ModItem.registermodelBlock(Plant.BlockLongyan,"BlockLongyan");
ModItem.registermodelBlock(Plant.BlockShiliu,"BlockShiliu");
ModItem.registermodelBlock(Plant.BlockHongzao,"BlockHongzao");
ModItem.registermodelBlock(Plant.BlockYezi,"BlockYezi");
ModItem.registermodelBlock(Plant.BlockYingtao,"BlockYingtao");
ModItem.registermodelBlock(Plant.BlockXiangjiao,"BlockXiangjiao");
ModItem.registermodelBlock(Plant.BlockLishu,"BlockLishu");
ModItem.registermodelBlock(Plant.BlockLizhishu,"BlockLizhishu");
ModItem.registermodelBlock(Plant.BlockTaozishu,"BlockTaozishu");
ModItem.registermodelBlock(Plant.BlockJuzishu,"BlockJuzishu");
ModItem.registermodelBlock(Plant.BlockPipashu,"BlockPipashu");
ModItem.registermodelBlock(Plant.BlockMangguoshu,"BlockMangguoshu");
ModItem.registermodelBlock(Plant.BlockNingmengshu,"BlockNingmengshu");
ModItem.registermodelBlock(Plant.BlockYouzishu,"BlockYouzishu");
ModItem.registermodelBlock(Plant.BlockShizishu,"BlockShizishu");
ModItem.registermodelBlock(Plant.BlockMuguashu,"BlockMuguashu");
ModItem.registermodelBlock(Plant.BlockShanzhashu,"BlockShanzhashu");
ModItem.registermodelBlock(Plant.BlockLongyanshu,"BlockLongyanshu");
ModItem.registermodelBlock(Plant.BlockShiliushu,"BlockShiliushu");
ModItem.registermodelBlock(Plant.BlockHongzaoshu,"BlockHongzaoshu");
ModItem.registermodelBlock(Plant.BlockYezishu,"BlockYezishu");
ModItem.registermodelBlock(Plant.BlockYingtaoshu,"BlockYingtaoshu");
ModItem.registermodelBlock(Plant.BlockXiangjiaoshu,"BlockXiangjiaoshu");
ModItem.registermodelBlock(ModBlocks.BlockCong,"BlockCong");
}
public static void registermodelGJ(Item myitem, String name) {
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myitem, 0,
		    new ModelResourceLocation("foodcraft:ItemPutaoGJ", "inventory"));
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myitem, 1,
		    new ModelResourceLocation("foodcraft:ItemJinputaoGJ", "inventory"));
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myitem, 2,
		    new ModelResourceLocation("foodcraft:ItemLiGJ", "inventory"));
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myitem, 3,
		    new ModelResourceLocation("foodcraft:ItemTaoziGJ", "inventory"));
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myitem, 4,
		    new ModelResourceLocation("foodcraft:ItemJuziGJ", "inventory"));
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myitem, 5,
		    new ModelResourceLocation("foodcraft:ItemNingmengGJ", "inventory"));
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myitem, 6,
		    new ModelResourceLocation("foodcraft:ItemCaomeiGJ", "inventory"));
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myitem, 7,
		    new ModelResourceLocation("foodcraft:ItemYeziGJ", "inventory"));
		ModelBakery.addVariantName(myitem, new String[]{"foodcraft:ItemPutaoGJ","foodcraft:ItemJinputaoGJ","foodcraft:ItemLiGJ","foodcraft:ItemTaoziGJ","foodcraft:ItemJuziGJ","foodcraft:ItemNingmengGJ","foodcraft:ItemCaomeiGJ","foodcraft:ItemYeziGJ"});
}
public static void registermodelBG(Item myitem, String name) {
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myitem, 0,
		    new ModelResourceLocation("foodcraft:ItemPutaoBG", "inventory"));
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myitem, 1,
		    new ModelResourceLocation("foodcraft:ItemJinputaoBG", "inventory"));
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myitem, 2,
		    new ModelResourceLocation("foodcraft:ItemLiBG", "inventory"));
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myitem, 3,
		    new ModelResourceLocation("foodcraft:ItemTaoziBG", "inventory"));
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myitem, 4,
		    new ModelResourceLocation("foodcraft:ItemJuziBG", "inventory"));
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myitem, 5,
		    new ModelResourceLocation("foodcraft:ItemNingmengBG", "inventory"));
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myitem, 6,
		    new ModelResourceLocation("foodcraft:ItemCaomeiBG", "inventory"));
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myitem, 7,
		    new ModelResourceLocation("foodcraft:ItemYeziBG", "inventory"));
		ModelBakery.addVariantName(myitem, new String[]{"foodcraft:ItemPutaoBG","foodcraft:ItemJinputaoBG","foodcraft:ItemLiBG","foodcraft:ItemTaoziBG","foodcraft:ItemJuziBG","foodcraft:ItemNingmengBG","foodcraft:ItemCaomeiBG","foodcraft:ItemYeziBG"});
}
public static void registermodelDG(Item myitem, String name) {
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myitem, 0,
		    new ModelResourceLocation("foodcraft:ItemPutaoDG", "inventory"));
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myitem, 1,
		    new ModelResourceLocation("foodcraft:ItemJinputaoDG", "inventory"));
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myitem, 2,
		    new ModelResourceLocation("foodcraft:ItemLiDG", "inventory"));
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myitem, 3,
		    new ModelResourceLocation("foodcraft:ItemTaoziDG", "inventory"));
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myitem, 4,
		    new ModelResourceLocation("foodcraft:ItemJuziDG", "inventory"));
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myitem, 5,
		    new ModelResourceLocation("foodcraft:ItemNingmengDG", "inventory"));
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myitem, 6,
		    new ModelResourceLocation("foodcraft:ItemCaomeiDG", "inventory"));
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myitem, 7,
		    new ModelResourceLocation("foodcraft:ItemYeziDG", "inventory"));
		ModelBakery.addVariantName(myitem, new String[]{"foodcraft:ItemPutaoDG","foodcraft:ItemJinputaoDG","foodcraft:ItemLiDG","foodcraft:ItemTaoziDG","foodcraft:ItemJuziDG","foodcraft:ItemNingmengDG","foodcraft:ItemCaomeiDG","foodcraft:ItemYeziDG"});
}
}
