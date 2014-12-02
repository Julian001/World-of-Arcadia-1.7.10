package com.julian001.arcadia.inventory;

import java.util.Set;
import java.util.UUID;

import com.julian001.arcadia.lib.References;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class PlayerSlot extends Slot {

	private final Set<UUID> itemInvUUIDs;
	public PlayerSlot(IInventory playerInv, int slot, int x, int y, Set<UUID> itemInvUUIDs) {
		super(playerInv, slot, x, y);
		this.itemInvUUIDs = itemInvUUIDs;
	}

	@Override
	public boolean canTakeStack(EntityPlayer player) {
		ItemStack stack = getStack();
		if (stack == null || stack.stackTagCompound == null) {
			return true;
		}
		UUID stackUUID = uuid(stack);
		return stackUUID == null || itemInvUUIDs.contains(stackUUID);
	}
	
	private static UUID uuid(ItemStack itemStack) {	
		if (itemStack.stackTagCompound == null || !itemStack.stackTagCompound.hasKey(References.ID + ".bagUUID")) {
			return null;
		}
		return UUID.fromString(itemStack.stackTagCompound.getString(References.ID + ".bagUUID"));
	}
}