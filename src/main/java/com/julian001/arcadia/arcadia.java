package com.julian001.arcadia;

import net.minecraft.creativetab.CreativeTabs;

import com.julian001.arcadia.blocks.BlocksArcadia;
import com.julian001.arcadia.items.ItemsArcadia;
import com.julian001.arcadia.lib.Recipes;
import com.julian001.arcadia.lib.References;
import com.julian001.arcadia.proxy.CommonProxy;
import com.julian001.arcadia.tabs.CreativeTabArcadia;
import com.julian001.arcadia.world.WorldGeneratorArcadia;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = References.ID, name = References.NAME, version = References.VERSION)
public class arcadia
{
	@Instance(References.ID)
	public static arcadia instance;
	@SidedProxy(clientSide = References.CLIENT_PROXY_CLASS, serverSide = References.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	//public static final PacketPipeline packetPipeline = new PacketPipeline();
	public static CreativeTabs tabArcadiaBlocks = new CreativeTabArcadia(CreativeTabs.getNextID(), "tabArcadiaBlocks");
	public static CreativeTabs tabArcadiaItems = new CreativeTabArcadia(CreativeTabs.getNextID(), "tabArcadiaItems");
	
	@EventHandler
    public void preInit(FMLInitializationEvent event)
    {
		GameRegistry.registerWorldGenerator(new WorldGeneratorArcadia(), 1);
		//NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
		
		BlocksArcadia.init();
		ItemsArcadia.init();
		Recipes.addRecipes();
		proxy.registerTileEntities();
		//System.out.println("####################" + BlocksArcadia.arcadiaBlock.getUnlocalizedName());//.substring(13));
    }
	
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    }
    
    @EventHandler
    public void postInit(FMLInitializationEvent event)
    {
    	
    }
}