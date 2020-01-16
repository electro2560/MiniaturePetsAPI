package com.kirelcodes.miniaturepets.mob.pathfinding;

public abstract class Pathfinder {
	
	public Pathfinder() {
		
	}
	
	public void afterTask() {
		
	}
	
	public boolean canBeInterrupted() {
		return false;
	}
	
	public boolean isRunning() {
		return false;
	}
	
	public boolean keepWorking() {
		return false;
	}
	
	public void onStart() {
		
	}
	
	public void setRunning(boolean isRunning) {
		
	}
	
	public abstract boolean shouldStart();
	
	public abstract void updateTask();
	
}
