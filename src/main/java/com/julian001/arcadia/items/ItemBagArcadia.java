package com.julian001.arcadia.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;

import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.inventory.InventoryBagArcadia;
import com.julian001.arcadia.lib.GUIs;
import com.julian001.arcadia.lib.References;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBagArcadia extends ItemMetadataArcadia{

	private IIcon[] icons;
	public ItemBagArcadia(String name, int maxMeta) {
		super(maxMeta);
		setUnlocalizedName(References.ID + "_" + name);
		GameRegistry.registerItem(this, name);
		setMaxStackSize(1);
		icons = new IIcon[maxMeta];
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int meta) {
		return icons[meta];
	}
	
	@Override
	public void registerIcons(IIconRegister iconRegister) {
		for(int i = 0; i < icons.length; i++) {
			String name = "";
			switch(i) {
				case 0: {name = "Small";break;}
				case 1: {name = "Medium";break;}
				case 2: {name = "Large";break;}
				default: name = "Broken";			
			}
			icons[i] = iconRegister.registerIcon(References.ID + ":bag" + name);
		}
	}
			
	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		String name = "";
		switch(itemStack.getItemDamage()) {
			case 0: {name = "Small";break;}
			case 1: {name = "Medium";break;}
			case 2: {name = "Large";break;}
			default: name = "Broken";
		}
		return getUnlocalizedName() + ".bag" + name;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world,	EntityPlayer entityPlayer) {
		if(!world.isRemote) {
			entityPlayer.openGui(arcadia.instance, GUIs.BAG.ordinal(), world, itemStack.getItemDamage(), 0, 0);
		}
		return itemStack;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean i) {
		int k = 0, l = 0;
		if(itemStack.stackTagCompound != null) {
			NBTTagList nbtList =  itemStack.stackTagCompound.getTagList(InventoryBagArcadia.nbtKey, Constants.NBT.TAG_COMPOUND);
			k = nbtList.tagCount();
		}
		switch(itemStack.getItemDamage()) {
			case 0: l = 9;break;
			case 1: l = 27;break;
			case 2: l = 54;break;
		}
		
		list.add("");
		list.add("§9Slots: " + k + "/" + l);
	}
}