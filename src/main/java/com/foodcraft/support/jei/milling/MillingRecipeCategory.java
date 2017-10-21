package com.foodcraft.support.jei.milling;

import com.foodcraft.support.jei.FcRecipeUids;
import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.*;
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
    private final IDrawable arrow;
    @Nonnull
    private final IDrawable flame;
    @Nonnull
    private final String localizedName;


    public MillingRecipeCategory(IGuiHelper guiHelper) {
        ResourceLocation location = new ResourceLocation("foodcraft:textures/gui/nei/nmj.png");
        background = guiHelper.createDrawable(location, 48, 18, 81, 53);
        localizedName = StatCollector.translateToLocal("tile.Nmj.name");

        IDrawableStatic flameDrawable = guiHelper.createDrawable(location, 176, 0, 14, 14);
        flame = guiHelper.createAnimatedDrawable(flameDrawable, 300, IDrawableAnimated.StartDirection.TOP, true);

        IDrawableStatic arrowDrawable = guiHelper.createDrawable(location, 176, 14, 22, 12);
        this.arrow = guiHelper.createAnimatedDrawable(arrowDrawable, 200, IDrawableAnimated.StartDirection.LEFT, false);
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
        return background;
    }

    @Override
    public void setRecipe(@Nonnull IRecipeLayout recipeLayout, @Nonnull IRecipeWrapper recipeWrapper) {
        IGuiItemStackGroup stackGroup = recipeLayout.getItemStacks();
        stackGroup.init(0, true, 0, 0);
        stackGroup.init(1, false, 112 - 48 - 1, 0);
        stackGroup.init(2, false, 80 - 48, 54 - 18);
        if (recipeWrapper.getInputs().size() > 0)
            stackGroup.set(0, recipeWrapper.getInputs());
        if (recipeWrapper.getOutputs().size() > 0)
            stackGroup.set(1, recipeWrapper.getOutputs());
    }

    @Override
    public void drawAnimations(@Nonnull Minecraft minecraft) {
        flame.draw(minecraft, 32, 18);
        arrow.draw(minecraft, 76 - 48, 21 - 18);
    }

    @Override
    public void drawExtras(@Nonnull Minecraft minecraft) {
        // drawProgressBar(76 - 5, 21 - 11, 176, 14, 22, 12, 48, 0);
        // drawProgressBar(81 - 5, 37 - 11, 176, 0, 14, 14, 48, 7);
    }
}
