package marumasa.armor_stand;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class eventListener implements Listener {
    @EventHandler
    public void onEntity(EntityDamageByEntityEvent event) {
        EntityType armor_stand = event.getEntity().getType();
        EntityType player = event.getDamager().getType();
        if (armor_stand == EntityType.ARMOR_STAND && player != EntityType.PLAYER) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onBlock(EntityDamageByBlockEvent event) {
        EntityType armor_stand = event.getEntity().getType();
        if (armor_stand == EntityType.ARMOR_STAND) {
            event.setCancelled(true);
        }
    }
}