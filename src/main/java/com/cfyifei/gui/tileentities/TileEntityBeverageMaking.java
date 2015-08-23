package com.cfyifei.gui.tileentities;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;






import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.cfyifei.gui.blocks.BlockMill;
import com.cfyifei.gui.blocks.BlockBeverageMaking;
import com.cfyifei.gui.blocks.FoodcraftGuiBlocks;
import com.cfyifei.gui.recipes.RecipeBeverageMaking;
import com.cfyifei.item.FoodcraftItems;

public class TileEntityBeverageMaking extends TileEntityFoodcraft implements IUpdatePlayerListBox {
	
	
	public int tableBurnTime = 0;
	public int maxBurnTime = 0;
    public int currentItemBurnTime = 0;
    public int furnaceCookTime;
	private String field_145958_o;
	public int water;
	public int coldBurnTime;
	public int currentItemcoldBurnTime;
	public int milk;
	public ItemStack cai;
	public ItemStack coldcai;
	public boolean iswater;
	private boolean iswater2;

	public TileEntityBeverageMaking() {
		this.stack = new ItemStack[5];
	}
	@Override
    public void update() {
		
		boolean flag = this.tableBurnTime > 0;
	    boolean flag1 = false;
	    boolean flag1_ = false;
	        
	        if (this.tableBurnTime > 0) {
	            --this.tableBurnTime; 
	        }
	        if (this.coldBurnTime > 0) {
	            --this.coldBurnTime;   
	        }
	        
	        if (!this.worldObj.isRemote) {
	        	iswater = gettp();

	            if (this.tableBurnTime == 0 && this.hotcanSmelt()) {
	                this.currentItemBurnTime = this.tableBurnTime = getItemBurnTime(this.stack[3]);

	                if (this.tableBurnTime > 0) {
	                    flag1 = true;

	                    if (this.stack[3] != null) {
	                        --this.stack[3].stackSize;

	                        if (this.stack[3].stackSize == 0) {
	                            this.stack[3] = stack[3].getItem().getContainerItem(stack[3]);
	                        }
	                    }
	                }
	            }

	            if (this.isBurning() && this.hotcanSmelt()) {
	                ++this.furnaceCookTime;

	                if (this.furnaceCookTime == 350) {
	                    this.furnaceCookTime = 0;
	                    this.hotsmeltItem();
	                    flag1 = true;
	                }
	            }
	                BlockBeverageMaking.setState(this.isBurning() || iscold(), this.worldObj, this.pos);

	          iswater2 = gettp2();
	        if (this.coldBurnTime == 0 && this.coldcanSmelt()) {
                this.currentItemcoldBurnTime = this.coldBurnTime = getcold();

                if (this.coldBurnTime > 0) {
                    flag1_ = true;

                    if (this.stack[4] != null) {
                        --this.stack[4].stackSize;

                        if (this.stack[4].stackSize == 0) {
                            this.stack[4] = stack[4].getItem().getContainerItem(stack[4]);
                        }
                    }
                }
            }

            if (this.iscold() && this.coldcanSmelt()) {
                ++this.furnaceCookTime;

                if (this.furnaceCookTime == 350) {
                    this.furnaceCookTime = 0;
                    this.coldsmeltItem();
                    flag1_ = true;
                }
            }

	        if (flag1_) {
	            this.markDirty();
	        }
	        if (stack[0] != null) {
	        	if(water != 8) {
	        	if(milk == 0) {
	        	if(stack[0].getItem() == Items.potionitem) {     		
	        			stack[0] = new ItemStack(Items.glass_bottle);
	        			++water;	        			        		
	        		}	
	        	}
	    		if(stack[0].getItem().equals(FoodcraftItems.Itemwater)) {
        			--stack[0].stackSize;
        			++water;	      	
        		}	
	        }
	        	
	        	if (stack[0] != null) {
				if(milk != 8) {
					if(water == 0) {
		        	if(stack[0].getItem() == Items.milk_bucket) {
		        			stack[0] = new ItemStack(Items.bucket);
		        			++milk;	        			        		
		        		}	
		        	}
	        }
	  }
	        	if (stack[0] != null) {
	        		if(stack[0].stackSize <= 0) {
	        			stack[0] = null;
	        		}
	        	}
	        }
	  }
	}
		 
