package perry.mods.IronManMod.armor;

import perry.mods.IronManMod.common.IronManMod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class HulkbusterArmor extends ItemArmor{
	
	public HulkbusterArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4, String armornamePrefix) {
	super(par1, par2EnumArmorMaterial, par3, par4);
	this.material = par2EnumArmorMaterial;
	par2EnumArmorMaterial.getDamageReductionAmount(par4);
	this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
	this.maxStackSize = 1;
	armorNamePrefix = armornamePrefix;
}

public String armorNamePrefix;
public EnumArmorMaterial material;

public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
	if(stack.toString().contains("leggings")) {
		return "IronManMod:" + armorNamePrefix + "_2.png";
	}
	if(stack.toString().contains("Leggings")) if(itemID == IronManMod.HulkbusterLeggs.itemID){
		return "IronManMod:" + armorNamePrefix + "_2.png";
	
	}
	return "IronManMod:" + armorNamePrefix + "_1.png";
}
public void registerIcons(IconRegister par1iconRegister) {
	if(itemID == IronManMod.HulkbusterHead.itemID) {
		itemIcon = par1iconRegister.registerIcon("IronManMod:HulkBuster Head");
	}
	if(itemID == IronManMod.HulkbusterBoots.itemID) {
		itemIcon = par1iconRegister.registerIcon("IronManMod:HulkBuster Boots");
	}
	if(itemID == IronManMod.HulkbusterLeggs.itemID) {
		itemIcon = par1iconRegister.registerIcon("IronManMod:HulkBuster Leggs");
	}
	if(itemID == IronManMod.HulkbusterBody.itemID) {
		itemIcon = par1iconRegister.registerIcon("IronManMod:HulkBuster Body");
	}
}

}
