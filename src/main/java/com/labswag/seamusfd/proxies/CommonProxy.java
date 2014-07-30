package com.labswag.seamusfd.proxies;

import codechicken.lib.packet.PacketCustom;
import com.labswag.seamusfd.blocks.decoration.BlockLabGrate;
import com.labswag.seamusfd.blocks.decoration.BlockLabPanel;
import com.labswag.seamusfd.blocks.decoration.BlockLabPillar;
import com.labswag.seamusfd.blocks.lamps.*;
//import com.labswag.seamusfd.compat.MFPluginListener;
import com.labswag.seamusfd.blocks.ores.OreCrystallineLumin;
import com.labswag.seamusfd.compat.MFPluginListener;
//import com.labswag.seamusfd.network.MFSPH;
import com.labswag.seamusfd.items.crafting.*;
import com.labswag.seamusfd.network.MFSPH;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by SeamusFD on 6/1/14.
 * All rights belong to me!!
 */
public class CommonProxy {

    //Blocks
    public static Block labPanel;
    public static Block labPillar;
    public static Block labGrate;
    public static Block oreCrystallineLumin;

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
    public static Item luminousDust;
    public static Item grayLuminousDust;
    public static Item blackLuminousDust;
    public static Item redLuminousDust;
    public static Item blueLuminousDust;
    public static Item yellowLuminousDust;
    public static Item greenLuminousDust;
    public static Item orangeLuminousDust;
    public static Item purpleLuminousDust;
    public static Item pinkLuminousDust;
    public static Item crystalLumin;

    //Machines
    public static Block machineScientificGrinder;

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
        initRecipes();
        initMachines();
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
        crystalLumin = new ItemCrystalLumin();
        GameRegistry.registerItem(crystalLumin, "crystalLumin");

        luminousDust = new ItemLuminousDust();
        GameRegistry.registerItem(luminousDust, "luminousDust");

        grayLuminousDust = new ItemGrayLuminousDust();
        GameRegistry.registerItem(grayLuminousDust, "grayLuminousDust");

        blackLuminousDust = new ItemBlackLuminousDust();
        GameRegistry.registerItem(blackLuminousDust, "blackLuminousDust");

        redLuminousDust = new ItemRedLuminousDust();
        GameRegistry.registerItem(redLuminousDust, "redLuminousDust");

        blueLuminousDust = new ItemBlueLuminousDust();
        GameRegistry.registerItem(blueLuminousDust, "blueLuminousDust");

        yellowLuminousDust = new ItemYellowLuminousDust();
        GameRegistry.registerItem(yellowLuminousDust, "yellowLuminousDust");

        greenLuminousDust = new ItemGreenLuminousDust();
        GameRegistry.registerItem(greenLuminousDust, "greenLuminousDust");

        orangeLuminousDust = new ItemOrangeLuminousDust();
        GameRegistry.registerItem(orangeLuminousDust, "orangeLuminousDust");

        purpleLuminousDust = new ItemPurpleLuminousDust();
        GameRegistry.registerItem(purpleLuminousDust, "purpleLuminousDust");

        pinkLuminousDust = new ItemPinkLuminousDust();
        GameRegistry.registerItem(pinkLuminousDust, "pinkLuminousDust");

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

        oreCrystallineLumin = new OreCrystallineLumin(Material.iron);
        GameRegistry.registerBlock(oreCrystallineLumin, "oreCrystallineLumin");

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

    protected void initMachines() {
        //Generic
//        machineScientificGrinder = new MachineScientificGrinder();
//        GameRegistry.registerBlock(machineScientificGrinder, "machineScientificGrinder");
//        GameRegistry.registerTileEntity(TileEntityScientificGrinder.class, "tileEnitityScientificGrinder");
    }

