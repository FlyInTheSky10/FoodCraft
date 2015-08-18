package com.cfyifei.gui.tileentitys;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.cfyifei.gui.blocks.BlockGuo;
import com.cfyifei.gui.blocks.ModGui;
import com.cfyifei.gui.recipes.Guorecipe;
import com.cfyifei.item.FoodcraftItems;
import com.cfyifei.itemstack.CookingOutput;

public class TileEntityGuo extends TileEntity implements IUpdatePlayerListBox,IInventory {
	
	private ItemStack stack[] = new ItemStack[14];
	public int tableBurnTime = 0;
    public int currentItemBurnTime = 50;
    public int furnaceCookTime;
    public int frequencyOfUse;
	private String field_145958_o;
	public boolean isfire;
	public ItemStack cai;
	public int max;
	public int min;
	private int w;
	public int Nowheat = 0;

	@Override
    public void update() {
		if(worldObj.getBlockState(new BlockPos(getPos().getX(), getPos().getY() - 1, getPos().getZ())).getBlock() != Blocks.fire ||worldObj.getBlockState(new BlockPos(getPos().getX(), getPos().getY() - 1, getPos().getZ())).getBlock() != ModGui.lit_Zl){
			isfire = false;
		}		
		if(worldObj.getBlockState(new BlockPos(getPos().getX(), getPos().getY() - 1, getPos().getZ())).getBlock() == Blocks.fire){
			isfire = true;
		}
			else{
					if(worldObj.getBlockState(new BlockPos(getPos().getX(), getPos().getY() - 1, getPos().getZ())).getBlock() == ModGui.lit_Zl){
						isfire = true;
				}
		}


		if (this.tableBurnTime > 0) {
			--this.tableBurnTime;   
		}
	        
		if (!this.worldObj.isRemote) {
	       AxisAlignedBB aabb = AxisAlignedBB.fromBounds(this.getPos().getX() - 20, this.getPos().getY() - 20, this.getPos().getZ() -20, this.getPos().getX() + 20, this.getPos().getY() + 20, this.getPos().getZ() + 20);
	       List<EntityLivingBase> l1 = worldObj.getEntitiesWithinAABB(EntityLivingBase.class, aabb);
	       for(EntityLivingBase elb : l1){
        		if(isfire) {
	    			if(!(elb == null)) {
		    			if((int)(elb.posX)-1 == this.getPos().getX()  && (int)(elb.posZ) == this.getPos().getZ()  && (int)(elb.posY) == this.getPos().getY() ){
		    				if(elb instanceof EntityPlayer){
		    					if(((EntityPlayer)elb).capabilities.isCreativeMode){
		    						continue;
		    					}
		    				}
		    				if(!elb.isBurning()){
	    					elb.setFire(3);
		    				}
		    			}
	    			}
    			}			
    		}       	
        	cai = this.canchao();
            if (isfire && cai != null && isst()) {
                ++this.furnaceCookTime;
                if(w == 16){
	            	   Nowheat += (float)((float)currentItemBurnTime/2F);
	            	   w = 0;
	               }
	                	w++;
	                	
	                	if(Nowheat > max){
	                		if (stack[0] != null){--stack[0].stackSize;if (stack[0].stackSize <= 0){stack[0] = null;}}
	                		if (stack[1] != null){--stack[1].stackSize;if (stack[1].stackSize <= 0){stack[1] = null;}}
	                		if (stack[2] != null){--stack[2].stackSize;if (stack[2].stackSize <= 0){stack[2] = null;}}
	                		if (stack[3] != null){--stack[3].stackSize;if (stack[3].stackSize <= 0){stack[3] = null;}}
	                		if (stack[4] != null){--stack[4].stackSize;if (stack[4].stackSize <= 0){stack[4] = null;}}
	                		if (stack[5] != null){--stack[5].stackSize;if (stack[5].stackSize <= 0){stack[5] = null;}}
	                		if (stack[6] != null){--stack[6].stackSize;if (stack[6].stackSize <= 0){stack[6] = null;}}
	                		if (stack[7] != null){--stack[7].stackSize;if (stack[7].stackSize <= 0){stack[7] = null;}}
	                		if (stack[8] != null){--stack[8].stackSize;if (stack[8].stackSize <= 0){stack[8] = null;}}
	                		if (stack[9] != null){--stack[9].stackSize;if (stack[9].stackSize <= 0){stack[9] = null;}}
	                		if (stack[10] != null){--stack[10].stackSize;if (stack[10].stackSize <= 0){stack[10] = null;}}
	                		if (stack[11] != null){--stack[11].stackSize;if (stack[11].stackSize <= 0){stack[11] = null;}}
		                	 this.stack[13] = new ItemStack(Items.coal);
		                	this.furnaceCookTime = 0;
		                	Nowheat = 0;
		                }
		                
	                	 
                if (this.furnaceCookTime == 500) {
                    this.furnaceCookTime = 0;
                    this.smeltItem();
                }
            }
            else {
                this.furnaceCookTime = 0;
                Nowheat = 0;
            }
          }
	}
		 

