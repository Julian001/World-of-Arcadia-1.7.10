package com.julian001.arcadia.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.items.itemblock.ItemBlockWallArcadia;
import com.julian001.arcadia.lib.References;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockWallArcadia extends BlockWall {

	public static final String[] unlocalizedNames = {"Silver", "Copper", "Tin", "Lead", "Ruby", "Sapphire", "Bronze"};
	public BlockWallArcadia(String name, Block block) {
		super(block);
		setCreativeTab(arcadia.tabArcadiaBlocks);
		setBlockName(References.ID + "_" + name);
		GameRegistry.registerBlock(this, ItemBlockWallArcadia.class,name);
		//object = (new ItemMultiTexture(Blocks.cobblestone_wall, Blocks.cobblestone_wall, BlockWall.field_150092_a)).setUnlocalizedName("cobbleWall");
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
		return BlocksArcadia.oreBlockArcadia.getIcon(side, meta);
	}
	
	@Override
	public int damageDropped(int meta) {
		return meta;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list) {
		for(int i = 0; i < unlocalizedNames.length; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}
	
	public boolean canConnectWallTo(IBlockAccess blockAccess, int x, int y, int z) {
        Block block = blockAccess.getBlock(x, y, z);
		if (block != this && block != (BlocksArcadia.fenceArcadia)
		&& block != (Blocks.cobblestone_wall)
		&& block != (Blocks.nether_brick_fence)
		&& block != (Blocks.fence) && block != (Blocks.fence_gate)) {
			return block != null && block.getMaterial().isOpaque() && block.renderAsNormalBlock() ? block.getMaterial() != Material.gourd : false;
		} else {
			return true;
		}
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
	
	@Override
    public boolean canPlaceTorchOnTop(World world, int x, int y, int z) {
        return true;
    }
}