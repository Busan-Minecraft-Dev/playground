package com.hosung_spigot;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import java.util.Random;

public class CreeperCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Location location = player.getLocation();
            Random random = new Random();
            location.setX(location.getX() + random.nextInt(10) - 5);
            location.setZ(location.getZ() + random.nextInt(10) - 5);
            Bukkit.getWorld("world").spawnEntity(location, EntityType.CREEPER);
            return true;
        }
        return false;
    }
}
