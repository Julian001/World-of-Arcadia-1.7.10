package com.julian001.arcadia.blocks;

import java.util.List;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.lib.References;

public class BlockSlabArcadia extends BlockSlab {

	private static final String[] unlocalizedNames = {"Silver",	"Copper", "Tin", "Lead", "Ruby", "Sapphire", "Bronze"};
	public BlockSlabArcadia(String name, boolean isDouble) {
		super(isDouble, Material.iron);
		setBlockName(References.ID + "_" + name);
		setCreativeTab(arcadia.tabArcadiaBlocks);
	}

	@Override
	public String func_150002_b(int meta) {
		return getUnlocalizedName() + unlocalizedNames[meta];
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
		int typemeta = meta & 7;
		return BlocksArcadia.oreBlockArcadia.getIcon(side, typemeta);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
		if(!field_150004_a) {
			for(int i = 0; i < unlocalizedNames.length; i++) {
				list.add(new ItemStack(this, 1, i));
			}
		}
	}
	
	@Override
	public Item getItem(World world, int x, int y, int z) {
		if(!field_150004_a) {
			return Item.getItemFromBlock(this);
		}
		else {
			return Item.getItemFromBlock(BlocksArcadia.slabArcadia);
		}
	}
}