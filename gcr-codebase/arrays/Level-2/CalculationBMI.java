import java.util.Scanner;
//Create CalculationBMI Class to compute the BMI of each person and print their status
public class CalculationBMI{
	
	public static void main (String args[]){
		// Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
		
		//Taking input number of person
		System.out.println("Enter the number of person: ");
		int numberPerson = sc.nextInt();
		
		//creating height, weight and BMI array to store each person 
		double heightPerson[] = new double[numberPerson];
		double weightPerson[] = new double[numberPerson];
		double personBMI[] = new double[numberPerson];
		
		// Taking number as input
		for(int i=0;i<numberPerson;i++){
			System.out.println("Enter the " + (i+1) + " person height: ");
			heightPerson[i] = sc.nextDouble();
			
			System.out.println("Enter the " + (i+1) + " person weight: ");
			weightPerson[i] = sc.nextDouble();
		}

		
		//computing the BMI and Displaying the ouput
		for(int i=0;i<numberPerson;i++){
			double BMI = (double)weightPerson[i]/(heightPerson[i]*heightPerson[i]);
			personBMI[i] = BMI;
			
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
}