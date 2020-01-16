package com.kirelcodes.miniaturepets.mob.animation;

import java.util.List;

import com.kirelcodes.miniaturepets.mob.structure.Structure;

public class AnimationCycle {

	public AnimationCycle(Structure structure, long speed) {
		
	}
	
	public AnimationCycle(Structure structure, long speed, int quality) {
		
	}
	
	public void addKeyFrame(AnimationKeyFrame frame) {
		
	}
	
	public List<AnimationFrame> getFrames(AnimationFrame lastFrame, AnimationFrame keyFrame){
		return null;
	}
	
	public AnimationRunner getRunner() {
		return null;
	}
	
	public boolean isRunning() {
		return false;
	}
	
	public void runAnimation() {
		
	}
	
	public void setForceReturn(boolean forceReturn) {
		
	}
	
}

class AnimationRunner {
	
	public AnimationRunner(int maxFrames, Structure structure, List<AnimationFrame> frames, long speed) {
		
	}
	
	public void run() {
		
	}
	
	public void stop() {
		
	}
	
}