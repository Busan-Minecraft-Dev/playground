package com.hosung_spigot;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SwordCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack diamondSword = new ItemStack(Material.DIAMOND_SWORD);
            ItemMeta itemMeta = diamondSword.getItemMeta();
            itemMeta.setDisplayName("Hosung's Sword");
            diamondSword.setItemMeta(itemMeta);
            player.getInventory().addItem(diamondSword);
            return true;
        }
        return false;
    }
}
