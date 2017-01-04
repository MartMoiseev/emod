package ru.emod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class EBlock extends Block {

	public static final String NAME = "eblock";
	public IIcon[] icons = new IIcon[6];

	protected EBlock() {
		super(Material.rock);
		this.setBlockName(NAME);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(15F);
		this.setResistance(10F);
		this.setHarvestLevel("pickaxe", 1);
		this.setBlockTextureName(EMod.MODID + ":" + NAME);
	}

	@Override
	public void registerBlockIcons(IIconRegister reg) {
		for (int i = 0; i < 6; i ++) {
			this.icons[i] = reg.registerIcon(this.textureName + i);
		}
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		return this.icons[side];
	}
}