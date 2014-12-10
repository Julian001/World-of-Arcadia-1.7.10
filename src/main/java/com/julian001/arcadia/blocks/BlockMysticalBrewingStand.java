package com.julian001.arcadia.blocks;

import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.lib.GUIs;
import com.julian001.arcadia.lib.References;
import com.julian001.arcadia.tileentities.TileEntityMysticalBrewingStandArcadia;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockMysticalBrewingStand extends BlockArcadia {

	public BlockMysticalBrewingStand(String name) {
		super(name, Material.iron);
		setBlockTextureName(References.ID + ":" + "arcadiaBlock");
	}
	
	@Override
	public boolean hasTileEntity(int metadata) {
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(World world, int metadata) {
		return new TileEntityMysticalBrewingStandArcadia();
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float hitX, float hitY, float hitZ) {
       if(!world.isRemote) {
            player.openGui(arcadia.instance, GUIs.BREWINGSTAND.ordinal(), world, x, y, z);
            return true;
        }
        return true;
    }
}