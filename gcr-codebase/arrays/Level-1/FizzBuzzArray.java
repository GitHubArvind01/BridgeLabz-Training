import java.util.Scanner;
import java.util.ArrayList;
//Create FizzBuzzArray Class to compute the FizzBuzz, Fizz, and Buzz
public class FizzBuzzArray{
	public static void main (String args[]){
		// Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		// Taking number as input
		System.out.println("Enter the positive interger: ");
		
		//creating the string array to store the result
		ArrayList<String> results = new ArrayList<>();
		
		if(input.hasNextInt()){
			int number = input.nextInt();
			if(number>0){
				for(int i=1;i<=number;i++){
					if(i%15==0){
						results.add("FizzBuzz");
					}
					else if(i%3==0){
						results.add("Fizz");
					}
					else if(i%5==0){
						results.add("Buzz");
					}else{
						results.add(String.valueOf(i));
					}
				}
			}else{
				System.out.println("Error: Enter postive number!");
			}
		}else{
			System.out.println("Error: Enter vaild number as interger!");
		}
		
		//Displaying the ouput 
		for(int i=0;i<results.size();i++){
			System.out.println(results.get(i));
		}
	}
}