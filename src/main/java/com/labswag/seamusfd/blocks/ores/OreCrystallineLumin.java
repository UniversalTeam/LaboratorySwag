package com.labswag.seamusfd.blocks.ores;

import com.labswag.seamusfd.ModLabSwag;
import com.labswag.seamusfd.libs.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

/**
 * Created by SeamusFD on 6/21/14.
 * All rights belong to me!!
 */
public class OreCrystallineLumin extends BlockOre {
    IIcon icon;
    public OreCrystallineLumin(Material p_i45394_1_) {
        super();
        setHardness(10.0F);
        this.setCreativeTab(ModLabSwag.labSwagTabBlocks);
        this.setBlockName("oreCrystallineLumin");
    }

    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public IIcon getIcon(int i, int j) {
        return icon;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegsiter) {
        icon = par1IconRegsiter.registerIcon(ModInfo.MODID + ":LuminousOre");
    }
}
