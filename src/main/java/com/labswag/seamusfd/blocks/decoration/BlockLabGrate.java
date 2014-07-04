package com.labswag.seamusfd.blocks.decoration;

import com.labswag.seamusfd.ModLabSwag;
import com.labswag.seamusfd.libs.ModInfo;
import com.labswag.seamusfd.tileentity.TileEntityGrate;
import com.labswag.seamusfd.tileentity.TileEntityScientificGrinder;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

/**
 * Created by SeamusFD on 6/11/14.
 * All rights belong to me!!
 */
public class BlockLabGrate extends Block {
    IIcon icon;
    public BlockLabGrate() {
        super(Material.iron);
        this.blockHardness = 20f;
        this.setCreativeTab(ModLabSwag.labSwagTabBlocks);
        this.setBlockName("labGrate");
        this.canProvidePower();
    }

//    @Override
//    public TileEntity createNewTileEntity(World world, int par2) {
//        return new TileEntityGrate();
//    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

//    public boolean renderAsNormalBlock() {
//        return false;
//    }

    @Override
    public IIcon getIcon(int i, int j) {
        return icon;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegsiter) {
        icon = par1IconRegsiter.registerIcon(ModInfo.MODID + ":labGrate");
    }
}
