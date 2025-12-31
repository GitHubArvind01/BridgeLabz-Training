import java.util.Scanner;

public class CurrencyExchange{
	
	static Scanner sc = new Scanner(System.in);
	//INR to USD -> INR*0.011
	//INR to Russian Ruble -> INR*0.91
	//INR to Chinese Yuan -> INR*0.078
	//INR to Pound -> INR*0.0083
	//INR to Japanese Yen ->  INR*1.74
	
	static String[] currency = {"USD","Russian Ruble","Chinese Yuan","Pound","Japanese Yen"};
	static double[] currencyValue = {0.011,0.91,0.078,0.0083,1.74};
	public static void main(String args[]){
		while(true){
			System.out.println("\n---------------Choose Option--------------");
			System.out.println("Convert Currency -> please enter 'C' : ");
			System.out.println("For exit ticket booking-> press 'E' :");
			System.out.println("--------------------------------------------");
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			
			if(c=='E'){
				System.out.println("Thanks for use our service! Please come again");
				break;
			}
			
			switch(c){
				case 'C':
					System.out.println("Please Enter the Indian rupess: ");
					double amount = sc.nextDouble();
					convertCurrency(amount);
					break;
				default:
					System.out.println("Invalid Input!");
					break;
			}
		}
	}
	public static void convertCurrency(double amount){
		System.out.println("\n---------------Choose Curreny Number to Convert--------------");
		for(int i=0;i<5;i++){
			System.out.println((i+1)+"-> "+currency[i]);
		}
		
		int number = sc.nextInt();
		
		if(number<0 || number>5){
			System.out.println("Invalid options! please choose corret.");
			return;
		}
		
		System.out.println("--------------Result-----------");
		double converted = currencyValue[number-1]*amount;
		System.out.println("INR to "+currency[number-1] + " -> "+ converted);
		System.out.println("\n-------------------------------------------------------------");
	}
}