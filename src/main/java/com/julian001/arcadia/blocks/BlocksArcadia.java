package com.julian001.arcadia.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.julian001.arcadia.items.itemblock.ItemBlockSlabArcadia;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlocksArcadia {
	
	public static Block arcadiaBlock;
	public static Block oreArcadia;
	public static Block oreBlockArcadia;
	public static Block slabArcadia;
	public static Block doubleSlabArcadia;
	public static Block fenceArcadia;
	public static Block wallArcadia;
	public static Block fenceGateArcadia;
	
	public static Block stairSilver;
	public static Block stairCopper;
	public static Block stairTin;
	public static Block stairLead;
	public static Block stairRuby;
	public static Block stairSapphire;
	public static Block stairBronze;
		
	public static Block fenceSilver;
	public static Block fenceCopper;
	public static Block fenceTin;
	public static Block fenceLead;
	public static Block fenceRuby;
	public static Block fenceSapphire;
	public static Block fenceBronze;
	
	public static Block wallSilver;
	
	public static Block anvilArcadia;
	public static Block clearGlass;
	public static Block clearGlassPane;
	public static Block multiOre;
	
	
	public static void init() {
		
		arcadiaBlock = new BlockArcadia("arcadiaBlock", Material.rock).setStepSound(Block.soundTypeGlass);
		oreArcadia = new BlockOreArcadia("oreArcadia", 6);
		oreBlockArcadia = new BlockOreStorageArcadia("oreBlockArcadia", 7);
		fenceArcadia = new BlockFenceArcadia("fenceArcadia", "oreBlockArcadia");
		wallArcadia = new BlockWallArcadia("wallArcadia", oreBlockArcadia);
		fenceGateArcadia = new BlockFenceGateArcadia("fenceGateArcadia");
				
		slabArcadia = new BlockSlabArcadia("slab", false);
		doubleSlabArcadia = new BlockSlabArcadia("doubleSlab", true);
		GameRegistry.registerBlock(slabArcadia, ItemBlockSlabArcadia.class, "slab", slabArcadia, doubleSlabArcadia, false);
		GameRegistry.registerBlock(doubleSlabArcadia, ItemBlockSlabArcadia.class, "doubleSlab", slabArcadia, doubleSlabArcadia, true);
		
		stairSilver = new BlockStairsArcadia(oreBlockArcadia, 0, "stairSilver");
		stairCopper = new BlockStairsArcadia(oreBlockArcadia, 1, "stairCopper");
		stairTin = new BlockStairsArcadia(oreBlockArcadia, 2, "stairTin");
		stairLead = new BlockStairsArcadia(oreBlockArcadia, 3, "stairLead");
		stairRuby = new BlockStairsArcadia(oreBlockArcadia, 4, "stairRuby");
		stairSapphire = new BlockStairsArcadia(oreBlockArcadia, 5, "stairSapphire");
		stairBronze = new BlockStairsArcadia(oreBlockArcadia, 6, "stairBronze");
		
		anvilArcadia = new BlockAnvilArcadia("anvil");
		clearGlass = new BlockGlassArcadia("clearGlass", Material.glass, false).setHardness(0.3F);
		//TODO clearGlassPane = new BlockGlassPaneArcadia("clearGlassPane", "clearGlass", false).setHardness(0.3F);
		//(new Block Pane("iron_bars", "iron_bars", Material.iron, true)).setHardness(5.0F).setResistance(10.0F).setStepSound(soundTypeMetal).setBlockName("fenceIron"));
		//(new BlockPane("glass", "glass_pane_top", Material.glass, false)).setHardness(0.3F).setStepSound(soundTypeGlass).setBlockName("thinGlass"));
		multiOre = new BlockMultiOreArcadia("multiOre");
	}
}