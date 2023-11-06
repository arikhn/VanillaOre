/*
 * MIT License
 *
 * Copyright (c) 2023 ArikHn aka RiK
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package io.github.arikhn.vanillaore;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static io.github.arikhn.vanillaore.data.ModData.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.arikhn.vanillaore.util.ConfigHandler;
import io.github.arikhn.vanillaore.world.WorldGenOres;

/**
 * Created on 00:11:16 - 17 Nov 2019
 * 
 * @author Arik Hardiansyah Nugraha
 */
@Mod(modid = MODID, name = MODNAME, version = MODVERSION, certificateFingerprint = FINGERPRINT)
public class Main {
  @Instance
  public static Main instance;
  
  public static final Logger Log = LogManager.getLogger("VANILLAORE");
  
  public static ConfigHandler configHandler = new ConfigHandler();
  
  @EventHandler
  public void preInit(FMLPreInitializationEvent event) {
    MinecraftForge.EVENT_BUS.register(configHandler);
    GameRegistry.registerWorldGenerator(new WorldGenOres(), 3);
  }
  
  @EventHandler
  public void onFingerprintViolation(FMLFingerprintViolationEvent event) {
      Log.warn("Invalid fingerprint detected!");
  }
}