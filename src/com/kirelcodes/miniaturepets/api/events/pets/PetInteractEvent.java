package com.kirelcodes.miniaturepets.api.events.pets;

import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.kirelcodes.miniaturepets.pets.Pet;

public class PetInteractEvent extends Event implements Cancellable{
	
	public static enum PetInteraction {
		
		RIGHT_CLICK;
		
	}

	public PetInteractEvent(Pet pet, Entity clicker, PetInteractEvent.PetInteraction interaction) {
		
	}
	
	public Entity getClicker() {
		return null;
	}
	
	public PetInteractEvent.PetInteraction getInteraction(){
		return null;
	}
	
	public Pet getPet() {
		return null;
	}
	
	public boolean isCancelled() {
		return false;
	}
	
	public void setCancelled(boolean canceled) {}

	@Override
	public HandlerList getHandlers() {
		return null;
	}
	
}
