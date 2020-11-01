/**
 * Copyright (C) 2019 ArikHn
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 **/
package arikhn.vanillaore;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import arikhn.vanillaore.data.ModData;
import arikhn.vanillaore.util.ConfigHandler;
import arikhn.vanillaore.world.WorldGenOres;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * @author Arik Hardiansyah Nugraha
 */

@Mod(modid = ModData.MODID, name = ModData.MODNAME, version = ModData.MODVERSION)
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
