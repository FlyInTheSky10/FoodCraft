package com.foodcraft;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.foodcraft.init.FoodcraftBlocks;
import com.foodcraft.init.FoodcraftGuiBlocks;
import com.foodcraft.init.FoodcraftItems;
import com.foodcraft.init.FoodcraftPlants;
import com.google.common.collect.Lists;

public class RegisterModel {
	public static void init() {
		registerModel(FoodcraftItems.ItemTiepian,"ItemTiepian");
		registerModel(FoodcraftItems.Itemwater,"Itemwater");
		registerModel(FoodcraftItems.ItemCaidao,"ItemCaidao");
		registerModel(FoodcraftItems.ItemJinghuashuitong,"ItemJinghuashuitong");
		registerModel(FoodcraftItems.ItemDami,"ItemDami");
		registerModel(FoodcraftItems.ItemHuashen,"ItemHuashen");
		registerModel(FoodcraftItems.ItemShucai,"ItemShucai");
		registerModel(FoodcraftItems.ItemDouzi,"ItemDouzi");
		registerModel(FoodcraftItems.Itemfan,"Itemfan");
		registerModel(FoodcraftItems.ItemMianfen,"ItemMianfen");
		registerModel(FoodcraftItems.ItemHuashenyou,"ItemHuashenyou");
		registerModel(FoodcraftItems.ItemDoujiang,"ItemDoujiang");
		registerModel(FoodcraftItems.ItemDianluban,"ItemDianluban");
		registerModel(FoodcraftItems.ItemJianjidan,"ItemJianjidan");
		registerModel(FoodcraftItems.ItemLaobing,"Itembing");
		registerModel(FoodcraftItems.ItemMianpi,"ItemMianpi");
		registerModel(FoodcraftItems.ItemJiaozixian,"ItemJiaozixian");
		registerModel(FoodcraftItems.ItemJiaozi,"ItemJiaozi");
		registerModel(FoodcraftItems.ItemJianjiao,"ItemJianJiao0");
		registerModel(FoodcraftItems.ItemQiaokelifen,"ItemQiaokelifen");
		registerModel(FoodcraftItems.ItemQiaokeli,"ItemQiaokeli");
		registerModel(FoodcraftItems.ItemLajiao,"ItemLajiao");
		registerModel(FoodcraftItems.ItemFanqie,"ItemFanqie");
		registerModel(FoodcraftItems.ItemPutao,"ItemPutao");
		registerModel(FoodcraftItems.ItemQiezi,"ItemQiezi");
		registerModel(FoodcraftItems.ItemYan,"ItemYan");
		registerModel(FoodcraftItems.ItemDoufu,"ItemDoufu");
		registerModel(FoodcraftItems.ItemJiangyou,"ItemJiangyou");
		registerModel(FoodcraftItems.ItemNuomi,"ItemNuomi");
		registerModel(FoodcraftItems.ItemDoufugan,"ItemDoufugan");
		registerModel(FoodcraftItems.ItemBaifan,"ItemBaifan");
		registerModel(FoodcraftItems.ItemFanqiechaojidanfan,"ItemFanqiechaojidanfan");
		registerModel(FoodcraftItems.ItemDisanxian,"ItemDisanxian");
		registerModel(FoodcraftItems.ItemYuxiangrousi,"ItemYuxiangrousi");
		registerModel(FoodcraftItems.ItemCu,"ItemCu");
		registerModel(FoodcraftItems.ItemGongbaojiding,"ItemGongbaojiding");
		registerModel(FoodcraftItems.ItemJitui,"ItemJitui");
		registerModel(FoodcraftItems.ItemTudoupian,"ItemTudoupian");
		registerModel(FoodcraftItems.ItemTudousi,"ItemTudousi");
		registerModel(FoodcraftItems.ItemChaotudousifan,"ItemChaotudousifan");
		registerModel(FoodcraftItems.ItemChaotudoupian,"ItemChaotudoupian");
		registerModel(FoodcraftItems.ItemDuojiaoyutou,"ItemDuojiaoyutou");
		registerModel(FoodcraftItems.ItemDouban,"ItemDouban");
		registerModel(FoodcraftItems.ItemMapodoufufan,"ItemMapodoufufan");
		registerModel(FoodcraftItems.ItemDianfen,"ItemDianfen");
		registerModel(FoodcraftItems.ItemHongshaoroufan,"ItemHongshaoroufan");
		registerModel(FoodcraftItems.ItemHuiguoroufan,"ItemHuiguoroufan");
		registerModel(FoodcraftItems.ItemXifan,"ItemXifan");
		registerModel(FoodcraftItems.ItemDangeng,"ItemDangeng");
		registerModel(FoodcraftItems.ItemMogudunjitang,"ItemMgdjt");
		registerModel(FoodcraftItems.ItemZongzi,"ItemZongzi");
		registerModel(FoodcraftItems.ItemZongye,"ItemZongye");
		registerModel(FoodcraftItems.ItemCong,"ItemCong");
		registerModel(FoodcraftItems.ItemNuomifen,"ItemNuomifen");
		registerModel(FoodcraftItems.ItemNuomituan,"ItemNuomituan");
		registerModel(FoodcraftItems.ItemHuashentangyuanxian,"ItemHuashentangyuanxian");
		registerModel(FoodcraftItems.ItemTangyuan,"ItemTangyuan");
		registerModel(FoodcraftItems.ItemJikuai,"ItemJikuai");
		registerModel(FoodcraftItems.ItemShutiao,"ItemShutiao");
		registerModel(FoodcraftItems.ItemAeljichi,"ItemAeljichi");
		registerModel(FoodcraftItems.ItemJimihua,"ItemJimihua");
		registerModel(FoodcraftItems.ItemYuanweijikuai,"ItemYuanweijikuai");
		registerModel(FoodcraftItems.ItemAeljichifan,"ItemAeljichifan");
		registerModel(FoodcraftItems.ItemMahua,"ItemMahua");
		registerModel(FoodcraftItems.ItemNiangao,"ItemNiangao");
		registerModel(FoodcraftItems.ItemChunjuan,"ItemChunjuan");
		registerModel(FoodcraftItems.ItemZhadoufu,"ItemZhadoufu");
		registerModel(FoodcraftItems.ItemZhaniangao,"ItemZhaniangao");
		registerModel(FoodcraftItems.ItemShupian,"ItemShupian");
		registerModel(FoodcraftItems.ItemZhamianbao,"ItemZhamianbao");
		registerModel(FoodcraftItems.ItemZhachunjuan,"ItemZhachunjuan");
		registerModel(FoodcraftItems.ItemZhamahua,"ItemZhamahua");
		registerModel(FoodcraftItems.ItemZhajitui,"ItemZhajitui");
		registerModel(FoodcraftItems.ItemDajirou,"ItemDajirou");
		registerModel(FoodcraftItems.ItemZhongjirou,"ItemZhongjirou");
		registerModel(FoodcraftItems.ItemXiaojirou,"ItemXiaojirou");
		registerModel(FoodcraftItems.ItemJichi,"ItemJichi");
		registerModel(FoodcraftItems.ItemDoufusi,"ItemDoufusi");
		registerModel(FoodcraftItems.ItemLuobosi,"ItemLuobosi");
		registerModel(FoodcraftItems.ItemHongjiu,"ItemHongjiu");
		registerModel(FoodcraftItems.ItemBaijiu,"ItemBaijiu");
		registerModel(FoodcraftItems.ItemPingguojiu,"ItemPingguojiu");
		registerModel(FoodcraftItems.ItemPutaojiu,"ItemPutaojiu");
		registerModel(FoodcraftItems.ItemJinputao,"ItemJinputao");
		registerModel(FoodcraftItems.ItemJinputaojiu,"ItemJinputaojiu");
		registerModel(FoodcraftItems.ItemJinpingguojiu,"ItemJinpingguojiu");
		registerModel(FoodcraftItems.ItemQiaokelishui,"ItemQiaokelishui");
		registerModel(FoodcraftItems.ItemQiaokelinai,"ItemQiaokelinai");
		registerModel(FoodcraftItems.ItemHuluobozhi,"ItemHuluobozhi");
		registerModel(FoodcraftItems.ItemPutaozhi,"ItemPutaozhi");
		registerModel(FoodcraftItems.ItemPingguozhi,"ItemPingguozhi");
		registerModel(FoodcraftItems.ItemShucaizhi,"ItemShucaizhi");
		registerModel(FoodcraftItems.ItemJinputaozhi,"ItemJinputaozhi");
		registerModel(FoodcraftItems.ItemJinpingguozhi,"ItemJinpingguozhi");
		registerModel(FoodcraftItems.ItemDounai,"ItemDounai");
		registerModel(FoodcraftItems.ItemKele,"ItemKele");
		registerModel(FoodcraftItems.ItemXuebi,"ItemXuebi");
		registerModel(FoodcraftItems.ItemQiaokelinaiice,"ItemQiaokelinaiice");
		registerModel(FoodcraftItems.ItemPutaozhiice,"ItemPutaozhiice");
		registerModel(FoodcraftItems.ItemPingguozhiice,"ItemPingguozhiice");
		registerModel(FoodcraftItems.ItemJinputaozhiice,"ItemJinputaozhiice");
		registerModel(FoodcraftItems.ItemJinpingguozhiice,"ItemJinpingguozhiice");
		registerModel(FoodcraftItems.ItemXiguazhi,"ItemXiguazhi");
		registerModel(FoodcraftItems.ItemXiguazhiice,"ItemXiguazhiice");
		registerModel(FoodcraftItems.ItemMianfensi,"ItemMianfensi");
		registerModel(FoodcraftItems.ItemCha,"ItemCha");
		registerModel(FoodcraftItems.ItemNaicha,"ItemNaicha");
		registerModel(FoodcraftItems.ItemKafei,"ItemKafei");
		registerModel(FoodcraftItems.ItemBaiqiuji,"ItemBaiqiuji");
		registerModel(FoodcraftItems.ItemCongyouji,"ItemCongyouji");
		registerModel(FoodcraftItems.ItemKoushuiji,"ItemKoushuiji");
		registerModel(FoodcraftItems.ItemLaziji,"ItemLaziji");
		registerModel(FoodcraftItems.ItemQingzhenyu,"ItemQingzhenyu");
		registerModel(FoodcraftItems.ItemMalayu,"ItemMalayu");
		registerModel(FoodcraftItems.ItemSuancaiyu,"ItemSuancaiyu");
		registerModel(FoodcraftItems.ItemKelejichifan,"ItemKelejichifan");
		registerModel(FoodcraftItems.ItemGalijiroufan,"ItemGalijiroufan");
		registerModel(FoodcraftItems.ItemGalikuai,"ItemGalikuai");
		registerModel(FoodcraftItems.ItemShuizhuniurou,"ItemShuizhuniurou");
		registerModel(FoodcraftItems.ItemMian,"ItemMian");
		registerModel(FoodcraftItems.ItemGuoqiaomixian,"ItemGuoqiaomixian");
		registerModel(FoodcraftItems.ItemYifen,"ItemYifen");
		registerModel(FoodcraftItems.ItemYifenpork,"ItemYifenpork");
		registerModel(FoodcraftItems.ItemYifenbeef,"ItemYifenbeef");
		registerModel(FoodcraftItems.ItemYifenchicken,"ItemYifenchicken");
		registerModel(FoodcraftItems.ItemPidanshourouzhou,"ItemPidanshourouzhou");
		registerModel(FoodcraftItems.ItemYuebing,"ItemYuebing");
		registerModel(FoodcraftItems.ItemMantou,"ItemMantou");
		registerModel(FoodcraftItems.ItemSuancaibing,"ItemSuancaibing");
		registerModel(FoodcraftItems.ItemYoutiao,"ItemYoutiao");
		registerModel(FoodcraftItems.ItemLatiao,"ItemLatiao");
		registerModel(FoodcraftItems.ItemHetaosu,"ItemHetaosu");
		registerModel(FoodcraftItems.ItemAici,"ItemAici");
		registerModel(FoodcraftItems.ItemCiba,"ItemCiba");
		registerModel(FoodcraftItems.ItemChangfen,"ItemChangfen");
		registerModel(FoodcraftItems.ItemXiangchang,"ItemXiangchang");
		registerModel(FoodcraftItems.ItemRegou,"ItemRegou");
		registerModel(FoodcraftItems.ItemLachang,"ItemLachang");
		registerModel(FoodcraftItems.ItemLarou,"ItemLarou");
		registerModel(FoodcraftItems.ItemZhaxiangchang,"ItemZhaxiangchang");
		registerModel(FoodcraftItems.ItemRibendoufu,"ItemRibendoufu");
		registerModel(FoodcraftItems.ItemLabazhou,"ItemLabazhou");
		registerModel(FoodcraftItems.ItemLaweixunliao,"ItemLaweixunliao");
		registerModel(FoodcraftItems.ItemNainao,"ItemNainao");
		registerModel(FoodcraftItems.ItemPisa,"ItemPisa");
		registerModel(FoodcraftItems.ItemHanbaobao,"ItemHanbaobao");
		registerModel(FoodcraftItems.ItemYouyurou,"ItemYouyurou");
		registerModel(FoodcraftItems.ItemShuyouyurou,"ItemShuyouyurou");
		registerModel(FoodcraftItems.ItemYouyusi,"ItemYouyusi");
		registerModel(FoodcraftItems.ItemCaidaoHJ,"ItemCaidaoHJ");
		registerModel(FoodcraftItems.ItemCaidaoZS,"ItemCaidaoZS");
		registerModel(FoodcraftItems.ItemCaidaoLBS,"ItemCaidaoLBS");
		registerModel(FoodcraftItems.ItemWrench,"ItemWrench");
		registerModel(FoodcraftItems.ItemJinkela,"ItemJinkela");
		registerModel(FoodcraftItems.ItemKaoyumi,"ItemKaoyumi");
		registerModel(FoodcraftItems.ItemKaohongshu,"ItemKaohongshu");
		registerModel(FoodcraftItems.ItemBaoyumihua,"ItemBaoyumihua");
		registerModel(FoodcraftItems.ItemBingganXN,"ItemBingganXN");
		registerModel(FoodcraftItems.ItemBingganF,"ItemBingganF");
		registerModel(FoodcraftItems.ItemHongdou,"ItemHongdou");
		registerModel(FoodcraftItems.ItemLvdou,"ItemLvdou");
		registerModel(FoodcraftItems.ItemBailuobo,"ItemBailuobo");
		registerModel(FoodcraftItems.ItemQingjiao,"ItemQingjiao");
		registerModel(FoodcraftItems.ItemDoujiao,"ItemDoujiao");
		registerModel(FoodcraftItems.ItemHuanggua,"ItemHuanggua");
		registerModel(FoodcraftItems.ItemYumi,"ItemYumi");
		registerModel(FoodcraftItems.ItemHongshu,"ItemHongshu");
		registerModel(FoodcraftItems.ItemLi,"ItemLi");
		registerModel(FoodcraftItems.ItemLizhi,"ItemLizhi");
		registerModel(FoodcraftItems.ItemTaozi,"ItemTaozi");
		registerModel(FoodcraftItems.ItemJuzi,"ItemJuzi");
		registerModel(FoodcraftItems.ItemPipa,"ItemPipa");
		registerModel(FoodcraftItems.ItemMangguo,"ItemMangguo");
		registerModel(FoodcraftItems.ItemNingmeng,"ItemNingmeng");
		registerModel(FoodcraftItems.ItemYouzi,"ItemYouzi");
		registerModel(FoodcraftItems.ItemShizi,"ItemShizi");
		registerModel(FoodcraftItems.ItemMugua,"ItemMugua");
		registerModel(FoodcraftItems.ItemShanzha,"ItemShanzha");
		registerModel(FoodcraftItems.ItemLongyan,"ItemLongyan");
		registerModel(FoodcraftItems.ItemShiliu,"ItemShiliu");
		registerModel(FoodcraftItems.ItemHongzao,"ItemHongzao");
		registerModel(FoodcraftItems.ItemCaomei,"ItemCaomei");
		registerModel(FoodcraftItems.ItemYezi,"ItemYezi");
		registerModel(FoodcraftItems.ItemYingtao,"ItemYingtao");
		registerModel(FoodcraftItems.ItemXiangjiao,"ItemXiangjiao");
		registerModel(FoodcraftItems.ItemShucaizhong,"ItemShucaizhong");
		registerModel(FoodcraftItems.ItemLajiaozhong,"ItemLajiaozhong");
		registerModel(FoodcraftItems.ItemFanqiezhong,"ItemFanqiezhong");
		registerModel(FoodcraftItems.ItemPutaozhong,"ItemPutaozhong");
		registerModel(FoodcraftItems.ItemQiezizhong,"ItemQiezizhong");
		registerModel(FoodcraftItems.ItemQingjiaozhong,"ItemQingjiaozhong");
		registerModel(FoodcraftItems.ItemYumizhong,"ItemYumizhong");
		registerModel(FoodcraftItems.ItemHuangguazhong,"ItemHuangguazhong");
		registerModel(FoodcraftItems.ItemLizijiu,"ItemLizijiu");
		registerModel(FoodcraftItems.ItemLizhijiu,"ItemLizhijiu");
		registerModel(FoodcraftItems.ItemTaozijiu,"ItemTaozijiu");
		registerModel(FoodcraftItems.ItemMangguojiu,"ItemMangguojiu");
		registerModel(FoodcraftItems.ItemNingmengjiu,"ItemNingmengjiu");
		registerModel(FoodcraftItems.ItemShiliujiu,"ItemShiliujiu");
		registerModel(FoodcraftItems.ItemBailuobozhi,"ItemBailuobozhi");
		registerModel(FoodcraftItems.ItemFanqiezhi,"ItemFanqiezhi");
		registerModel(FoodcraftItems.ItemYumizhi,"ItemYumizhi");
		registerModel(FoodcraftItems.ItemHuangguazhi,"ItemHuangguazhi");
		registerModel(FoodcraftItems.ItemLizizhi,"ItemLizizhi");
		registerModel(FoodcraftItems.ItemLizhizhi,"ItemLizhizhi");
		registerModel(FoodcraftItems.ItemTaozizhi,"ItemTaozizhi");
		registerModel(FoodcraftItems.ItemJuzizhi,"ItemJuzizhi");
		registerModel(FoodcraftItems.ItemPipazhi,"ItemPipazhi");
		registerModel(FoodcraftItems.ItemMangguozhi,"ItemMangguozhi");
		registerModel(FoodcraftItems.ItemNingmengzhi,"ItemNingmengzhi");
		registerModel(FoodcraftItems.ItemYouzizhi,"ItemYouzizhi");
		registerModel(FoodcraftItems.ItemShizizhi,"ItemShizizhi");
		registerModel(FoodcraftItems.ItemMuguazhi,"ItemMuguazhi");
		registerModel(FoodcraftItems.ItemShanzhazhi,"ItemShanzhazhi");
		registerModel(FoodcraftItems.ItemShiliuzhi,"ItemShiliuzhi");
		registerModel(FoodcraftItems.ItemHongzaozhi,"ItemHongzaozhi");
		registerModel(FoodcraftItems.ItemCaomeizhi,"ItemCaomeizhi");
		registerModel(FoodcraftItems.ItemYezizhi,"ItemYezizhi");
		registerModel(FoodcraftItems.ItemYingtaozhi,"ItemYingtaozhi");
		registerModel(FoodcraftItems.ItemXiangjiaozhi,"ItemXiangjiaozhi");
		registerModel(FoodcraftItems.ItemYenai,"ItemYenai");
		registerModel(FoodcraftItems.ItemLizhizhiice,"ItemLizhizhiice");
		registerModel(FoodcraftItems.ItemTaozizhiice,"ItemTaozizhiice");
		registerModel(FoodcraftItems.ItemJuzizhiice,"ItemJuzizhiice");
		registerModel(FoodcraftItems.ItemMangguozhiice,"ItemMangguozhiice");
		registerModel(FoodcraftItems.ItemNingmengzhiice,"ItemNingmengzhiice");
		registerModel(FoodcraftItems.ItemMuguazhiice,"ItemMuguazhiice");
		registerModel(FoodcraftItems.ItemCaomeizhiice,"ItemCaomeizhiice");
		registerModel(FoodcraftItems.ItemYezizhiice,"ItemYezizhiice");
		registerModel(FoodcraftItems.ItemXiangjiaozhiice,"ItemXiangjiaozhiice");
		registerModel(FoodcraftItems.ItemDousha,"ItemDousha");
		registerModel(FoodcraftItems.ItemBailuobosi,"ItemBailuobosi");
		registerModel(FoodcraftItems.ItemNull,"ItemNull");
		registerModel(FoodcraftItems.ItemShaojiaodeshiwu,"ItemShaojiaodeshiwu");
		registerModelGJ(FoodcraftItems.ItemGuojiang,"ItemGuojiang");
		registerModelBG(FoodcraftItems.ItemBinggan,"ItemBinggan");
		registerModelDG(FoodcraftItems.ItemDangao,"ItemDangao");
		registerModelBlock(FoodcraftPlants.BlockYezi,"BlockYezi");
		registerModelBlock(FoodcraftBlocks.Blocksugar,"blocksugar");
		registerModelBlock(FoodcraftBlocks.BlockDami,"blockdami");
		registerModelBlock(FoodcraftBlocks.BlockHuashenk,"blockhuashenk");
		registerModelBlock(FoodcraftBlocks.BlockLuobo,"blockluobo");
		registerModelBlock(FoodcraftBlocks.BlockTudou,"blocktudou");
		registerModelBlock(FoodcraftBlocks.BlockYan,"blockyan");
		registerModelBlock(FoodcraftBlocks.BlockDouzik,"blockdouzik");
		registerModelBlock(FoodcraftBlocks.BlockRuomi,"blockruomi");
		registerModelBlock(FoodcraftBlocks.BlockDouban,"blockdouban");
		registerModelBlock(FoodcraftBlocks.BlockQiaokeli,"blockqiaokeli");
		registerModelBlock(FoodcraftBlocks.BlockWaike,"blockwaike");
		registerModelBlock(FoodcraftPlants.BlockXiangjiao,"BlockXiangjiao");
		registerModelBlock(FoodcraftPlants.BlockYezi,"BlockYezi");
		registerModelBlock(FoodcraftGuiBlocks.Nmj,"Nmj");
		registerModelBlock(FoodcraftGuiBlocks.Tpj,"Tpj");
		registerModelBlock(FoodcraftGuiBlocks.YZJ,"YZJ");
		registerModelBlock(FoodcraftGuiBlocks.Zl,"Zl");
		registerModelBlock(FoodcraftGuiBlocks.Nt,"Nt");
		registerModelBlock(FoodcraftGuiBlocks.PDG,"PDG");
		registerModelBlock(FoodcraftGuiBlocks.Guo,"Guo");
		registerModelBlock(FoodcraftGuiBlocks.Gyg,"Gyg");
		registerModelBlock(FoodcraftGuiBlocks.Caiban,"Caiban");
		registerModelBlock(FoodcraftPlants.FCleaves,"FCleaves");
		registerModelBlock(FoodcraftPlants.BlockLi,"BlockLi");
		registerModelBlock(FoodcraftPlants.BlockLizhi,"BlockLizhi");
		registerModelBlock(FoodcraftPlants.BlockTaozi,"BlockTaozi");
		registerModelBlock(FoodcraftPlants.BlockJuzi,"BlockJuzi");
		registerModelBlock(FoodcraftPlants.BlockPipa,"BlockPipa");
		registerModelBlock(FoodcraftPlants.BlockMangguo,"BlockMangguo");
		registerModelBlock(FoodcraftPlants.BlockNingmeng,"BlockNingmeng");
		registerModelBlock(FoodcraftPlants.BlockYouzi,"BlockYouzi");
		registerModelBlock(FoodcraftPlants.BlockShizi,"BlockShizi");
		registerModelBlock(FoodcraftPlants.BlockMugua,"BlockMugua");
		registerModelBlock(FoodcraftPlants.BlockShanzha,"BlockShanzha");
		registerModelBlock(FoodcraftPlants.BlockLongyan,"BlockLongyan");
		registerModelBlock(FoodcraftPlants.BlockShiliu,"BlockShiliu");
		registerModelBlock(FoodcraftPlants.BlockHongzao,"BlockHongzao");
		registerModelBlock(FoodcraftPlants.BlockYezi,"BlockYezi");
		registerModelBlock(FoodcraftPlants.BlockYingtao,"BlockYingtao");
		registerModelBlock(FoodcraftPlants.BlockXiangjiao,"BlockXiangjiao");
		registerModelBlock(FoodcraftPlants.BlockLishu,"BlockLishu");
		registerModelBlock(FoodcraftPlants.BlockLizhishu,"BlockLizhishu");
		registerModelBlock(FoodcraftPlants.BlockTaozishu,"BlockTaozishu");
		registerModelBlock(FoodcraftPlants.BlockJuzishu,"BlockJuzishu");
		registerModelBlock(FoodcraftPlants.BlockPipashu,"BlockPipashu");
		registerModelBlock(FoodcraftPlants.BlockMangguoshu,"BlockMangguoshu");
		registerModelBlock(FoodcraftPlants.BlockNingmengshu,"BlockNingmengshu");
		registerModelBlock(FoodcraftPlants.BlockYouzishu,"BlockYouzishu");
		registerModelBlock(FoodcraftPlants.BlockShizishu,"BlockShizishu");
		registerModelBlock(FoodcraftPlants.BlockMuguashu,"BlockMuguashu");
		registerModelBlock(FoodcraftPlants.BlockShanzhashu,"BlockShanzhashu");
		registerModelBlock(FoodcraftPlants.BlockLongyanshu,"BlockLongyanshu");
		registerModelBlock(FoodcraftPlants.BlockShiliushu,"BlockShiliushu");
		registerModelBlock(FoodcraftPlants.BlockHongzaoshu,"BlockHongzaoshu");
		registerModelBlock(FoodcraftPlants.BlockYezishu,"BlockYezishu");
		registerModelBlock(FoodcraftPlants.BlockYingtaoshu,"BlockYingtaoshu");
		registerModelBlock(FoodcraftPlants.BlockXiangjiaoshu,"BlockXiangjiaoshu");
		registerModelBlock(FoodcraftPlants.BlockCong,"BlockCong");
	}
private static void registerModelGJ(Item myitem, String name) {
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
private static void registerModelBG(Item myitem, String name) {
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
private static void registerModelDG(Item myitem, String name) {
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
private static void registerModel(Item myitem, String name){
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myitem, 0,
		    new ModelResourceLocation("foodcraft:" + name, "inventory"));
		ModelBakery.addVariantName(myitem, "foodcraft:" + name);
}

private static void registerModelBlock(Block myitem, String name){
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(myitem), 0,
		    new ModelResourceLocation("foodcraft:" + name, "inventory"));
		ModelBakery.addVariantName(Item.getItemFromBlock(myitem), "foodcraft:" + name);
}
}
