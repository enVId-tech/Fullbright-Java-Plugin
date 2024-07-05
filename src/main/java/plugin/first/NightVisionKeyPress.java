package plugin.first;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class NightVisionKeyPress implements Listener {
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if ((event.getAction().name().contains("RIGHT_CLICK") || event.getAction().name().contains("LEFT_CLICK"))
                && player.getInventory().getItemInMainHand().getType().name().isBlank()
                && player.getInventory().getItemInOffHand().getType().name().isBlank()) {

            if (player.hasPotionEffect(PotionEffectType.NIGHT_VISION)) {
                player.removePotionEffect(PotionEffectType.NIGHT_VISION);
            } else {
                player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, Integer.MAX_VALUE, 1));
            }
        }
    }
}