package com.labswag.seamusfd.blocks.machines;

import com.labswag.seamusfd.ModLabSwag;
import com.labswag.seamusfd.tileentity.TileEntityScientificGrinder;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by SeamusFD on 6/21/14.
 * All rights belong to me!!
 */
public class MachineScientificGrinder extends BlockContainer {

    private final boolean bool2;

    public MachineScientificGrinder(boolean bool1) {
        super(Material.rock);
        this.setBlockName("machineScientificGrinder");
        this.setCreativeTab(ModLabSwag.labSwagTabMachines);
        this.bool2 = bool1;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int par2) {
        return new TileEntityScientificGrinder();
    }

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int int1, int in2, int int3, Random rand)
    {
        if (this.bool2)
        {
            int l = world.getBlockMetadata(int1, in2, int3);
            float f = (float)int1 + 0.5F;
            float f1 = (float)in2 + 0.0F + rand.nextFloat() * 6.0F / 16.0F;
            float f2 = (float)int3 + 0.5F;
            float f3 = 0.52F;
            float f4 = rand.nextFloat() * 0.6F - 0.3F;

            if (l == 4)
            {
                world.spawnParticle("smoke", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
                world.spawnParticle("flame", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
            }
            else if (l == 5)
            {
                world.spawnParticle("smoke", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
                world.spawnParticle("flame", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
            }
            else if (l == 2)
            {
                world.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D);
                world.spawnParticle("flame", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D);
            }
            else if (l == 3)
            {
                world.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D);
                world.spawnParticle("flame", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D);
            }
        }
    }

    @Override
    public int getRenderType() {
        return -1;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }
}
