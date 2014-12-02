package com.julian001.arcadia.inventory;

import java.util.UUID;

import com.julian001.arcadia.lib.References;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraftforge.common.util.Constants;
import cpw.mods.fml.common.registry.GameRegistry;

public class InventoryBagArcadia implements IInventory {

	final UUID uuid = UUID.randomUUID();
	private final ItemStack itemStack;
	private final String nbtKey;	
	ItemStack[] inventoryItemStack;
	public InventoryBagArcadia(int size, ItemStack itemStack, String nbtKey) {
		super();
		this.itemStack = itemStack;
		this.nbtKey = nbtKey;
		this.inventoryItemStack = new ItemStack[size];
		writeUUID();
		readFromNbt(getNbt());
	}
		
	public InventoryBagArcadia(int size, ItemStack itemStack) {
		this(size, itemStack, defaultNBTKey(itemStack));
	}
	
	private void writeUUID() {
		if (itemStack.stackTagCompound == null) {
			itemStack.stackTagCompound = new NBTTagCompound();
		}
		itemStack.stackTagCompound.setString(References.ID + ".bagUUID", uuid.toString());
	}
	
	private static String defaultNBTKey(ItemStack itemStack) {
		GameRegistry.UniqueIdentifier ui = GameRegistry.findUniqueIdentifierFor(itemStack.getItem());
		return ui.modId + ":" + ui.name + ".inv";
	}
	
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
			ItemStack item = this.getStackInSlot(slot);
			this.setInventorySlotContents(slot, null);
			return item;
	}

	@Override
	public void setInventorySlotContents(int slot, ItemStack itemStack) {
		inventoryItemStack[slot] = itemStack;
		markDirty();		
	}

	@Override
	public String getInventoryName() {
		return itemStack.getDisplayName();
	}

	@Override
	public boolean hasCustomInventoryName() {
		return true;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public void markDirty() {
		saveData();		
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		return true;
	}

	@Override
	public void openInventory() { }

	@Override
	public void closeInventory() {
		closeInventory();
		if(itemStack.stackTagCompound != null) {
			itemStack.stackTagCompound.removeTag(References.ID + ".bagUUID");
		}
	}

	@Override
	public boolean isItemValidForSlot(int slot, ItemStack item) {
		return true;
	}

	private final void saveData() {
		writeToNbt(getNbt());
	}
		
	private NBTTagCompound getNbt() {
		if (itemStack.stackTagCompound == null) {
			   itemStack.stackTagCompound = new NBTTagCompound();
			}
		if (!itemStack.stackTagCompound.hasKey(nbtKey)) {
		   itemStack.stackTagCompound.setTag(nbtKey, new NBTTagCompound());
		}
		return itemStack.stackTagCompound.getCompoundTag(nbtKey);
	}
	
	public void writeToNbt(NBTTagCompound nbt) {
		NBTTagList nbt1 = new NBTTagList();
		int len = inventoryItemStack.length;
		for (int i = 0; i < len; i++) {
			ItemStack item = inventoryItemStack[i];
			if (item != null) {
				NBTTagCompound itemCompound = item.writeToNBT(new NBTTagCompound());
				itemCompound.setInteger("slot", i);
				nbt1.appendTag(itemCompound);
			}
		}
		nbt.setTag(nbtKey, nbt1);
	}
	
	public void readFromNbt(NBTTagCompound nbt) {
		NBTTagList nbtList = nbt.getTagList(nbtKey, Constants.NBT.TAG_COMPOUND);
		int invSize = inventoryItemStack.length;
		int listLen = nbtList.tagCount();
		for (int i = 0; i < listLen; i++) {
			NBTTagCompound itemCompound = nbtList.getCompoundTagAt(i);
		
			ItemStack item = ItemStack.loadItemStackFromNBT(itemCompound);
			int idx = itemCompound.getInteger("slot");
			if (idx < invSize && idx > 0) {
				inventoryItemStack[idx] = item;
			}
		}
	}
	
	public static UUID readUUID(NBTBase nbt) {
		return UUID.fromString(((NBTTagString) nbt).func_150285_a_());
	}
}