package org.rbh.tfcadditions.Blocks.Dent;

import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;
import org.rbh.tfcadditions.Reference.Names;

/**
 * Created by raymondbh on 16.07.2015.
 */
public class BlockMMDent extends BlockDent {
    public BlockMMDent()    {
        super(Material.rock);
        names = Names.STONE_MM;
        icons = new IIcon[names.length];
    }
}
