package com.foodcraft.init;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

import static com.foodcraft.init.FoodcraftItems.*;

public class FcFoodOreDictRegistry {
    public static void register() {
        Item[] listAllfruit = {
                ItemCaomei, ItemXiangjiao, ItemPutao, ItemJinputao
        };

        Item[] listAllicecream = {
                ItemCaomeizhiice, ItemQiaokelinaiice, ItemPutaozhiice, ItemPingguozhiice, ItemJinputaozhiice,
                ItemXiguazhiice, ItemLizhizhiice, ItemNingmengzhiice, ItemMuguazhiice, ItemYezizhiice,
                ItemXiangjiaozhiice
        };

        Item[] listAllseed = {
                ItemCong, ItemDami, ItemHuashen, ItemShucaizhong, ItemDouzi, ItemLajiaozhong,
                ItemFanqiezhong, ItemPutaozhong, ItemQiezizhong, ItemQingjiaozhong, ItemHongdou,
                ItemLvdou, ItemYumizhong, ItemHuangguazhong, ItemNuomi, ItemCaomei, ItemBailuobo,
                ItemHongshu, ItemHuanggua, ItemQiezi, ItemNingmeng, ItemMugua
        };

        Item[] listAllturkeyraw = {
                ItemDajirou, ItemZhongjirou, ItemXiaojirou
        };

        Item[] cropBean = {
                ItemHongdou, ItemLvdou, ItemDouzi
        };

        Item[] listAllpepper = {
                ItemLajiao, ItemQingjiao
        };

        for(Item item : listAllfruit) {
            OreDictionary.registerOre("listAllfruit", item);
        }

        for(Item item : listAllicecream) {
            OreDictionary.registerOre("listAllicecream", item);
        }

        for(Item item : listAllpepper) {
            OreDictionary.registerOre("listAllpepper", item);
        }

        for(Item item : listAllseed) {
            OreDictionary.registerOre("listAllseed", item);
        }

        for(Item item : listAllturkeyraw) {
            OreDictionary.registerOre("listAllturkeyraw", item);
        }

        for(Item item : cropBean) {
            OreDictionary.registerOre("cropBean", item);
        }

        OreDictionary.registerOre("cropRice", ItemDami);
        OreDictionary.registerOre("seedRice", ItemDami);

        OreDictionary.registerOre("cropTea", ItemCha);
        OreDictionary.registerOre("seedTea", ItemCha);
        OreDictionary.registerOre("foodTea", ItemCha);

        OreDictionary.registerOre("cropStrawberry", ItemCaomei);
        OreDictionary.registerOre("seedStrawberry", ItemCaomei);

        OreDictionary.registerOre("cropBanana", ItemXiangjiao);

        OreDictionary.registerOre("cropGrape", ItemPutao);
        OreDictionary.registerOre("seedGrape", ItemPutao);
        OreDictionary.registerOre("cropGrapefruit", ItemPutao);

        OreDictionary.registerOre("foodGrapejuice", ItemPutaozhi);
        OreDictionary.registerOre("foodGrapefruitjuice", ItemPutaozhi);

        OreDictionary.registerOre("foodChocolateicecream", ItemQiaokelinaiice);
        OreDictionary.registerOre("foodChocolatebar", ItemQiaokeli);

    }
}
