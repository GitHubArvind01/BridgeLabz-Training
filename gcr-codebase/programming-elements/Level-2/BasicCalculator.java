import java.util.Scanner;
public class BasicCalculator{
	public static void main (String args[]){
		
		//Here Scanner object created to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking number 1 and number 2 as input from user
		System.out.println("Enter number1: ");
		float number1 = sc.nextFloat();
		System.out.println("Enter number 2: ");
		float number2 = sc.nextFloat();
		
		//Calculate the addition
		float add = number1+number2;
		
		//Calculate the substraction
		float substract = number1-number2;
		
		//Calculate the multiplication
		float multiply = number1*number2;
		
		//Calculate the division
		float division = number1/number2;
		
		 // Displaying the basic calculator 
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+ number1 +" and "+ number2 +" is "+ add +", "+ substract +", "+ multiply +", and "+division);
	}
}