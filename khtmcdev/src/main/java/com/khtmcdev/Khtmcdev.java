package com.khtmcdev;

import org.bukkit.plugin.java.JavaPlugin;

public final class Khtmcdev extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("sword").setExecutor(new SwordCommand());
        getCommand("tnt").setExecutor(new tntCommand());
        getCommand("creeper").setExecutor(new CreeperCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
