package com.julian001.arcadia.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;


public class ItemMysticalPowder extends ItemArcadia {

	public ItemMysticalPowder(String name) {
		super(name);
	}
	
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack itemStack) {
        return true;
    }
	
    public EnumRarity getRarity(ItemStack itemStack) {
        return EnumRarity.epic;
    }
}