package com.labswag.seamusfd.blocks.lamps;

import com.labswag.seamusfd.ModLabSwag;
import com.labswag.seamusfd.libs.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by SeamusFD on 6/14/14.
 * All rights belong to me!!
 */
public class BlockLampPurpleA extends Block {
    public BlockLampPurpleA() {
        super(Material.iron);
        this.blockHardness = 10f;
        this.setCreativeTab(ModLabSwag.labSwagTabBlocks);
        this.setBlockName("lampPurpleA");
        this.setLightLevel(1f);
        this.setBlockTextureName(ModInfo.MODID + "lampPurpleA.png");
    }

    public boolean isOpaqueCube() {
        return false;
    }
}
