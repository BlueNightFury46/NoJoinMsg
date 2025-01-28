package dev.bluenightfury46.noJoinMsg;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;


public class PlayerJoinEv implements Listener {

    @EventHandler
    public void join(org.bukkit.event.player.PlayerJoinEvent e){

        try {
            e.setJoinMessage("");
        } catch(NullPointerException ex){
            NoJoinMsg.plugin.getLogger().warning("Caught NullPointerException (You can probably ignore this)");
        }

    }


}
