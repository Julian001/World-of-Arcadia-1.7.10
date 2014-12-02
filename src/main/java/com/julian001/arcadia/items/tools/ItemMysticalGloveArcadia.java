package com.julian001.arcadia.items.tools;

import java.util.Set;

import com.google.common.collect.Sets;
import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.blocks.BlocksArcadia;
import com.julian001.arcadia.lib.References;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class ItemMysticalGloveArcadia extends ItemOmniToolArcadia {

	static Set blocksEffectiveAgainst = Sets.newHashSet(new Block[] {
			Blocks.cobblestone,	Blocks.double_stone_slab, Blocks.stone_slab, Blocks.stone,
			Blocks.sandstone, Blocks.mossy_cobblestone, Blocks.iron_ore, Blocks.iron_block,
			Blocks.coal_ore, Blocks.gold_block, Blocks.gold_ore, Blocks.diamond_ore, 
			Blocks.diamond_block, Blocks.ice, Blocks.netherrack, Blocks.lapis_ore, 
			Blocks.lapis_block,	Blocks.redstone_ore, Blocks.lit_redstone_ore, Blocks.rail,
			Blocks.detector_rail, Blocks.golden_rail, Blocks.activator_rail, Blocks.planks,
			Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, 
			Blocks.lit_pumpkin,	Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, 
			Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, 
			Blocks.mycelium, Blocks.obsidian, Blocks.furnace, Blocks.anvil, Blocks.glowstone,
			Blocks.melon_block, Blocks.crafting_table, Blocks.jukebox, Blocks.noteblock,
			Blocks.enchanting_table, Blocks.dropper, Blocks.dispenser, Blocks.piston,
			Blocks.redstone_lamp, Blocks.fence_gate, Blocks.iron_door, Blocks.wooden_door,
			Blocks.hopper, Blocks.trapdoor, Blocks.stone_pressure_plate, Blocks.wooden_pressure_plate,
			Blocks.lapis_block, Blocks.bed, Blocks.wool, Blocks.gold_block, Blocks.iron_block, 
			Blocks.stone_slab, Blocks.diamond_block, Blocks.standing_sign, Blocks.ladder,
			Blocks.stone_stairs, Blocks.wall_sign, Blocks.cactus, Blocks.stonebrick,
			Blocks.brown_mushroom_block, Blocks.red_mushroom_block, Blocks.iron_bars, 
			Blocks.vine, Blocks.stone_brick_stairs, Blocks.waterlily, Blocks.wooden_slab, 
			Blocks.double_wooden_slab, Blocks.double_stone_slab, Blocks.sandstone_stairs, 
			Blocks.ender_chest, Blocks.emerald_block, Blocks.spruce_stairs, Blocks.birch_stairs,
			Blocks.jungle_stairs, Blocks.beacon, Blocks.cobblestone_wall, Blocks.light_weighted_pressure_plate, 
			Blocks.heavy_weighted_pressure_plate, Blocks.redstone_block, Blocks.quartz_ore, 
			Blocks.quartz_block, Blocks.quartz_stairs, Blocks.carpet, Blocks.coal_block, 
			Blocks.acacia_stairs, Blocks.dark_oak_stairs, Blocks.sticky_piston, 
			Blocks.lit_pumpkin, Blocks.lit_redstone_lamp, Blocks.lit_furnace,
			BlocksArcadia.oreBlockArcadia, BlocksArcadia.oreArcadia});
	public ItemMysticalGloveArcadia(String name, float dammage, ToolMaterial material) {
		super(dammage, material, blocksEffectiveAgainst);
		setUnlocalizedName(References.ID + "_" + name);
		setTextureName(References.ID + ":" + name);
		GameRegistry.registerItem(this, name);
	}
}