package com.cfyifei.proxy;

import com.cfyifei.FoodCraft;
import com.cfyifei.block.ModBlocks;
import com.cfyifei.gui.blocks.ModGui;
import com.cfyifei.item.ItemOreDictRegister;
import com.cfyifei.item.ModItem;
import com.cfyifei.minetweaker.MineTweakerCompact;
import com.cfyifei.plant.blocks.Plant;
import com.cfyifei.recipe.Recipe;
import com.cfyifei.util.GuiHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import minetweaker.MineTweakerAPI;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
    }

    public void init(FMLInitializationEvent event) {
        ModBlocks.init();
        ModGui.init();
        ModItem.init();
        Recipe.init();
        Plant.init();
        ItemOreDictRegister.register();
        NetworkRegistry.INSTANCE.registerGuiHandler(FoodCraft.instance, new GuiHandler());
    }

    public void postInit(FMLPostInitializationEvent event) {
        if (com.cfyifei.FoodCraft.MTIsLoad)
            MineTweakerAPI.registerClass(MineTweakerCompact.class);
    }

    public void registerBlockModels() {
    }

    public void registerItemModels() {
    }

    public void registerRenders() {
    }


}