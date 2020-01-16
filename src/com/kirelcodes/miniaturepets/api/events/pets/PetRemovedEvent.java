package com.kirelcodes.miniaturepets.api.events.pets;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PetRemovedEvent extends Event {
	
	public PetRemovedEvent(Player owner) {
		
	}
	
	public Player getOwner() {
		return null;
	}

	@Override
	public HandlerList getHandlers() {
		return null;
	}
	
}
