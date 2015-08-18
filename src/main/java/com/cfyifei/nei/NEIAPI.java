package com.cfyifei.nei;

import net.minecraft.item.ItemStack;

import com.cfyifei.block.FoodcraftBlocks;
import com.cfyifei.gui.blocks.ModGui;
import com.cfyifei.gui.guis.GuiCaiban;
import com.cfyifei.gui.guis.GuiGuo;
import com.cfyifei.gui.guis.GuiGyg;
import com.cfyifei.gui.guis.GuiNmj;
import com.cfyifei.gui.guis.GuiNt;
import com.cfyifei.gui.guis.GuiPDG;
import com.cfyifei.gui.guis.GuiTpj;
import com.cfyifei.gui.guis.GuiYZJ;

import codechicken.nei.api.API;

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
        
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockBailuobo));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockCaomei));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockCaomeiDG));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockCong));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockDouzi));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockFanqie));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockHongdou));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockHongshu));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockHuanggua));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockHuashen));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockJinputaoDG));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockJuziDG));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockLajiao));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockLiDG));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockLvdou));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockNingmengDG));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockNuodao));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockPutaoDG));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockQiezi));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockQingjiao));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockShucai));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockShuidao));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockTaoziDG));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockYeziDG));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockYumi));
        API.hideItem(new ItemStack(FoodcraftBlocks.BlockPutao)); 
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
