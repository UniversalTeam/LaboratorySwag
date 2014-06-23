package com.labswag.seamusfd.blocks.lamps;

import com.labswag.seamusfd.ModLabSwag;
import com.labswag.seamusfd.libs.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

/**
 * Created by SeamusFD on 6/14/14.
 * All rights belong to me!!
 */
public class BlockLampPinkA extends Block {
    public IIcon icon;
    public BlockLampPinkA() {
        super(Material.iron);
        this.blockHardness = 10f;
        this.setCreativeTab(ModLabSwag.labSwagTabBlocks);
        this.setBlockName("lampPinkA");
        this.setLightLevel(1f);
    }

    @Override
    public IIcon getIcon(int i, int j) {
        return icon;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegsiter) {
        icon = par1IconRegsiter.registerIcon(ModInfo.MODID + ":lampPink");
    }

    public boolean isOpaqueCube() {
        return false;
    }
}
