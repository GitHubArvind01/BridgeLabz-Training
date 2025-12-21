import java.util.Scanner;
//Create StudentVoteChecker  Class to check student can vote or not
public class StudentVoteChecker {
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//creating 10 size array to store age of students
		int students[] = new int[10];
		
		//Taking input as trangle side from user
		System.out.println("Enter the 10 age: ");
		for(int i=0;i<10;i++){
			students[i] = sc.nextInt();
		}
		
		//iterate over the age
		for(int i=0;i<10;i++){
			if(canStudentVote(students[i])){
				System.out.println("Student " + (i+1) + " can vote.");
			}else{
				System.out.println("Student " + (i+1) + " can't vote!" );
			}
		}
	}
	public static boolean canStudentVote(int age){
		if(age<18){
			return false;
		}else{
			return true;
		}
	}
}