package com.labswag.seamusfd.blocks.machines;

import com.labswag.seamusfd.ModLabSwag;
import com.labswag.seamusfd.tileentity.TileEntityScientificGrinder;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by SeamusFD on 6/21/14.
 * All rights belong to me!!
 */
public class MachineScientificGrinder extends BlockContainer {
    public MachineScientificGrinder() {
        super(Material.rock);
        this.setBlockName("machineScientificGrinder");
        this.setCreativeTab(ModLabSwag.labSwagTabMachines);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int par2) {
        return new TileEntityScientificGrinder();
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