	private int getcold() {
         if(stack[4] != null){
        	 if(stack[4].getItem() == Item.getItemFromBlock(Blocks.ice))return 2500;
         }
		return 0;
	}

	public boolean gettp2() {	
		if(stack[1] !=null) {
			if(water >= 1) {
				ItemStack is1 = RecipeBeverageMaking.making().getOutput(stack[1], false, true);
				if(is1 != null) {
					coldcai = is1;
					return true;
				}								
			}
						
			if(milk >= 1) {
				ItemStack is1 = RecipeBeverageMaking.making().getOutput(stack[1], true, true);
				if(is1 != null) {
					coldcai = is1;
					return false;
				}								
			}
			coldcai = null;
		}
		return false;
	}

	@Override
	public String getName() {	
		return "BeverageMaking";
	}

	public void readFromNBT(NBTTagCompound par1NBTTagCompound) {
        super.readFromNBT(par1NBTTagCompound);
        NBTTagList var2 = par1NBTTagCompound.getTagList("Items", 10);
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
        this.currentItemcoldBurnTime = par1NBTTagCompound.getShort("currentItemcoldBurnTime");
        this.coldBurnTime = par1NBTTagCompound.getShort("coldBurnTime");
        this.water = par1NBTTagCompound.getShort("water");
        this.milk = par1NBTTagCompound.getShort("milk");
    }

    public void writeToNBT(NBTTagCompound par1NBTTagCompound) {
        super.writeToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setShort("tableBurnTime", (short)this.tableBurnTime);
        par1NBTTagCompound.setShort("furnaceCookTime", (short)this.furnaceCookTime);
        par1NBTTagCompound.setShort("currentItemcoldBurnTime", (short)this.currentItemcoldBurnTime);
        par1NBTTagCompound.setShort("coldBurnTime", (short)this.coldBurnTime);    
        par1NBTTagCompound.setShort("water", (short)this.water);
        par1NBTTagCompound.setShort("milk", (short)this.milk);
        NBTTagList var2 = new NBTTagList();
        for (int var3 = 0; var3 < this.stack.length; ++var3) {
            if (this.stack[var3] != null) {
                NBTTagCompound var4 = new NBTTagCompound();
                var4.setByte("Slot", (byte)var3);
                this.stack[var3].writeToNBT(var4);
                var2.appendTag(var4);
            }
        }
        par1NBTTagCompound.setTag("Items", var2);
       
    }
    
