package com.julian001.arcadia.blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.lib.References;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSlabArcadia extends BlockSlab
{
    //public static final String[] types = new String[] {"Silver", "Copper", "Tin", "Lead", "Ruby", "Sapphire", "Bronze"};
    //private static final String __OBFID = "CL_00000337";
    private int maxMeta;
    private boolean isDouble;
    private BlockSlabArcadia singleslab;
    private Block materialBlock;
    private IIcon[] icons;

    public BlockSlabArcadia(String name, int maxMeta, Block b, boolean isDouble) {
        super(isDouble, Material.iron);
        useNeighborBrightness = true;
        setBlockName(References.ID + "_" + name);
        if(!isDouble)this.setCreativeTab(arcadia.tabArcadiaBlocks);
        //GameRegistry.registerBlock(this, ItemBlockSlabArcadia.class, name);
		this.maxMeta = maxMeta;
		this.materialBlock = b;
		this.isDouble = isDouble;
		icons = new IIcon[maxMeta];
    }
    
    public BlockSlabArcadia(String name, int maxMeta, Block b, boolean isDouble, BlockSlabArcadia single) {
        super(isDouble, Material.iron);
        useNeighborBrightness = true;
        setBlockName(References.ID + "_" + name);
        if(!isDouble)this.setCreativeTab(arcadia.tabArcadiaBlocks);
        //GameRegistry.registerBlock(this, ItemBlockSlabArcadia.class, name);
		this.maxMeta = maxMeta;
		this.materialBlock = b;
		this.isDouble = isDouble;
		icons = new IIcon[maxMeta];
		this.singleslab = single;
    }
    
    public String func_150002_b(int meta) {
    	return this.getUnlocalizedName();
	}
    
    @Override
    @SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
    	return this.materialBlock.getIcon(side, meta);
	}
    //TODO return metadata
    @Override
	public Item getItemDropped(int par1, Random rand, int par3) {
		//singleslab = Item.getItemFromBlock(new ItemStack(singleslab, 1, par1));
		//return isDouble ? Item.getItemFromBlock(new ItemStack(singleslab,1,1)) : Item.getItemFromBlock(this);
    	return isDouble ? Item.getItemFromBlock(singleslab) : Item.getItemFromBlock(this);
	}
    
    @Override
	@SideOnly(Side.CLIENT)
	public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_) {
		if (this.isDouble) return Item.getItemFromBlock(singleslab);
		else return Item.getItemFromBlock(this);
	}
    
    @Override
	public int damageDropped(int meta) {
		return meta;
	}
	
	@Override
	public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list) {
		for(int i = 0; i < maxMeta; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}
    
//    @Override
//    public void registerBlockIcons(IIconRegister iconRegister) {
//		for(int i = 0; i< icons.length; i++) {
//			String name = "";
//			switch(i) {
//				case 0: {name = "Silver";break;}
//				case 1: {name = "Copper";break;}
//				case 2: {name = "Tin";break;}
//				case 3: {name = "Lead";break;}
//				case 4: {name = "Ruby";break;}
//				case 5: {name = "Sapphire";break;}
//				case 6: {name = "Bronze";break;}
//				default: name = "Broken";			
//			}
//			icons[i] = iconRegister.registerIcon(References.ID + ":block" + name);
//		}
//    	/*for(int i = 0; i < icons.length; i++) {
//    		icons[i] = iconRegister.registerIcon((new ItemStack(BlocksArcadia.oreBlockArcadia, 1, i)).getUnlocalizedName());
//    	}*/
//		/*for (int i = 0; i < types.length; ++i) 
//		{
//			icons[i] = iconRegister.registerIcon(References.ID + ":block"+ types[i]);
//		}*/
//	}
//
//    /**
//     * Gets the block's texture. Args: side, meta
//     *
//    @SideOnly(Side.CLIENT)
//    public IIcon getIcon(int side, int meta)
//    {
//        return Blocks.planks.getIcon(side, meta & 7);
//    }*/
//    
//
//    
//    /**
//     * Called when a block is placed using its ItemBlock. Args: World, X, Y, Z, side, hitX, hitY, hitZ, block metadata
//     */
//    public int onBlockPlaced(World world, int x, int y, int z, int p_149660_5_, float p_149660_6_, float p_149660_7_, float p_149660_8_, int p_149660_9_)
//    {
//        return this.field_150004_a ? p_149660_9_ : (p_149660_5_ != 0 && (p_149660_5_ == 1 || (double)p_149660_7_ <= 0.5D) ? p_149660_9_ : p_149660_9_ | 8);
//    }
//    /*public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
//    {
//        return Item.getItemFromBlock(Blocks.wooden_slab);
//    }
//
//    /**
//     * Returns an item stack containing a single instance of the current block type. 'i' is the block's subtype/damage
//     * and is ignored for blocks which do not support subtypes. Blocks which cannot be harvested should return null.
//     */
//    protected ItemStack createStackedBlock(int meta)
//    {
//        //return new ItemStack(Item.getItemFromBlock(BlocksArcadia.doubleSlabSilver), 2, p_149644_1_ & 7);
//    	return new ItemStack(this, 2, meta);
//    }
//    //getFullSlabName(
//    
//    /*public String getFullSkabName(int par1)
//    {
//        if (par1 < 0 || par1 >= types.length)
//        {
//            par1 = 0;
//        }
//
//        return super.getUnlocalizedName() + "." + types[par1];
//    }*/
//    
///*
//    @Override
//	public String func_150002_b(int p_150002_1_) {
//		return this.getUnlocalizedName();
//	}*/
//    /**
//     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
//     * @param item 
//     */
//    @SideOnly(Side.CLIENT)
//    public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list)
//    {
//        if (item != Item.getItemFromBlock(BlocksArcadia.doubleSlabSilver))
//        {
//            for (int i = 0; i < icons.length; ++i)
//            {
//                list.add(new ItemStack(item, 1, i));
//            }
//        }
//    }
//    
//    @Override
//    public int damageDropped(int meta) {
//		return 0;
//	}
//    
//    @Override
//    public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z)
//    {
//		return new ItemStack(BlocksArcadia.slabSilver);
//	}
//    
//    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving)
//    {
//	    if(par1World.getBlock(par2, par3 - 1, par4) == BlocksArcadia.slabSilver)
//	    {
//	    	par1World.setBlock(par2, par3 - 1, par4, BlocksArcadia.doubleSlabSilver);
//	    }
//	    if(par1World.getBlock(par2, par3 + 1, par4) == BlocksArcadia.slabSilver)
//	    {
//	    	par1World.setBlock(par2, par3 + 1, par4, BlocksArcadia.doubleSlabSilver);
//	    }
//    }
//    
//    private int getWoodType(int meta)
//	{
//		return 0;
//	}
}