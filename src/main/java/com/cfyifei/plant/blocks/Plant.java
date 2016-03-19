package com.cfyifei.plant.blocks;

import com.cfyifei.item.ModItem;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class Plant {
    public static Block FCleaves;
    public static Block BlockLishu, BlockLi;
    public static Block BlockLizhishu, BlockLizhi;
    public static Block BlockTaozishu, BlockTaozi;
    public static Block BlockJuzishu, BlockJuzi;
    public static Block BlockPipashu, BlockPipa;
    public static Block BlockMangguoshu, BlockMangguo;

    public static Block BlockNingmengshu, BlockNingmeng;
    public static Block BlockYouzishu, BlockYouzi;
    public static Block BlockShizishu, BlockShizi;
    public static Block BlockMuguashu, BlockMugua;
    public static Block BlockShanzhashu, BlockShanzha;
    public static Block BlockLongyanshu, BlockLongyan;
    public static Block BlockShiliushu, BlockShiliu;
    public static Block BlockHongzaoshu, BlockHongzao;
    public static Block BlockYezishu, BlockYezi;
    public static Block BlockYingtaoshu, BlockYingtao;
    public static Block BlockXiangjiaoshu, BlockXiangjiao;
    public static Block BlockBoluoshu, BlockBoluo;

    public static void init() {

        FCleaves = new BlockFruit("FCleaves", Item.getItemFromBlock(Blocks.sapling));
        FCleaves.setUnlocalizedName("FCleaves");

        BlockLi = new BlockFruit("BlockLi", ModItem.ItemLi);
        BlockLi.setUnlocalizedName("BlockLi");

        BlockLishu = new BlockTree(BlockLi, 0);
        BlockLishu.setUnlocalizedName("BlockLishu");
        BlockLishu.setHarvestLevel("pickaxe", -1);
        BlockLishu.setStepSound(Block.soundTypeGrass);

        BlockLizhi = new BlockFruit("BlockLizhi", ModItem.ItemLizhi);
        BlockLizhi.setUnlocalizedName("BlockLizhi");

        BlockLizhishu = new BlockTree(BlockLizhi, 1);
        BlockLizhishu.setUnlocalizedName("BlockLizhishu");
        BlockLizhishu.setHarvestLevel("pickaxe", -1);
        BlockLizhishu.setStepSound(Block.soundTypeGrass);

        BlockTaozi = new BlockFruit("BlockTaozi", ModItem.ItemTaozi);
        BlockTaozi.setUnlocalizedName("BlockTaozi");

        BlockTaozishu = new BlockTree(BlockTaozi, 2);
        BlockTaozishu.setUnlocalizedName("BlockTaozishu");
        BlockTaozishu.setHarvestLevel("pickaxe", -1);
        BlockTaozishu.setStepSound(Block.soundTypeGrass);

        BlockJuzi = new BlockFruit("BlockJuzi", ModItem.ItemJuzi);
        BlockJuzi.setUnlocalizedName("BlockJuzi");

        BlockJuzishu = new BlockTree(BlockJuzi, 3);
        BlockJuzishu.setUnlocalizedName("BlockJuzishu");
        BlockJuzishu.setHarvestLevel("pickaxe", -1);
        BlockJuzishu.setStepSound(Block.soundTypeGrass);

        BlockPipa = new BlockFruit("BlockPipa", ModItem.ItemPipa);
        BlockPipa.setUnlocalizedName("BlockPipa");

        BlockPipashu = new BlockTree(BlockPipa, 4);
        BlockPipashu.setUnlocalizedName("BlockPipashu");
        BlockPipashu.setHarvestLevel("pickaxe", -1);
        BlockPipashu.setStepSound(Block.soundTypeGrass);

        BlockMangguo = new BlockFruit("BlockMangguo", ModItem.ItemMangguo);
        BlockMangguo.setUnlocalizedName("BlockMangguo");

        BlockMangguoshu = new BlockTree(BlockMangguo, 5);
        BlockMangguoshu.setUnlocalizedName("BlockMangguoshu");
        BlockMangguoshu.setHarvestLevel("pickaxe", -1);
        BlockMangguoshu.setStepSound(Block.soundTypeGrass);
//********************************************************************************	


        BlockNingmeng = new BlockFruit("BlockNingmeng", ModItem.ItemNingmeng);
        BlockNingmeng.setUnlocalizedName("BlockNingmeng");

        BlockNingmengshu = new BlockTree(BlockNingmeng, 6);
        BlockNingmengshu.setUnlocalizedName("BlockNingmengshu");
        BlockNingmengshu.setHarvestLevel("pickaxe", -1);
        BlockNingmengshu.setStepSound(Block.soundTypeGrass);

        BlockYouzi = new BlockFruit("BlockYouzi", ModItem.ItemYouzi);
        BlockYouzi.setUnlocalizedName("BlockYouzi");

        BlockYouzishu = new BlockTree(BlockYouzi, 7);
        BlockYouzishu.setUnlocalizedName("BlockYouzishu");
        BlockYouzishu.setHarvestLevel("pickaxe", -1);
        BlockYouzishu.setStepSound(Block.soundTypeGrass);

        BlockShizi = new BlockFruit("BlockShizi", ModItem.ItemShizi);
        BlockShizi.setUnlocalizedName("BlockShizi");

        BlockShizishu = new BlockTree(BlockShizi, 8);
        BlockShizishu.setUnlocalizedName("BlockShizishu");
        BlockShizishu.setHarvestLevel("pickaxe", -1);
        BlockShizishu.setStepSound(Block.soundTypeGrass);

        BlockMugua = new BlockFruit("BlockMugua", ModItem.ItemMugua);
        BlockMugua.setUnlocalizedName("BlockMugua");

        BlockMuguashu = new BlockTree(BlockMugua, 9);
        BlockMuguashu.setUnlocalizedName("BlockMuguashu");
        BlockMuguashu.setHarvestLevel("pickaxe", -1);
        BlockMuguashu.setStepSound(Block.soundTypeGrass);

        BlockShanzha = new BlockFruit("BlockShanzha", ModItem.ItemShanzha);
        BlockShanzha.setUnlocalizedName("BlockShanzha");

        BlockShanzhashu = new BlockTree(BlockShanzha, 10);
        BlockShanzhashu.setUnlocalizedName("BlockShanzhashu");
        BlockShanzhashu.setHarvestLevel("pickaxe", -1);
        BlockShanzhashu.setStepSound(Block.soundTypeGrass);

        BlockLongyan = new BlockFruit("BlockLongyan", ModItem.ItemLongyan);
        BlockLongyan.setUnlocalizedName("BlockLongyan");

        BlockLongyanshu = new BlockTree(BlockLongyan, 11);
        BlockLongyanshu.setUnlocalizedName("BlockLongyanshu");
        BlockLongyanshu.setHarvestLevel("pickaxe", -1);
        BlockLongyanshu.setStepSound(Block.soundTypeGrass);

        BlockShiliu = new BlockFruit("BlockShiliu", ModItem.ItemShiliu);
        BlockShiliu.setUnlocalizedName("BlockShiliu");

        BlockShiliushu = new BlockTree(BlockShiliu, 12);
        BlockShiliushu.setUnlocalizedName("BlockShiliushu");
        BlockShiliushu.setHarvestLevel("pickaxe", -1);
        BlockShiliushu.setStepSound(Block.soundTypeGrass);

        BlockHongzao = new BlockFruit("BlockHongzao", ModItem.ItemHongzao);
        BlockHongzao.setUnlocalizedName("BlockHongzao");

        BlockHongzaoshu = new BlockTree(BlockHongzao, 13);
        BlockHongzaoshu.setUnlocalizedName("BlockHongzaoshu");
        BlockHongzaoshu.setHarvestLevel("pickaxe", -1);
        BlockHongzaoshu.setStepSound(Block.soundTypeGrass);

        BlockYezi = new BlockCoconut("BlockYezi", ModItem.ItemYezi);
        BlockYezi.setUnlocalizedName("BlockYezi");

        BlockYezishu = new TreeCoconut(BlockYezi);
        BlockYezishu.setUnlocalizedName("BlockYezishu");
        BlockYezishu.setHarvestLevel("pickaxe", -1);
        BlockYezishu.setStepSound(Block.soundTypeGrass);

        BlockYingtao = new BlockFruit("BlockYingtao", ModItem.ItemYingtao);
        BlockYingtao.setUnlocalizedName("BlockYingtao");

        BlockYingtaoshu = new BlockTree(BlockYingtao, 14);
        BlockYingtaoshu.setUnlocalizedName("BlockYingtaoshu");
        BlockYingtaoshu.setHarvestLevel("pickaxe", -1);
        BlockYingtaoshu.setStepSound(Block.soundTypeGrass);

        BlockXiangjiao = new BlockBannana("BlockXiangjiao", ModItem.ItemXiangjiao);
        BlockXiangjiao.setUnlocalizedName("BlockXiangjiao");

        BlockXiangjiaoshu = new TreeBannana(BlockXiangjiao);
        BlockXiangjiaoshu.setUnlocalizedName("BlockXiangjiaoshu");
        BlockXiangjiaoshu.setHarvestLevel("pickaxe", -1);
        BlockXiangjiaoshu.setStepSound(Block.soundTypeGrass);


        GameRegistry.registerBlock(FCleaves, "FCleaves");
        GameRegistry.registerBlock(BlockLishu, "BlockLishu");
        GameRegistry.registerBlock(BlockLi, "BlockLi");
        GameRegistry.registerBlock(BlockLizhishu, "BlockLizhishu");
        GameRegistry.registerBlock(BlockLizhi, "BlockLizhi");
        GameRegistry.registerBlock(BlockTaozishu, "BlockTaozishu");
        GameRegistry.registerBlock(BlockTaozi, "BlockTaozi");
        GameRegistry.registerBlock(BlockJuzishu, "BlockJuzishu");
        GameRegistry.registerBlock(BlockJuzi, "BlockJuzi");
        GameRegistry.registerBlock(BlockPipashu, "BlockPipashu");
        GameRegistry.registerBlock(BlockPipa, "BlockPipa");
        GameRegistry.registerBlock(BlockMangguoshu, "BlockMangguoshu");
        GameRegistry.registerBlock(BlockMangguo, "BlockMangguo");
        GameRegistry.registerBlock(BlockNingmengshu, "BlockNingmengshu");
        GameRegistry.registerBlock(BlockNingmeng, "BlockNingmeng");
        GameRegistry.registerBlock(BlockYouzishu, "BlockYouzishu");
        GameRegistry.registerBlock(BlockYouzi, "BlockYouzi");
        GameRegistry.registerBlock(BlockShizishu, "BlockShizishu");
        GameRegistry.registerBlock(BlockShizi, "BlockShizi");
        GameRegistry.registerBlock(BlockMuguashu, "BlockMuguashu");
        GameRegistry.registerBlock(BlockMugua, "BlockMugua");
        GameRegistry.registerBlock(BlockShanzhashu, "BlockShanzhashu");
        GameRegistry.registerBlock(BlockShanzha, "BlockShanzha");
        GameRegistry.registerBlock(BlockLongyanshu, "BlockLongyanshu");
        GameRegistry.registerBlock(BlockLongyan, "BlockLongyan");
        GameRegistry.registerBlock(BlockShiliushu, "BlockShiliushu");
        GameRegistry.registerBlock(BlockShiliu, "BlockShiliu");
        GameRegistry.registerBlock(BlockHongzaoshu, "BlockHongzaoshu");
        GameRegistry.registerBlock(BlockHongzao, "BlockHongzao");
        GameRegistry.registerBlock(BlockYezishu, "BlockYezishu");
        GameRegistry.registerBlock(BlockYezi, "BlockYezi");
        GameRegistry.registerBlock(BlockYingtaoshu, "BlockYingtaoshu");
        GameRegistry.registerBlock(BlockYingtao, "BlockYingtao");
        GameRegistry.registerBlock(BlockXiangjiaoshu, "BlockXiangjiaoshu");
        GameRegistry.registerBlock(BlockXiangjiao, "BlockXiangjiao");
    }
}
