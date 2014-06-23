package com.labswag.seamusfd.client.render;

import codechicken.lib.render.CCModel;
import codechicken.lib.render.CCRenderState;
import codechicken.lib.vec.RedundantTransformation;
import codechicken.lib.vec.SwapYZ;
import codechicken.lib.vec.TransformationList;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import java.util.Map;

/**
 * Created by SeamusFD on 6/23/14.
 * All rights belong to me!!
 */
public class RenderScientificGrinder extends TileEntitySpecialRenderer {

    CCModel scientificGrinder;

    public RenderScientificGrinder() {
        Map<String, CCModel> models = CCModel.parseObjModels(new ResourceLocation("laboratoryswag:models/ModelScientificGrinder.obj"), 7, new SwapYZ());
        scientificGrinder = models.get("Cube");
    }

    public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {
        TransformationList tl = new TransformationList(new RedundantTransformation());

        CCRenderState.reset();
        CCRenderState.useNormals = true;
        CCRenderState.pullLightmap();
        CCRenderState.changeTexture("laboratoryswag:textures/lampWhite.png");
        CCRenderState.startDrawing();
        scientificGrinder.render(tl);
        CCRenderState.draw();
    }

}
