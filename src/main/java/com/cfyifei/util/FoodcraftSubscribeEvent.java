package com.cfyifei.util;

import com.cfyifei.gui.tileentitys.TileEntityGuo;
import com.cfyifei.gui.tileentitys.TileEntityPDG;
import com.cfyifei.item.ModItem;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.world.BlockEvent;

public class FoodcraftSubscribeEvent {
    public static void setItemStackNBT(ItemStack item, String str, int value) {
        if (item.getTagCompound() == null) item.setTagCompound(new NBTTagCompound());
        item.getTagCompound().setInteger(str, value);
    }

    /*	@SubscribeEvent
        public void playerHealth(RenderGameOverlayEvent.Pre event) {

            if(event.type == ElementType.FOOD)
            {
                int width = event.resolution.getScaledWidth();
                int height = event.resolution.getScaledHeight();
                Minecraft mc = Minecraft.getMinecraft();

                String hp = String.format("%d",
                                MathHelper.ceiling_float_int(mc.thePlayer.getFoodStats().getFoodLevel())
                               );
                FontRenderer fontRenderer = mc.fontRenderer;
                fontRenderer.drawStringWithShadow(hp, width / 2 + 45, height - GuiIngameForge.left_height + 20, 0xFFFFFF);
                mc.renderEngine.bindTexture(Gui.icons);
            }
        }*/
    @SubscribeEvent

    public void test1(LivingDeathEvent event) {
        if (event.entityLiving instanceof EntitySheep) {
            EntitySheep Sheep = (EntitySheep) event.entityLiving;
            if (!Sheep.worldObj.isRemote) {
                if (!Sheep.isChild()) {//�޸�С�����
                    if (Sheep.isBurning()) {
                        FoodcraftUtil.dropItemAsEntity(Sheep.worldObj, Sheep.posX, Sheep.posY, Sheep.posZ, new ItemStack(ModItem.ItemShuyangrou, 3));
                    } else {
                        FoodcraftUtil.dropItemAsEntity(Sheep.worldObj, Sheep.posX, Sheep.posY, Sheep.posZ, new ItemStack(ModItem.ItemYangrou, 3));
                    }

                }
            }
        }
        if (event.entityLiving instanceof EntitySquid) {
            EntitySquid Squid = (EntitySquid) event.entityLiving;
            if (!Squid.worldObj.isRemote) {
                FoodcraftUtil.dropItemAsEntity(Squid.worldObj, Squid.posX, Squid.posY, Squid.posZ, new ItemStack(ModItem.ItemYouyurou, 3));
            }
        }
    }

    @SubscribeEvent
    public void onBreakEvent(BlockEvent.BreakEvent event) {
        TileEntity te = event.world.getTileEntity(event.x, event.y, event.z);
        if (!event.world.isRemote) {
            if ((te != null) && ((te instanceof TileEntityPDG))) {
                TileEntityPDG t = (TileEntityPDG) te;
                ItemStack stack = new ItemStack(event.block);
                setItemStackNBT(stack, "frequencyOfUse", t.frequencyOfUse);

                if (!event.getPlayer().capabilities.isCreativeMode) {
                    event.world.setBlockToAir(event.x, event.y, event.z);
                    FoodcraftUtil.dropItemAsEntity(event.world, event.x, event.y, event.z, stack);
                }
            }
            if ((te != null) && ((te instanceof TileEntityGuo))) {
                TileEntityGuo t = (TileEntityGuo) te;
                ItemStack stack = new ItemStack(event.block);
                setItemStackNBT(stack, "frequencyOfUse", t.frequencyOfUse);

                if (!event.getPlayer().capabilities.isCreativeMode) {
                    event.world.setBlockToAir(event.x, event.y, event.z);
                    FoodcraftUtil.dropItemAsEntity(event.world, event.x, event.y, event.z, stack);
                }
            }
        }
    }

}
