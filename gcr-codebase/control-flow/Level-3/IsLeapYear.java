import java.util.Scanner;
//Create IsLeapYear Class to compute the leap year or not
public class IsLeapYear{
	public static void main (String args[]){
	
		// Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
		
		// Taking number as input
		System.out.println("Enter the year: ");
		int year = sc.nextInt();
		
		//Computing and Displaying the leap year using formula
		if(year<1584){
			System.out.println("This is not leap year");
		}
		else if((year%4==0)){
			if(((year%100!=0)||(year%400==0))){
				System.out.println("This is leap year.");
			}			
		}
		else{
			System.out.println("This is not leap year!");
		}			
	}
}