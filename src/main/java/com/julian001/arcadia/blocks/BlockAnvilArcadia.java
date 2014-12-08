package com.julian001.arcadia.blocks;

import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.lib.GUIs;
import com.julian001.arcadia.tileentities.TileEntityAnvilArcadia;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockAnvilArcadia extends BlockArcadia implements ITileEntityProvider {

	public BlockAnvilArcadia(String name) {
		super(name, Material.iron);
		setHardness(5.0F);
		setStepSound(soundTypeAnvil);
		setResistance(2000.0F);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileEntityAnvilArcadia();
	}
	
	@Override
	public boolean hasTileEntity(int meta) {
		return true;
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float hitX, float hitY, float hitZ) {
       if(!world.isRemote) {
            player.openGui(arcadia.instance, GUIs.ANVILARCADIA.ordinal(), world, x, y, z);
            return true;
        }
        return true;
    }
}