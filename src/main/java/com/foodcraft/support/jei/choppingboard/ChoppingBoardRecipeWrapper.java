package com.foodcraft.support.jei.choppingboard;

import com.foodcraft.itemstack.FoodcraftItemStack;
import com.foodcraft.support.jei.FcRecipeWrapper;
import com.google.common.collect.Lists;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ChoppingBoardRecipeWrapper extends FcRecipeWrapper {
    private final List inputs;
    private final List outputs;

    public ChoppingBoardRecipeWrapper(Map.Entry<FoodcraftItemStack, ItemStack> entry) {
        inputs = Lists.newArrayListWithCapacity(entry.getKey().getItems().length);
        for (Item item : entry.getKey().getItems())
            if (item != null)
                inputs.add(new ItemStack(item));
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
