package org.rbh.tfcadditions.Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import org.rbh.tfcadditions.Api.Blocks;
import org.rbh.tfcadditions.Blocks.Dent.BlockIGEXDent;
import org.rbh.tfcadditions.Blocks.Dent.BlockIGINDent;
import org.rbh.tfcadditions.Blocks.Dent.BlockMMDent;
import org.rbh.tfcadditions.Blocks.Dent.BlockPlank2Dent;
import org.rbh.tfcadditions.Blocks.Dent.BlockPlank3Dent;
import org.rbh.tfcadditions.Blocks.Dent.BlockPlankDent;
import org.rbh.tfcadditions.Blocks.Dent.BlockSEDDent;
import org.rbh.tfcadditions.Blocks.DentSmall.BlockIGEXDentSmall;
import org.rbh.tfcadditions.Blocks.DentSmall.BlockIGINDentSmall;
import org.rbh.tfcadditions.Blocks.DentSmall.BlockMMDentSmall;
import org.rbh.tfcadditions.Blocks.DentSmall.BlockSEDDentSmall;
import org.rbh.tfcadditions.Blocks.Planks.BlockPlanksLarge;
import org.rbh.tfcadditions.Blocks.Planks.BlockPlanksLarge2;
import org.rbh.tfcadditions.Blocks.Planks.BlockPlanksLarge3;
import org.rbh.tfcadditions.Blocks.Planks.BlockPlanksParquet;
import org.rbh.tfcadditions.Blocks.Planks.BlockPlanksParquet2;
import org.rbh.tfcadditions.Blocks.Planks.BlockPlanksParquet3;
import org.rbh.tfcadditions.Blocks.Planks.BlockPlanksVert;
import org.rbh.tfcadditions.Blocks.Planks.BlockPlanksVert2;
import org.rbh.tfcadditions.Blocks.Planks.BlockPlanksVert3;
import org.rbh.tfcadditions.Core.CreativeTabs;
import org.rbh.tfcadditions.Items.ItemBlocks.ItemBlock;
import org.rbh.tfcadditions.Items.ItemBlocks.ItemBlockPlanks;
import org.rbh.tfcadditions.TFCAdditions;

/**
 * Created by raymondbh on 15.07.2015.
 */
public class BlockSetup extends Blocks {


