package com.foodcraft.init;

import com.foodcraft.FoodCraft;
import com.foodcraft.config.NERLogManager;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import java.lang.reflect.Field;

import static com.foodcraft.init.FoodcraftItems.*;

public class FcFoodOreDictRegistry {
    private static Item[] listAllfruit = {
            ItemCaomei, ItemXiangjiao, ItemPutao, ItemJinputao
    };

    private static Item[] listAllicecream = {
            ItemCaomeizhiice, ItemQiaokelinaiice, ItemPutaozhiice, ItemPingguozhiice, ItemJinputaozhiice,
            ItemXiguazhiice, ItemLizhizhiice, ItemNingmengzhiice, ItemMuguazhiice, ItemYezizhiice,
            ItemXiangjiaozhiice
    };

    private static Item[] listAllseed = {
            ItemCong, ItemDami, ItemHuashen, ItemShucaizhong, ItemDouzi, ItemLajiaozhong,
            ItemFanqiezhong, ItemPutaozhong, ItemQiezizhong, ItemQingjiaozhong, ItemHongdou,
            ItemLvdou, ItemYumizhong, ItemHuangguazhong, ItemNuomi, ItemCaomei, ItemBailuobo,
            ItemHongshu, ItemHuanggua, ItemQiezi, ItemNingmeng, ItemMugua
    };

    private static Item[] listAllturkeyraw = {
            ItemDajirou, ItemZhongjirou, ItemXiaojirou
    };

    private static Item[] cropBean = {
            ItemHongdou, ItemLvdou, ItemDouzi
    };

    private static Item[] listAllpepper = {
            ItemLajiao, ItemQingjiao
    };

    public static void register() {
        for (Field field : FcFoodOreDictRegistry.class.getDeclaredFields())
            try {
                Object object = field.get(null);
                if (object instanceof Item[])
                    for (Item item : (Item[]) object)
                        OreDictionary.registerOre(field.getName(), item);
                else if (object instanceof Block[])
                    for (Block block : (Block[]) object)
                        OreDictionary.registerOre(field.getName(), block);
                else if (object instanceof ItemStack[])
                    for (ItemStack itemStack : (ItemStack[]) object)
                        OreDictionary.registerOre(field.getName(), itemStack);
            } catch (IllegalAccessException e) {
                NERLogManager.NERLogger.error(e);
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
