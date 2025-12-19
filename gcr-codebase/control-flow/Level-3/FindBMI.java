import java.util.Scanner;
//Create FindBMI Class to compute the BMI of person
public class FindBMI{
	public static void main (String args[]){
	
		// Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
		
		// Taking number as input
		System.out.println("Enter your weight: ");
		double weight = sc.nextDouble();
		
		System.out.println("Enter your height: ");
		double height = sc.nextDouble();
		
		//Computing the BMI of person
		double BMI = (double)weight/(height*height);
		
		//Displaying the output 
		if(BMI>=40.0){
			System.out.println("Obese");	
		}
		else if(BMI>=25.0 && BMI<=39.9){
			System.out.println("Overweight");	
		}
		else if(BMI>=18.5 && BMI<=24.9){
			System.out.println("Normal");	
		}else if(BMI<=18.4){
			System.out.println("Underweight");	
		}
	}
}