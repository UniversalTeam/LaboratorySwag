package com.labswag.seamusfd.client.render.tiles;

import com.labswag.seamusfd.libs.ModInfo;
import com.labswag.seamusfd.models.ModelScientificGrinderOutdated;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Created by SeamusFD on 6/23/14.
 * All rights belong to me!!
 */
public class TESRScientificGrinder extends TileEntitySpecialRenderer {
    private static final ResourceLocation texture = new ResourceLocation(ModInfo.MODID + ":" + "textures/models/ScientificGrinder.png");
    private ModelScientificGrinderOutdated model;

    public TESRScientificGrinder() {
        this.model = new ModelScientificGrinderOutdated();
    }

    public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        GL11.glRotatef(180, 0F, 0F, 1F);
        this.bindTexture(texture);
        GL11.glPushMatrix();
        model.renderModel(0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
