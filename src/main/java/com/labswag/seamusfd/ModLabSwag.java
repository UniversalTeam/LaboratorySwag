package com.labswag.seamusfd;

import com.labswag.seamusfd.libs.ModInfo;
import com.labswag.seamusfd.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by SeamusFD on 6/1/14.
 * All rights belong to me!!
 */

@Mod(modid = ModInfo.MODID, name = ModInfo.MODNAME, version = ModInfo.VERSION)
public class ModLabSwag {

    public static CreativeTabs labSwagTab = new CreativeTabs("labSwagTab") {
        @Override
        public Item getTabIconItem() {
            return new Item();
        }
    };

    @SidedProxy(clientSide = "com.labswag.seamusfd.proxies.ClientProxy", serverSide = "com.labswag.seamusfd.proxies.CommonProxy")
    public static CommonProxy proxy;

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
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit();
    }
}
