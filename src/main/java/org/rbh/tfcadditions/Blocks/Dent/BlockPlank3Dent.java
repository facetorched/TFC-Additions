package org.rbh.tfcadditions.Blocks.Dent;

import com.dunk.tfc.api.Constant.Global;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;
import org.rbh.tfcadditions.Blocks.BlockChisel;

/**
 * Created by raymondbh on 19.08.2015.
 */
public class BlockPlank3Dent extends BlockChisel {
    public BlockPlank3Dent()
    {
        super(Material.wood, "wood", "Plank Outline");
        names = new String[Global.WOOD_ALL.length - 32];
        System.arraycopy(Global.WOOD_ALL, 32, names, 0, Global.WOOD_ALL.length - 32);
        icons = new IIcon[names.length];
    }
}
