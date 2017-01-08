package ru.emod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EBlock extends Block {

    public static final String NAME = "eblock";
    public static final int SIZE = 6;
    public IIcon[] icons = new IIcon[SIZE];

    protected EBlock() {
        super(Material.rock);
        this.setBlockName(NAME);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(15F);
        this.setResistance(10F);
        this.setHarvestLevel("pickaxe", 1);
    }

    @Override
    public void registerBlockIcons(IIconRegister reg) {
        for (int i = 0; i < SIZE; i++) {
            this.icons[i] = reg.registerIcon(EMod.MODID + ":" + NAME + i);
        }
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        // render top and bottom texture
        if (side < 2) {
            return this.icons[side];
        }

        // rotate other texture
        int[][] array = {
                {2, 3, 4, 5},
                {4, 5, 3, 2},
                {3, 2, 5, 4},
                {5, 4, 2, 3},
        };

        return this.icons[array[meta][side - 2]];
    }

    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack) {
        // get meta [0..4] on rotate
        int l = MathHelper.floor_double((double) (par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
        par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
    }
}