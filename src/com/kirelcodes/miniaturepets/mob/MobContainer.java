package com.kirelcodes.miniaturepets.mob;

import java.util.List;
import java.util.Map;

import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

import com.kirelcodes.miniaturepets.mob.animation.AnimationKeyFrame;
import com.kirelcodes.miniaturepets.mob.structure.StructureDataContainer;

public class MobContainer {
	
	public MobContainer() {
		
	}
	
	public void addAllFrame(List<AnimationKeyFrame> key) {
		
	}
	
	public void addAllFrames(String animation, List<AnimationKeyFrame> frames) {
		
	}
	
	public void addAnimationsToMob(Mob mob) {
		
	}
	
	public void addFrame(AnimationKeyFrame key) {
		
	}
	
	public Map<String, List<AnimationKeyFrame>> getAllAnimations(){
		return null;
	}
	
	public EntityType getAnchor() {
		return null;
	}
	
	public ItemStack getBoots() {
		return null;
	}
	
	public ItemStack getChestplate() {
		return null;
	}
	
	public int getFrameDelay() {
		return 0;
	}
	
	public List<AnimationKeyFrame> getFrames(){
		return null;
	}
	
	public ItemStack getHand() {
		return null;
	}
	
	public ItemStack getHelmet() {
		return null;
	}
	
	public ItemStack getLeggings() {
		return null;
	}
	
	public int getQuality() {
		return 0;
	}
	
	public double getSpeed() {
		return 0;
	}
	
	public StructureDataContainer getStructure() {
		return null;
	}
	
	public boolean isSilent() {
		return false;
	}
	
	public boolean isSmall() {
		return false;
	}
	
	public boolean isVisible() {
		return false;
	}
	
	public void setAnchor(EntityType anchor) {}
	
	public void setBoots(ItemStack boots) {}
	
	public void setChestplate(ItemStack chestplate) {}
	
	public void setFrameDelay(int frameDelay) {}
	
	public void setHand(ItemStack hand) {}
	
	public void setHelmet(ItemStack helmet) {}
	
	public void setLeggings(ItemStack leggings) {}
	
	public void setQuality(int quality) {}
	
	public void setSmall(boolean small) {}
	
	public void setSpeed(double speed) {}
	
	public void setStructure(StructureDataContainer structure) {}
	
	public void setVisible(boolean isVisible) {}
	
}
