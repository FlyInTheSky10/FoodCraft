package com.cfyifei.proxy;

import com.cfyifei.FoodCraft;
import com.cfyifei.gui.blocks.ModGui;
import com.cfyifei.gui.tileentities.TileEntityCaiban;
import com.cfyifei.gui.tileentities.TileEntityGuo;
import com.cfyifei.gui.tileentities.TileEntityGyg;
import com.cfyifei.gui.tileentities.TileEntityPDG;
import com.cfyifei.modelrenderer.*;
import com.cfyifei.nei.NEIAPI;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
    public static void registerRenderThings() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPDG.class, new PDGRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGuo.class, new GuoRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGyg.class, new GygRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCaiban.class, new CaibanRenderer());
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);

        this.registerBlockModels();
        this.registerItemModels();
        this.registerRenders();
        this.registerRenderThings();
        this.rendererItem();
        if (FoodCraft.NEIIsLoad) {
            new NEIAPI().loadConfig();
        }
    }

    public void rendererItem() {
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModGui.PDG), new PDGItemRenderer(new TileEntityPDG(), 0.0D, -0.1D, 0.0D));
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModGui.Guo), new GuoItemRenderer(new TileEntityGuo(), 0.0D, -0.1D, 0.0D));
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModGui.Gyg), new GygItemRenderer(new TileEntityGyg(), 0.0D, -0.1D, 0.0D));
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModGui.Caiban), new CaibanItemRenderer(new TileEntityCaiban(), 0.0D, -0.1D, 0.0D));

    }


}