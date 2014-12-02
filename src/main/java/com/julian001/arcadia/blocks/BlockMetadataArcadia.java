package com.julian001.arcadia.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.julian001.arcadia.arcadia;

public class BlockMetadataArcadia extends Block {

	private int maxMeta;
	public BlockMetadataArcadia(int maxMeta, Material material) {
		super(material);
		setResistance(10F);
		setHardness(10F);
		setCreativeTab(arcadia.tabArcadiaBlocks);
		this.maxMeta=maxMeta;
	}
	
	@Override
	public int damageDropped(int meta) {
		return meta;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list) {
		for(int i = 0; i < maxMeta; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}
}