package com.julian001.arcadia.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.julian001.arcadia.items.itemblock.ItemBlockOreStorageArcadia;
import com.julian001.arcadia.lib.References;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockOreStorageArcadia extends BlockMetadataArcadia {

	private IIcon[] icons;
	public BlockOreStorageArcadia(String name, int maxMeta) {
		super(maxMeta, Material.iron);
		setStepSound(Block.soundTypeMetal);
		setBlockName(References.ID + "_" + name);
		GameRegistry.registerBlock(this, ItemBlockOreStorageArcadia.class, name);
		icons = new IIcon[maxMeta];
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
		switch(meta) {
	        case 0: return icons[0];
	        case 1: { switch(side) {
	        		case 0: return icons[2];
	                case 1: return icons[1];
	                default: return icons[3];}}
	        case 2: return icons[2];
	        case 3: return icons[3];
	        case 4: return icons[4];
	        case 5: return icons[5];
	        case 6: return icons[6];
	        default: return icons[0];
		}
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