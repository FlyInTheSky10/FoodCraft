package com.cfyifei.plant.blocks;

import com.cfyifei.item.FoodcraftItems;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FoodcraftPlants {
	
	public static Block FCleaves;
	public static Block BlockLishu,BlockLi;
	public static Block BlockLizhishu,BlockLizhi;
	public static Block BlockTaozishu,BlockTaozi;
	public static Block BlockJuzishu,BlockJuzi;
	public static Block BlockPipashu,BlockPipa;
	public static Block BlockMangguoshu,BlockMangguo;
	public static Block BlockNingmengshu,BlockNingmeng;
	public static Block BlockYouzishu,BlockYouzi;
	public static Block BlockShizishu,BlockShizi;
	public static Block BlockMuguashu,BlockMugua;
	public static Block BlockShanzhashu,BlockShanzha;
	public static Block BlockLongyanshu,BlockLongyan;
	public static Block BlockShiliushu,BlockShiliu;
	public static Block BlockHongzaoshu,BlockHongzao;
	public static Block BlockYezishu,BlockYezi;	
	public static Block BlockYingtaoshu,BlockYingtao;
	public static Block BlockXiangjiaoshu,BlockXiangjiao;
	
	public static void init() {
		
	FCleaves = new BlockFruit("FCleaves",Item.getItemFromBlock(Blocks.sapling));
	
	BlockLi = new BlockFruit("BlockLi",FoodcraftItems.ItemLi);
	
	BlockLishu = new BlockTree(BlockLi,"BlockLishu");
	BlockLishu.setHarvestLevel("pickaxe", -1);
	BlockLishu.setStepSound(Block.soundTypeGrass);
	
	BlockLizhi = new BlockFruit("BlockLizhi",FoodcraftItems.ItemLizhi);
	
	BlockLizhishu = new BlockTree(BlockLizhi,"BlockLizhishu");
	BlockLizhishu.setHarvestLevel("pickaxe", -1);
	BlockLizhishu.setStepSound(Block.soundTypeGrass);
	
	BlockTaozi = new BlockFruit("BlockTaozi",FoodcraftItems.ItemTaozi);
	
	BlockTaozishu = new BlockTree(BlockTaozi,"BlockTaozishu");
	BlockTaozishu.setHarvestLevel("pickaxe", -1);
	BlockTaozishu.setStepSound(Block.soundTypeGrass);
	
	BlockJuzi = new BlockFruit("BlockJuzi",FoodcraftItems.ItemJuzi);
	
	BlockJuzishu = new BlockTree(BlockJuzi,"BlockJuzishu");
	BlockJuzishu.setHarvestLevel("pickaxe", -1);
	BlockJuzishu.setStepSound(Block.soundTypeGrass);
	
	BlockPipa = new BlockFruit("BlockPipa",FoodcraftItems.ItemPipa);
	
	BlockPipashu = new BlockTree(BlockPipa, "BlockPipashu");
	BlockPipashu.setHarvestLevel("pickaxe", -1);
	BlockPipashu.setStepSound(Block.soundTypeGrass);

	BlockMangguo = new BlockFruit("BlockMangguo",FoodcraftItems.ItemMangguo);
	
	BlockMangguoshu = new BlockTree(BlockMangguo,"BlockMangguoshu");
	BlockMangguoshu.setHarvestLevel("pickaxe", -1);
	BlockMangguoshu.setStepSound(Block.soundTypeGrass);

	BlockNingmeng = new BlockFruit("BlockNingmeng",FoodcraftItems.ItemNingmeng);
	
	BlockNingmengshu = new BlockTree(BlockNingmeng,"BlockNingmengshu");
	BlockNingmengshu.setHarvestLevel("pickaxe", -1);
	BlockNingmengshu.setStepSound(Block.soundTypeGrass);
	
	BlockYouzi = new BlockFruit("BlockYouzi",FoodcraftItems.ItemYouzi);
	
	BlockYouzishu = new BlockTree(BlockYouzi, "BlockYouzishu");
	BlockYouzishu.setHarvestLevel("pickaxe", -1);
	BlockYouzishu.setStepSound(Block.soundTypeGrass);
	
	BlockShizi = new BlockFruit("BlockShizi",FoodcraftItems.ItemShizi);
	
	BlockShizishu = new BlockTree(BlockShizi, "BlockShizishu");
	BlockShizishu.setHarvestLevel("pickaxe", -1);
	BlockShizishu.setStepSound(Block.soundTypeGrass);
	
	BlockMugua = new BlockFruit("BlockMugua",FoodcraftItems.ItemMugua);
	
	BlockMuguashu = new BlockTree(BlockMugua, "BlockMuguashu");
	BlockMuguashu.setHarvestLevel("pickaxe", -1);
	BlockMuguashu.setStepSound(Block.soundTypeGrass);
	
	BlockShanzha = new BlockFruit("BlockShanzha",FoodcraftItems.ItemShanzha);
	
	BlockShanzhashu = new BlockTree(BlockShanzha, "BlockShanzhashu");
	BlockShanzhashu.setHarvestLevel("pickaxe", -1);
	BlockShanzhashu.setStepSound(Block.soundTypeGrass);
	
	BlockLongyan = new BlockFruit("BlockLongyan",FoodcraftItems.ItemLongyan);
	
	BlockLongyanshu = new BlockTree(BlockLongyan, "BlockLongyanshu");
	BlockLongyanshu.setHarvestLevel("pickaxe", -1);
	BlockLongyanshu.setStepSound(Block.soundTypeGrass);
	
	BlockShiliu = new BlockFruit("BlockShiliu",FoodcraftItems.ItemShiliu);
	
	BlockShiliushu = new BlockTree(BlockShiliu, "BlockShiliushu");
	BlockShiliushu.setHarvestLevel("pickaxe", -1);
	BlockShiliushu.setStepSound(Block.soundTypeGrass);
	
	BlockHongzao = new BlockFruit("BlockHongzao",FoodcraftItems.ItemHongzao);
	
	BlockHongzaoshu = new BlockTree(BlockHongzao, "BlockHongzaoshu");
	BlockHongzaoshu.setHarvestLevel("pickaxe", -1);
	BlockHongzaoshu.setStepSound(Block.soundTypeGrass);
	
	BlockYezi = new BlockCoconut("BlockYezi",FoodcraftItems.ItemYezi);
	
	BlockYezishu = new TreeCoconut(BlockYezi);
	BlockYezishu.setHarvestLevel("pickaxe", -1);
	BlockYezishu.setStepSound(Block.soundTypeGrass);
	BlockYezishu.setUnlocalizedName("BlockYezishu");
	
	BlockYingtao = new BlockFruit("BlockYingtao",FoodcraftItems.ItemYingtao);
	
	BlockYingtaoshu = new BlockTree(BlockYingtao, "BlockYingtaoshu");
	BlockYingtaoshu.setHarvestLevel("pickaxe", -1);
	BlockYingtaoshu.setStepSound(Block.soundTypeGrass);
	
	BlockXiangjiao = new BlockBannana("BlockXiangjiao",FoodcraftItems.ItemXiangjiao);
	
	BlockXiangjiaoshu = new TreeBannana(BlockXiangjiao);
	BlockXiangjiaoshu.setHarvestLevel("pickaxe", -1);
	BlockXiangjiaoshu.setStepSound(Block.soundTypeGrass);
	BlockXiangjiaoshu.setUnlocalizedName("BlockXiangjiaoshu");
	
	
	GameRegistry.registerBlock(FCleaves,"FCleaves");
	GameRegistry.registerBlock(BlockLishu,"BlockLishu");
	GameRegistry.registerBlock(BlockLi,"BlockLi");
	GameRegistry.registerBlock(BlockLizhishu,"BlockLizhishu");
	GameRegistry.registerBlock(BlockLizhi,"BlockLizhi");
	GameRegistry.registerBlock(BlockTaozishu,"BlockTaozishu");
	GameRegistry.registerBlock(BlockTaozi,"BlockTaozi");
	GameRegistry.registerBlock(BlockJuzishu,"BlockJuzishu");
	GameRegistry.registerBlock(BlockJuzi,"BlockJuzi");
	GameRegistry.registerBlock(BlockPipashu,"BlockPipashu");
	GameRegistry.registerBlock(BlockPipa,"BlockPipa");
	GameRegistry.registerBlock(BlockMangguoshu,"BlockMangguoshu");
	GameRegistry.registerBlock(BlockMangguo,"BlockMangguo");
	GameRegistry.registerBlock(BlockNingmengshu,"BlockNingmengshu");
	GameRegistry.registerBlock(BlockNingmeng,"BlockNingmeng");	
	GameRegistry.registerBlock(BlockYouzishu,"BlockYouzishu");
	GameRegistry.registerBlock(BlockYouzi,"BlockYouzi");	
	GameRegistry.registerBlock(BlockShizishu,"BlockShizishu");
	GameRegistry.registerBlock(BlockShizi,"BlockShizi");	
	GameRegistry.registerBlock(BlockMuguashu,"BlockMuguashu");
	GameRegistry.registerBlock(BlockMugua,"BlockMugua");	
	GameRegistry.registerBlock(BlockShanzhashu,"BlockShanzhashu");
	GameRegistry.registerBlock(BlockShanzha,"BlockShanzha");	
	GameRegistry.registerBlock(BlockLongyanshu,"BlockLongyanshu");
	GameRegistry.registerBlock(BlockLongyan,"BlockLongyan");	
	GameRegistry.registerBlock(BlockShiliushu,"BlockShiliushu");
	GameRegistry.registerBlock(BlockShiliu,"BlockShiliu");
	GameRegistry.registerBlock(BlockHongzaoshu,"BlockHongzaoshu");
	GameRegistry.registerBlock(BlockHongzao,"BlockHongzao");
	GameRegistry.registerBlock(BlockYezishu,"BlockYezishu");
	GameRegistry.registerBlock(BlockYezi,"BlockYezi");
	GameRegistry.registerBlock(BlockYingtaoshu,"BlockYingtaoshu");
	GameRegistry.registerBlock(BlockYingtao,"BlockYingtao");
	GameRegistry.registerBlock(BlockXiangjiaoshu,"BlockXiangjiaoshu");
	GameRegistry.registerBlock(BlockXiangjiao,"BlockXiangjiao");
	}
}
