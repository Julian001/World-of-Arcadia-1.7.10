package com.julian001.arcadia.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.lib.References;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemArcadia extends Item {
	public ItemArcadia(String name) {
		setCreativeTab(arcadia.tabArcadiaItems);
		setUnlocalizedName(References.ID + "_" + name);
		setTextureName(References.ID + ":" + name);
		GameRegistry.registerItem(this, name);
	}
}