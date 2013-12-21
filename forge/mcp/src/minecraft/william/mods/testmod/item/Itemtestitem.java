package william.mods.testmod.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class Itemtestitem extends Item{

	public Itemtestitem(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub
	}
	public void registerIcons(IconRegister par1iconRegister) {
		itemIcon = par1iconRegister.registerIcon("Testmod:testitem");
	}
	
}
