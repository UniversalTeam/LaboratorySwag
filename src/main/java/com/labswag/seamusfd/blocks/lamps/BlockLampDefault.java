//package com.labswag.seamusfd.blocks.lamps;
//
//import com.labswag.seamusfd.ModLabSwag;
//import com.labswag.seamusfd.proxies.CommonProxy;
//import cpw.mods.fml.relauncher.Side;
//import cpw.mods.fml.relauncher.SideOnly;
//import net.minecraft.block.Block;
//import net.minecraft.block.material.Material;
//import net.minecraft.init.Blocks;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemStack;
//import net.minecraft.world.World;
//
//import java.util.Random;
//
///**
// * Created by SeamusFD on 28.06.2014Saturday.
// * All rights belong to me!!
// */
//public class BlockLampDefault extends Block {
//    private final boolean bool1;
//    public BlockLampDefault(boolean p_i45421_1_) {
//        super(Material.iron);
//        this.blockHardness = 10f;
//        this.setCreativeTab(ModLabSwag.labSwagTabBlocks);
//
//        this.setLightLevel(1f);
//        this.bool1 = p_i45421_1_;
//
//        if (p_i45421_1_)
//        {
//            this.setLightLevel(1.0F);
//        }
//    }
//
//    /**
//     * Called whenever the block is added into the world. Args: world, x, y, z
//     */
//    public void onBlockAdded(World p_149726_1_, int p_149726_2_, int p_149726_3_, int p_149726_4_)
//    {
//        if (!p_149726_1_.isRemote)
//        {
//            if (this.bool1 && !p_149726_1_.isBlockIndirectlyGettingPowered(p_149726_2_, p_149726_3_, p_149726_4_))
//            {
//                p_149726_1_.scheduleBlockUpdate(p_149726_2_, p_149726_3_, p_149726_4_, this, 4);
//            }
//            else if (!this.bool1 && p_149726_1_.isBlockIndirectlyGettingPowered(p_149726_2_, p_149726_3_, p_149726_4_))
//            {
//                p_149726_1_.setBlock(p_149726_2_, p_149726_3_, p_149726_4_, Blocks.lit_redstone_lamp, 0, 2);
//            }
//        }
//    }
//
//    /**
//     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
//     * their own) Args: x, y, z, neighbor Block
//     */
//    public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_)
//    {
//        if (!p_149695_1_.isRemote)
//        {
//            if (this.bool1 && !p_149695_1_.isBlockIndirectlyGettingPowered(p_149695_2_, p_149695_3_, p_149695_4_))
//            {
//                p_149695_1_.scheduleBlockUpdate(p_149695_2_, p_149695_3_, p_149695_4_, this, 4);
//            }
//            else if (!this.bool1 && p_149695_1_.isBlockIndirectlyGettingPowered(p_149695_2_, p_149695_3_, p_149695_4_))
//            {
//                p_149695_1_.setBlock(p_149695_2_, p_149695_3_, p_149695_4_, Blocks.lit_redstone_lamp, 0, 2);
//            }
//        }
//    }
//
//    /**
//     * Ticks the block if it's been scheduled
//     */
//    public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
//    {
//        if (!p_149674_1_.isRemote && this.bool1 && !p_149674_1_.isBlockIndirectlyGettingPowered(p_149674_2_, p_149674_3_, p_149674_4_))
//        {
//            p_149674_1_.setBlock(p_149674_2_, p_149674_3_, p_149674_4_, CommonProxy.blockLampDefault, 0, 2);
//        }
//    }
//
//    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
//    {
//        return Item.getItemFromBlock(CommonProxy.blockLampDefault);
//    }
//
//    /**
//     * Gets an item for the block being called on. Args: world, x, y, z
//     */
//    @SideOnly(Side.CLIENT)
//    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
//    {
//        return Item.getItemFromBlock(CommonProxy.blockLampDefault);
//    }
//
//    /**
//     * Returns an item stack containing a single instance of the current block type. 'i' is the block's subtype/damage
//     * and is ignored for blocks which do not support subtypes. Blocks which cannot be harvested should return null.
//     */
//    protected ItemStack createStackedBlock(int p_149644_1_)
//    {
//        return new ItemStack(CommonProxy.blockLampDefault);
//    }
//}