    protected void initRecipes() {

        GameRegistry.addSmelting(oreCrystallineLumin, new ItemStack(crystalLumin), 0.1f);

        GameRegistry.addRecipe(new ItemStack(lampWhiteD, 5),
                "yxy",
                "xzx",
                "yxy",
                'y', Items.iron_ingot, 'x', Blocks.iron_bars, 'z', luminousDust);

        GameRegistry.addRecipe(new ItemStack(lampWhiteA, 2),
                "yxy",
                "xzx",
                "yxy",
                'y', Items.gold_ingot, 'x', Blocks.iron_bars, 'z', luminousDust);

        GameRegistry.addRecipe(new ItemStack(lampGrayD, 5),
                "yxy",
                "xzx",
                "yxy",
                'y', Items.iron_ingot, 'x', Blocks.iron_bars, 'z', grayLuminousDust);

        GameRegistry.addRecipe(new ItemStack(lampGrayA, 2),
                "yxy",
                "xzx",
                "yxy",
                'y', Items.gold_ingot, 'x', Blocks.iron_bars, 'z', grayLuminousDust);

        GameRegistry.addRecipe(new ItemStack(lampBlackD, 5),
                "yxy",
                "xzx",
                "yxy",
                'y', Items.iron_ingot, 'x', Blocks.iron_bars, 'z', blackLuminousDust);

        GameRegistry.addRecipe(new ItemStack(lampBlackA, 2),
                "yxy",
                "xzx",
                "yxy",
                'y', Items.gold_ingot, 'x', Blocks.iron_bars, 'z', blackLuminousDust);

        GameRegistry.addRecipe(new ItemStack(lampRedD, 5),
                "yxy",
                "xzx",
                "yxy",
                'y', Items.iron_ingot, 'x', Blocks.iron_bars, 'z', redLuminousDust);

        GameRegistry.addRecipe(new ItemStack(lampRedA, 2),
                "yxy",
                "xzx",
                "yxy",
                'y', Items.gold_ingot, 'x', Blocks.iron_bars, 'z', redLuminousDust);

        GameRegistry.addRecipe(new ItemStack(lampBlueD, 5),
                "yxy",
                "xzx",
                "yxy",
                'y', Items.iron_ingot, 'x', Blocks.iron_bars, 'z', blueLuminousDust);

        GameRegistry.addRecipe(new ItemStack(lampBlueA, 2),
                "yxy",
                "xzx",
                "yxy",
                'y', Items.gold_ingot, 'x', Blocks.iron_bars, 'z', blueLuminousDust);

        GameRegistry.addRecipe(new ItemStack(lampYellowD, 5),
                "yxy",
                "xzx",
                "yxy",
                'y', Items.iron_ingot, 'x', Blocks.iron_bars, 'z', yellowLuminousDust);

        GameRegistry.addRecipe(new ItemStack(lampYellowA, 2),
                "yxy",
                "xzx",
                "yxy",
                'y', Items.gold_ingot, 'x', Blocks.iron_bars, 'z', yellowLuminousDust);

        GameRegistry.addRecipe(new ItemStack(lampGreenD, 5),
                "yxy",
                "xzx",
                "yxy",
                'y', Items.iron_ingot, 'x', Blocks.iron_bars, 'z', greenLuminousDust);

        GameRegistry.addRecipe(new ItemStack(lampGreenA, 2),
                "yxy",
                "xzx",
                "yxy",
                'y', Items.gold_ingot, 'x', Blocks.iron_bars, 'z', greenLuminousDust);

        GameRegistry.addRecipe(new ItemStack(lampOrangeD, 5),
                "yxy",
                "xzx",
                "yxy",
                'y', Items.iron_ingot, 'x', Blocks.iron_bars, 'z', orangeLuminousDust);

        GameRegistry.addRecipe(new ItemStack(lampOrangeA, 2),
                "yxy",
                "xzx",
                "yxy",
                'y', Items.gold_ingot, 'x', Blocks.iron_bars, 'z', orangeLuminousDust);

        GameRegistry.addRecipe(new ItemStack(lampPurpleD, 5),
                "yxy",
                "xzx",
                "yxy",
                'y', Items.iron_ingot, 'x', Blocks.iron_bars, 'z', purpleLuminousDust);

        GameRegistry.addRecipe(new ItemStack(lampPurpleA, 2),
                "yxy",
                "xzx",
                "yxy",
                'y', Items.gold_ingot, 'x', Blocks.iron_bars, 'z', purpleLuminousDust);

        GameRegistry.addRecipe(new ItemStack(lampPinkD, 5),
                "yxy",
                "xzx",
                "yxy",
                'y', Items.iron_ingot, 'x', Blocks.iron_bars, 'z', pinkLuminousDust);

        GameRegistry.addRecipe(new ItemStack(lampPinkA, 2),
                "yxy",
                "xzx",
                "yxy",
                'y', Items.gold_ingot, 'x', Blocks.iron_bars, 'z', pinkLuminousDust);
    }

//    protected void initArmorMaterials() {
//        scienceArmor = EnumHelper.addArmorMaterial("LabArmor", 33, new int[]{2, 5, 4, 1}, 10);
//    }
}
