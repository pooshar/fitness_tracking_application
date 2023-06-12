package com.fitness;

public class FitnessActivity {
	private String name;
	private int duration;
	private int caloriesBurned;
	
	public FitnessActivity() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getCaloriesBurned() {
		return caloriesBurned;
	}
	public void setCaloriesBurned(int calories) {
		this.caloriesBurned = calories;
	}
	
}
