import java.util.Scanner;
public class StudenFeeDiscount{
	public static void main (String args[]){
		//Here Scanner object created to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking fee input from user
		System.out.println("Enter the your fee: ");
		int fee = sc.nextInt();
		
		//Taking discountPercent input from user
		System.out.println("Enter the discount percentage: ");
		int discountPercent = sc.nextInt();
		
		//Here we store the discountAmount
		double discountAmount = fee*(discountPercent/100.0);
		
		//Here we find out the final fee after discount
		double finalFee =(double) fee-discountAmount;
		
		//Finally we pritn the ouput
		System.out.println("The discount amount is INR "+ (int)discountAmount +" and final discounted fee is INR " + (int)finalFee);
	}
}