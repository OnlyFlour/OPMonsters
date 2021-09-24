package johan.mods.opmonsters;

import johan.mods.opmonsters.config.OPMonstersConfig;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig.Type;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The main class of OPMonsters
 * @author Johan24
 */
@Mod(OPMonsters.MODID)
public class OPMonsters {
    public static final Logger LOGGER = LogManager.getLogger(OPMonsters.MODID);
    public static final String MODID = "opmonsters";

    /**
     * Registers configs and listeners.
     */
    public OPMonsters() {
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        ModLoadingContext.get().registerConfig(Type.SERVER, OPMonstersConfig.serverSpec);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Hi from OP Monsters!");
    }
}
