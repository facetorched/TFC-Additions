package org.rbh.tfcadditions.Blocks.Dent;

import com.dunk.tfc.api.Constant.Global;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;
import org.rbh.tfcadditions.Blocks.BlockChisel;
import org.rbh.tfcadditions.Reference.Names;

/**
 * Created by raymondbh on 19.08.2015.
 */
public class BlockPlank2Dent extends BlockChisel {
    public BlockPlank2Dent()
    {
        super(Material.wood, "wood", "Plank Outline");
        names = new String[Global.WOOD_ALL.length - 16];
        System.arraycopy(Global.WOOD_ALL, 16, names, 0, Global.WOOD_ALL.length - 16);
        icons = new IIcon[names.length];
    }
}
