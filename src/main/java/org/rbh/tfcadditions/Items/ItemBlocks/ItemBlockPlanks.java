package org.rbh.tfcadditions.Items.ItemBlocks;

import com.dunk.tfc.Items.ItemBlocks.ItemTerraBlock;
import com.dunk.tfc.api.Constant.Global;
import net.minecraft.block.Block;
import org.rbh.tfcadditions.Blocks.BlockPlanks;
import org.rbh.tfcadditions.Blocks.Dent.BlockPlank2Dent;
import org.rbh.tfcadditions.Blocks.Dent.BlockPlankDent;
import org.rbh.tfcadditions.Reference.Names;

/**
 * Created by raymondbh on 19.08.2015.
 */
public class ItemBlockPlanks extends ItemTerraBlock {
    public ItemBlockPlanks(Block block)
    {
        super(block);

        if(block instanceof BlockPlankDent) {
            metaNames = new String[16];
            System.arraycopy(Global.WOOD_ALL, 0, metaNames, 0, 16);
        }
        else if(block instanceof BlockPlank2Dent) {
            metaNames = new String[Global.WOOD_ALL.length - 16];
            System.arraycopy(Global.WOOD_ALL, 16, metaNames, 0, Global.WOOD_ALL.length - 16);
        }
        else if(block instanceof BlockPlanks){
            metaNames = ((BlockPlanks) block).getNames();
        }
    }
}

