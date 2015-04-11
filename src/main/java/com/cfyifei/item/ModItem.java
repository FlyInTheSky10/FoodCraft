package com.cfyifei.item;




import com.cfyifei.FoodCraft;
import com.cfyifei.plant.items.*;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionHelper;
import net.minecraftforge.common.MinecraftForge;



public class ModItem{
	static public Item ItemCong;
	static public Item ItemZongye;
	static public Item ItemXifan;
	static public Item ItemDangeng;
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
	public static Item ItemTudoupian;
	public static Item ItemTudousi;
	public static Item ItemChaotudousifan;
	public static Item ItemChaotudoupian;
	public static Item ItemDuojiaoyutou;
	public static Item ItemDouban;
	public static Item ItemMapodoufufan;
	public static Item ItemDianfen;
	public static Item ItemHongshaoroufan;
	public static Item ItemHuiguoroufan;
	public static Item ItemMogudunjitang;
	public static Item ItemZongzi;
	public static Item ItemNuomifen;
	public static Item ItemTangyuan;
	public static Item ItemHuashentangyuanxian;
	public static Item ItemNuomituan;



	public static void init() {
		//做菜工具	
		ItemTiepian = new ItemKb();
		ItemTiepian.setUnlocalizedName("ItemTiepian");
		ItemTiepian.setTextureName("FoodCraft:ItemTiepian");
		ItemTiepian.setCreativeTab(FoodCraft.FcTab);
		

		Itemwater = new ItemKb();
		Itemwater.setUnlocalizedName("Itemwater");
		Itemwater.setTextureName("FoodCraft:Itemwater");
		Itemwater.setCreativeTab(FoodCraft.FcTab);
		
		ItemCaidao = new ItemSpade(Item.ToolMaterial.WOOD);
		ItemCaidao.setUnlocalizedName("ItemCaidao");
		ItemCaidao.setTextureName("FoodCraft:ItemCaidao");
		ItemCaidao.setCreativeTab(FoodCraft.FcTab);
		//ItemCaidao.setContainerItem(ItemCaidao);
	//饭	
		ItemDami = new ItemShuidao();
		MinecraftForge.addGrassSeed(new ItemStack(ItemDami), 2);
		ItemDami.setUnlocalizedName("ItemDami");
		ItemDami.setTextureName("FoodCraft:ItemDami");
		ItemDami.setCreativeTab(FoodCraft.FcTab);
		
		ItemHuashen = new ItemHuashen();
		ItemHuashen.setUnlocalizedName("ItemHuashen");
		MinecraftForge.addGrassSeed(new ItemStack(ItemHuashen), 2);
		ItemHuashen.setTextureName("FoodCraft:ItemHuashen");
		ItemHuashen.setCreativeTab(FoodCraft.FcTab);
		
		ItemShucai = new ItemShucai();
		ItemShucai.setUnlocalizedName("ItemShucai");
		MinecraftForge.addGrassSeed(new ItemStack(ItemShucai), 1);
		ItemShucai.setTextureName("FoodCraft:ItemShucai");
		ItemShucai.setCreativeTab(FoodCraft.FcTab);
		
		ItemDouzi = new ItemDouzi();
		MinecraftForge.addGrassSeed(new ItemStack(ItemDouzi), 2);
		ItemDouzi.setUnlocalizedName("ItemDouzi");
		ItemDouzi.setTextureName("FoodCraft:ItemDouzi");
		ItemDouzi.setCreativeTab(FoodCraft.FcTab);
		
		Itemfan = new ItemKb();
		Itemfan.setUnlocalizedName("Itemfan");
		Itemfan.setTextureName("FoodCraft:Itemfan");
		Itemfan.setCreativeTab(FoodCraft.FcTab);

		//面粉
		ItemMianfen = new ItemKb();
		ItemMianfen.setUnlocalizedName("ItemMianfen");
		ItemMianfen.setTextureName("FoodCraft:ItemMianfen");
		ItemMianfen.setCreativeTab(FoodCraft.FcTab);
		
		ItemHuashenyou = new ItemKb();
		ItemHuashenyou.setUnlocalizedName("ItemHuashenyou");
		ItemHuashenyou.setTextureName("FoodCraft:ItemHuashenyou");
		ItemHuashenyou.setCreativeTab(FoodCraft.FcTab);
		
		ItemDoujiang = new ITemFood(2, 2F, false, "ItemDoujiang");
		ItemDoujiang.setUnlocalizedName("ItemDoujiang");
		ItemDoujiang.setTextureName("FoodCraft:ItemDoujiang");
		ItemDoujiang.setCreativeTab(FoodCraft.FcTab);
		
		ItemDianluban = new ItemKb();
		ItemDianluban.setUnlocalizedName("ItemDianluban");
		ItemDianluban.setTextureName("FoodCraft:ItemDianluban");
		ItemDianluban.setCreativeTab(FoodCraft.FcTab);
		
		ItemJianjidan = new ITemFood(3, 2F, false, "ItemJianjidan");
		ItemJianjidan.setUnlocalizedName("ItemJianjidan");
		ItemJianjidan.setTextureName("FoodCraft:ItemJianjidan");
		ItemJianjidan.setCreativeTab(FoodCraft.FcTab);
		
		ItemLaobing = new ITemFood(3, 2F, false, "ItemLaobing");
		ItemLaobing.setUnlocalizedName("ItemLaobing");
		ItemLaobing.setTextureName("FoodCraft:Itembing");
		ItemLaobing.setCreativeTab(FoodCraft.FcTab);
		
		ItemMianpi = new ItemKb();
		ItemMianpi.setUnlocalizedName("ItemMianpi");
		ItemMianpi.setTextureName("FoodCraft:ItemMianpi");
		ItemMianpi.setCreativeTab(FoodCraft.FcTab);
		
		ItemJiaozixian = new ItemKb();
		ItemJiaozixian.setUnlocalizedName("ItemJiaozixian");
		ItemJiaozixian.setTextureName("FoodCraft:ItemJiaozixian");
		ItemJiaozixian.setCreativeTab(FoodCraft.FcTab);		
		
		ItemJiaozi = new ITemFood(3, 5F, false, "ItemJiaozi");
		ItemJiaozi.setUnlocalizedName("ItemJiaozi");
		ItemJiaozi.setTextureName("FoodCraft:ItemJiaozi");
		ItemJiaozi.setCreativeTab(FoodCraft.FcTab);
		
		ItemJianjiao = new ITemFood(3, 7F, false, "ItemJianJiao");
		ItemJianjiao.setUnlocalizedName("ItemJianJiao");
		ItemJianjiao.setTextureName("FoodCraft:ItemJianJiao");
		ItemJianjiao.setCreativeTab(FoodCraft.FcTab);
		
		ItemQiaokelifen = new ItemKb();
		ItemQiaokelifen.setUnlocalizedName("ItemQiaokelifen");
		ItemQiaokelifen.setTextureName("FoodCraft:ItemQiaokelifen");
		ItemQiaokelifen.setCreativeTab(FoodCraft.FcTab);
		
		ItemQiaokeli = new ITemFood(3, 4F, false, "ItemQiaokeli");
		ItemQiaokeli.setUnlocalizedName("ItemQiaokeli");
		ItemQiaokeli.setTextureName("FoodCraft:ItemQiaokeli");
		ItemQiaokeli.setCreativeTab(FoodCraft.FcTab);	
		
		ItemLajiao = new ItemLajiao();
		MinecraftForge.addGrassSeed(new ItemStack(ItemLajiao), 2);
		ItemLajiao.setUnlocalizedName("ItemLajiao");
		ItemLajiao.setTextureName("FoodCraft:ItemLajiao");
		ItemLajiao.setCreativeTab(FoodCraft.FcTab);
		
		ItemFanqie = new ItemFanqie();
		MinecraftForge.addGrassSeed(new ItemStack(ItemFanqie), 2);
		ItemFanqie.setUnlocalizedName("ItemFanqie");
		ItemFanqie.setTextureName("FoodCraft:ItemFanqie");
		ItemFanqie.setCreativeTab(FoodCraft.FcTab);
		
		ItemPutao = new ItemPutao();
		MinecraftForge.addGrassSeed(new ItemStack(ItemPutao), 2);
		ItemPutao.setUnlocalizedName("ItemPutao");
		ItemPutao.setTextureName("FoodCraft:ItemPutao");
		ItemPutao.setCreativeTab(FoodCraft.FcTab);
		
		ItemQiezi = new ItemQiezi();
		MinecraftForge.addGrassSeed(new ItemStack(ItemQiezi), 2);
		ItemQiezi.setUnlocalizedName("ItemQiezi");
		ItemQiezi.setTextureName("FoodCraft:ItemQiezi");
		ItemQiezi.setCreativeTab(FoodCraft.FcTab);

		ItemYan = new ItemKb();
		ItemYan.setUnlocalizedName("ItemYan");
		ItemYan.setTextureName("FoodCraft:ItemYan");
		ItemYan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemDoufu = new ITemFood(3, 2F, false, "ItemDoufu");
		ItemDoufu.setUnlocalizedName("ItemDoufu");
		ItemDoufu.setTextureName("FoodCraft:ItemDoufu");
		ItemDoufu.setCreativeTab(FoodCraft.FcTab);	
		
		ItemJiangyou = new ItemKb();
		ItemJiangyou.setUnlocalizedName("ItemJiangyou");
		ItemJiangyou.setTextureName("FoodCraft:ItemJiangyou");
		ItemJiangyou.setCreativeTab(FoodCraft.FcTab);	
		
		ItemNuomi = new ItemKb();
		ItemNuomi.setUnlocalizedName("ItemNuomi");
		ItemNuomi.setTextureName("FoodCraft:ItemNuomi");
		ItemNuomi.setCreativeTab(FoodCraft.FcTab);	
		
		ItemDoufugan = new ITemFood(3, 4F, false, "ItemDoufugan");
		ItemDoufugan.setUnlocalizedName("ItemDoufugan");
		ItemDoufugan.setTextureName("FoodCraft:ItemDoufugan");
		ItemDoufugan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemBaifan = new ITemFood(3, 3F, false, "ItemBaifan");
		ItemBaifan.setUnlocalizedName("ItemBaifan");
		ItemBaifan.setTextureName("FoodCraft:ItemBaifan");
		ItemBaifan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemFanqiechaojidanfan = new ITemFood(3, 9F, false, "ItemFanqiechaojidanfan");
		ItemFanqiechaojidanfan.setUnlocalizedName("ItemFanqiechaojidanfan");
		ItemFanqiechaojidanfan.setTextureName("FoodCraft:ItemFanqiechaojidanfan");
		ItemFanqiechaojidanfan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemDisanxian = new ITemFood(3, 9F, false, "ItemDisanxian");
		ItemDisanxian.setUnlocalizedName("ItemDisanxian");
		ItemDisanxian.setTextureName("FoodCraft:ItemDisanxian");
		ItemDisanxian.setCreativeTab(FoodCraft.FcTab);	
	
		ItemYuxiangrousi = new ITemFood(3, 9F, false, "ItemYuxiangrousi");
		ItemYuxiangrousi.setUnlocalizedName("ItemYuxiangrousi");
		ItemYuxiangrousi.setTextureName("FoodCraft:ItemYuxiangrousi");
		ItemYuxiangrousi.setCreativeTab(FoodCraft.FcTab);	
		
		ItemCu = new ItemKb();
		ItemCu.setUnlocalizedName("ItemCu");
		ItemCu.setTextureName("FoodCraft:ItemCu");
		ItemCu.setCreativeTab(FoodCraft.FcTab);	
		
		ItemGongbaojiding = new ITemFood(3, 9F, false, "ItemGongbaojiding");
		ItemGongbaojiding.setUnlocalizedName("ItemGongbaojiding");
		ItemGongbaojiding.setTextureName("FoodCraft:ItemGongbaojiding");
		ItemGongbaojiding.setCreativeTab(FoodCraft.FcTab);	
		
		ItemJitui = new ITemFood(3, 1F, false, "ItemJitui");
		ItemJitui.setUnlocalizedName("ItemJitui");
		ItemJitui.setTextureName("FoodCraft:ItemJitui");
		ItemJitui.setCreativeTab(FoodCraft.FcTab);	
		
		ItemTudoupian = new ItemKb();
		ItemTudoupian.setUnlocalizedName("ItemTudoupian");
		ItemTudoupian.setTextureName("FoodCraft:ItemTudoupian");
		ItemTudoupian.setCreativeTab(FoodCraft.FcTab);	
		
		ItemTudousi = new ItemKb();
		ItemTudousi.setUnlocalizedName("ItemTudousi");
		ItemTudousi.setTextureName("FoodCraft:ItemTudousi");
		ItemTudousi.setCreativeTab(FoodCraft.FcTab);	
		
		ItemChaotudousifan = new ITemFood(3, 9F, false, "ItemChaotudousifan");
		ItemChaotudousifan.setUnlocalizedName("ItemChaotudousifan");
		ItemChaotudousifan.setTextureName("FoodCraft:ItemChaotudousifan");
		ItemChaotudousifan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemChaotudoupian = new ITemFood(3, 3F, false, "ItemChaotudoupian");
		ItemChaotudoupian.setUnlocalizedName("ItemChaotudoupian");
		ItemChaotudoupian.setTextureName("FoodCraft:ItemChaotudoupian");
		ItemChaotudoupian.setCreativeTab(FoodCraft.FcTab);	
		
		ItemDuojiaoyutou = new ITemFood(3, 9F, false, "ItemDuojiaoyutou");
		ItemDuojiaoyutou.setUnlocalizedName("ItemDuojiaoyutou");
		ItemDuojiaoyutou.setTextureName("FoodCraft:ItemDuojiaoyutou");
		ItemDuojiaoyutou.setCreativeTab(FoodCraft.FcTab);	
		
		ItemDouban = new ItemKb();
		ItemDouban.setUnlocalizedName("ItemDouban");
		ItemDouban.setTextureName("FoodCraft:ItemDouban");
		ItemDouban.setCreativeTab(FoodCraft.FcTab);	
		
		ItemMapodoufufan = new ITemFood(3, 9F, false, "ItemMapodoufufan");
		ItemMapodoufufan.setUnlocalizedName("ItemMapodoufufan");
		ItemMapodoufufan.setTextureName("FoodCraft:ItemMapodoufufan");
		ItemMapodoufufan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemDianfen = new ItemKb();
		ItemDianfen.setUnlocalizedName("ItemDianfen");
		ItemDianfen.setTextureName("FoodCraft:ItemDianfen");
		ItemDianfen.setCreativeTab(FoodCraft.FcTab);	
		
		ItemHongshaoroufan = new ITemFood(3, 9F, false, "ItemHongshaoroufan");
		ItemHongshaoroufan.setUnlocalizedName("ItemHongshaoroufan");
		ItemHongshaoroufan.setTextureName("FoodCraft:ItemHongshaoroufan");
		ItemHongshaoroufan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemHuiguoroufan = new ITemFood(3, 9F, false, "ItemHuiguoroufan");
		ItemHuiguoroufan.setUnlocalizedName("ItemHuiguoroufan");
		ItemHuiguoroufan.setTextureName("FoodCraft:ItemHuiguoroufan");
		ItemHuiguoroufan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemXifan = new ITemFood(3, 4F, false, "ItemXifan");
		ItemXifan.setUnlocalizedName("ItemXifan");
		ItemXifan.setTextureName("FoodCraft:ItemXifan");
		ItemXifan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemDangeng = new ITemFood(3, 6F, false, "ItemDangeng");
		ItemDangeng.setUnlocalizedName("ItemDangeng");
		ItemDangeng.setTextureName("FoodCraft:ItemDangeng");
		ItemDangeng.setCreativeTab(FoodCraft.FcTab);	
		
		ItemMogudunjitang = new ITemFood(3, 6F, false, "ItemMogudunjitang");
		ItemMogudunjitang.setUnlocalizedName("ItemMogudunjitang");
		ItemMogudunjitang.setTextureName("FoodCraft:ItemMogudunjitang");
		ItemMogudunjitang.setCreativeTab(FoodCraft.FcTab);	
		
		ItemZongzi = new ITemFood(3, 6F, false, "ItemZongzi");
		ItemZongzi.setUnlocalizedName("ItemZongzi");
		ItemZongzi.setTextureName("FoodCraft:ItemZongzi");
		ItemZongzi.setCreativeTab(FoodCraft.FcTab);	
		
		ItemZongye = new ItemKb();
		ItemZongye.setUnlocalizedName("ItemZongye");
		ItemZongye.setTextureName("FoodCraft:ItemZongye");
		ItemZongye.setCreativeTab(FoodCraft.FcTab);	
		
		ItemCong = new ItemKb();
		ItemCong.setUnlocalizedName("ItemCong");
		ItemCong.setTextureName("FoodCraft:ItemCong");
		ItemCong.setCreativeTab(FoodCraft.FcTab);	
		
		ItemNuomifen = new ItemKb();
		ItemNuomifen.setUnlocalizedName("ItemNuomifen");
		ItemNuomifen.setTextureName("FoodCraft:ItemNuomifen");
		ItemNuomifen.setCreativeTab(FoodCraft.FcTab);	
		
		ItemNuomituan = new ItemKb();
		ItemNuomituan.setUnlocalizedName("ItemNuomituan");
		ItemNuomituan.setTextureName("FoodCraft:ItemNuomituan");
		ItemNuomituan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemHuashentangyuanxian = new ItemKb();
		ItemHuashentangyuanxian.setUnlocalizedName("ItemHuashentangyuanxian");
		ItemHuashentangyuanxian.setTextureName("FoodCraft:ItemHuashentangyuanxian");
		ItemHuashentangyuanxian.setCreativeTab(FoodCraft.FcTab);	
		
		ItemTangyuan = new ITemFood(3, 6F, false, "ItemTangyuan");
		ItemTangyuan.setUnlocalizedName("ItemTangyuan");
		ItemTangyuan.setTextureName("FoodCraft:ItemTangyuan");
		ItemTangyuan.setCreativeTab(FoodCraft.FcTab);	
		
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
		GameRegistry.registerItem(ItemCong, "ItemCong");	
		
		GameRegistry.registerItem(ItemPutao, "ItemPutao");	
		
		GameRegistry.registerItem(Itemfan, "Itemfan");
		GameRegistry.registerItem(ItemMianfen, "ItemMianfen");
		GameRegistry.registerItem(ItemYan, "ItemYan");
		GameRegistry.registerItem(ItemMianpi, "ItemMianpi");
		GameRegistry.registerItem(ItemNuomi, "ItemNuomi");
		GameRegistry.registerItem(ItemDouban, "ItemDouban");
		GameRegistry.registerItem(ItemQiaokeli, "ItemQiaokeli");
		GameRegistry.registerItem(ItemQiaokelifen, "ItemQiaokelifen");
		GameRegistry.registerItem(ItemJiaozixian, "ItemJiaozixian");
		GameRegistry.registerItem(ItemHuashenyou, "ItemHuashenyou");
		GameRegistry.registerItem(ItemBaifan, "ItemBaifan");
		GameRegistry.registerItem(ItemJitui, "ItemJitui");	
		GameRegistry.registerItem(ItemTudoupian, "ItemTudoupian");	
		GameRegistry.registerItem(ItemTudousi, "ItemTudousi");	
		GameRegistry.registerItem(ItemJiangyou, "ItemJiangyou");	
		GameRegistry.registerItem(ItemCu, "ItemCu");	
		GameRegistry.registerItem(ItemDianfen, "ItemDianfen");	
		GameRegistry.registerItem(ItemZongye, "ItemZongye");	
		GameRegistry.registerItem(ItemNuomifen, "ItemNuomifen");	
		GameRegistry.registerItem(ItemNuomituan, "ItemNuomituan");	
		GameRegistry.registerItem(ItemHuashentangyuanxian, "ItemHuashentangyuanxian");	
		
		GameRegistry.registerItem(ItemJianjidan, "ItemJianjidan");
		GameRegistry.registerItem(ItemDoujiang, "ItemDoujiang");
		GameRegistry.registerItem(ItemLaobing, "ItemLaobing");
		GameRegistry.registerItem(ItemJiaozi, "ItemJiaozi");
		GameRegistry.registerItem(ItemJianjiao, "ItemJianJiao");
		GameRegistry.registerItem(ItemDoufu, "ItemDoufu");
		GameRegistry.registerItem(ItemDoufugan, "ItemDoufugan");
		GameRegistry.registerItem(ItemChaotudoupian, "ItemChaotudoupian");
		GameRegistry.registerItem(ItemXifan, "ItemXifan");
		GameRegistry.registerItem(ItemZongzi, "ItemZongzi");
		GameRegistry.registerItem(ItemTangyuan, "ItemTangyuan");
		GameRegistry.registerItem(ItemDangeng, "ItemDangeng");
		GameRegistry.registerItem(ItemMogudunjitang, "ItemMogudunjitang");
		
		GameRegistry.registerItem(ItemFanqiechaojidanfan, "ItemFanqiechaojidanfan");
		GameRegistry.registerItem(ItemDisanxian, "ItemDisanxian");
		GameRegistry.registerItem(ItemYuxiangrousi, "ItemYuxiangrousi");
		GameRegistry.registerItem(ItemGongbaojiding, "ItemGongbaojiding");
		GameRegistry.registerItem(ItemChaotudousifan, "ItemChaotudousifan");
		GameRegistry.registerItem(ItemDuojiaoyutou, "ItemDuojiaoyutou");
		GameRegistry.registerItem(ItemMapodoufufan, "ItemMapodoufufan");
		GameRegistry.registerItem(ItemHongshaoroufan, "ItemHongshaoroufan");
		GameRegistry.registerItem(ItemHuiguoroufan, "ItemHuiguoroufan");
		
	}
}