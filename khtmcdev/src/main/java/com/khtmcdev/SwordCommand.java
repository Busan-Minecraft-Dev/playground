package com.khtmcdev;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SwordCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
            ItemMeta meta = item.getItemMeta();
            meta.addEnchant(Enchantment.DAMAGE_ALL, 255, true);
            meta.addEnchant(Enchantment.KNOCKBACK, 255, true);
            meta.addEnchant(Enchantment.MENDING, 1, true);
            meta.setDisplayName("CSE-BLADE");
            item.setItemMeta(meta);
            player.getInventory().addItem(item);
            return true;
        }
        return false;
    }
}
