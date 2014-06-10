package com.labswag.seamusfd.proxies;

import com.labswag.seamusfd.ModLabSwag;
import com.labswag.seamusfd.blocks.BlockLabPanel;
import com.labswag.seamusfd.blocks.BlockLabPillar;
import com.labswag.seamusfd.items.SyringeEmpty;
import com.labswag.seamusfd.items.armor.LabCoatTemplate;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by SeamusFD on 6/1/14.
 * All rights belong to me!!
 */
public class CommonProxy {

    //Blocks
    public static Block labPanel;
    public static Block labPillar;

    //Items
    public static Item syringeEmpty;

    //armor
    public static ItemArmor.ArmorMaterial scienceArmor;

    public static Item scienceGlasses;
    public static Item labCoat;
    public static Item waterProofPants;
    public static Item gumBoots;

    public void preInit() {
        initBlocks();
        initItems();
        initArmorMaterials();
    }

    public void init() {
    }

    public void postInit() {
    }

    public int registerArmor(String armor)
    {
        return 0;
    }

    protected void initItems() {
        //Items
        syringeEmpty = new SyringeEmpty();
        GameRegistry.registerItem(syringeEmpty, "syringeEmpty");

        int ScienceGearRenderIndex = ModLabSwag.proxy.registerArmor("LabArmor");
        scienceGlasses = new LabCoatTemplate(scienceArmor, ScienceGearRenderIndex, 0, "scienceGlasses", "labarmor");
        labCoat = new LabCoatTemplate(scienceArmor, ScienceGearRenderIndex, 1, "labCoat", "labarmor");
        waterProofPants = new LabCoatTemplate(scienceArmor, ScienceGearRenderIndex, 2, "waterProofPants", "labarmor");
        gumBoots = new LabCoatTemplate(scienceArmor, ScienceGearRenderIndex, 3, "gumBoots", "labarmor");
    }

    protected void initBlocks() {
        //Blocks
        labPanel = new BlockLabPanel();
        GameRegistry.registerBlock(labPanel, "labPanel");

        labPillar = new BlockLabPillar();
        GameRegistry.registerBlock(labPillar, "labPillar");
    }

    protected void initArmorMaterials() {
        scienceArmor = EnumHelper.addArmorMaterial("LabArmor", 33, new int[]{2, 5, 4, 1}, 10);
    }
}
