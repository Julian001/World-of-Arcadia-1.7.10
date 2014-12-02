package com.julian001.arcadia.proxy;

import com.julian001.arcadia.KeyHandler;

import cpw.mods.fml.common.FMLCommonHandler;

public class ClientProxy extends CommonProxy {

	public  void initialize() {
		FMLCommonHandler.instance().bus().register(new KeyHandler());
	}
}