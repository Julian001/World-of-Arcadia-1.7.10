package com.julian001.arcadia.items.tools;

import net.minecraft.item.ItemAxe;
import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.lib.References;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemAxeArcadia extends ItemAxe {

	public ItemAxeArcadia(String name, ToolMaterial material) {
		super(material);
		setCreativeTab(arcadia.tabArcadiaItems);
		setUnlocalizedName(References.ID + "_" + name);
		setTextureName(References.ID + ":" + name);
		GameRegistry.registerItem(this, name);
	}
}