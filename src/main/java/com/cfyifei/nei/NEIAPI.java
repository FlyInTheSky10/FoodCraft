package com.cfyifei.nei;

import codechicken.nei.api.API;
import com.cfyifei.block.ModBlocks;
import com.cfyifei.gui.blocks.ModGui;
import com.cfyifei.gui.guis.*;
import net.minecraft.item.ItemStack;

public class NEIAPI implements codechicken.nei.api.IConfigureNEI {

    @Override
    public void loadConfig() {
        API.registerRecipeHandler(new NmjRecipeHandler());
        API.registerUsageHandler(new NmjRecipeHandler());
        API.registerGuiOverlay(GuiNmj.class, "milling");

        API.registerRecipeHandler(new YZJRecipeHandler());
        API.registerUsageHandler(new YZJRecipeHandler());
        API.registerGuiOverlay(GuiYZJ.class, "frying");

        API.registerRecipeHandler(new PDGRecipeHandler());
        API.registerUsageHandler(new PDGRecipeHandler());
        API.registerGuiOverlay(GuiPDG.class, "PDGcooking");

        API.registerRecipeHandler(new GygRecipeHandler());
        API.registerUsageHandler(new GygRecipeHandler());
        API.registerGuiOverlay(GuiGyg.class, "Gygcooking");

        API.registerRecipeHandler(new GuoRecipeHandler());
        API.registerUsageHandler(new GuoRecipeHandler());
        API.registerGuiOverlay(GuiGuo.class, "Guocooking");

        API.registerRecipeHandler(new NtRecipeHandler());
        API.registerUsageHandler(new NtRecipeHandler());
        API.registerGuiOverlay(GuiNt.class, "NtBrewing");

        API.registerRecipeHandler(new CaibanRecipeHandler());
        API.registerUsageHandler(new CaibanRecipeHandler());
        API.registerGuiOverlay(GuiCaiban.class, "Chopping");

        API.registerRecipeHandler(new TpjRecipeHandler());
        API.registerUsageHandler(new TpjRecipeHandler());
        API.registerGuiOverlay(GuiTpj.class, "Tpjmaking");

        API.hideItem(new ItemStack(ModBlocks.BlockBailuobo));
        API.hideItem(new ItemStack(ModBlocks.BlockCaomei));
        API.hideItem(new ItemStack(ModBlocks.BlockCaomeiDG));
        API.hideItem(new ItemStack(ModBlocks.BlockCong));
        API.hideItem(new ItemStack(ModBlocks.BlockDouzi));
        API.hideItem(new ItemStack(ModBlocks.BlockFanqie));
        API.hideItem(new ItemStack(ModBlocks.BlockHongdou));
        API.hideItem(new ItemStack(ModBlocks.BlockHongshu));
        API.hideItem(new ItemStack(ModBlocks.BlockHuanggua));
        API.hideItem(new ItemStack(ModBlocks.BlockHuashen));
        API.hideItem(new ItemStack(ModBlocks.BlockJinputaoDG));
        API.hideItem(new ItemStack(ModBlocks.BlockJuziDG));
        API.hideItem(new ItemStack(ModBlocks.BlockLajiao));
        API.hideItem(new ItemStack(ModBlocks.BlockLiDG));
        API.hideItem(new ItemStack(ModBlocks.BlockLvdou));
        API.hideItem(new ItemStack(ModBlocks.BlockNingmengDG));
        API.hideItem(new ItemStack(ModBlocks.BlockNuodao));
        API.hideItem(new ItemStack(ModBlocks.BlockPutaoDG));
        API.hideItem(new ItemStack(ModBlocks.BlockQiezi));
        API.hideItem(new ItemStack(ModBlocks.BlockQingjiao));
        API.hideItem(new ItemStack(ModBlocks.BlockShucai));
        API.hideItem(new ItemStack(ModBlocks.BlockShuidao));
        API.hideItem(new ItemStack(ModBlocks.BlockTaoziDG));
        API.hideItem(new ItemStack(ModBlocks.BlockYeziDG));
        API.hideItem(new ItemStack(ModBlocks.BlockYumi));
        API.hideItem(new ItemStack(ModBlocks.BlockPutao));
        API.hideItem(new ItemStack(ModGui.lit_Nmj));
        API.hideItem(new ItemStack(ModGui.lit_Tpj));
        API.hideItem(new ItemStack(ModGui.lit_YZJ));
        API.hideItem(new ItemStack(ModGui.lit_Zl));


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
