import java.util.Scanner;
//Create FindFactorsUsingWhileLoop Class to compute the factor from 1 to number
public class FindFactorsUsingWhileLoop{
	public static void main (String args[]){
		// Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		// Taking number as input
		System.out.println("Enter the Postive number: ");
		while(true){
			int number = input.nextInt();
			//checking number is positive or not Displaying the ouput
			if(number>0){
				int i=1;
				while(i<number){
					if(number%i==0){
						System.out.println(i);
					}
					i+=1;
				}
				break;
			}
			System.out.println("Again! Enter the Postive number: ");
		}		
	}
}