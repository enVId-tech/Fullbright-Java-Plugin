package plugin.first;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Hello world!
 *
 */
public class App extends JavaPlugin {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    @Override
    public void onEnable() {
        getLogger().info("Hello World!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Goodbye World!");
    }
}
