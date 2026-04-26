import java.util.Scanner;
//Create FizzBuzz Class to compute the FizzBuzz, Fizz, and Buzz
public class FizzBuzz{
	public static void main (String args[]){
		// Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		// Taking number as input
		System.out.println("Enter the positive interger: ");
		
		if(input.hasNextInt()){
			int number = input.nextInt();
			if(number>0){
				for(int i=1;i<=number;i++){
					if(i%15==0){
						System.out.println("FizzBuzz");
					}
					else if(i%3==0){
						System.out.println("Fizz");
					}
					else if(i%5==0){
						System.out.println("Buzz");
					}else{
						System.out.println(i);
					}
				}
			}else{
				System.out.println("Error: Enter postive number!");
			}
		}else{
			System.out.println("Error: Enter vaild number as interger!");
		}
	}
}