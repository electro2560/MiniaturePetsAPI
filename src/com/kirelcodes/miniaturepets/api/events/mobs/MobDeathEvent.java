package com.kirelcodes.miniaturepets.api.events.mobs;

import java.util.List;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

import com.kirelcodes.miniaturepets.mob.Mob;

public class MobDeathEvent extends Event {
	
	public MobDeathEvent(Mob mob, java.util.List<org.bukkit.inventory.ItemStack> items, int droppedExp) {
		
	}
	
	public int getDroppedExp() {
		return 0;
	}
	
	public List<ItemStack> getDrops(){
		return null;
	}
	
	public Mob getMob() {
		return null;
	}
	
	public void setDroppedExp(int exp) {
		
	}

	@Override
	public HandlerList getHandlers() {
		return null;
	}
	
}
