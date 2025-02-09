package plugin.first;

import org.bukkit.plugin.java.JavaPlugin;

public class App extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Hello World!");
        getCommand("nightvision").setExecutor(new NightVision());
        getCommand("nv").setExecutor(new NightVision());
        getServer().getPluginManager().registerEvents(new NightVisionKeyPress(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Goodbye World!");
    }
}