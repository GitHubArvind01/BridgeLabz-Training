import java.util.Scanner;
//Create FindAbundantNumber Class to compute the number is Abundant Number or not
public class FindAbundantNumber{
	public static void main (String args[]){
	
		// Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
		
		// Taking number as input
		System.out.println("Enter the postive number: ");
		int number = sc.nextInt();
		
		//Computing the divisor sum
		int n = number;
		int sum = 0;
		for(int i=1;i<number;i++){
			if(number%i==0){
				sum+=i;
			}
		}
		
		//Displaying the output 
		if(sum>number){
			System.out.println(number+" is Abundant Number");	
		}else{
			System.out.println(number+" is not Abundant Number");	
		}
	}
}