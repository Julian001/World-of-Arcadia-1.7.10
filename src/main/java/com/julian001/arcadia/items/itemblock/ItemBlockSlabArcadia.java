package com.julian001.arcadia.items.itemblock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.julian001.arcadia.blocks.BlockSlabArcadia;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBlockSlabArcadia extends ItemBlock {

	private final boolean field_150948_b;
    private final BlockSlab field_150949_c;
    private final BlockSlab field_150947_d;
	public ItemBlockSlabArcadia(Block block, BlockSlabArcadia p_i45355_2_, BlockSlabArcadia p_i45355_3_, Boolean p_i45355_4_) {
		super(block);
		this.field_150949_c = p_i45355_2_;
        this.field_150947_d = p_i45355_3_;
        this.field_150948_b = p_i45355_4_;
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		String name = "";
		switch(itemStack.getItemDamage()) {
			case 0: {name = "Silver";break;}
			case 1: {name = "Copper";break;}
			case 2: {name = "Tin";break;}
			case 3: {name = "Lead";break;}
			case 4: {name = "Ruby";break;}
			case 5: {name = "Sapphire";break;}
			case 6: {name = "Bronze";break;}
			default: name = "noMeta";
		}
		return getUnlocalizedName() + "." + name;
	}
	
	@SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int meta) {
	        return Block.getBlockFromItem(this).getIcon(2, meta);
    }
	
	@Override
	public int getMetadata(int meta) {
		return meta;
	}
}