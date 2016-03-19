/**
 * Singularity Mod for Minecraft.
 * Copyright (C) 2016 Infinity Studio.
 * <p/>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p/>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * @license GPLv3
 */
package com.cfyifei.item;

import net.minecraft.item.Item;

import static com.cfyifei.item.ModItem.*;
import static net.minecraftforge.oredict.OreDictionary.registerOre;

public class ItemOreDictRegister {
    public static void register() {

        Item[] listAllveggie = new Item[]{
                ItemShucai, ItemCong, ItemYezi, ItemBailuobo, ItemDouzi
        };

        Item[] listAllmeatraw = new Item[]{
                ItemYangrou, ItemYouyurou
        };

        Item[] listAllmeatcooked = new Item[]{
                ItemShuyangrou, ItemShuyouyurou
        };

        registerOre("plateIron", ItemTiepian);

        registerOre("foodFlour", ItemMianfen);
        registerOre("foodRice", Itemfan);
        registerOre("foodRicesoup", ItemXifan);
        registerOre("foodCiba", ItemCiba);
        registerOre("foodRicecake", ItemAici);

        registerOre("cropCoffee", ItemKafei);
        registerOre("seedCoffee", ItemKafei);
        registerOre("cropTomato", ItemFanqie);

        registerOre("foodGreenonion", ItemCong);

        registerOre("foodApplejuice", ItemPingguozhi);
        registerOre("foodGrapejuice", ItemPutaozhi);

    }
}
