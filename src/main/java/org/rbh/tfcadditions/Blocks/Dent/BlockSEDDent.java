package org.rbh.tfcadditions.Blocks.Dent;

import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;
import org.rbh.tfcadditions.Reference.Names;

/**
 * Created by raymond on 06.08.2015.
 */
public class BlockSEDDent extends BlockDent {
    public BlockSEDDent()    {
        super(Material.rock);
        names = Names.STONE_SED;
        icons = new IIcon[names.length];
    }
}
