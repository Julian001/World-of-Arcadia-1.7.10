package com.julian001.arcadia.blocks;

import java.util.List;

import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.items.itemblock.ItemBlockFenceArcadia;
import com.julian001.arcadia.lib.References;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockFenceGateArcadia extends BlockFenceGate {

	private static final String[] unlocalizedNames = {"Silver",	"Copper", "Tin", "Lead", "Ruby", "Sapphire", "Bronze"};
	public BlockFenceGateArcadia(String name) {
		setBlockName(References.ID + "_" + name);
		setCreativeTab(arcadia.tabArcadiaBlocks);
		setStepSound(Block.soundTypeMetal);
		GameRegistry.registerBlock(this, ItemBlockFenceArcadia.class, name);
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
		return BlocksArcadia.oreBlockArcadia.getIcon(side, meta);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
			for(int i = 0; i < unlocalizedNames.length; i++) {
				list.add(new ItemStack(this, 1, i));
		}
	}
	
	@Override
	public Item getItem(World world, int x, int y, int z) {
		return Item.getItemFromBlock(this);
	}
	
	public float getBlockHardness(World world, int x, int y, int z) {
		int meta = world.getBlockMetadata(x, y, z);
		switch (meta) {
			case 0: return 5.0F;
			case 1: return 2.5F;
			case 2: return 2.5F;
			case 3: return 2.0F;
			case 4: return 6.0F;
			case 5: return 6.0F;
			case 6: return 5.0F;
		    default: return 4.0F;
		 }
    }
}