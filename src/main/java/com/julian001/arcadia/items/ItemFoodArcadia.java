package com.julian001.arcadia.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

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
	
	public ItemStack onEaten(ItemStack itemStack, World world, EntityPlayer player) {
        if(itemStack.getItem() == ItemsArcadia.sushiSoup) {
			super.onEaten(itemStack, world, player);
	        return new ItemStack(Items.bowl);
        }
        return null;
    }
}