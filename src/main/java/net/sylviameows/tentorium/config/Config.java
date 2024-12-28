package net.sylviameows.tentorium.config;

import net.kyori.adventure.text.Component;
import net.sylviameows.tentorium.TentoriumCore;
import net.sylviameows.tentorium.config.serializable.AreaConfig;
import net.sylviameows.tentorium.config.serializable.ModeConfig;
import net.sylviameows.tentorium.config.serializable.SpleefConfig;
import net.sylviameows.tentorium.config.serializable.spleef.ClassicFloors;
import net.sylviameows.tentorium.config.serializable.spleef.TNTFloors;
import net.sylviameows.tentorium.utilities.Area;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.serialization.ConfigurationSerialization;

public class Config {
    public final TentoriumCore core;
    public final FileConfiguration config;

    public Config(TentoriumCore core) {
        this.core = core;

        ConfigurationSerialization.registerClass(Area.class, "region");

        ConfigurationSerialization.registerClass(AreaConfig.class, "area");
        ConfigurationSerialization.registerClass(ModeConfig.class, "mode");
        ConfigurationSerialization.registerClass(SpleefConfig.class, "spleef_mode");

        ConfigurationSerialization.registerClass(ClassicFloors.class, "classic_floors");
        ConfigurationSerialization.registerClass(TNTFloors.class, "tnt_floors");

        core.saveResource("config.yml", false);
        config = core.getConfig();
    }
}
