package com.julian001.arcadia.items.tools;

import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.lib.References;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ItemShovelArcadia extends ItemSpade {
	
	public ItemShovelArcadia(String name, ToolMaterial material) {
		super(material);
		setCreativeTab(arcadia.tabArcadiaItems);
		setUnlocalizedName(References.ID + "_" + name);
		setTextureName(References.ID + ":" + name);
		GameRegistry.registerItem(this, name);
	}
}