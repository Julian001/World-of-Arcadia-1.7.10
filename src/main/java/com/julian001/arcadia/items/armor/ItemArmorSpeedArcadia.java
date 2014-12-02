package com.julian001.arcadia.items.armor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.julian001.arcadia.items.ItemsArcadia;

public class ItemArmorSpeedArcadia extends ItemArmorArcadia {

	public ItemArmorSpeedArcadia(String name, ArmorMaterial material, String textureName, int type) {
		super(name, material, textureName, type);
	}
		
	@Override//getCurrentArmor() 0=boots,1=leggings...
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals(ItemsArcadia.leggingsRuby)) {
		    player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 10, 2));
		 	player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 10, 2));
		}
	}
}