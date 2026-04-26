import java.util.Scanner;
//Create CalculationBMIUsing2D Class to compute the BMI of each person and print their status
public class CalculationBMIUsing2D{
	
	public static void main (String args[]){
		// Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
		
		//Taking input number of person
		System.out.println("Enter the number of person: ");
		int numberPerson = sc.nextInt();
		
		//creating height, weight and BMI array to store each person 
		double personData[][] = new double[numberPerson][3];
		String weightData[] = new String[numberPerson];
		
		// Taking number as input
		for(int i=0;i<numberPerson;i++){
			
			for(int j=0;j<2;j++){
				if(j==0){
					System.out.println("Enter the " + (i+1) + " person height: ");
					personData[i][j] = sc.nextDouble();
					while(true){
						if(personData[i][j]<0){
							System.out.println("Error: Again enter the " + (i+1) + " person height: ");
							personData[i][j] = sc.nextDouble();
							continue;
						}else{
							personData[i][j] = personData[i][j]*30.40;
							break;
						}
					}
					continue;
				}
				if(j==1){
					System.out.println("Enter the " + (i+1) + " person weight: ");
					personData[i][j] = sc.nextDouble();
					while(true){
						if(personData[i][j]<0){
							System.out.println("Error: Again enter the " + (i+1) + " person weight: ");
							personData[i][j] = sc.nextDouble();
						}else{
							personData[i][j] = personData[i][j]*30.40;
							break;
						}
					}
					continue;
				}
			}
			double BMI = (double)personData[i][1]/(personData[i][0]*personData[i][0]);
			personData[i][2] = BMI;
		}
		
		System.out.println("Print =----");
		for(int i=0;i<numberPerson;i++){
			for(int j=0;j<3;j++){
				System.out.println(personData[i][j] + " ");
			}
		}
	}
}