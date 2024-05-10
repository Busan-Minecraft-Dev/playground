package com.jaewontest;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerBucketEntityEvent;

import java.util.Random;

public class Creeper implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender Sender, Command command, String s, String[] strings) {
        if (Sender instanceof Player) {
            Player player = (Player) Sender;
            Random random = new Random();


            Location location = player.getLocation();
            location = location.add(random.nextInt(10), random.nextInt(10), random.nextInt(10));

            Bukkit.getWorld("world").spawnEntity(location, EntityType.CREEPER);
            return true;
        }
        else{
            return false;
        }
    }
}
