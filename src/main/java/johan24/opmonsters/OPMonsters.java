package johan24.opmonsters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import johan24.opmonsters.client.ClientReference;
import johan24.opmonsters.config.OPMonstersConfig;
import johan24.opmonsters.server.dedicated.DedicatedServerReference;
import johan24.opmonsters.util.ISidedReference;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig.Type;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * The main class of OPMonsters
 * @author Johan24
 */
@Mod(OPMonsters.MODID)
public class OPMonsters {
    public static final Logger LOGGER = LogManager.getLogger(OPMonsters.MODID);
    public static final String MODID = "opmonsters";
    public static final ISidedReference SIDED_SYSTEM = DistExecutor.safeRunForDist(() -> ClientReference::new, () -> DedicatedServerReference::new);

    /**
     * Registers configs and listeners.
     */
    public OPMonsters() {
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus(), forgeEventBus = MinecraftForge.EVENT_BUS;
        SIDED_SYSTEM.setup(modEventBus, forgeEventBus);
        modEventBus.addListener(this::setup);
        ModLoadingContext.get().registerConfig(Type.COMMON, OPMonstersConfig.commonSpec);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Hi from OP Monsters!");
    }
}
