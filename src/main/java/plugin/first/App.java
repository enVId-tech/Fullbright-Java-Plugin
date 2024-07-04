package plugin.first;

import org.bukkit.plugin.java.JavaPlugin;

public class App extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Hello World!");

        this.getCommand("test").setExecutor(new Test());
        this.getCommand("muchdiamonds").setExecutor(new MuchDiamonds());
    }

    @Override
    public void onDisable() {
        getLogger().info("Goodbye World!");
    }
}