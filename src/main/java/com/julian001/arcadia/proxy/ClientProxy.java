package com.julian001.arcadia.proxy;

import com.julian001.arcadia.RenderFenceArcadia;
import com.julian001.arcadia.blocks.BlockFenceArcadia;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	public void init() {
		BlockFenceArcadia.renderID = RenderingRegistry.getNextAvailableRenderId();
		RenderingRegistry.registerBlockHandler(BlockFenceArcadia.renderID, new RenderFenceArcadia());
	}
}