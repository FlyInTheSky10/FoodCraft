package com.cfyifei.block;

import com.cfyifei.FoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {


    public static Block BlockShuidao, BlockDouzi, BlockHuashen, BlockWaike, BlockLuhuo, BlockShucai, BlockFanqie, BlockLajiao;
    public static Block BlockPutao;
    public static Block BlockQiezi;
    public static Block Blocksugar, BlockDami, BlockHuashenk, BlockLuobo,
            BlockTudou, BlockYan, BlockDouzik, BlockRuomi, BlockDouban, BlockQiaokeli, BlockCong;
    public static Block BlockNuodao;

    public static Block BlockBailuobo;
    public static Block BlockQingjiao;
    public static Block BlockHongdou;
    public static Block BlockLvdou;
    public static Block BlockHongshu;
    public static Block BlockYumi;
    public static Block BlockHuanggua;
    public static Block BlockCaomei;

    public static Block BlockPutaoDG;
    public static Block BlockJinputaoDG;
    public static Block BlockLiDG;
    public static Block BlockTaoziDG;
    public static Block BlockJuziDG;
    public static Block BlockNingmengDG;
    public static Block BlockCaomeiDG;
    public static Block BlockYeziDG;

    public static void init() {


        BlockYumi = new BlockYumi();
        BlockYumi.setUnlocalizedName("BlockYumi");
        BlockYumi.setHarvestLevel("pickaxe", -1);
        BlockYumi.setStepSound(Block.soundTypeGrass);

        BlockHuanggua = new BlockHuanggua();
        BlockHuanggua.setUnlocalizedName("BlockHuanggua");
        BlockHuanggua.setHarvestLevel("pickaxe", -1);
        BlockHuanggua.setStepSound(Block.soundTypeGrass);

        BlockBailuobo = new BlockBailuobo();
        BlockBailuobo.setUnlocalizedName("BlockBailuobo");
        BlockBailuobo.setHarvestLevel("pickaxe", -1);
        BlockBailuobo.setStepSound(Block.soundTypeGrass);

        BlockQingjiao = new BlockQingjiao();
        
        BlockQingjiao.setUnlocalizedName("BlockQingjiao");
        BlockQingjiao.setHarvestLevel("pickaxe", -1);
        BlockQingjiao.setStepSound(Block.soundTypeGrass);

        BlockHongdou = new BlockHongdou();
        BlockHongdou.setUnlocalizedName("BlockHongdou");
        BlockHongdou.setHarvestLevel("pickaxe", -1);
        BlockHongdou.setStepSound(Block.soundTypeGrass);

        BlockLvdou = new BlockLvdou();
        BlockLvdou.setUnlocalizedName("BlockLvdou");
        BlockLvdou.setHarvestLevel("pickaxe", -1);
        BlockLvdou.setStepSound(Block.soundTypeGrass);

        BlockCaomei = new BlockCaomei();
        BlockCaomei.setUnlocalizedName("BlockCaomei");
        BlockCaomei.setHarvestLevel("pickaxe", -1);
        BlockCaomei.setStepSound(Block.soundTypeGrass);

        BlockHongshu = new BlockHongshu();
        BlockHongshu.setUnlocalizedName("BlockHongshu");
        BlockHongshu.setHarvestLevel("pickaxe", -1);
        BlockHongshu.setStepSound(Block.soundTypeGrass);

        BlockNuodao = new BlockNuodao();
        BlockNuodao.setUnlocalizedName("BlockNuodao");
        BlockNuodao.setHarvestLevel("pickaxe", -1);
        BlockNuodao.setStepSound(Block.soundTypeGrass);

        BlockShuidao = new BlockShuiDao();
        BlockShuidao.setUnlocalizedName("BlockShuidao");
        BlockShuidao.setHarvestLevel("pickaxe", -1);
        BlockShuidao.setStepSound(Block.soundTypeGrass);

        BlockDouzi = new BlockDouzi();
        BlockDouzi.setUnlocalizedName("BlockDouzi");
        BlockDouzi.setHarvestLevel("pickaxe", -1);
        BlockDouzi.setStepSound(Block.soundTypeGrass);

        BlockHuashen = new BlockHuashen();
        BlockHuashen.setUnlocalizedName("BlockHuashen");
        BlockHuashen.setHarvestLevel("pickaxe", -1);
        BlockHuashen.setStepSound(Block.soundTypeGrass);

        BlockShucai = new BlockShucai();
        BlockShucai.setUnlocalizedName("BlockShucai");
        BlockShucai.setHarvestLevel("pickaxe", -1);
        BlockShucai.setStepSound(Block.soundTypeGrass);

        BlockLajiao = new BlockLajiao();
        BlockLajiao.setUnlocalizedName("BlockLajiao");
        BlockLajiao.setHarvestLevel("pickaxe", -1);
        BlockLajiao.setStepSound(Block.soundTypeGrass);

        BlockFanqie = new BlockFanqie();
        BlockFanqie.setUnlocalizedName("BlockFanqie");
        BlockFanqie.setHarvestLevel("pickaxe", -1);
        BlockFanqie.setStepSound(Block.soundTypeGrass);

        BlockWaike = new BlockKB(Material.rock);
        BlockWaike.setUnlocalizedName("BlockWaike");
        BlockWaike.setHarvestLevel("pickaxe", 1);
        BlockWaike.setCreativeTab(FoodCraft.FcTabJiqi);
        BlockWaike.setTextureName("foodcraft:nmj_side");
        BlockWaike.setStepSound(Block.soundTypeStone);

        BlockQiezi = new BlockQiezi();
        BlockQiezi.setUnlocalizedName("BlockQiezi");
        BlockQiezi.setHarvestLevel("pickaxe", -1);
        BlockQiezi.setStepSound(Block.soundTypeGrass);

        BlockPutao = new BlockPutao();
        BlockPutao.setUnlocalizedName("BlockPutao");
        BlockPutao.setHarvestLevel("pickaxe", -1);
        BlockPutao.setStepSound(Block.soundTypeGrass);

        BlockCong = new BlockCong();
        BlockCong.setHardness(0.0F).setStepSound(Block.soundTypeGrass).setUnlocalizedName("BlockCong");
        BlockCong.setTextureName("FoodCraft:BlockCong");

        Blocksugar = new BlockKB(Material.grass).setUnlocalizedName("Blocksugar").setTextureName("FoodCraft:blocksugar")
                .setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTabJiqi);

        BlockDami = new BlockKB(Material.grass).setUnlocalizedName("BlockDami").setTextureName("FoodCraft:blockdami")
                .setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTabJiqi);

        BlockHuashenk = new BlockKB(Material.grass).setUnlocalizedName("BlockHuashenk").setTextureName("FoodCraft:blockhuashenk")
                .setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTabJiqi);

        BlockLuobo = new BlockKB(Material.grass).setUnlocalizedName("BlockLuobo").setTextureName("FoodCraft:blockluobo")
                .setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTabJiqi);

        BlockTudou = new BlockKB(Material.grass).setUnlocalizedName("BlockTudou").setTextureName("FoodCraft:blocktudou")
                .setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTabJiqi);

        BlockYan = new BlockKB(Material.grass).setUnlocalizedName("BlockYan").setTextureName("FoodCraft:blockyan")
                .setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTabJiqi);

        BlockDouzik = new BlockKB(Material.grass).setUnlocalizedName("BlockDouzik").setTextureName("FoodCraft:blockdouzik")
                .setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTabJiqi);

        BlockRuomi = new BlockKB(Material.grass).setUnlocalizedName("BlockRuomi").setTextureName("FoodCraft:blockruomi")
                .setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTabJiqi);

        BlockDouban = new BlockKB(Material.grass).setUnlocalizedName("BlockDouban").setTextureName("FoodCraft:blockdouban")
                .setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTabJiqi);

        BlockQiaokeli = new BlockKB(Material.grass).setUnlocalizedName("BlockQiaokeli").setTextureName("FoodCraft:blockqiaokeli")
                .setHardness(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(FoodCraft.FcTabJiqi);


        BlockPutaoDG = new BlockDangao().setHardness(0.5F).setStepSound(Block.soundTypeCloth).setUnlocalizedName("BlockPutaoDG").setTextureName("FoodCraft:BlockPutaoDG");

        BlockJinputaoDG = new BlockJinputaoDG().setHardness(0.5F).setStepSound(Block.soundTypeCloth).setUnlocalizedName("BlockJinputaoDG").setTextureName("FoodCraft:BlockJinputaoDG");
        BlockLiDG = new BlockDangao().setHardness(0.5F).setStepSound(Block.soundTypeCloth).setUnlocalizedName("BlockLiDG").setTextureName("FoodCraft:BlockLiDG");
        BlockTaoziDG = new BlockDangao().setHardness(0.5F).setStepSound(Block.soundTypeCloth).setUnlocalizedName("BlockTaoziDG").setTextureName("FoodCraft:BlockTaoziDG");
        BlockJuziDG = new BlockDangao().setHardness(0.5F).setStepSound(Block.soundTypeCloth).setUnlocalizedName("BlockJuziDG").setTextureName("FoodCraft:BlockJuziDG");
        BlockNingmengDG = new BlockDangao().setHardness(0.5F).setStepSound(Block.soundTypeCloth).setUnlocalizedName("BlockNingmengDG").setTextureName("FoodCraft:BlockNingmengDG");
        BlockCaomeiDG = new BlockDangao().setHardness(0.5F).setStepSound(Block.soundTypeCloth).setUnlocalizedName("BlockCaomeiDG").setTextureName("FoodCraft:BlockCaomeiDG");
        BlockYeziDG = new BlockDangao().setHardness(0.5F).setStepSound(Block.soundTypeCloth).setUnlocalizedName("BlockYeziDG").setTextureName("FoodCraft:BlockYeziDG");

        GameRegistry.registerBlock(BlockBailuobo, "BlockBailuobo");
        GameRegistry.registerBlock(BlockQingjiao, "BlockQingjiao");
        GameRegistry.registerBlock(BlockHongdou, "BlockHongdou");
        GameRegistry.registerBlock(BlockLvdou, "BlockLvdou");
        GameRegistry.registerBlock(BlockHongshu, "BlockHongshu");

        GameRegistry.registerBlock(BlockDouzi, "BlockDouzi");
        GameRegistry.registerBlock(BlockShuidao, "BlockShuidao");
        GameRegistry.registerBlock(BlockHuashen, "BlockHuashen");
        GameRegistry.registerBlock(BlockFanqie, "BlockFanqie");
        GameRegistry.registerBlock(BlockLajiao, "BlockLajiao");
        GameRegistry.registerBlock(BlockShucai, "BlockShucai");
        GameRegistry.registerBlock(BlockPutao, "BlockPutao");
        GameRegistry.registerBlock(BlockQiezi, "BlockQiezi");

        GameRegistry.registerBlock(Blocksugar, "Blocksugar");
        GameRegistry.registerBlock(BlockDami, "BlockDami");
        GameRegistry.registerBlock(BlockHuashenk, "BlockHuashenk");
        GameRegistry.registerBlock(BlockLuobo, "BlockLuobo");
        GameRegistry.registerBlock(BlockTudou, "BlockTudou");
        GameRegistry.registerBlock(BlockYan, "BlockYan");
        GameRegistry.registerBlock(BlockDouzik, "BlockDouzik");
        GameRegistry.registerBlock(BlockRuomi, "BlockRuomi");
        GameRegistry.registerBlock(BlockDouban, "BlockDouban");
        GameRegistry.registerBlock(BlockQiaokeli, "BlockQiaokeli");

        GameRegistry.registerBlock(BlockWaike, "BlockWaike");
        GameRegistry.registerBlock(BlockCong, "BlockCong");
        GameRegistry.registerBlock(BlockNuodao, "BlockNuodao");
        GameRegistry.registerBlock(BlockHuanggua, "BlockHuanggua");
        GameRegistry.registerBlock(BlockYumi, "BlockYumi");
        GameRegistry.registerBlock(BlockCaomei, "BlockCaomei");
        GameRegistry.registerBlock(BlockPutaoDG, "BlockPutaoDG");

        GameRegistry.registerBlock(BlockJinputaoDG, "BlockJinputaoDG");
        GameRegistry.registerBlock(BlockLiDG, "BlockLiDG");
        GameRegistry.registerBlock(BlockTaoziDG, "BlockTaoziDG");
        GameRegistry.registerBlock(BlockJuziDG, "BlockJuziDG");
        GameRegistry.registerBlock(BlockNingmengDG, "BlockNingmengDG");
        GameRegistry.registerBlock(BlockCaomeiDG, "BlockCaomeiDG");
        GameRegistry.registerBlock(BlockYeziDG, "BlockYeziDG");
    }
}
