package com.foodcraft.init;


import com.foodcraft.util.FcUtil;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;


public class FoodcraftRecipe {
    public static class FcGameRegistry extends GameRegistry {
        public static void addRecipe(ItemStack output, Object... params)
        {
            addShapedRecipe(output, params);
        }
        public static IRecipe addShapedRecipe(ItemStack output, Object... params)
        {
            CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(output, params));
            return new ShapedOreRecipe(output, params);
        }
        public static void addShapelessRecipe(ItemStack output, Object... params)
        {
            CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(output, params));
        }
    }

    public static void init() {
        Items.egg.setMaxStackSize(64);
        Items.snowball.setMaxStackSize(64);

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(FoodcraftItems.ItemTiepian, 16), "###", "#X#","###", '#',"ingotIron",'X',"stone"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(FoodcraftItems.ItemCaidao, 1), "## ", "## ","X  ", '#',FoodcraftItems.ItemTiepian,'X',"stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(FoodcraftItems.ItemCaidaoHJ, 1), "## ", "## ","X  ", '#',"ingotGold",'X',"stickWood"));
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemCaidaoZS, 1), "## ", "## ","X  ", '#',Items.diamond,'X',Items.stick);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemCaidaoLBS, 1), "## ", "## ","X  ", '#',Items.emerald,'X',Items.stick);

        FcUtil.removeRecipe(new ItemStack(Items.cake));
        FcUtil.removeRecipe(new ItemStack(Items.bread));
        FcUtil.removeRecipe(new ItemStack(Items.pumpkin_pie));
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemPisa), "foodPancakes","listAllmeatcooked",Items.carrot,FoodcraftItems.ItemNainao,Blocks.brown_mushroom);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemJinghuashuitong), Items.bucket,Blocks.wool);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemHanbaobao), Items.bread,FoodcraftItems.ItemShucai,"listAllmeatcooked",Items.bread);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemYuebing, 1), "AAA", "XBX", "AAA", 'A', FoodcraftItems.ItemMianfen, 'B', FoodcraftItems.ItemDousha,'X',new ItemStack(Items.dye,1,11));
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemYuebing, 1), "AAA", "XBX", "AAA", 'A', FoodcraftItems.ItemMianfen, 'B', Items.egg,'X',new ItemStack(Items.dye,1,11));
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemNiangao, 1), "AAA", "ABA", "AAA", 'A', FoodcraftItems.ItemNuomifen,'B',FoodcraftItems.Itemfan);

        FcGameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemWrench, 1), "A A", " A ", " A ", 'A', Items.iron_ingot);

        FcGameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemCiba, 1), "AAA", "ABA", "AAA", 'A', FoodcraftItems.ItemNuomifen, 'B', FoodcraftItems.Itemwater);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemAici), FoodcraftItems.ItemCiba,Blocks.leaves);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemChangfen, 1), "AAA", "BBB", "CDE", 'A', FoodcraftItems.Itemfan, 'B', FoodcraftItems.Itemwater, 'C', FoodcraftItems.ItemCong, 'D', "listAllmeatcooked", 'E', FoodcraftItems.ItemJiangyou);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemRegou), FoodcraftItems.ItemShucai,FoodcraftItems.ItemXiangchang,Items.bread);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemLabazhou), FoodcraftItems.ItemXifan,Items.wheat,FoodcraftItems.ItemHuashen,FoodcraftItems.Itemfan,FoodcraftItems.ItemDouzi,FoodcraftItems.ItemLarou,FoodcraftItems.ItemNuomi,FoodcraftItems.ItemLachang,Items.carrot);

        FcGameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemMian, 1), "ABA", "ABA", "ABA", 'A', FoodcraftItems.ItemMianfen, 'B', FoodcraftItems.Itemwater);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemGuoqiaomixian, 1), "ABA", "ABA", "ABA", 'A', FoodcraftItems.Itemfan, 'B', FoodcraftItems.Itemwater);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemYifen, 1), "ABA", "ABA", "ABA", 'A', Items.wheat, 'B', FoodcraftItems.Itemwater);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemMantou, 1), "AAA", "ABA", "AAA", 'A', FoodcraftItems.ItemMianfen, 'B', FoodcraftItems.Itemwater);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemSuancaibing, 1), "AAA", "ABA", "AAA", 'A', FoodcraftItems.ItemMianfen, 'B', FoodcraftItems.ItemShucai);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemLatiao), FoodcraftItems.ItemDoufusi,FoodcraftItems.ItemLajiao);

        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemLachang), FoodcraftItems.ItemXiangchang,FoodcraftItems.ItemLaweixunliao);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemLarou), "listAllmeatcooked",FoodcraftItems.ItemLaweixunliao);

        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemYifenpork), FoodcraftItems.ItemYifen,"listAllmeatcooked");
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemYifenchicken), FoodcraftItems.ItemYifen,"listAllmeatcooked");
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemYifenbeef), FoodcraftItems.ItemYifen,"listAllmeatcooked");

        FcGameRegistry.addRecipe(new ItemStack(Items.cake, 1), "AAA", "BEB", "CCC", 'A', Items.milk_bucket, 'B', Items.sugar, 'C', FoodcraftItems.ItemMianfen, 'E', Items.egg);
        FcGameRegistry.addRecipe(new ItemStack(Items.bread, 1), "AAA", 'A', FoodcraftItems.ItemMianfen);
        FcGameRegistry.addRecipe(new ItemStack(Items.pumpkin_pie, 1), "AAA", "BBB", "CCC", 'A', FoodcraftItems.ItemNuomifen,'B',Blocks.pumpkin,'C',Items.egg);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockWaike, 1), "AAA", "ABA", "AAA", 'A', FoodcraftItems.ItemHuashen,'B',Blocks.iron_block);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockWaike, 1), "AAA", "ABA", "AAA", 'A', FoodcraftItems.ItemDouzi,'B',Blocks.iron_block);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockWaike, 1), "AAA", "ABA", "AAA", 'A', FoodcraftItems.ItemDami,'B',Blocks.iron_block);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockWaike, 1), "AAA", "ABA", "AAA", 'A', Items.wheat,'B',Blocks.iron_block);

        FcGameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemDianluban, 1), "AAA", "CBC", "AAA", 'A', FoodcraftItems.ItemHuashen,'B',Items.iron_ingot,'C',Items.redstone);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemDianluban, 1), "AAA", "CBC", "AAA", 'A', FoodcraftItems.ItemDouzi,'B',Items.iron_ingot,'C',Items.redstone);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemDianluban, 1), "AAA", "CBC", "AAA", 'A', FoodcraftItems.ItemDami,'B',Items.iron_ingot,'C',Items.redstone);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemDianluban, 1), "AAA", "CBC", "AAA", 'A', Items.wheat,'B',Items.iron_ingot,'C',Items.redstone);


        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemQiaokeli), FoodcraftItems.ItemQiaokelifen,Items.sugar);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemNuomi,2), FoodcraftItems.ItemNuomi,Items.bone);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemDouban,2), FoodcraftItems.ItemDouban,Items.bone);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemDoufugan), FoodcraftItems.ItemDoufu,FoodcraftItems.ItemJiangyou);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemDoufu), FoodcraftItems.ItemDoujiang,FoodcraftItems.ItemYan);

        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemChunjuan), FoodcraftItems.ItemDoufusi,FoodcraftItems.ItemLuobosi,FoodcraftItems.ItemShucai,"listAllmeatcooked");
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemAeljichifan), FoodcraftItems.ItemAeljichi,FoodcraftItems.ItemBaifan);

        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemZongzi), FoodcraftItems.ItemNuomi,"listAllmeatcooked",Items.string,FoodcraftItems.ItemZongye);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemNuomituan), FoodcraftItems.ItemNuomifen,FoodcraftItems.ItemNuomifen,FoodcraftItems.ItemNuomifen,FoodcraftItems.Itemwater);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemHuashentangyuanxian,1), FoodcraftItems.ItemHuashen,Items.sugar);

        FcGameRegistry.addRecipe(new ItemStack(FoodcraftGuiBlocks.Nmj, 1), "AAA", "DBD", "ECE", 'A', Items.wheat,'B',FoodcraftBlocks.BlockWaike,'C',FoodcraftItems.ItemDianluban,'E',Items.milk_bucket,'D',Blocks.glass);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftGuiBlocks.PDG, 1), "AAA", "EBE", " C ", 'A', FoodcraftItems.ItemTiepian,'B',FoodcraftBlocks.BlockWaike,'C',FoodcraftItems.ItemDianluban,'E',new ItemStack(Items.dye));
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftGuiBlocks.Guo, 1), "AAA", "EBE", " C ", 'A', Items.iron_ingot,'B',FoodcraftBlocks.BlockWaike,'C',FoodcraftItems.ItemDianluban,'E',new ItemStack(Items.dye));
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftGuiBlocks.Gyg, 1), "AAA", "EBE", "XCX", 'A', Items.iron_ingot,'B',FoodcraftBlocks.BlockWaike,'C',FoodcraftItems.ItemDianluban,'E',new ItemStack(Items.dye),'X',new ItemStack(Items.dye,1,15));
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftGuiBlocks.Caiban, 1), "AAA", "ABA", "ACA", 'A', Blocks.planks,'B',FoodcraftItems.ItemCaidao,'C',FoodcraftBlocks.BlockWaike);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftGuiBlocks.YZJ, 1), "AAA", "DBD", "CCC", 'A', FoodcraftItems.ItemHuashenyou,'B',FoodcraftBlocks.BlockWaike,'C',FoodcraftItems.ItemDianluban,'D',Blocks.glass);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftGuiBlocks.Tpj, 1), "ABA", "CDC", " F ", 'A', Items.redstone,'B',Blocks.ice,'C',new ItemStack(Items.dye,1,3),'D',FoodcraftBlocks.BlockWaike,'F',FoodcraftItems.ItemDianluban);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftGuiBlocks.Nt, 1), "ABA", "CDC", "ABA", 'A', Blocks.planks,'B',FoodcraftItems.ItemDianluban,'C',new ItemStack(Items.dye,1,3),'D',FoodcraftBlocks.BlockWaike);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftGuiBlocks.Zl, 1), "ABA", "CDC", "FBF", 'A', Items.flint_and_steel,'B',FoodcraftItems.ItemDianluban,'C',new ItemStack(Items.dye,1,3),'D',FoodcraftBlocks.BlockWaike,'F',Items.redstone);

        FcGameRegistry.addSmelting(new ItemStack(FoodcraftItems.ItemYouyurou), new ItemStack(FoodcraftItems.ItemShuyouyurou), 0.5f);
        FcGameRegistry.addSmelting(new ItemStack(FoodcraftItems.ItemYumi), new ItemStack(FoodcraftItems.ItemKaoyumi), 0.5f);
        FcGameRegistry.addSmelting(new ItemStack(FoodcraftItems.ItemHongshu), new ItemStack(FoodcraftItems.ItemKaohongshu), 0.5f);
        FcGameRegistry.addSmelting(new ItemStack(FoodcraftItems.Itemwater), new ItemStack(FoodcraftItems.ItemYan, 2), 0.5f);

        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemNainao, 1), Items.milk_bucket);

        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemMianpi, 2), FoodcraftItems.ItemMianfen,FoodcraftItems.ItemMianfen,FoodcraftItems.ItemMianfen,FoodcraftItems.Itemwater);

        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemJiaozi), FoodcraftItems.ItemJiaozixian,FoodcraftItems.ItemMianpi);

        FcGameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemJinputao, 1), "AAA", "ABA", "AAA", 'A', Blocks.gold_block,'B', FoodcraftItems.ItemPutao);

        FcGameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.Blocksugar, 1), "AAA", "AAA", "AAA", 'A', Items.sugar);
        FcGameRegistry.addShapelessRecipe(new ItemStack(Items.sugar,9), FoodcraftBlocks.Blocksugar);

        FcGameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockDami, 1), "AAA", "AAA", "AAA", 'A', FoodcraftItems.ItemDami);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemDami,9), FoodcraftBlocks.BlockDami);

        FcGameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockHuashenk, 1), "AAA", "AAA", "AAA", 'A', FoodcraftItems.ItemHuashen);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemHuashen,9), FoodcraftBlocks.BlockHuashenk);

        FcGameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockLuobo, 1), "AAA", "AAA", "AAA", 'A', Items.carrot);
        FcGameRegistry.addShapelessRecipe(new ItemStack(Items.carrot,9), FoodcraftBlocks.BlockLuobo);

        FcGameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockTudou, 1), "AAA", "AAA", "AAA", 'A', Items.potato);
        FcGameRegistry.addShapelessRecipe(new ItemStack(Items.potato,9), FoodcraftBlocks.BlockTudou);

        FcGameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockYan, 1), "AAA", "AAA", "AAA", 'A', FoodcraftItems.ItemYan);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemYan,9), FoodcraftBlocks.BlockYan);

        FcGameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockDouzik, 1), "AAA", "AAA", "AAA", 'A', FoodcraftItems.ItemDouzi);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemDouzi,9), FoodcraftBlocks.BlockDouzik);

        FcGameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockRuomi, 1), "AAA", "AAA", "AAA", 'A', FoodcraftItems.ItemNuomi);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemNuomi,9), FoodcraftBlocks.BlockRuomi);

        FcGameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockDouban, 1), "AAA", "AAA", "AAA", 'A', FoodcraftItems.ItemDouban);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemDouban,9), FoodcraftBlocks.BlockDouban);

        FcGameRegistry.addRecipe(new ItemStack(FoodcraftBlocks.BlockQiaokeli, 1), "AAA", "AAA", "AAA", 'A', FoodcraftItems.ItemQiaokeli);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemQiaokeli,9), FoodcraftBlocks.BlockQiaokeli);

        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemQiaokelinaiice), FoodcraftItems.ItemQiaokelinai,Items.snowball);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemPutaozhiice), FoodcraftItems.ItemPutaozhi,Items.snowball);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemPingguozhiice), FoodcraftItems.ItemPingguozhi,Items.snowball);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemJinpingguozhiice), FoodcraftItems.ItemJinpingguozhi,Items.snowball);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemJinputaozhiice), FoodcraftItems.ItemJinputaozhi,Items.snowball);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemXiguazhiice), FoodcraftItems.ItemXiguazhi,Items.snowball);

        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemLizhizhiice), FoodcraftItems.ItemLizhizhi,Items.snowball);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemTaozizhiice), FoodcraftItems.ItemTaozizhi,Items.snowball);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemJuzizhiice), FoodcraftItems.ItemJuzizhi,Items.snowball);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemMangguozhiice), FoodcraftItems.ItemMangguozhi,Items.snowball);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemNingmengzhiice), FoodcraftItems.ItemNingmengzhi,Items.snowball);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemMuguazhiice), FoodcraftItems.ItemMuguazhi,Items.snowball);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemCaomeizhiice), FoodcraftItems.ItemCaomeizhi,Items.snowball);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemYezizhiice), FoodcraftItems.ItemYezizhi,Items.snowball);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemXiangjiaozhiice), FoodcraftItems.ItemXiangjiaozhi,Items.snowball);


        FcGameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemJinkela, 8), "AAA", "ABA", "AAA", 'A', new ItemStack(Items.dye,1,15), 'B', Items.gold_ingot);


        registerChestLoot(new ItemStack(FoodcraftItems.ItemDouban), 1, 1, 16);
        registerChestLoot(new ItemStack(FoodcraftItems.ItemZongye), 1, 10, 16);
        registerChestLoot(new ItemStack(FoodcraftItems.ItemKafei), 1, 1, 10);
        registerChestLoot(new ItemStack(FoodcraftItems.ItemGalikuai), 1, 10, 16);
        registerChestLoot(new ItemStack(FoodcraftItems.ItemHetaosu), 1, 10, 16);
        registerChestLoot(new ItemStack(FoodcraftItems.ItemXiangchang), 1, 10, 16);
        registerChestLoot(new ItemStack(FoodcraftItems.ItemLaweixunliao), 1, 10, 32);
        for(int i1 = 0; i1 < 8; i1++) {
            FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemDangao,1,i1), new ItemStack(FoodcraftItems.ItemGuojiang,1,i1),Items.cake);
        }
        for(int i1 = 0; i1 < 8; i1++) {
            FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemBinggan,1,i1), FoodcraftItems.ItemBingganF, new ItemStack(FoodcraftItems.ItemGuojiang,1,i1),FoodcraftItems.ItemBingganF);
        }
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemBingganF,3,0), "AAA","BBB","AAA", 'A', FoodcraftItems.ItemMianfen, 'B',Items.egg);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftItems.ItemBingganXN,1,0), "AAA","ABA","AAA", 'A', FoodcraftItems.ItemMianfen,'B',Items.egg);

        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemGuojiang,1,0), FoodcraftItems.Itemwater,FoodcraftItems.ItemPutao,Items.sugar);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemGuojiang,1,1), FoodcraftItems.Itemwater,FoodcraftItems.ItemJinputao,Items.sugar);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemGuojiang,1,2), FoodcraftItems.Itemwater,FoodcraftItems.ItemLi,Items.sugar);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemGuojiang,1,3), FoodcraftItems.Itemwater,FoodcraftItems.ItemTaozi,Items.sugar);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemGuojiang,1,4), FoodcraftItems.Itemwater,FoodcraftItems.ItemJuzi,Items.sugar);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemGuojiang,1,5), FoodcraftItems.Itemwater,FoodcraftItems.ItemNingmeng,Items.sugar);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemGuojiang,1,6), FoodcraftItems.Itemwater,FoodcraftItems.ItemCaomei,Items.sugar);
        FcGameRegistry.addShapelessRecipe(new ItemStack(FoodcraftItems.ItemGuojiang,1,7), FoodcraftItems.Itemwater,FoodcraftItems.ItemYezi,Items.sugar);

        FcGameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockLishu,2), " B ","BAB"," B ", 'A', "treeSapling", 'B', FoodcraftItems.ItemLi);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockLizhishu,2), " B ","BAB"," B ", 'A', "treeSapling", 'B', FoodcraftItems.ItemLizhi);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockTaozishu,2), " B ","BAB"," B ", 'A', "treeSapling", 'B', FoodcraftItems.ItemTaozi);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockJuzishu,2), " B ","BAB"," B ", 'A', "treeSapling", 'B', FoodcraftItems.ItemJuzi);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockPipashu,2), " B ","BAB"," B ", 'A', "treeSapling", 'B', FoodcraftItems.ItemPipa);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockMangguoshu,2), " B ","BAB"," B ", 'A', "treeSapling", 'B', FoodcraftItems.ItemMangguo);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockNingmengshu,2), " B ","BAB"," B ", 'A', "treeSapling", 'B', FoodcraftItems.ItemNingmeng);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockYouzishu,2), " B ","BAB"," B ", 'A', "treeSapling", 'B', FoodcraftItems.ItemYouzi);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockShizishu,2), " B ","BAB"," B ", 'A', "treeSapling", 'B', FoodcraftItems.ItemShizi);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockMuguashu,2), " B ","BAB"," B ", 'A', "treeSapling", 'B', FoodcraftItems.ItemMugua);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockShanzhashu,2), " B ","BAB"," B ", 'A', "treeSapling", 'B', FoodcraftItems.ItemShanzha);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockLongyanshu,2), " B ","BAB"," B ", 'A', "treeSapling", 'B', FoodcraftItems.ItemLongyan);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockShiliushu,2), " B ","BAB"," B ", 'A', "treeSapling", 'B', FoodcraftItems.ItemShiliu);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockHongzaoshu,2), " B ","BAB"," B ", 'A', "treeSapling", 'B', FoodcraftItems.ItemHongzao);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockYezishu,2), " B ","BAB"," B ", 'A', "treeSapling", 'B', FoodcraftItems.ItemYezi);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockYingtaoshu,2), " B ","BAB"," B ", 'A', "treeSapling", 'B', FoodcraftItems.ItemYingtao);
        FcGameRegistry.addRecipe(new ItemStack(FoodcraftPlants.BlockXiangjiaoshu,2), " B ","BAB"," B ", 'A', "treeSapling", 'B', FoodcraftItems.ItemXiangjiao);
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