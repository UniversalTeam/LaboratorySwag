//package com.labswag.seamusfd.items.armor;
//
//import com.labswag.seamusfd.ModLabSwag;
//import com.labswag.seamusfd.libs.ModInfo;
//import net.minecraft.client.renderer.texture.IIconRegister;
//import net.minecraft.entity.Entity;
//import net.minecraft.item.ItemArmor;
//import net.minecraft.item.ItemStack;
//
///**
// * Created by SeamusFD on 6/1/14.
// * All rights belong to me!!
// */
//public class LabCoatTemplate extends ItemArmor {
//    protected String unlocalizedName;
//    protected String layerName;
//
//    public LabCoatTemplate(ArmorMaterial armorMaterial, int renderIndex, int armorType, String unlocalizedName, String layerName)
//    {
//        super(armorMaterial, renderIndex, armorType);
//        this.setUnlocalizedName(unlocalizedName);
//        this.setCreativeTab(ModLabSwag.labSwagTabBlocks);
//        this.unlocalizedName = unlocalizedName;
//        this.layerName = layerName;
//    }
//
//    @Override
//    public void registerIcons(IIconRegister register)
//    {
//        this.itemIcon = register.registerIcon(ModInfo.MODID + ":" + unlocalizedName);
//    }
//
//    @Override
//    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
//    {
//        return ModInfo.MODID + ":/textures/models/armor/" + layerName + "_layer_" + (slot == 2 ? "2" : "1") + ".png";
//    }
//}
