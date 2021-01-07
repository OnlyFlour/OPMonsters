package johan24.opmonsters.client;

import johan24.opmonsters.util.ISidedReference;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientReference implements ISidedReference {

	@Override
	public void setup(IEventBus mod, IEventBus forge) {
		mod.addListener(this::clientSetup);
	}

	private void clientSetup(final FMLClientSetupEvent event) {
		
	}
}
