import java.util.Scanner;
//Create CalculateMarksPercentage Class to compute the marks percentage
public class CalculateMarksPercentage{
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Creating array and size of array
		System.out.println("Enter the number of student: ");
		int n = sc.nextInt();
		double[] physicsArray = new double[n];
		double[] chemistryArray = new double[n];
		double[] mathsArray = new double[n];
	    double[] percentageArray = new double[n];
		String[] gradeArray = new String[n];
		
		//Taking input of pyhsics from user
		
		for(int i =0;i<n;i++){
			System.out.println("Enter the physics marks");
	       double physics = sc.nextDouble();
			if(physics<0){
				System.out.println("Enter the valid marks");
				i--;
				continue;
			}
			physicsArray[i]= physics;
		}
		
		//Taking input of chemistry from user
		for(int i =0;i<n;i++){
			System.out.println("Enter the chemistry marks");
	        double chemistry = sc.nextDouble();
			if(chemistry<0){
				System.out.println("Enter the valid marks");
				i--;
				continue;
			}
			chemistryArray[i]= chemistry;
		}
		
		//Taking input of math from user	
		for(int i =0;i<n;i++){
			System.out.println("Enter the math marks");
	       double math = sc.nextDouble();
			if(math<0){
				System.out.println("Enter the valid marks");
				i--;
			}
			mathsArray[i]= math;
		}
		
		//computing the percentage
		for(int i =0;i<n;i++){
			percentageArray[i]= ((physicsArray[i]+chemistryArray[i]+mathsArray[i])/3);
		}
		
		//Vaildating and storing grade
		for(int i =0;i<n;i++){
			if(percentageArray[i]>=80){
				gradeArray[i]= "A grade";
			}else if(percentageArray[i]>=70&&percentageArray[i]<=79){
				gradeArray[i]= "B grade";
			}else if(percentageArray[i]>=60&&percentageArray[i]<=69){
				gradeArray[i]= "C grade";
			}else if(percentageArray[i]>=50&&percentageArray[i]<=59){
				gradeArray[i]= "D grade";
			}else if(percentageArray[i]>=40&&percentageArray[i]<=49){
				gradeArray[i]= "E grade";
			}else{
				gradeArray[i]= "R grade";
			}
		}
		
		//Displaying the ouput 
		for(int i =0;i<n;i++){
			System.out.println("The student has got "+percentageArray[i]+" and "+gradeArray[i]+" The marks of physics is "+physicsArray[i]+", chemistry is "+chemistryArray[i]+", maths is "+mathsArray[i]);
		}
	}
}