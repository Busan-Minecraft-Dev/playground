package com.test.ore;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

public class DiamondPickaxeListener implements Listener {
    @EventHandler
    public void onDiamondPickaxeRightUse(PlayerInteractEvent event) {
        Player player = event.getPlayer();

        if (event.getHand().equals(EquipmentSlot.HAND) &&
                (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) &&
                player.getInventory().getItemInMainHand().getType().equals(Material.DIAMOND_PICKAXE)) {
            
        }
    }
}
