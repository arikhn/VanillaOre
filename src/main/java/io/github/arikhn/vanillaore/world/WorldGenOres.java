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
package io.github.arikhn.vanillaore.world;

import java.util.Random;

import io.github.arikhn.vanillaore.data.ConfigWorldGen;

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
 * Created on 00:24:30 - 17 Nov 2019
 * 
 * @author Arik Hardiansyah Nugraha
 */
public class WorldGenOres implements IWorldGenerator {
  /**
   * This is for generate ore in dimension variation
   */
  @Override
  public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
    /**
     * Generate Ore Nether
     */
    if (world.provider.getDimension() == -1) {
      this.generateNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
    }
    
    /**
     * Generate Ore Overworld
     */
    if (world.provider.getDimension() == 0) {
      this.generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
    }
  }
  
  /**
   * Generate Ore Nether.
   * 
   * @param random
   * @param chunkX
   * @param chunkZ
   * @param world
   * @param chunkGenerator
   * @param chunkProvider
   */
  private void generateNether(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
    this.generateOre(Blocks.QUARTZ_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 200, random.nextInt(8) + 2, ConfigWorldGen.chanceQuartz, Blocks.NETHERRACK);
  }
  
  /**
   * Generate Ore Overworld.
   * 
   * @param random
   * @param chunkX
   * @param chunkZ
   * @param world
   * @param chunkGenerator
   * @param chunkProvider
   */
  private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
    this.generateOre(Blocks.COAL_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 128, random.nextInt(7) + 4, ConfigWorldGen.chanceCoal, Blocks.STONE);
    this.generateOre(Blocks.DIAMOND_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 16, random.nextInt(7) + 4, ConfigWorldGen.chanceDiamond, Blocks.STONE);
    this.generateOre(Blocks.EMERALD_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 16, random.nextInt(7) + 4, ConfigWorldGen.chanceEmerald, Blocks.STONE);
    this.generateOre(Blocks.GOLD_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 32, random.nextInt(7) + 4, ConfigWorldGen.chanceGold, Blocks.STONE);
    this.generateOre(Blocks.IRON_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 64, random.nextInt(7) + 4, ConfigWorldGen.chanceIron, Blocks.STONE);
    this.generateOre(Blocks.LAPIS_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 16, random.nextInt(7) + 4, ConfigWorldGen.chanceLapis, Blocks.STONE);
    this.generateOre(Blocks.REDSTONE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 16, random.nextInt(7) + 4, ConfigWorldGen.chanceRedstone, Blocks.STONE);
  }
  
  private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances, Block block) {
    int deltaY = maxY - minY;
    for (int i = 0; i < chances; i++) {
      BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
      WorldGenMinable generator = new WorldGenMinable(ore, size, BlockMatcher.forBlock(block));
      generator.generate(world, random, pos);
    }
  }
}