package com.foodcraft.item;



import com.foodcraft.init.FoodcraftItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class FcFood extends ItemFood {

    private boolean hasEffect;

    public FcFood(int amount, float saturation, String name) {
        super((int)saturation, saturation, false);
        setUnlocalizedName(name);
    }

    public FcFood(int amount, float saturation, String name, boolean Effect) {
        super((int)saturation, saturation, false);
        setUnlocalizedName(name);
        hasEffect = Effect;
    }

    public boolean hasEffect(ItemStack par1ItemStack) {
        return hasEffect;
    }

    protected void onFoodEaten(ItemStack is, World w, EntityPlayer ep) {
        if(this == FoodcraftItems.ItemZongzi || this == FoodcraftItems.ItemYuebing || this == FoodcraftItems.ItemTangyuan) {
            int o;
            if(!w.isRemote) {
                o = w.rand.nextInt(7);

                switch(o) {
                case 0:
                    ep.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 600, 1));
                    break;
                case 1:
                    ep.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 600, 1));
                    break;
                case 2:
                    ep.addPotionEffect(new PotionEffect(Potion.invisibility.id, 600, 1));
                    break;
                case 3:
                    ep.addPotionEffect(new PotionEffect(Potion.jump.id, 600, 1));
                    break;
                case 4:
                    ep.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 600, 1));
                    break;
                case 5:
                    ep.addPotionEffect(new PotionEffect(Potion.nightVision.id, 600, 1));
                    break;
                case 6:
                    ep.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 600, 1));
                    break;
                }
            }
        }
        super.onFoodEaten(is, w, ep);
    }
}