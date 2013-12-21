package william.mods.testmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class Blocktestblock extends Block{

	public Blocktestblock(int par1, Material par2Material) {
		super(par1, par2Material);
	}
	public void registerIcons(IconRegister par1iconRegister) {
		blockIcon = par1iconRegister.registerIcon("Testmod:Testblock");

	}
}
