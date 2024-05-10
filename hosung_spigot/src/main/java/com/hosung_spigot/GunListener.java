package com.hosung_spigot;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;

public class GunListener implements Listener {
    @EventHandler
    public void onShot(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getHand().equals(EquipmentSlot.HAND) &&
                (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK))
         && player.getInventory().getItemInMainHand().getType().equals(Material.DIAMOND_HOE) ){
            Snowball snowball = player.launchProjectile(Snowball.class);
            snowball.setGravity(true);
            snowball.setVelocity(player.getLocation().getDirection().multiply(2));
        }
    }

    @EventHandler
    public void onProjectileHit(ProjectileHitEvent event) {
        if (event.getEntity() instanceof Snowball) {
            Snowball snowball = (Snowball) event.getEntity();
            World world = snowball.getWorld();
            Location location = snowball.getLocation();

            // 폭발 생성: 폭발력 4 (TNT와 비슷), 화염 없음, 블록 파괴 없음
            world.createExplosion(location, 4.F, true, true);
        }
    }
}
