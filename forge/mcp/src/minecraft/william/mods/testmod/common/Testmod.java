package william.mods.testmod.common;

import william.mods.testmod.block.Blocktestblock;
import william.mods.testmod.item.Itemtestitem;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;






@Mod(modid = "TestMod", name = "Test Mod", version = "1.6.4_2 beta")
public class Testmod {
	
	public static Item testitem;
	public static Block testblock;
	
	
	





public Testmod() {


	testitem = new Itemtestitem(1001).setUnlocalizedName("Testitem").setCreativeTab(CreativeTabs.tabMaterials);
	testblock = new Blocktestblock(1201, Material.rock).setUnlocalizedName("Testblock").setHardness(3.5F).setResistance(10.0F).setCreativeTab(CreativeTabs.tabBlock);
	
	
	
	
	
	GameRegistry.registerBlock(testblock, "Testblock");
	
	LanguageRegistry.addName(testitem, "Test Item");
	LanguageRegistry.addName(testblock, "Test Block");
	
	
	
	
	GameRegistry.addRecipe(new ItemStack(testblock, 1), new Object [] {
		"XXX", "XXX", "XXX", 'X', testitem	
});
	GameRegistry.addRecipe(new ItemStack(testitem, 9), new Object [] {
		"X", 'X', testblock
	});
}



}