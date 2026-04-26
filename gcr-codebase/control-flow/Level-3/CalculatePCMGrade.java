import java.util.Scanner;
//Create CalculatePCMGrade Class to compute physics, chemistry, and math grade
public class CalculatePCMGrade{
	public static void main (String args[]){
	
		// Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
		
		// Taking number as input
		System.out.println("Enter the physics marks: ");
		int physicsMarks = sc.nextInt();

		System.out.println("Enter the physics marks: ");
		int chemistryMarks = sc.nextInt();

		System.out.println("Enter the physics marks: ");
		int mathMarks = sc.nextInt();
		
		//Computing and Displaying the grade of PCM
		int pcmSum = physicsMarks+chemistryMarks+mathMarks;
		
		if((pcmSum/3)>=80){
			System.out.println("(Level 4, above agency-normalized standard) | 80% and above");
		}
		else if((pcmSum/3)>=70 && (pcmSum/3)<80){
			System.out.println("(Level 3, at agency-normalized standard) | 70-79%");
		}
		else if((pcmSum/3)>=60 && (pcmSum/3)<70){
			System.out.println("(Level 2, b agency-normalized standard) | 60-69%");
		}
		else if((pcmSum/3)>=50 && (pcmSum/3)<60){
			System.out.println("(Level 4, well below agency-normalized standard) | 50-59%");
		}else if((pcmSum/3)>=40 && (pcmSum/3)<50){
			System.out.println("(Level 4, too below agency-normalized standard) | 40-49%");
		}else{
			System.out.println("(Remedial standard) | 39% and below");
		}
	}
}