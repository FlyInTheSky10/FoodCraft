package com.foodcraft.support.jei.milling;

import com.foodcraft.support.jei.FcRecipeWrapper;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class MillingRecipeWrapper extends FcRecipeWrapper {

    private final List inputs;
    private final List outputs;

    public MillingRecipeWrapper(@Nonnull Map.Entry<ItemStack, ItemStack> entry) {
        inputs = Collections.singletonList(entry.getKey());
        outputs = Collections.singletonList(entry.getValue());
    }

    @Nonnull
    @Override
    public List getInputs() {
        return inputs;
    }

    @Nonnull
    @Override
    public List getOutputs() {
        return outputs;
    }

}
