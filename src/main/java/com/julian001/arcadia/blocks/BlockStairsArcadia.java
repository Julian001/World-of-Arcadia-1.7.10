package com.julian001.arcadia.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.lib.References;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockStairsArcadia extends BlockStairs {

	protected BlockStairsArcadia(Block block, int meta, String name) {
		super(block, meta);
		this.setCreativeTab(arcadia.tabArcadiaBlocks);
        setBlockName(References.ID + "_" + name);
		GameRegistry.registerBlock(this, name);
	}
}