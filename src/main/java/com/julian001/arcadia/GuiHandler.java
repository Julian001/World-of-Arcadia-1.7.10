package com.julian001.arcadia;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.julian001.arcadia.gui.GuiAnvilArcadia;
import com.julian001.arcadia.gui.GuiBagArcadia;
import com.julian001.arcadia.gui.GuiBagBigArcadia;
import com.julian001.arcadia.gui.GuiBagMediumArcadia;
import com.julian001.arcadia.gui.GuiBagSmallArcadia;
import com.julian001.arcadia.inventory.ContainerBagArcadia;
import com.julian001.arcadia.inventory.ContainerBagBigArcadia;
import com.julian001.arcadia.inventory.ContainerBagMediumArcadia;
import com.julian001.arcadia.inventory.ContainerBagSmallArcadia;
import com.julian001.arcadia.inventory.InventoryBagArcadia;
import com.julian001.arcadia.inventory.InventoryBagBigArcadia;
import com.julian001.arcadia.inventory.InventoryBagMediumArcadia;
import com.julian001.arcadia.inventory.InventoryBagSmallArcadia;
import com.julian001.arcadia.lib.GUIs;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == GUIs.BAGSMALL.ordinal()) return new ContainerBagSmallArcadia(player, player.inventory, new InventoryBagSmallArcadia(player.getHeldItem()));
		if(ID == GUIs.BAGMEDIUM.ordinal()) return new ContainerBagMediumArcadia(player, player.inventory, new InventoryBagMediumArcadia(player.getHeldItem()));
		if(ID == GUIs.BAGBIG.ordinal()) return new ContainerBagBigArcadia(player, player.inventory, new InventoryBagBigArcadia(player.getHeldItem()));
		if(ID == GUIs.BAG.ordinal()) {
			InventoryBagArcadia inv = getInventory(x, player);
			if(inv == null) {
				return null;
			}
			return new ContainerBagArcadia(player.inventory, inv);
		}
		else return null;
			
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == GUIs.ANVILARCADIA.ordinal()) return new GuiAnvilArcadia(player, world, x, y, z);
		if(ID == GUIs.BAGSMALL.ordinal()) return new GuiBagSmallArcadia((ContainerBagSmallArcadia) new ContainerBagSmallArcadia(player, player.inventory, new InventoryBagSmallArcadia(player.getHeldItem())));
		if(ID == GUIs.BAGMEDIUM.ordinal()) return new GuiBagMediumArcadia((ContainerBagMediumArcadia) new ContainerBagMediumArcadia(player, player.inventory, new InventoryBagMediumArcadia(player.getHeldItem())));
		if(ID == GUIs.BAGBIG.ordinal()) return new GuiBagBigArcadia((ContainerBagBigArcadia) new ContainerBagBigArcadia(player, player.inventory, new InventoryBagBigArcadia(player.getHeldItem())));
		if(ID == GUIs.BAG.ordinal()) {
			InventoryBagArcadia inv = getInventory(x, player);
			if(inv == null) {
				return null;
			}
			return new GuiBagArcadia(new ContainerBagArcadia(player.inventory, inv));
		}
        else return null;
	}

	public InventoryBagArcadia getInventory(int x, EntityPlayer player) {
		switch(x) {
			case 0: return new InventoryBagArcadia(9, player.getHeldItem(), player);
			case 1: return new InventoryBagArcadia(27, player.getHeldItem(), player);
			case 2: return new InventoryBagArcadia(54, player.getHeldItem(), player);
			default: return null;
		}
	}
}