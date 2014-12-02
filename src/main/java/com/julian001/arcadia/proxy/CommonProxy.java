package com.julian001.arcadia.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.julian001.arcadia.tileentities.TileEntityAnvilArcadia;

import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy implements IGuiHandler{

	public void registerTileEntities() {
		 
        GameRegistry.registerTileEntity(TileEntityAnvilArcadia.class, TileEntityAnvilArcadia.publicName);
    }

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}
}