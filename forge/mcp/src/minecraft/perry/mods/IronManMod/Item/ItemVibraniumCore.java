package perry.mods.IronManMod.Item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemVibraniumCore extends Item{

	public ItemVibraniumCore(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub
	}
		public void registerIcons(IconRegister par1iconRegister) {
			itemIcon = par1iconRegister.registerIcon("IronManMod:Vibranium Core");
		}
}
