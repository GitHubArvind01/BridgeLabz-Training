import java.util.Scanner;
//Create FindLeapYear Class to compute the natural number sum
public class FindLeapYear{
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking input as year side from user
		System.out.println("Enter the year: ");
		int year = sc.nextInt();
		
		//Displaying the ouput 
		if(CheckLeapYear(year)){
			System.out.println(year+ " is leap year.");
		}else{
			System.out.println(year+ " is not leap year!");
		}
	}
	public static boolean CheckLeapYear(int year){
		if(year>=1584){
			if((year%4==0 && year%100!=0) || (year%400==0)){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
}