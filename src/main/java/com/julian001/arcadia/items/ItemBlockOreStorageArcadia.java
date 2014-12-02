package com.julian001.arcadia.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockOreStorageArcadia extends ItemBlockArcadia {

	public ItemBlockOreStorageArcadia(Block block) {
		super(block);
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		String name = "";
		switch(itemStack.getItemDamage()) {
			case 0: {name = "Silver";break;}
			case 1: {name = "Copper";break;}
			case 2: {name = "Tin";break;}
			case 3: {name = "Lead";break;}
			case 4: {name = "Ruby";break;}
			case 5: {name = "Sapphire";break;}
			case 6: {name = "Bronze";break;}
			default: name = "noMeta";
		}
		return getUnlocalizedName() + "." + name;
	}
}