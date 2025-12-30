import java.util.Scanner;

public class FitnessTracker{
	//creating double array to store push-up count of 7days
	static int pushUpCount[] = new int[7];
	static int averagepushUp = 0;
	static int maxpushUp = 0;
	
	public static void main(String args[]){
	
		//scanner object to take inputs
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<7;i++){
			if(i==6){
				System.out.println("For Sunday is rest day you can enter 0: ");
				pushUpCount[i] = sc.nextInt();
				continue;
			}
			System.out.println("Enter the day " + (i+1) + " push-up count: ");
			pushUpCount[i] = sc.nextInt();
		}
		
		//for each loop to find max push-up and average push-up
		int sumpushUp = 0;
		for(int temp:pushUpCount){
			if(temp>maxpushUp){
				maxpushUp = temp;
			}
			sumpushUp+=temp;
		}
		
		averagepushUp = sumpushUp/7;
		
		//output display
		System.out.println("Max push-up: "+ maxpushUp);
		System.out.println("Max push-up: "+ averagepushUp);
	}
}