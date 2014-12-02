package com.julian001.arcadia.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import com.julian001.arcadia.blocks.BlocksArcadia;
import com.julian001.arcadia.items.ItemsArcadia;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabArcadia extends CreativeTabs {

	private String name;
	public CreativeTabArcadia(int id, String unlocalizedName) {
		super(id, unlocalizedName);
		this.setBackgroundImageName("gui.png");
		name = unlocalizedName;
	}
	
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		if(name == "tabArcadiaBlocks") {
			return Item.getItemFromBlock(BlocksArcadia.oreBlockArcadia);}
		if(name == "tabArcadiaItems") {
			return ItemsArcadia.arcadiaItem;}
		else {
			return Items.fire_charge;}
	}
	
	/*@SideOnly(Side.CLIENT)
	public void displayAllReleventItems(List itemList) {
		// Creates an item stack of String.
        ItemStack string = new ItemStack(Items.string);
        // Gives the string the silk touch enchantment.
        string.addEnchantment(Enchantment.silkTouch, 1);

        // Adds the string item stack to the creative tab items.
        itemList.add(string);
        // Adds a wooden hoe to the creative tab items list.
        itemList.add(new ItemStack(Items.wooden_hoe));

        // Adds all fishing rod enchantment books to the tab
        this.addEnchantmentBooksToList(itemList, new EnumEnchantmentType[] { EnumEnchantmentType.fishing_rod });

        // Adds all sixteen dyes to the tab.
        addMetaDataItems(itemList, Items.dye, 16);
        	}
	
	public void addMetaDataItems(List itemList, Item item, int range) {
        for (int i = 0; i < range; ++i) {
            itemList.add(new ItemStack(item, 1, i));
        }
    }*/
}