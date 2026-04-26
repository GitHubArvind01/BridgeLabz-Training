import java.util.Scanner;
//Create AddNumberUnitUserEnterZeroOrNegative Class to make sum until user enter 0
public class AddNumberUnitUserEnterZeroOrNegative{
	public static void main (String args[]){
		// Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		//creating variable to store sum 
		int numberSum = 0;
		
		// Taking number as input
		while(true){
			System.out.println("Enter the number: ");
			int number = input.nextInt();
			
			//when user type 0 then loop will end and print the sum
			if(number==0 || number<0){
				break;
			}
			numberSum+=number;
		}
		
		// Displaying the output
		System.out.println(numberSum);
	}
}