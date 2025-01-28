package dev.bluenightfury46.noJoinMsg;

import org.bukkit.plugin.java.JavaPlugin;
import dev.bluenightfury46.noJoinMsg.NoJoinMsg;

public final class NoJoinMsg extends JavaPlugin {

   public static NoJoinMsg plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;

        this.getServer().getPluginManager().registerEvents(new PlayerJoinEv(), this);
        this.getServer().getPluginManager().registerEvents(new PlayerLeaveEv(), this);

        this.getLogger().info("Started plugin");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
