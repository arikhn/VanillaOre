package net.arikhn.vanillaore.world;

import java.util.Random;

import net.arikhn.vanillaore.config.ConfigWorldGen;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

/**
 * @author Arik Hardiansyah Nugraha
 */

public class WorldGenOres implements IWorldGenerator
{
	/**
	 * This is for generate ore in dimension variation
	 */
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		/**
		 * Generate Ore Nether
		 */
		if (world.provider.getDimension() == -1)
		{
			generateNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		
		/**
		 * Generate Ore Overworld
		 */
		if (world.provider.getDimension() == 0)
		{
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		
		/**
		 * Generate Ore End
		 */
		if (world.provider.getDimension() == 1)
		{
			generateEnd(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	
	/**
	 * Generate Ore End<br/>
	 * Input your Custom Ore here
	 * @param random
	 * @param chunkX
	 * @param chunkZ
	 * @param world
	 * @param chunkGenerator
	 * @param chunkProvider
	 */
	private void generateEnd(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		//WIP
	}
	
	/**
	 * Generate Ore Nether<br/>
	 * Input your Custom Ore here
	 * @param random
	 * @param chunkX
	 * @param chunkZ
	 * @param world
	 * @param chunkGenerator
	 * @param chunkProvider
	 */
	private void generateNether(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		generateOre(Blocks.QUARTZ_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 200, random.nextInt(8) + 2, ConfigWorldGen.chanceQuartz, Blocks.NETHERRACK);
	}
	
	/**
	 * Generate Ore Overworld<br/>
	 * Input your Custom Ore here
	 * @param random
	 * @param chunkX
	 * @param chunkZ
	 * @param world
	 * @param chunkGenerator
	 * @param chunkProvider
	 */
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		//Vanilla Ores
		generateOre(Blocks.COAL_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 128, random.nextInt(7) + 4, ConfigWorldGen.chanceCoal, Blocks.STONE);
		generateOre(Blocks.DIAMOND_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 16, random.nextInt(7) + 4, ConfigWorldGen.chanceDiamond, Blocks.STONE);
		generateOre(Blocks.EMERALD_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 16, random.nextInt(7) + 4, ConfigWorldGen.chanceEmerald, Blocks.STONE);
		generateOre(Blocks.GOLD_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 32, random.nextInt(7) + 4, ConfigWorldGen.chanceGold, Blocks.STONE);
		generateOre(Blocks.IRON_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 64, random.nextInt(7) + 4, ConfigWorldGen.chanceIron, Blocks.STONE);
		generateOre(Blocks.LAPIS_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 16, random.nextInt(7) + 4, ConfigWorldGen.chanceLapis, Blocks.STONE);
		generateOre(Blocks.REDSTONE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 16, random.nextInt(7) + 4, ConfigWorldGen.chanceRedstone, Blocks.STONE);
	}
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances, Block block)
	{
		int deltaY = maxY - minY;
		for (int i = 0; i < chances; i++)
		{
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			WorldGenMinable generator = new WorldGenMinable(ore, size, BlockMatcher.forBlock(block));
			generator.generate(world, random, pos);
		}
	}

}

/**
 * Created on 00:24:30 - 17 Nov 2019
 */