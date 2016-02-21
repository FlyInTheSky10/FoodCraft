package com.foodcraft.support.jei.milling;

import com.foodcraft.gui.recipes.RecipeMill;
import com.foodcraft.support.jei.FcRecipeWrapper;
import mezz.jei.api.IJeiHelpers;

import javax.annotation.Nonnull;
import java.util.List;

public class MillingRecipeWrapper extends FcRecipeWrapper {

    private final RecipeMill recipe;

    public MillingRecipeWrapper(@Nonnull IJeiHelpers jeiHelpers, @Nonnull RecipeMill recipe) {
        super(jeiHelpers);
        this.recipe = recipe;
    }

    @Nonnull
    @Override
    public List getInputs() {
        return recipe.getInputList();
    }

    @Nonnull
    @Override
    public List getOutputs() {
        return recipe.getOutputList();
    }

}
