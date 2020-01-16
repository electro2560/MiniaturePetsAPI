package com.kirelcodes.miniaturepets.api.events.pets;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PetSpawnEvent extends Event implements Cancellable{
	
	public PetSpawnEvent(Player owner, boolean shouldSendSpawnMessage, String type) {
		
	}
	
	public Player getOwner() {
		return null;
	}
	
	public String getType() {
		return null;
	}
	
	public boolean isCancelled() {
		return false;
	}
	
	public void setCancelled(boolean cancelled) {}
	
	public void setShouldSendSpawnMessage(boolean shouldSendSpawnMessage) {}
	
	public boolean shouldSendSpawnMessage() {
		return false;
	}

	@Override
	public HandlerList getHandlers() {
		return null;
	}
	
}
