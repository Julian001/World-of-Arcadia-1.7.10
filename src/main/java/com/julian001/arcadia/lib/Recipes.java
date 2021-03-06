package com.julian001.arcadia.lib;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.julian001.arcadia.blocks.BlocksArcadia;
import com.julian001.arcadia.items.ItemsArcadia;

import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {

	public static void addRecipes() {
		//----Ores----//
		GameRegistry.addSmelting(new ItemStack(BlocksArcadia.oreArcadia, 1, 0), new ItemStack(ItemsArcadia.ingotArcadia, 1, 0), 0.5F);
		GameRegistry.addSmelting(new ItemStack(BlocksArcadia.oreArcadia, 1, 1), new ItemStack(ItemsArcadia.ingotArcadia, 1, 1), 0.1F);
		GameRegistry.addSmelting(new ItemStack(BlocksArcadia.oreArcadia, 1, 2), new ItemStack(ItemsArcadia.ingotArcadia, 1, 2), 0.1F);
		GameRegistry.addSmelting(new ItemStack(BlocksArcadia.oreArcadia, 1, 3), new ItemStack(ItemsArcadia.ingotArcadia, 1, 3), 0.1F);
		GameRegistry.addSmelting(new ItemStack(ItemsArcadia.ingotArcadia, 1, 7), new ItemStack(ItemsArcadia.ingotArcadia, 1, 6), 0.3F);
		
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.ingotArcadia, 1, 7), new Object[] {
			"XX",
			"XY",
			'X' , new ItemStack(ItemsArcadia.ingotArcadia, 1, 1), 'Y', new ItemStack(ItemsArcadia.ingotArcadia, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.ingotArcadia, 1, 7), new Object[] {
			"XY",
			"XX",
			'X' , new ItemStack(ItemsArcadia.ingotArcadia, 1, 1), 'Y', new ItemStack(ItemsArcadia.ingotArcadia, 1, 2) });
		
		//----OreBlocks----//
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsArcadia.ingotArcadia, 9, 0), new Object[] {
			new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 0), new Object[] {
			"XXX", "XXX", "XXX", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 0) });
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsArcadia.ingotArcadia, 9, 1), new Object[] {
			new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 1), new Object[] {
			"XXX", "XXX", "XXX", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsArcadia.ingotArcadia, 9, 2), new Object[] {
			new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 2), new Object[] {
			"XXX", "XXX", "XXX", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 2) });
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsArcadia.ingotArcadia, 9, 3), new Object[] {
			new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 3), new Object[] {
			"XXX", "XXX", "XXX", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 3) });
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsArcadia.ingotArcadia, 9, 4), new Object[] {
			new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 4), new Object[] {
			"XXX", "XXX", "XXX", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 4) });
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsArcadia.ingotArcadia, 9, 5), new Object[] {
			new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 5), new Object[] {
			"XXX", "XXX", "XXX", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 5) });
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsArcadia.ingotArcadia, 9, 6), new Object[] {
			new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 6) });
		GameRegistry.addRecipe(new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 6), new Object[] {
			"XXX", "XXX", "XXX", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 6) });
		//----Stairs----//
		GameRegistry.addRecipe(new ItemStack(BlocksArcadia.stairSilver, 4), new Object[] {
			"X  ", "XX ", "XXX", 'X', new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(BlocksArcadia.stairCopper, 4), new Object[] {
			"X  ", "XX ", "XXX", 'X', new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(BlocksArcadia.stairTin, 4), new Object[] {
			"X  ", "XX ", "XXX", 'X', new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(BlocksArcadia.stairLead, 4), new Object[] {
			"X  ", "XX ", "XXX", 'X', new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(BlocksArcadia.stairRuby, 4), new Object[] {
			"X  ", "XX ", "XXX", 'X', new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(BlocksArcadia.stairSapphire, 4), new Object[] {
			"X  ", "XX ", "XXX", 'X', new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(BlocksArcadia.stairBronze, 4), new Object[] {
			"X  ", "XX ", "XXX", 'X', new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 6) });
		//----Slabs----//
		GameRegistry.addRecipe(new ItemStack(BlocksArcadia.slabArcadia, 6, 0), new Object[] {
			"XXX", 'X', new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(BlocksArcadia.slabArcadia, 6, 1), new Object[] {
			"XXX", 'X', new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(BlocksArcadia.slabArcadia, 6, 2), new Object[] {
			"XXX", 'X', new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(BlocksArcadia.slabArcadia, 6, 3), new Object[] {
			"XXX", 'X', new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(BlocksArcadia.slabArcadia, 6, 4), new Object[] {
			"XXX", 'X', new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(BlocksArcadia.slabArcadia, 6, 5), new Object[] {
			"XXX", 'X', new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(BlocksArcadia.slabArcadia, 6, 6), new Object[] {
			"XXX", 'X', new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 6) });
		//----Fences----//
		GameRegistry.addRecipe(new ItemStack(BlocksArcadia.fenceArcadia, 6, 0), new Object[] {
			"XYX", "XYX", 'X', new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 0), 'Y', new ItemStack(ItemsArcadia.ingotArcadia, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(BlocksArcadia.fenceArcadia, 6, 1), new Object[] {
			"XYX", "XYX", 'X', new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 1), 'Y', new ItemStack(ItemsArcadia.ingotArcadia, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(BlocksArcadia.fenceArcadia, 6, 2), new Object[] {
			"XYX", "XYX", 'X', new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 2), 'Y', new ItemStack(ItemsArcadia.ingotArcadia, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(BlocksArcadia.fenceArcadia, 6, 3), new Object[] {
			"XYX", "XYX", 'X', new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 3), 'Y', new ItemStack(ItemsArcadia.ingotArcadia, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(BlocksArcadia.fenceArcadia, 6, 4), new Object[] {
			"XYX", "XYX", 'X', new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 4), 'Y', new ItemStack(ItemsArcadia.ingotArcadia, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(BlocksArcadia.fenceArcadia, 6, 5), new Object[] {
			"XYX", "XYX", 'X', new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 5), 'Y', new ItemStack(ItemsArcadia.ingotArcadia, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(BlocksArcadia.fenceArcadia, 6, 6), new Object[] {
			"XYX", "XYX", 'X', new ItemStack(BlocksArcadia.oreBlockArcadia, 1, 6), 'Y', new ItemStack(ItemsArcadia.ingotArcadia, 1, 6) });
		//----Food----//
		GameRegistry.addSmelting(Items.egg, new ItemStack(ItemsArcadia.friedEgg), 0.3F);
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.sushi, 2), new Object[] {
			" X ", "XYX", " X ", 'X', Items.reeds, 'Y', Items.fish });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.sushiSoup), new Object[] {
			"X", "X", "Y", 'X', ItemsArcadia.sushi, 'Y', Items.bowl });
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsArcadia.cheese), Items.milk_bucket, Items.sugar);
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.sandwich), new Object[] {
			" X ", "Y#Y", " X ", 'X', ItemsArcadia.cheese, 'Y', Items.bread, '#', Items.porkchop });
		//----Swords----//
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.swordSilver), new Object[] {
			"X", "X", "Y", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 0), 'Y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.swordBronze), new Object[] {
			"X", "X", "Y", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 6), 'Y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.swordRuby), new Object[] {
			"X", "X", "Y", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 4), 'Y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.swordSapphire), new Object[] {
			"X", "X", "Y", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 5), 'Y', Items.stick });
		//----Pickaxes----//
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.pickaxeSilver), new Object[] {
			"XXX", " Y ", " Y ", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 0), 'Y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.pickaxeBronze), new Object[] {
			"XXX", " Y ", " Y ", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 6), 'Y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.pickaxeRuby), new Object[] {
			"XXX", " Y ", " Y ", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 4), 'Y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.pickaxeSapphire), new Object[] {
			"XXX", " Y ", " Y ", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 5), 'Y', Items.stick });
		//----Shovels----//
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.shovelSilver), new Object[] {
			"X", "Y", "Y", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 0), 'Y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.shovelBronze), new Object[] {
			"X", "Y", "Y", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 6), 'Y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.shovelRuby), new Object[] {
			"X", "Y", "Y", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 4), 'Y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.shovelSapphire), new Object[] {
			"X", "Y", "Y", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 5), 'Y', Items.stick });
		//----Axes----//
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.axeSilver), new Object[] {
			"XX", "XY", " Y", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 0), 'Y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.axeBronze), new Object[] {
			"XX", "XY", " Y", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 6), 'Y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.axeRuby), new Object[] {
			"XX", "XY", " Y", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 4), 'Y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.axeSapphire), new Object[] {
			"XX", "XY", " Y", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 5), 'Y', Items.stick });
		//----Hoes----//
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.hoeSilver), new Object[] {
			"XX", " Y", " Y", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 0), 'Y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.hoeBronze), new Object[] {
			"XX", " Y", " Y", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 6), 'Y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.hoeRuby), new Object[] {
			"XX", " Y", " Y", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 4), 'Y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.hoeSapphire), new Object[] {
			"XX", " Y", " Y", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 5), 'Y', Items.stick });
		//----Shears----//
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.shearsSilver), new Object[] {
			" X", "X ", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.shearsBronze), new Object[] {
			" X", "X ", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 6) });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.shearsRuby), new Object[] {
			" X", "X ", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.shearsSapphire), new Object[] {
			" X", "X ", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 5) });
		//----Helmets----//
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.helmetSilver), new Object[] {
			"XXX", "X X", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.helmetBronze), new Object[] {
			"XXX", "X X", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 6) });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.helmetRuby), new Object[] {
			"XXX", "X X", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.helmetSapphire), new Object[] {
			"XXX", "X X", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 5) });
		//----Chestplates----//
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.chestplateSilver), new Object[] {
			"X X", "XXX", "XXX", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.chestplateBronze), new Object[] {
			"X X", "XXX", "XXX", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 6) });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.chestplateRuby), new Object[] {
			"X X", "XXX", "XXX", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.chestplateSapphire), new Object[] {
			"X X", "XXX", "XXX", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 5) });
		//----Leggings----//
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.leggingsSilver), new Object[] {
			"XXX", "X X", "X X", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.leggingsBronze), new Object[] {
			"XXX", "X X", "X X", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 6) });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.leggingsRuby), new Object[] {
			"XXX", "X X", "X X", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.leggingsSapphire), new Object[] {
			"XXX", "X X", "X X", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 5) });
		//----Boots----//
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.bootsSilver), new Object[] {
			"X X", "X X", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.bootsBronze), new Object[] {
			"X X", "X X", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 6) });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.bootsRuby), new Object[] {
			"X X", "X X", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(ItemsArcadia.bootsSapphire), new Object[] {
			"X X", "X X", 'X', new ItemStack(ItemsArcadia.ingotArcadia, 1, 5) });
		
		
	}
}