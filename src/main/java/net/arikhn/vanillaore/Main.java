package net.arikhn.vanillaore;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.arikhn.vanillaore.data.ModStrings;
import net.arikhn.vanillaore.util.ConfigHandler;
import net.arikhn.vanillaore.world.WorldGenOres;
import net.minecraftforge.common.MinecraftForge;
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
	
	//Event Handler
	public static ConfigHandler configHandler = new ConfigHandler();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(configHandler);
		GameRegistry.registerWorldGenerator(new WorldGenOres(), 3);
	}
}

/**
 * Created on 00:11:16 - 17 Nov 2019
 */