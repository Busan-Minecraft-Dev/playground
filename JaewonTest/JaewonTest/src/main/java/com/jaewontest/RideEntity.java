package com.jaewontest;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class RideEntity implements Listener {
    @EventHandler
    public void onRiddingEntity(PlayerInteractEntityEvent event) {

        if (event.getPlayer().isSneaking()) {
            event.getRightClicked().addPassenger(event.getPlayer());
        } else {
            event.getPlayer().addPassenger(event.getRightClicked());
        }
    }
}

