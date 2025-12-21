import java.util.Scanner;
//Create FindQuotientAndReminder Class to compute number of chocolates can each child get
public class FindChocolatesDistribution{
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking input as numberOfchocolates and numberOfstudents from user
		System.out.println("Enter the number chocolates: ");
		int numberOfchocolates = sc.nextInt();

		System.out.println("Enter the number of students: ");
		int numberOfstudents = sc.nextInt();
		
		//calling function compute 
		int result[] = new int[2];
		result = computeDistribution(numberOfchocolates,numberOfstudents);
		
		//Displaying the ouput 
		System.out.println("Each child get chocolates:  " + result[0] + "\nRemin chocolates : " + result[1]);
	}
	
	//This function has logic of find the number of chocolates can each child get
	public static int[] computeDistribution(int numberOfchocolates, int numberOfstudents){
		return new int[]{(numberOfchocolates/numberOfstudents),(numberOfchocolates%numberOfstudents)};
	}
}