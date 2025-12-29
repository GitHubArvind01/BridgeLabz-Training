import java.util.Scanner;

public class PhoneRechargeSimulator{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		double balance = 0;
		
		while(true){
			//taking user phone operator
			System.out.println("Enter the mobile operator(Airtel/Jio/VI/BSNL): ");
			String operator = sc.next().toLowerCase();
			
			//taking the user amount
			System.out.println("Enter the amount: ");
			double amount = sc.nextDouble();
			balance+=amount;
			
			//switch recharge offer
			switch(operator){
				case "jio":
					System.out.println("Jio recharge done!");
					break;
				case "airtel":
					System.out.println("Airtel recharge done!");
					break;
				case "vi":
					System.out.println("VI recharge done!");
					break;
				case "bsnl":
					System.out.println("BSNL recharge done!");
					break;
				default:
					System.out.println("Invalid! Input");
			}
			
			System.out.println("Recharge Successful");
			System.out.println("Current balance: "+balance);
			
			
			System.out.println("Do you want to continue stop recharge: enter-> 'Y'");
			char c = sc.next().charAt(0);
			c = Character.toLowerCase(c);
			
			if(c=='y'){
				System.out.println("\nThank you for using Recharge Simulator!");
				break;
			}
		}
		
	}
}