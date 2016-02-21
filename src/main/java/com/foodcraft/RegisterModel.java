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
		registerModel(FoodcraftItems.ItemIronSheet,"ItemIronSheet");
		registerModel(FoodcraftItems.Itemwater,"Itemwater");
		registerModel(FoodcraftItems.ItemKitchenKnife,"ItemKitchenKnife");
		registerModel(FoodcraftItems.ItemFoodcraftBucket,"ItemFoodcraftBucket");
		registerModel(FoodcraftItems.ItemRice,"ItemRice");
		registerModel(FoodcraftItems.ItemPeanut,"ItemPeanut");
		registerModel(FoodcraftItems.ItemVegetable,"ItemVegetable");
		registerModel(FoodcraftItems.ItemBeans,"ItemBeans");
		registerModel(FoodcraftItems.ItemMilledRice,"ItemMilledRice");
		registerModel(FoodcraftItems.ItemFlour,"ItemFlour");
		registerModel(FoodcraftItems.ItemPeanutOil,"ItemPeanutOil");
		registerModel(FoodcraftItems.ItemSoybeanMilk,"ItemSoybeanMilk");
		registerModel(FoodcraftItems.ItemMachineCore,"ItemMachineCore");
		registerModel(FoodcraftItems.ItemPoachedEgg,"ItemPoachedEgg");
		registerModel(FoodcraftItems.ItemPancakes,"ItemPancakes");
		registerModel(FoodcraftItems.ItemDumplingWrappers,"ItemDumplingWrappers");
		registerModel(FoodcraftItems.ItemDumplingMeat,"ItemDumplingMeat");
		registerModel(FoodcraftItems.ItemDumpling,"ItemDumpling");
		registerModel(FoodcraftItems.ItemFriedDumpling,"ItemFriedDumpling");
		registerModel(FoodcraftItems.ItemChocolateDust,"ItemChocolateDust");
		registerModel(FoodcraftItems.ItemChocolate,"ItemChocolate");
		registerModel(FoodcraftItems.ItemChili,"ItemChili");
		registerModel(FoodcraftItems.ItemTomato,"ItemTomato");
		registerModel(FoodcraftItems.ItemGrapes,"ItemGrapes");
		registerModel(FoodcraftItems.ItemEggplant,"ItemEggplant");
		registerModel(FoodcraftItems.ItemSalt,"ItemSalt");
		registerModel(FoodcraftItems.ItemTofu,"ItemTofu");
		registerModel(FoodcraftItems.ItemSoySauce,"ItemSoySauce");
		registerModel(FoodcraftItems.ItemStickyRice,"ItemStickyRice");
		registerModel(FoodcraftItems.ItemDriedTofu,"ItemDriedTofu");
		registerModel(FoodcraftItems.ItemCookedRice,"ItemCookedRice");
		registerModel(FoodcraftItems.ItemFanqiechaojidanfan,"ItemFanqiechaojidanfan");
		registerModel(FoodcraftItems.ItemDisanxian,"ItemDisanxian");
		registerModel(FoodcraftItems.ItemYuxiangrousi,"ItemYuxiangrousi");
		registerModel(FoodcraftItems.ItemVinegar,"ItemVinegar");
		registerModel(FoodcraftItems.ItemGongbaojiding,"ItemGongbaojiding");
		registerModel(FoodcraftItems.ItemDrumstick,"ItemDrumstick");
		registerModel(FoodcraftItems.ItemPotatoChips,"ItemPotatoChips");
		registerModel(FoodcraftItems.ItemPotatoesWire,"ItemPotatoesWire");
		registerModel(FoodcraftItems.ItemChaotudousifan,"ItemChaotudousifan");
		registerModel(FoodcraftItems.ItemFriedPotatoChips,"ItemFriedPotatoChips");
		registerModel(FoodcraftItems.ItemDuojiaoyutou,"ItemDuojiaoyutou");
		registerModel(FoodcraftItems.ItemWatercress,"ItemWatercress");
		registerModel(FoodcraftItems.ItemMapodoufufan,"ItemMapodoufufan");
		registerModel(FoodcraftItems.ItemStarches,"ItemStarches");
		registerModel(FoodcraftItems.ItemHongshaoroufan,"ItemHongshaoroufan");
		registerModel(FoodcraftItems.ItemHuiguoroufan,"ItemHuiguoroufan");
		registerModel(FoodcraftItems.ItemPorridge,"ItemPorridge");
		registerModel(FoodcraftItems.ItemEggSoup,"ItemEggSoup");
		registerModel(FoodcraftItems.ItemMogudunjitang,"ItemMgdjt");
		registerModel(FoodcraftItems.ItemStickyRiceDumpling,"ItemStickyRiceDumpling");
		registerModel(FoodcraftItems.ItemZongye,"ItemZongye");
		registerModel(FoodcraftItems.ItemScallion,"ItemScallion");
		registerModel(FoodcraftItems.ItemStickyRiceFlour,"ItemStickyRiceFlour");
		registerModel(FoodcraftItems.ItemStickyRiceDough,"ItemStickyRiceDough");
		registerModel(FoodcraftItems.ItemPeanutTangyuanStuffing,"ItemPeanutTangyuanStuffing");
		registerModel(FoodcraftItems.ItemTangyuan,"ItemTangyuan");
		registerModel(FoodcraftItems.ItemFriedChicken,"ItemFriedChicken");
		registerModel(FoodcraftItems.ItemFrenchFries,"ItemFrenchFries");
		registerModel(FoodcraftItems.ItemOrleansWing,"ItemOrleansWing");
		registerModel(FoodcraftItems.ItemPopcornChicken,"ItemPopcornChicken");
		registerModel(FoodcraftItems.ItemOriginalRecipe,"ItemOriginalRecipe");
		registerModel(FoodcraftItems.ItemAeljichifan,"ItemAeljichifan");
		registerModel(FoodcraftItems.ItemDoughTwist,"ItemDoughTwist");
		registerModel(FoodcraftItems.ItemNewYearCake,"ItemNewYearCake");
		registerModel(FoodcraftItems.ItemSpringRolls,"ItemSpringRolls");
		registerModel(FoodcraftItems.ItemFriedTofu,"ItemFriedTofu");
		registerModel(FoodcraftItems.ItemFriedNewYearCake,"ItemFriedNewYearCake");
		registerModel(FoodcraftItems.ItemChips,"ItemChips");
		registerModel(FoodcraftItems.ItemFriedBread,"ItemFriedBread");
		registerModel(FoodcraftItems.ItemFriedSpringRolls,"ItemFriedSpringRolls");
		registerModel(FoodcraftItems.ItemFriedDoughTwist,"ItemFriedDoughTwist");
		registerModel(FoodcraftItems.ItemFriedDrumstick,"ItemFriedDrumstick");
		registerModel(FoodcraftItems.ItemBigChicken,"ItemBigChicken");
		registerModel(FoodcraftItems.ItemMediumChicken,"ItemMediumChicken");
		registerModel(FoodcraftItems.ItemSmallChicken,"ItemSmallChicken");
		registerModel(FoodcraftItems.ItemChickenWing,"ItemChickenWing");
		registerModel(FoodcraftItems.ItemTofuStrip,"ItemTofuStrip");
		registerModel(FoodcraftItems.ItemCarrotStrip,"ItemCarrotStrip");
		registerModel(FoodcraftItems.ItemRedWine,"ItemRedWine");
		registerModel(FoodcraftItems.ItemSpirit,"ItemSpirit");
		registerModel(FoodcraftItems.ItemCider,"ItemCider");
		registerModel(FoodcraftItems.ItemGrapeWine,"ItemGrapeWine");
		registerModel(FoodcraftItems.ItemGoldenGrape,"ItemGoldenGrape");
		registerModel(FoodcraftItems.ItemGoldenGrapeWine,"ItemGoldenGrapeWine");
		registerModel(FoodcraftItems.ItemGoldenCider,"ItemGoldenCider");
		registerModel(FoodcraftItems.ItemChocolatesWater,"ItemChocolatesWater");
		registerModel(FoodcraftItems.ItemChocolatesMilk,"ItemChocolatesMilk");
		registerModel(FoodcraftItems.ItemCarrotJuice,"ItemCarrotJuice");
		registerModel(FoodcraftItems.ItemGrapeJuice,"ItemGrapeJuice");
		registerModel(FoodcraftItems.ItemAppleJuice,"ItemAppleJuice");
		registerModel(FoodcraftItems.ItemVegetableJuice,"ItemVegetableJuice");
		registerModel(FoodcraftItems.ItemGoldenGrapeJuice,"ItemGoldenGrapeJuice");
		registerModel(FoodcraftItems.ItemGoldenAppleJuice,"ItemGoldenAppleJuice");
		registerModel(FoodcraftItems.ItemSoyMilk,"ItemSoyMilk");
		registerModel(FoodcraftItems.ItemCoke,"ItemCoke");
		registerModel(FoodcraftItems.ItemSprite,"ItemSprite");
		registerModel(FoodcraftItems.ItemChocolatesmilk_ice,"ItemChocolatesmilk_ice");
		registerModel(FoodcraftItems.ItemGrapeJuice_ice,"ItemGrapeJuice_ice");
		registerModel(FoodcraftItems.ItemAppleJuice_ice,"ItemAppleJuice_ice");
		registerModel(FoodcraftItems.ItemGoldenGrapeJuice_ice,"ItemGoldenGrapeJuice_ice");
		registerModel(FoodcraftItems.ItemGoldenAppleJuice_ice,"ItemGoldenAppleJuice_ice");
		registerModel(FoodcraftItems.ItemMelonJuice,"ItemMelonJuice");
		registerModel(FoodcraftItems.ItemMelonJuice_ice,"ItemMelonJuice_ice");
		registerModel(FoodcraftItems.ItemFlourSilk,"ItemFlourSilk");
		registerModel(FoodcraftItems.ItemTea,"ItemTea");
		registerModel(FoodcraftItems.ItemMilkTea,"ItemMilkTea");
		registerModel(FoodcraftItems.ItemCoffee,"ItemCoffee");
		registerModel(FoodcraftItems.ItemBaiqiuji,"ItemBaiqiuji");
		registerModel(FoodcraftItems.ItemCongyouji,"ItemCongyouji");
		registerModel(FoodcraftItems.ItemKoushuiji,"ItemKoushuiji");
		registerModel(FoodcraftItems.ItemLaziji,"ItemLaziji");
		registerModel(FoodcraftItems.ItemQingzhenyu,"ItemQingzhenyu");
		registerModel(FoodcraftItems.ItemMalayu,"ItemMalayu");
		registerModel(FoodcraftItems.ItemSuancaiyu,"ItemSuancaiyu");
		registerModel(FoodcraftItems.ItemKelejichifan,"ItemKelejichifan");
		registerModel(FoodcraftItems.ItemGalijiroufan,"ItemGalijiroufan");
		registerModel(FoodcraftItems.ItemBlockCurry,"ItemBlockCurry");
		registerModel(FoodcraftItems.ItemShuizhuniurou,"ItemShuizhuniurou");
		registerModel(FoodcraftItems.ItemNoodles,"ItemNoodles");
		registerModel(FoodcraftItems.ItemCrossingBridgeNoodles,"ItemCrossingBridgeNoodles");
		registerModel(FoodcraftItems.ItemPasta,"ItemPasta");
		registerModel(FoodcraftItems.ItemPastaPork,"ItemPastaPork");
		registerModel(FoodcraftItems.ItemPastaBeef,"ItemPastaBeef");
		registerModel(FoodcraftItems.ItemPastaChicken,"ItemPastaChicken");
		registerModel(FoodcraftItems.ItemPreservedEggPorridge,"ItemPreservedEggPorridge");
		registerModel(FoodcraftItems.ItemMooncake,"ItemMooncake");
		registerModel(FoodcraftItems.ItemSteamedBuns,"ItemSteamedBuns");
		registerModel(FoodcraftItems.ItemSauerkrautCake,"ItemSauerkrautCake");
		registerModel(FoodcraftItems.ItemYoutiao,"ItemYoutiao");
		registerModel(FoodcraftItems.ItemChiliTofuStrip,"ItemChiliTofuStrip");
		registerModel(FoodcraftItems.ItemWalnutShortbread,"ItemWalnutShortbread");
		registerModel(FoodcraftItems.ItemAici,"ItemAici");
		registerModel(FoodcraftItems.ItemStickyRiceCake,"ItemStickyRiceCake");
		registerModel(FoodcraftItems.ItemChangfen,"ItemChangfen");
		registerModel(FoodcraftItems.ItemSausage,"ItemSausage");
		registerModel(FoodcraftItems.ItemHotDog,"ItemHotDog");
		registerModel(FoodcraftItems.ItemChineseSausage,"ItemChineseSausage");
		registerModel(FoodcraftItems.ItemChineseBacon,"ItemChineseBacon");
		registerModel(FoodcraftItems.ItemFriedSausage,"ItemFriedSausage");
		registerModel(FoodcraftItems.ItemRibendoufu,"ItemRibendoufu");
		registerModel(FoodcraftItems.ItemLaBaPorridge,"ItemLaBaPorridge");
		registerModel(FoodcraftItems.ItemSmokedMaterial,"ItemSmokedMaterial");
		registerModel(FoodcraftItems.ItemCheese,"ItemCheese");
		registerModel(FoodcraftItems.ItemPizza,"ItemPizza");
		registerModel(FoodcraftItems.ItemHamburger,"ItemHamburger");
		registerModel(FoodcraftItems.ItemSquidMeat,"ItemSquidMeat");
		registerModel(FoodcraftItems.ItemCookedSquidMeat,"ItemCookedSquidMeat");
		registerModel(FoodcraftItems.ItemSquidSlices,"ItemSquidSlices");
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
