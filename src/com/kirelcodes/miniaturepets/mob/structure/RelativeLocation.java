package com.kirelcodes.miniaturepets.mob.structure;

import org.bukkit.Location;

public class RelativeLocation implements Cloneable {
	
	public RelativeLocation(double upDown, double leftRight, double forwardBackwards) {
		
	}
	
	public RelativeLocation(double upDown, double leftRight, double forwardBackwards, float yaw) {
		
	}
	
	public RelativeLocation clone() {
		return null;
	}
	
	public double gotForwardBackward() {
		return 0;
	}
	
	public Location getFromRelative(Location location) {
		return null;
	}
	
	public double getLeftRight() {
		return 0;
	}
	
	public double getUpDown() {
		return 0;
	}
	
	public float getYaw() {
		return 0;
	}
	
	public boolean isBackward() {
		return false;
	}
	
	public RelativeLocation setBackward(boolean backward) {
		return null;
	}
	
	public RelativeLocation setYaw(float yaw) {
		return null;
	}
	
	public String toString() {
		return null;
	}
	
}
