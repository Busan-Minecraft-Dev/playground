package com.khtmcdev;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import java.util.Random;

public class CreeperCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        Random rand = new Random();
        if (sender instanceof Player) {
            int x = rand.nextInt(10);
            int z = rand.nextInt(10);
            int y = rand.nextInt(10);
            Player player = (Player) sender;
            Location location = player.getLocation();
            location.add(x, y, z);
            Bukkit.getWorld("world").spawnEntity(location, EntityType.CREEPER);
            return true;
        }
        return false;
    }
}