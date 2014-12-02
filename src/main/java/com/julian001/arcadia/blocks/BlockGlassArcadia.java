package com.julian001.arcadia.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGlassArcadia extends BlockArcadia {

	private boolean par2boolean;
	public BlockGlassArcadia(String name, Material material, boolean par2boolean) {
		super(name, material);
		setStepSound(soundTypeGlass);
		this.par2boolean = par2boolean;
	}
	
    public int quantityDropped(Random random) {
        return 0;
    }

    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass() {
        return 0;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    protected boolean canSilkHarvest() {
        return true;
    }
    
    public boolean isOpaqueCube() {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess blockAccess, int x, int y, int z, int side) {
        Block block = blockAccess.getBlock(x, y, z);
        if (block == this)
            return false;
        return !this.par2boolean && block == this ? false : super.shouldSideBeRendered(blockAccess, x, y, z, side);
    }
}