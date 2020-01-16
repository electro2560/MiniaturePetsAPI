package com.kirelcodes.miniaturepets.mob;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.LivingEntity;

import com.kirelcodes.miniaturepets.mob.animation.AnimationCycle;
import com.kirelcodes.miniaturepets.mob.pathfinding.PathManager;
import com.kirelcodes.miniaturepets.mob.structure.Structure;

public class Mob {
	
	public void addCycle(String name, AnimationCycle cycle) {
		
	}
	
	protected void afterTick() {
		
	}
	
	public boolean clearNavigation() {
		return false;
	}
	
	public boolean containsAnimation(String name) {
		return false;
	}
	
	public List<Integer> getBodyParts(){
		return null;
	}
	
	public String getCustomName() {
		return null;
	}
	
	public AnimationCycle getCycle(String name) {
		return null;
	}
	
	public int getID() {
		return 0;
	}
	
	public Location getLocation() {
		return null;
	}
	
	public AnimationCycle getMoveAnimation() {
		return null;
	}
	
	public LivingEntity getNagivator() {
		return null;
	}
	
	public Object getNMSHandle() {
		return null;
	}
	
	public PathManager getPathManager() {
		return null;
	}
	
	public Location getPreviousLocation() {
		return null;
	}
	
	public double getSpeed() {
		return 0;
	}
	
	public Structure getStructure() {
		return null;
	}
	
	public Location getTargetLocation() {
		return null;
	}
	
	public boolean hasCustomName() {
		return false;
	}
	
	public boolean hasTargetLocation() {
		return false;
	}
	
	public boolean isAnimationRunning() {
		return false;
	}
	
	public boolean isAnimationRunning(String name) {
		return false;
	}
	
	public boolean isInvisible() {
		return false;
	}
	
	public boolean isWalking() {
		return false;
	}
	
	public boolean onTargetLocation() {
		return false;
	}
	
	public void remove() {
		
	}
	
	public void removeCustomName() {
		
	}
	
	public void runAnimation(String name) {
		
	}
	
	public void setCustomName(String name) {
		
	}
	
	public void setMoveAnimation(AnimationCycle cycle) {
		
	}
	
	public void setSilent(boolean silent) {
		
	}
	
	public void setSpeed(double speed) {
		
	}
	
	public boolean setTargetLocation(Location loc) {
		return false;
	}
	
	public void setVisible(boolean visible) {
		
	}
	
	public void setWalking(boolean walking) {
		
	}
	
	public void stopAllAnimation() {
		
	}
	
	public void stopAnimation(String name) {
		
	}
	
	public void stopPathfinding() {
		
	}
	
	protected void tick() {
		
	}
	
}
