package com.test.ore;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.util.Vector;

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
            Vector playerLocation = player.getLocation().toVector();
            for (int x = -5; x <= 5; x++) {
                for (int y = -5; y <= 5; y++) {
                    for (int z = -5; z <= 5; z++) {
                        Vector position = playerLocation.clone().add(new Vector(x, y, z));
                        if (playerLocation.distance(position) <= 5) {
                            Block blockAt = player.getWorld().getBlockAt(position.toLocation(player.getWorld()));
                            if (!ores.contains(blockAt.getType())) {
                                player.sendBlockChange(blockAt.getLocation(), Material.GLASS.createBlockData());
                            }
                        }
                    }
                }
            }
        }
    }
}
