package com.julian001.arcadia.items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.julian001.arcadia.arcadia;

public class ItemMetadataArcadia extends Item {
	
	private IIcon[] icons;
	public ItemMetadataArcadia(int maxMeta) {
		this.setCreativeTab(arcadia.tabArcadiaItems);
		setHasSubtypes(true);
		icons = new IIcon[maxMeta];
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void getSubItems(Item item, CreativeTabs creativeTabs, List list) {
		for(int i = 0; i < icons.length; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}
	
	@Override
	public int getMetadata(int meta) {
		return meta;
	}
}