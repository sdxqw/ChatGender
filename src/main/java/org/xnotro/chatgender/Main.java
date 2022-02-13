package org.xnotro.chatgender;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.xnotro.chatgender.commands.Commands;
import org.xnotro.chatgender.config.Config;

public final class Main extends JavaPlugin {

    private static Config config;
    public static String Gender1;
    public static String Gender2;
    public static String Helicopter;

    @Override
    public void onEnable() {
        String prefix = "[ChatGender]";
        Bukkit.getConsoleSender().sendMessage(prefix + " Loading" + getDescription().getName() + "/" + getDescription().getVersion());
        this.getCommand("gender").setExecutor(new Commands());
        this.saveDefaultConfig();

        FileConfiguration file = config.getFileConfiguration;

        String Gender1 = file.getString("gender1");
        String Gender2 = file.getString("gender2");
        String Helicopter = file.getString("helicopter");
    }

}
