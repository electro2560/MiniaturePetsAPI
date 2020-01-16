package com.kirelcodes.miniaturepets.api.events.pets;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.kirelcodes.miniaturepets.pets.Pet;

public class PetFinishedSpawnEvent extends Event {
	
	public PetFinishedSpawnEvent(Player owner, Pet pet) {
		
	}
	
	public Player getOwner() {
		return null;
	}
	
	public Pet getPet() {
		return null;
	}

	@Override
	public HandlerList getHandlers() {
		return null;
	}
	
}
