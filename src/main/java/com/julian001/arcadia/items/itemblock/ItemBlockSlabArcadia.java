package com.julian001.arcadia.items.itemblock;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

import com.julian001.arcadia.blocks.BlockSlabArcadia;

public class ItemBlockSlabArcadia extends ItemSlab{

	public ItemBlockSlabArcadia(Block block, BlockSlabArcadia singleSlab, BlockSlabArcadia doubleSlab, Boolean isDouble) {
		super(block, singleSlab, doubleSlab, isDouble);
	}
}