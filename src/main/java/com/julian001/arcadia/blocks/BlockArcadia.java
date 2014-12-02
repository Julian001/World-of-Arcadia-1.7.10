package com.julian001.arcadia.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.lib.References;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockArcadia extends Block {
	
	public BlockArcadia(String name, Material material) {
		super(material);
		setCreativeTab(arcadia.tabArcadiaBlocks);
		setBlockName(References.ID + "_" + name);
		setBlockTextureName(References.ID + ":" + name);
		GameRegistry.registerBlock(this, name);
	}
}