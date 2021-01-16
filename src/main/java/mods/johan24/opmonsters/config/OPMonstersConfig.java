package mods.johan24.opmonsters.config;

import mods.johan24.opmonsters.OPMonsters;
import org.apache.commons.lang3.tuple.Pair;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.config.ModConfig;

@EventBusSubscriber(modid = OPMonsters.MODID, bus = Bus.MOD)
public class OPMonstersConfig {
	public static final ForgeConfigSpec commonSpec;
	public static final Common COMMON;
	
	static {
		final Pair<Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Common::new);
		commonSpec = specPair.getRight();
		COMMON = specPair.getLeft();
	}
	
	public static class Common {
		public final BooleanValue spawnZombieKnights;
		public final BooleanValue spawnSkeletonArchers;
		public final BooleanValue spawnChargedCreepers;
		
		Common(final ForgeConfigSpec.Builder builder) {
			builder.comment("Contains settings related to zombies.")
			.push("Zombie Settings");
			
			spawnZombieKnights = builder.comment("Set to true if you want to spawn Zombie Knights")
					                    .translation("opmonsters.config.common.zombie.spawnZombieKnights")
					                    .define("spawnZombieKnights", true);
			builder.pop();
			
			builder.comment("Contains settings related to skeletons.")
			.push("Skeleton Settings");
			
			spawnSkeletonArchers = builder.comment("Set to true if you want to spawn Skeleton Archers")
					                      .translation("opmonsters.config.common.skeleton.spawnSkeletonArchers")
					                      .define("spawnSkeletonArchers", true);
			
			builder.pop();
			
			builder.comment("Contains settings related to creepers.")
			.push("Creeper Settings");
			
			spawnChargedCreepers = builder.comment("Set to true if you want to spawn Charged Creepers")
					                      .translation("opmonsters.config.common.creeper.spawnChargedCreepers")
					                      .define("spawnChargedCreepers", true);
			
			builder.pop();
		}
	}
	
	@SubscribeEvent
    public static void onLoad(final ModConfig.Loading configEvent) {
        OPMonsters.LOGGER.debug("Loaded OPMonsters Config file {}", configEvent.getConfig().getFileName());
    }

    @SubscribeEvent
    public static void onFileChange(final ModConfig.Reloading configEvent) {
        OPMonsters.LOGGER.debug("OPMonsters Config just got changed on the file system!");
    }
}
