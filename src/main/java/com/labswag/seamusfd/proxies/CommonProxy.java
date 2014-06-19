package com.labswag.seamusfd.proxies;

import codechicken.lib.packet.PacketCustom;
import com.labswag.seamusfd.blocks.*;
import com.labswag.seamusfd.blocks.lamps.*;
import com.labswag.seamusfd.compat.MFPluginListener;
import com.labswag.seamusfd.items.SyringeEmpty;
import com.labswag.seamusfd.network.MFSPH;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

/**
 * Created by SeamusFD on 6/1/14.
 * All rights belong to me!!
 */
public class CommonProxy {

    //Blocks
    public static Block labPanel;
    public static Block labPillar;
    public static Block labGrate;

    //Lamps
    public static Block lampWhiteD;
    public static Block lampWhiteA;
    public static Block lampGrayD;
    public static Block lampGrayA;
    public static Block lampBlackD;
    public static Block lampBlackA;
    public static Block lampRedD;
    public static Block lampRedA;
    public static Block lampBlueD;
    public static Block lampBlueA;
    public static Block lampYellowD;
    public static Block lampYellowA;
    public static Block lampGreenD;
    public static Block lampGreenA;
    public static Block lampOrangeD;
    public static Block lampOrangeA;
    public static Block lampPurpleD;
    public static Block lampPurpleA;
    public static Block lampPinkD;
    public static Block lampPinkA;

    //Items
    public static Item syringeEmpty;

//    //armor
//    public static ItemArmor.ArmorMaterial scienceArmor;
//
//    public static Item scienceGlasses;
//    public static Item labCoat;
//    public static Item waterProofPants;
//    public static Item gumBoots;

    public void preInit() {
        initBlocks();
        initItems();
//        initArmorMaterials();
    }

    public void init() {
        PacketCustom.assignHandler(MFSPH.channel, new MFSPH());

        MFPluginListener.handleCommon();
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

//        int ScienceGearRenderIndex = ModLabSwag.proxy.registerArmor("LabArmor");
//        scienceGlasses = new LabCoatTemplate(scienceArmor, ScienceGearRenderIndex, 0, "scienceGlasses", "labarmor");
//        labCoat = new LabCoatTemplate(scienceArmor, ScienceGearRenderIndex, 1, "labCoat", "labarmor");
//        waterProofPants = new LabCoatTemplate(scienceArmor, ScienceGearRenderIndex, 2, "waterProofPants", "labarmor");
//        gumBoots = new LabCoatTemplate(scienceArmor, ScienceGearRenderIndex, 3, "gumBoots", "labarmor");
    }

    protected void initBlocks() {
        //Blocks
        labPanel = new BlockLabPanel();
        GameRegistry.registerBlock(labPanel, "labPanel");

        labPillar = new BlockLabPillar();
        GameRegistry.registerBlock(labPillar, "labPillar");

        labGrate = new BlockLabGrate();
        GameRegistry.registerBlock(labGrate, "labGrate");

        //Lamps
        lampWhiteD = new BlockLampWhiteD();
        GameRegistry.registerBlock(lampWhiteD, "lampWhiteD");
        lampWhiteA = new BlockLampWhiteA();
        GameRegistry.registerBlock(lampWhiteA, "lampWhiteA");

        lampGrayD = new BlockLampGrayD();
        GameRegistry.registerBlock(lampGrayD, "lampGrayD");
        lampGrayA = new BlockLampGrayA();
        GameRegistry.registerBlock(lampGrayA, "lampGrayA");

        lampBlackD = new BlockLampBlackD();
        GameRegistry.registerBlock(lampBlackD, "lampBlackD");
        lampBlackA = new BlockLampBlackA();
        GameRegistry.registerBlock(lampBlackA, "lampBlackA");

        lampRedD = new BlockLampRedD();
        GameRegistry.registerBlock(lampRedD, "lampRedD");
        lampRedA = new BlockLampRedA();
        GameRegistry.registerBlock(lampRedA, "lampRedA");

        lampBlueD = new BlockLampBlueD();
        GameRegistry.registerBlock(lampBlueD, "lampBlueD");
        lampBlueA = new BlockLampBlueA();
        GameRegistry.registerBlock(lampBlueA, "lampBlueA");

        lampYellowD = new BlockLampYellowD();
        GameRegistry.registerBlock(lampYellowD, "lampYellowD");
        lampYellowA = new BlockLampYellowA();
        GameRegistry.registerBlock(lampYellowA, "lampYellowA");

        lampGreenD = new BlockLampGreenD();
        GameRegistry.registerBlock(lampGreenD, "lampGreenD");
        lampGreenA = new BlockLampGreenA();
        GameRegistry.registerBlock(lampGreenA, "lampGreenA");

        lampOrangeD = new BlockLampOrangeD();
        GameRegistry.registerBlock(lampOrangeD, "lampOrangeD");
        lampOrangeA = new BlockLampOrangeA();
        GameRegistry.registerBlock(lampOrangeA, "lampOrangeA");

        lampPurpleD = new BlockLampPurpleD();
        GameRegistry.registerBlock(lampPurpleD, "lampPurpleD");
        lampPurpleA = new BlockLampPurpleA();
        GameRegistry.registerBlock(lampPurpleA, "lampPurpleA");

        lampPinkD = new BlockLampPinkD();
        GameRegistry.registerBlock(lampPinkD, "lampPinkD");
        lampPinkA = new BlockLampPinkA();
        GameRegistry.registerBlock(lampPinkA, "lampPinkA");
    }

//    protected void initArmorMaterials() {
//        scienceArmor = EnumHelper.addArmorMaterial("LabArmor", 33, new int[]{2, 5, 4, 1}, 10);
//    }
}
