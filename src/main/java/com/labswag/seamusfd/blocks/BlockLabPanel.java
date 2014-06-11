package com.labswag.seamusfd.blocks;

import com.labswag.seamusfd.ModLabSwag;
import com.labswag.seamusfd.libs.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by SeamusFD on 6/1/14.
 * All rights belong to me!!
 */
public class BlockLabPanel extends Block {
    public BlockLabPanel() {
        super(Material.iron);
        this.blockHardness = 10f;
        this.setCreativeTab(ModLabSwag.labSwagTabBlocks);
        this.setBlockName("labPanel");
        this.setBlockTextureName(ModInfo.MODID + "labPanel.png");
    }
}
