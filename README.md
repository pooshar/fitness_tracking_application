# fitness_tracking_application
I developed this fitness tracking application using java .
To help Sunita Sharma live a healthier and better life, let's consider 
the use case of a personal fitness tracking application for the elderly. 
This application will assist Sunita in tracking her daily activities, setting 
fitness goals, and monitoring her progress. 
We'll create a working prototype using Java.

Step 1 : Create a FitnessActivity class to represent a fitness activity with 
attributes such as activity name, duration, and calories burned.

Step 2 : Implement a FitnessTracker class that allows Sunita to input her daily activities, 
view her activity log, and see the total calories burned.

Step 3 : Create a simple command-line user interface to interact with the fitness tracking application.

Step 4 : 4.	Run the FitnessApp class to start the fitness tracking application.


This prototype demonstrates a basic fitness tracking application that allows Sunita to log her activities,
view her activity log, and see the total calories burned. 

The flow of a program : 
The program consists of three classes: FitnessActivity, FitnessTracker, and FitnessApp. Let's explain the flow of the program:

The FitnessActivity class represents a fitness activity with attributes such as name, duration, and calories burned. It provides the necessary constructors, getters, and setters to work with these attributes.

The FitnessTracker class manages the activity log and provides methods to add activities, retrieve the activity log, and calculate the total calories burned. It has a private instance variable activityLog, which is a list of FitnessActivity objects.

The FitnessTracker class has a constructor FitnessTracker() that initializes the activityLog as an empty ArrayList.

The addActivity() method in FitnessTracker takes a FitnessActivity object as a parameter and adds it to the activityLog list.

The getActivityLog() method in FitnessTracker returns the activityLog list, allowing other parts of the program to access the activity log.

The getTotalCaloriesBurned() method calculates the total calories burned by summing up the calories burned for each activity in the activityLog list.

The FitnessApp class serves as the entry point of the program. It creates an instance of FitnessTracker and sets up a menu-driven interface using Scanner to interact with the user.

The main() method in FitnessApp starts a loop that continues until the user chooses to exit. It displays a menu with options to log an activity, view the activity log, view the total calories burned, or exit.

The logActivity() method in FitnessApp prompts the user to enter the details of an activity and creates a FitnessActivity object with the entered information. It then adds this activity to the activityLog using the addActivity() method of FitnessTracker.

The viewActivityLog() method in FitnessApp retrieves the activity log from FitnessTracker using the getActivityLog() method and displays each activity's details.

The viewTotalCaloriesBurned() method in FitnessApp calculates the total calories burned using the getTotalCaloriesBurned() method of FitnessTracker and displays the result.

The program continues looping until the user chooses to exit by setting the running variable to false.

Overall, the program allows the user to log fitness activities, view the activity log, and see the total calories burned. It utilizes the FitnessActivity and FitnessTracker classes to manage and track the activities.

The output of a program is : 

