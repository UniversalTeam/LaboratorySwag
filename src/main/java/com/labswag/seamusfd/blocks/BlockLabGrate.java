package com.labswag.seamusfd.blocks;

import com.labswag.seamusfd.ModLabSwag;
import com.labswag.seamusfd.libs.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by SeamusFD on 6/11/14.
 * All rights belong to me!!
 */
public class BlockLabGrate extends Block {
    public BlockLabGrate() {
        super(Material.iron);
        this.blockHardness = 20f;
        this.setCreativeTab(ModLabSwag.labSwagTabBlocks);
        this.setBlockName("labGrate");
        this.canProvidePower();
        this.setBlockTextureName(ModInfo.MODID + "labGrate.png");
    }
}
