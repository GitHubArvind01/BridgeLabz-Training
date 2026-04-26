import java.util.Scanner;
//Create FindHarshadNumber Class to compute the number is Harshad Number or not
public class FindHarshadNumber{
	public static void main (String args[]){
	
		// Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
		
		// Taking number as input
		System.out.println("Enter the postive number: ");
		int number = sc.nextInt();
		
		//Computing the sum of number
		int n = number;
		int sum = 0;
		while(n>0){
			int temp = n%10;
			sum+=temp;
			n/=10;
		}
		
		//Displaying the output 
		int i=1;
		while(i<=number){
			if(number%i==0 && i==sum){
				System.out.println(number+" is HarshadNumber.");	
				i=-1;
				break;
			}
			i+=1;
		}
		if(i!=-1){
			System.out.println(number+" not HarshadNumber!");	
		}		
	}
}