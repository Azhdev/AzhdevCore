package nl.Azhdev.core.api.keybindings;

import net.minecraft.client.settings.KeyBinding;
import nl.Azhdev.core.lib.names;

import org.lwjgl.input.Keyboard;

public class KeyBindings {
	public static KeyBinding activate = new KeyBinding(names.Keys.TAUNTACTIVATE, Keyboard.KEY_NUMPAD3, names.Keys.TAUNTCATEGORY);
}
