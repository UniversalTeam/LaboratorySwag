package com.labswag.seamusfd.blocks.ores;

import com.labswag.seamusfd.ModLabSwag;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;

/**
 * Created by SeamusFD on 6/21/14.
 * All rights belong to me!!
 */
public class OreCrystallineLumin extends BlockOre {
    public OreCrystallineLumin(Material p_i45394_1_) {
        super();
        setHardness(10.0F);
        this.setCreativeTab(ModLabSwag.labSwagTabBlocks);
        this.setBlockName("oreCrystallineLumin");
    }
}