    public static void LoadBlocks(){
        TFCAdditions.LOG.info("Loading Blocks");

        StoneMMDent = new BlockMMDent().setHardness(15F).setStepSound(Block.soundTypeStone).setBlockName("MMRockDent").setCreativeTab(CreativeTabs.TFCAdditions_Tab);
        StoneMMDentSmall = new BlockMMDentSmall().setHardness(15F).setStepSound(Block.soundTypeStone).setBlockName("MMRockDentSmall").setCreativeTab(CreativeTabs.TFCAdditions_Tab);

        StoneIGEXDent = new BlockIGEXDent().setHardness(16F).setStepSound(Block.soundTypeStone).setBlockName("IgExRockDent").setCreativeTab(CreativeTabs.TFCAdditions_Tab);
        StoneIGEXDentSmall = new BlockIGEXDentSmall().setHardness(16F).setStepSound(Block.soundTypeStone).setBlockName("IgExRockDentSmall").setCreativeTab(CreativeTabs.TFCAdditions_Tab);

        StoneIGINDent = new BlockIGINDent().setHardness(16F).setStepSound(Block.soundTypeStone).setBlockName("IgInRockDent").setCreativeTab(CreativeTabs.TFCAdditions_Tab);
        StoneIGINDentSmall = new BlockIGINDentSmall().setHardness(16F).setStepSound(Block.soundTypeStone).setBlockName("IgInRockDentSmall").setCreativeTab(CreativeTabs.TFCAdditions_Tab);

        StoneSEDDent = new BlockSEDDent().setHardness(16F).setStepSound(Block.soundTypeStone).setBlockName("SedRockDent").setCreativeTab(CreativeTabs.TFCAdditions_Tab);
        StoneSEDDentSmall = new BlockSEDDentSmall().setHardness(16F).setStepSound(Block.soundTypeStone).setBlockName("SedRockDentSmall").setCreativeTab(CreativeTabs.TFCAdditions_Tab);

        PlanksOutline = new BlockPlankDent().setHardness(4.0F).setResistance(5.0F).setStepSound(Block.soundTypeWood).setBlockName("PlanksOutline").setCreativeTab(CreativeTabs.TFCAdditions_Tab);
        PlanksOutline2 = new BlockPlank2Dent().setHardness(4.0F).setResistance(5.0F).setStepSound(Block.soundTypeWood).setBlockName("PlanksOutline2").setCreativeTab(CreativeTabs.TFCAdditions_Tab);
        PlanksOutline3 = new BlockPlank3Dent().setHardness(4.0F).setResistance(5.0F).setStepSound(Block.soundTypeWood).setBlockName("PlanksOutline3").setCreativeTab(CreativeTabs.TFCAdditions_Tab);

        PlanksLarge = new BlockPlanksLarge().setHardness(4.0F).setResistance(5.0F).setStepSound(Block.soundTypeWood).setBlockName("PlanksLarge").setCreativeTab(CreativeTabs.TFCAdditions_Tab);
        PlanksLarge2 = new BlockPlanksLarge2().setHardness(4.0F).setResistance(5.0F).setStepSound(Block.soundTypeWood).setBlockName("PlanksLarge2").setCreativeTab(CreativeTabs.TFCAdditions_Tab);
        PlanksLarge3 = new BlockPlanksLarge3().setHardness(4.0F).setResistance(5.0F).setStepSound(Block.soundTypeWood).setBlockName("PlanksLarge3").setCreativeTab(CreativeTabs.TFCAdditions_Tab);

        PlanksParquet = new BlockPlanksParquet().setHardness(4.0F).setResistance(5.0F).setStepSound(Block.soundTypeWood).setBlockName("PlanksParquet").setCreativeTab(CreativeTabs.TFCAdditions_Tab);
        PlanksParquet2 = new BlockPlanksParquet2().setHardness(4.0F).setResistance(5.0F).setStepSound(Block.soundTypeWood).setBlockName("PlanksParquet2").setCreativeTab(CreativeTabs.TFCAdditions_Tab);
        PlanksParquet3 = new BlockPlanksParquet3().setHardness(4.0F).setResistance(5.0F).setStepSound(Block.soundTypeWood).setBlockName("PlanksParquet3").setCreativeTab(CreativeTabs.TFCAdditions_Tab);

        //PlanksNorm = new BlockPlanksNorm().setHardness(4.0F).setResistance(5.0F).setStepSound(Block.soundTypeWood).setBlockName("PlanksNorm").setCreativeTab(CreativeTabs.TFCAdditions_Tab);
        //PlanksNorm2 = new BlockPlanksNorm2().setHardness(4.0F).setResistance(5.0F).setStepSound(Block.soundTypeWood).setBlockName("PlanksNorm2").setCreativeTab(CreativeTabs.TFCAdditions_Tab);

        PlanksVert = new BlockPlanksVert().setHardness(4.0F).setResistance(5.0F).setStepSound(Block.soundTypeWood).setBlockName("PlanksVert").setCreativeTab(CreativeTabs.TFCAdditions_Tab);
        PlanksVert2 = new BlockPlanksVert2().setHardness(4.0F).setResistance(5.0F).setStepSound(Block.soundTypeWood).setBlockName("PlanksVert2").setCreativeTab(CreativeTabs.TFCAdditions_Tab);
        PlanksVert3 = new BlockPlanksVert3().setHardness(4.0F).setResistance(5.0F).setStepSound(Block.soundTypeWood).setBlockName("PlanksVert3").setCreativeTab(CreativeTabs.TFCAdditions_Tab);

        StoneMMDent.setHarvestLevel("pickaxe", 0);
        StoneMMDentSmall.setHarvestLevel("pickaxe", 0);

        StoneIGEXDent.setHarvestLevel("pickaxe", 0);
        StoneIGEXDentSmall.setHarvestLevel("pickaxe", 0);

        StoneIGINDent.setHarvestLevel("pickaxe", 0);
        StoneIGINDentSmall.setHarvestLevel("pickaxe", 0);

        StoneSEDDent.setHarvestLevel("pickaxe", 0);
        StoneSEDDentSmall.setHarvestLevel("pickaxe", 0);

        PlanksOutline.setHarvestLevel("axe", 0);
        PlanksOutline2.setHarvestLevel("axe", 0);
        PlanksOutline3.setHarvestLevel("axe", 0);

        PlanksLarge.setHarvestLevel("axe", 0);
        PlanksLarge2.setHarvestLevel("axe", 0);
        PlanksLarge3.setHarvestLevel("axe", 0);

        PlanksParquet.setHarvestLevel("axe", 0);
        PlanksParquet2.setHarvestLevel("axe", 0);
        PlanksParquet3.setHarvestLevel("axe", 0);

        //PlanksNorm.setHarvestLevel("axe", 0);
        //PlanksNorm2.setHarvestLevel("axe", 0);

        PlanksVert.setHarvestLevel("axe", 0);
        PlanksVert2.setHarvestLevel("axe", 0);
        PlanksVert3.setHarvestLevel("axe", 0);
    }

