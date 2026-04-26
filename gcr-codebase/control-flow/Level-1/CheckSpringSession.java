import java.util.Scanner;
//Create CheckSpringSession Class to check month and date are spring session then print yes otherwise no
public class CheckSpringSession{
	public static void main (String args[]){
		// Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		// Taking three number as input
		System.out.println("Enter the months: ");
		int months = input.nextInt();
		
		System.out.println("Enter the date: ");
		int date = input.nextInt();
		
		
		// Displaying the output

		if(months>=3 && months<=6){
			if(date<20 && months==3){
				System.out.println("Its not a Spring Season");
			}
			if(date>20 && months==6){
				System.out.println("Its not a Spring Season");
			}
			System.out.println("Its a Spring Season");
		}else{
			System.out.println("Its not a Spring Season");
		}
	}
}