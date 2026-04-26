import java.util.Scanner;
//Create SalaryBouns Class to compute the salary and bonus
public class SalaryBouns{
	public static void main (String args[]){
	
		// Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
		
		// Taking number as input
		
		//creating the arrays of salary and bouns
		double oldSalary[] = new double[10];
		double serviceYear[] = new double[10];
		
		//taking salary as input from user
		System.out.println("Enter the 10 employee salary: ");
		for(int i=0;i<10;i++){
			oldSalary[i] = sc.nextDouble();
		}
		
		//taking work year as input from user 
		System.out.println("Enter the 10 employee work year service: ");
		for(int i=0;i<10;i++){
			serviceYear[i] = sc.nextDouble();
		}
		
		//creating new salary array 
		double newSalary[] = new double[10];
		
		
		//Computing the bonus and salary
		for(int i=0;i<10;i++){
			if(serviceYear[i]>=5){
				newSalary[i] = oldSalary[i]+(oldSalary[i]*0.5);
			}else if(serviceYear[i]<5){
				double bonus = oldSalary[i]+(oldSalary[i]*0.2);
				newSalary[i] = bonus;
			}
		}
		
		//Displaying the old salary and new salary
		for(int i=0;i<10;i++){
			double oldSal = oldSalary[i];
			double newSal = newSalary[i];
			
			System.out.println("Old Salary: " + oldSal );
			System.out.println("New Salary: " + newSal );
			System.out.println("-----------------------");
		}
	}
}