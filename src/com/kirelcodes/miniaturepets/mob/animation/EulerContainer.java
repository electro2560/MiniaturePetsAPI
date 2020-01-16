package com.kirelcodes.miniaturepets.mob.animation;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.util.EulerAngle;

import com.kirelcodes.miniaturepets.mob.structure.ArmorStandContainer;
import com.kirelcodes.miniaturepets.mob.structure.ArmorStandDataContainer;
import com.kirelcodes.miniaturepets.mob.structure.RelativeLocation;

public class EulerContainer {
	
	public EulerContainer() {
		
	}
	
	public EulerContainer(ArmorStandContainer container) {
		
	}
	
	public EulerContainer(ConfigurationSection container) {
		
	}
	
	public EulerContainer(ConfigurationSection container, ArmorStandDataContainer data) {
		
	}
	
	public static double convert(double angle) {
		return 0;
	}
	
	public EulerAngle getBodyPos() {
		return null;
	}
	
	public static String getFromEuler(EulerAngle ea) {
		return null;
	}
	
	public EulerAngle getHeadPos() {
		return null;
	}
	
	public EulerAngle getLeftHandPos() {
		return null;
	}
	
	public EulerAngle getLeftLegPos() {
		return null;
	}
	
	public RelativeLocation getRelativeLocation() {
		return null;
	}
	
	public EulerAngle getRightHandPos() {
		return null;
	}
	
	public EulerAngle getRightLegPos() {
		return null;
	}
	
	public boolean hasRelativeLocation() {
		return false;
	}
	
	public void setBodyPos(EulerAngle bodyPos) {}
	
	public void setHeadPos(EulerAngle headPos) {}
	
	public void setLeftHandPos(EulerAngle leftHandPos) {}
	
	public void setLeftLegPos(EulerAngle leftLegPos) {}
	
	public void setRelativeLocation(RelativeLocation location) {}
	
	public void setRightHandPos(EulerAngle rightHandPos) {}
	
	public void setRightLegPos(EulerAngle rightLegPos) {}
	
	public String toString() {
		return null;
	}
	
}
