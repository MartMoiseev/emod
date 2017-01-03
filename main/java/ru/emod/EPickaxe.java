package ru.emod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class EPickaxe extends ItemPickaxe {

	public static final String NAME = "epickaxe";

	protected EPickaxe() {
		super(ToolMaterial.EMERALD);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setTextureName(EMod.MODID + ":" + NAME);
	}

}
