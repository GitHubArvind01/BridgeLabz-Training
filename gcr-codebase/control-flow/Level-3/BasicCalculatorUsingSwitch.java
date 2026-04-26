import java.util.Scanner;
//Create BasicCalculatorUsingSwitch Class to design Basic Calculator Using Switch 
public class BasicCalculatorUsingSwitch{
	public static void main (String args[]){
	
		// Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
		
		// Taking number as input
		System.out.println("Enter the postive number one: ");
		int number1 = sc.nextInt();

		System.out.println("Enter the postive number second: ");
		int number2 = sc.nextInt();
		
		System.out.println("Enter the Operator like +, -, /, *: ");
		char c = sc.next().charAt(0);
		
		
		//Computing and Designig the basic claculator
		switch(c){
			case '+':
				System.out.println("Addition: " + (number1+number2));	
				break;
			case '-':
				System.out.println("Substraction: " + (number1-number2));	
				break;
			case '/':
				System.out.println("Division: " + (number1/number2));	
				break;
			case '*':
				System.out.println("Multiplication: " + (number1*number2));	
				break;
			default:
				System.out.println("Error: Enter invalid operator");	
				break;
		}
	}
}