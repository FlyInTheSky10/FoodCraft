package com.foodcraft.support.jei.pressurecooker;

import com.foodcraft.support.jei.FcRecipeUids;
import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.recipe.BlankRecipeCategory;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import javax.annotation.Nonnull;

public class PressureCookerRecipeCategory extends BlankRecipeCategory {
    @Nonnull
    private final IDrawable background;
    @Nonnull
    private final String localizedName;

    public PressureCookerRecipeCategory(IGuiHelper guiHelper) {
        ResourceLocation location = new ResourceLocation("foodcraft:textures/gui/nei/gyg.png");
        background = guiHelper.createDrawable(location, 13, 10, 158 - 13 + 1, 71 - 10 + 1);
        localizedName = StatCollector.translateToLocal("tile.Gyg.name");
    }

    @Nonnull
    @Override
    public String getUid() {
        return FcRecipeUids.PRESSURE_COOKER;
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
        stackGroup.init(0, true, 44 - 13 - 1, 16);
        stackGroup.init(1, true, 68 - 13 - 1, 16);
        stackGroup.init(2, true, 92 - 13 - 1, 16);
        stackGroup.init(3, false, 142 - 13 - 1, 16);
        if (recipeWrapper.getInputs().size() > 0)
            stackGroup.set(0, (ItemStack) recipeWrapper.getInputs().get(0));
        if (recipeWrapper.getInputs().size() > 1)
            stackGroup.set(1, (ItemStack) recipeWrapper.getInputs().get(1));
        if (recipeWrapper.getInputs().size() == 3)
            stackGroup.set(2, (ItemStack) recipeWrapper.getInputs().get(2));
        if (recipeWrapper.getOutputs().size() > 0)
            stackGroup.set(3, recipeWrapper.getOutputs());
        recipeLayout.getFluidStacks().init(0, true, 15 - 13, 12 - 10, 11, 57, 8000, true, null);
        recipeLayout.getFluidStacks().set(0, new FluidStack(FluidRegistry.WATER, 2000));
    }
}
