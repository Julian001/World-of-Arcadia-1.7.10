package com.julian001.arcadia.blocks;

import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.lib.References;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;

public class BlockWallArcadia extends BlockWall {

	public BlockWallArcadia(String name, Block block) {
		super(block);
		setCreativeTab(arcadia.tabArcadiaBlocks);
		setBlockName(References.ID + "_" + name);
		//setBlockTextureName(References.ID + ":" + name);
		GameRegistry.registerBlock(this, name);
	}
}