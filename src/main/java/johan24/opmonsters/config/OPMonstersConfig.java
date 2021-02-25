package johan24.opmonsters.config;

import johan24.opmonsters.OPMonsters;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class OPMonstersConfig {
	public static final String CATEGORY_ZOMBIES = "Zombie Settings";
	public static final String CATEGORY_SKELETONS = "Skeleton Settings";
	public static final String CATEGORY_CREEPERS = "Creeper Settings";
	
	public static Configuration config;
	
	public static boolean spawnZombieKnights;
	public static boolean spawnSkeletonArchers;
	public static boolean spawnChargedCreepers;
	
	public static void load(FMLPreInitializationEvent event) {
		config = new Configuration(event.getSuggestedConfigurationFile());
		reloadConfig();

		MinecraftForge.EVENT_BUS.register(new OPMonstersConfig());
	}
	
	public static void reloadConfig() {
		spawnZombieKnights = getSpawningCondition("Spawn Zombie Knights", true, "Set if you want to spawn Zombie Knights", CATEGORY_ZOMBIES);
		spawnSkeletonArchers = getSpawningCondition("Spawn Skeleton Archers", true, "Set if you want to spawn Skeleton Archers", CATEGORY_SKELETONS);
		spawnChargedCreepers = getSpawningCondition("Spawn Charged Creepers", true, "Set if you want to spawn Charged Creepers", CATEGORY_CREEPERS);
		
		if(config.hasChanged())
			config.save();
	}
	
	private static boolean getSpawningCondition(String name, boolean defaultValue, String comment, String category) {
		Property property = config.get(category, name, defaultValue, comment);
		return property.getBoolean();
	}
	
	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.modID.equals(OPMonsters.MODID)) {
			reloadConfig();
		}
	}
}
