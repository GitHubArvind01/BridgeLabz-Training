import java.util.Scanner;
//Create DayOfWeek  Class to the day of week
public class DayOfWeek{
	public static void main (String args[]){
			
		// Taking input of day, month, year
		System.out.println("Enter the months: ");
		int m = Integer.parseInt(args[0]);

		System.out.println("Enter the day: ");
		int d = Integer.parseInt(args[1]);
		
		System.out.println("Enter the year: ");
		int y = Integer.parseInt(args[2]);
		
		
		//Computing the day of week
		int y0 = y-(14-m)/12;
		int x = y0+y0/4-y0/100+y0/400;
		int m0 = m + 12 * ((14-m)/12)-2;
		int d0 = (d+x+(31*m0)/12)%7;
		
		//Displaying the ouptut
		System.out.println("Day of week : " + d0);
	}
}