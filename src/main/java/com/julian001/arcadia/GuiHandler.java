package com.julian001.arcadia;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.julian001.arcadia.blocks.BlocksArcadia;
import com.julian001.arcadia.gui.GuiAnvilArcadia;
import com.julian001.arcadia.gui.GuiBagArcadia;
import com.julian001.arcadia.gui.GuiMysticalBrewingStandArcadia;
import com.julian001.arcadia.inventory.ContainerAnvilArcadia;
import com.julian001.arcadia.inventory.ContainerBagArcadia;
import com.julian001.arcadia.inventory.ContainerMysticalBrewingStandArcadia;
import com.julian001.arcadia.inventory.InventoryBagArcadia;
import com.julian001.arcadia.lib.GUIs;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		GUIs gui = GUIs.values()[ID];
		switch(gui) {
			case ANVILARCADIA: return world.getBlock(x, y, z) == BlocksArcadia.anvilArcadia ? new ContainerAnvilArcadia(player.inventory, world, x, y, z) : null;
			case BAG: { InventoryBagArcadia inv = getInventory(x, player);
				if(inv == null) {
					return null;
				}
				return new ContainerBagArcadia(player.inventory, inv);
			}
			case BREWINGSTAND: return world.getBlock(x, y, z) == BlocksArcadia.mysticalBrewingStand ? new ContainerMysticalBrewingStandArcadia(player.inventory, world, x, y, z) : null;
			default: return null;
		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		GUIs gui = GUIs.values()[ID];
		switch(gui) {
		    case ANVILARCADIA: return world.getBlock(x, y, z) == BlocksArcadia.anvilArcadia ? new GuiAnvilArcadia(player.inventory, world, x, y, z) : null;
		    case BAG: {
					InventoryBagArcadia inv = getInventory(x, player);
					if(inv == null) {
						return null;
					}
					return new GuiBagArcadia(new ContainerBagArcadia(player.inventory, inv));
				}
		    case BREWINGSTAND: return world.getBlock(x, y, z) == BlocksArcadia.mysticalBrewingStand ? new GuiMysticalBrewingStandArcadia(player.inventory, world, x, y, z) : null;
		    default: return null;
		}
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