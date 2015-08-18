package com.cfyifei;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.cfyifei.block.FoodcraftBlocks;
import com.cfyifei.gui.blocks.ModGui;
import com.cfyifei.item.FoodcraftItems;
import com.cfyifei.plant.blocks.FoodcraftPlants;
import com.google.common.collect.Lists;

public class RegisterItemmodel {
public static void init() {
FoodcraftItems.registermodel(FoodcraftItems.ItemTiepian,"ItemTiepian");
FoodcraftItems.registermodel(FoodcraftItems.Itemwater,"Itemwater");
FoodcraftItems.registermodel(FoodcraftItems.ItemCaidao,"ItemCaidao");
FoodcraftItems.registermodel(FoodcraftItems.ItemJinghuashuitong,"ItemJinghuashuitong");
FoodcraftItems.registermodel(FoodcraftItems.ItemDami,"ItemDami");
FoodcraftItems.registermodel(FoodcraftItems.ItemHuashen,"ItemHuashen");
FoodcraftItems.registermodel(FoodcraftItems.ItemShucai,"ItemShucai");
FoodcraftItems.registermodel(FoodcraftItems.ItemDouzi,"ItemDouzi");
FoodcraftItems.registermodel(FoodcraftItems.Itemfan,"Itemfan");
FoodcraftItems.registermodel(FoodcraftItems.ItemMianfen,"ItemMianfen");
FoodcraftItems.registermodel(FoodcraftItems.ItemHuashenyou,"ItemHuashenyou");
FoodcraftItems.registermodel(FoodcraftItems.ItemDoujiang,"ItemDoujiang");
FoodcraftItems.registermodel(FoodcraftItems.ItemDianluban,"ItemDianluban");
FoodcraftItems.registermodel(FoodcraftItems.ItemJianjidan,"ItemJianjidan");
FoodcraftItems.registermodel(FoodcraftItems.ItemLaobing,"Itembing");
FoodcraftItems.registermodel(FoodcraftItems.ItemMianpi,"ItemMianpi");
FoodcraftItems.registermodel(FoodcraftItems.ItemJiaozixian,"ItemJiaozixian");
FoodcraftItems.registermodel(FoodcraftItems.ItemJiaozi,"ItemJiaozi");
FoodcraftItems.registermodel(FoodcraftItems.ItemJianjiao,"ItemJianJiao0");
FoodcraftItems.registermodel(FoodcraftItems.ItemQiaokelifen,"ItemQiaokelifen");
FoodcraftItems.registermodel(FoodcraftItems.ItemQiaokeli,"ItemQiaokeli");
FoodcraftItems.registermodel(FoodcraftItems.ItemLajiao,"ItemLajiao");
FoodcraftItems.registermodel(FoodcraftItems.ItemFanqie,"ItemFanqie");
FoodcraftItems.registermodel(FoodcraftItems.ItemPutao,"ItemPutao");
FoodcraftItems.registermodel(FoodcraftItems.ItemQiezi,"ItemQiezi");
FoodcraftItems.registermodel(FoodcraftItems.ItemYan,"ItemYan");
FoodcraftItems.registermodel(FoodcraftItems.ItemDoufu,"ItemDoufu");
FoodcraftItems.registermodel(FoodcraftItems.ItemJiangyou,"ItemJiangyou");
FoodcraftItems.registermodel(FoodcraftItems.ItemNuomi,"ItemNuomi");
FoodcraftItems.registermodel(FoodcraftItems.ItemDoufugan,"ItemDoufugan");
FoodcraftItems.registermodel(FoodcraftItems.ItemBaifan,"ItemBaifan");
FoodcraftItems.registermodel(FoodcraftItems.ItemFanqiechaojidanfan,"ItemFanqiechaojidanfan");
FoodcraftItems.registermodel(FoodcraftItems.ItemDisanxian,"ItemDisanxian");
FoodcraftItems.registermodel(FoodcraftItems.ItemYuxiangrousi,"ItemYuxiangrousi");
FoodcraftItems.registermodel(FoodcraftItems.ItemCu,"ItemCu");
FoodcraftItems.registermodel(FoodcraftItems.ItemGongbaojiding,"ItemGongbaojiding");
FoodcraftItems.registermodel(FoodcraftItems.ItemJitui,"ItemJitui");
FoodcraftItems.registermodel(FoodcraftItems.ItemTudoupian,"ItemTudoupian");
FoodcraftItems.registermodel(FoodcraftItems.ItemTudousi,"ItemTudousi");
FoodcraftItems.registermodel(FoodcraftItems.ItemChaotudousifan,"ItemChaotudousifan");
FoodcraftItems.registermodel(FoodcraftItems.ItemChaotudoupian,"ItemChaotudoupian");
FoodcraftItems.registermodel(FoodcraftItems.ItemDuojiaoyutou,"ItemDuojiaoyutou");
FoodcraftItems.registermodel(FoodcraftItems.ItemDouban,"ItemDouban");
FoodcraftItems.registermodel(FoodcraftItems.ItemMapodoufufan,"ItemMapodoufufan");
FoodcraftItems.registermodel(FoodcraftItems.ItemDianfen,"ItemDianfen");
FoodcraftItems.registermodel(FoodcraftItems.ItemHongshaoroufan,"ItemHongshaoroufan");
FoodcraftItems.registermodel(FoodcraftItems.ItemHuiguoroufan,"ItemHuiguoroufan");
FoodcraftItems.registermodel(FoodcraftItems.ItemXifan,"ItemXifan");
FoodcraftItems.registermodel(FoodcraftItems.ItemDangeng,"ItemDangeng");
FoodcraftItems.registermodel(FoodcraftItems.ItemMogudunjitang,"ItemMgdjt");
FoodcraftItems.registermodel(FoodcraftItems.ItemZongzi,"ItemZongzi");
FoodcraftItems.registermodel(FoodcraftItems.ItemZongye,"ItemZongye");
FoodcraftItems.registermodel(FoodcraftItems.ItemCong,"ItemCong");
FoodcraftItems.registermodel(FoodcraftItems.ItemNuomifen,"ItemNuomifen");
FoodcraftItems.registermodel(FoodcraftItems.ItemNuomituan,"ItemNuomituan");
FoodcraftItems.registermodel(FoodcraftItems.ItemHuashentangyuanxian,"ItemHuashentangyuanxian");
FoodcraftItems.registermodel(FoodcraftItems.ItemTangyuan,"ItemTangyuan");
FoodcraftItems.registermodel(FoodcraftItems.ItemJikuai,"ItemJikuai");
FoodcraftItems.registermodel(FoodcraftItems.ItemShutiao,"ItemShutiao");
FoodcraftItems.registermodel(FoodcraftItems.ItemAeljichi,"ItemAeljichi");
FoodcraftItems.registermodel(FoodcraftItems.ItemJimihua,"ItemJimihua");
FoodcraftItems.registermodel(FoodcraftItems.ItemYuanweijikuai,"ItemYuanweijikuai");
FoodcraftItems.registermodel(FoodcraftItems.ItemAeljichifan,"ItemAeljichifan");
FoodcraftItems.registermodel(FoodcraftItems.ItemMahua,"ItemMahua");
FoodcraftItems.registermodel(FoodcraftItems.ItemNiangao,"ItemNiangao");
FoodcraftItems.registermodel(FoodcraftItems.ItemChunjuan,"ItemChunjuan");
FoodcraftItems.registermodel(FoodcraftItems.ItemZhadoufu,"ItemZhadoufu");
FoodcraftItems.registermodel(FoodcraftItems.ItemZhaniangao,"ItemZhaniangao");
FoodcraftItems.registermodel(FoodcraftItems.ItemShupian,"ItemShupian");
FoodcraftItems.registermodel(FoodcraftItems.ItemZhamianbao,"ItemZhamianbao");
FoodcraftItems.registermodel(FoodcraftItems.ItemZhachunjuan,"ItemZhachunjuan");
FoodcraftItems.registermodel(FoodcraftItems.ItemZhamahua,"ItemZhamahua");
FoodcraftItems.registermodel(FoodcraftItems.ItemZhajitui,"ItemZhajitui");
FoodcraftItems.registermodel(FoodcraftItems.ItemDajirou,"ItemDajirou");
FoodcraftItems.registermodel(FoodcraftItems.ItemZhongjirou,"ItemZhongjirou");
FoodcraftItems.registermodel(FoodcraftItems.ItemXiaojirou,"ItemXiaojirou");
FoodcraftItems.registermodel(FoodcraftItems.ItemJichi,"ItemJichi");
FoodcraftItems.registermodel(FoodcraftItems.ItemDoufusi,"ItemDoufusi");
FoodcraftItems.registermodel(FoodcraftItems.ItemLuobosi,"ItemLuobosi");
FoodcraftItems.registermodel(FoodcraftItems.ItemHongjiu,"ItemHongjiu");
FoodcraftItems.registermodel(FoodcraftItems.ItemBaijiu,"ItemBaijiu");
FoodcraftItems.registermodel(FoodcraftItems.ItemPingguojiu,"ItemPingguojiu");
FoodcraftItems.registermodel(FoodcraftItems.ItemPutaojiu,"ItemPutaojiu");
FoodcraftItems.registermodel(FoodcraftItems.ItemJinputao,"ItemJinputao");
FoodcraftItems.registermodel(FoodcraftItems.ItemJinputaojiu,"ItemJinputaojiu");
FoodcraftItems.registermodel(FoodcraftItems.ItemJinpingguojiu,"ItemJinpingguojiu");
FoodcraftItems.registermodel(FoodcraftItems.ItemQiaokelishui,"ItemQiaokelishui");
FoodcraftItems.registermodel(FoodcraftItems.ItemQiaokelinai,"ItemQiaokelinai");
FoodcraftItems.registermodel(FoodcraftItems.ItemHuluobozhi,"ItemHuluobozhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemPutaozhi,"ItemPutaozhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemPingguozhi,"ItemPingguozhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemShucaizhi,"ItemShucaizhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemJinputaozhi,"ItemJinputaozhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemJinpingguozhi,"ItemJinpingguozhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemDounai,"ItemDounai");
FoodcraftItems.registermodel(FoodcraftItems.ItemKele,"ItemKele");
FoodcraftItems.registermodel(FoodcraftItems.ItemXuebi,"ItemXuebi");
FoodcraftItems.registermodel(FoodcraftItems.ItemQiaokelinaiice,"ItemQiaokelinaiice");
FoodcraftItems.registermodel(FoodcraftItems.ItemPutaozhiice,"ItemPutaozhiice");
FoodcraftItems.registermodel(FoodcraftItems.ItemPingguozhiice,"ItemPingguozhiice");
FoodcraftItems.registermodel(FoodcraftItems.ItemJinputaozhiice,"ItemJinputaozhiice");
FoodcraftItems.registermodel(FoodcraftItems.ItemJinpingguozhiice,"ItemJinpingguozhiice");
FoodcraftItems.registermodel(FoodcraftItems.ItemXiguazhi,"ItemXiguazhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemXiguazhiice,"ItemXiguazhiice");
FoodcraftItems.registermodel(FoodcraftItems.ItemMianfensi,"ItemMianfensi");
FoodcraftItems.registermodel(FoodcraftItems.ItemCha,"ItemCha");
FoodcraftItems.registermodel(FoodcraftItems.ItemNaicha,"ItemNaicha");
FoodcraftItems.registermodel(FoodcraftItems.ItemKafei,"ItemKafei");
FoodcraftItems.registermodel(FoodcraftItems.ItemBaiqiuji,"ItemBaiqiuji");
FoodcraftItems.registermodel(FoodcraftItems.ItemCongyouji,"ItemCongyouji");
FoodcraftItems.registermodel(FoodcraftItems.ItemKoushuiji,"ItemKoushuiji");
FoodcraftItems.registermodel(FoodcraftItems.ItemLaziji,"ItemLaziji");
FoodcraftItems.registermodel(FoodcraftItems.ItemQingzhenyu,"ItemQingzhenyu");
FoodcraftItems.registermodel(FoodcraftItems.ItemMalayu,"ItemMalayu");
FoodcraftItems.registermodel(FoodcraftItems.ItemSuancaiyu,"ItemSuancaiyu");
FoodcraftItems.registermodel(FoodcraftItems.ItemKelejichifan,"ItemKelejichifan");
FoodcraftItems.registermodel(FoodcraftItems.ItemGalijiroufan,"ItemGalijiroufan");
FoodcraftItems.registermodel(FoodcraftItems.ItemGalikuai,"ItemGalikuai");
FoodcraftItems.registermodel(FoodcraftItems.ItemShuizhuniurou,"ItemShuizhuniurou");
FoodcraftItems.registermodel(FoodcraftItems.ItemMian,"ItemMian");
FoodcraftItems.registermodel(FoodcraftItems.ItemGuoqiaomixian,"ItemGuoqiaomixian");
FoodcraftItems.registermodel(FoodcraftItems.ItemYifen,"ItemYifen");
FoodcraftItems.registermodel(FoodcraftItems.ItemYifenpork,"ItemYifenpork");
FoodcraftItems.registermodel(FoodcraftItems.ItemYifenbeef,"ItemYifenbeef");
FoodcraftItems.registermodel(FoodcraftItems.ItemYifenchicken,"ItemYifenchicken");
FoodcraftItems.registermodel(FoodcraftItems.ItemPidanshourouzhou,"ItemPidanshourouzhou");
FoodcraftItems.registermodel(FoodcraftItems.ItemYuebing,"ItemYuebing");
FoodcraftItems.registermodel(FoodcraftItems.ItemMantou,"ItemMantou");
FoodcraftItems.registermodel(FoodcraftItems.ItemSuancaibing,"ItemSuancaibing");
FoodcraftItems.registermodel(FoodcraftItems.ItemYoutiao,"ItemYoutiao");
FoodcraftItems.registermodel(FoodcraftItems.ItemLatiao,"ItemLatiao");
FoodcraftItems.registermodel(FoodcraftItems.ItemHetaosu,"ItemHetaosu");
FoodcraftItems.registermodel(FoodcraftItems.ItemAici,"ItemAici");
FoodcraftItems.registermodel(FoodcraftItems.ItemCiba,"ItemCiba");
FoodcraftItems.registermodel(FoodcraftItems.ItemChangfen,"ItemChangfen");
FoodcraftItems.registermodel(FoodcraftItems.ItemXiangchang,"ItemXiangchang");
FoodcraftItems.registermodel(FoodcraftItems.ItemRegou,"ItemRegou");
FoodcraftItems.registermodel(FoodcraftItems.ItemLachang,"ItemLachang");
FoodcraftItems.registermodel(FoodcraftItems.ItemLarou,"ItemLarou");
FoodcraftItems.registermodel(FoodcraftItems.ItemZhaxiangchang,"ItemZhaxiangchang");
FoodcraftItems.registermodel(FoodcraftItems.ItemRibendoufu,"ItemRibendoufu");
FoodcraftItems.registermodel(FoodcraftItems.ItemLabazhou,"ItemLabazhou");
FoodcraftItems.registermodel(FoodcraftItems.ItemLaweixunliao,"ItemLaweixunliao");
FoodcraftItems.registermodel(FoodcraftItems.ItemNainao,"ItemNainao");
FoodcraftItems.registermodel(FoodcraftItems.ItemPisa,"ItemPisa");
FoodcraftItems.registermodel(FoodcraftItems.ItemHanbaobao,"ItemHanbaobao");
FoodcraftItems.registermodel(FoodcraftItems.ItemYouyurou,"ItemYouyurou");
FoodcraftItems.registermodel(FoodcraftItems.ItemShuyouyurou,"ItemShuyouyurou");
FoodcraftItems.registermodel(FoodcraftItems.ItemYouyusi,"ItemYouyusi");
FoodcraftItems.registermodel(FoodcraftItems.ItemCaidaoHJ,"ItemCaidaoHJ");
FoodcraftItems.registermodel(FoodcraftItems.ItemCaidaoZS,"ItemCaidaoZS");
FoodcraftItems.registermodel(FoodcraftItems.ItemCaidaoLBS,"ItemCaidaoLBS");
FoodcraftItems.registermodel(FoodcraftItems.ItemWrench,"ItemWrench");
FoodcraftItems.registermodel(FoodcraftItems.ItemJinkela,"ItemJinkela");
FoodcraftItems.registermodel(FoodcraftItems.ItemKaoyumi,"ItemKaoyumi");
FoodcraftItems.registermodel(FoodcraftItems.ItemKaohongshu,"ItemKaohongshu");
FoodcraftItems.registermodel(FoodcraftItems.ItemBaoyumihua,"ItemBaoyumihua");
FoodcraftItems.registermodel(FoodcraftItems.ItemBingganXN,"ItemBingganXN");
FoodcraftItems.registermodel(FoodcraftItems.ItemBingganF,"ItemBingganF");
FoodcraftItems.registermodel(FoodcraftItems.ItemHongdou,"ItemHongdou");
FoodcraftItems.registermodel(FoodcraftItems.ItemLvdou,"ItemLvdou");
FoodcraftItems.registermodel(FoodcraftItems.ItemBailuobo,"ItemBailuobo");
FoodcraftItems.registermodel(FoodcraftItems.ItemQingjiao,"ItemQingjiao");
FoodcraftItems.registermodel(FoodcraftItems.ItemDoujiao,"ItemDoujiao");
FoodcraftItems.registermodel(FoodcraftItems.ItemHuanggua,"ItemHuanggua");
FoodcraftItems.registermodel(FoodcraftItems.ItemYumi,"ItemYumi");
FoodcraftItems.registermodel(FoodcraftItems.ItemHongshu,"ItemHongshu");
FoodcraftItems.registermodel(FoodcraftItems.ItemLi,"ItemLi");
FoodcraftItems.registermodel(FoodcraftItems.ItemLizhi,"ItemLizhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemTaozi,"ItemTaozi");
FoodcraftItems.registermodel(FoodcraftItems.ItemJuzi,"ItemJuzi");
FoodcraftItems.registermodel(FoodcraftItems.ItemPipa,"ItemPipa");
FoodcraftItems.registermodel(FoodcraftItems.ItemMangguo,"ItemMangguo");
FoodcraftItems.registermodel(FoodcraftItems.ItemNingmeng,"ItemNingmeng");
FoodcraftItems.registermodel(FoodcraftItems.ItemYouzi,"ItemYouzi");
FoodcraftItems.registermodel(FoodcraftItems.ItemShizi,"ItemShizi");
FoodcraftItems.registermodel(FoodcraftItems.ItemMugua,"ItemMugua");
FoodcraftItems.registermodel(FoodcraftItems.ItemShanzha,"ItemShanzha");
FoodcraftItems.registermodel(FoodcraftItems.ItemLongyan,"ItemLongyan");
FoodcraftItems.registermodel(FoodcraftItems.ItemShiliu,"ItemShiliu");
FoodcraftItems.registermodel(FoodcraftItems.ItemHongzao,"ItemHongzao");
FoodcraftItems.registermodel(FoodcraftItems.ItemCaomei,"ItemCaomei");
FoodcraftItems.registermodel(FoodcraftItems.ItemYezi,"ItemYezi");
FoodcraftItems.registermodel(FoodcraftItems.ItemYingtao,"ItemYingtao");
FoodcraftItems.registermodel(FoodcraftItems.ItemXiangjiao,"ItemXiangjiao");
FoodcraftItems.registermodel(FoodcraftItems.ItemShucaizhong,"ItemShucaizhong");
FoodcraftItems.registermodel(FoodcraftItems.ItemLajiaozhong,"ItemLajiaozhong");
FoodcraftItems.registermodel(FoodcraftItems.ItemFanqiezhong,"ItemFanqiezhong");
FoodcraftItems.registermodel(FoodcraftItems.ItemPutaozhong,"ItemPutaozhong");
FoodcraftItems.registermodel(FoodcraftItems.ItemQiezizhong,"ItemQiezizhong");
FoodcraftItems.registermodel(FoodcraftItems.ItemQingjiaozhong,"ItemQingjiaozhong");
FoodcraftItems.registermodel(FoodcraftItems.ItemYumizhong,"ItemYumizhong");
FoodcraftItems.registermodel(FoodcraftItems.ItemHuangguazhong,"ItemHuangguazhong");
FoodcraftItems.registermodel(FoodcraftItems.ItemLizijiu,"ItemLizijiu");
FoodcraftItems.registermodel(FoodcraftItems.ItemLizhijiu,"ItemLizhijiu");
FoodcraftItems.registermodel(FoodcraftItems.ItemTaozijiu,"ItemTaozijiu");
FoodcraftItems.registermodel(FoodcraftItems.ItemMangguojiu,"ItemMangguojiu");
FoodcraftItems.registermodel(FoodcraftItems.ItemNingmengjiu,"ItemNingmengjiu");
FoodcraftItems.registermodel(FoodcraftItems.ItemShiliujiu,"ItemShiliujiu");
FoodcraftItems.registermodel(FoodcraftItems.ItemBailuobozhi,"ItemBailuobozhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemFanqiezhi,"ItemFanqiezhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemYumizhi,"ItemYumizhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemHuangguazhi,"ItemHuangguazhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemLizizhi,"ItemLizizhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemLizhizhi,"ItemLizhizhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemTaozizhi,"ItemTaozizhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemJuzizhi,"ItemJuzizhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemPipazhi,"ItemPipazhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemMangguozhi,"ItemMangguozhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemNingmengzhi,"ItemNingmengzhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemYouzizhi,"ItemYouzizhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemShizizhi,"ItemShizizhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemMuguazhi,"ItemMuguazhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemShanzhazhi,"ItemShanzhazhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemShiliuzhi,"ItemShiliuzhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemHongzaozhi,"ItemHongzaozhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemCaomeizhi,"ItemCaomeizhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemYezizhi,"ItemYezizhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemYingtaozhi,"ItemYingtaozhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemXiangjiaozhi,"ItemXiangjiaozhi");
FoodcraftItems.registermodel(FoodcraftItems.ItemYenai,"ItemYenai");
FoodcraftItems.registermodel(FoodcraftItems.ItemLizhizhiice,"ItemLizhizhiice");
FoodcraftItems.registermodel(FoodcraftItems.ItemTaozizhiice,"ItemTaozizhiice");
FoodcraftItems.registermodel(FoodcraftItems.ItemJuzizhiice,"ItemJuzizhiice");
FoodcraftItems.registermodel(FoodcraftItems.ItemMangguozhiice,"ItemMangguozhiice");
FoodcraftItems.registermodel(FoodcraftItems.ItemNingmengzhiice,"ItemNingmengzhiice");
FoodcraftItems.registermodel(FoodcraftItems.ItemMuguazhiice,"ItemMuguazhiice");
FoodcraftItems.registermodel(FoodcraftItems.ItemCaomeizhiice,"ItemCaomeizhiice");
FoodcraftItems.registermodel(FoodcraftItems.ItemYezizhiice,"ItemYezizhiice");
FoodcraftItems.registermodel(FoodcraftItems.ItemXiangjiaozhiice,"ItemXiangjiaozhiice");
FoodcraftItems.registermodel(FoodcraftItems.ItemDousha,"ItemDousha");
FoodcraftItems.registermodel(FoodcraftItems.ItemBailuobosi,"ItemBailuobosi");
FoodcraftItems.registermodel(FoodcraftItems.ItemNull,"ItemNull");
registermodelGJ(FoodcraftItems.ItemGuojiang,"ItemGuojiang");
registermodelBG(FoodcraftItems.ItemBinggan,"ItemBinggan");
registermodelDG(FoodcraftItems.ItemDangao,"ItemDangao");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockYezi,"BlockYezi");
FoodcraftItems.registermodelBlock(FoodcraftBlocks.Blocksugar,"blocksugar");
FoodcraftItems.registermodelBlock(FoodcraftBlocks.BlockDami,"blockdami");
FoodcraftItems.registermodelBlock(FoodcraftBlocks.BlockHuashenk,"blockhuashenk");
FoodcraftItems.registermodelBlock(FoodcraftBlocks.BlockLuobo,"blockluobo");
FoodcraftItems.registermodelBlock(FoodcraftBlocks.BlockTudou,"blocktudou");
FoodcraftItems.registermodelBlock(FoodcraftBlocks.BlockYan,"blockyan");
FoodcraftItems.registermodelBlock(FoodcraftBlocks.BlockDouzik,"blockdouzik");
FoodcraftItems.registermodelBlock(FoodcraftBlocks.BlockRuomi,"blockruomi");
FoodcraftItems.registermodelBlock(FoodcraftBlocks.BlockDouban,"blockdouban");
FoodcraftItems.registermodelBlock(FoodcraftBlocks.BlockQiaokeli,"blockqiaokeli");
FoodcraftItems.registermodelBlock(FoodcraftBlocks.BlockWaike,"blockwaike");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockXiangjiao,"BlockXiangjiao");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockYezi,"BlockYezi");
FoodcraftItems.registermodelBlock(ModGui.Nmj,"Nmj");
FoodcraftItems.registermodelBlock(ModGui.Tpj,"Tpj");
FoodcraftItems.registermodelBlock(ModGui.YZJ,"YZJ");
FoodcraftItems.registermodelBlock(ModGui.Zl,"Zl");
FoodcraftItems.registermodelBlock(ModGui.Nt,"Nt");
FoodcraftItems.registermodelBlock(ModGui.PDG,"PDG");
FoodcraftItems.registermodelBlock(ModGui.Guo,"Guo");
FoodcraftItems.registermodelBlock(ModGui.Gyg,"Gyg");
FoodcraftItems.registermodelBlock(ModGui.Caiban,"Caiban");
FoodcraftItems.registermodelBlock(FoodcraftPlants.FCleaves,"FCleaves");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockLi,"BlockLi");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockLizhi,"BlockLizhi");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockTaozi,"BlockTaozi");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockJuzi,"BlockJuzi");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockPipa,"BlockPipa");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockMangguo,"BlockMangguo");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockNingmeng,"BlockNingmeng");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockYouzi,"BlockYouzi");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockShizi,"BlockShizi");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockMugua,"BlockMugua");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockShanzha,"BlockShanzha");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockLongyan,"BlockLongyan");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockShiliu,"BlockShiliu");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockHongzao,"BlockHongzao");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockYezi,"BlockYezi");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockYingtao,"BlockYingtao");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockXiangjiao,"BlockXiangjiao");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockLishu,"BlockLishu");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockLizhishu,"BlockLizhishu");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockTaozishu,"BlockTaozishu");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockJuzishu,"BlockJuzishu");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockPipashu,"BlockPipashu");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockMangguoshu,"BlockMangguoshu");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockNingmengshu,"BlockNingmengshu");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockYouzishu,"BlockYouzishu");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockShizishu,"BlockShizishu");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockMuguashu,"BlockMuguashu");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockShanzhashu,"BlockShanzhashu");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockLongyanshu,"BlockLongyanshu");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockShiliushu,"BlockShiliushu");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockHongzaoshu,"BlockHongzaoshu");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockYezishu,"BlockYezishu");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockYingtaoshu,"BlockYingtaoshu");
FoodcraftItems.registermodelBlock(FoodcraftPlants.BlockXiangjiaoshu,"BlockXiangjiaoshu");
FoodcraftItems.registermodelBlock(FoodcraftBlocks.BlockCong,"BlockCong");
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
