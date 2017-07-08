package net.avicus.fix;


import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerPreLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class AviFix extends JavaPlugin implements Listener {

    public void onEnable() {
        listeners();
    }

    private void listeners() {
        this.getServer().getPluginManager().registerEvents(this, this);
    }


    @EventHandler
    public void kick(PlayerPreLoginEvent event) {
        event.disallow(PlayerPreLoginEvent.Result.KICK_OTHER, ChatColor.RED + "Avicus is currently experiencing major server issues. \n" + ChatColor.GOLD + "You may follow updates on our twitter: " + ChatColor.AQUA + "@AvicusNetwork \n" + ChatColor.BLUE + "www.avicus.net");
    }

}
