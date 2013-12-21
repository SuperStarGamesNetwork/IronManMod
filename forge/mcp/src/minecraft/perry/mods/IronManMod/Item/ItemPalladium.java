package perry.mods.IronManMod.Item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemPalladium extends Item{

	public ItemPalladium(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub
	}
		public void registerIcons(IconRegister par1IconRegister) {
			itemIcon = par1IconRegister.registerIcon("IronManMod:Palladium");
		}
}
