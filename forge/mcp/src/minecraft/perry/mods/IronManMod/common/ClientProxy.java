package perry.mods.IronManMod.common;



import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
import perry.mods.IronManMod.common.CommonProxy;
import perry.mods.IronManMod.common.PlayerTickHandler;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerHandlers()
	{
		TickRegistry.registerTickHandler(new PlayerTickHandler(), Side.SERVER);
		TickRegistry.registerTickHandler(new PlayerTickHandler(), Side.CLIENT);
	}
	
}