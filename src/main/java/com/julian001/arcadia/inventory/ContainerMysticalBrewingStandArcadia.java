package com.julian001.arcadia.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.julian001.arcadia.tileentities.TileEntityMysticalBrewingStandArcadia;

public class ContainerMysticalBrewingStandArcadia extends Container {

	public TileEntityMysticalBrewingStandArcadia tileEntity;
	public ContainerMysticalBrewingStandArcadia(InventoryPlayer inventoryplayer, World world, int x, int y, int z) {
		
		tileEntity = (TileEntityMysticalBrewingStandArcadia) world.getTileEntity(x, y, z);
		this.addSlotToContainer(new Slot(tileEntity, 0, 26, 53));
		this.addSlotToContainer(new Slot(tileEntity, 1, 79, 17));
		this.addSlotToContainer(new Slot(tileEntity, 2, 79, 53));
		
		for (int i1 = 0; i1 < 3; i1++) {
			for (int l1 = 0; l1 < 9; l1++) {
				this.addSlotToContainer(new Slot(inventoryplayer, l1 + i1 * 9
						+ 9, 8 + l1 * 18, 84+ i1 * 18));
			}
		}
		
		for (int j1 = 0; j1 < 9; j1++) {
			this.addSlotToContainer(new Slot(inventoryplayer, j1, 8 + j1 * 18, 142));
		}
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return true;
	}
	
	public ItemStack transferStackInSlot(EntityPlayer player, int slotIndex)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(slotIndex);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (slotIndex < tileEntity.getSizeInventory())
            {
                if (!this.mergeItemStack(itemstack1, tileEntity.getSizeInventory(), inventorySlots.size(), true))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 0, tileEntity.getSizeInventory(), false))
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
}