package com.julian001.arcadia.blocks;

import java.util.List;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.items.itemblock.ItemBlockOreStorageArcadia;
import com.julian001.arcadia.lib.References;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CopyOfBlockFenceArcadia extends BlockFence {

	private IIcon[] icons;
	private int maxMeta;
	private static String texture;
	
	public CopyOfBlockFenceArcadia(String name, Material material, int maxMeta) {
		super(texture, material);
		
		
		
		setCreativeTab(arcadia.tabArcadiaBlocks);
		setResistance(10.0F);
		setStepSound(soundTypeMetal);
		setBlockName(References.ID + "_" + name);
		//System.out.println(setBlockTextureName(References.ID + ":" + textureName));
		GameRegistry.registerBlock(this, ItemBlockOreStorageArcadia.class, name);
		icons = new IIcon[maxMeta];
		this.maxMeta=maxMeta;
		
		
	}

	/*public boolean canConnectFenceTo(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        Block block = par1IBlockAccess.getBlock(par2, par3, par4);
        if(block != this && block != (Blocks.nether_brick_fence) && block != (Blocks.fence) && block != (Blocks.fence_gate)) {
        	Block block = Blocks..blockRegistry[block];
        }
    }*/
	

	@Override
	public int damageDropped(int meta) {
		return meta;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list) {
		for(int i = 0; i < maxMeta; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}
	
	@SuppressWarnings("unused")
	private String getTextureFence() {
		for(int i = 0; i < icons.length; i++) {
			
			switch(i) {
				case 0: {return texture = "Silver";}
				case 1: {return texture = "Copper";}
				case 2: {return texture = "Tin";}
				case 3: {return texture = "Lead";}
				case 4: {return texture = "Ruby";}
				case 5: {return texture = "Sapphire";}
				case 6: {return texture = "Bronze";}
				default: return texture = "Broken";			
			}
		}
		return null;
	}
	
	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		for(int i = 0; i < icons.length; i++) {
			String name = "";
			switch(i) {
				case 0: {name = "Silver";break;}
				case 1: {name = "Copper";break;}
				case 2: {name = "Tin";break;}
				case 3: {name = "Lead";break;}
				case 4: {name = "Ruby";break;}
				case 5: {name = "Sapphire";break;}
				case 6: {name = "Bronze";break;}
				default: name = "Broken";			
			}
			icons[i] = iconRegister.registerIcon(References.ID + ":block" + name);
		}
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return icons[meta];
	}
		
	public float getBlockHardness(World world, int x, int y, int z) {
		int meta = world.getBlockMetadata(x, y, z);
		switch (meta) {
			case 0: return 5.0F;
			case 1: return 2.5F;
			case 2: return 2.5F;
			case 3: return 2.0F;
			case 4: return 6.0F;
			case 5: return 6.0F;
			case 6: return 5.0F;
		    default: return 4.0F;
		 }
    }
}