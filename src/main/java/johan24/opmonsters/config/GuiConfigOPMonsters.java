package johan24.opmonsters.config;

import java.util.List;
import java.util.stream.Collectors;

import johan24.opmonsters.OPMonsters;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.StatCollector;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

public class GuiConfigOPMonsters extends GuiConfig {

	public GuiConfigOPMonsters(GuiScreen parentScreen) {
		super(parentScreen, getConfigElements(), OPMonsters.MODID, false, false, StatCollector.translateToLocal("opmonsters.config.title"));
	}
	
	private static List<IConfigElement> getConfigElements() {
		return OPMonstersConfig.config.getCategoryNames().stream()
				.map(categoryName -> new ConfigElement(OPMonstersConfig.config.getCategory(categoryName).setLanguageKey("opmonsters.config." + categoryName)))
				.collect(Collectors.toList());
	}
}
