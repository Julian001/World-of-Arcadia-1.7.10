package com.julian001.arcadia.inventory;

import java.util.Set;
import java.util.UUID;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

import com.google.common.collect.ImmutableSet;

public class ContainerBagArcadia extends Container {

	static final int PLAYER_INV_Y_DEFAULT = 84;
	static final int PLAYER_INV_X_DEFAULT = 8;
	private static final int SLOT_HEIGHT = 18;
	public InventoryBagArcadia inventoryBagArcadia;
	public ContainerBagArcadia(InventoryPlayer inventoryPlayer, InventoryBagArcadia inventoryBagArcadia) {
		this.inventoryBagArcadia = inventoryBagArcadia;
		Set<UUID> allItemInvs = ImmutableSet.of(inventoryBagArcadia.uuid);
		
		switch(inventoryBagArcadia.getSizeInventory()){
			case 9: 
				for(int y = 0; y < 3; y++) {
					for(int x = 0; x < 3; x++) {
						this.addSlotToContainer(new Slot(inventoryBagArcadia, x + y * 3, x * 18 + 62, y * 18 + 17));
					}
				}
				break;
			case 27: 
				for(int y = 0; y < 3; y++) {
					for(int x = 0; x < 9; x++) {
						this.addSlotToContainer(new Slot(inventoryBagArcadia, x + y * 9, x * 18 + 8, y * 18 + 18));
					}
				}
				break;
			case 54: 
				for(int y = 0; y < 6; y++) {
					for(int x = 0; x < 9; x++) {
						this.addSlotToContainer(new Slot(inventoryBagArcadia, x + y * 9, x * 18 + 8, y * 18 + 18));
					}
				}
				break;
		}
		
		int playerX = 0,playerY = 0;
		
		switch(inventoryBagArcadia.getSizeInventory()){
			case 9: playerX = PLAYER_INV_X_DEFAULT; playerY = PLAYER_INV_Y_DEFAULT;break;
			case 27: playerX = PLAYER_INV_X_DEFAULT; playerY = PLAYER_INV_Y_DEFAULT + 2;break;
			case 54: playerX = PLAYER_INV_X_DEFAULT; playerY = PLAYER_INV_Y_DEFAULT + 56;break;
		}
		for(int y = 0; y < 3; y++) {
			for(int x = 0; x < 9; x++) {
				this.addSlotToContainer( new PlayerSlot(inventoryPlayer, x + y * 9 + 9, playerX + x * SLOT_HEIGHT, playerY + y * SLOT_HEIGHT, allItemInvs));
			}
		}
		for (int k = 0; k < 9; k++) {
			this.addSlotToContainer( new PlayerSlot(inventoryPlayer, k, playerX + k * 18, playerY + 58, allItemInvs));
		}
	}
	
	public ItemStack transferStackInSlot(EntityPlayer player, int slotIndex)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(slotIndex);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (slotIndex < inventoryBagArcadia.getSizeInventory())
            {
                if (!this.mergeItemStack(itemstack1, inventoryBagArcadia.getSizeInventory(), inventorySlots.size(), true))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 0, inventoryBagArcadia.getSizeInventory(), false))
            {
                return null;
            }

            if (itemstack1.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }
        }
        
        return itemstack;
    }
	
	
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return true;
	}
}