package com.julian001.arcadia.items.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.lib.References;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemArmorArcadia extends ItemArmor {

	public String textureName;
	public ItemArmorArcadia(String name, ArmorMaterial material, String textureName, int type) {
		super(material, 0, type);
		setCreativeTab(arcadia.tabArcadiaItems);
		setUnlocalizedName(References.ID + "_" + name);
		setTextureName(References.ID + ":" + name);
		GameRegistry.registerItem(this, name);
		this.textureName = textureName;
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
	    return References.ID + ":textures/armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}
}