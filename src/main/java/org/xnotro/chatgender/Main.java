package org.xnotro.chatgender;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.xnotro.chatgender.commands.Commands;

public final class Main extends JavaPlugin {

    public static String gender1;
    public static String gender2;
    public static String helicopter;
    private final String prefix = "[ChatGender]";

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(prefix + " Loading " + getDescription().getName() + "/" + getDescription().getVersion());
        this.getCommand("gender").setExecutor(new Commands());
        getConfig().options().copyDefaults(true);
        saveConfig();
        reloadConfig();
        Bukkit.getConsoleSender().sendMessage(prefix + " Saved Config");
    }

    public void initialize(){
        gender1 = getConfig().getString("gender1");
        gender2 = getConfig().getString("gender2");
        helicopter = getConfig().getString("helicopter");
        Bukkit.getConsoleSender().sendMessage(prefix + " Initializing" + getDescription().getName() + "/" + getDescription().getVersion());
    }

}
