package net.arikhn.vanillaore.util;

import net.arikhn.vanillaore.data.ModStrings;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent.OnConfigChangedEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * @author Arik Hardiansyah Nugraha
 */

@EventBusSubscriber
public class ConfigHandler 
{
	@SubscribeEvent
	public void onConfigChanged(final OnConfigChangedEvent event)
	{
		if (event.getModID().equals(ModStrings.MODID)) {
			ConfigManager.sync(ModStrings.MODID, Config.Type.INSTANCE);
		}
	}
}

/**
 * Created on 00:30:55 - 17 Nov 2019
 */