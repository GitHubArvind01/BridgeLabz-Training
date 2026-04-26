import java.util.Scanner;
//Create CalculateMarksPercentageUsing2D Class to compute the marks percentage
public class CalculateMarksPercentageUsing2D{
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Creating array and size of array
		System.out.println("Enter the number of student: ");
		int n = sc.nextInt();
		double[][] marksStudent = new double[n][3];
	    double[] percentageArray = new double[n];
		String[] gradeArray = new String[n];
		
		// Taking marks of each student -> each row one student -> physics, chemistry, and math
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++){
				//This take input for physics -> until user not enter positive its keep taking 
				if(j==0){
					System.out.println("Enter the " + (i+1) + " student physics marks: ");
					marksStudent[i][j] = sc.nextDouble();
					while(true){
						if(marksStudent[i][j]<0){
							System.out.println("Error: Again enter the " + (i+1) + " student physics marks: ");
							marksStudent[i][j] = sc.nextDouble();
							continue;
						}else{
							break;
						}
					}
					continue;
				}
				//This take input for chemistry -> until user not enter positive its keep taking 
				if(j==1){
					System.out.println("Enter the " + (i+1) + " student chemistry marks: ");
					marksStudent[i][j] = sc.nextDouble();
					while(true){
						if(marksStudent[i][j]<0){
							System.out.println("Error: Again enter the " + (i+1) + " student chemistry marks: ");
							marksStudent[i][j] = sc.nextDouble();
							continue;
						}else{
							break;
						}
					}
					continue;
				}
				//This take input for math -> until user not enter positive its keep taking 
				if(j==2){
					System.out.println("Enter the " + (i+1) + " student math marks: ");
					marksStudent[i][j] = sc.nextDouble();
					while(true){
						if(marksStudent[i][j]<0){
							System.out.println("Error: Again enter the " + (i+1) + " student math marks: ");
							marksStudent[i][j] = sc.nextDouble();
							continue;
						}else{
							break;
						}
					}
					continue;
				}
			}
		}
		
		//computing the percentage
		for(int i =0;i<n;i++){
			percentageArray[i]= ((marksStudent[i][0]+marksStudent[i][1]+marksStudent[i][2])/3);
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
			System.out.println("The student has got "+percentageArray[i]+" and "+gradeArray[i]+" The marks of physics is "+marksStudent[i][0]+", chemistry is "+marksStudent[i][1]+", maths is "+marksStudent[i][2]);
		}
	}
}