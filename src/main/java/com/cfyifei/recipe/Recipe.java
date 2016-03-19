package com.cfyifei.recipe;


import com.cfyifei.FoodCraft;
import com.cfyifei.block.ModBlocks;
import com.cfyifei.gui.blocks.ModGui;
import com.cfyifei.item.ModItem;
import com.cfyifei.util.RemoveRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipe {
    public static class FCGameRegistry extends GameRegistry {
        public static void addOreRecipe(ItemStack output, Object... params) {
            addRecipe(new ShapedOreRecipe(output, params));
        }

        public static void addOreShapelessRecipe(ItemStack output, Object... params) {
            addRecipe(new ShapelessOreRecipe(output, params));
        }
    }

    public static void init() {
        Items.egg.setMaxStackSize(64);
        Items.snowball.setMaxStackSize(64);

        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemTiepian, 16), new Object[]{"###", "#X#", "###", '#', "ingotIron", 'X', Blocks.stone});
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemCaidao, 1), new Object[]{"## ", "## ", "X  ", '#', "plateIron", 'X', Items.stick});

        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemCaidaoHJ, 1), new Object[]{"## ", "## ", "X  ", '#', "ingotGold", 'X', Items.stick});
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemCaidaoZS, 1), new Object[]{"## ", "## ", "X  ", '#', "gemDiamond", 'X', Items.stick});
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemCaidaoLBS, 1), new Object[]{"## ", "## ", "X  ", '#', "gemEmerald", 'X', Items.stick});

        RemoveRecipe.removeAnyRecipe(new ItemStack(Items.cake));
        RemoveRecipe.removeAnyRecipe(new ItemStack(Items.bread));
        RemoveRecipe.removeAnyRecipe(new ItemStack(Items.pumpkin_pie));

        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemPisa), new Object[]{"foodPancakes", "listAllmeatcooked", "listAllveggie", "foodCheese", "listAllmushroom"});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemJinghuashuitong), new Object[]{Items.bucket, Blocks.wool});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemHanbaobao), new Object[]{Items.bread, "listAllveggie", "listAllmeatcooked", Items.bread});
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemYuebing, 1), new Object[]{"AAA", "XBX", "AAA", 'A', "foodFlour", 'B', ModItem.ItemDousha, 'X', new ItemStack(Items.dye, 1, 11)});
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemYuebing, 1), new Object[]{"AAA", "XBX", "AAA", 'A', "foodFlour", 'B', Items.egg, 'X', new ItemStack(Items.dye, 1, 11)});
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemNiangao, 1), new Object[]{"AAA", "ABA", "AAA", 'A', ModItem.ItemNuomifen, 'B', "foodRice"});

        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemWrench, 1), new Object[]{"A A", " A ", " A ", 'A', "ingotIron"});

        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemCiba, 1), new Object[]{"AAA", "ABA", "AAA", 'A', ModItem.ItemNuomifen, 'B', ModItem.Itemwater});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemAici), new Object[]{"foodRicecake", Blocks.leaves});
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemChangfen, 1), new Object[]{"AAA", "BBB", "CDE", 'A', "foodRice", 'B', ModItem.Itemwater, 'C', "foodGreenonion", 'D', Items.cooked_porkchop, 'E', "foodSoysauce",});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemRegou), new Object[]{"listAllveggie", "foodSausage", Items.bread});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemLabazhou), new Object[]{"foodRicesoup", Items.wheat, "cropPeanut", ModItem.Itemfan, "cropSoybean", ModItem.ItemLarou, ModItem.ItemNuomi, ModItem.ItemLachang, Items.carrot});

        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemMian, 1), new Object[]{"ABA", "ABA", "ABA", 'A', "foodFlour", 'B', ModItem.Itemwater});
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemGuoqiaomixian, 1), new Object[]{"ABA", "ABA", "ABA", 'A', ModItem.Itemfan, 'B', ModItem.Itemwater});
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemYifen, 1), new Object[]{"ABA", "ABA", "ABA", 'A', Items.wheat, 'B', ModItem.Itemwater});
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemMantou, 1), new Object[]{"AAA", "ABA", "AAA", 'A', "foodFlour", 'B', ModItem.Itemwater});
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemSuancaibing, 1), new Object[]{"AAA", "ABA", "AAA", 'A', "foodFlour", 'B', "listAllveggie"});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemLatiao), new Object[]{"foodSilkentofu", "cropChilipepper"});

        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemLachang), new Object[]{"foodSausage", ModItem.ItemLaweixunliao});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemLarou), new Object[]{Items.cooked_porkchop, ModItem.ItemLaweixunliao});

        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemYifenpork), new Object[]{ModItem.ItemYifen, Items.cooked_porkchop});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemYifenchicken), new Object[]{ModItem.ItemYifen, Items.cooked_chicken});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemYifenbeef), new Object[]{ModItem.ItemYifen, Items.cooked_beef});

        FCGameRegistry.addOreRecipe(new ItemStack(Items.cake, 1), new Object[]{"AAA", "BEB", "CCC", 'A', Items.milk_bucket, 'B', Items.sugar, 'C', "foodFlour", 'E', Items.egg});
        FCGameRegistry.addOreRecipe(new ItemStack(Items.bread, 1), new Object[]{"AAA", 'A', "foodFlour"});
        FCGameRegistry.addOreRecipe(new ItemStack(Items.pumpkin_pie, 1), new Object[]{"AAA", "BBB", "CCC", 'A', ModItem.ItemNuomifen, 'B', Blocks.pumpkin, 'C', Items.egg});
        FCGameRegistry.addOreRecipe(new ItemStack(ModBlocks.BlockWaike, 1), new Object[]{"AAA", "ABA", "AAA", 'A', "cropPeanut", 'B', Blocks.iron_block});
        FCGameRegistry.addOreRecipe(new ItemStack(ModBlocks.BlockWaike, 1), new Object[]{"AAA", "ABA", "AAA", 'A', "cropSoybean", 'B', Blocks.iron_block});
        FCGameRegistry.addOreRecipe(new ItemStack(ModBlocks.BlockWaike, 1), new Object[]{"AAA", "ABA", "AAA", 'A', "cropRice", 'B', Blocks.iron_block});
        FCGameRegistry.addOreRecipe(new ItemStack(ModBlocks.BlockWaike, 1), new Object[]{"AAA", "ABA", "AAA", 'A', Items.wheat, 'B', Blocks.iron_block});

        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemDianluban, 1), new Object[]{"AAA", "CBC", "AAA", 'A', "cropPeanut", 'B', Items.iron_ingot, 'C', Items.redstone});
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemDianluban, 1), new Object[]{"AAA", "CBC", "AAA", 'A', "cropSoybean", 'B', Items.iron_ingot, 'C', Items.redstone});
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemDianluban, 1), new Object[]{"AAA", "CBC", "AAA", 'A', "cropRice", 'B', Items.iron_ingot, 'C', Items.redstone});
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemDianluban, 1), new Object[]{"AAA", "CBC", "AAA", 'A', Items.wheat, 'B', Items.iron_ingot, 'C', Items.redstone});


        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemQiaokeli), new Object[]{ModItem.ItemQiaokelifen, Items.sugar});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemNuomi, 2), new Object[]{ModItem.ItemNuomi, Items.bone});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemDouban, 2), new Object[]{ModItem.ItemDouban, Items.bone});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemDoufugan), new Object[]{"foodToufu", "foodSoysauce",});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemDoufu), new Object[]{"foodSoymilk", ModItem.ItemYan});

        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemChunjuan), new Object[]{"foodSilkentofu", ModItem.ItemLuobosi, "listAllveggie", Items.cooked_porkchop});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemAeljichifan), new Object[]{ModItem.ItemAeljichi, ModItem.ItemBaifan});

        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemZongzi), new Object[]{ModItem.ItemNuomi, Items.cooked_porkchop, Items.string, ModItem.ItemZongye});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemNuomituan), new Object[]{ModItem.ItemNuomifen, ModItem.ItemNuomifen, ModItem.ItemNuomifen, ModItem.Itemwater});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemHuashentangyuanxian, 1), new Object[]{"cropPeanut", Items.sugar});

        FCGameRegistry.addOreRecipe(new ItemStack(ModGui.Nmj, 1), new Object[]{"AAA", "DBD", "ECE", 'A', Items.wheat, 'B', ModBlocks.BlockWaike, 'C', ModItem.ItemDianluban, 'E', Items.milk_bucket, 'D', Blocks.glass});
        FCGameRegistry.addOreRecipe(new ItemStack(ModGui.PDG, 1), new Object[]{"AAA", "EBE", " C ", 'A', "plateIron", 'B', ModBlocks.BlockWaike, 'C', ModItem.ItemDianluban, 'E', new ItemStack(Items.dye)});
        FCGameRegistry.addOreRecipe(new ItemStack(ModGui.Guo, 1), new Object[]{"AAA", "EBE", " C ", 'A', Items.iron_ingot, 'B', ModBlocks.BlockWaike, 'C', ModItem.ItemDianluban, 'E', new ItemStack(Items.dye)});
        FCGameRegistry.addOreRecipe(new ItemStack(ModGui.Gyg, 1), new Object[]{"AAA", "EBE", "XCX", 'A', Items.iron_ingot, 'B', ModBlocks.BlockWaike, 'C', ModItem.ItemDianluban, 'E', new ItemStack(Items.dye), 'X', new ItemStack(Items.dye, 1, 15)});
        FCGameRegistry.addOreRecipe(new ItemStack(ModGui.Caiban, 1), new Object[]{"AAA", "ABA", "ACA", 'A', Blocks.planks, 'B', ModItem.ItemCaidao, 'C', ModBlocks.BlockWaike});
        FCGameRegistry.addOreRecipe(new ItemStack(ModGui.YZJ, 1), new Object[]{"AAA", "DBD", "CCC", 'A', ModItem.ItemHuashenyou, 'B', ModBlocks.BlockWaike, 'C', ModItem.ItemDianluban, 'D', Blocks.glass});
        FCGameRegistry.addOreRecipe(new ItemStack(ModGui.Tpj, 1), new Object[]{"ABA", "CDC", " F ", 'A', Items.redstone, 'B', Blocks.ice, 'C', new ItemStack(Items.dye, 1, 3), 'D', ModBlocks.BlockWaike, 'F', ModItem.ItemDianluban});
        FCGameRegistry.addOreRecipe(new ItemStack(ModGui.Nt, 1), new Object[]{"ABA", "CDC", "ABA", 'A', Blocks.planks, 'B', ModItem.ItemDianluban, 'C', new ItemStack(Items.dye, 1, 3), 'D', ModBlocks.BlockWaike});
        FCGameRegistry.addOreRecipe(new ItemStack(ModGui.Zl, 1), new Object[]{"ABA", "CDC", "FBF", 'A', Items.flint_and_steel, 'B', ModItem.ItemDianluban, 'C', new ItemStack(Items.dye, 1, 3), 'D', ModBlocks.BlockWaike, 'F', Items.redstone});

        FCGameRegistry.addSmelting(new ItemStack(ModItem.ItemYouyurou), new ItemStack(ModItem.ItemShuyouyurou), 0.5f);
        FCGameRegistry.addSmelting(new ItemStack(ModItem.ItemYumi), new ItemStack(ModItem.ItemKaoyumi), 0.5f);
        FCGameRegistry.addSmelting(new ItemStack(ModItem.ItemHongshu), new ItemStack(ModItem.ItemKaohongshu), 0.5f);
        FCGameRegistry.addSmelting(new ItemStack(ModItem.Itemwater), new ItemStack(ModItem.ItemYan, 2), 0.5f);
        FCGameRegistry.addSmelting(new ItemStack(ModItem.ItemYangrou), new ItemStack(ModItem.ItemShuyangrou), 0.5f);

        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemNainao, 1), new Object[]{Items.milk_bucket});

        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemMianpi, 2), new Object[]{"foodFlour", "foodFlour", "foodFlour", ModItem.Itemwater});

        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemJiaozi), new Object[]{ModItem.ItemJiaozixian, ModItem.ItemMianpi});

        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemJinputao, 1), new Object[]{"AAA", "ABA", "AAA", 'A', Blocks.gold_block, 'B', ModItem.ItemPutao});

        FCGameRegistry.addOreRecipe(new ItemStack(ModBlocks.Blocksugar, 1), new Object[]{"AAA", "AAA", "AAA", 'A', Items.sugar});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(Items.sugar, 9), new Object[]{ModBlocks.Blocksugar});

        FCGameRegistry.addOreRecipe(new ItemStack(ModBlocks.BlockDami, 1), new Object[]{"AAA", "AAA", "AAA", 'A', "cropRice"});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemDami, 9), new Object[]{ModBlocks.BlockDami});

        FCGameRegistry.addOreRecipe(new ItemStack(ModBlocks.BlockHuashenk, 1), new Object[]{"AAA", "AAA", "AAA", 'A', ModItem.ItemHuashen});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemHuashen, 9), new Object[]{ModBlocks.BlockHuashenk});

        FCGameRegistry.addOreRecipe(new ItemStack(ModBlocks.BlockLuobo, 1), new Object[]{"AAA", "AAA", "AAA", 'A', Items.carrot});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(Items.carrot, 9), new Object[]{ModBlocks.BlockLuobo});

        FCGameRegistry.addOreRecipe(new ItemStack(ModBlocks.BlockTudou, 1), new Object[]{"AAA", "AAA", "AAA", 'A', Items.potato});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(Items.potato, 9), new Object[]{ModBlocks.BlockTudou});

        FCGameRegistry.addOreRecipe(new ItemStack(ModBlocks.BlockYan, 1), new Object[]{"AAA", "AAA", "AAA", 'A', ModItem.ItemYan});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemYan, 9), new Object[]{ModBlocks.BlockYan});

        FCGameRegistry.addOreRecipe(new ItemStack(ModBlocks.BlockDouzik, 1), new Object[]{"AAA", "AAA", "AAA", 'A', "cropSoybean"});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemDouzi, 9), new Object[]{ModBlocks.BlockDouzik});

        FCGameRegistry.addOreRecipe(new ItemStack(ModBlocks.BlockRuomi, 1), new Object[]{"AAA", "AAA", "AAA", 'A', ModItem.ItemNuomi});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemNuomi, 9), new Object[]{ModBlocks.BlockRuomi});

        FCGameRegistry.addOreRecipe(new ItemStack(ModBlocks.BlockDouban, 1), new Object[]{"AAA", "AAA", "AAA", 'A', ModItem.ItemDouban});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemDouban, 9), new Object[]{ModBlocks.BlockDouban});

        FCGameRegistry.addOreRecipe(new ItemStack(ModBlocks.BlockQiaokeli, 1), new Object[]{"AAA", "AAA", "AAA", 'A', ModItem.ItemQiaokeli});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemQiaokeli, 9), new Object[]{ModBlocks.BlockQiaokeli});

        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemQiaokelinaiice), new Object[]{"foodChocolatemilk", Items.snowball});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemPutaozhiice), new Object[]{"foodGrapejuice", Items.snowball});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemPingguozhiice), new Object[]{"foodApplejuice", Items.snowball});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemJinpingguozhiice), new Object[]{ModItem.ItemJinpingguozhi, Items.snowball});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemJinputaozhiice), new Object[]{ModItem.ItemJinputaozhi, Items.snowball});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemXiguazhiice), new Object[]{"foodMelonjuice", Items.snowball});

        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemLizhizhiice), new Object[]{ModItem.ItemLizhizhi, Items.snowball});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemTaozizhiice), new Object[]{ModItem.ItemTaozizhi, Items.snowball});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemJuzizhiice), new Object[]{ModItem.ItemJuzizhi, Items.snowball});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemMangguozhiice), new Object[]{ModItem.ItemMangguozhi, Items.snowball});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemNingmengzhiice), new Object[]{ModItem.ItemNingmengzhi, Items.snowball});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemMuguazhiice), new Object[]{ModItem.ItemMuguazhi, Items.snowball});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemCaomeizhiice), new Object[]{ModItem.ItemCaomeizhi, Items.snowball});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemYezizhiice), new Object[]{ModItem.ItemYezizhi, Items.snowball});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemXiangjiaozhiice), new Object[]{ModItem.ItemXiangjiaozhi, Items.snowball});


        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemJinkela, 8), new Object[]{"AAA", "ABA", "AAA", 'A', new ItemStack(Items.dye, 1, 15), 'B', Items.gold_ingot});

        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemSCBlock, 1), new Object[]{
                "ABC",
                "DEF",
                "GHI",
                'A', ModBlocks.BlockQiaokeli, 'B', ModBlocks.BlockDouban, 'C', ModBlocks.BlockLuobo,
                'D', ModBlocks.BlockDouzik, 'E', ModBlocks.BlockHuashenk, 'F', ModBlocks.BlockDami,
                'G', ModBlocks.BlockTudou, 'H', ModBlocks.BlockYan, 'I', ModBlocks.Blocksugar,
        });
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemSCPlant, 1), new Object[]{
                "ABC",
                "DEF",
                "GHI",
                'A', "cropRice", 'B', "cropPeanut", 'C', "cropSoybean",
                'D', "listAllveggie", 'E', "cropChilipepper", 'F', ModItem.ItemFanqie,
                'G', ModItem.ItemQiezi, 'H', ModItem.ItemPutao, 'I', Items.sugar,
        });
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemSCMW1, 1), new Object[]{
                "ABC",
                "DEF",
                "GHI",
                'A', ModItem.ItemJianjidan, 'B', "foodPancakes", 'C', ModItem.ItemDoufugan,
                'D', ModItem.ItemChaotudoupian, 'E', "foodSausage", 'F', ModItem.ItemHetaosu,
                'G', ModItem.ItemAici, 'H', ModItem.ItemNiangao, 'I', ModItem.ItemChunjuan,
        });
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemSCMW2, 1), new Object[]{
                "ABC",
                "DEF",
                "GHI",
                'A', ModItem.ItemRegou, 'B', ModItem.ItemNainao, 'C', ModItem.ItemPisa,
                'D', ModItem.ItemMantou, 'E', ModItem.ItemSuancaibing, 'F', ModItem.ItemLatiao,
                'G', ModItem.ItemMahua, 'H', ModItem.ItemLachang, 'I', ModItem.ItemLarou,
        });
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemSCKFC, 1), new Object[]{
                "ABC",
                "DEF",
                "GHI",
                'A', ModItem.ItemHanbaobao, 'B', ModItem.ItemShutiao, 'C', ModItem.ItemJichi,
                'D', ModItem.ItemJimihua, 'E', ModItem.ItemJikuai, 'F', ModItem.ItemYuanweijikuai,
                'G', ModItem.ItemYoutiao, 'H', ModItem.ItemKele, 'I', ModItem.ItemXuebi,
        });
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemSCCn, 1), new Object[]{
                "ABC",
                "DEF",
                "GHI",
                'A', ModItem.ItemJiaozi, 'B', ModItem.ItemZongzi, 'C', ModItem.ItemYuebing,
                'D', ModItem.ItemTangyuan, 'E', ModItem.ItemNiangao, 'F', ModItem.ItemChunjuan,
                'G', ModItem.ItemCiba, 'H', ModItem.ItemHetaosu, 'I', ModItem.ItemBaifan,
        });
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemSCYz, 1), new Object[]{
                "ABC",
                "DEF",
                "GHI",
                'A', ModItem.ItemShupian, 'B', ModItem.ItemZhaniangao, 'C', ModItem.ItemZhaxiangchang,
                'D', ModItem.ItemZhamianbao, 'E', ModItem.ItemZhamahua, 'F', ModItem.ItemZhajitui,
                'G', ModItem.ItemJimihua, 'H', ModItem.ItemJikuai, 'I', ModItem.ItemYuanweijikuai,
        });
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemSCJ, 1), new Object[]{
                "ABC",
                "DED",
                "GHI",
                'A', ModItem.ItemHongjiu, 'B', ModItem.ItemBaijiu, 'C', ModItem.ItemPutaojiu,
                'D', ModItem.ItemJinputao, 'E', Items.golden_apple,
                'G', ModItem.ItemPingguojiu, 'H', ModItem.ItemJinputaojiu, 'I', ModItem.ItemJinpingguojiu,
        });
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemSCShui1, 1), new Object[]{
                "ABC",
                "DEF",
                "GHI",
                'A', ModItem.ItemQiaokelishui, 'B', "foodGrapejuice", 'C', "foodApplejuice",
                'D', "cropCoffee", 'E', Items.apple, 'F', "foodChocolatemilk",
                'G', ModItem.ItemDounai, 'H', "foodMelonjuice", 'I', ModItem.ItemNaicha,
        });
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemSCShui2, 1), new Object[]{
                "ABC",
                "DEF",
                "GHI",
                'A', ModItem.ItemHuluobozhi, 'B', ModItem.ItemCha, 'C', "foodVegetablesoup",
                'D', ModItem.ItemPingguozhiice, 'E', ModItem.ItemPutaozhiice, 'F', "cropCoffee",
                'G', ModItem.ItemXiguazhiice, 'H', ModItem.ItemQiaokelinaiice, 'I', ModItem.ItemNaicha,
        });
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemSCFan1, 1), new Object[]{
                "ABC",
                "DEF",
                "GHI",
                'A', ModItem.ItemFanqiechaojidanfan, 'B', ModItem.ItemDisanxian, 'C', ModItem.ItemYuxiangrousi,
                'D', ModItem.ItemGongbaojiding, 'E', ModItem.ItemChaotudousifan, 'F', ModItem.ItemDuojiaoyutou,
                'G', ModItem.ItemMapodoufufan, 'H', ModItem.ItemHongshaoroufan, 'I', ModItem.ItemHuiguoroufan,
        });
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemSCFan2, 1), new Object[]{
                "ABC",
                "DEF",
                "GHI",
                'A', ModItem.ItemAeljichifan, 'B', ModItem.ItemLaziji, 'C', ModItem.ItemKoushuiji,
                'D', ModItem.ItemBaiqiuji, 'E', ModItem.ItemCongyouji, 'F', ModItem.ItemSuancaiyu,
                'G', ModItem.ItemMalayu, 'H', ModItem.ItemQingzhenyu, 'I', ModItem.ItemKelejichifan,
        });
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemSCFan3, 1), new Object[]{
                "ABC",
                "DEF",
                "GHI",
                'A', ModItem.ItemGalijiroufan, 'B', ModItem.ItemShuizhuniurou, 'C', ModItem.ItemYifen,
                'D', ModItem.ItemRibendoufu, 'E', "listAllveggie", 'F', ModItem.ItemYifenpork,
                'G', ModItem.ItemChangfen, 'H', ModItem.ItemYifenchicken, 'I', ModItem.ItemYifenbeef,
        });
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemSCTh, 1), new Object[]{
                "ABC",
                "DED",
                "GHI",
                'A', ModItem.ItemJinpingguojiu, 'B', ModItem.ItemJinputaozhi, 'C', ModItem.ItemJinpingguojiu,
                'D', new ItemStack(Items.golden_apple, 1, 1), 'E', ModItem.ItemJinputao,
                'G', ModItem.ItemJinpingguozhiice, 'H', ModItem.ItemJinpingguozhi, 'I', ModItem.ItemJinputaozhiice,
        });

        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemAnlanzhishi, 1), new Object[]{
                "ABC", "#X#", "DEF",
                'A', ModItem.ItemSCShui1, 'B', ModItem.ItemSCShui2, 'C', ModItem.ItemSCFan1,
                'D', ModItem.ItemSCFan2, 'E', ModItem.ItemSCFan3, 'F', ModItem.ItemSCBlock,
                '#', Items.iron_ingot, 'X', Items.diamond,
        });

        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemAnbizhishi, 1), new Object[]{
                "ABC", "#X#", "DEF",
                'A', ModItem.ItemSCMW1, 'B', ModItem.ItemSCMW2, 'C', ModItem.ItemSCKFC,
                'D', ModItem.ItemSCCn, 'E', ModItem.ItemSCYz, 'F', ModItem.ItemSCPlant,
                '#', Items.iron_ingot, 'X', Items.emerald,
        });

        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemZongjiqianguzhishi, 1), new Object[]{
                "AAA", "CDE", "BBB",
                'A', ModItem.ItemAnlanzhishi, 'C', ModItem.ItemSCTh, 'B', ModItem.ItemAnbizhishi,
                'E', ModItem.ItemSCJ, 'D', Items.diamond,
        });
        ItemStack islan = new ItemStack(ModItem.ItemAnlanTools, 1);
        islan.addEnchantment(Enchantment.efficiency, 6);
        islan.addEnchantment(Enchantment.unbreaking, 6);
        islan.addEnchantment(Enchantment.fortune, 3);
        FCGameRegistry.addOreRecipe(islan, new Object[]{
                "ABA", "ADA", " D ",
                'A', ModItem.ItemAnlanzhishi, 'B', ModItem.ItemZongjiqianguzhishi, 'D', Items.diamond,
        });
        ItemStack isbi = new ItemStack(ModItem.ItemAnbiTools, 1);
        isbi.addEnchantment(Enchantment.efficiency, 6);
        isbi.addEnchantment(Enchantment.unbreaking, 6);
        isbi.addEnchantment(Enchantment.silkTouch, 1);
        FCGameRegistry.addOreRecipe(isbi, new Object[]{
                "ABA", "ADA", " D ",
                'A', ModItem.ItemAnbizhishi, 'B', ModItem.ItemZongjiqianguzhishi, 'D', Items.emerald,
        });

	/*FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemCong,16), new Object[] {ModItem.ItemSCBlock});
	FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemLaweixunliao,16), new Object[] {ModItem.ItemSCPlant});
	FCGameRegistry.addOreShapelessRecipe(new ItemStack("foodSausage",16), new Object[] {ModItem.ItemSCShui1});
	FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemGalikuai,16), new Object[] {ModItem.ItemSCShui2});
	FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemZongye,16), new Object[] {ModItem.ItemSCYz});
	FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemDouban,16), new Object[] {ModItem.ItemSCCn});
	FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemNuomi,16), new Object[] {ModItem.ItemSCKFC});
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
            FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemDangao, 1, i1), new Object[]{new ItemStack(ModItem.ItemGuojiang, 1, i1), Items.cake});
        }
        for (int i1 = 0; i1 < 8; i1++) {
            FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemBinggan, 1, i1), new Object[]{ModItem.ItemBingganF, new ItemStack(ModItem.ItemGuojiang, 1, i1), ModItem.ItemBingganF});
        }
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemBingganF, 3, 0), new Object[]{"AAA", "BBB", "AAA", 'A', "foodFlour", 'B', Items.egg});
        FCGameRegistry.addOreRecipe(new ItemStack(ModItem.ItemBingganXN, 1, 0), new Object[]{"AAA", "ABA", "AAA", 'A', "foodFlour", 'B', Items.egg});

        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemGuojiang, 1, 0), new Object[]{ModItem.Itemwater, ModItem.ItemPutao, Items.sugar});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemGuojiang, 1, 1), new Object[]{ModItem.Itemwater, ModItem.ItemJinputao, Items.sugar});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemGuojiang, 1, 2), new Object[]{ModItem.Itemwater, ModItem.ItemLi, Items.sugar});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemGuojiang, 1, 3), new Object[]{ModItem.Itemwater, ModItem.ItemTaozi, Items.sugar});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemGuojiang, 1, 4), new Object[]{ModItem.Itemwater, ModItem.ItemJuzi, Items.sugar});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemGuojiang, 1, 5), new Object[]{ModItem.Itemwater, ModItem.ItemNingmeng, Items.sugar});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemGuojiang, 1, 6), new Object[]{ModItem.Itemwater, ModItem.ItemCaomei, Items.sugar});
        FCGameRegistry.addOreShapelessRecipe(new ItemStack(ModItem.ItemGuojiang, 1, 7), new Object[]{ModItem.Itemwater, ModItem.ItemYezi, Items.sugar});
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
