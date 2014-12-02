package com.julian001.arcadia.blocks;

import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.lib.References;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockArcadia extends Block {
	
	public BlockArcadia(String name, Material material) {
		super(material);
		setCreativeTab(arcadia.tabArcadiaBlocks);
		setBlockName(References.ID + "_" + name);
		setBlockTextureName(References.ID + ":" + name);
		GameRegistry.registerBlock(this, name);
	}
}