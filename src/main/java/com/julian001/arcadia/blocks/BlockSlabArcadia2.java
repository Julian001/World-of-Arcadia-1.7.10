package com.julian001.arcadia.blocks;

import java.util.Random;

import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.lib.References;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSlabArcadia2 extends BlockSlab{
	private Block materialBlock;
	private int meta;
	private boolean isDouble;
	private BlockSlabArcadia2 singleslab;
	public BlockSlabArcadia2(boolean isDouble, Block b, int meta,float hard, float resist, String name) {
		super(isDouble, b.getMaterial());
		this.materialBlock = b;
		this.meta = meta;
		setBlockName(References.ID + "_" + name);
		setHardness(hard);
		setResistance(resist);
		setStepSound(soundTypeMetal);
		useNeighborBrightness = true;
		this.isDouble = isDouble;
		if(!isDouble)setCreativeTab(arcadia.tabArcadiaBlocks);
	}
	
	public BlockSlabArcadia2(boolean isDouble, Block b, int meta, float hard, float resist, String name, BlockSlabArcadia2 single) {
		super(isDouble, b.getMaterial());
		this.materialBlock = b;
		this.meta = meta;
		setBlockName(References.ID + "_" + name);
		setHardness(hard);
		setResistance(resist);
		setStepSound(soundTypeMetal);
		useNeighborBrightness = true;
		this.isDouble = isDouble;
		if(!isDouble)setCreativeTab(arcadia.tabArcadiaBlocks);
		this.singleslab = single;
	}

	@Override
	public String func_150002_b(int p_150002_1_) {
		return this.getUnlocalizedName();
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return this.materialBlock.getIcon(p_149691_1_, meta);
    }
	
	@Override
	public Item getItemDropped(int par1, Random rand, int par3){
		return isDouble ? Item.getItemFromBlock(singleslab) : Item.getItemFromBlock(this);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
	{
		if (this.isDouble) return Item.getItemFromBlock(singleslab);
		else return Item.getItemFromBlock(this);
	}
}