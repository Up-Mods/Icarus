package dev.cammiescorner.icarus.core.integration;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import dev.cammiescorner.icarus.Icarus;

public class IcarusModMenu implements ModMenuApi {
	@Override
	public ConfigScreenFactory<?> getModConfigScreenFactory() {
		return parent -> IcarusConfig.getScreen(parent, Icarus.MOD_ID);
	}
}
