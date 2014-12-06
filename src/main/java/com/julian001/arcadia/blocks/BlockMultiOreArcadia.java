package com.julian001.arcadia.blocks;

import java.util.ArrayList;

import com.julian001.arcadia.items.ItemsArcadia;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockMultiOreArcadia extends BlockArcadia {

	public BlockMultiOreArcadia(String name) {
		super(name, Material.rock);
		setStepSound(soundTypeStone);
		setHardness(10F);
		setResistance(10F);
		setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		drops.add(new ItemStack(Items.coal, world.rand.nextInt(3) + 1));
		if(world.rand.nextFloat() < 0.8F)
			drops.add(new ItemStack(Blocks.iron_ore, world.rand.nextInt(1) + 1));
	    if(world.rand.nextFloat() < 0.4F)
	    	drops.add(new ItemStack(Blocks.gold_ore, world.rand.nextInt(1) + 1));
	    if(world.rand.nextFloat() < 0.6F)
	    	drops.add(new ItemStack(Items.dye, world.rand.nextInt(4) + 2, 4));
	    if(world.rand.nextFloat() < 0.2F)
	    	drops.add(new ItemStack(Items.emerald));
	    if(world.rand.nextFloat() < 0.5F)
	    	drops.add(new ItemStack(Items.redstone, world.rand.nextInt(2) + 2));
	    if(world.rand.nextFloat() < 0.1F)
	        drops.add(new ItemStack(Items.diamond));
	    
	    if(world.rand.nextFloat() < 0.6F)
	    	drops.add(new ItemStack(BlocksArcadia.oreArcadia, world.rand.nextInt(1) + 1, 0));
	    if(world.rand.nextFloat() < 0.9F)
	    	drops.add(new ItemStack(BlocksArcadia.oreArcadia, world.rand.nextInt(2) + 1, 1));
	    if(world.rand.nextFloat() < 0.9F)
	    	drops.add(new ItemStack(BlocksArcadia.oreArcadia, world.rand.nextInt(2) + 1, 2));
	    if(world.rand.nextFloat() < 0.7F)
	    	drops.add(new ItemStack(BlocksArcadia.oreArcadia, world.rand.nextInt(1) + 1, 3));
	    if(world.rand.nextFloat() < 0.2F)
	    	drops.add(new ItemStack(ItemsArcadia.ingotArcadia, 1, 4));
	    if(world.rand.nextFloat() < 0.3F)
	    	drops.add(new ItemStack(ItemsArcadia.ingotArcadia, world.rand.nextInt(1) + 1, 5));
	    
		return drops;
	}
}