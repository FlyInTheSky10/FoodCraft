package com.cfyifei.recipe;


import com.cfyifei.RemoveRecipe;
import com.cfyifei.block.ModBlocks;
import com.cfyifei.gui.blocks.ModGui;
import com.cfyifei.item.ModItem;


import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipe{
	public static void init() {
		Items.egg.setMaxStackSize(64);
		Items.snowball.setMaxStackSize(64);

	GameRegistry.addRecipe(new ItemStack(ModItem.ItemTiepian, 16), new Object[] {"###", "#X#","###", '#',Items.iron_ingot,'X',Blocks.stone});	
	GameRegistry.addRecipe(new ItemStack(ModItem.ItemCaidao, 2), new Object[] {"## ", "## ","X  ", '#',ModItem.ItemTiepian,'X',Items.stick});
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
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemNuomi,2), new Object[] {ModItem.ItemNuomi,Items.bone});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemDouban,2), new Object[] {ModItem.ItemDouban,Items.bone});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemDoufugan), new Object[] {ModItem.ItemDoufu,ModItem.ItemJiangyou});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemDoufu), new Object[] {ModItem.ItemDoujiang,ModItem.ItemYan});

	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemChunjuan), new Object[] {ModItem.ItemDoufusi,ModItem.ItemLuobosi,ModItem.ItemShucai,Items.cooked_porkchop});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.Itemwater), new Object[] {Items.water_bucket});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemAeljichifan), new Object[] {ModItem.ItemAeljichi,ModItem.Itemfan});
	
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemZongzi), new Object[] {ModItem.ItemNuomi,Items.cooked_porkchop,Items.string,ModItem.ItemZongye});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemNuomituan), new Object[] {ModItem.ItemNuomifen,ModItem.ItemNuomifen,ModItem.ItemNuomifen,ModItem.Itemwater});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemHuashentangyuanxian,1), new Object[] {ModItem.ItemHuashen,Items.sugar});
	
	GameRegistry.addRecipe(new ItemStack(ModGui.Nmj, 1), new Object[] {"AAA", "DBD", "ECE", 'A', Items.wheat,'B',ModBlocks.BlockWaike,'C',ModItem.ItemDianluban,'E',Items.milk_bucket,'D',Blocks.glass});
	GameRegistry.addRecipe(new ItemStack(ModGui.PDG, 1), new Object[] {"AAA", "EBE", " C ", 'A', ModItem.ItemTiepian,'B',ModBlocks.BlockWaike,'C',ModItem.ItemDianluban,'E',new ItemStack(Items.dye)});
	GameRegistry.addRecipe(new ItemStack(ModGui.Guo, 1), new Object[] {"AAA", "EBE", " C ", 'A', Items.iron_ingot,'B',ModBlocks.BlockWaike,'C',ModItem.ItemDianluban,'E',new ItemStack(Items.dye)});
	GameRegistry.addRecipe(new ItemStack(ModGui.Gyg, 1), new Object[] {"AAA", "EBE", "XCX", 'A', Items.iron_ingot,'B',ModBlocks.BlockWaike,'C',ModItem.ItemDianluban,'E',new ItemStack(Items.dye),'X',new ItemStack(Items.dye,1,15)});
	GameRegistry.addRecipe(new ItemStack(ModGui.Caiban, 1), new Object[] {"AAA", "ABA", "AAA", 'A', Blocks.planks,'B',ModItem.ItemCaidao});
	GameRegistry.addRecipe(new ItemStack(ModGui.YZJ, 1), new Object[] {"AAA", "DBD", "CCC", 'A', ModItem.ItemHuashenyou,'B',ModBlocks.BlockWaike,'C',ModItem.ItemDianluban,'D',Blocks.glass});
	
	GameRegistry.addSmelting(new ItemStack(ModItem.Itemwater), new ItemStack(ModItem.ItemYan, 2), 1f);
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemMianpi, 2), new Object[] {ModItem.ItemMianfen,ModItem.ItemMianfen,ModItem.ItemMianfen,ModItem.Itemwater});
	
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemJiaozi), new Object[] {ModItem.ItemJiaozixian,ModItem.ItemMianpi});
	
	
	GameRegistry.addRecipe(new ItemStack(ModBlocks.Blocksugar, 1), new Object[] {"AAA", "AAA", "AAA", 'A', Items.sugar});
	GameRegistry.addShapelessRecipe(new ItemStack(Items.sugar,9), new Object[] {ModBlocks.Blocksugar});
	
	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockDami, 1), new Object[] {"AAA", "AAA", "AAA", 'A', ModItem.ItemDami});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemDami,9), new Object[] {ModBlocks.BlockDami});
	
	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockHuashenk, 1), new Object[] {"AAA", "AAA", "AAA", 'A', ModItem.ItemHuashen});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemHuashen,9), new Object[] {ModBlocks.BlockHuashenk});
	
	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockLuobo, 1), new Object[] {"AAA", "AAA", "AAA", 'A', Items.carrot});
	GameRegistry.addShapelessRecipe(new ItemStack(Items.carrot,9), new Object[] {ModBlocks.BlockLuobo});
	
	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockTudou, 1), new Object[] {"AAA", "AAA", "AAA", 'A', Items.potato});
	GameRegistry.addShapelessRecipe(new ItemStack(Items.potato,9), new Object[] {ModBlocks.BlockTudou});
	
	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockYan, 1), new Object[] {"AAA", "AAA", "AAA", 'A', ModItem.ItemYan});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemYan,9), new Object[] {ModBlocks.BlockYan});
	
	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockDouzik, 1), new Object[] {"AAA", "AAA", "AAA", 'A', ModItem.ItemDouzi});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemDouzi,9), new Object[] {ModBlocks.BlockDouzik});
	
	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockRuomi, 1), new Object[] {"AAA", "AAA", "AAA", 'A', ModItem.ItemNuomi});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemNuomi,9), new Object[] {ModBlocks.BlockRuomi});

	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockDouban, 1), new Object[] {"AAA", "AAA", "AAA", 'A', ModItem.ItemDouban});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemDouban,9), new Object[] {ModBlocks.BlockDouban});
	
	GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockQiaokeli, 1), new Object[] {"AAA", "AAA", "AAA", 'A', ModItem.ItemQiaokeli});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItem.ItemQiaokeli,9), new Object[] {ModBlocks.BlockQiaokeli});
	registerChestLoot(new ItemStack(ModItem.ItemNuomi), 1, 1, 16);
	registerChestLoot(new ItemStack(ModItem.ItemDouban), 1, 1, 16);
	registerChestLoot(new ItemStack(ModItem.ItemCong), 1, 1, 16);
	registerChestLoot(new ItemStack(ModItem.ItemZongye), 1, 10, 64);
	}
    public static void registerChestLoot(ItemStack loot, int min, int max, int rarity)
    {
        ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST,
                new WeightedRandomChestContent(loot, min, max, rarity));
        ChestGenHooks.addItem(ChestGenHooks.MINESHAFT_CORRIDOR,
                new WeightedRandomChestContent(loot, min, max, rarity));
        ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_CORRIDOR,
                new WeightedRandomChestContent(loot, min, max, rarity));
        ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_CROSSING,
                new WeightedRandomChestContent(loot, min, max, rarity));
        ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_LIBRARY,
                new WeightedRandomChestContent(loot, min, max, rarity));
        ChestGenHooks.addItem(ChestGenHooks.PYRAMID_JUNGLE_CHEST,
                new WeightedRandomChestContent(loot, min, max, rarity));
    }
}
