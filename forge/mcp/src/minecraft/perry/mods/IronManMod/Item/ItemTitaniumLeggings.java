package perry.mods.IronManMod.Item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;

public class ItemTitaniumLeggings extends ItemArmor{

	public ItemTitaniumLeggings(int par1,
			EnumArmorMaterial par2EnumArmorMaterial, int par3) {
		super(par1, par2EnumArmorMaterial, par3, par3);
		// TODO Auto-generated constructor stub
	}
	public void registerIcons(IconRegister par1iconRegister) {
		itemIcon = par1iconRegister.registerIcon("IronManMod:IronManLeggings");
		
	}
}
