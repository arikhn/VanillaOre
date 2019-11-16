package net.arikhn.vanillaore;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.arikhn.vanillaore.data.ModStrings;
import net.arikhn.vanillaore.world.WorldGenOres;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * @author Arik Hardiansyah Nugraha
 */

@Mod(modid = ModStrings.MODID, name = ModStrings.MODNAME, version = ModStrings.MODVERSION)
public class Main 
{
	@Instance
	public static Main instance;
	
	public static final Logger Log = LogManager.getLogger("VANILLAORE");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new WorldGenOres(), 3);
	}
}

/**
 * Created on 00:11:16 - 17 Nov 2019
 */