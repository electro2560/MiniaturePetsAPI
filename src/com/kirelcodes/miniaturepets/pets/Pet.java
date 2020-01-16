package com.kirelcodes.miniaturepets.pets;

import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

import com.kirelcodes.miniaturepets.mob.Mob;

public class Pet extends Mob {
	
	public Pet(Player owner, PetContainer container, boolean sendSpawnMessage) {
		
	}
	
	public PetContainer getContainer() {
		return null;
	}
	
	public Object getNMSOwner() {
		return null;
	}
	
	public Player getOwner() {
		return null;
	}
	
	public String getType() {
		return null;
	}
	
	public boolean isDisguised() {
		return false;
	}
	
	public boolean isFollowing() {
		return false;
	}
	
	public boolean isRide() {
		return false;
	}
	
	public void remove() {}
	
	public void remove(boolean message, boolean CSS) {}
	
	public void removeCustomName() {}
	
	public void setCustomName(String customName) {}
	
	public void setDisguised(boolean disguised) {}
	
	public void setEntityYaw(LivingEntity entity)  {}
	
	public void setFollowing(boolean follow)  {}
	
	public void setHeadFollow(boolean headFollow) {}
	
	public void setRide(boolean ride) {}
	
	protected void tick() {}
	
}
