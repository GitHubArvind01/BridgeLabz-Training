package com.OopsScenarioBased.fittrack;
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		//here user can see object
		UserProfile use1 = new UserProfile("ravi",35,170,450,101);
		UserProfile use2 = new UserProfile("shiva",29,70,200,102);
		UserProfile use3 = new UserProfile("kali",17,65,300,103);
		
		
		//gym owner object 
		GymOwner gym = new GymOwner();
		
		//here gym Owner add the user
		gym.addWorkoutUser(use1);
		gym.addWorkoutUser(use2);
		gym.addWorkoutUser(use3);
		
		
		//here the loop will work
		while(true){
			System.out.println("\n---------------Choose Option--------------");
			System.out.println("For Start Workout-> please enter 'S' : ");
			System.out.println("For End Workout-> please enter 'T' : ");
			System.out.println("Want to see Progess-> enter 'P': ");
			System.out.println("For exit quiz -> enter 'E' :");
			System.out.println("--------------------------------------------");
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			
			if(c=='E'){
				System.out.println("Thanks for use our service! Please come again");
				break;
			}
			
			switch(c){
				case 'S':
					System.out.println("Enter your gym ID: ");
					int id = sc.nextInt();
					//validate the id -> call gymOwner class -> where method validateID 
					if(!gym.validateID(id)) {
						System.out.println("Sorry! Invalid Gym id. Please enter valid gym id.");
						break;
					}
					//ask user to enter Work-out type, duration, caloriesBurned
					System.out.println("-----Please Enter work-out type-----");
					System.out.println("For Cardio Workout -> please enter 'C' : ");
					System.out.println("For Strength Workout -> please enter 'S' : ");
					
					char type = sc.next().charAt(0);
					type = Character.toUpperCase(c);
					
					System.out.println("Enter the time duration of workout: ");
					double duration = sc.nextDouble();
					
					System.out.println("Enter the calories Burned");
					double caloriesBurned = sc.nextDouble();
					
					if(type=='C') {
						//call the method
						CardioWorkout cardio = new CardioWorkout(type,duration,caloriesBurned);
						gym.storedCardioUserCalories(id, cardio);
						break;
					}
					if(type=='S') {
						StrengthWorkout strength = new StrengthWorkout(type,duration,caloriesBurned);
						gym.storedStrengthUserCalories(id, strength);
						break;
					}
					System.out.println("Invalid workout type!");
					break;
				case 'T':
					System.out.println("Work out end---");
					break;
				case 'P':
					System.out.println("Enter your gym ID: ");
					int idP = sc.nextInt();
					//validate the id -> call gymOwner class -> where method validateID 
					if(!gym.validateID(idP)) {
						System.out.println("Sorry! Invalid Gym id. Please enter valid gym id.");
						break;
					}
					//call the checkProgess method
					gym.checkProgess(idP);
					break;
				default:
					System.out.println("Invalid input!");
			}
		}
		gym.seeFullDetails();
	}
}