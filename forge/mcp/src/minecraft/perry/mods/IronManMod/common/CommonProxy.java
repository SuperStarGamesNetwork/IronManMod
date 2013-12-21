package perry.mods.IronManMod.common;


import perry.mods.IronManMod.common.PlayerTickHandler;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class CommonProxy
{
	public void registerHandlers()
	{
		TickRegistry.registerTickHandler(new PlayerTickHandler(), Side.SERVER);
	}
}