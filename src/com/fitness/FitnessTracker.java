package com.fitness;
import java.util.ArrayList;
import java.util.List;

public class FitnessTracker {
	private List <FitnessActivity> activityLog;
	
	public FitnessTracker() {
		activityLog = new ArrayList<>();
	}
	public void addActivity(FitnessActivity activity) {
	activityLog.add(activity);	
	}
	public List<FitnessActivity> getActivityLog(){
		return activityLog;
	}
	public int getTotalCaloriesBurned() {
		int totalCalories = 0;
		for(FitnessActivity activity : activityLog) {
			totalCalories +=activity.getCaloriesBurned();
		}
		return totalCalories;
	}
}
