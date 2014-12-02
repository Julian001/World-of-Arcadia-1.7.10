package com.julian001.arcadia.items;

import net.minecraft.item.ItemFood;

import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.lib.References;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemFoodArcadia extends ItemFood {
	public ItemFoodArcadia(String name,int heal, float saturation, boolean wolfmeat) {
		super(heal, saturation, wolfmeat);
		setCreativeTab(arcadia.tabArcadiaItems);
		setUnlocalizedName(References.ID + "_" + name);
		setTextureName(References.ID + ":" + name);
		GameRegistry.registerItem(this, name);
	}
}