package com.labswag.seamusfd.items.crafting;

import com.labswag.seamusfd.ModLabSwag;
import com.labswag.seamusfd.libs.ModInfo;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

/**
 * Created by SeamusFD on 6/21/14.
 * All rights belong to me!!
 */
public class ItemRedLuminousDust extends Item {
    public ItemRedLuminousDust() {
        this.setUnlocalizedName("redLuminousDust");
        this.setCreativeTab(ModLabSwag.labSwagTabItems);
        this.setMaxDamage(44);
    }

    @Override
    public void registerIcons(IIconRegister par1IconRegister) {
        this.itemIcon = par1IconRegister.registerIcon(ModInfo.MODID + ":RedLuminousDust");
    }
}
