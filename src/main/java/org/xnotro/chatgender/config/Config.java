package org.xnotro.chatgender.config;

import org.bukkit.configuration.file.FileConfiguration;

public class Config {
    private FileConfiguration fileConfiguration;

    public Config(FileConfiguration configuration){
        fileConfiguration = configuration;
    }

    public FileConfiguration getFileConfiguration = fileConfiguration;
}
