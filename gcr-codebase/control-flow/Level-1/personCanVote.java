import java.util.Scanner;
//Create personCanVote Class to check age is greater than or equal 18 then that person can vote otherwise not
public class personCanVote{
	public static void main (String args[]){
		// Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		// Taking age number as input
		System.out.println("Enter the age : ");
		int age = input.nextInt();
		
		// Displaying the output
		if(age>=18){
			System.out.println("The person's age is "+ age +" and can vote.");
		}else{
			System.out.println("The person's age is "+ age +" and cannot vote.");
		}
	}
}