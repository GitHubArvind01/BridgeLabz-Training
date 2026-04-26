import java.util.Scanner;
public class NumberGuessingGame{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number 1-100 for guess: ");
		int number = sc.nextInt();
		
		
		int attempt = 5;
		int idx = 1;
		int trackLow = 1;
		int trackHigh = 100;
		do{
			System.out.println("\nEnter the "+(idx)+" number to guess: ");
			idx+=1;
			int guessNumber = sc.nextInt();
			attempt-=1;
			if(guessNumber==number){
				System.err.println("-----------------------------");
				System.out.println("Congratuation! Correct Guess");
				System.err.println("-----------------------------");
				break;
			}
			else if(guessNumber>number){
				trackHigh = guessNumber;
				System.out.println("Missed! Number is too high -> use hint("+trackLow+" to " + trackHigh +")");
			}
			else if(guessNumber<number){
				trackLow = guessNumber;
				System.out.println("Missed! Number is too low -> use hint("+trackLow+" to " + trackHigh +")");
			}
		}while(attempt!=0);
	}
}