package staticxp;

import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.config.reflection.Comment;
import net.blay09.mods.balm.api.config.reflection.Config;

@Config(value = ModEntry.MOD_ID, type = "common")
public class ModConfig {

    public static ModConfig get() {
        return Balm.getConfig().getActiveConfig(ModConfig.class);
    }

    @Comment("Number of xp required each level")
    public int xpRequired = 100;
}
