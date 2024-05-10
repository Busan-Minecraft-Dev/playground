package com.jaewontest;

import org.bukkit.plugin.java.JavaPlugin;

public final class JaewonTest extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("Creeper").setExecutor(new Creeper());
        getCommand("Sword").setExecutor(new Sword());
        getServer().getPluginManager().registerEvents(new SnowBallListener(), this);
        getServer().getPluginManager().registerEvents(new RideEntity(), this);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
