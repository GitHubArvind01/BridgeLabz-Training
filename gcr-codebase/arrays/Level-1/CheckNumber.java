import java.util.Scanner;
//Create CheckNumber Class to compute the wheather number is positive, negative, and zero
public class CheckNumber{
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user 
        Scanner sc = new Scanner(System.in);
		
		//creating the array age of size 5 that store number
		int number[] = new int[5];
		
		//Taking age as input from user
		for(int i=0;i<5;i++){
			System.out.println("Enter the number"+(i+1) + " : ");
			number[i] = sc.nextInt();
		}		

		//Displaying the ouptut
		for(int i=0;i<5;i++){
			if(number[i]<0){
				System.out.println("This is negative number!");
			}else if(number[i]==0){
				System.out.println("This is zero");
			}else{
				if(number[i]%2==0){
					System.out.println(number[i] + " is even.");
				}else{
					System.out.println(number[i] + " is odd.");
				}
			}
		}
		if(number[0]!=number[5-1]){
			System.out.println("First element " + number[0] + " And last element " + number[5-1] + "Equal.");
		}else{
			System.out.println("First element " + number[0] + " And last element " + number[5-1] + "Not Equal.");
		}
	}
}