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

public class ItemMetadataArcadia extends Item {
	
	private IIcon[] icons;
	private int maxMeta;
	public ItemMetadataArcadia(int maxMeta) {
		this.setCreativeTab(arcadia.tabArcadiaItems);
		setHasSubtypes(true);
		this.maxMeta = maxMeta;
		icons = new IIcon[maxMeta];
	}
	
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