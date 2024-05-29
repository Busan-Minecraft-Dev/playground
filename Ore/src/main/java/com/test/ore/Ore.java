package com.test.ore;

import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;

public final class Ore extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new DiamondPickaxeListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
