package com.labswag.seamusfd.blocks.decoration;

import com.labswag.seamusfd.ModLabSwag;
import com.labswag.seamusfd.libs.ModInfo;
import com.labswag.seamusfd.tileentity.TileEntityGrate;
import com.labswag.seamusfd.tileentity.TileEntityScientificGrinder;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by SeamusFD on 6/11/14.
 * All rights belong to me!!
 */
public class BlockLabGrate extends BlockContainer {
    public BlockLabGrate() {
        super(Material.iron);
        this.blockHardness = 20f;
        this.setCreativeTab(ModLabSwag.labSwagTabBlocks);
        this.setBlockName("labGrate");
        this.canProvidePower();
        this.setBlockTextureName(ModInfo.MODID + "labGrate.png");
    }

    @Override
    public TileEntity createNewTileEntity(World world, int par2) {
        return new TileEntityGrate();
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
