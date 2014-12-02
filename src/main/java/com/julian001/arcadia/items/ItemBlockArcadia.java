package com.julian001.arcadia.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockArcadia extends ItemBlock {

	public ItemBlockArcadia(Block block) {
		super(block);
		setHasSubtypes(true);
	}
	
	@Override
	public int getMetadata(int meta) {
		return meta;
	}
}