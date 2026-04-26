import java.util.Scanner;
public class FindingQuotientAndReminder{
	public static void main (String args[]){
		
		//Here Scanner object created to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking height as input from user
		System.out.println("Enter the quotient : ");
		int quotient  = sc.nextInt();

		System.out.println("Enter the reminder: ");
		int reminder = sc.nextInt();
		
		
		//calculating the side of parameter
		double findQuotient = quotient/reminder;

		//calculating the side of parameter
		double findReminder = quotient%reminder;
		
		//Displaying the output
		System.out.println("The Quotient is "+ findQuotient +" and Reminder is "+ findReminder +" of two number "+ quotient +" and "+reminder);
	}
}