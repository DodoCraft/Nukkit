package cn.nukkit.event.player;

import cn.nukkit.Player;
import cn.nukkit.event.HandlerList;
import cn.nukkit.level.Position;
import lombok.Getter;

/**
 * Called when SafeSpawning.
 * Used to edit the final location used for SafeSpawning
 */
public class PlayerSafeSpawnEvent extends PlayerEvent {
    private Position spawnLocation;
    private Position safeSpawn;
    private Position originalSpawn;

    public PlayerSafeSpawnEvent(Player player, Position spawnLocation, Position safeSpawn, Position originalSpawn) {
        this.player = player;
        this.spawnLocation = spawnLocation;
        this.safeSpawn = safeSpawn;
        this.originalSpawn = originalSpawn;
    }

    /**
     * Get the final spawn location that will be used
     */
    public Position getSpawnLocation() {
        return spawnLocation;
    }

    /**
     * Set the final spawn location that will be used
     */
    public void setSpawnLocation(Position spawnLocation) {
        this.spawnLocation = spawnLocation;
    }

    /**
     * Get the safe spawn Nukkit has created
     */
    public Position getSafeSpawn() {
        return safeSpawn.clone();
    }

    /**
     * Get the original spawn location before Nukkit said he wants a 'safe location'
     */
    public Position getOriginalSpawn() {
        return originalSpawn.clone();
    }

    @Getter
    private static final HandlerList handlers = new HandlerList();
}
