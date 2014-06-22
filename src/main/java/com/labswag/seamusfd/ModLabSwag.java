package com.labswag.seamusfd;

import com.labswag.seamusfd.libs.ModInfo;
import com.labswag.seamusfd.proxies.CommonProxy;
import com.labswag.seamusfd.worldgen.WorldGenCrystalLumin;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
//import universalteam.universalcore.utils.UCLogger;

/**
 * Created by SeamusFD on 6/1/14.
 * All rights belong to me!!
 */

@Mod(modid = ModInfo.MODID, name = ModInfo.MODNAME, version = ModInfo.VERSION)
public class ModLabSwag {

//    , dependencies = "required-after:UniversalCore")

    public static CreativeTabs labSwagTabBlocks = new CreativeTabs("labSwagTabBlocks") {
        @Override
        public Item getTabIconItem() {
            return new Item();
        }
    };

    public static CreativeTabs labSwagTabItems = new CreativeTabs("labSwagTabItems") {
        @Override
        public Item getTabIconItem() {
            return new Item();
        }
    };

    public static CreativeTabs labSwagTabMachines = new CreativeTabs("labSwagTabMachines") {
        @Override
        public Item getTabIconItem() {
            return new Item();
        }
    };

    @SidedProxy(clientSide = "com.labswag.seamusfd.proxies.ClientProxy", serverSide = "com.labswag.seamusfd.proxies.CommonProxy")
    public static CommonProxy proxy;

//    public static UCLogger logger = new UCLogger(ModInfo.MODID);

    @Mod.Instance(ModInfo.MODID)
    public static ModLabSwag instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
        GameRegistry.registerWorldGenerator(new WorldGenCrystalLumin(), 5);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit();
    }
}
