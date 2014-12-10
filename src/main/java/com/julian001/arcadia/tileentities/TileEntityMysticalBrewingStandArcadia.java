package com.julian001.arcadia.tileentities;

import com.julian001.arcadia.blocks.BlocksArcadia;
import com.julian001.arcadia.items.ItemsArcadia;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class TileEntityMysticalBrewingStandArcadia extends TileEntity implements ISidedInventory {

	ItemStack[] inventoryItemStack = new ItemStack[2];
	private int fuelTime;
	
	@Override
	public int getSizeInventory() {
		return inventoryItemStack.length;
	}

	@Override
	public ItemStack getStackInSlot(int slot) {
		return inventoryItemStack[slot];
	}

	@Override
	public ItemStack decrStackSize(int slot, int count) {
		ItemStack stack = this.getStackInSlot(slot);
		if (stack != null) {
			ItemStack returnStack;
			if (stack.stackSize <= count) {
				returnStack = stack;
				this.setInventorySlotContents(slot, null);
				return returnStack;
			} else {
				returnStack = stack.splitStack(count);
				if (stack.stackSize == 0) {
					this.setInventorySlotContents(slot, null);
				} else {
					this.markDirty();
				}
				return returnStack;
			}
		} else {
			return null;
		}
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int slot) {
		ItemStack stack = inventoryItemStack[slot];
		this.setInventorySlotContents(slot, null);
		return stack;
	}

	@Override
	public void setInventorySlotContents(int slot, ItemStack itemStack) {
		inventoryItemStack[slot] = itemStack;
		markDirty();
	}

	@Override
	public String getInventoryName() {
		return BlocksArcadia.mysticalBrewingStand.getUnlocalizedName();
	}

	@Override
	public boolean hasCustomInventoryName() {
		return false;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		return true;
	}

	@Override
	public void openInventory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeInventory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isItemValidForSlot(int slot, ItemStack itemStack) {
		return true;
	}

	private static final int[] slotsBottom = new int[] {2};
	private static final int[] slotsTop = new int[] {1};
	private static final int[] slotsSides = new int[] {0};
	
	@Override
	public int[] getAccessibleSlotsFromSide(int side) {
		return side == 0 ? slotsBottom : (side == 1 ? slotsTop : slotsSides);
	}

	@Override
	public boolean canInsertItem(int slot, ItemStack itemStack, int side) {
		if(slot == 0) {
			if(side == 2 || side == 3|| side == 4|| side == 5) {
				if(itemStack.getItem() == ItemsArcadia.mysticalPowder) {
					return true;
				}
			}
		}
		if(slot == 1) {
			if(side == 1) {
				return true;
			}
		}
		if(slot == 2) {
			if(side == 0) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean canExtractItem(int slot, ItemStack itemStack, int side) {
		if(slot == 2) {
			if(side == 0) {
				return true;
			}
		}
		return false;
	}

	public boolean hasFuel() {
		return inventoryItemStack[0] != null && inventoryItemStack[0].stackSize > 0 && inventoryItemStack[0].getItem() == ItemsArcadia.mysticalPowder;
	}
	
	@Override
	public void updateEntity() {
		if(fuelTime > 0) {
			fuelTime--;
			//rezepte
		}
		
		if(fuelTime == 0 && hasFuel()) {
			fuelTime = fuelTime + 4 * 20;
			decrStackSize(0, 1);
		}
	}
}