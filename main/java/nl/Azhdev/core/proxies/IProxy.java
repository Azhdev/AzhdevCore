package nl.Azhdev.core.proxies;

import net.minecraft.entity.player.EntityPlayer;

public interface IProxy {
	
	public abstract void registerTileEntities();
	
	public abstract void initRenderingAndTextures();
	
	public abstract void registerEventHandlers();
	
	public abstract void registerKeyBindings();
	
	public abstract EntityPlayer getPlayer();
	
	public abstract void playSound(String soundName, float xCoord, float yCoord, float zCoord, float volume, float pitch);	
}
