package nl.Azhdev.core.proxies;

import net.minecraft.entity.player.EntityPlayer;
import nl.Azhdev.core.api.keybindings.KeyBindings;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.Loader;

public class ClientProxy extends CommonProxy{

	@Override
	public void initRenderingAndTextures() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerKeyBindings() {
		if(Loader.isModLoaded("tau")){
			ClientRegistry.registerKeyBinding(KeyBindings.activate);
		}
		
	}

	@Override
	public void playSound(String soundName, float xCoord, float yCoord, float zCoord, float volume, float pitch) {
		FMLClientHandler.instance().getClient().theWorld.playSound(xCoord, yCoord, zCoord, soundName, volume, pitch, true);
		
	}

	@Override
	public EntityPlayer getPlayer() {
		return FMLClientHandler.instance().getClient().thePlayer;
	}

}
