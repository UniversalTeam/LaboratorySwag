package com.labswag.seamusfd.proxies;

import com.labswag.seamusfd.client.render.tiles.TESRScientificGrinder;
import com.labswag.seamusfd.tileentity.TileEntityScientificGrinder;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

/**
 * Created by SeamusFD on 6/1/14.
 * All rights belong to me!!
 */
public class ClientProxy extends CommonProxy {

    public void preInit() {
        super.preInit();
        renderMachines();
    }

    public void init() {
        super.init();
    }

    public void postInit() {
        super.postInit();
    }

//    public int registerArmor(String armor) {
//        return RenderingRegistry.addNewArmourRendererPrefix(armor);
//    }

    protected void renderMachines() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityScientificGrinder.class, new TESRScientificGrinder());
    }
}
