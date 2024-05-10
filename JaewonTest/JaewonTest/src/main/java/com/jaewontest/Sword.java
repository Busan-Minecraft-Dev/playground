package com.jaewontest;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Sword implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            ItemStack DiamondSword = new ItemStack(Material.DIAMOND_SWORD);
            ItemMeta diamondSwordMeta = DiamondSword.getItemMeta();
            diamondSwordMeta.setDisplayName("hi");
            diamondSwordMeta.addEnchant(Enchantment.DAMAGE_ALL,100,true);
            DiamondSword.setItemMeta(diamondSwordMeta);
            player.getInventory().addItem(DiamondSword);
            return true;
        }
        else{
            return false;
        }
    }
}
