package net.aksyo;

import net.aksyo.command.CalculatorCommand;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Main extends JavaPlugin {

    private static Main instance;

    private Logger logger = getServer().getLogger();
    private PluginManager pluginManager = getServer().getPluginManager();

    @Override
    public void onEnable() {

        instance = this; //Main class instance is defined here

        getCommand("calculate").setExecutor(new CalculatorCommand()); //The command to open the calculator
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    public static Main getInstance() {
        return instance;
    }
}
