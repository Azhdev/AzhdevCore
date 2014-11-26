package nl.Azhdev.core.proxies;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Loader;
import nl.Azhdev.core.api.keybindings.KeyBindings;

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
