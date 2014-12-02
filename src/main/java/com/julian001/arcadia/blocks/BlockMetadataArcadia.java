package com.julian001.arcadia.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.items.ItemBlockOreStorageArcadia;
import com.julian001.arcadia.lib.References;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

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