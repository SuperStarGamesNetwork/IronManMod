package wiliam.mods.testmod.common;

import cpw.mods.fml.common.Mod;


    @Mod(modid = "Testmod", name = "Test Mod", version = "1.6.4_2 beta")
	public class Testmod {
		
		
	public static Item testitem;
	
	public Testmod() {
	    
	    testitem = new Itemtestitem(1001).setUnlocalizedName("testitem").setCreativeTab(CreativeTabs.tabMaterials);
	}
	
