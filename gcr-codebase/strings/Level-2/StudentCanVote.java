import java.util.Scanner;
import java.lang.Math;
// Create StudentCanVote Class to compute wheather student can vote or not depending on age
public class StudentCanVote {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter the number of stduent: ");
        int numberStudent = sc.nextInt();

        // Find start and end index
        int[] randomAge = createRandomAge(numberStudent);

        // Create trimmed string using user-defined substring
        String data[][] = validateAge(randomAge, numberStudent);
		
		//Display ouput
		display(data);
		
    }

    // Method to generate the random age of two digit
    public static int[] createRandomAge(int n) {
		int ageArrays[] = new int[n];
	
		for(int i=0;i<n;i++){
			ageArrays[i] = (int)(Math.random()*100);
		}
        return ageArrays;
    }

    // Method to validate age of student and store in 2D array 
    public static String[][] validateAge(int randomAge[], int n) {
		
		String data[][] = new String[n][2];
		
		for(int i=0;i<n;i++){
			if(randomAge[i]<18){
				data[i][0] = String.valueOf(randomAge[i]);
				data[i][1] = "false";
			}else{
				data[i][0] = String.valueOf(randomAge[i]);
				data[i][1] = "true";
			}
		}
		
		return data;
    }

    // Method to display the output
    public static void display(String data[][]) {
		System.out.println("\n\nAge validated result");
		System.out.println("-----------------------");
		System.out.println("\nAge\tStatus");
		for(int i=0;i<data.length;i++){
			System.out.println(data[i][0]+"\t" +data[i][1]);
		}
    }
}