	private boolean isst() {
		if(stack[12] != null){
			int result = stack[12].stackSize + 1;
			boolean e =  result <= getInventoryStackLimit() && result <= this.stack[12].getMaxStackSize();
			return e; 
		}
		return true;
	}


	@Override
	public int getSizeInventory() {
		return stack.length;
	}

	@Override
	public ItemStack getStackInSlot(int var1) {
		return stack[var1];
	}

	@Override
    public ItemStack decrStackSize(int par1, int par2) {
            if (this.stack[par1] != null) {
        ItemStack var3;
        if (this.stack[par1].stackSize <= par2) {
            var3 = this.stack[par1];
            this.stack[par1] = null;
            return var3;
        }
        else {
            var3 = this.stack[par1].splitStack(par2);

            if (this.stack[par1].stackSize == 0) {
                this.stack[par1] = null;
            }

            return var3;
        }
    }
        else {
        	return null;
    	}
    }

	@Override
	 public ItemStack getStackInSlotOnClosing(int par1) {
        if (this.stack[par1] != null) {
            ItemStack itemstack = this.stack[par1];
            this.stack[par1] = null;
            return itemstack;
        }
        else {
            return null;
        }
    }

	@Override
	public void setInventorySlotContents(int var1, ItemStack var2) {
        this.stack[var1] = var2;
        if (var2 != null && var2.stackSize > this.getInventoryStackLimit()) {
        	var2.stackSize = this.getInventoryStackLimit();
        }
	}

	@Override
	public String getName() {
		return "Guo";
	}

	@Override
	public int getInventoryStackLimit() {

		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer var1) {
		
		return true;
	}

	@Override
	public boolean isItemValidForSlot(int var1, ItemStack var2) {	
		return false;
	}

	public void readFromNBT(NBTTagCompound par1NBTTagCompound) {
        super.readFromNBT(par1NBTTagCompound);
        NBTTagList var2 = par1NBTTagCompound.getTagList("ItemsGuo", 10);
        this.stack = new ItemStack[this.getSizeInventory()];
        for (int var3 = 0; var3 < var2.tagCount(); ++var3) {
            NBTTagCompound var4 = (NBTTagCompound)var2.getCompoundTagAt(var3);
            byte var5 = var4.getByte("Slot");
            if (var5 >= 0 && var5 < this.stack.length) {
                this.stack[var5] = ItemStack.loadItemStackFromNBT(var4);
            }
        }
        this.tableBurnTime = par1NBTTagCompound.getShort("tableBurnTime");
        this.furnaceCookTime = par1NBTTagCompound.getShort("furnaceCookTime");
        this.currentItemBurnTime = par1NBTTagCompound.getShort("currentItemBurnTime");
        this.frequencyOfUse = par1NBTTagCompound.getShort("frequencyOfUse");
        this.Nowheat = par1NBTTagCompound.getShort("Nowheat");
    }

    public void writeToNBT(NBTTagCompound par1NBTTagCompound) {
        super.writeToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setShort("tableBurnTime", (short)this.tableBurnTime);
        par1NBTTagCompound.setShort("furnaceCookTime", (short)this.furnaceCookTime);
        par1NBTTagCompound.setShort("currentItemBurnTime", (short)this.currentItemBurnTime);
        par1NBTTagCompound.setShort("frequencyOfUse", (short)this.frequencyOfUse);
        par1NBTTagCompound.setShort("Nowheat", (short)this.Nowheat);     
        NBTTagList var2 = new NBTTagList();
        for (int var3 = 0; var3 < this.stack.length; ++var3) {
            if (this.stack[var3] != null) {
                NBTTagCompound var4 = new NBTTagCompound();
                var4.setByte("Slot", (byte)var3);
                this.stack[var3].writeToNBT(var4);
                var2.appendTag(var4);
            }
        }
        par1NBTTagCompound.setTag("ItemsGuo", var2);
    } 

    public boolean isBurning() {
        return this.tableBurnTime > 0;
    }
   
