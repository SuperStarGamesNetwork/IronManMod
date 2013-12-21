package perry.mods.IronManMod.Item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;

public class ItemIronManHelmit extends ItemArmor{

	public ItemIronManHelmit(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		// TODO Auto-generated constructor stub
	}
	public void registerIcons(IconRegister par1iconRegister) {
		itemIcon = par1iconRegister.registerIcon("IronManMod:Mk3 Helmit");
	}
}
