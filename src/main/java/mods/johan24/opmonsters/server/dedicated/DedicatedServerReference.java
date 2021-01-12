package mods.johan24.opmonsters.server.dedicated;

import mods.johan24.opmonsters.util.ISidedReference;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;

public class DedicatedServerReference implements ISidedReference {

	@Override
	public void setup(IEventBus mod, IEventBus forge) {
		mod.addListener(this::dedicatedServerSetup);
	}
	
	private void dedicatedServerSetup(final FMLDedicatedServerSetupEvent event) {
		
	}
}
