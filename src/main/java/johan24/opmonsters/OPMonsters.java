package johan24.opmonsters;

import johan24.opmonsters.config.OPMonstersConfig;
import johan24.opmonsters.events.MonsterSpawning;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = OPMonsters.MODID, name = OPMonsters.NAME, version = OPMonsters.VERSION, acceptedMinecraftVersions = OPMonsters.MCVERSION, guiFactory = "johan24.opmonsters.config.GuiConfigFactoryOPMonsters")
public class OPMonsters {
    public static final String MODID = "opmonsters";
    public static final String NAME = "OP Monsters";
    public static final String VERSION = "1.8.9-1.0";
    public static final String MCVERSION = "1.8.9";
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	OPMonstersConfig.load(event);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new MonsterSpawning());
    }
}
