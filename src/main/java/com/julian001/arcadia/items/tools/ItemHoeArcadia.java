package com.julian001.arcadia.items.tools;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.lib.References;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemHoeArcadia extends ItemHoe {

	public ItemHoeArcadia(String name, ToolMaterial material) {
		super(material);
		setCreativeTab(arcadia.tabArcadiaItems);
		setUnlocalizedName(References.ID + "_" + name);
		setTextureName(References.ID + ":" + name);
		GameRegistry.registerItem(this, name);
	}
}