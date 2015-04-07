package com.cfyifei.recipe;

import com.cfyifei.RemoveRecipe;
import com.cfyifei.block.ModBlocks;
import com.cfyifei.gui.blocks.ModGui;
import com.cfyifei.item.ModItem;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipe {
	public static void init() {
		Items.egg.setMaxStackSize(64);
		Items.snowball.setMaxStackSize(64);
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemTiepian, 16), new Object[] {"###", "#X#","###", '#',Items.iron_ingot,'X',Blocks.stone});	
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemCaidao, 8), new Object[] {"## ", "## ","X  ", '#',ModItem.ItemTiepian,'X',Items.stick});
	RemoveRecipe.removeAnyRecipe(new ItemStack(Items.cake));
	RemoveRecipe.removeAnyRecipe(new ItemStack(Items.bread));
	GameRegistry.addRecipe(new ItemStack(Items.cake, 1), new Object[] {"AAA", "BEB", "CCC", 'A', Items.milk_bucket, 'B', Items.sugar, 'C', ModItem.ItemMianfen, 'E', Items.egg});
	GameRegistry.addRecipe(new ItemStack(Items.bread, 1), new Object[] {"AAA", "   ", "   ", 'A', ModItem.ItemMianfen});
	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockWaike, 1), new Object[] {"AAA", "ABA", "AAA", 'A', ModItem.ItemHuashen,'B',Blocks.iron_block});
	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockWaike, 1), new Object[] {"AAA", "ABA", "AAA", 'A', ModItem.ItemDouzi,'B',Blocks.iron_block});
	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockWaike, 1), new Object[] {"AAA", "ABA", "AAA", 'A', ModItem.ItemDami,'B',Blocks.iron_block});
	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockWaike, 1), new Object[] {"AAA", "ABA", "AAA", 'A', Items.wheat,'B',Blocks.iron_block});
	
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemDianluban, 1), new Object[] {"AAA", "CBC", "AAA", 'A', ModItem.ItemHuashen,'B',Items.iron_ingot,'C',Items.redstone});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemDianluban, 1), new Object[] {"AAA", "CBC", "AAA", 'A', ModItem.ItemDouzi,'B',Items.iron_ingot,'C',Items.redstone});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemDianluban, 1), new Object[] {"AAA", "CBC", "AAA", 'A', ModItem.ItemDami,'B',Items.iron_ingot,'C',Items.redstone});
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemDianluban, 1), new Object[] {"AAA", "CBC", "AAA", 'A', Items.wheat,'B',Items.iron_ingot,'C',Items.redstone});
	
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.Itemwater), new Object[] {Items.water_bucket});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemQiaokeli), new Object[] {ModItem.ItemQiaokelifen,Items.sugar});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemJiangyou), new Object[] {ModItem.ItemDouzi,ModItem.ItemDouzi,ModItem.ItemDouzi,ModItem.ItemMianfen,ModItem.ItemMianfen,ModItem.ItemMianfen,ModItem.ItemYan,ModItem.ItemYan,Items.glass_bottle});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemNuomi,2), new Object[] {ModItem.Itemfan,ModItem.ItemMianfen,ModItem.Itemwater});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemDoufugan), new Object[] {ModItem.ItemDoufu,ModItem.ItemJiangyou});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemDoufu), new Object[] {ModItem.ItemDoujiang,ModItem.ItemYan});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemCu), new Object[] {ModItem.ItemDouzi,ModItem.ItemDouzi,ModItem.ItemDouzi,Items.sugar,Items.sugar,Items.sugar,Items.glass_bottle});
	
	GameRegistry.addRecipe(new ItemStack(ModGui.Nmj, 1), new Object[] {"AAA", "DBD", "ECE", 'A', Items.wheat,'B',ModBlocks.BlockWaike,'C',ModItem.ItemDianluban,'E',Items.milk_bucket,'D',Blocks.glass});
	GameRegistry.addRecipe(new ItemStack(ModGui.PDG, 1), new Object[] {"AAA", "EBE", " C ", 'A', ModItem.ItemTiepian,'B',ModBlocks.BlockWaike,'C',ModItem.ItemDianluban,'E',new ItemStack(Items.dye)});
	GameRegistry.addSmelting(new ItemStack(ModItem.Itemwater), new ItemStack(ModItem.ItemYan, 2), 1f);
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemMianpi, 2), new Object[] {ModItem.ItemMianfen,ModItem.ItemMianfen,ModItem.ItemMianfen,ModItem.Itemwater});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemJiaozixian, 2), new Object[] {ModItem.ItemCaidao,Items.cooked_porkchop,ModItem.ItemShucai});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemJiaozi), new Object[] {ModItem.ItemJiaozixian,ModItem.ItemMianpi});
	}
}
