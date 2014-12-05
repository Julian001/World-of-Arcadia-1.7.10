package com.julian001.arcadia.items.itemblock;

import com.julian001.arcadia.blocks.BlockWallArcadia;

import net.minecraft.block.Block;
import net.minecraft.item.ItemMultiTexture;

public class ItemBlockWallArcadia extends ItemMultiTexture {

	private static String[] types = BlockWallArcadia.unlocalizedNames;
	public ItemBlockWallArcadia(Block par1) {
		super(par1, par1, types);
	}
}