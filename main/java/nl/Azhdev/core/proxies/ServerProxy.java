package nl.Azhdev.core.proxies;

import net.minecraft.entity.player.EntityPlayer;

public class ServerProxy extends CommonProxy{

	@Override
	public void initRenderingAndTextures() {
		//NOOP
		
	}

	@Override
	public void registerKeyBindings() {
		//NOOP
		
	}

	@Override
	public EntityPlayer getPlayer() {
		return null;
	}

	@Override
	public void playSound(String soundName, float xCoord, float yCoord, float zCoord, float volume, float pitch) {
		//NOOP
	}

}
