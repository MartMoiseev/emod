package ru.emod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class EBlock extends Block {

	public static final String NAME = "eblock";

	protected EBlock() {
		super(Material.rock);
		this.setBlockName(NAME);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(15F);
		this.setResistance(10F);
		this.setHarvestLevel("pickaxe", 1);
		this.setBlockTextureName(EMod.MODID + ":" + NAME);
	}

}