package com.cfyifei.gui.blocks;

import java.util.Random;






import com.cfyifei.FoodCraft;
import com.cfyifei.GuiIDs;
import com.cfyifei.block.ModBlocks;
import com.cfyifei.config.NERConfigHandler;
import com.cfyifei.gui.tileentitys.TileEntityYZJ;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.tileentity.TileEntityPiston;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockYZJ extends BlockContainer{

    private final Random Random = new Random();
	private boolean ifburn;
	private static boolean EE;
    @SideOnly(Side.CLIENT)
    private IIcon top;
    @SideOnly(Side.CLIENT)
    private IIcon front_off;
    @SideOnly(Side.CLIENT)
	private IIcon front_side;
    @SideOnly(Side.CLIENT)
	private IIcon top_on;
    @SideOnly(Side.CLIENT)
	private IIcon front_on;
	
	public BlockYZJ(boolean E) {
		super(Material.rock);
		ifburn = E;
	}


	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityYZJ();
	}
	
	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3,
            int par4, EntityPlayer par5EntityPlayer, int par6, float par7,
            float par8, float par9) {
		ItemStack stack = par5EntityPlayer.inventory.mainInventory[par5EntityPlayer.inventory.currentItem];
		par5EntityPlayer.openGui(FoodCraft.instance, GuiIDs.GUI_YZJ, par1World,par2, par3, par4);

        return true;
	}
    public void onBlockAdded(World World, int X, int Y, int Z)
    {
        super.onBlockAdded(World, X, Y, Z);
        this.func_149930_e(World, X, Y, Z);
    }
    
    private void func_149930_e(World World, int X, int Y, int z)
    {
        if (!World.isRemote)
        {
            Block block = World.getBlock(X, Y, z - 1);
            Block block1 = World.getBlock(X, Y, z + 1);
            Block block2 = World.getBlock(X - 1, Y, z);
            Block block3 = World.getBlock(X + 1, Y, z);
            int b0 = 3;
            if (block.func_149730_j() && !block1.func_149730_j())
            {
                b0 = 3;
            }

            if (block1.func_149730_j() && !block.func_149730_j())
            {
                b0 = 2;
            }

            if (block2.func_149730_j() && !block3.func_149730_j())
            {
                b0 = 5;
            }

            if (block3.func_149730_j() && !block2.func_149730_j())
            {
                b0 = 4;
            }
            
            World.setBlockMetadataWithNotify(X, Y, z, b0, 2);
        }
    }
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int i, int Metadata)
    {

    	//return i == 1 ? this.top : (i == 0 ? this.top : (i != Metadata ? this.front_side : this.front_off));
        if (i == 0)
        {
          return this.front_side;
        }
        if (i == 1)
        {
        		return this.top;
        		
        }
        
        if ((i == 3) && (Metadata == 0))
        {

        		return this.front_on;
        }

        return i != Metadata ? this.front_side : this.front_on;
        }
    

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg)
    {
        this.front_side = reg.registerIcon("foodcraft:nmj_side");//4b
        
       
        if(ifburn){
        	this.top = reg.registerIcon("foodcraft:nmj_top_on");
    	}
    	else{
    		this.top = reg.registerIcon("foodcraft:nmj_top");//topon
    	}
        
        
       if(ifburn){
        	this.front_on = reg.registerIcon("foodcraft:yzj_yzj_on");//kzoff
          	}
          	else{
          		this.front_on = reg.registerIcon("foodcraft:yzj_yzj_off");//kzon
          	}
        
 
    }

  public void breakBlock(World World, int x, int y, int z, Block Block, int var1)
    {
	   if (!EE)
	    {
            TileEntityYZJ tileentity = (TileEntityYZJ)World.getTileEntity(x, y, z);

            if (tileentity != null)
            {
                for (int i1 = 0; i1 < tileentity.getSizeInventory(); ++i1)
                {
                    ItemStack itemstack = tileentity.getStackInSlot(i1);

                    if (itemstack != null)
                    {
                        float f = this.Random.nextFloat() * 0.8F + 0.1F;
                        float f1 = this.Random.nextFloat() * 0.8F + 0.1F;
                        float f2 = this.Random.nextFloat() * 0.8F + 0.1F;

                        while (itemstack.stackSize > 0)
                        {
                            int j1 = this.Random.nextInt(21) + 10;

                            if (j1 > itemstack.stackSize)
                            {
                                j1 = itemstack.stackSize;
                            }

                            itemstack.stackSize -= j1;
                            EntityItem entityitem = new EntityItem(World, (double)((float)x + f), (double)((float)y + f1), (double)((float)z + f2), new ItemStack(itemstack.getItem(), j1, itemstack.getItemDamage()));

                            if (itemstack.hasTagCompound())
                            {
                                entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
                            }

                            float f3 = 0.05F;
                            entityitem.motionX = (double)((float)this.Random.nextGaussian() * f3);
                            entityitem.motionY = (double)((float)this.Random.nextGaussian() * f3 + 0.2F);
                            entityitem.motionZ = (double)((float)this.Random.nextGaussian() * f3);
                            World.spawnEntityInWorld(entityitem);
                        }
                    }
                }

                World.func_147453_f(x, y, z, Block);
            }
        

        super.breakBlock(World, x, y, z, Block, var1);
    }
    } 

    public void onBlockPlacedBy(World World, int x, int y, int z, EntityLivingBase EntityLivingBase, ItemStack ItemStack)
    {
        int l = MathHelper.floor_double((double)(EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l == 0)
        {
        	World.setBlockMetadataWithNotify(x, y, z, 2, 2);
        }

        if (l == 1)
        {
        	World.setBlockMetadataWithNotify(x, y, z, 5, 2);
        }

        if (l == 2)
        {
        	World.setBlockMetadataWithNotify(x, y, z, 3, 2);
        }

        if (l == 3)
        {
        	World.setBlockMetadataWithNotify(x, y, z, 4, 2);
        }

        
    }

    public static void updateFurnaceBlockState(boolean B, World W, int x, int y, int z)
    {
    	  int l = W.getBlockMetadata(x, y, z);
          TileEntity tileentity = W.getTileEntity(x, y, z);
          EE = true;

          if (B)
          {
              W.setBlock(x, y, z, ModGui.lit_YZJ);
          }
          else
          {
              W.setBlock(x, y, z, ModGui.YZJ);

          }

          EE = false;
          W.setBlockMetadataWithNotify(x, y, z, l, 2);

          if (tileentity != null)
          {
              tileentity.validate();
              W.setTileEntity(x, y, z, tileentity);
          }
        }
public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
	return NERConfigHandler.booleanwrench ? 
			Item.getItemFromBlock(ModBlocks.BlockWaike) : Item.getItemFromBlock(ModGui.YZJ);
    }
@SideOnly(Side.CLIENT)
public Item getItem(World w, int x, int y, int z)
{
    return Item.getItemFromBlock(ModGui.YZJ);
}
    }

  


