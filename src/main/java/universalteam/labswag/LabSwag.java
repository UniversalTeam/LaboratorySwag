package universalteam.labswag;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import universalteam.labswag.lib.Reference;
import universalteam.labswag.proxies.CommonProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class LabSwag
{
    @Mod.Instance(Reference.MOD_ID)
    public static LabSwag instance;

    @SidedProxy(clientSide = "universalteam.labswag.proxies.ClientProxy", serverSide = "universalteam.labswag.proxies.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent preEvent)
    {
        proxy.preInit();
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
        {
            proxy.Init();
        }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent postEvent)
        {
            proxy.postInit();
        }
}