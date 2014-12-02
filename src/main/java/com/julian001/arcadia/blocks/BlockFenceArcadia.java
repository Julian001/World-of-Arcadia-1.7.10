package com.julian001.arcadia.blocks;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;

import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.lib.References;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockFenceArcadia extends BlockFence {

	public BlockFenceArcadia(String name, String texture, Material material) {
		super(References.ID + ":" + texture, material);
		this.setCreativeTab(arcadia.tabArcadiaBlocks);
		this.setResistance(10.0F);
		this.setStepSound(soundTypeMetal);
		setBlockName(References.ID + "_" + name);
		//System.out.println(setBlockTextureName(References.ID + ":" + textureName));
		GameRegistry.registerBlock(this, name);
	}

	/*public boolean canConnectFenceTo(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        Block block = par1IBlockAccess.getBlock(par2, par3, par4);
        if(block != this && block != (Blocks.nether_brick_fence) && block != (Blocks.fence) && block != (Blocks.fence_gate)) {
        	Block block = Blocks..blockRegistry[block];
        }
    }*/
}