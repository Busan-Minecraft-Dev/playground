package com.khtmcdev;

import org.bukkit.plugin.java.JavaPlugin;

public final class Khtmcdev extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new RiddingEntityListener(), this);
        getServer().getPluginManager().registerEvents(new SnowListener(), this);
        getCommand("sword").setExecutor(new SwordCommand());
        getCommand("tnt").setExecutor(new tntCommand());
        getCommand("creeper").setExecutor(new CreeperCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
