import java.util.Scanner;
//Create EvenAndOddArray Class to compute multiplication table
public class EvenAndOddArray{
	public static void main (String args[]){
	
		// Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
		
		// Taking number as input
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		//evaluating size
		int size = num/(2+1);
		
		//creating array that store the odd or even number 
		int evenoddArray[] = new int[size];
		
		//validating the odd and even number 
		int p=0,q=1;
		System.out.println("Enter the " + size + " elements");
		for(int i=0;i<size;i++){
			int number = sc.nextInt();
			if(number%2==0){
				evenoddArray[p] = number;
				p+=1;
			}else{
				evenoddArray[q] = number;
				q+=1;
			}
		}
		
		// Displaying the output
		for(int i=0;i<size;i++){
			System.out.println("Even number : " + evenoddArray[i]);
		}
		for(int i=1;i<size;i++){
			System.out.println("Odd number : " + evenoddArray[i]);
		}
	}
}