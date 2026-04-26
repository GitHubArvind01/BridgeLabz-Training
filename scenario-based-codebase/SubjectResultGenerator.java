import java.util.Scanner;
//Create SubjectResultGenerator  Class to compute Metro Smart Card Fare Deduction
public class SubjectResultGenerator{
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		int totalSubject = 5;
		int subject[] = new int[totalSubject];
		
		
		int totalMarks = 0;
		
		//Taking input as age from user		
		for(int i=0;i<totalSubject;i++){
			System.out.println("Enter the "+(i+1)+" subject marks: ");
			subject[i] = sc.nextInt();
			
			if(subject[i]>100 || subject[i]<0){
				System.out.println("Enter the marks between 1 to 100!");
				i--;
				continue;
			}
			totalMarks+=subject[i];
		}
		
		//calculate the average 
		double average = totalMarks / (double) totalSubject;
        System.out.println("Average Marks: " + average);
		
		int grageCat = (int) average/10;

		switch(grageCat){
			case 10:
			case 9:
				System.out.println("Grage A");
				break;
			
			case 8:
				System.out.println("Grage B");
				break;
			case 7:
				System.out.println("Grage C");
				break;
			case 6:
				System.out.println("Grage D");
				break;
			default:
				System.out.println("Grage F");
		}
	}
}	