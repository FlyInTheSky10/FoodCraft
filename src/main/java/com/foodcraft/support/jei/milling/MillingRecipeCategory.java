package com.foodcraft.support.jei.milling;

import com.foodcraft.support.jei.FcRecipeUids;
import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.recipe.BlankRecipeCategory;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import javax.annotation.Nonnull;

public class MillingRecipeCategory extends BlankRecipeCategory {

    @Nonnull
    private final IDrawable background;
    @Nonnull
    private final IDrawable backgroundDesign;
    @Nonnull
    private final IDrawable arrow;
    @Nonnull
    private final String localizedName;

    public MillingRecipeCategory(IGuiHelper guiHelper) {
        ResourceLocation location = new ResourceLocation("foodcraft:textures/gui/nei/nmj.png");
        background = guiHelper.createDrawable(location, 85, 30, 60, 26, 10, 20, 60, 0);

        ResourceLocation backgroundDesignLocation = new ResourceLocation("foodcraft", "textures/gui/nei/nmj.png");
        backgroundDesign = guiHelper.createDrawable(backgroundDesignLocation, 0, 20, 60, 50);
        arrow = guiHelper.createDrawable(backgroundDesignLocation, 100, 82, 16, 16);

        localizedName = StatCollector.translateToLocal("tile.Nmj.name");
    }

    @Nonnull
    @Override
    public String getUid() {
        return FcRecipeUids.MILLING;
    }

    @Nonnull
    @Override
    public String getTitle() {
        return localizedName;
    }

    @Nonnull
    @Override
    public IDrawable getBackground() {
        return null;
    }

    @Override
    public void setRecipe(@Nonnull IRecipeLayout iRecipeLayout, @Nonnull IRecipeWrapper iRecipeWrapper) {

    }

    @Override
    public void drawExtras(@Nonnull Minecraft minecraft) {
        // drawProgressBar(76 - 5, 21 - 11, 176, 14, 22, 12, 48, 0);
        // drawProgressBar(81 - 5, 37 - 11, 176, 0, 14, 14, 48, 7);
    }
}
