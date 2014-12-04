package com.julian001.arcadia.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.julian001.arcadia.items.ItemsArcadia;
import com.julian001.arcadia.items.itemblock.ItemBlockOreArcadia;
import com.julian001.arcadia.lib.References;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockOreArcadia extends BlockMetadataArcadia {

	private IIcon[] icons;
	public BlockOreArcadia(String name, int maxMeta) {
		super(maxMeta, Material.rock);
		setStepSound(Block.soundTypeStone);
		setResistance(5.0F);
		setBlockName(References.ID + "_" + name);
		GameRegistry.registerBlock(this, ItemBlockOreArcadia.class, name);
		icons = new IIcon[maxMeta];
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
//		switch(meta) {
//	        case 0: return icons[0];
//	        case 1: return icons[1];
//	        case 2: return icons[2];
//	        case 3: return icons[3];
//	        case 4: return icons[4];
//	        case 5: return icons[5];
//	        default: return icons[0];
//		}
		return icons[meta];
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
				default: name = "Broken";			
			}
			icons[i] = iconRegister.registerIcon(References.ID + ":ore" + name);
		}
	}
			
	public float getBlockHardness(World world, int x, int y, int z) {
		int meta = world.getBlockMetadata(x, y, z);
		switch (meta) {
			case 0: return 3.0F;
			case 1: return 2.5F;
			case 2: return 2.5F;
			case 3: return 2.0F;
			case 4: return 4.0F;
			case 5: return 4.0F;
			default: return 3.0F;
		 }
    }
	
	public Item getItemDropped(int meta, Random random, int fortune) {
		switch (meta) {
			case 4: return ItemsArcadia.ingotArcadia;
			case 5: return ItemsArcadia.ingotArcadia;
			default: return Item.getItemFromBlock(BlocksArcadia.oreArcadia);
		}
	}
	
	public int damageDropped(int meta, Random random, int fortune) {
		switch (meta) {
			case 4: return 5;
			case 5: return 6;
			default: return meta;
		}
	}
	
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta) {
		switch(meta) {
    		case 4: this.dropXpOnBlockBreak(world, x, y, z, 4);break;
			case 5: this.dropXpOnBlockBreak(world, x, y, z, 4);break;
			default: break;
       	}
    }
}