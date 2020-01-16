package com.kirelcodes.miniaturepets.pets;

import java.util.List;
import java.util.Map;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.kirelcodes.miniaturepets.mob.animation.AnimationKeyFrame;
import com.kirelcodes.miniaturepets.mob.structure.StructureDataContainer;

public class PetContainer {
	
	public PetContainer(String name) {
		
	}
	
	public void addAllFrame(List<AnimationKeyFrame> key) {
		
	}
	
	public void addAllFrames(String animation, List<AnimationKeyFrame> frames) {
		
	}
	
	public void addDescription(String desc) {
		
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
	
	public List<String> getDescription() {
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
	
	public String getName() {
		return null;
	}
	
	public String getPermission() {
		return null;
	}
	
	public int getPrice() {
		return 0;
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
	
	public ItemStack getSymbol() {
		return null;
	}
	
	public String getType() {
		return null;
	}
	
	public boolean hasPermission() {
		return false;
	}
	
	public boolean isAPI() {
		return false;
	}
	
	public boolean isFree() {
		return false;
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
	
	public void setAPI(boolean mm) {}
	
	public void setBoots(ItemStack boots) {}
	
	public void setChestplate(ItemStack chestplate) {}
	
	public void setFollow(boolean follow) {}
	
	public void setFrameDelay(int frameDelay) {}
	
	public void setHand(ItemStack hand) {}
	
	public void setHelmet(ItemStack helmet) {}
	
	public void setLeggings(ItemStack leggings) {}
	
	public void setPermission(String permission) {}
	
	public void setPrice(int price) {}
	
	public void setQuality(int quality) {}
	
	public void setSmall(boolean small) {}
	
	public void setSpeed(double speed) {}
	
	public void setStructure(StructureDataContainer structure) {}
	
	public void setSymbol(ItemStack symbol) {}
	
	public void setType(String type) {}
	
	public void setVisible(boolean isVisible) {}
	
	public Pet spawnPet(Player p) {
		return null;
	}
	
	public Pet spawnPet(Player p, boolean b) {
		return null;
	}
	
	public boolean wouldFollow() {
		return false;
	}
	
}
