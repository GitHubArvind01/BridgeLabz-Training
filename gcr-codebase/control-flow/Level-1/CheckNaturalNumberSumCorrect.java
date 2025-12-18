import java.util.Scanner;
//Create CheckNaturalNumberSumCorrect Class to check number is natural then sum of natural number print
public class CheckNaturalNumberSumCorrect{
	public static void main (String args[]){
		// Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		// Taking number as input
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		
		//calcualte n natural sum using formula
		int naturalNumberSum1 = number*(number+1)/2;
		
		//calcualte n natural sum using while loop
		int naturalNumberSum2 = 0;
		while(number>0){
			naturalNumberSum2+=number;
			number-=1;
		}
		
		// Displaying the output
		if(naturalNumberSum1==naturalNumberSum2){
			System.out.println("The natural Sum is correct!");
		}else{
			System.out.println("The natural Sum is not correct!");
		}
	}
}