    public static int getItemBurnTime(ItemStack par0ItemStack) {
        if (par0ItemStack == null) {
            return 0;
        }
        else {
            net.minecraft.item.Item item = par0ItemStack.getItem();

            if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air) {
            	Block block = Block.getBlockFromItem(item);

                if (block == Blocks.wooden_slab) {
                    return 150;
                }

                if (block.getMaterial() == Material.wood) {
                    return 300;
                }
                if (block == Blocks.coal_block) {
                    return 16000;
                }
            }
            if (item instanceof ItemTool && ((ItemTool) item).getToolMaterialName().equals("WOOD")) return 200;
            if (item instanceof ItemSword && ((ItemSword) item).getToolMaterialName().equals("WOOD")) return 200;
            if (item instanceof ItemHoe && ((ItemHoe) item).getMaterialName().equals("WOOD")) return 200;
            if (item == Items.stick) return 100;
            if (item == Items.coal) return 1600;
            if (item == Items.lava_bucket) return 20000;
            if (item == Item.getItemFromBlock(Blocks.sapling)) return 100;
            if (item == Items.blaze_rod) return 2400;
            return GameRegistry.getFuelValue(par0ItemStack);
        }
    }
    
    private boolean hotcanSmelt() {
        if (this.stack[1] == null) {
            return false;
        }
        else {
            if (cai == null) return false;            
            if (iswater){
            	if(!(water >= 1))return false;
            }
            else {
            	if(!(milk >= 1))return false;
            }
            if (this.stack[2] == null) return true;
            if (!this.stack[2].isItemEqual(cai)) return false;
            int result = stack[2].stackSize + cai.stackSize;
            return result <= getInventoryStackLimit() && result <= this.stack[2].getMaxStackSize(); //Forge BugFix: Make it respect stack sizes properly.
        }
    }
    
    private boolean coldcanSmelt() {
        if (this.stack[1] == null) {
            return false;
        }
        else {
            if (coldcai == null) return false;            
            if (iswater2) {
            	if(!(water >= 1))return false;
            }
            else {
            	if(!(milk >= 1))return false;
            }
            if (this.stack[2] == null) return true;
            if (!this.stack[2].isItemEqual(coldcai)) return false;
            int result = stack[2].stackSize + coldcai.stackSize;
            return result <= getInventoryStackLimit() && result <= this.stack[2].getMaxStackSize(); //Forge BugFix: Make it respect stack sizes properly.
        }
    }
    public boolean isBurning() {
        return this.tableBurnTime > 0;
    }
   
    public void hotsmeltItem() {
        if (this.hotcanSmelt()) {

        	 if(water >= 1) {
             	--water;
             }
             else {
             	if(milk >= 1) {
             		--milk;
             	}
             	else {
             		return;
             	}
             }
        	 
            if (this.stack[2] == null) {
                this.stack[2] = cai.copy();
            }
            else if (this.stack[2].getItem() == cai.getItem()) {
                this.stack[2].stackSize += cai.stackSize; 
            }
            --this.stack[1].stackSize;    
            
            if (this.stack[1].stackSize <= 0) {
                this.stack[1] = null;
            }
        }
    }
    
    @SideOnly(Side.CLIENT)
    public float getBurnTimeRemainingScaled(int int1) {
        if (this.currentItemBurnTime == 0) {
            this.currentItemBurnTime = 200;
        }
        return this.tableBurnTime * int1 / this.currentItemBurnTime;
    }
    
    @SideOnly(Side.CLIENT)
    public float getcoldRemainingScaled(int int1) {
        if (this.currentItemcoldBurnTime == 0) {
            this.currentItemcoldBurnTime = 200;
        }
        return this.coldBurnTime * int1 / this.currentItemcoldBurnTime;
    }
    
    public float getCookProgressScaled(int int1) {
        return this.furnaceCookTime * int1 / 350;
    }

    public void name(String int1) {
        this.field_145958_o = int1;
       }


	public int getWater() {
		return this.water * 7;
	}
	
	public int getMilk() {
		return this.milk * 7;
	}


	public boolean iscold() {
		return this.coldBurnTime > 0;
	}

	public boolean gettp() {
		if(stack[1] !=null) {
			
			if(water >= 1) {
				ItemStack is1 = RecipeBeverageMaking.making().getOutput(stack[1], false, false);
				if(is1 != null) {
					cai = is1;
					return true;
				}								
			}
						
			if(milk >= 1) {
				ItemStack is1 = RecipeBeverageMaking.making().getOutput(stack[1], true, false);
				if(is1 != null) {
					cai = is1;
					return false;
				}								
			}
			cai = null;
		}
		return false;
	}
	
	public void coldsmeltItem() {
        if (this.coldcanSmelt()) {
        	 if(water >= 1) {
             	--water;
             }
             else{
             	if(milk >= 1) {
             		--milk;
             	}
             	else {
             		return;
             	}
             }
        	 
            if (this.stack[2] == null) {
                this.stack[2] = coldcai.copy();
            }
            else if (this.stack[2].getItem() == coldcai.getItem()) {
                this.stack[2].stackSize += coldcai.stackSize;
            }
            --this.stack[1].stackSize;  
            
            if (this.stack[1].stackSize <= 0) {
                this.stack[1] = null;
            }
        }
    }
}
