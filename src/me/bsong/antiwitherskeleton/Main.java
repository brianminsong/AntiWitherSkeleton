package me.bsong.antiwitherskeleton;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.Plugin;


public class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable(){
        getServer().getPluginManager().registerEvents(this, (Plugin)this);
    }

    public void onCreatureSpawnEvent(CreatureSpawnEvent e){
        if(e.getEntityType().name().equalsIgnoreCase("WITHER_SKELETONN")){
            e.setCancelled(true);
        }
    }
}
