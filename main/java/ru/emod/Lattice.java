package ru.emod;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class Lattice extends Soft {

    public static final String NAME = "lattice";
    public IIcon top;
    public IIcon icon;

    protected Lattice() {
        super();
        this.setBlockName(NAME);
    }

    @Override
    public void registerBlockIcons(IIconRegister reg) {
        this.top = reg.registerIcon(EMod.MODID + ":" + "lattice");
        this.icon = reg.registerIcon(EMod.MODID + ":" + "soft");
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        if (side == 1) {
            return this.top;
        } else {
            return this.icon;
        }
    }
}