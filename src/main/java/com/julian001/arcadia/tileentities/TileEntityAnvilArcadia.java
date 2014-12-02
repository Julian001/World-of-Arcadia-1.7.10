package com.julian001.arcadia.tileentities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.lib.GUIs;

public class TileEntityAnvilArcadia extends TileEntity {

	int tick = 0;
	public static final String publicName = "tileEntityAnvilArcadia";
	private String name = "tileEntityAnvilArcadia";
	
	public String getName() {
		return name;
	}
}