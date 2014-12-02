package com.julian001.arcadia.items;

import java.util.List;

import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.lib.References;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemIngotArcadia extends ItemMetadataArcadia {
	
	private IIcon[] icons;
	public ItemIngotArcadia(String name, int maxMeta) {
		super(maxMeta);
		setUnlocalizedName(References.ID + "_" + name);
		GameRegistry.registerItem(this, name);
		icons = new IIcon[maxMeta];
	}
	
	@Override
	public void registerIcons(IIconRegister iconRegister) {
		for(int i = 0; i < icons.length; i++) {
			String name = "";
			switch(i) {
				case 0: {name = "ingotSilver";break;}
				case 1: {name = "ingotCopper";break;}
				case 2: {name = "ingotTin";break;}
				case 3: {name = "ingotLead";break;}
				case 4: {name = "gemRuby";break;}
				case 5: {name = "gemSapphire";break;}
				case 6: {name = "ingotBronze";break;}
				case 7: {name = "blankBronze";break;}
				default: name = "Broken";			
			}
			icons[i] = iconRegister.registerIcon(References.ID + ":" + name);
		}
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int meta) {
		return icons[meta];
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		String name = "";
		switch(itemStack.getItemDamage()) {
			case 0: {name = "ingotSilver";break;}
			case 1: {name = "ingotCopper";break;}
			case 2: {name = "ingotTin";break;}
			case 3: {name = "ingotLead";break;}
			case 4: {name = "gemRuby";break;}
			case 5: {name = "gemSapphire";break;}
			case 6: {name = "ingotBronze";break;}
			case 7: {name = "blankBronze";break;}
			default: name = "Broken";
		}
		return getUnlocalizedName() + "." + name;
	}
}