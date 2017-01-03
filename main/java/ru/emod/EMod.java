package ru.emod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

@Mod(modid = EMod.MODID, name = EMod.NAME, version = EMod.VERSION)

public class EMod {

    public static final String MODID = "emod";
    public static final String NAME = "EMode";
    public static final String VERSION = "0.1";

    public static Block eblock;
    public static Item epickaxe;

    @EventHandler
    public void preLoad(FMLPreInitializationEvent event) {
        eblock = new EBlock();
        GameRegistry.registerBlock(eblock, EBlock.NAME);

        epickaxe = new EPickaxe();
        GameRegistry.registerItem(epickaxe, EPickaxe.NAME);
    }

}
