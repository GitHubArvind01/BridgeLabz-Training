// Writing a program to find the roots of the equation
import java.util.*;
//Create QuadraticOperation  Class to compute the Quadratic Operation
public class QuadraticOperation {
	public static void main(String args[]) { 
	
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking input three number from user 
		System.out.println("Enter a : ");
		double a = sc.nextDouble();
		System.out.println("Enter b : ");
		double b = sc.nextDouble();
		System.out.println("Enter c : ");
		double c = sc.nextDouble();
		
		//calling function solve
		double power = Math.pow(b, 2) - 4 * a * c;
		
		double result[] = solve(a, b, c, power);
		
		if(result.length == 0) System.out.println("No real roots");
		else if(result.length == 1) System.out.println("One root : " + result[0]);
		else System.out.println("The two roots are " + result[0] + " and " + result[1]);
	}
	//This function find the Quadratic Operation
	public static double[] solve(double a, double b, double c, double power) {
		
		if(power < 0) return new double[] {};
		else if(power == 0) {
			double root = -b / (2 * a);
			return new double[] {root};
		} else {
			double root1 = (-b + Math.sqrt(power)) / (2 * a);
			double root2 = (-b - Math.sqrt(power)) / (2 * a);
			return new double[] {root1, root2};
		}
	}
}