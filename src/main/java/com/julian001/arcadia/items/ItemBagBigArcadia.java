package com.julian001.arcadia.items;


import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import org.lwjgl.input.Keyboard;

import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.inventory.ContainerBagBigArcadia;
import com.julian001.arcadia.lib.GUIs;
import com.julian001.arcadia.lib.GuiIds;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBagBigArcadia extends ItemArcadia
{
	public ItemBagBigArcadia(String name)
	{
		super(name);
		this.maxStackSize = 1;
	}
	
	/**
	* Called every tick while there is an ItemInventory in the player's inventory
	* This is the method we will use to access the GUI and also to write to NBT
	* when necessary
	*/
//	@Override
//	public void onUpdate(ItemStack itemstack, World world, Entity entity, int par4, boolean isCurrentItem)
//	{
//		/*
//		Only Player's will be accessing the GUI, so check if entity is a player.
//		
//		Note that if you need your container / inventory contents updated client side
//		then remove the '!world.isRemote' statement. A case where you might want this
//		would be if your inventory has an 'active' slot, such as a currently selected
//		spell in a spellbook and you need to know which spell that while the Gui is open
//		client side so you can render something on screen. This is because NBT data is
//		stored separately client and server side, and when you open the gui, the client
//		asks for the server NBT data, but if you change it while the gui is open, only
//		the server will know about it with the code below, so the client NBT won't be
//		updated until the gui is closed and reopened. Usually, this is not a problem.
//		
//		For most inventories, we only care about the NBT stored server side and everything
//		else will update itself automatically.
//		*/
//		if (!world.isRemote && entity instanceof EntityPlayer)
//		{
//			// Cast Entity parameter as an EntityPlayer
//			EntityPlayer player = (EntityPlayer) entity;
//			
//			/*
//			Check if the player is not in a menu, if key 'I' is pressed and the player is currently holding the correct type of item (an ItemInventory).
//			*/
//			if (FMLClientHandler.instance().getClient().inGameHasFocus
//			&& Keyboard.isKeyDown(Keyboard.KEY_I) &&
//			player.getHeldItem() != null && player.getHeldItem().getItem() instanceof ItemBagBigArcadia)
//			{
//				// Open the correct GUI for the player at player's position
//				player.openGui(arcadia.instance, GUIs.BAGBIG.ordinal(), world, (int) player.posX, (int) player.posY, (int) player.posZ);
//			}
//			
//			// If our ContainerItem is currently open, write contents to NBT when needsUpdate is true
//			if(player.openContainer != null && player.openContainer instanceof ContainerBagBigArcadia
//			&& ((ContainerBagBigArcadia) player.openContainer).needsUpdate)
//			{
//				((ContainerBagBigArcadia) player.openContainer).writeToNBT();
//				// Set needsUpdate back to false so we don't continually write to NBT
//				((ContainerBagBigArcadia) player.openContainer).needsUpdate = false;
//			}
//		}
//	}*/
	/*
	NOTE: If you want to open your gui on right click and your ItemStore doesn't have a max use duration,
	you MUST override getMaxItemUseDuration to return a value of at least 1, otherwise your stored items
	will NOT be saved. This is an issue with the vanilla methods onItemUse and onItemRightClick.
	*/
	@Override
	public int getMaxItemUseDuration(ItemStack itemstack)
	{
		return 1;
	}
	
	// Choose one of these two methods:
	// 1. onItemUse
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
	{
		if (!world.isRemote)
		{
			player.openGui(arcadia.instance, GuiIds.guiBagHugeIndex, world, (int) player.posX, (int) player.posY, (int) player.posZ);
		}
		return false;
	}
	        
	// 2. onItemRightClick
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	{
		if (!world.isRemote)
		{
			player.openGui(arcadia.instance, GuiIds.guiBagHugeIndex, world, (int) player.posX, (int) player.posY, (int) player.posZ);
		}
		return itemstack;
	}
}