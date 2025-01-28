package dev.bluenightfury46.noJoinMsg;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;


public class PlayerLeaveEv implements Listener {

   @EventHandler
    public void leave(org.bukkit.event.player.PlayerQuitEvent e){
       try {
           e.setQuitMessage("");
       } catch(NullPointerException ex){
           NoJoinMsg.plugin.getLogger().warning("Caught NullPointerException (You can probably ignore this)");
       }

    }
}
