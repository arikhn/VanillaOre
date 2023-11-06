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
package io.github.arikhn.vanillaore.data;

import net.minecraftforge.common.config.Config;

/**
 * Created on 00:22:21 - 17 Nov 2019
 * 
 * @author Arik Hardiansyah Nugraha
 */
@Config(modid = ModData.MODID, category = "vanillaore", name = "Vanilla Ore Settings")
public class ConfigWorldGen {
  @Config.Name(value = "Coal Ore")
  @Config.Comment(value = "Configure Spawn Chance for Coal Ore [If you input 100 or More that will make the Ore endless]")
  @Config.RangeInt(min = 1, max = 250)
  public static int chanceCoal = 20;
  
  @Config.Name(value = "Diamond Ore")
  @Config.Comment(value = "Configure Spawn Chance for Diamond Ore [If you input 100 or More that will make the Ore endless]")
  @Config.RangeInt(min = 1, max = 250)
  public static int chanceDiamond = 1;
  
  @Config.Name(value = "Emerald Ore")
  @Config.Comment(value = "Configure Spawn Chance for Emerald Ore [If you input 100 or More that will make the Ore endless]")
  @Config.RangeInt(min = 1, max = 250)
  public static int chanceEmerald = 1;
  
  @Config.Name(value = "Gold Ore")
  @Config.Comment(value = "Configure Spawn Chance for Gold Ore [If you input 100 or More that will make the Ore endless]")
  @Config.RangeInt(min = 1, max = 250)
  public static int chanceGold = 2;
  
  @Config.Name(value = "Iron Ore")
  @Config.Comment(value = "Configure Spawn Chance for Iron Ore [If you input 100 or More that will make the Ore endless]")
  @Config.RangeInt(min = 1, max = 250)
  public static int chanceIron = 20;
  
  @Config.Name(value = "Lapis Ore")
  @Config.Comment(value = "Configure Spawn Chance for Lapis Ore [If you input 100 or More that will make the Ore endless]")
  @Config.RangeInt(min = 1, max = 250)
  public static int chanceLapis = 1;
  
  @Config.Name(value = "Quartz Ore")
  @Config.Comment(value = "Configure Spawn Chance for Quartz Ore [If you input 100 or More that will make the Ore endless]")
  @Config.RangeInt(min = 1, max = 250)
  public static int chanceQuartz = 2;
  
  @Config.Name(value = "Redstone Ore")
  @Config.Comment(value = "Configure Spawn Chance for Redstone Ore [If you input 100 or More that will make the Ore endless]")
  @Config.RangeInt(min = 1, max = 250)
  public static int chanceRedstone = 8;
}