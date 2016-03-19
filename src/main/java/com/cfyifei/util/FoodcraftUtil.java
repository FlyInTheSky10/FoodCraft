package com.cfyifei.util;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FoodcraftUtil {
    /**
     * Drop item in world.
     */
    public static void dropItemAsEntity(World world, double posX, double posY, double posZ,
                                        ItemStack itemStack) {

        if (itemStack == null) {
            return;
        }
        double f = 0.7D;
        double dx = world.rand.nextFloat() * f + (1.0D - f) * 0.5D;
        double dy = world.rand.nextFloat() * f + (1.0D - f) * 0.5D;
        double dz = world.rand.nextFloat() * f + (1.0D - f) * 0.5D;

        EntityItem entityItem = new EntityItem(world, posX + dx, posY + dy, posZ + dz, itemStack.copy());
        entityItem.delayBeforeCanPickup = 10;
        world.spawnEntityInWorld(entityItem);
    }

}
