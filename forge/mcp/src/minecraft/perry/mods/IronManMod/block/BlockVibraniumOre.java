package perry.mods.IronManMod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockVibraniumOre extends Block{

	public BlockVibraniumOre(int par1, Material par2Material) {
		super(par1, par2Material);
		// TODO Auto-generated constructor stub
	}
	public void registerIcons(IconRegister par1iconRegister) {
		blockIcon = par1iconRegister.registerIcon("IronManMod:Vibranium Ore");

	}
}
