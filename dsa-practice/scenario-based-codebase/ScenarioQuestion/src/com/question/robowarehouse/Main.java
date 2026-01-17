package com.question.robowarehouse;

public class Main {

	public static void main(String[] args) {
		Robot robot[] = {new Robot("Siri",4), new Robot("kali",2), new Robot("ravi",7), new Robot("sidthi",1.5), new Robot("tonny",2.5)};
		insertionSort(robot, robot.length);
		
		//display
		System.out.println("Robot Name\tWeight");
		for(Robot r : robot) {
			System.out.println(r.robotName+"\t\t"+r.weight);
		}
	}
	
	//insertion sort
	public static void insertionSort(Robot robot[], int n) {
		for(int i=1;i<n;i++) {
			Robot top = robot[i];
			int j = i-1;
			while(j>=0) {
				if(robot[j].weight>top.weight) {
					robot[j+1] = robot[j];
					j--;
				}
				else {
					break;
				}
			}
			robot[j+=1] = top;
		}
	}
}