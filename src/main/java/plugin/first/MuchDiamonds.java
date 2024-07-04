package plugin.first;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class MuchDiamonds implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("muchdiamonds.command")) {
            sender.sendMessage("You have been given 64 diamonds!");

            Player player = (Player) sender;

            ItemStack diamonds = new ItemStack(Material.DIAMOND, 64);

            player.getInventory().addItem(diamonds);

            return true;
        } else {
            sender.sendMessage("You do not have permission to use this command.");
            return true;
        }
    }
}
