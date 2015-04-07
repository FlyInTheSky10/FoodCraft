package com.cfyifei.item;




import com.cfyifei.FoodCraft;
import com.cfyifei.plant.items.*;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionHelper;
import net.minecraftforge.common.MinecraftForge;



public class ModItem{


	static public Item ItemTiepian,ItemCaidao,ItemDami,Itemfan,ItemMianfen,ItemHuashen,ItemDouzi,ItemHuashenyou,ItemDoujiang,ItemDianluban,ItemJianjidan,ItemLaobing,ItemMianpi,ItemJiaozixian,ItemJiaozi,ItemJianjiao,ItemQiaokeli,ItemQiaokelifen,ItemShucai,ItemFanqie,ItemLajiao;
	public static Item ItemQiezi;
	public static Item ItemPutao;
	public static Item ItemYan;
	public static Item Itemwater;
	public static Item ItemDoufu;
	public static Item ItemJiangyou;
	public static Item ItemNuomi;
	public static Item ItemDoufugan;
	public static Item ItemBaifan;
	public static Item ItemFanqiechaojidanfan;
	public static Item ItemDisanxian;
	public static Item ItemCu;
	public static Item ItemYuxiangrousi;
	public static Item ItemGongbaojiding;
	public static Item ItemJitui;






