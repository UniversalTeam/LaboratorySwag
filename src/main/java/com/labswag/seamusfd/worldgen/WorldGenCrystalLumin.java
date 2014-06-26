package com.labswag.seamusfd.worldgen;

/**
 * Created by SeamusFD on 6/21/14.
 * All rights belong to me!!
 */

import com.labswag.seamusfd.proxies.CommonProxy;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import java.util.Random;

public class WorldGenCrystalLumin implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.dimensionId){
            case 0 : generateSurface(world, random,chunkX*16,chunkZ*16);
        }
    }


    private void generateSurface(World world, Random random, int BlockX, int BlockZ) {
        for(int i =0; i<10;i++){
            int Xcoord = BlockX + random.nextInt(8);
            int Zcoord = BlockZ + random.nextInt(8);
            int Ycoord = random.nextInt(8);

            (new WorldGenMinable(CommonProxy.oreCrystallineLumin, 4)).generate(world, random, Xcoord, Ycoord, Zcoord);
        }}}
