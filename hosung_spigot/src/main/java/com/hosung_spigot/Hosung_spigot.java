package com.hosung_spigot;

import org.bukkit.plugin.java.JavaPlugin;

public final class Hosung_spigot extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("creeper").setExecutor(new CreeperCommand());
        getCommand("sword").setExecutor(new SwordCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
