package com.cfyifei.plant.items;

import net.minecraft.block.Block;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.EnumPlantType;

public class ItemShuidao extends ItemCropPlant {

    public ItemShuidao(Block b) {
        super(b);
    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
        return EnumPlantType.Crop;
    }
}