import java.util.Scanner;
//Create checkPrime Class to compute the number is prime or not
public class checkPrime{
	public static void main (String args[]){
	
		// Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
		
		// Taking number as input
		System.out.println("Enter the postive number: ");
		int number = sc.nextInt();
		
		//Computing and Displaying the grade of PCM
		if(isPrime(number)==1){
			System.out.println(number+" is prime.");
		}else{
			System.out.println(number+" not prime.");
		}
	}
	//This function check wheather number is prime or not
	public static int isPrime(int n){
		if(n<=1){
			return 0;
		}
		if(n%2==0){
			return 0;
		}
		
		for(int i=2;i*i<=n;i++){
			if(n%i==0){
				return 0;
			}
		}
		return 1;
	}
}