    public void smeltItem() {
    	 if(Nowheat < min){
        	 this.stack[13] = new ItemStack(stack[0].getItem());	
        	 if (stack[0] != null){--stack[0].stackSize;if (stack[0].stackSize <= 0){stack[0] = null;}}
        	 if (stack[1] != null){--stack[1].stackSize;if (stack[1].stackSize <= 0){stack[1] = null;}}
        	 if (stack[2] != null){--stack[2].stackSize;if (stack[2].stackSize <= 0){stack[2] = null;}}
        	 if (stack[3] != null){--stack[3].stackSize;if (stack[3].stackSize <= 0){stack[3] = null;}}
        	 if (stack[4] != null){--stack[4].stackSize;if (stack[4].stackSize <= 0){stack[4] = null;}}
        	 if (stack[5] != null){--stack[5].stackSize;if (stack[5].stackSize <= 0){stack[5] = null;}}
        	 if (stack[6] != null){--stack[6].stackSize;if (stack[6].stackSize <= 0){stack[6] = null;}}
        	 if (stack[7] != null){--stack[7].stackSize;if (stack[7].stackSize <= 0){stack[7] = null;}}
        	 if (stack[8] != null){--stack[8].stackSize;if (stack[8].stackSize <= 0){stack[8] = null;}}
        	 if (stack[9] != null){--stack[9].stackSize;if (stack[9].stackSize <= 0){stack[9] = null;}}
        	 if (stack[10] != null){--stack[10].stackSize;if (stack[10].stackSize <= 0){stack[10] = null;}}
        	 if (stack[11] != null){--stack[11].stackSize;if (stack[11].stackSize <= 0){stack[11] = null;}}
        	 Nowheat = 0;
        	 return;
         }
    	 Nowheat = 0;
     	if(frequencyOfUse < 3000){
     		frequencyOfUse += 1;
     	}
            if (this.stack[12] == null) {
                this.stack[12] = cai.copy(); 
            }
            else if (this.stack[12].getItem() == cai.getItem()) {
            	
 this.stack[12].stackSize += cai.stackSize; // Forge BugFix: Results may have multiple items

            }
if (stack[0] != null){--stack[0].stackSize;if (stack[0].stackSize <= 0){stack[0] = null;}}
if (stack[1] != null){--stack[1].stackSize;if (stack[1].stackSize <= 0){stack[1] = null;}}
if (stack[2] != null){--stack[2].stackSize;if (stack[2].stackSize <= 0){stack[2] = null;}}
if (stack[3] != null){--stack[3].stackSize;if (stack[3].stackSize <= 0){stack[3] = null;}}
if (stack[4] != null){--stack[4].stackSize;if (stack[4].stackSize <= 0){stack[4] = null;}}
if (stack[5] != null){--stack[5].stackSize;if (stack[5].stackSize <= 0){stack[5] = null;}}
if (stack[6] != null){--stack[6].stackSize;if (stack[6].stackSize <= 0){stack[6] = null;}}
if (stack[7] != null){--stack[7].stackSize;if (stack[7].stackSize <= 0){stack[7] = null;}}
if (stack[8] != null){--stack[8].stackSize;if (stack[8].stackSize <= 0){stack[8] = null;}}
if (stack[9] != null){--stack[9].stackSize;if (stack[9].stackSize <= 0){stack[9] = null;}}
if (stack[10] != null){--stack[10].stackSize;if (stack[10].stackSize <= 0){stack[10] = null;}}
if (stack[11] != null){--stack[11].stackSize;if (stack[11].stackSize <= 0){stack[11] = null;}}

}
    

    @SideOnly(Side.CLIENT)
    public float getCookProgressScaled(int int1) {
        return this.furnaceCookTime * int1 / 500;
    }

    public ItemStack canchao() { 	
    	CookingOutput hj = Guorecipe.smelting().getOutput(stack[0], stack[1], stack[2], stack[3], 
    			stack[4], stack[5], stack[6], stack[7], stack[8], stack[9], 
    			stack[10], stack[11]);
    	if(hj != null) {
        if(hj.is != null) {
        	min = hj.min;
        	max = hj.max;
        	return hj.is;
        }
        else {
        	return null;
        }
    	}
        else {
        	return null;
        }
    	
    }

	@Override
	public boolean hasCustomName() {
		return false;
	}

	@Override
	public IChatComponent getDisplayName() {
		return new ChatComponentText(this.getName());
	}

	@Override
	public void openInventory(EntityPlayer player) {}

	@Override
	public void closeInventory(EntityPlayer player) {}
		
	@Override
	public int getField(int id) {
		return 0;
	}


	@Override
	public void setField(int id, int value) {}


	@Override
	public int getFieldCount() {
		return 0;
	}

	@Override
	public void clear() {
		for (int i = 0; i < this.stack.length; ++i) {
            this.stack[i] = null;
        }
	}

	@SideOnly(Side.CLIENT)
	public float getBurnTimeRemainingScaled(int int1) {
		return (((float)this.currentItemBurnTime)* int1) / 100F;
	}
}