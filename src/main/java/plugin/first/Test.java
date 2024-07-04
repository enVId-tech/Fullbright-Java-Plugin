package plugin.first;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Test implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("test.command") && sender instanceof Player) {
            sender.sendMessage("Hello World!");
            return true;
        } else {
            sender.sendMessage("You do not have permission to use this command.");
            return true;
        }
    }
}
