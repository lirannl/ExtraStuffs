package com.liran.falafels;

        import com.liran.falafels.init.modBlocks;
        import com.liran.falafels.init.modItems;
        import cpw.mods.fml.common.Mod;
        import cpw.mods.fml.common.event.FMLPreInitializationEvent;
        import net.minecraft.block.Block;
        import net.minecraft.block.material.Material;

@Mod(modid = "falafels", version = "1.7.10-1.0", name = "falafels")
public class falafels
{

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
  {
      modBlocks.init();

  }

}
