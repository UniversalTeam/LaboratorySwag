package com.labswag.seamusfd.blocks.lamps;

import com.labswag.seamusfd.ModLabSwag;
import com.labswag.seamusfd.libs.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created by SeamusFD on 6/11/14.
 * All rights belong to me!!
 */
public class BlockLampBlackD extends Block {
    public BlockLampBlackD() {
        super(Material.iron);
        this.blockHardness = 10f;
        this.setCreativeTab(ModLabSwag.labSwagTabBlocks);
        this.setBlockName("lampBlackD");
        this.setBlockTextureName(ModInfo.MODID + "lampBlackD.png");
    }

    public boolean onBlockActivated(World world, int in1, int int2, int int3, EntityPlayer player, int int4, float float1, float float2, float float3) {
        if (world.isRemote) {
            return true;
        }
        else {
            this.setLightLevel(4f);
            return true;
        }
    }

    public void breakBlock(World world, int int1, int int2, int int3, Block block1, int int4) {
        this.setLightLevel(0f);
    }

    public boolean isOpaqueCube() {
        return false;
    }
}
