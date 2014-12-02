package com.julian001.arcadia.items.tools;

import net.minecraft.item.ItemPickaxe;
import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.lib.References;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemPickaxeArcadia extends ItemPickaxe {

	public ItemPickaxeArcadia(String name, ToolMaterial material) {
		super(material);
		setCreativeTab(arcadia.tabArcadiaItems);
		setUnlocalizedName(References.ID + "_" + name);
		setTextureName(References.ID + ":" + name);
		GameRegistry.registerItem(this, name);
	}
}