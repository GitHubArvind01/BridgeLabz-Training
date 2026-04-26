import java.util.Scanner;
//Create CheckNaturalNumberSumCorrectUsingForLoop Class to check number is natural then sum of natural number print
public class CheckNaturalNumberSumCorrectUsingForLoop{
	public static void main (String args[]){
		// Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		// Taking number as input
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		
		//calcualte n natural sum using formula
		int naturalNumberSum1 = number*(number+1)/2;
		
		//calcualte n natural sum using for loop
		int naturalNumberSum2 = 0;
		for(int i=number;i>0;i--){
			naturalNumberSum2+=i;
		}
		
		// Displaying the output
		if(naturalNumberSum1==naturalNumberSum2){
			System.out.println("The natural Sum is correct!");
		}else{
			System.out.println("The natural Sum is not correct!");
		}
	}
}