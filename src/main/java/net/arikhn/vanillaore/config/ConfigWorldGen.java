package net.arikhn.vanillaore.config;

import net.arikhn.vanillaore.data.ModStrings;
import net.minecraftforge.common.config.Config;

/**
 * @author Arik Hardiansyah Nugraha
 */

@Config(modid = ModStrings.MODID, category = "vanillaore", name = "Vanilla Ore Settings")
public class ConfigWorldGen 
{
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

/**
 * Created on 00:22:21 - 17 Nov 2019
 */