    public static void RegisterBlocks(){
        TFCAdditions.LOG.info("Register Blocks");

        GameRegistry.registerBlock(StoneMMDent, ItemBlock.class, "StoneMMDent");
        GameRegistry.registerBlock(StoneMMDentSmall, ItemBlock.class, "StoneMMDentSmall");

        GameRegistry.registerBlock(StoneIGEXDent, ItemBlock.class, "StoneIGEXDent");
        GameRegistry.registerBlock(StoneIGEXDentSmall, ItemBlock.class, "StoneIGEXDentSmall");

        GameRegistry.registerBlock(StoneIGINDent, ItemBlock.class, "StoneIGINDent");
        GameRegistry.registerBlock(StoneIGINDentSmall, ItemBlock.class, "StoneIGINDentSmall");

        GameRegistry.registerBlock(StoneSEDDent, ItemBlock.class, "StoneSEDDent");
        GameRegistry.registerBlock(StoneSEDDentSmall, ItemBlock.class, "StoneSEDDentSmall");

        GameRegistry.registerBlock(PlanksOutline, ItemBlockPlanks.class, "OutlinedPlanks");
        GameRegistry.registerBlock(PlanksOutline2, ItemBlockPlanks.class, "OutlinedPlanks2");
        GameRegistry.registerBlock(PlanksOutline3, ItemBlockPlanks.class, "OutlinedPlanks3");

        GameRegistry.registerBlock(PlanksLarge, ItemBlockPlanks.class, "LargePlanks");
        GameRegistry.registerBlock(PlanksLarge2, ItemBlockPlanks.class, "LargePlanks2");
        GameRegistry.registerBlock(PlanksLarge3, ItemBlockPlanks.class, "LargePlanks3");

        GameRegistry.registerBlock(PlanksParquet, ItemBlockPlanks.class, "ParquetPlanks");
        GameRegistry.registerBlock(PlanksParquet2, ItemBlockPlanks.class, "ParquetPlanks2");
        GameRegistry.registerBlock(PlanksParquet3, ItemBlockPlanks.class, "ParquetPlanks3");

        //GameRegistry.registerBlock(PlanksNorm, ItemBlockPlanks.class, "NormalPlanks");
        //GameRegistry.registerBlock(PlanksNorm2, ItemBlockPlanks.class, "NormalPlanks2");

        GameRegistry.registerBlock(PlanksVert, ItemBlockPlanks.class, "VerticalPlanks");
        GameRegistry.registerBlock(PlanksVert2, ItemBlockPlanks.class, "VerticalPlanks2");
        GameRegistry.registerBlock(PlanksVert3, ItemBlockPlanks.class, "VerticalPlanks3");
    }
}
