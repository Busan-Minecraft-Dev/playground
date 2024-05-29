package com.test.ore;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

import java.util.HashSet;
import java.util.Set;

public class DiamondPickaxeListener implements Listener {

    private final Set<Material> ores = new HashSet<>();

    public DiamondPickaxeListener() {
        ores.add(Material.COAL_ORE);
        ores.add(Material.IRON_ORE);
        ores.add(Material.GOLD_ORE);
        ores.add(Material.DIAMOND_ORE);
        ores.add(Material.REDSTONE_ORE);
        ores.add(Material.LAPIS_ORE);
        ores.add(Material.EMERALD_ORE);
        ores.add(Material.NETHER_QUARTZ_ORE);
    }

    @EventHandler
    public void onDiamondPickaxeRightUse(PlayerInteractEvent event) {
        Player player = event.getPlayer();

        if (event.getHand().equals(EquipmentSlot.HAND) &&
                (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) &&
                player.getInventory().getItemInMainHand().getType().equals(Material.DIAMOND_PICKAXE)) {
            
        }
    }
}
