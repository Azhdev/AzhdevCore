package nl.Azhdev.core;

import nl.Azhdev.core.api.packet.NetworkHandler;
import nl.Azhdev.core.lib.Reference;
import nl.Azhdev.core.proxies.IProxy;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(name = Reference.NAME, modid = Reference.MODID, version = Reference.VERSION)
public class ACORE {
	
	@SidedProxy(clientSide = "nl.Azhdev.core.proxies.ClientProxy", serverSide = "nl.Azhdev.core.proxies.ServerProxy")
	public static IProxy proxy;
		
	@Instance(Reference.MODID)
	public static ACORE instance;
	
	@Mod.EventHandler
	public static void PreInit(FMLPreInitializationEvent event){
		proxy.registerKeyBindings();
	}
	
	@Mod.EventHandler
	public static void Init(FMLInitializationEvent event){
		NetworkHandler.init();
	}
}
