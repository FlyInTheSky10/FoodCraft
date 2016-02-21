package com.foodcraft.init;


import com.foodcraft.util.FoodcraftUtil;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class FoodcraftRecipe{
	public static void init() {
		Items.egg.setMaxStackSize(64);
		Items.snowball.setMaxStackSize(64);

	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemIronSheet, 16), new Object[] {"###", "#X#","###", '#',Items.iron_ingot,'X',Blocks.stone});	
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemKitchenKnife, 1), new Object[] {"## ", "## ","X  ", '#',FoodcraftItems.ItemIronSheet,'X',Items.stick});
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemCaidaoHJ, 1), new Object[] {"## ", "## ","X  ", '#',Items.gold_ingot,'X',Items.stick});
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemCaidaoZS, 1), new Object[] {"## ", "## ","X  ", '#',Items.diamond,'X',Items.stick});
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemCaidaoLBS, 1), new Object[] {"## ", "## ","X  ", '#',Items.emerald,'X',Items.stick});
	
	FoodcraftUtil.removeRecipe(new ItemStack(Items.cake));
	FoodcraftUtil.removeRecipe(new ItemStack(Items.bread));
	FoodcraftUtil.removeRecipe(new ItemStack(Items.pumpkin_pie));
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemPizza), new Object[] {FoodcraftItems.ItemPancakes,Items.cooked_porkchop,Items.carrot,FoodcraftItems.ItemCheese,Blocks.brown_mushroom});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemFoodcraftBucket), new Object[] {Items.bucket,Blocks.wool});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemHamburger), new Object[] {Items.bread,FoodcraftItems.ItemVegetable,Items.cooked_porkchop,Items.bread});
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemMooncake, 1), new Object[] {"AAA", "XBX", "AAA", 'A', FoodcraftItems.ItemFlour, 'B', FoodcraftItems.ItemDousha,'X',new ItemStack(Items.dye,1,11)});
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemMooncake, 1), new Object[] {"AAA", "XBX", "AAA", 'A', FoodcraftItems.ItemFlour, 'B', Items.egg,'X',new ItemStack(Items.dye,1,11)});
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemNewYearCake, 1), new Object[] {"AAA", "ABA", "AAA", 'A', FoodcraftItems.ItemStickyRiceFlour,'B',FoodcraftItems.ItemMilledRice});

	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemWrench, 1), new Object[] {"A A", " A ", " A ", 'A', Items.iron_ingot});
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemStickyRiceCake, 1), new Object[] {"AAA", "ABA", "AAA", 'A', FoodcraftItems.ItemStickyRiceFlour, 'B', FoodcraftItems.Itemwater});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemAici), new Object[] {FoodcraftItems.ItemStickyRiceCake,Blocks.leaves});
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemChangfen, 1), new Object[] {"AAA", "BBB", "CDE", 'A', FoodcraftItems.ItemMilledRice, 'B', FoodcraftItems.Itemwater, 'C', FoodcraftItems.ItemScallion, 'D', Items.cooked_porkchop, 'E', FoodcraftItems.ItemSoySauce});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemHotDog), new Object[] {FoodcraftItems.ItemVegetable,FoodcraftItems.ItemSausage,Items.bread});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemLaBaPorridge), new Object[] {FoodcraftItems.ItemPorridge,Items.wheat,FoodcraftItems.ItemPeanut,FoodcraftItems.ItemMilledRice,FoodcraftItems.ItemBeans,FoodcraftItems.ItemChineseBacon,FoodcraftItems.ItemStickyRice,FoodcraftItems.ItemChineseSausage,Items.carrot});
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemNoodles, 1), new Object[] {"ABA", "ABA", "ABA", 'A', FoodcraftItems.ItemFlour, 'B', FoodcraftItems.Itemwater});
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemCrossingBridgeNoodles, 1), new Object[] {"ABA", "ABA", "ABA", 'A', FoodcraftItems.ItemMilledRice, 'B', FoodcraftItems.Itemwater});
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemPasta, 1), new Object[] {"ABA", "ABA", "ABA", 'A', Items.wheat, 'B', FoodcraftItems.Itemwater});
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemSteamedBuns, 1), new Object[] {"AAA", "ABA", "AAA", 'A', FoodcraftItems.ItemFlour, 'B', FoodcraftItems.Itemwater});
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemSauerkrautCake, 1), new Object[] {"AAA", "ABA", "AAA", 'A', FoodcraftItems.ItemFlour, 'B', FoodcraftItems.ItemVegetable});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemChiliTofuStrip), new Object[] {FoodcraftItems.ItemTofuStrip,FoodcraftItems.ItemChili});
	
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemChineseSausage), new Object[] {FoodcraftItems.ItemSausage,FoodcraftItems.ItemSmokedMaterial});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemChineseBacon), new Object[] {Items.cooked_porkchop,FoodcraftItems.ItemSmokedMaterial});
	
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemPastaPork), new Object[] {FoodcraftItems.ItemPasta,Items.cooked_porkchop});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemPastaChicken), new Object[] {FoodcraftItems.ItemPasta,Items.cooked_chicken});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemPastaBeef), new Object[] {FoodcraftItems.ItemPasta,Items.cooked_beef});
	
	GameRegistry.addRecipe(new ItemStack(Items.cake, 1), new Object[] {"AAA", "BEB", "CCC", 'A', Items.milk_bucket, 'B', Items.sugar, 'C', FoodcraftItems.ItemFlour, 'E', Items.egg});
	GameRegistry.addRecipe(new ItemStack(Items.bread, 1), new Object[] {"AAA", 'A', FoodcraftItems.ItemFlour});
	GameRegistry.addRecipe(new ItemStack(Items.pumpkin_pie, 1), new Object[] {"AAA", "BBB", "CCC", 'A', FoodcraftItems.ItemStickyRiceFlour,'B',Blocks.pumpkin,'C',Items.egg});
	GameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockWaike, 1), new Object[] {"AAA", "ABA", "AAA", 'A', FoodcraftItems.ItemPeanut,'B',Blocks.iron_block});
	GameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockWaike, 1), new Object[] {"AAA", "ABA", "AAA", 'A', FoodcraftItems.ItemBeans,'B',Blocks.iron_block});
	GameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockWaike, 1), new Object[] {"AAA", "ABA", "AAA", 'A', FoodcraftItems.ItemRice,'B',Blocks.iron_block});
	GameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockWaike, 1), new Object[] {"AAA", "ABA", "AAA", 'A', Items.wheat,'B',Blocks.iron_block});

	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemMachineCore, 1), new Object[] {"AAA", "CBC", "AAA", 'A', FoodcraftItems.ItemPeanut,'B',Items.iron_ingot,'C',Items.redstone});
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemMachineCore, 1), new Object[] {"AAA", "CBC", "AAA", 'A', FoodcraftItems.ItemBeans,'B',Items.iron_ingot,'C',Items.redstone});
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemMachineCore, 1), new Object[] {"AAA", "CBC", "AAA", 'A', FoodcraftItems.ItemRice,'B',Items.iron_ingot,'C',Items.redstone});
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemMachineCore, 1), new Object[] {"AAA", "CBC", "AAA", 'A', Items.wheat,'B',Items.iron_ingot,'C',Items.redstone});
	

	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemChocolate), new Object[] {FoodcraftItems.ItemChocolateDust,Items.sugar});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemStickyRice,2), new Object[] {FoodcraftItems.ItemStickyRice,Items.bone});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemWatercress,2), new Object[] {FoodcraftItems.ItemWatercress,Items.bone});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemDriedTofu), new Object[] {FoodcraftItems.ItemTofu,FoodcraftItems.ItemSoySauce});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemTofu), new Object[] {FoodcraftItems.ItemSoybeanMilk,FoodcraftItems.ItemSalt});

	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemSpringRolls), new Object[] {FoodcraftItems.ItemTofuStrip,FoodcraftItems.ItemCarrotStrip,FoodcraftItems.ItemVegetable,Items.cooked_porkchop});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemAeljichifan), new Object[] {FoodcraftItems.ItemOrleansWing,FoodcraftItems.ItemCookedRice});
	
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemStickyRiceDumpling), new Object[] {FoodcraftItems.ItemStickyRice,Items.cooked_porkchop,Items.string,FoodcraftItems.ItemZongye});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemStickyRiceDough), new Object[] {FoodcraftItems.ItemStickyRiceFlour,FoodcraftItems.ItemStickyRiceFlour,FoodcraftItems.ItemStickyRiceFlour,FoodcraftItems.Itemwater});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemPeanutTangyuanStuffing,1), new Object[] {FoodcraftItems.ItemPeanut,Items.sugar});
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftGuiBlocks.Nmj, 1), new Object[] {"AAA", "DBD", "ECE", 'A', Items.wheat,'B',FoodcraftBlocks.BlockWaike,'C',FoodcraftItems.ItemMachineCore,'E',Items.milk_bucket,'D',Blocks.glass});
	GameRegistry.addRecipe(new ItemStack(FoodcraftGuiBlocks.PDG, 1), new Object[] {"AAA", "EBE", " C ", 'A', FoodcraftItems.ItemIronSheet,'B',FoodcraftBlocks.BlockWaike,'C',FoodcraftItems.ItemMachineCore,'E',new ItemStack(Items.dye)});
	GameRegistry.addRecipe(new ItemStack(FoodcraftGuiBlocks.Guo, 1), new Object[] {"AAA", "EBE", " C ", 'A', Items.iron_ingot,'B',FoodcraftBlocks.BlockWaike,'C',FoodcraftItems.ItemMachineCore,'E',new ItemStack(Items.dye)});
	GameRegistry.addRecipe(new ItemStack(FoodcraftGuiBlocks.Gyg, 1), new Object[] {"AAA", "EBE", "XCX", 'A', Items.iron_ingot,'B',FoodcraftBlocks.BlockWaike,'C',FoodcraftItems.ItemMachineCore,'E',new ItemStack(Items.dye),'X',new ItemStack(Items.dye,1,15)});
	GameRegistry.addRecipe(new ItemStack(FoodcraftGuiBlocks.Caiban, 1), new Object[] {"AAA", "ABA", "ACA", 'A', Blocks.planks,'B',FoodcraftItems.ItemKitchenKnife,'C',FoodcraftBlocks.BlockWaike});
	GameRegistry.addRecipe(new ItemStack(FoodcraftGuiBlocks.YZJ, 1), new Object[] {"AAA", "DBD", "CCC", 'A', FoodcraftItems.ItemPeanutOil,'B',FoodcraftBlocks.BlockWaike,'C',FoodcraftItems.ItemMachineCore,'D',Blocks.glass});
	GameRegistry.addRecipe(new ItemStack(FoodcraftGuiBlocks.Tpj, 1), new Object[] {"ABA", "CDC", " F ", 'A', Items.redstone,'B',Blocks.ice,'C',new ItemStack(Items.dye,1,3),'D',FoodcraftBlocks.BlockWaike,'F',FoodcraftItems.ItemMachineCore});
	GameRegistry.addRecipe(new ItemStack(FoodcraftGuiBlocks.Nt, 1), new Object[] {"ABA", "CDC", "ABA", 'A', Blocks.planks,'B',FoodcraftItems.ItemMachineCore,'C',new ItemStack(Items.dye,1,3),'D',FoodcraftBlocks.BlockWaike});
	GameRegistry.addRecipe(new ItemStack(FoodcraftGuiBlocks.Zl, 1), new Object[] {"ABA", "CDC", "FBF", 'A', Items.flint_and_steel,'B',FoodcraftItems.ItemMachineCore,'C',new ItemStack(Items.dye,1,3),'D',FoodcraftBlocks.BlockWaike,'F',Items.redstone});
	
	GameRegistry.addSmelting(new ItemStack(FoodcraftItems.ItemSquidMeat), new ItemStack(FoodcraftItems.ItemCookedSquidMeat), 0.5f);	
	GameRegistry.addSmelting(new ItemStack(FoodcraftItems.ItemYumi), new ItemStack(FoodcraftItems.ItemKaoyumi), 0.5f);
	GameRegistry.addSmelting(new ItemStack(FoodcraftItems.ItemHongshu), new ItemStack(FoodcraftItems.ItemKaohongshu), 0.5f);
	GameRegistry.addSmelting(new ItemStack(FoodcraftItems.Itemwater), new ItemStack(FoodcraftItems.ItemSalt, 2), 0.5f);
	
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemCheese, 1), new Object[] {Items.milk_bucket});
	
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemDumplingWrappers, 2), new Object[] {FoodcraftItems.ItemFlour,FoodcraftItems.ItemFlour,FoodcraftItems.ItemFlour,FoodcraftItems.Itemwater});
	
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemDumpling), new Object[] {FoodcraftItems.ItemDumplingMeat,FoodcraftItems.ItemDumplingWrappers});
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemGoldenGrape, 1), new Object[] {"AAA", "ABA", "AAA", 'A', Blocks.gold_block,'B', FoodcraftItems.ItemGrapes});
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.Blocksugar, 1), new Object[] {"AAA", "AAA", "AAA", 'A', Items.sugar});
	GameRegistry.addShapelessRecipe(new ItemStack(Items.sugar,9), new Object[] {FoodcraftBlocks.Blocksugar});
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockDami, 1), new Object[] {"AAA", "AAA", "AAA", 'A', FoodcraftItems.ItemRice});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemRice,9), new Object[] {FoodcraftBlocks.BlockDami});
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockHuashenk, 1), new Object[] {"AAA", "AAA", "AAA", 'A', FoodcraftItems.ItemPeanut});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemPeanut,9), new Object[] {FoodcraftBlocks.BlockHuashenk});
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockLuobo, 1), new Object[] {"AAA", "AAA", "AAA", 'A', Items.carrot});
	GameRegistry.addShapelessRecipe(new ItemStack(Items.carrot,9), new Object[] {FoodcraftBlocks.BlockLuobo});
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockTudou, 1), new Object[] {"AAA", "AAA", "AAA", 'A', Items.potato});
	GameRegistry.addShapelessRecipe(new ItemStack(Items.potato,9), new Object[] {FoodcraftBlocks.BlockTudou});
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockYan, 1), new Object[] {"AAA", "AAA", "AAA", 'A', FoodcraftItems.ItemSalt});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemSalt,9), new Object[] {FoodcraftBlocks.BlockYan});
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockDouzik, 1), new Object[] {"AAA", "AAA", "AAA", 'A', FoodcraftItems.ItemBeans});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemBeans,9), new Object[] {FoodcraftBlocks.BlockDouzik});
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockRuomi, 1), new Object[] {"AAA", "AAA", "AAA", 'A', FoodcraftItems.ItemStickyRice});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemStickyRice,9), new Object[] {FoodcraftBlocks.BlockRuomi});

	GameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockDouban, 1), new Object[] {"AAA", "AAA", "AAA", 'A', FoodcraftItems.ItemWatercress});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemWatercress,9), new Object[] {FoodcraftBlocks.BlockDouban});
	
	GameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockQiaokeli, 1), new Object[] {"AAA", "AAA", "AAA", 'A', FoodcraftItems.ItemChocolate});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemChocolate,9), new Object[] {FoodcraftBlocks.BlockQiaokeli});
	
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemChocolatesmilk_ice), new Object[] {FoodcraftItems.ItemChocolatesMilk,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemGrapeJuice_ice), new Object[] {FoodcraftItems.ItemGrapeJuice,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemAppleJuice_ice), new Object[] {FoodcraftItems.ItemAppleJuice,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemGoldenAppleJuice_ice), new Object[] {FoodcraftItems.ItemGoldenAppleJuice,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemGoldenGrapeJuice_ice), new Object[] {FoodcraftItems.ItemGoldenGrapeJuice,Items.snowball});
	GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemMelonJuice_ice), new Object[] {FoodcraftItems.ItemMelonJuice,Items.snowball});
	
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
	
	
	registerChestLoot(new ItemStack(FoodcraftItems.ItemWatercress), 1, 1, 16);
	registerChestLoot(new ItemStack(FoodcraftItems.ItemZongye), 1, 10, 16);
	registerChestLoot(new ItemStack(FoodcraftItems.ItemCoffee), 1, 1, 10);
	registerChestLoot(new ItemStack(FoodcraftItems.ItemBlockCurry), 1, 10, 16);
	registerChestLoot(new ItemStack(FoodcraftItems.ItemWalnutShortbread), 1, 10, 16);
	registerChestLoot(new ItemStack(FoodcraftItems.ItemSausage), 1, 10, 16);
	registerChestLoot(new ItemStack(FoodcraftItems.ItemSmokedMaterial), 1, 10, 32);
	 for(int i1 = 0;i1 < 8;i1++){
		 GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemDangao,1,i1), new Object[] {new ItemStack(FoodcraftItems.ItemGuojiang,1,i1),Items.cake});
	 }
	 for(int i1 = 0;i1 < 8;i1++){
		 GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemBinggan,1,i1), new Object[] {FoodcraftItems.ItemBingganF, new ItemStack(FoodcraftItems.ItemGuojiang,1,i1),FoodcraftItems.ItemBingganF});
	 }
	 GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemBingganF,3,0), new Object[] {"AAA","BBB","AAA", 'A', FoodcraftItems.ItemFlour, 'B' ,Items.egg});
	 GameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemBingganXN,1,0), new Object[] {"AAA","ABA","AAA", 'A', FoodcraftItems.ItemFlour,'B' ,Items.egg});
	 
	 GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemGuojiang,1,0), new Object[] {FoodcraftItems.Itemwater,FoodcraftItems.ItemGrapes,Items.sugar});
	 GameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemGuojiang,1,1), new Object[] {FoodcraftItems.Itemwater,FoodcraftItems.ItemGoldenGrape,Items.sugar});
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