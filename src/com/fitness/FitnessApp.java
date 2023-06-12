package com.fitness;
import java.util.List;
import java.util.Scanner;
public class FitnessApp {
	private static FitnessTracker fitnessTracker;
	public static void main(String []args) {
		fitnessTracker = new FitnessTracker();
		Scanner sc = new Scanner(System.in);
		boolean running = true;
		while(running) {
			System.out.println("Fitness Tracker");
			System.out.println("1. Log Activity ");
			System.out.println("2. View Activity Log ");
			System.out.println("3. View Total Calories Burned ");
			System.out.println("4. Exit ");
			System.out.println("Enter Your Choice : ");
			int choice = sc.nextInt();
			switch(choice) {
				case 1:
					logActivity(sc);
					break;
				case 2:
					viewActivityLog();
					break;
				case 3:
					viewTotalCaloriesBurned();
					break;
				case 4:
					running = false;
					break;
				default:
					System.out.println("Invalid Choice please try again ");
			}
		}
		sc.close();
	}
	private static void logActivity(Scanner sc) {
		System.out.println("Enter activity name : ");
		String name = sc.next();
		System.out.println("Enter activity duration (minutes): ");
		int duration = sc.nextInt();
		System.out.println("Enter Calories Burned : ");
		int caloriesBurned = sc.nextInt();
		
		FitnessActivity activity = new FitnessActivity();
		activity.setName(name);
		activity.setDuration(duration);
		activity.setCaloriesBurned(caloriesBurned);
		fitnessTracker.addActivity(activity);
		
		System.out.println("Activity logged Successfully ");
		System.out.println();
	}
	
	private static void viewActivityLog() {
		List <FitnessActivity> activityLog = fitnessTracker.getActivityLog();
		
		System.out.println("Activity Log : ");
		
		for(FitnessActivity activity : activityLog) {
			System.out.println("Activity : "+activity.getName() + ", Duration : " + activity.getDuration() + "minutes , Calories Burned : " + activity.getCaloriesBurned());
				
			}
		System.out.println();
		}
	
	private static void viewTotalCaloriesBurned() {
		int totalCalories = fitnessTracker.getTotalCaloriesBurned();
		
		System.out.println("Total Calories Burned : " + totalCalories);
		System.out.println();
	}
	}

