package com.cfyifei.nei;

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
