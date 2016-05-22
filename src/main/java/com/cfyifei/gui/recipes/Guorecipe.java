package com.cfyifei.gui.recipes;

import com.cfyifei.item.ModItem;
import com.cfyifei.itemstack.CookingOutput;
import com.cfyifei.itemstack.PotCooking;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Guorecipe {
    private static final Guorecipe smeltingBase = new Guorecipe();
    public Map<PotCooking, CookingOutput> stack1 = new HashMap();
    public Item IStapleInput1;
    public Item IStapleInput2;
    public Item IStapleInput3;
    public Item IStapleInput4;
    public Item Iingredients1;
    public Item Iingredients2;
    public Item Iingredients3;
    public Item Iingredients4;
    public Item Iingredients5;
    public Item Iingredients6;
    public Item Iingredients7;
    public Item Iingredients8;

    private Guorecipe() {
        OreDictionary.getOres("cropTomato").get(0);
        addRecipeItem(Items.egg, OreDictionary.getOres("cropTomato").get(0).getItem(), ModItem.ItemBaifan, null, ModItem.ItemHuashenyou, ModItem.ItemYan, Items.sugar, null, null, null, null, null, new ItemStack(ModItem.ItemFanqiechaojidanfan), 400, 500);
        addRecipeItem(ModItem.ItemTudousi, ModItem.ItemCong, ModItem.ItemBaifan, null, ModItem.ItemHuashenyou, ModItem.ItemYan, ModItem.ItemJiangyou, null, null, null, null, null, new ItemStack(ModItem.ItemChaotudousifan), 450, 500);
        addRecipeItem(Items.cooked_fish, ModItem.ItemLajiao, ModItem.ItemBaifan, null, ModItem.ItemHuashenyou, ModItem.ItemYan, ModItem.ItemJiangyou, null, null, null, null, null, new ItemStack(ModItem.ItemDuojiaoyutou), 350, 450);
        addRecipeItem(ModItem.ItemDoufu, ModItem.ItemDouban, ModItem.ItemBaifan, null, ModItem.ItemHuashenyou, ModItem.ItemYan, ModItem.ItemDianfen, null, null, null, null, null, new ItemStack(ModItem.ItemMapodoufufan), 400, 500);
        addRecipeItem(ModItem.ItemQingjiao, Items.potato, ModItem.ItemQiezi, ModItem.ItemBaifan, ModItem.ItemHuashenyou, ModItem.ItemYan, Items.sugar, ModItem.ItemJiangyou, null, null, null, null, new ItemStack(ModItem.ItemDisanxian), 450, 500);
        addRecipeItem(Items.cooked_porkchop, ModItem.ItemLajiao, Items.carrot, ModItem.ItemBaifan, ModItem.ItemHuashenyou, ModItem.ItemYan, Items.sugar, ModItem.ItemCu, null, null, null, null, new ItemStack(ModItem.ItemYuxiangrousi), 350, 450);
        addRecipeItem(Items.cooked_chicken, ModItem.ItemHuashen, ModItem.ItemLajiao, ModItem.ItemBaifan, ModItem.ItemHuashenyou, ModItem.ItemYan, Items.sugar, ModItem.ItemCu, null, null, null, null, new ItemStack(ModItem.ItemGongbaojiding), 400, 500);
        addRecipeItem(Items.cooked_porkchop, ModItem.ItemBaifan, null, null, ModItem.ItemHuashenyou, ModItem.ItemYan, Items.sugar, ModItem.ItemJiangyou, ModItem.ItemCu, null, null, null, new ItemStack(ModItem.ItemHongshaoroufan), 450, 500);
        addRecipeItem(Items.cooked_porkchop, ModItem.ItemLajiao, ModItem.ItemBaifan, null, ModItem.ItemHuashenyou, ModItem.ItemYan, Items.sugar, ModItem.ItemDouban, null, null, null, null, new ItemStack(ModItem.ItemHuiguoroufan), 350, 450);
        addRecipeItem(ModItem.ItemNuomituan, ModItem.ItemHuashentangyuanxian, null, null, null, null, null, null, null, null, null, null, new ItemStack(ModItem.ItemTangyuan), 400, 500);
        addRecipeItem(ModItem.ItemDousha, ModItem.ItemHuashentangyuanxian, null, null, null, null, null, null, null, null, null, null, new ItemStack(ModItem.ItemTangyuan), 400, 500);
        addRecipeItem(Items.cooked_chicken, ModItem.ItemCong, null, null, Items.sugar, null, null, null, null, null, null, null, new ItemStack(ModItem.ItemBaiqiuji), 450, 500);
        addRecipeItem(Items.cooked_chicken, ModItem.ItemLajiao, ModItem.ItemCong, null, ModItem.ItemHuashenyou, ModItem.ItemYan, Items.sugar, ModItem.ItemDouban, null, null, null, null, new ItemStack(ModItem.ItemKoushuiji), 450, 500);
        addRecipeItem(Items.cooked_chicken, ModItem.ItemLajiao, ModItem.ItemHuashen, null, ModItem.ItemHuashenyou, ModItem.ItemYan, Items.sugar, ModItem.ItemJiangyou, null, null, null, null, new ItemStack(ModItem.ItemLaziji), 350, 450);
        addRecipeItem(Items.cooked_chicken, ModItem.ItemQingjiao, ModItem.ItemShucai, null, ModItem.ItemHuashenyou, ModItem.ItemYan, ModItem.ItemJiangyou, null, null, null, null, null, new ItemStack(ModItem.ItemCongyouji), 400, 500);
        addRecipeItem(ModItem.ItemJichi, ModItem.ItemKele, ModItem.ItemBaifan, null, ModItem.ItemHuashenyou, ModItem.ItemYan, ModItem.ItemJiangyou, null, null, null, null, null, new ItemStack(ModItem.ItemKelejichifan), 450, 500);
        addRecipeItem(Items.cooked_fish, ModItem.ItemLajiao, ModItem.ItemCong, null, ModItem.ItemHuashenyou, ModItem.ItemYan, ModItem.ItemJiangyou, null, null, null, null, null, new ItemStack(ModItem.ItemMalayu), 350, 450);
        addRecipeItem(Items.cooked_fish, ModItem.ItemLajiao, ModItem.ItemCong, ModItem.ItemShucai, ModItem.ItemHuashenyou, ModItem.ItemYan, ModItem.ItemJiangyou, ModItem.ItemDianfen, null, null, null, null, new ItemStack(ModItem.ItemSuancaiyu), 450, 500);
        addRecipeItem(Items.cooked_chicken, ModItem.ItemGalikuai, Items.potato, ModItem.ItemBaifan, ModItem.ItemHuashenyou, ModItem.ItemYan, ModItem.ItemJiangyou, ModItem.ItemDianfen, null, null, null, null, new ItemStack(ModItem.ItemGalijiroufan), 400, 500);
        addRecipeItem(Items.cooked_beef, ModItem.ItemLajiao, ModItem.ItemShucai, null, ModItem.ItemHuashenyou, ModItem.ItemYan, ModItem.ItemDianfen, null, null, null, null, null, new ItemStack(ModItem.ItemShuizhuniurou), 350, 450);
        addRecipeItem(Items.egg, OreDictionary.getOres("foodGreenonion").get(0).getItem(), ModItem.ItemLajiao, ModItem.ItemBaifan, ModItem.ItemHuashenyou, ModItem.ItemYan, ModItem.ItemJiangyou, ModItem.ItemDianfen, null, null, null, null, new ItemStack(ModItem.ItemRibendoufu), 350, 450);
    }

    public static Guorecipe smelting() {
        return smeltingBase;
    }

    public void addRecipeItem(Item StapleInput1, Item StapleInput2, Item StapleInput3,
                              Item StapleInput4, Item ingredients1, Item ingredients2, Item ingredients3
            , Item ingredients4, Item ingredients5, Item ingredients6, Item ingredients7
            , Item ingredients8, ItemStack Output, int min, int max) {

        stack1.put(new PotCooking(StapleInput1, StapleInput2, StapleInput3, StapleInput4, ingredients1,
                ingredients2, ingredients3, ingredients4, ingredients5, ingredients6, ingredients7, ingredients8), new CookingOutput(Output, min, max));

    }

    private boolean GG(PotCooking ItemStack1, PotCooking ItemStack2) {
        return
                ItemStack1.StapleInput1 == ItemStack2.StapleInput1 && ItemStack1.StapleInput2 == ItemStack2.StapleInput2 &&
                        ItemStack1.StapleInput3 == ItemStack2.StapleInput3 && ItemStack1.StapleInput4 == ItemStack2.StapleInput4 &&
                        ItemStack1.ingredients1 == ItemStack2.ingredients1 && ItemStack1.ingredients2 == ItemStack2.ingredients2 &&
                        ItemStack1.ingredients3 == ItemStack2.ingredients3 && ItemStack1.ingredients4 == ItemStack2.ingredients4 &&
                        ItemStack1.ingredients5 == ItemStack2.ingredients5 && ItemStack1.ingredients6 == ItemStack2.ingredients6 &&
                        ItemStack1.ingredients7 == ItemStack2.ingredients7 && ItemStack1.ingredients8 == ItemStack2.ingredients8
                ;

    }

    public CookingOutput getOutput(ItemStack StapleInput1, ItemStack StapleInput2, ItemStack StapleInput3,
                                   ItemStack StapleInput4, ItemStack ingredients1, ItemStack ingredients2, ItemStack ingredients3
            , ItemStack ingredients4, ItemStack ingredients5, ItemStack ingredients6, ItemStack ingredients7
            , ItemStack ingredients8
    ) {


        if (ingredients1 != null) {
            Iingredients1 = ingredients1.getItem();
        } else {
            Iingredients1 = null;
        }
        if (ingredients2 != null) {
            Iingredients2 = ingredients2.getItem();
        } else {
            Iingredients2 = null;
        }
        if (ingredients3 != null) {
            Iingredients3 = ingredients3.getItem();
        } else {
            Iingredients3 = null;
        }
        if (ingredients4 != null) {
            Iingredients4 = ingredients4.getItem();
        } else {
            Iingredients4 = null;
        }
        if (ingredients5 != null) {
            Iingredients5 = ingredients5.getItem();
        } else {
            Iingredients5 = null;
        }
        if (ingredients6 != null) {
            Iingredients6 = ingredients6.getItem();
        } else {
            Iingredients6 = null;
        }
        if (ingredients7 != null) {
            Iingredients7 = ingredients7.getItem();
        } else {
            Iingredients7 = null;
        }
        if (ingredients8 != null) {
            Iingredients8 = ingredients8.getItem();
        } else {
            Iingredients8 = null;
        }

        if (StapleInput1 != null) {
            IStapleInput1 = StapleInput1.getItem();
        } else {
            IStapleInput1 = null;
        }
        if (StapleInput2 != null) {
            IStapleInput2 = StapleInput2.getItem();
        } else {
            IStapleInput2 = null;
        }
        if (StapleInput3 != null) {
            IStapleInput3 = StapleInput3.getItem();
        } else {
            IStapleInput3 = null;
        }
        if (StapleInput4 != null) {
            IStapleInput4 = StapleInput4.getItem();
        } else {
            IStapleInput4 = null;
        }
        PotCooking fis = new PotCooking(IStapleInput1, IStapleInput2, IStapleInput3, IStapleInput4, Iingredients1,
                Iingredients2, Iingredients3, Iingredients4, Iingredients5, Iingredients6, Iingredients7, Iingredients8);

        Iterator iterator1 = stack1.entrySet().iterator();
        Entry entry1;

        do {
            if (!iterator1.hasNext()) {
                return null;
            }

            entry1 = (Entry) iterator1.next();
        }
        while (!GG(fis, (PotCooking) entry1.getKey()));

        CookingOutput is1 = (CookingOutput) entry1.getValue();


        return is1;


    }

    public Map<PotCooking, CookingOutput> getSmeltingList() {
        return this.stack1;
    }


}
