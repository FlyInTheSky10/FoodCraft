package com.foodcraft.support.jei;

import mezz.jei.api.BlankModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;

import javax.annotation.Nonnull;

@JEIPlugin
public class FoodCraftPlugin extends BlankModPlugin {
    @Override
    public void register(@Nonnull IModRegistry registry) {
        registry.addRecipeHandlers();
    }
}
