import java.util.Scanner;
//Create FindGreatestFactorsUsingWhile Class to compute the greatest factor from 1 to number
public class FindGreatestFactorsUsingWhile{
	public static void main (String args[]){
		// Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		// Taking number as input
		System.out.println("Enter the Postive number: ");
		while(true){
			int number = input.nextInt();
			//checking number is positive or not Displaying the ouput
			if(number>0){
				int i=number-1;
				while(i>1){
					if(number%i==0){
						System.out.println(i);
						break;
					}
					i-=1;
				}
				break;
			}
			System.out.println("Again! Enter the Postive number: ");
		}		
	}
}