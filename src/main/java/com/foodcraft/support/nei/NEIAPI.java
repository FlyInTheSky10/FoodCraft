package com.foodcraft.support.nei;

import net.minecraft.item.ItemStack;

import com.foodcraft.gui.guis.GuiBeverageMaking;
import com.foodcraft.gui.guis.GuiBrewBarrel;
import com.foodcraft.gui.guis.GuiChoppingBoard;
import com.foodcraft.gui.guis.GuiFrying;
import com.foodcraft.gui.guis.GuiMill;
import com.foodcraft.gui.guis.GuiPan;
import com.foodcraft.gui.guis.GuiPerssureCooker;
import com.foodcraft.gui.guis.GuiPot;
import com.foodcraft.init.FoodcraftBlocks;
import com.foodcraft.init.FoodcraftGuiBlocks;
import com.foodcraft.init.FoodcraftPlants;

import codechicken.nei.api.API;

public class NEIAPI implements codechicken.nei.api.IConfigureNEI {

    @Override
    public void loadConfig() {
        API.registerRecipeHandler(new MillRecipeHandler());
        API.registerUsageHandler(new MillRecipeHandler());
        API.registerGuiOverlay(GuiMill.class, "milling");

        API.registerRecipeHandler(new FryingRecipeHandler());
        API.registerUsageHandler(new FryingRecipeHandler());
        API.registerGuiOverlay(GuiFrying.class, "frying");

        API.registerRecipeHandler(new PanRecipeHandler());
        API.registerUsageHandler(new PanRecipeHandler());
        API.registerGuiOverlay(GuiPan.class, "PDGcooking");

        API.registerRecipeHandler(new PressureCookerRecipeHandler());
        API.registerUsageHandler(new PressureCookerRecipeHandler());
        API.registerGuiOverlay(GuiPerssureCooker.class, "Gygcooking");

        API.registerRecipeHandler(new PotRecipeHandler());
        API.registerUsageHandler(new PotRecipeHandler());
        API.registerGuiOverlay(GuiPot.class, "Guocooking");

        API.registerRecipeHandler(new BrewBarrelRecipeHandler());
        API.registerUsageHandler(new BrewBarrelRecipeHandler());
        API.registerGuiOverlay(GuiBrewBarrel.class, "NtBrewing");

        API.registerRecipeHandler(new ChoppingBoardRecipeHandler());
        API.registerUsageHandler(new ChoppingBoardRecipeHandler());
        API.registerGuiOverlay(GuiChoppingBoard.class, "Chopping");

        API.registerRecipeHandler(new BeverageMakingRecipeHandler());
        API.registerUsageHandler(new BeverageMakingRecipeHandler());
        API.registerGuiOverlay(GuiBeverageMaking.class, "Tpjmaking");

        API.hideItem(new ItemStack(FoodcraftPlants.BlockBailuobo));
        API.hideItem(new ItemStack(FoodcraftPlants.BlockCaomei));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockCaomeiDG));
        API.hideItem(new ItemStack(FoodcraftPlants.BlockCong));
        API.hideItem(new ItemStack(FoodcraftPlants.BlockDouzi));
        API.hideItem(new ItemStack(FoodcraftPlants.BlockFanqie));
        API.hideItem(new ItemStack(FoodcraftPlants.BlockHongdou));
        API.hideItem(new ItemStack(FoodcraftPlants.BlockHongshu));
        API.hideItem(new ItemStack(FoodcraftPlants.BlockHuanggua));
        API.hideItem(new ItemStack(FoodcraftPlants.BlockHuashen));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockJinputaoDG));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockJuziDG));
        API.hideItem(new ItemStack(FoodcraftPlants.BlockLajiao));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockLiDG));
        API.hideItem(new ItemStack(FoodcraftPlants.BlockLvdou));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockNingmengDG));
        API.hideItem(new ItemStack(FoodcraftPlants.BlockNuodao));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockPutaoDG));
        API.hideItem(new ItemStack(FoodcraftPlants.BlockQiezi));
        API.hideItem(new ItemStack(FoodcraftPlants.BlockQingjiao));
        API.hideItem(new ItemStack(FoodcraftPlants.BlockShucai));
        API.hideItem(new ItemStack(FoodcraftPlants.BlockShuidao));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockTaoziDG));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockYeziDG));
        API.hideItem(new ItemStack(FoodcraftPlants.BlockYumi));
        API.hideItem(new ItemStack(FoodcraftPlants.BlockPutao));
        API.hideItem(new ItemStack(FoodcraftGuiBlocks.lit_Nmj));
        API.hideItem(new ItemStack(FoodcraftGuiBlocks.lit_Tpj));
        API.hideItem(new ItemStack(FoodcraftGuiBlocks.lit_YZJ));
        API.hideItem(new ItemStack(FoodcraftGuiBlocks.lit_Zl));
    }

    @Override
    public String getName() {
        return "foodcraft";
    }

    @Override
    public String getVersion() {
        return "1.2.0";
    }
}
