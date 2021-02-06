package mods.johan24.opmonsters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = OPMonsters.MODID, name = OPMonsters.NAME, version = OPMonsters.VERSION, acceptedMinecraftVersions = OPMonsters.MC_VERSION)
public class OPMonsters {
    public static final String MODID = "opmonsters";
    public static final String NAME = "OP Monsters";
    public static final String MC_VERSION = "1.12.2";
    public static final String VERSION = MC_VERSION + "-1.2";

    public static final Logger LOGGER = LogManager.getLogger(NAME);

    @EventHandler
    public void init(FMLInitializationEvent event) {
    	LOGGER.info("OP Monsters initializing!");
    }
}