	public static void init() {
		//做菜工具	
		ItemTiepian = new ItemKb();
		ItemTiepian.setUnlocalizedName("ItemTiepian");
		ItemTiepian.setTextureName("FoodCraft:ItemTiepian");
		ItemTiepian.setMaxStackSize(64);
		ItemTiepian.setCreativeTab(FoodCraft.FcTab);

		Itemwater = new ItemKb();
		Itemwater.setUnlocalizedName("Itemwater");
		Itemwater.setTextureName("FoodCraft:Itemwater");
		Itemwater.setMaxStackSize(64);
		Itemwater.setCreativeTab(FoodCraft.FcTab);
		
		ItemCaidao = new ItemKb();
		ItemCaidao.setUnlocalizedName("ItemCaidao");
		ItemCaidao.setTextureName("FoodCraft:ItemCaidao");
		ItemCaidao.setMaxStackSize(64);
		ItemCaidao.setCreativeTab(FoodCraft.FcTab);

	//饭	
		ItemDami = new ItemShuidao();
		MinecraftForge.addGrassSeed(new ItemStack(ItemDami), 2);
		ItemDami.setUnlocalizedName("ItemDami");
		ItemDami.setTextureName("FoodCraft:ItemDami");
		ItemDami.setMaxStackSize(64);
		ItemDami.setCreativeTab(FoodCraft.FcTab);
		
		ItemHuashen = new ItemHuashen();
		ItemHuashen.setUnlocalizedName("ItemHuashen");
		MinecraftForge.addGrassSeed(new ItemStack(ItemHuashen), 2);
		ItemHuashen.setTextureName("FoodCraft:ItemHuashen");
		ItemHuashen.setMaxStackSize(64);
		ItemHuashen.setCreativeTab(FoodCraft.FcTab);
		
		ItemShucai = new ItemShucai();
		ItemShucai.setUnlocalizedName("ItemShucai");
		//MinecraftForge.addGrassSeed(new ItemStack(ItemShucai), 1);
		ItemShucai.setTextureName("FoodCraft:ItemShucai");
		ItemShucai.setMaxStackSize(64);
		ItemShucai.setCreativeTab(FoodCraft.FcTab);
		
		ItemDouzi = new ItemDouzi();
		MinecraftForge.addGrassSeed(new ItemStack(ItemDouzi), 2);
		ItemDouzi.setUnlocalizedName("ItemDouzi");
		ItemDouzi.setTextureName("FoodCraft:ItemDouzi");
		ItemDouzi.setMaxStackSize(64);
		ItemDouzi.setCreativeTab(FoodCraft.FcTab);
		
		Itemfan = new ItemKb();
		Itemfan.setUnlocalizedName("Itemfan");
		Itemfan.setTextureName("FoodCraft:Itemfan");
		Itemfan.setMaxStackSize(64);
		Itemfan.setCreativeTab(FoodCraft.FcTab);

		//面粉
		ItemMianfen = new ItemKb();
		ItemMianfen.setUnlocalizedName("ItemMianfen");
		ItemMianfen.setTextureName("FoodCraft:ItemMianfen");
		ItemMianfen.setMaxStackSize(64);
		ItemMianfen.setCreativeTab(FoodCraft.FcTab);
		
		ItemHuashenyou = new ItemKb();
		ItemHuashenyou.setUnlocalizedName("ItemHuashenyou");
		ItemHuashenyou.setTextureName("FoodCraft:ItemHuashenyou");
		ItemHuashenyou.setMaxStackSize(16);
		ItemHuashenyou.setCreativeTab(FoodCraft.FcTab);
		
		ItemDoujiang = new ITemFood(2, 2F, false, "ItemDoujiang");
		ItemDoujiang.setUnlocalizedName("ItemDoujiang");
		ItemDoujiang.setTextureName("FoodCraft:ItemDoujiang");
		ItemDoujiang.setMaxStackSize(16);
		ItemDoujiang.setCreativeTab(FoodCraft.FcTab);
		
		ItemDianluban = new ItemKb();
		ItemDianluban.setUnlocalizedName("ItemDianluban");
		ItemDianluban.setTextureName("FoodCraft:ItemDianluban");
		ItemDianluban.setMaxStackSize(64);
		ItemDianluban.setCreativeTab(FoodCraft.FcTab);
		
		ItemJianjidan = new ITemFood(3, 2F, false, "ItemJianjidan");
		ItemJianjidan.setUnlocalizedName("ItemJianjidan");
		ItemJianjidan.setTextureName("FoodCraft:ItemJianjidan");
		ItemJianjidan.setMaxStackSize(64);
		ItemJianjidan.setCreativeTab(FoodCraft.FcTab);
		
		ItemLaobing = new ITemFood(3, 2F, false, "ItemLaobing");
		ItemLaobing.setUnlocalizedName("ItemLaobing");
		ItemLaobing.setTextureName("FoodCraft:Itembing");
		ItemLaobing.setMaxStackSize(64);
		ItemLaobing.setCreativeTab(FoodCraft.FcTab);
		
		ItemMianpi = new ItemKb();
		ItemMianpi.setUnlocalizedName("ItemMianpi");
		ItemMianpi.setTextureName("FoodCraft:ItemMianpi");
		ItemMianpi.setMaxStackSize(64);
		ItemMianpi.setCreativeTab(FoodCraft.FcTab);
		ItemJiaozixian = new ItemKb();
		ItemJiaozixian.setUnlocalizedName("ItemJiaozixian");
		ItemJiaozixian.setTextureName("FoodCraft:ItemJiaozixian");
		ItemJiaozixian.setMaxStackSize(64);
		ItemJiaozixian.setCreativeTab(FoodCraft.FcTab);		
		
		ItemJiaozi = new ITemFood(3, 5F, false, "ItemJiaozi");
		ItemJiaozi.setUnlocalizedName("ItemJiaozi");
		ItemJiaozi.setTextureName("FoodCraft:ItemJiaozi");
		ItemJiaozi.setMaxStackSize(64);
		ItemJiaozi.setCreativeTab(FoodCraft.FcTab);
		
		ItemJianjiao = new ITemFood(3, 7F, false, "ItemJianJiao");
		ItemJianjiao.setUnlocalizedName("ItemJianJiao");
		ItemJianjiao.setTextureName("FoodCraft:ItemJianJiao");
		ItemJianjiao.setMaxStackSize(64);
		ItemJianjiao.setCreativeTab(FoodCraft.FcTab);
		
		ItemQiaokelifen = new ItemKb();
		ItemQiaokelifen.setUnlocalizedName("ItemQiaokelifen");
		ItemQiaokelifen.setTextureName("FoodCraft:ItemQiaokelifen");
		ItemQiaokelifen.setMaxStackSize(64);
		ItemQiaokelifen.setCreativeTab(FoodCraft.FcTab);
		
		ItemQiaokeli = new ITemFood(3, 4F, false, "ItemQiaokeli");
		ItemQiaokeli.setUnlocalizedName("ItemQiaokeli");
		ItemQiaokeli.setTextureName("FoodCraft:ItemQiaokeli");
		ItemQiaokeli.setMaxStackSize(64);
		ItemQiaokeli.setCreativeTab(FoodCraft.FcTab);	
		
		ItemLajiao = new ItemLajiao();
		MinecraftForge.addGrassSeed(new ItemStack(ItemLajiao), 2);
		ItemLajiao.setUnlocalizedName("ItemLajiao");
		ItemLajiao.setTextureName("FoodCraft:ItemLajiao");
		ItemLajiao.setMaxStackSize(64);
		ItemLajiao.setCreativeTab(FoodCraft.FcTab);
		
		ItemFanqie = new ItemFanqie();
		MinecraftForge.addGrassSeed(new ItemStack(ItemFanqie), 2);
		ItemFanqie.setUnlocalizedName("ItemFanqie");
		ItemFanqie.setTextureName("FoodCraft:ItemFanqie");
		ItemFanqie.setMaxStackSize(64);
		ItemFanqie.setCreativeTab(FoodCraft.FcTab);
		
		ItemPutao = new ItemPutao();
		MinecraftForge.addGrassSeed(new ItemStack(ItemPutao), 2);
		ItemPutao.setUnlocalizedName("ItemPutao");
		ItemPutao.setTextureName("FoodCraft:ItemPutao");
		ItemPutao.setMaxStackSize(64);
		ItemPutao.setCreativeTab(FoodCraft.FcTab);
		
		ItemQiezi = new ItemQiezi();
		MinecraftForge.addGrassSeed(new ItemStack(ItemQiezi), 2);
		ItemQiezi.setUnlocalizedName("ItemQiezi");
		ItemQiezi.setTextureName("FoodCraft:ItemQiezi");
		ItemQiezi.setMaxStackSize(64);
		ItemQiezi.setCreativeTab(FoodCraft.FcTab);

		ItemYan = new ItemKb();
		ItemYan.setUnlocalizedName("ItemYan");
		ItemYan.setTextureName("FoodCraft:ItemYan");
		ItemYan.setMaxStackSize(64);
		ItemYan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemDoufu = new ITemFood(3, 2F, false, "ItemDoufu");
		ItemDoufu.setUnlocalizedName("ItemDoufu");
		ItemDoufu.setTextureName("FoodCraft:ItemDoufu");
		ItemDoufu.setMaxStackSize(64);
		ItemDoufu.setCreativeTab(FoodCraft.FcTab);	
		
		ItemJiangyou = new ItemKb();
		ItemJiangyou.setUnlocalizedName("ItemJiangyou");
		ItemJiangyou.setTextureName("FoodCraft:ItemJiangyou");
		ItemJiangyou.setMaxStackSize(64);
		ItemJiangyou.setCreativeTab(FoodCraft.FcTab);	
		
		ItemNuomi = new ItemKb();
		ItemNuomi.setUnlocalizedName("ItemNuomi");
		ItemNuomi.setTextureName("FoodCraft:ItemNuomi");
		ItemNuomi.setMaxStackSize(64);
		ItemNuomi.setCreativeTab(FoodCraft.FcTab);	
		
		ItemDoufugan = new ITemFood(3, 4F, false, "ItemDoufugan");
		ItemDoufugan.setUnlocalizedName("ItemDoufugan");
		ItemDoufugan.setTextureName("FoodCraft:ItemDoufugan");
		ItemDoufugan.setMaxStackSize(64);
		ItemDoufugan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemBaifan = new ITemFood(3, 3F, false, "ItemBaifan");
		ItemBaifan.setUnlocalizedName("ItemBaifan");
		ItemBaifan.setTextureName("FoodCraft:ItemBaifan");
		ItemBaifan.setMaxStackSize(64);
		ItemBaifan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemFanqiechaojidanfan = new ITemFood(3, 9F, false, "ItemFanqiechaojidanfan");
		ItemFanqiechaojidanfan.setUnlocalizedName("ItemFanqiechaojidanfan");
		ItemFanqiechaojidanfan.setTextureName("FoodCraft:ItemFanqiechaojidanfan");
		ItemFanqiechaojidanfan.setMaxStackSize(64);
		ItemFanqiechaojidanfan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemDisanxian = new ITemFood(3, 9F, false, "ItemDisanxian");
		ItemDisanxian.setUnlocalizedName("ItemDisanxian");
		ItemDisanxian.setTextureName("FoodCraft:ItemDisanxian");
		ItemDisanxian.setMaxStackSize(64);
		ItemDisanxian.setCreativeTab(FoodCraft.FcTab);	
	
		ItemYuxiangrousi = new ITemFood(3, 9F, false, "ItemYuxiangrousi");
		ItemYuxiangrousi.setUnlocalizedName("ItemYuxiangrousi");
		ItemYuxiangrousi.setTextureName("FoodCraft:ItemYuxiangrousi");
		ItemYuxiangrousi.setMaxStackSize(64);
		ItemYuxiangrousi.setCreativeTab(FoodCraft.FcTab);	
		
		ItemCu = new ItemKb();
		ItemCu.setUnlocalizedName("ItemCu");
		ItemCu.setTextureName("FoodCraft:ItemCu");
		ItemCu.setMaxStackSize(64);
		ItemCu.setCreativeTab(FoodCraft.FcTab);	
		
		ItemGongbaojiding = new ITemFood(3, 9F, false, "ItemGongbaojiding");
		ItemGongbaojiding.setUnlocalizedName("ItemGongbaojiding");
		ItemGongbaojiding.setTextureName("FoodCraft:ItemGongbaojiding");
		ItemGongbaojiding.setMaxStackSize(64);
		ItemGongbaojiding.setCreativeTab(FoodCraft.FcTab);	
		
		ItemJitui = new ITemFood(3, 1F, false, "ItemJitui");
		ItemJitui.setUnlocalizedName("ItemJitui");
		ItemJitui.setTextureName("FoodCraft:ItemJitui");
		ItemJitui.setMaxStackSize(64);
		ItemJitui.setCreativeTab(FoodCraft.FcTab);	
		
		GameRegistry.registerItem(ItemTiepian, "ItemTiepian");
		GameRegistry.registerItem(ItemDianluban, "ItemDianluban");
		GameRegistry.registerItem(ItemCaidao, "ItemCaidao");
		GameRegistry.registerItem(Itemwater, "Itemwater");
		
		
		GameRegistry.registerItem(ItemDami, "ItemDami");
		GameRegistry.registerItem(ItemHuashen, "ItemHuashen");	
		GameRegistry.registerItem(ItemDouzi, "ItemDouzi");	
		GameRegistry.registerItem(ItemShucai, "ItemShucai");	
		GameRegistry.registerItem(ItemLajiao, "ItemLajiao");	
		GameRegistry.registerItem(ItemFanqie, "ItemFanqie");	
		GameRegistry.registerItem(ItemQiezi, "ItemQiezi");	
		
		GameRegistry.registerItem(ItemPutao, "ItemPutao");	
		
		GameRegistry.registerItem(Itemfan, "Itemfan");
		GameRegistry.registerItem(ItemJitui, "ItemJitui");	
		GameRegistry.registerItem(ItemMianfen, "ItemMianfen");
		GameRegistry.registerItem(ItemYan, "ItemYan");
		GameRegistry.registerItem(ItemMianpi, "ItemMianpi");
		GameRegistry.registerItem(ItemNuomi, "ItemNuomi");
		GameRegistry.registerItem(ItemQiaokeli, "ItemQiaokeli");
		GameRegistry.registerItem(ItemQiaokelifen, "ItemQiaokelifen");
		GameRegistry.registerItem(ItemJiaozixian, "ItemJiaozixian");
		GameRegistry.registerItem(ItemHuashenyou, "ItemHuashenyou");
		GameRegistry.registerItem(ItemBaifan, "ItemBaifan");
		GameRegistry.registerItem(ItemJiangyou, "ItemJiangyou");	
		GameRegistry.registerItem(ItemCu, "ItemCu");	
		
		GameRegistry.registerItem(ItemJianjidan, "ItemJianjidan");
		GameRegistry.registerItem(ItemDoujiang, "ItemDoujiang");
		GameRegistry.registerItem(ItemLaobing, "ItemLaobing");
		GameRegistry.registerItem(ItemJiaozi, "ItemJiaozi");
		GameRegistry.registerItem(ItemJianjiao, "ItemJianJiao");
		GameRegistry.registerItem(ItemDoufu, "ItemDoufu");
		GameRegistry.registerItem(ItemDoufugan, "ItemDoufugan");
		GameRegistry.registerItem(ItemFanqiechaojidanfan, "ItemFanqiechaojidanfan");
		GameRegistry.registerItem(ItemDisanxian, "ItemDisanxian");
		GameRegistry.registerItem(ItemYuxiangrousi, "ItemYuxiangrousi");
		GameRegistry.registerItem(ItemGongbaojiding, "ItemGongbaojiding");
	
		
	}
}