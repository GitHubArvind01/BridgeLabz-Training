import java.util.Scanner;
//Create bonusAmount Class to compute the salary bouns amount
public class bonusAmount{
	public static void main (String args[]){
		// Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		// Taking number as input
		System.out.println("Enter the salary: ");
		int salary = input.nextInt();
		
		System.out.println("Enter the work year of service: ");
		int yearOfService = input.nextInt();
		
		//storing the bonus Amount
		double bonusAmounts = salary*0.5;
		
		// Displaying the output
		if(yearOfService>=5){
			System.out.println(bonusAmounts);
		}else{
			System.out.println("NA");
		}
	}
}