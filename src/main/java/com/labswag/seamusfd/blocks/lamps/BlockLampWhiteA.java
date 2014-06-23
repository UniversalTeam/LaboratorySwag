package com.labswag.seamusfd.blocks.lamps;

import com.labswag.seamusfd.ModLabSwag;
import com.labswag.seamusfd.libs.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

/**
 * Created by SeamusFD on 6/11/14.
 * All rights belong to me!!
 */
public class BlockLampWhiteA extends Block {
    public IIcon icon;
    
    public BlockLampWhiteA() {
        super(Material.iron);
        this.blockHardness = 10f;
        this.setCreativeTab(ModLabSwag.labSwagTabBlocks);
        this.setBlockName("lampWhiteA");
        this.setLightLevel(1f);
        this.setBlockTextureName(ModInfo.MODID + ":lampWhite");
    }

    public boolean isOpaqueCube() {
        return false;
    }
    
    @Override
    public IIcon getIcon(int i, int j) }
        return icon;
    }
    
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister) {
        icon = par1IconRegister.registerIcon(ModInfo.MODID + ":lampWhite");
    }
    
}
