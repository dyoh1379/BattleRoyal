package kr.dyoh1379.battleroyal;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("BattleRoyal Plugin Enabled.");

        getServer().getPluginManager().registerEvents(new EventListener(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("BattleRoyal Plugin Disabled.");
    }
}
