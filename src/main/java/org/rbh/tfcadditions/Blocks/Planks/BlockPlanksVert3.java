package org.rbh.tfcadditions.Blocks.Planks;

import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;
import org.rbh.tfcadditions.Blocks.BlockPlanks;

/**
 * Created by rbh on 20.08.2015.
 */
public class BlockPlanksVert3 extends BlockPlanks {
    public BlockPlanksVert3() {
        super(Material.wood, " Plank Vertical");
        names = getMetaNames(NameType.THIRD_BRACKET);
        icons = new IIcon[names.length];
    }
}
