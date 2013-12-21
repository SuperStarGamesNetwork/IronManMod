package perry.mods.IronManMod.armor;

import perry.mods.IronManMod.common.IronManMod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class IronManArmor extends ItemArmor{

	public IronManArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
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
		if(stack.toString().contains("Leggings")) if(itemID == IronManMod.IronManLeggings.itemID){
			return "IronManMod:" + armorNamePrefix + "_2.png";
		
		}
		return "IronManMod:" + armorNamePrefix + "_1.png";
	}
	public void registerIcons(IconRegister par1iconRegister) {
		if(itemID == IronManMod.IronManHelmit.itemID) {
			itemIcon = par1iconRegister.registerIcon("IronManMod:Mk3 Helmit");
		}
		if(itemID == IronManMod.IronManBoots.itemID) {
			itemIcon = par1iconRegister.registerIcon("IronManMod:Mk3 Boots");
		}
		if(itemID == IronManMod.IronManLeggings.itemID) {
			itemIcon = par1iconRegister.registerIcon("IronManMod:Mk3 Legs");
		}
		if(itemID == IronManMod.IronManBodyArmor.itemID) {
			itemIcon = par1iconRegister.registerIcon("IronManMod:Mk3 Body");
		}
	}
}
