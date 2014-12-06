package com.julian001.arcadia.blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
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
		setCreativeTab(arcadia.tabArcadiaBlocks);
		setStepSound(Block.soundTypeMetal);
		setResistance(10F);
		setBlockName(References.ID + "_" + name);
	}

	@Override
	public String func_150002_b(int meta) {
		return getUnlocalizedName() + unlocalizedNames[meta];
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
		//int typemeta = meta & 7;
		return BlocksArcadia.oreBlockArcadia.getIcon(side, meta & 7);
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
	
	public int quantityDropped(Random random) {
        return this.field_150004_a ? 2 : 1;
    }
	//TODO Drop
    public int damageDropped(int meta) {
        return meta & 7;
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