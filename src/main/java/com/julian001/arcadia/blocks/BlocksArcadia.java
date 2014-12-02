package com.julian001.arcadia.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;

import com.julian001.arcadia.items.ItemBlockSlabArcadia;
import com.julian001.arcadia.items.ItemBlockSlabArcadia2;
import com.julian001.arcadia.lib.References;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlocksArcadia {
	
	public static Block arcadiaBlock;
	public static Block oreArcadia;
	public static Block oreBlockArcadia;
	public static BlockSlabArcadia slabArcadia;
	public static BlockSlabArcadia doubleSlabArcadia;
	
	public static Block stairSilver;
	public static Block stairCopper;
	public static Block stairTin;
	public static Block stairLead;
	public static Block stairRuby;
	public static Block stairSapphire;
	public static Block stairBronze;
	
	public static BlockSlabArcadia2 slabSilver;
	public static BlockSlabArcadia2 doubleSlabSilver;
	public static BlockSlabArcadia2 slabCopper;
	public static BlockSlabArcadia2 doubleSlabCopper;
	public static BlockSlabArcadia2 slabTin;
	public static BlockSlabArcadia2 doubleSlabTin;
	public static BlockSlabArcadia2 slabLead;
	public static BlockSlabArcadia2 doubleSlabLead;
	public static BlockSlabArcadia2 slabRuby;
	public static BlockSlabArcadia2 doubleSlabRuby;
	public static BlockSlabArcadia2 slabSapphire;
	public static BlockSlabArcadia2 doubleSlabSapphire;
	public static BlockSlabArcadia2 slabBronze;
	public static BlockSlabArcadia2 doubleSlabBronze;
	
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
	
	
	public static void init() {
		
		arcadiaBlock = new BlockArcadia("arcadiaBlock", Material.rock).setStepSound(Block.soundTypeGlass);
		oreArcadia = new BlockOreArcadia("oreArcadia", 6);
		oreBlockArcadia = new BlockOreStorageArcadia("oreBlockArcadia", 7);
		
		stairSilver = new BlockStairsArcadia(oreBlockArcadia, 0, "stairSilver");
		stairCopper = new BlockStairsArcadia(oreBlockArcadia, 1, "stairCopper");
		stairTin = new BlockStairsArcadia(oreBlockArcadia, 2, "stairTin");
		stairLead = new BlockStairsArcadia(oreBlockArcadia, 3, "stairLead");
		stairRuby = new BlockStairsArcadia(oreBlockArcadia, 4, "stairRuby");
		stairSapphire = new BlockStairsArcadia(oreBlockArcadia, 5, "stairSapphire");
		stairBronze = new BlockStairsArcadia(oreBlockArcadia, 6, "stairBronze");
		
		slabArcadia = new BlockSlabArcadia("slabX", 7, oreBlockArcadia, false);
		doubleSlabArcadia = new BlockSlabArcadia("doubleSlabX", 7, oreBlockArcadia, true, slabArcadia);
		registerSlabX("slabX", "doubleSlabX", slabArcadia, doubleSlabArcadia);
		//slabSilver = (BlockSlab)(new BlockSlabArcadia("slabArcadia", 7, false));
		//doubleSlabSilver = (BlockSlab)(new BlockSlabArcadia("doubleSlabArcadia", 7, true));
		//blockRegistry.addObject(125, "double_wooden_slab", (new BlockWoodSlab(true)).setHardness(2.0F).setResistance(5.0F).setStepSound(soundTypeWood).setBlockName("woodSlab"));
        //blockRegistry.addObject(126, "wooden_slab", (new BlockWoodSlab(false)).setHardness(2.0F).setResistance(5.0F).setStepSound(soundTypeWood).setBlockName("woodSlab"));
		//----Slabs----//
		slabSilver = new BlockSlabArcadia2(false, oreBlockArcadia, 0, 5.0f, 10.0f, "slabSilver");
		doubleSlabSilver = new BlockSlabArcadia2(true, oreBlockArcadia, 0, 5.0f, 10.0f, "slabSilver", slabSilver);
		registerSlab("slabSilver", "doubleSlabSilver", slabSilver, doubleSlabSilver);
		slabCopper = new BlockSlabArcadia2(false, oreBlockArcadia, 1, 0.4f, 2.5f, "slabCopper");
		doubleSlabCopper = new BlockSlabArcadia2(true, oreBlockArcadia, 1, 2.5f, 10.0f, "slabCopper", slabCopper);
		registerSlab("slabCopper", "doubleSlabCopper", slabCopper, doubleSlabCopper);
		slabTin = new BlockSlabArcadia2(false, oreBlockArcadia, 2, 2.5f, 10.0f, "slabTin");
		doubleSlabTin = new BlockSlabArcadia2(true, oreBlockArcadia, 2, 2.5f, 10.0f, "slabTin", slabTin);
		registerSlab("slabTin", "doubleSlabTin", slabTin, doubleSlabTin);
		slabLead = new BlockSlabArcadia2(false, oreBlockArcadia, 3, 2.0f, 10.0f, "slabLead");
		doubleSlabLead = new BlockSlabArcadia2(true, oreBlockArcadia, 3, 2.0f, 10.0f, "slabLead", slabLead);
		registerSlab("slabLead", "doubleSlabLead", slabLead, doubleSlabLead);
		slabRuby = new BlockSlabArcadia2(false, oreBlockArcadia, 4, 6f, 10.0f, "slabRuby");
		doubleSlabRuby = new BlockSlabArcadia2(true, oreBlockArcadia, 4, 6f, 10.0f, "slabRuby", slabRuby);
		registerSlab("slabRuby", "doubleSlabRuby", slabRuby, doubleSlabRuby);
		slabSapphire = new BlockSlabArcadia2(false, oreBlockArcadia, 5, 6.0f, 10.0f, "slabSapphire");
		doubleSlabSapphire = new BlockSlabArcadia2(true, oreBlockArcadia, 5, 6.0f, 10.0f, "slabSapphire", slabSapphire);
		registerSlab("slabSapphire", "doubleSlabSapphire", slabSapphire, doubleSlabSapphire);
		slabBronze = new BlockSlabArcadia2(false, oreBlockArcadia, 6, 0.4f, 10.0f, "slabBronze");
		doubleSlabBronze = new BlockSlabArcadia2(true, oreBlockArcadia, 6, 5.0f, 10.0f, "slabBronze", slabBronze);
		registerSlab("slabBronze", "doubleSlabBronze", slabBronze, doubleSlabBronze);
		
		fenceSilver = new BlockFenceArcadia("fenceSilver", "blockSilver", Material.iron).setHardness(5.0F);
		fenceCopper = new BlockFenceArcadia("fenceCopper", "blockCopper", Material.iron).setHardness(2.5F);
		fenceTin = new BlockFenceArcadia("fenceTin", "blockTin", Material.iron).setHardness(2.5F);
		fenceLead = new BlockFenceArcadia("fenceLead", "blockLead", Material.iron).setHardness(2.0F);
		fenceRuby = new BlockFenceArcadia("fenceRuby", "blockRuby", Material.iron).setHardness(6.0F);
		fenceSapphire = new BlockFenceArcadia("fenceSapphire", "blockSapphire", Material.iron).setHardness(6.0F);
		fenceBronze = new BlockFenceArcadia("fenceBronze", "blockBronze", Material.iron).setHardness(5.0F);
		
		wallSilver = new BlockWallArcadia("wallSilver", oreBlockArcadia);
		
		anvilArcadia = new BlockAnvilArcadia("anvil");
		clearGlass = new BlockGlassArcadia("clearGlass", Material.glass, false).setHardness(0.3F);
		//TODO clearGlassPane = new BlockGlassPaneArcadia("clearGlassPane", "clearGlass", false).setHardness(0.3F);
		//(new Block Pane("iron_bars", "iron_bars", Material.iron, true)).setHardness(5.0F).setResistance(10.0F).setStepSound(soundTypeMetal).setBlockName("fenceIron"));
		//(new BlockPane("glass", "glass_pane_top", Material.glass, false)).setHardness(0.3F).setStepSound(soundTypeGlass).setBlockName("thinGlass"));
		
	}
	
	public static void registerSlab(String name, String name2, BlockSlabArcadia2 one, BlockSlabArcadia2 two){
		GameRegistry.registerBlock(two, ItemBlockSlabArcadia2.class, name2, new Object[]{one, two, true});
		GameRegistry.registerBlock(one, ItemBlockSlabArcadia2.class, name, new Object[]{one, two, false});
	}
	public static void registerSlabX(String name, String name2, BlockSlabArcadia one, BlockSlabArcadia two){
		GameRegistry.registerBlock(two, ItemBlockSlabArcadia.class, name2, new Object[]{one, two, true});
		GameRegistry.registerBlock(one, ItemBlockSlabArcadia.class, name, new Object[]{one, two, false});
	}
}