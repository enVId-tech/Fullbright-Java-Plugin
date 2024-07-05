package plugin.first;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class NightVisionKeyPress implements Listener {
    // This method will be called when a player presses a key, and will toggle night vision on and off if the key pressed is "V"
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getAction().name().contains("RIGHT_CLICK_AIR") && player.getInventory().getItemInMainHand().getType().name().contains("DIAMOND_SWORD")) {
            System.out.println("Command executed by " + player.getName());
            System.out.println(player.getName() + " has night vision: " + player.hasPotionEffect(PotionEffectType.NIGHT_VISION));

            if (player.hasPotionEffect(PotionEffectType.NIGHT_VISION)) {
                player.removePotionEffect(PotionEffectType.NIGHT_VISION);
            } else {
                player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, Integer.MAX_VALUE, 1));
            }
        }
    }
}