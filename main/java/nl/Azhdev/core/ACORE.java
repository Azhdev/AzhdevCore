package nl.Azhdev.core;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import nl.Azhdev.core.api.packet.NetworkHandler;
import nl.Azhdev.core.lib.Reference;
import nl.Azhdev.core.proxies.IProxy;

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
