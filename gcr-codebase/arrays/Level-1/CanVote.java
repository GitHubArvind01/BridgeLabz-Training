import java.util.Scanner;
//Create CanVote Class to the day of week
public class CanVote{
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
		
		//creating the array age of size 10 that will store user age
		int age[] = new int[10];
		
		//Taking age as input from user
		for(int i=0;i<10;i++){
			System.out.println("Enter the Student "+(i+1) + "age : ");
			age[i] = sc.nextInt();
		}		

		//Displaying the ouptut 
		for(int i=0;i<10;i++){
			if(age[i]>=18){
				System.out.println("The student with the age" +age[i]+" can vote");
			}else{
				System.out.println("The student with the age" +age[i]+" can't vote");
			}
		}
	}
}