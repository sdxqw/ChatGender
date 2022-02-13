package org.xnotro.chatgender;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.xnotro.chatgender.commands.Commands;

public final class Main extends JavaPlugin {

    // Genders
    public static String gender1;
    public static String gender2;
    public static String helicopter;

    // Colors
    public static String color1;
    public static String color2;

    // Prefix and Other
    public static String prefix;
    public static String wrongTypo;
    public static String fullPerm;
    public static String msgSetted;

    public static String pluginPrefix = "[ChatGender]";

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(pluginPrefix + " Loading " + getDescription().getName() + "/" + getDescription().getVersion());
        this.getCommand("gender").setExecutor(new Commands());
        this.saveDefaultConfig();
        Bukkit.getConsoleSender().sendMessage(pluginPrefix + " Saved Config");
        initialize();
        Bukkit.getConsoleSender().sendMessage(pluginPrefix + " Initialize Config");
    }

    public void initialize(){
        // Genders
        gender1 = getConfig().getString("genders.gender1");
        gender2 = getConfig().getString("genders.gender2");
        helicopter = getConfig().getString("genders.helicopter");

        // Colors
        color1 = getConfig().getString("colores.color1");
        color2 = getConfig().getString("colores.color2");

        // Prefix & Other
        prefix = getConfig().getString("prefix");
        wrongTypo = getConfig().getString("wrongtypo");
        fullPerm = getConfig().getString("fullperm");
        msgSetted = getConfig().getString("messagesetted");
    }

}
