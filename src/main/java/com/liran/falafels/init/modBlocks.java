package com.liran.falafels.init;

import com.liran.falafels.block.Blockpita;
import com.liran.falafels.block.fBlock;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder("falafels")
public class modBlocks
{
    public static final fBlock pita = new Blockpita();

    public static void init()
    {
        GameRegistry.registerBlock(pita, "pita");
    }
}