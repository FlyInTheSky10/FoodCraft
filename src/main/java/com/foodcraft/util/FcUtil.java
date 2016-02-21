package com.foodcraft.util;

import java.util.List;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public class FcUtil {

    public static void dropItemAsEntity(World world, double posX, double posY, double posZ, ItemStack itemStack) {

        if (itemStack == null) {
            return;
        }
        double f = 0.7D;
        double dx = world.rand.nextFloat() * f + (1.0D - f) * 0.5D;
        double dy = world.rand.nextFloat() * f + (1.0D - f) * 0.5D;
        double dz = world.rand.nextFloat() * f + (1.0D - f) * 0.5D;

        EntityItem entityItem = new EntityItem(world, posX + dx, posY + dy, posZ + dz, itemStack.copy());
        entityItem.setDefaultPickupDelay();
        world.spawnEntityInWorld(entityItem);
    }

    public static void removeRecipe(ItemStack ItemStack) {
        List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
        for (int i = 0; i < recipes.size(); i++) {
            IRecipe tmpRecipe = recipes.get(i);
            ItemStack recipeResult = tmpRecipe.getRecipeOutput();
            if (ItemStack.areItemStacksEqual(ItemStack, recipeResult)) recipes.remove(i--);
        }
    }
}
