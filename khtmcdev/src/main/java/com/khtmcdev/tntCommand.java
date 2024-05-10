package com.khtmcdev;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import java.util.Random;

public class tntCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        Random rand = new Random();
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Location location = player.getLocation();
            int x = rand.nextInt(20) - 10;
            int y = rand.nextInt(20) - 10;
            int z = rand.nextInt(20) - 10;
            location.add(x, y, z);
            Bukkit.getWorld("world").spawnEntity(location, EntityType.PRIMED_TNT);
        }
        return false;
    }
}
